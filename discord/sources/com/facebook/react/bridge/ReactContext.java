package com.facebook.react.bridge;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Window;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.interop.InteropModuleRegistry;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.interfaces.ExtraWindowEventListener;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import xa.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ReactContext extends ContextWrapper {
    private static final String TAG = "ReactContext";
    private final CopyOnWriteArraySet<ActivityEventListener> mActivityEventListeners;
    private WeakReference<Activity> mCurrentActivity;
    private JSExceptionHandler mExceptionHandlerWrapper;
    private final CopyOnWriteArraySet<ExtraWindowEventListener> mExtraWindowEventListeners;
    private LayoutInflater mInflater;
    protected InteropModuleRegistry mInteropModuleRegistry;
    private boolean mIsInitialized;
    private JSExceptionHandler mJSExceptionHandler;
    private MessageQueueThread mJSMessageQueueThread;
    private final CopyOnWriteArraySet<LifecycleEventListener> mLifecycleEventListeners;
    private LifecycleState mLifecycleState;
    private MessageQueueThread mNativeModulesMessageQueueThread;
    private ReactQueueConfiguration mQueueConfig;
    private final ScrollEndedListeners mScrollEndedListeners;
    private MessageQueueThread mUiMessageQueueThread;
    private final CopyOnWriteArraySet<WindowFocusChangeListener> mWindowFocusEventListeners;

    /* JADX INFO: renamed from: com.facebook.react.bridge.ReactContext$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$common$LifecycleState;

        static {
            int[] iArr = new int[LifecycleState.values().length];
            $SwitchMap$com$facebook$react$common$LifecycleState = iArr;
            try {
                iArr[LifecycleState.BEFORE_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$common$LifecycleState[LifecycleState.BEFORE_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$common$LifecycleState[LifecycleState.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class ExceptionHandlerWrapper implements JSExceptionHandler {
        public ExceptionHandlerWrapper() {
        }

        @Override // com.facebook.react.bridge.JSExceptionHandler
        public void handleException(Exception exc) {
            ReactContext.this.handleException(exc);
        }
    }

    @a
    public interface RCTDeviceEventEmitter extends JavaScriptModule {
        void emit(@NonNull String str, Object obj);
    }

    public ReactContext(Context context) {
        super(context);
        this.mLifecycleEventListeners = new CopyOnWriteArraySet<>();
        this.mActivityEventListeners = new CopyOnWriteArraySet<>();
        this.mExtraWindowEventListeners = new CopyOnWriteArraySet<>();
        this.mWindowFocusEventListeners = new CopyOnWriteArraySet<>();
        this.mScrollEndedListeners = new ScrollEndedListeners();
        this.mLifecycleState = LifecycleState.BEFORE_CREATE;
        this.mIsInitialized = false;
    }

    private void onHostDestroyImpl() {
        UiThreadUtil.assertOnUiThread();
        this.mLifecycleState = LifecycleState.BEFORE_CREATE;
        Iterator<LifecycleEventListener> it = this.mLifecycleEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onHostDestroy();
            } catch (RuntimeException e10) {
                handleException(e10);
            }
        }
    }

    public void addActivityEventListener(ActivityEventListener activityEventListener) {
        this.mActivityEventListeners.add(activityEventListener);
    }

    public void addExtraWindowEventListener(ExtraWindowEventListener extraWindowEventListener) {
        this.mExtraWindowEventListeners.add(extraWindowEventListener);
    }

    public void addLifecycleEventListener(final LifecycleEventListener lifecycleEventListener) {
        int i7;
        this.mLifecycleEventListeners.add(lifecycleEventListener);
        if ((!hasActiveReactInstance() && !isBridgeless()) || (i7 = AnonymousClass2.$SwitchMap$com$facebook$react$common$LifecycleState[this.mLifecycleState.ordinal()]) == 1 || i7 == 2) {
            return;
        }
        if (i7 != 3) {
            throw new IllegalStateException("Unhandled lifecycle state.");
        }
        runOnUiQueueThread(new Runnable() { // from class: com.facebook.react.bridge.ReactContext.1
            @Override // java.lang.Runnable
            public void run() {
                if (ReactContext.this.mLifecycleEventListeners.contains(lifecycleEventListener)) {
                    try {
                        lifecycleEventListener.onHostResume();
                    } catch (RuntimeException e10) {
                        ReactContext.this.handleException(e10);
                    }
                }
            }
        });
    }

    public void addWindowFocusChangeListener(WindowFocusChangeListener windowFocusChangeListener) {
        this.mWindowFocusEventListeners.add(windowFocusChangeListener);
    }

    public void assertOnJSQueueThread() {
        MessageQueueThread messageQueueThread = this.mJSMessageQueueThread;
        io.sentry.config.a.f(messageQueueThread);
        messageQueueThread.assertIsOnThread();
    }

    public void assertOnNativeModulesQueueThread() {
        if (!this.mIsInitialized) {
            throw new IllegalStateException("Tried to call assertOnNativeModulesQueueThread() on an uninitialized ReactContext");
        }
        MessageQueueThread messageQueueThread = this.mNativeModulesMessageQueueThread;
        io.sentry.config.a.f(messageQueueThread);
        messageQueueThread.assertIsOnThread();
    }

    public void assertOnUiQueueThread() {
        MessageQueueThread messageQueueThread = this.mUiMessageQueueThread;
        io.sentry.config.a.f(messageQueueThread);
        messageQueueThread.assertIsOnThread();
    }

    public abstract void destroy();

    public void emitDeviceEvent(String str, Object obj) {
        RCTDeviceEventEmitter rCTDeviceEventEmitter = (RCTDeviceEventEmitter) getJSModule(RCTDeviceEventEmitter.class);
        if (rCTDeviceEventEmitter != null) {
            rCTDeviceEventEmitter.emit(str, obj);
        }
    }

    public abstract CatalystInstance getCatalystInstance();

    public Activity getCurrentActivity() {
        WeakReference<Activity> weakReference = this.mCurrentActivity;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public JSExceptionHandler getExceptionHandler() {
        if (this.mExceptionHandlerWrapper == null) {
            this.mExceptionHandlerWrapper = new ExceptionHandlerWrapper();
        }
        return this.mExceptionHandlerWrapper;
    }

    @Deprecated(since = "This method is deprecated, please use UIManagerHelper.getUIManager() instead.")
    public abstract UIManager getFabricUIManager();

    public abstract CallInvokerHolder getJSCallInvokerHolder();

    public JSExceptionHandler getJSExceptionHandler() {
        return this.mJSExceptionHandler;
    }

    public MessageQueueThread getJSMessageQueueThread() {
        return this.mJSMessageQueueThread;
    }

    public abstract <T extends JavaScriptModule> T getJSModule(Class<T> cls);

    public abstract JavaScriptContextHolder getJavaScriptContextHolder();

    public LifecycleState getLifecycleState() {
        return this.mLifecycleState;
    }

    public abstract <T extends NativeModule> T getNativeModule(Class<T> cls);

    public abstract NativeModule getNativeModule(String str);

    public abstract Collection<NativeModule> getNativeModules();

    public MessageQueueThread getNativeModulesMessageQueueThread() {
        return this.mNativeModulesMessageQueueThread;
    }

    public ScrollEndedListeners getScrollEndedListeners() {
        return this.mScrollEndedListeners;
    }

    public abstract String getSourceURL();

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.mInflater == null) {
            this.mInflater = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.mInflater;
    }

    public MessageQueueThread getUiMessageQueueThread() {
        return this.mUiMessageQueueThread;
    }

    public abstract void handleException(Exception exc);

    @Deprecated
    public abstract boolean hasActiveCatalystInstance();

    public abstract boolean hasActiveReactInstance();

    @Deprecated
    public abstract boolean hasCatalystInstance();

    public boolean hasCurrentActivity() {
        WeakReference<Activity> weakReference = this.mCurrentActivity;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public abstract <T extends NativeModule> boolean hasNativeModule(Class<T> cls);

    public abstract boolean hasReactInstance();

    public void initializeFromOther(ReactContext reactContext) {
        if (reactContext.hasReactInstance()) {
            initializeMessageQueueThreads(reactContext.mQueueConfig);
        }
        this.mInteropModuleRegistry = reactContext.mInteropModuleRegistry;
    }

    public void initializeInteropModules() {
        this.mInteropModuleRegistry = new InteropModuleRegistry();
    }

    public synchronized void initializeMessageQueueThreads(ReactQueueConfiguration reactQueueConfiguration) {
        o8.a.b(TAG, "initializeMessageQueueThreads() is called.");
        if (this.mUiMessageQueueThread != null || this.mNativeModulesMessageQueueThread != null || this.mJSMessageQueueThread != null) {
            throw new IllegalStateException("Message queue threads already initialized");
        }
        this.mQueueConfig = reactQueueConfiguration;
        this.mUiMessageQueueThread = reactQueueConfiguration.getUIQueueThread();
        this.mNativeModulesMessageQueueThread = reactQueueConfiguration.getNativeModulesQueueThread();
        MessageQueueThread jSQueueThread = reactQueueConfiguration.getJSQueueThread();
        this.mJSMessageQueueThread = jSQueueThread;
        if (this.mUiMessageQueueThread == null) {
            throw new IllegalStateException("UI thread is null");
        }
        if (this.mNativeModulesMessageQueueThread == null) {
            throw new IllegalStateException("NativeModules thread is null");
        }
        if (jSQueueThread == null) {
            throw new IllegalStateException("JavaScript thread is null");
        }
        this.mIsInitialized = true;
    }

    public <T extends JavaScriptModule> void internal_registerInteropModule(Class<T> cls, Object obj) {
        InteropModuleRegistry interopModuleRegistry = this.mInteropModuleRegistry;
        if (interopModuleRegistry != null) {
            interopModuleRegistry.registerInteropModule(cls, obj);
        }
    }

    @Deprecated
    public abstract boolean isBridgeless();

    public boolean isOnJSQueueThread() {
        MessageQueueThread messageQueueThread = this.mJSMessageQueueThread;
        io.sentry.config.a.f(messageQueueThread);
        return messageQueueThread.isOnThread();
    }

    public boolean isOnNativeModulesQueueThread() {
        MessageQueueThread messageQueueThread = this.mNativeModulesMessageQueueThread;
        io.sentry.config.a.f(messageQueueThread);
        return messageQueueThread.isOnThread();
    }

    public boolean isOnUiQueueThread() {
        MessageQueueThread messageQueueThread = this.mUiMessageQueueThread;
        io.sentry.config.a.f(messageQueueThread);
        return messageQueueThread.isOnThread();
    }

    public void onActivityResult(Activity activity, int i7, int i10, Intent intent) {
        Iterator<ActivityEventListener> it = this.mActivityEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onActivityResult(activity, i7, i10, intent);
            } catch (RuntimeException e10) {
                handleException(e10);
            }
        }
    }

    public void onExtraWindowCreate(Window window) {
        UiThreadUtil.assertOnUiThread();
        Iterator<ExtraWindowEventListener> it = this.mExtraWindowEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onExtraWindowCreate(window);
            } catch (RuntimeException e10) {
                handleException(e10);
            }
        }
    }

    public void onExtraWindowDestroy(Window window) {
        UiThreadUtil.assertOnUiThread();
        Iterator<ExtraWindowEventListener> it = this.mExtraWindowEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onExtraWindowDestroy(window);
            } catch (RuntimeException e10) {
                handleException(e10);
            }
        }
    }

    public void onHostDestroy() {
        onHostDestroyImpl();
        this.mCurrentActivity = null;
    }

    public void onHostPause() {
        this.mLifecycleState = LifecycleState.BEFORE_RESUME;
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_PAUSE_START);
        Iterator<LifecycleEventListener> it = this.mLifecycleEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onHostPause();
            } catch (RuntimeException e10) {
                handleException(e10);
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_PAUSE_END);
    }

    public void onHostResume(Activity activity) {
        this.mLifecycleState = LifecycleState.RESUMED;
        this.mCurrentActivity = new WeakReference<>(activity);
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_RESUME_START);
        Iterator<LifecycleEventListener> it = this.mLifecycleEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onHostResume();
            } catch (RuntimeException e10) {
                handleException(e10);
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_RESUME_END);
    }

    public void onNewIntent(Activity activity, Intent intent) {
        UiThreadUtil.assertOnUiThread();
        this.mCurrentActivity = new WeakReference<>(activity);
        Iterator<ActivityEventListener> it = this.mActivityEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onNewIntent(intent);
            } catch (RuntimeException e10) {
                handleException(e10);
            }
        }
    }

    public void onUserLeaveHint(Activity activity) {
        ReactMarker.logMarker(ReactMarkerConstants.ON_USER_LEAVE_HINT_START);
        Iterator<ActivityEventListener> it = this.mActivityEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onUserLeaveHint(activity);
            } catch (RuntimeException e10) {
                handleException(e10);
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.ON_USER_LEAVE_HINT_END);
    }

    public void onWindowFocusChange(boolean z5) {
        UiThreadUtil.assertOnUiThread();
        Iterator<WindowFocusChangeListener> it = this.mWindowFocusEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onWindowFocusChange(z5);
            } catch (RuntimeException e10) {
                handleException(e10);
            }
        }
    }

    public abstract void registerSegment(int i7, String str, Callback callback);

    public void removeActivityEventListener(ActivityEventListener activityEventListener) {
        this.mActivityEventListeners.remove(activityEventListener);
    }

    public void removeExtraWindowEventListener(ExtraWindowEventListener extraWindowEventListener) {
        this.mExtraWindowEventListeners.remove(extraWindowEventListener);
    }

    public void removeLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.mLifecycleEventListeners.remove(lifecycleEventListener);
    }

    public void removeWindowFocusChangeListener(WindowFocusChangeListener windowFocusChangeListener) {
        this.mWindowFocusEventListeners.remove(windowFocusChangeListener);
    }

    @Deprecated(since = "MessageQueueThread perf stats are no longer collected")
    public void resetPerfStats() {
    }

    public boolean runOnJSQueueThread(Runnable runnable) {
        MessageQueueThread messageQueueThread = this.mJSMessageQueueThread;
        io.sentry.config.a.f(messageQueueThread);
        return messageQueueThread.runOnQueue(runnable);
    }

    public void runOnNativeModulesQueueThread(Runnable runnable) {
        MessageQueueThread messageQueueThread = this.mNativeModulesMessageQueueThread;
        io.sentry.config.a.f(messageQueueThread);
        messageQueueThread.runOnQueue(runnable);
    }

    public void runOnUiQueueThread(Runnable runnable) {
        MessageQueueThread messageQueueThread = this.mUiMessageQueueThread;
        io.sentry.config.a.f(messageQueueThread);
        messageQueueThread.runOnQueue(runnable);
    }

    public void setJSExceptionHandler(JSExceptionHandler jSExceptionHandler) {
        this.mJSExceptionHandler = jSExceptionHandler;
    }

    public boolean startActivityForResult(Intent intent, int i7, Bundle bundle) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return false;
        }
        currentActivity.startActivityForResult(intent, i7, bundle);
        return true;
    }

    public void emitDeviceEvent(String str) {
        emitDeviceEvent(str, null);
    }

    public void onHostDestroy(boolean z5) {
        if (!z5) {
            onHostDestroy();
        } else {
            onHostDestroyImpl();
        }
    }

    public void assertOnNativeModulesQueueThread(String str) {
        if (this.mIsInitialized) {
            MessageQueueThread messageQueueThread = this.mNativeModulesMessageQueueThread;
            io.sentry.config.a.f(messageQueueThread);
            messageQueueThread.assertIsOnThread(str);
            return;
        }
        throw new IllegalStateException("Tried to call assertOnNativeModulesQueueThread(message) on an uninitialized ReactContext");
    }
}
