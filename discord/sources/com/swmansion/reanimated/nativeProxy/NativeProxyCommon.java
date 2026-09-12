package com.swmansion.reanimated.nativeProxy;

import android.os.SystemClock;
import android.provider.Settings;
import android.util.Log;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.devsupport.interfaces.DevOptionHandler;
import com.facebook.soloader.SoLoader;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import com.swmansion.reanimated.BuildConfig;
import com.swmansion.reanimated.DevMenuUtils;
import com.swmansion.reanimated.NativeProxy;
import com.swmansion.reanimated.NodesManager;
import com.swmansion.reanimated.ReanimatedModule;
import com.swmansion.reanimated.Utils;
import com.swmansion.reanimated.keyboard.KeyboardAnimationManager;
import com.swmansion.reanimated.keyboard.KeyboardWorkletWrapper;
import com.swmansion.reanimated.layoutReanimation.LayoutAnimations;
import com.swmansion.reanimated.sensor.ReanimatedSensorContainer;
import com.swmansion.reanimated.sensor.ReanimatedSensorType;
import com.swmansion.worklets.WorkletsModule;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import jm.j;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeProxyCommon {
    private final gm.a gestureHandlerStateManager;
    private final KeyboardAnimationManager keyboardAnimationManager;
    protected final WeakReference<ReactApplicationContext> mContext;
    protected NodesManager mNodesManager;
    protected final WorkletsModule mWorkletsModule;
    private final ReanimatedSensorContainer reanimatedSensorContainer;
    private Long firstUptime = Long.valueOf(SystemClock.uptimeMillis());
    private boolean slowAnimationsEnabled = false;
    private final int ANIMATIONS_DRAG_FACTOR = 10;
    protected String cppVersion = null;

    static {
        SoLoader.m("reanimated");
    }

    public NativeProxyCommon(ReactApplicationContext reactApplicationContext) {
        ReanimatedModule reanimatedModule = (ReanimatedModule) reactApplicationContext.getNativeModule(ReanimatedModule.class);
        Objects.requireNonNull(reanimatedModule);
        this.mWorkletsModule = reanimatedModule.getWorkletsModule();
        WeakReference<ReactApplicationContext> weakReference = new WeakReference<>(reactApplicationContext);
        this.mContext = weakReference;
        this.reanimatedSensorContainer = new ReanimatedSensorContainer(weakReference);
        this.keyboardAnimationManager = new KeyboardAnimationManager(weakReference);
        addDevMenuOption();
        try {
            j jVar = RNGestureHandlerModule.Companion;
            if (reactApplicationContext.getNativeModule(RNGestureHandlerModule.class) == null) {
            } else {
                throw new ClassCastException();
            }
        } catch (ClassCastException | ClassNotFoundException unused) {
        }
    }

    private void addDevMenuOption() {
        DevMenuUtils.addDevMenuOption(this.mContext.get(), new DevOptionHandler() { // from class: com.swmansion.reanimated.nativeProxy.a
            @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
            public final void onOptionSelected() {
                this.f7126a.toggleSlowAnimations();
            }
        });
    }

    private Set<String> convertProps(ReadableNativeArray readableNativeArray) {
        HashSet hashSet = new HashSet();
        ArrayList<Object> arrayList = readableNativeArray.toArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            hashSet.add((String) arrayList.get(i7));
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleSlowAnimations() {
        boolean z5 = this.slowAnimationsEnabled;
        this.slowAnimationsEnabled = !z5;
        if (!z5) {
            this.firstUptime = Long.valueOf(SystemClock.uptimeMillis());
        }
        this.mNodesManager.enableSlowAnimations(this.slowAnimationsEnabled, 10);
    }

    public void checkCppVersion() {
        if (this.cppVersion == null) {
            throw new RuntimeException("[Reanimated] Java side failed to resolve C++ code version. See https://docs.swmansion.com/react-native-reanimated/docs/guides/troubleshooting#java-side-failed-to-resolve-c-code-version for more information.");
        }
        String reanimatedJavaVersion = getReanimatedJavaVersion();
        if (!this.cppVersion.equals(reanimatedJavaVersion)) {
            throw new RuntimeException(com.discord.chat.presentation.list.a.k(com.discord.chat.presentation.list.a.n("[Reanimated] Mismatch between Java code version and C++ code version (", reanimatedJavaVersion, " vs. "), this.cppVersion, " respectively). See https://docs.swmansion.com/react-native-reanimated/docs/guides/troubleshooting#mismatch-between-java-code-version-and-c-code-version for more information."));
        }
    }

    @xa.a
    public void configureProps(ReadableNativeArray readableNativeArray, ReadableNativeArray readableNativeArray2) {
        this.mNodesManager.configureProps(convertProps(readableNativeArray), convertProps(readableNativeArray2));
    }

    @xa.a
    public void dispatchCommand(int i7, String str, ReadableArray readableArray) {
        this.mNodesManager.dispatchCommand(i7, str, readableArray);
    }

    @xa.a
    public long getAnimationTimestamp() {
        if (!this.slowAnimationsEnabled) {
            return SystemClock.uptimeMillis();
        }
        return ((SystemClock.uptimeMillis() - this.firstUptime.longValue()) / 10) + this.firstUptime.longValue();
    }

    public abstract HybridData getHybridData();

    @xa.a
    public boolean getIsReducedMotion() {
        String string = Settings.Global.getString(this.mContext.get().getContentResolver(), "transition_animation_scale");
        return (string != null ? Float.parseFloat(string) : 1.0f) == 0.0f;
    }

    @xa.a
    public String getReanimatedJavaVersion() {
        return BuildConfig.REANIMATED_VERSION_JAVA;
    }

    public native void installJSIBindings();

    @xa.a
    public void maybeFlushUIUpdatesQueue() {
        if (this.mNodesManager.isAnimationRunning()) {
            return;
        }
        this.mNodesManager.performOperations(false, false);
    }

    @xa.a
    public float[] measure(int i7) {
        return this.mNodesManager.measure(i7);
    }

    @xa.a
    public String obtainProp(int i7, String str) {
        return this.mNodesManager.obtainProp(i7, str);
    }

    public void prepareLayoutAnimations(LayoutAnimations layoutAnimations) {
        if (Utils.isChromeDebugger) {
            Log.w("[REANIMATED]", "You can not use LayoutAnimation with enabled Chrome Debugger");
            return;
        }
        ReanimatedModule reanimatedModule = (ReanimatedModule) this.mContext.get().getNativeModule(ReanimatedModule.class);
        Objects.requireNonNull(reanimatedModule);
        this.mNodesManager = reanimatedModule.getNodesManager();
        ReanimatedModule reanimatedModule2 = (ReanimatedModule) this.mContext.get().getNativeModule(ReanimatedModule.class);
        Objects.requireNonNull(reanimatedModule2);
        reanimatedModule2.getNodesManager().getAnimationsManager().setNativeMethods(NativeProxy.createNativeMethodsHolder(layoutAnimations));
    }

    @xa.a
    public void registerEventHandler(EventHandler eventHandler) {
        eventHandler.mCustomEventNamesResolver = this.mNodesManager.getEventNameResolver();
        this.mNodesManager.registerEventHandler(eventHandler);
    }

    @xa.a
    public int registerSensor(int i7, int i10, SensorSetter sensorSetter) {
        return this.reanimatedSensorContainer.registerSensor(ReanimatedSensorType.getInstanceById(i7), i10, sensorSetter);
    }

    @xa.a
    public void requestRender(AnimationFrameCallback animationFrameCallback) {
        this.mNodesManager.postOnAnimation(animationFrameCallback);
    }

    @xa.a
    public void scrollTo(int i7, double d6, double d7, boolean z5) {
        this.mNodesManager.scrollTo(i7, d6, d7, z5);
    }

    @xa.a
    public void setCppVersion(String str) {
        this.cppVersion = str;
    }

    @xa.a
    public void setGestureState(int i7, int i10) {
    }

    @xa.a
    public int subscribeForKeyboardEvents(KeyboardWorkletWrapper keyboardWorkletWrapper, boolean z5, boolean z6) {
        return this.keyboardAnimationManager.subscribeForKeyboardUpdates(keyboardWorkletWrapper, z5, z6);
    }

    @xa.a
    public void synchronouslyUpdateUIProps(int i7, ReadableMap readableMap) {
        this.mNodesManager.synchronouslyUpdateUIProps(i7, readableMap);
    }

    @xa.a
    public void unregisterSensor(int i7) {
        this.reanimatedSensorContainer.unregisterSensor(i7);
    }

    @xa.a
    public void unsubscribeFromKeyboardEvents(int i7) {
        this.keyboardAnimationManager.unsubscribeFromKeyboardUpdates(i7);
    }

    @xa.a
    public void updateProps(int i7, Map<String, Object> map) {
        this.mNodesManager.updateProps(i7, map);
    }
}
