package com.facebook.react;

import a1.l;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.u0;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.SurfaceDelegateFactory;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.devsupport.DevSupportManagerFactory;
import com.facebook.react.devsupport.ReactInstanceDevHelper;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.DevLoadingViewManager;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import com.facebook.react.devsupport.interfaces.PausedInDebuggerOverlayManager;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import com.facebook.react.interfaces.TaskInterface;
import com.facebook.react.internal.AndroidChoreographerProvider;
import com.facebook.react.internal.ChoreographerProvider;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlags;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.packagerconnection.RequestHandler;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.ReactRoot;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.facebook.soloader.SoLoader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import mo.c0;
import xr.m;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated(since = "This class is part of Legacy Architecture and will be removed in a future release")
public class ReactInstanceManager {
    private static final String TAG;
    private final Context mApplicationContext;
    private final JSBundleLoader mBundleLoader;
    private volatile Thread mCreateReactContextThread;
    private Activity mCurrentActivity;
    private volatile ReactContext mCurrentReactContext;
    private DefaultHardwareBackBtnHandler mDefaultBackButtonImpl;
    private final DevSupportManager mDevSupportManager;
    private final JSExceptionHandler mJSExceptionHandler;
    private final String mJSMainModulePath;
    private final JavaScriptExecutorFactory mJavaScriptExecutorFactory;
    private final boolean mKeepActivity;
    private volatile LifecycleState mLifecycleState;
    private final MemoryPressureRouter mMemoryPressureRouter;
    private final List<ReactPackage> mPackages;
    private ReactContextInitParams mPendingReactContextInitParams;
    private final boolean mRequireActivity;
    private final ReactPackageTurboModuleManagerDelegate.Builder mTMMDelegateBuilder;
    private final UIManagerProvider mUIManagerProvider;
    private final boolean mUseDeveloperSupport;
    private List<ViewManager> mViewManagers;
    private final Set<ReactRoot> mAttachedReactRoots = Collections.synchronizedSet(new HashSet());
    private Collection<String> mViewManagerNames = null;
    private final Object mReactContextLock = new Object();
    private final Collection<com.facebook.react.ReactInstanceEventListener> mReactInstanceEventListeners = Collections.synchronizedList(new ArrayList());
    private volatile boolean mHasStartedCreatingInitialContext = false;
    private volatile Boolean mHasStartedDestroying = Boolean.FALSE;
    private boolean mUseFallbackBundle = true;
    private volatile boolean mInstanceManagerInvalidated = false;

    /* JADX INFO: renamed from: com.facebook.react.ReactInstanceManager$2, reason: invalid class name */
    public class AnonymousClass2 implements PackagerStatusCallback {
        public AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPackagerStatusFetched$0(boolean z5) {
            if (ReactInstanceManager.this.mInstanceManagerInvalidated) {
                return;
            }
            if (z5) {
                ReactInstanceManager.this.mDevSupportManager.handleReloadJS();
            } else if (!ReactInstanceManager.this.mDevSupportManager.hasUpToDateJSBundleInCache() || ReactInstanceManager.this.mUseFallbackBundle) {
                ReactInstanceManager.this.recreateReactContextInBackgroundFromBundleLoader();
            } else {
                ReactInstanceManager.this.onJSBundleLoadedFromServer();
            }
        }

        @Override // com.facebook.react.devsupport.interfaces.PackagerStatusCallback
        public void onPackagerStatusFetched(final boolean z5) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5155d.lambda$onPackagerStatusFetched$0(z5);
                }
            });
        }
    }

    public static class ReactContextInitParams {
        private final JSBundleLoader mJsBundleLoader;
        private final JavaScriptExecutorFactory mJsExecutorFactory;

        public ReactContextInitParams(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
            io.sentry.config.a.f(javaScriptExecutorFactory);
            this.mJsExecutorFactory = javaScriptExecutorFactory;
            io.sentry.config.a.f(jSBundleLoader);
            this.mJsBundleLoader = jSBundleLoader;
        }

        public JSBundleLoader getJsBundleLoader() {
            return this.mJsBundleLoader;
        }

        public JavaScriptExecutorFactory getJsExecutorFactory() {
            return this.mJsExecutorFactory;
        }
    }

    @Deprecated
    public interface ReactInstanceEventListener extends com.facebook.react.ReactInstanceEventListener {
    }

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("ReactInstanceManager", LegacyArchitectureLogLevel.WARNING);
        TAG = "ReactInstanceManager";
    }

    public ReactInstanceManager(Context context, Activity activity, DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler, JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader, String str, List<ReactPackage> list, boolean z5, DevSupportManagerFactory devSupportManagerFactory, boolean z6, boolean z7, LifecycleState lifecycleState, JSExceptionHandler jSExceptionHandler, RedBoxHandler redBoxHandler, boolean z10, DevBundleDownloadListener devBundleDownloadListener, int i7, int i10, UIManagerProvider uIManagerProvider, Map<String, RequestHandler> map, ReactPackageTurboModuleManagerDelegate.Builder builder, SurfaceDelegateFactory surfaceDelegateFactory, DevLoadingViewManager devLoadingViewManager, ChoreographerProvider choreographerProvider, PausedInDebuggerOverlayManager pausedInDebuggerOverlayManager) {
        o8.a.b(TAG, "ReactInstanceManager.ctor()");
        initializeSoLoaderIfNecessary(context);
        DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(context);
        this.mApplicationContext = context;
        this.mCurrentActivity = activity;
        this.mDefaultBackButtonImpl = defaultHardwareBackBtnHandler;
        this.mJavaScriptExecutorFactory = javaScriptExecutorFactory;
        this.mBundleLoader = jSBundleLoader;
        this.mJSMainModulePath = str;
        ArrayList arrayList = new ArrayList();
        this.mPackages = arrayList;
        this.mUseDeveloperSupport = z5;
        this.mRequireActivity = z6;
        this.mKeepActivity = z7;
        Intrinsics.checkNotNullParameter("ReactInstanceManager.initDevSupportManager", "sectionName");
        Trace.beginSection(c0.Q("ReactInstanceManager.initDevSupportManager"));
        DevSupportManager devSupportManagerCreate = devSupportManagerFactory.create(context, createDevHelperInterface(), str, z5, redBoxHandler, devBundleDownloadListener, i7, map, surfaceDelegateFactory, devLoadingViewManager, pausedInDebuggerOverlayManager);
        this.mDevSupportManager = devSupportManagerCreate;
        Trace.endSection();
        this.mLifecycleState = lifecycleState;
        this.mMemoryPressureRouter = new MemoryPressureRouter(context);
        this.mJSExceptionHandler = jSExceptionHandler;
        this.mTMMDelegateBuilder = builder;
        synchronized (arrayList) {
            try {
                i8.c tag = z8.a.f23598a;
                Intrinsics.checkNotNullParameter(tag, "tag");
                Intrinsics.checkNotNullParameter("RNCore: Use Split Packages", "message");
                if (z5) {
                    arrayList.add(new DebugCorePackage());
                }
                arrayList.addAll(list);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.mUIManagerProvider = uIManagerProvider;
        ReactChoreographer.initialize(choreographerProvider != null ? choreographerProvider : AndroidChoreographerProvider.getInstance());
        if (z5) {
            devSupportManagerCreate.startInspector();
        }
        throw new UnsupportedOperationException("ReactInstanceManager.createReactContext is unsupported.");
    }

    private void attachRootViewToInstance(ReactRoot reactRoot) {
        o8.a.b(ReactConstants.TAG, "ReactInstanceManager.attachRootViewToInstance()");
        if (reactRoot.getState().compareAndSet(0, 1)) {
            Intrinsics.checkNotNullParameter("attachRootViewToInstance", "sectionName");
            Trace.beginSection(c0.Q("attachRootViewToInstance"));
            UIManager uIManager = UIManagerHelper.getUIManager(this.mCurrentReactContext, 2);
            if (uIManager == null) {
                throw new IllegalStateException("Unable to attach a rootView to ReactInstance when UIManager is not properly initialized.");
            }
            Bundle appProperties = reactRoot.getAppProperties();
            int iStartSurface = uIManager.startSurface(reactRoot.getRootViewGroup(), reactRoot.getJSModuleName(), appProperties == null ? new WritableNativeMap() : Arguments.fromBundle(appProperties), reactRoot.getWidthMeasureSpec(), reactRoot.getHeightMeasureSpec());
            reactRoot.setShouldLogContentAppeared(true);
            Intrinsics.checkNotNullParameter("pre_rootView.onAttachedToReactInstance", "sectionName");
            if (Build.VERSION.SDK_INT >= 29) {
                l3.a.a(iStartSurface, c0.Q("pre_rootView.onAttachedToReactInstance"));
            } else {
                String strQ = c0.Q("pre_rootView.onAttachedToReactInstance");
                try {
                    if (c0.f15942e == null) {
                        c0.f15942e = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                    }
                    c0.f15942e.invoke(null, Long.valueOf(c0.f15940c), strQ, Integer.valueOf(iStartSurface));
                } catch (Exception e10) {
                    c0.x("asyncTraceBegin", e10);
                }
            }
            UiThreadUtil.runOnUiThread(new l(iStartSurface, reactRoot));
            Trace.endSection();
        }
    }

    public static ReactInstanceManagerBuilder builder() {
        return new ReactInstanceManagerBuilder();
    }

    private void clearReactRoot(ReactRoot reactRoot) {
        UiThreadUtil.assertOnUiThread();
        reactRoot.getState().compareAndSet(1, 0);
        ViewGroup rootViewGroup = reactRoot.getRootViewGroup();
        rootViewGroup.removeAllViews();
        rootViewGroup.setId(-1);
    }

    private ReactInstanceDevHelper createDevHelperInterface() {
        return new ReactInstanceDevHelper() { // from class: com.facebook.react.ReactInstanceManager.1
            @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
            public View createRootView(String str) {
                Activity currentActivity = getCurrentActivity();
                if (currentActivity == null) {
                    return null;
                }
                ReactRootView reactRootView = new ReactRootView(currentActivity);
                reactRootView.setIsFabric(ReactNativeNewArchitectureFeatureFlags.enableFabricRenderer());
                reactRootView.startReactApplication(ReactInstanceManager.this, str, new Bundle());
                return reactRootView;
            }

            @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
            public void destroyRootView(View view) {
                if (view instanceof ReactRootView) {
                    ((ReactRootView) view).unmountReactApplication();
                }
            }

            @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
            public Activity getCurrentActivity() {
                return ReactInstanceManager.this.mCurrentActivity;
            }

            @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
            public ReactContext getCurrentReactContext() {
                return null;
            }

            @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
            public JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
                return ReactInstanceManager.this.getJSExecutorFactory();
            }

            @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
            public TaskInterface<Boolean> loadBundle(JSBundleLoader jSBundleLoader) {
                return null;
            }

            @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
            public void onJSBundleLoadedFromServer() {
                ReactInstanceManager.this.onJSBundleLoadedFromServer();
            }

            @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
            public void reload(String str) {
            }

            @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
            public void toggleElementInspector() {
                ReactInstanceManager.this.toggleElementInspector();
            }
        };
    }

    private ReactApplicationContext createReactContext(JavaScriptExecutor javaScriptExecutor, JSBundleLoader jSBundleLoader) {
        throw new UnsupportedOperationException("ReactInstanceManager.createReactContext is unsupported. CatalystInstanceImpl has been removed.");
    }

    private void detachRootViewFromInstance(ReactRoot reactRoot, ReactContext reactContext) {
        o8.a.b(ReactConstants.TAG, "ReactInstanceManager.detachRootViewFromInstance()");
        UiThreadUtil.assertOnUiThread();
        if (reactRoot.getState().compareAndSet(1, 0)) {
            int rootViewTag = reactRoot.getRootViewTag();
            if (rootViewTag != -1) {
                UIManager uIManager = UIManagerHelper.getUIManager(reactContext, 2);
                if (uIManager != null) {
                    uIManager.stopSurface(rootViewTag);
                } else {
                    o8.a.v(ReactConstants.TAG, "Failed to stop surface, UIManager has already gone away");
                }
            } else {
                ReactSoftExceptionLogger.logSoftException(TAG, new RuntimeException("detachRootViewFromInstance called with ReactRootView with invalid id"));
            }
            clearReactRoot(reactRoot);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JavaScriptExecutorFactory getJSExecutorFactory() {
        return this.mJavaScriptExecutorFactory;
    }

    public static void initializeSoLoaderIfNecessary(Context context) {
        try {
            SoLoader.f(context, 0);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private void invokeDefaultOnBackPressed() {
        UiThreadUtil.assertOnUiThread();
        DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler = this.mDefaultBackButtonImpl;
        if (defaultHardwareBackBtnHandler != null) {
            defaultHardwareBackBtnHandler.invokeDefaultOnBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$attachRootViewToInstance$6(int i7, ReactRoot reactRoot) {
        Intrinsics.checkNotNullParameter("pre_rootView.onAttachedToReactInstance", "sectionName");
        if (Build.VERSION.SDK_INT >= 29) {
            l3.a.b(i7, c0.Q("pre_rootView.onAttachedToReactInstance"));
        } else {
            String strQ = c0.Q("pre_rootView.onAttachedToReactInstance");
            try {
                if (c0.f15943f == null) {
                    c0.f15943f = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                }
                c0.f15943f.invoke(null, Long.valueOf(c0.f15940c), strQ, Integer.valueOf(i7));
            } catch (Exception e10) {
                c0.x("asyncTraceEnd", e10);
            }
        }
        reactRoot.onStage(101);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runCreateReactContextOnNewThread$0() {
        ReactContextInitParams reactContextInitParams = this.mPendingReactContextInitParams;
        if (reactContextInitParams != null) {
            runCreateReactContextOnNewThread(reactContextInitParams);
            this.mPendingReactContextInitParams = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runCreateReactContextOnNewThread$1(ReactApplicationContext reactApplicationContext) {
        try {
            setupReactContext(reactApplicationContext);
        } catch (Exception e10) {
            this.mDevSupportManager.handleException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runCreateReactContextOnNewThread$2(ReactContextInitParams reactContextInitParams) {
        ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_END);
        synchronized (this.mHasStartedDestroying) {
            while (this.mHasStartedDestroying.booleanValue()) {
                try {
                    this.mHasStartedDestroying.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        this.mHasStartedCreatingInitialContext = true;
        try {
            Process.setThreadPriority(-4);
            ReactMarker.logMarker(ReactMarkerConstants.VM_INIT);
            ReactApplicationContext reactApplicationContextCreateReactContext = createReactContext(reactContextInitParams.getJsExecutorFactory().create(), reactContextInitParams.getJsBundleLoader());
            try {
                this.mCreateReactContextThread = null;
                ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_START);
                am.c cVar = new am.c(16, this);
                reactApplicationContextCreateReactContext.runOnNativeModulesQueueThread(new c(this, reactApplicationContextCreateReactContext, 1));
                UiThreadUtil.runOnUiThread(cVar);
            } catch (Exception e10) {
                this.mDevSupportManager.handleException(e10);
            }
        } catch (Exception e11) {
            this.mHasStartedCreatingInitialContext = false;
            this.mCreateReactContextThread = null;
            this.mDevSupportManager.handleException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupReactContext$3(com.facebook.react.ReactInstanceEventListener[] reactInstanceEventListenerArr, ReactApplicationContext reactApplicationContext) {
        moveReactContextToCurrentLifecycleState();
        for (com.facebook.react.ReactInstanceEventListener reactInstanceEventListener : reactInstanceEventListenerArr) {
            if (reactInstanceEventListener != null) {
                reactInstanceEventListener.onReactContextInitialized(reactApplicationContext);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setupReactContext$4() {
        Process.setThreadPriority(0);
        ReactMarker.logMarker(ReactMarkerConstants.CHANGE_THREAD_PRIORITY, "js_default");
    }

    private void logOnDestroy() {
        String str = TAG;
        RuntimeException runtimeException = new RuntimeException("ReactInstanceManager.destroy called");
        if (o8.a.f17171a.isLoggable(3)) {
            o8.a.f17171a.d(str, "ReactInstanceManager.destroy called", runtimeException);
        }
    }

    private synchronized void moveReactContextToCurrentLifecycleState() {
        if (this.mLifecycleState == LifecycleState.RESUMED) {
            moveToResumedLifecycleState(true);
        }
    }

    private synchronized void moveToBeforeCreateLifecycleState() {
        try {
            ReactContext currentReactContext = getCurrentReactContext();
            if (currentReactContext != null) {
                if (this.mLifecycleState == LifecycleState.RESUMED) {
                    currentReactContext.onHostPause();
                    this.mLifecycleState = LifecycleState.BEFORE_RESUME;
                }
                if (this.mLifecycleState == LifecycleState.BEFORE_RESUME) {
                    currentReactContext.onHostDestroy(this.mKeepActivity);
                }
            }
            this.mLifecycleState = LifecycleState.BEFORE_CREATE;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void moveToBeforeResumeLifecycleState() {
        try {
            ReactContext currentReactContext = getCurrentReactContext();
            if (currentReactContext != null) {
                if (this.mLifecycleState == LifecycleState.BEFORE_CREATE) {
                    currentReactContext.onHostResume(this.mCurrentActivity);
                    currentReactContext.onHostPause();
                } else if (this.mLifecycleState == LifecycleState.RESUMED) {
                    currentReactContext.onHostPause();
                }
            }
            this.mLifecycleState = LifecycleState.BEFORE_RESUME;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void moveToResumedLifecycleState(boolean z5) {
        try {
            ReactContext currentReactContext = getCurrentReactContext();
            if (currentReactContext != null && (z5 || this.mLifecycleState == LifecycleState.BEFORE_RESUME || this.mLifecycleState == LifecycleState.BEFORE_CREATE)) {
                currentReactContext.onHostResume(this.mCurrentActivity);
            }
            this.mLifecycleState = LifecycleState.RESUMED;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onJSBundleLoadedFromServer() {
        o8.a.b(ReactConstants.TAG, "ReactInstanceManager.onJSBundleLoadedFromServer()");
        recreateReactContextInBackground(this.mJavaScriptExecutorFactory, JSBundleLoader.createCachedBundleFromNetworkLoader(this.mDevSupportManager.getSourceUrl(), this.mDevSupportManager.getDownloadedJSBundleFile()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recreateReactContextInBackgroundFromBundleLoader() {
        o8.a.b(TAG, "ReactInstanceManager.recreateReactContextInBackgroundFromBundleLoader()");
        i8.c tag = z8.a.f23598a;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter("RNCore: load from BundleLoader", "message");
        recreateReactContextInBackground(this.mJavaScriptExecutorFactory, this.mBundleLoader);
    }

    private void recreateReactContextInBackgroundInner() {
        o8.a.b(TAG, "ReactInstanceManager.recreateReactContextInBackgroundInner()");
        i8.c tag = z8.a.f23598a;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter("RNCore: recreateReactContextInBackground", "message");
        UiThreadUtil.assertOnUiThread();
        if (!this.mUseDeveloperSupport || this.mJSMainModulePath == null) {
            recreateReactContextInBackgroundFromBundleLoader();
        } else if (this.mBundleLoader == null) {
            this.mDevSupportManager.handleReloadJS();
        } else {
            this.mDevSupportManager.isPackagerRunning(new AnonymousClass2());
        }
    }

    private void runCreateReactContextOnNewThread(ReactContextInitParams reactContextInitParams) {
        o8.a.b(ReactConstants.TAG, "ReactInstanceManager.runCreateReactContextOnNewThread()");
        UiThreadUtil.assertOnUiThread();
        io.sentry.config.a.e(!this.mInstanceManagerInvalidated, "Cannot create a new React context on an invalidated ReactInstanceManager");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGE_LOADING_START);
        synchronized (this.mAttachedReactRoots) {
            synchronized (this.mReactContextLock) {
                try {
                    if (this.mCurrentReactContext != null) {
                        tearDownReactContext(this.mCurrentReactContext);
                        this.mCurrentReactContext = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.mCreateReactContextThread = new Thread(null, new c(this, reactContextInitParams, 0), "create_react_context");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_START);
        this.mCreateReactContextThread.start();
    }

    private void setupReactContext(ReactApplicationContext reactApplicationContext) {
        o8.a.b(ReactConstants.TAG, "ReactInstanceManager.setupReactContext()");
        ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_START);
        Intrinsics.checkNotNullParameter("setupReactContext", "sectionName");
        Trace.beginSection(c0.Q("setupReactContext"));
        synchronized (this.mAttachedReactRoots) {
            try {
                synchronized (this.mReactContextLock) {
                    io.sentry.config.a.f(reactApplicationContext);
                    this.mCurrentReactContext = reactApplicationContext;
                }
                CatalystInstance catalystInstance = reactApplicationContext.getCatalystInstance();
                io.sentry.config.a.f(catalystInstance);
                catalystInstance.initialize();
                this.mDevSupportManager.onNewReactContextCreated(reactApplicationContext);
                this.mMemoryPressureRouter.addMemoryPressureListener(catalystInstance);
                ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_START);
                Iterator<ReactRoot> it = this.mAttachedReactRoots.iterator();
                while (it.hasNext()) {
                    attachRootViewToInstance(it.next());
                }
                ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_END);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        UiThreadUtil.runOnUiThread(new ac.a(this, (com.facebook.react.ReactInstanceEventListener[]) this.mReactInstanceEventListeners.toArray(new com.facebook.react.ReactInstanceEventListener[this.mReactInstanceEventListeners.size()]), reactApplicationContext, 9));
        reactApplicationContext.runOnJSQueueThread(new bc.a(5));
        reactApplicationContext.runOnNativeModulesQueueThread(new bc.a(6));
        Trace.endSection();
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGE_LOADING_END);
    }

    private void tearDownReactContext(ReactContext reactContext) {
        o8.a.b(ReactConstants.TAG, "ReactInstanceManager.tearDownReactContext()");
        UiThreadUtil.assertOnUiThread();
        if (this.mLifecycleState == LifecycleState.RESUMED) {
            reactContext.onHostPause();
        }
        synchronized (this.mAttachedReactRoots) {
            try {
                Iterator<ReactRoot> it = this.mAttachedReactRoots.iterator();
                while (it.hasNext()) {
                    detachRootViewFromInstance(it.next(), reactContext);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.mMemoryPressureRouter.removeMemoryPressureListener(reactContext.getCatalystInstance());
        reactContext.destroy();
        this.mDevSupportManager.onReactInstanceDestroyed(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleElementInspector() {
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext == null || !currentReactContext.hasActiveReactInstance()) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot toggleElementInspector, CatalystInstance not available"));
        } else {
            currentReactContext.emitDeviceEvent("toggleElementInspector");
        }
    }

    public void addReactInstanceEventListener(com.facebook.react.ReactInstanceEventListener reactInstanceEventListener) {
        this.mReactInstanceEventListeners.add(reactInstanceEventListener);
    }

    @Deprecated
    public void attachRootView(ReactRoot reactRoot) {
        UiThreadUtil.assertOnUiThread();
        synchronized (this.mAttachedReactRoots) {
            try {
                if (this.mAttachedReactRoots.add(reactRoot)) {
                    clearReactRoot(reactRoot);
                } else {
                    o8.a.g(ReactConstants.TAG, "ReactRoot was attached multiple times");
                }
                ReactContext currentReactContext = getCurrentReactContext();
                if (this.mCreateReactContextThread == null && currentReactContext != null) {
                    attachRootViewToInstance(reactRoot);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void createReactContextInBackground() {
        o8.a.b(TAG, "ReactInstanceManager.createReactContextInBackground()");
        UiThreadUtil.assertOnUiThread();
        if (this.mHasStartedCreatingInitialContext) {
            return;
        }
        this.mHasStartedCreatingInitialContext = true;
        recreateReactContextInBackgroundInner();
    }

    public ViewManager createViewManager(String str) {
        ViewManager viewManagerCreateViewManager;
        synchronized (this.mReactContextLock) {
            ReactApplicationContext reactApplicationContext = (ReactApplicationContext) getCurrentReactContext();
            if (reactApplicationContext != null && reactApplicationContext.hasActiveReactInstance()) {
                synchronized (this.mPackages) {
                    try {
                        for (ReactPackage reactPackage : this.mPackages) {
                            if ((reactPackage instanceof ViewManagerOnDemandReactPackage) && (viewManagerCreateViewManager = ((ViewManagerOnDemandReactPackage) reactPackage).createViewManager(reactApplicationContext, str)) != null) {
                                return viewManagerCreateViewManager;
                            }
                        }
                        return null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return null;
        }
    }

    public void destroy() {
        UiThreadUtil.assertOnUiThread();
        i8.c tag = z8.a.f23598a;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter("RNCore: Destroy", "message");
        logOnDestroy();
        if (this.mHasStartedDestroying.booleanValue()) {
            o8.a.g(ReactConstants.TAG, "ReactInstanceManager.destroy called: bail out, already destroying");
            return;
        }
        this.mHasStartedDestroying = Boolean.TRUE;
        if (this.mUseDeveloperSupport) {
            this.mDevSupportManager.setDevSupportEnabled(false);
            this.mDevSupportManager.stopInspector();
        }
        moveToBeforeCreateLifecycleState();
        this.mMemoryPressureRouter.destroy(this.mApplicationContext);
        this.mCreateReactContextThread = null;
        synchronized (this.mAttachedReactRoots) {
            synchronized (this.mReactContextLock) {
                try {
                    if (this.mCurrentReactContext != null) {
                        Iterator<ReactRoot> it = this.mAttachedReactRoots.iterator();
                        while (it.hasNext()) {
                            detachRootViewFromInstance(it.next(), this.mCurrentReactContext);
                        }
                        this.mCurrentReactContext.destroy();
                        this.mCurrentReactContext = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.mHasStartedCreatingInitialContext = false;
        if (!this.mKeepActivity) {
            this.mCurrentActivity = null;
        }
        ResourceDrawableIdHelper.getInstance();
        ResourceDrawableIdHelper.clear();
        this.mHasStartedDestroying = Boolean.FALSE;
        synchronized (this.mHasStartedDestroying) {
            this.mHasStartedDestroying.notifyAll();
        }
        synchronized (this.mPackages) {
            this.mViewManagerNames = null;
        }
        o8.a.b(ReactConstants.TAG, "ReactInstanceManager has been destroyed");
    }

    @Deprecated
    public void detachRootView(ReactRoot reactRoot) {
        ReactContext reactContext;
        UiThreadUtil.assertOnUiThread();
        if (this.mAttachedReactRoots.remove(reactRoot) && (reactContext = this.mCurrentReactContext) != null && reactContext.hasActiveReactInstance()) {
            detachRootViewFromInstance(reactRoot, reactContext);
        }
    }

    public ReactContext getCurrentReactContext() {
        ReactContext reactContext;
        synchronized (this.mReactContextLock) {
            reactContext = this.mCurrentReactContext;
        }
        return reactContext;
    }

    public DevSupportManager getDevSupportManager() {
        return this.mDevSupportManager;
    }

    public String getJsExecutorName() {
        return this.mJavaScriptExecutorFactory.toString();
    }

    public LifecycleState getLifecycleState() {
        return this.mLifecycleState;
    }

    public MemoryPressureRouter getMemoryPressureRouter() {
        return this.mMemoryPressureRouter;
    }

    public List<ViewManager> getOrCreateViewManagers(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_START);
        Intrinsics.checkNotNullParameter("createAllViewManagers", "sectionName");
        c0.d("createAllViewManagers");
        try {
            if (this.mViewManagers == null) {
                synchronized (this.mPackages) {
                    try {
                        if (this.mViewManagers == null) {
                            ArrayList arrayList = new ArrayList();
                            Iterator<ReactPackage> it = this.mPackages.iterator();
                            while (it.hasNext()) {
                                arrayList.addAll(it.next().createViewManagers(reactApplicationContext));
                            }
                            this.mViewManagers = arrayList;
                            Trace.endSection();
                            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
                            return arrayList;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            List<ViewManager> list = this.mViewManagers;
            Trace.endSection();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
            return list;
        } catch (Throwable th3) {
            Trace.endSection();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
            throw th3;
        }
    }

    public List<ReactPackage> getPackages() {
        return new ArrayList(this.mPackages);
    }

    public Collection<String> getViewManagerNames() {
        Collection<String> collection;
        Intrinsics.checkNotNullParameter("ReactInstanceManager.getViewManagerNames", "sectionName");
        Trace.beginSection(c0.Q("ReactInstanceManager.getViewManagerNames"));
        try {
            Collection<String> collection2 = this.mViewManagerNames;
            if (collection2 != null) {
                Trace.endSection();
                return collection2;
            }
            synchronized (this.mReactContextLock) {
                ReactApplicationContext reactApplicationContext = (ReactApplicationContext) getCurrentReactContext();
                if (reactApplicationContext != null && reactApplicationContext.hasActiveReactInstance()) {
                    synchronized (this.mPackages) {
                        try {
                            if (this.mViewManagerNames == null) {
                                HashSet hashSet = new HashSet();
                                for (ReactPackage reactPackage : this.mPackages) {
                                    e4.c cVarA = m.a("ReactInstanceManager.getViewManagerName");
                                    cVarA.A(reactPackage.getClass().getSimpleName(), "Package");
                                    cVarA.C();
                                    if (reactPackage instanceof ViewManagerOnDemandReactPackage) {
                                        Collection<String> viewManagerNames = ((ViewManagerOnDemandReactPackage) reactPackage).getViewManagerNames(reactApplicationContext);
                                        if (viewManagerNames != null) {
                                            hashSet.addAll(viewManagerNames);
                                        }
                                    } else {
                                        o8.a.x(ReactConstants.TAG, "Package %s is not a ViewManagerOnDemandReactPackage, view managers will not be loaded", reactPackage.getClass().getSimpleName());
                                    }
                                    Trace.endSection();
                                }
                                this.mViewManagerNames = hashSet;
                            }
                            collection = this.mViewManagerNames;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    Trace.endSection();
                    return collection;
                }
                o8.a.v(ReactConstants.TAG, "Calling getViewManagerNames without active context");
                List list = Collections.EMPTY_LIST;
                Trace.endSection();
                return list;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    public void handleCxxError(Exception exc) {
        this.mDevSupportManager.handleException(exc);
    }

    public boolean hasStartedCreatingInitialContext() {
        return this.mHasStartedCreatingInitialContext;
    }

    public void invalidate() {
        o8.a.b(ReactConstants.TAG, "ReactInstanceManager.invalidate()");
        this.mInstanceManagerInvalidated = true;
        destroy();
    }

    public void onActivityResult(Activity activity, int i7, int i10, Intent intent) {
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            currentReactContext.onActivityResult(activity, i7, i10, intent);
        }
    }

    public void onBackPressed() {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContext = this.mCurrentReactContext;
        if (reactContext == null) {
            o8.a.v(TAG, "Instance detached from instance manager");
            invokeDefaultOnBackPressed();
        } else {
            DeviceEventManagerModule deviceEventManagerModule = (DeviceEventManagerModule) reactContext.getNativeModule(DeviceEventManagerModule.class);
            if (deviceEventManagerModule != null) {
                deviceEventManagerModule.emitHardwareBackPressed();
            }
        }
    }

    public void onConfigurationChanged(Context context, Configuration configuration) {
        AppearanceModule appearanceModule;
        UiThreadUtil.assertOnUiThread();
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext == null || (appearanceModule = (AppearanceModule) currentReactContext.getNativeModule(AppearanceModule.class)) == null) {
            return;
        }
        appearanceModule.onConfigurationChanged(context);
    }

    @Deprecated
    public void onHostDestroy() {
        UiThreadUtil.assertOnUiThread();
        if (this.mUseDeveloperSupport) {
            this.mDevSupportManager.setDevSupportEnabled(false);
        }
        moveToBeforeCreateLifecycleState();
        if (this.mKeepActivity) {
            return;
        }
        this.mCurrentActivity = null;
    }

    @Deprecated
    public void onHostPause() {
        UiThreadUtil.assertOnUiThread();
        this.mDefaultBackButtonImpl = null;
        if (this.mUseDeveloperSupport) {
            this.mDevSupportManager.setDevSupportEnabled(false);
        }
        moveToBeforeResumeLifecycleState();
    }

    public void onHostResume(Activity activity, DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler) {
        UiThreadUtil.assertOnUiThread();
        this.mDefaultBackButtonImpl = defaultHardwareBackBtnHandler;
        onHostResume(activity);
    }

    public void onNewIntent(Intent intent) {
        DeviceEventManagerModule deviceEventManagerModule;
        UiThreadUtil.assertOnUiThread();
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext == null) {
            o8.a.v(TAG, "Instance detached from instance manager");
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if (data != null && (("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action)) && (deviceEventManagerModule = (DeviceEventManagerModule) currentReactContext.getNativeModule(DeviceEventManagerModule.class)) != null)) {
            deviceEventManagerModule.emitNewIntentReceived(data);
        }
        currentReactContext.onNewIntent(this.mCurrentActivity, intent);
    }

    public void onUserLeaveHint(Activity activity) {
        Activity activity2 = this.mCurrentActivity;
        if (activity2 == null || activity != activity2) {
            return;
        }
        UiThreadUtil.assertOnUiThread();
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            currentReactContext.onUserLeaveHint(activity);
        }
    }

    public void onWindowFocusChange(boolean z5) {
        UiThreadUtil.assertOnUiThread();
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            currentReactContext.onWindowFocusChange(z5);
        }
    }

    public void recreateReactContextInBackground() {
        io.sentry.config.a.e(this.mHasStartedCreatingInitialContext, "recreateReactContextInBackground should only be called after the initial createReactContextInBackground call.");
        recreateReactContextInBackgroundInner();
    }

    public void removeReactInstanceEventListener(com.facebook.react.ReactInstanceEventListener reactInstanceEventListener) {
        this.mReactInstanceEventListeners.remove(reactInstanceEventListener);
    }

    public synchronized void setUseFallbackBundle(boolean z5) {
        this.mUseFallbackBundle = z5;
    }

    public void showDevOptionsDialog() {
        UiThreadUtil.assertOnUiThread();
        this.mDevSupportManager.showDevOptionsDialog();
    }

    private void recreateReactContextInBackground(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
        o8.a.b(ReactConstants.TAG, "ReactInstanceManager.recreateReactContextInBackground()");
        UiThreadUtil.assertOnUiThread();
        ReactContextInitParams reactContextInitParams = new ReactContextInitParams(javaScriptExecutorFactory, jSBundleLoader);
        if (this.mCreateReactContextThread == null) {
            runCreateReactContextOnNewThread(reactContextInitParams);
        } else {
            this.mPendingReactContextInitParams = reactContextInitParams;
        }
    }

    public void onHostResume(Activity activity) {
        UiThreadUtil.assertOnUiThread();
        this.mCurrentActivity = activity;
        if (this.mUseDeveloperSupport) {
            if (activity != null) {
                final View decorView = activity.getWindow().getDecorView();
                WeakHashMap weakHashMap = u0.f1729a;
                if (!decorView.isAttachedToWindow()) {
                    decorView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.facebook.react.ReactInstanceManager.3
                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View view) {
                            decorView.removeOnAttachStateChangeListener(this);
                            ReactInstanceManager.this.mDevSupportManager.setDevSupportEnabled(true);
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View view) {
                        }
                    });
                } else {
                    this.mDevSupportManager.setDevSupportEnabled(true);
                }
            } else if (!this.mRequireActivity) {
                this.mDevSupportManager.setDevSupportEnabled(true);
            }
        }
        moveToResumedLifecycleState(false);
    }

    @SuppressLint({"ReflectionMethodUse"})
    public void onHostPause(Activity activity) {
        if (this.mRequireActivity) {
            if (this.mCurrentActivity == null) {
                o8.a.g(TAG, "ReactInstanceManager.onHostPause called with null activity");
                for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                    o8.a.g(TAG, stackTraceElement.toString());
                }
            }
            io.sentry.config.a.d(this.mCurrentActivity != null);
        }
        Activity activity2 = this.mCurrentActivity;
        if (activity2 != null && activity != activity2) {
            String str = TAG;
            StringBuilder sb2 = new StringBuilder("Pausing an activity that is not the current activity, this is incorrect! Current activity: ");
            sb2.append(this.mCurrentActivity.getClass().getSimpleName());
            sb2.append(" Paused activity: ");
            sb2.append(activity == null ? "null" : activity.getClass().getSimpleName());
            o8.a.v(str, sb2.toString());
        }
        onHostPause();
    }

    public void onHostDestroy(Activity activity) {
        if (activity == this.mCurrentActivity) {
            onHostDestroy();
        }
    }
}
