package com.facebook.react.runtime;

import android.annotation.SuppressLint;
import android.content.res.AssetManager;
import android.os.Trace;
import com.facebook.fbreact.specs.NativeExceptionsManagerSpec;
import com.facebook.jni.HybridData;
import com.facebook.react.DebugCorePackage;
import com.facebook.react.ReactPackage;
import com.facebook.react.ReactPackageTurboModuleManagerDelegate;
import com.facebook.react.ViewManagerOnDemandReactPackage;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSBundleLoaderDelegate;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.MessageQueueThreadSpec;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.bridge.queue.ReactQueueConfigurationImpl;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.common.annotations.FrameworkAPI;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.devsupport.InspectorFlags;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.fabric.AnimationBackendChoreographer;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.FabricUIManagerBinding;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler;
import com.facebook.react.internal.AndroidChoreographerProvider;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.internal.turbomodule.core.TurboModuleManager;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.JavaTimerManager;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.NativeMethodCallInvokerHolderImpl;
import com.facebook.react.uimanager.ComponentNameResolver;
import com.facebook.react.uimanager.ComponentNameResolverBinding;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.UIConstantsProviderBinding;
import com.facebook.react.uimanager.UIManagerConstantsCache;
import com.facebook.react.uimanager.UIManagerModuleConstantsHelper;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ViewManagerRegistry;
import com.facebook.react.uimanager.ViewManagerResolver;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.util.RNLog;
import com.facebook.soloader.SoLoader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mo.c0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u0000 w2\u00020\u0001:\u0003uvwBA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u00101\u001a\u000202J\u000e\u00103\u001a\u0002022\u0006\u00104\u001a\u000205J\u001e\u00106\u001a\u00020\r\"\b\b\u0000\u00107*\u00020*2\f\u00108\u001a\b\u0012\u0004\u0012\u0002H709J%\u0010:\u001a\u0004\u0018\u0001H7\"\b\b\u0000\u00107*\u00020*2\f\u00108\u001a\b\u0012\u0004\u0012\u0002H709¢\u0006\u0002\u0010;J!\u0010:\u001a\u0004\u0018\u0001H7\"\b\b\u0000\u00107*\u00020*2\u0006\u0010<\u001a\u00020=H\u0007¢\u0006\u0002\u0010>J\u0010\u0010?\u001a\u0002022\u0006\u0010@\u001a\u00020AH\u0007J\u0010\u0010B\u001a\u0002022\u0006\u0010@\u001a\u00020AH\u0007J\u0010\u0010C\u001a\u0002022\u0006\u0010@\u001a\u00020AH\u0007J\b\u0010D\u001a\u000202H\u0007JU\u0010E\u001a\u00020\u00132\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020\u00192\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010Q2\u0006\u0010R\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0083 J\u0019\u0010S\u001a\u0002022\u0006\u0010T\u001a\u00020=2\u0006\u0010U\u001a\u00020=H\u0082 J\u0019\u0010V\u001a\u0002022\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020=H\u0082 J\t\u0010Z\u001a\u00020[H\u0086 J\t\u0010\\\u001a\u00020]H\u0082 J\t\u0010^\u001a\u00020_H\u0082 J\t\u0010`\u001a\u00020_H\u0086 J\t\u0010a\u001a\u00020bH\u0082 J\t\u0010c\u001a\u00020dH\u0082 J!\u0010e\u001a\u0002022\u0006\u0010f\u001a\u00020=2\u0006\u0010g\u001a\u00020=2\u0006\u0010h\u001a\u00020iH\u0086 J\u0019\u0010j\u001a\u0002022\u0006\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020=H\u0082 J\u0011\u0010n\u001a\u0002022\u0006\u0010o\u001a\u00020lH\u0082 J\t\u0010p\u001a\u000202H\u0087 J\u000e\u0010q\u001a\u0002022\u0006\u0010r\u001a\u00020lJ\u0016\u0010s\u001a\u0002022\u0006\u0010k\u001a\u00020l2\u0006\u0010t\u001a\u00020=R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u0006x"}, d2 = {"Lcom/facebook/react/runtime/ReactInstance;", "", "context", "Lcom/facebook/react/runtime/BridgelessReactContext;", "delegate", "Lcom/facebook/react/runtime/ReactHostDelegate;", "componentFactory", "Lcom/facebook/react/fabric/ComponentFactory;", "devSupportManager", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "exceptionHandler", "Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;", "useDevSupport", "", "reactHostInspectorTarget", "Lcom/facebook/react/runtime/ReactHostInspectorTarget;", "<init>", "(Lcom/facebook/react/runtime/BridgelessReactContext;Lcom/facebook/react/runtime/ReactHostDelegate;Lcom/facebook/react/fabric/ComponentFactory;Lcom/facebook/react/devsupport/interfaces/DevSupportManager;Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;ZLcom/facebook/react/runtime/ReactHostInspectorTarget;)V", "mHybridData", "Lcom/facebook/jni/HybridData;", "getMHybridData$annotations", "()V", "turboModuleManager", "Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;", "javaTimerManager", "Lcom/facebook/react/modules/core/JavaTimerManager;", "viewManagerResolver", "Lcom/facebook/react/runtime/ReactInstance$BridgelessViewManagerResolver;", "reactQueueConfiguration", "Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;", "getReactQueueConfiguration", "()Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;", "fabricUIManager", "Lcom/facebook/react/fabric/FabricUIManager;", "getFabricUIManager", "()Lcom/facebook/react/fabric/FabricUIManager;", "javaScriptContextHolder", "Lcom/facebook/react/bridge/JavaScriptContextHolder;", "getJavaScriptContextHolder", "()Lcom/facebook/react/bridge/JavaScriptContextHolder;", "nativeModules", "", "Lcom/facebook/react/bridge/NativeModule;", "getNativeModules", "()Ljava/util/Collection;", "eventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "getEventDispatcher", "()Lcom/facebook/react/uimanager/events/EventDispatcher;", "initializeEagerTurboModules", "", "loadJSBundle", "bundleLoader", "Lcom/facebook/react/bridge/JSBundleLoader;", "hasNativeModule", "T", "nativeModuleInterface", "Ljava/lang/Class;", "getNativeModule", "(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;", "nativeModuleName", "", "(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;", "prerenderSurface", "surface", "Lcom/facebook/react/runtime/ReactSurfaceImpl;", "startSurface", "stopSurface", "destroy", "initHybrid", "jsRuntimeFactory", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "jsMessageQueueThread", "Lcom/facebook/react/bridge/queue/MessageQueueThread;", "nativeModulesMessageQueueThread", "timerManager", "jsTimerExecutor", "Lcom/facebook/react/runtime/JSTimerExecutor;", "jReactExceptionsManager", "Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler;", "jBindingsInstaller", "Lcom/facebook/react/runtime/BindingsInstaller;", "isProfiling", "loadJSBundleFromFile", "fileName", "sourceURL", "loadJSBundleFromAssets", "assetManager", "Landroid/content/res/AssetManager;", "assetURL", "getJSCallInvokerHolder", "Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;", "getNativeMethodCallInvokerHolder", "Lcom/facebook/react/turbomodule/core/NativeMethodCallInvokerHolderImpl;", "getUnbufferedRuntimeExecutor", "Lcom/facebook/react/bridge/RuntimeExecutor;", "getBufferedRuntimeExecutor", "getRuntimeScheduler", "Lcom/facebook/react/bridge/RuntimeScheduler;", "getJavaScriptContext", "", "callFunctionOnModule", "moduleName", "methodName", "args", "Lcom/facebook/react/bridge/NativeArray;", "registerSegmentNative", "segmentId", "", "segmentPath", "handleMemoryPressureJs", "pressureLevel", "unregisterFromInspector", "handleMemoryPressure", "level", "registerSegment", "path", "ReactJsExceptionHandlerImpl", "BridgelessViewManagerResolver", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@xa.a
@FrameworkAPI
@UnstableReactNativeAPI
public final class ReactInstance {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG;

    @NotNull
    private final BridgelessReactContext context;

    @NotNull
    private final FabricUIManager fabricUIManager;

    @NotNull
    private final JavaScriptContextHolder javaScriptContextHolder;

    @NotNull
    private final JavaTimerManager javaTimerManager;

    @xa.a
    @NotNull
    private final HybridData mHybridData;

    @NotNull
    private final ReactQueueConfiguration reactQueueConfiguration;

    @NotNull
    private final TurboModuleManager turboModuleManager;

    @NotNull
    private final BridgelessViewManagerResolver viewManagerResolver;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010$\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\r\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016J\u0018\u0010\u0016\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000bR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f0\u0012X\u0082.¢\u0006\u0002\n\u0000R%\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f0\u00128F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00108F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/runtime/ReactInstance$BridgelessViewManagerResolver;", "Lcom/facebook/react/uimanager/ViewManagerResolver;", "reactPackages", "", "Lcom/facebook/react/ReactPackage;", "context", "Lcom/facebook/react/runtime/BridgelessReactContext;", "<init>", "(Ljava/util/List;Lcom/facebook/react/runtime/BridgelessReactContext;)V", "lazyViewManagerMap", "", "", "Lcom/facebook/react/uimanager/ViewManager;", "getViewManager", "viewManagerName", "getViewManagerNames", "", "_eagerViewManagerMap", "", "eagerViewManagerMap", "getEagerViewManagerMap", "()Ljava/util/Map;", "getLazyViewManager", "lazyViewManagerNames", "getLazyViewManagerNames", "()Ljava/util/Collection;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BridgelessViewManagerResolver implements ViewManagerResolver {
        private Map<String, ? extends ViewManager<?, ?>> _eagerViewManagerMap;

        @NotNull
        private final BridgelessReactContext context;

        @NotNull
        private final Map<String, ViewManager<?, ?>> lazyViewManagerMap;

        @NotNull
        private final List<ReactPackage> reactPackages;

        /* JADX WARN: Multi-variable type inference failed */
        public BridgelessViewManagerResolver(@NotNull List<? extends ReactPackage> reactPackages, @NotNull BridgelessReactContext context) {
            Intrinsics.checkNotNullParameter(reactPackages, "reactPackages");
            Intrinsics.checkNotNullParameter(context, "context");
            this.reactPackages = reactPackages;
            this.context = context;
            this.lazyViewManagerMap = new HashMap();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final synchronized Map<String, ViewManager<?, ?>> getEagerViewManagerMap() {
            Map map = this._eagerViewManagerMap;
            Map map2 = map;
            if (map != null) {
                if (map == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("_eagerViewManagerMap");
                    map2 = null;
                }
                return map2;
            }
            HashMap map3 = new HashMap();
            for (ReactPackage reactPackage : this.reactPackages) {
                if (!(reactPackage instanceof ViewManagerOnDemandReactPackage)) {
                    for (ViewManager viewManager : reactPackage.createViewManagers(this.context)) {
                        map3.put(viewManager.getName(), viewManager);
                    }
                }
            }
            this._eagerViewManagerMap = map3;
            return map3;
        }

        public final synchronized ViewManager<?, ?> getLazyViewManager(@NotNull String viewManagerName) {
            ViewManager<?, ?> viewManagerCreateViewManager;
            Intrinsics.checkNotNullParameter(viewManagerName, "viewManagerName");
            if (this.lazyViewManagerMap.containsKey(viewManagerName)) {
                return this.lazyViewManagerMap.get(viewManagerName);
            }
            for (ReactPackage reactPackage : this.reactPackages) {
                if ((reactPackage instanceof ViewManagerOnDemandReactPackage) && (viewManagerCreateViewManager = ((ViewManagerOnDemandReactPackage) reactPackage).createViewManager(this.context, viewManagerName)) != null) {
                    this.lazyViewManagerMap.put(viewManagerName, viewManagerCreateViewManager);
                    return viewManagerCreateViewManager;
                }
            }
            return null;
        }

        @NotNull
        public final synchronized Collection<String> getLazyViewManagerNames() {
            HashSet hashSet;
            try {
                hashSet = new HashSet();
                for (ReactPackage reactPackage : this.reactPackages) {
                    if (reactPackage instanceof ViewManagerOnDemandReactPackage) {
                        Collection<String> viewManagerNames = ((ViewManagerOnDemandReactPackage) reactPackage).getViewManagerNames(this.context);
                        if (viewManagerNames == null) {
                            RNLog.w(this.context, "The ReactPackage called: `" + reactPackage.getClass().getSimpleName() + "` is returning null for getViewManagerNames(). This is violating the signature of the method. That method should be updated to return an empty collection.");
                        } else {
                            hashSet.addAll(viewManagerNames);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return hashSet;
        }

        @Override // com.facebook.react.uimanager.ViewManagerResolver
        public ViewManager<?, ?> getViewManager(@NotNull String viewManagerName) {
            Intrinsics.checkNotNullParameter(viewManagerName, "viewManagerName");
            ViewManager<?, ?> lazyViewManager = getLazyViewManager(viewManagerName);
            return lazyViewManager != null ? lazyViewManager : getEagerViewManagerMap().get(viewManagerName);
        }

        @Override // com.facebook.react.uimanager.ViewManagerResolver
        @NotNull
        public Collection<String> getViewManagerNames() {
            HashSet hashSet = new HashSet();
            hashSet.addAll(getLazyViewManagerNames());
            hashSet.addAll(getEagerViewManagerMap().keySet());
            return hashSet;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JH\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\u001c\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\b\u0000\u0012\u00020\u000b\u0012\u0006\b\u0000\u0012\u00020\u000b0\n0\t2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007H\u0002J,\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/runtime/ReactInstance$Companion;", "", "<init>", "()V", "TAG", "", "createConstants", "", "viewManagers", "", "Lcom/facebook/react/uimanager/ViewManager;", "", "customDirectEvents", "getConstantsForViewManager", "Lcom/facebook/react/bridge/NativeMap;", "viewManager", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, Object> createConstants(List<? extends ViewManager> viewManagers, Map<String, Object> customDirectEvents) {
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
            e4.c cVarA = xr.m.a("CreateUIManagerConstants");
            cVarA.A(Boolean.FALSE, "Lazy");
            cVarA.C();
            try {
                return UIManagerModuleConstantsHelper.internal_createConstants(viewManagers, null, customDirectEvents);
            } finally {
                Trace.endSection();
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final NativeMap getConstantsForViewManager(ViewManager<?, ?> viewManager, Map<String, Object> customDirectEvents) {
            e4.c cVarA = xr.m.a("ReactInstance.getConstantsForViewManager");
            String name = viewManager.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            cVarA.A(name, "ViewManager");
            cVarA.A(Boolean.TRUE, "Lazy");
            cVarA.C();
            try {
                return Arguments.makeNativeMap((Map<String, ? extends Object>) UIManagerModuleConstantsHelper.internal_createConstantsForViewManager(viewManager, null, null, null, customDirectEvents));
            } finally {
                Trace.endSection();
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/facebook/react/runtime/ReactInstance$ReactJsExceptionHandlerImpl;", "Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler;", "queueThreadExceptionHandler", "Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;", "<init>", "(Lcom/facebook/react/runtime/ReactInstance;Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;)V", "reportJsException", "", "errorMap", "Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ProcessedError;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ReactJsExceptionHandlerImpl implements ReactJsExceptionHandler {

        @NotNull
        private final QueueThreadExceptionHandler queueThreadExceptionHandler;
        final /* synthetic */ ReactInstance this$0;

        public ReactJsExceptionHandlerImpl(@NotNull ReactInstance reactInstance, QueueThreadExceptionHandler queueThreadExceptionHandler) {
            Intrinsics.checkNotNullParameter(queueThreadExceptionHandler, "queueThreadExceptionHandler");
            this.this$0 = reactInstance;
            this.queueThreadExceptionHandler = queueThreadExceptionHandler;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler
        public void reportJsException(@NotNull ReactJsExceptionHandler.ProcessedError errorMap) {
            Intrinsics.checkNotNullParameter(errorMap, "errorMap");
            JavaOnlyMap javaOnlyMapConvertProcessedError$ReactAndroid_release = StackTraceHelper.convertProcessedError$ReactAndroid_release(errorMap);
            try {
                NativeModule nativeModule = this.this$0.getNativeModule("ExceptionsManager");
                if (nativeModule == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ((NativeExceptionsManagerSpec) nativeModule).reportException(javaOnlyMapConvertProcessedError$ReactAndroid_release);
            } catch (Exception e10) {
                this.queueThreadExceptionHandler.handleException(e10);
            }
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue("ReactInstance", "getSimpleName(...)");
        TAG = "ReactInstance";
        SoLoader.m("rninstance");
    }

    public ReactInstance(@NotNull BridgelessReactContext context, @NotNull ReactHostDelegate delegate, @NotNull ComponentFactory componentFactory, @NotNull DevSupportManager devSupportManager, @NotNull QueueThreadExceptionHandler exceptionHandler, boolean z5, ReactHostInspectorTarget reactHostInspectorTarget) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(componentFactory, "componentFactory");
        Intrinsics.checkNotNullParameter(devSupportManager, "devSupportManager");
        Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
        this.context = context;
        Intrinsics.checkNotNullParameter("ReactInstance.initialize", "sectionName");
        Trace.beginSection(c0.Q("ReactInstance.initialize"));
        MessageQueueThreadSpec.Companion companion = MessageQueueThreadSpec.INSTANCE;
        ReactQueueConfigurationImpl reactQueueConfigurationImplCreate = ReactQueueConfigurationImpl.INSTANCE.create(new ReactQueueConfigurationSpec(companion.newBackgroundThreadSpec("v_native"), companion.newBackgroundThreadSpec("v_js")), exceptionHandler);
        this.reactQueueConfiguration = reactQueueConfigurationImplCreate;
        o8.a.b(TAG, "Calling initializeMessageQueueThreads()");
        context.initializeMessageQueueThreads(reactQueueConfigurationImplCreate);
        MessageQueueThread jSQueueThread = reactQueueConfigurationImplCreate.getJSQueueThread();
        MessageQueueThread nativeModulesQueueThread = reactQueueConfigurationImplCreate.getNativeModulesQueueThread();
        ReactChoreographer.Companion companion2 = ReactChoreographer.INSTANCE;
        companion2.initialize(AndroidChoreographerProvider.getInstance());
        devSupportManager.startInspector();
        JSTimerExecutor jSTimerExecutor = new JSTimerExecutor();
        JavaTimerManager javaTimerManager = new JavaTimerManager(context, jSTimerExecutor, companion2.getInstance(), devSupportManager);
        this.javaTimerManager = javaTimerManager;
        this.mHybridData = initHybrid(delegate.getJsRuntimeFactory(), jSQueueThread, nativeModulesQueueThread, javaTimerManager, jSTimerExecutor, new ReactJsExceptionHandlerImpl(this, exceptionHandler), delegate.getBindingsInstaller(), InspectorFlags.getIsProfilingBuild(), reactHostInspectorTarget);
        this.javaScriptContextHolder = new JavaScriptContextHolder(getJavaScriptContext());
        Intrinsics.checkNotNullParameter("ReactInstance.initialize#initTurboModules", "sectionName");
        Trace.beginSection(c0.Q("ReactInstance.initialize#initTurboModules"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CoreReactPackage(context.getDevSupportManager(), context.getDefaultHardwareBackBtnHandler()));
        if (z5) {
            arrayList.add(new DebugCorePackage());
        }
        arrayList.addAll(delegate.getReactPackages());
        ReactPackageTurboModuleManagerDelegate reactPackageTurboModuleManagerDelegateBuild = delegate.getTurboModuleManagerDelegateBuilder().setPackages(arrayList).setReactApplicationContext(context).build();
        RuntimeExecutor unbufferedRuntimeExecutor = getUnbufferedRuntimeExecutor();
        this.turboModuleManager = new TurboModuleManager(unbufferedRuntimeExecutor, reactPackageTurboModuleManagerDelegateBuild, getJSCallInvokerHolder(), getNativeMethodCallInvokerHolder());
        Trace.endSection();
        Intrinsics.checkNotNullParameter("ReactInstance.initialize#initFabric", "sectionName");
        Trace.beginSection(c0.Q("ReactInstance.initialize#initFabric"));
        BridgelessViewManagerResolver bridgelessViewManagerResolver = new BridgelessViewManagerResolver(arrayList, context);
        this.viewManagerResolver = bridgelessViewManagerResolver;
        ComponentNameResolverBinding.install(unbufferedRuntimeExecutor, new ComponentNameResolver() { // from class: com.facebook.react.runtime.ReactInstance.1
            @Override // com.facebook.react.uimanager.ComponentNameResolver
            public String[] getComponentNames() {
                Collection<String> viewManagerNames = ReactInstance.this.viewManagerResolver.getViewManagerNames();
                if (!viewManagerNames.isEmpty()) {
                    return (String[]) viewManagerNames.toArray(new String[0]);
                }
                o8.a.g(ReactInstance.TAG, "No ViewManager names found");
                return new String[0];
            }
        });
        if (ReactNativeFeatureFlags.useNativeViewConfigsInBridgelessMode()) {
            HashMap map = new HashMap();
            UIConstantsProviderBinding.install(unbufferedRuntimeExecutor, new com.facebook.react.a(5), new s(this, map), new s(this, map));
        }
        EventBeatManager eventBeatManager = new EventBeatManager();
        FabricUIManager fabricUIManager = new FabricUIManager(context, new ViewManagerRegistry(bridgelessViewManagerResolver), eventBeatManager);
        this.fabricUIManager = fabricUIManager;
        DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(context);
        new FabricUIManagerBinding().register(getBufferedRuntimeExecutor(), getRuntimeScheduler(), fabricUIManager, eventBeatManager, componentFactory, new AnimationBackendChoreographer(context));
        fabricUIManager.initialize();
        Trace.endSection();
        Trace.endSection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeMap _init_$lambda$0() {
        return Arguments.makeNativeMap((Map<String, ? extends Object>) UIManagerModuleConstantsHelper.getDefaultExportableEventTypes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeMap _init_$lambda$1(ReactInstance reactInstance, Map map, String viewManagerName) {
        Intrinsics.checkNotNullParameter(viewManagerName, "viewManagerName");
        ViewManager<?, ?> viewManager = reactInstance.viewManagerResolver.getViewManager(viewManagerName);
        if (viewManager == null) {
            return null;
        }
        return INSTANCE.getConstantsForViewManager(viewManager, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeMap _init_$lambda$3(ReactInstance reactInstance, Map map) {
        WritableNativeMap uIManagerConstantsAsWritableMap = UIManagerConstantsCache.getInstance().getUIManagerConstantsAsWritableMap();
        if (uIManagerConstantsAsWritableMap != null) {
            return uIManagerConstantsAsWritableMap;
        }
        Map mapCreateConstants = INSTANCE.createConstants(new ArrayList(reactInstance.viewManagerResolver.getEagerViewManagerMap().values()), map);
        Collection<String> lazyViewManagerNames = reactInstance.viewManagerResolver.getLazyViewManagerNames();
        if (!lazyViewManagerNames.isEmpty()) {
            mapCreateConstants.put("ViewManagerNames", new ArrayList(lazyViewManagerNames));
            mapCreateConstants.put("LazyViewManagersEnabled", Boolean.TRUE);
        }
        return Arguments.makeNativeMap((Map<String, ? extends Object>) mapCreateConstants);
    }

    private final native long getJavaScriptContext();

    private static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native NativeMethodCallInvokerHolderImpl getNativeMethodCallInvokerHolder();

    private final native RuntimeScheduler getRuntimeScheduler();

    private final native RuntimeExecutor getUnbufferedRuntimeExecutor();

    private final native void handleMemoryPressureJs(int pressureLevel);

    @xa.a
    private final native HybridData initHybrid(JSRuntimeFactory jsRuntimeFactory, MessageQueueThread jsMessageQueueThread, MessageQueueThread nativeModulesMessageQueueThread, JavaTimerManager timerManager, JSTimerExecutor jsTimerExecutor, ReactJsExceptionHandler jReactExceptionsManager, BindingsInstaller jBindingsInstaller, boolean isProfiling, ReactHostInspectorTarget reactHostInspectorTarget);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initializeEagerTurboModules$lambda$4(ReactInstance reactInstance) {
        Intrinsics.checkNotNullParameter("initializeEagerTurboModules", "sectionName");
        c0.d("initializeEagerTurboModules");
        Iterator<String> it = reactInstance.turboModuleManager.getEagerInitModuleNames().iterator();
        while (it.hasNext()) {
            reactInstance.turboModuleManager.getModule(it.next());
        }
        Trace.endSection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native void loadJSBundleFromAssets(AssetManager assetManager, String assetURL);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void loadJSBundleFromFile(String fileName, String sourceURL);

    private final native void registerSegmentNative(int segmentId, String segmentPath);

    public final native void callFunctionOnModule(@NotNull String moduleName, @NotNull String methodName, @NotNull NativeArray args);

    public final void destroy() {
        o8.a.b(TAG, "ReactInstance.destroy() is called.");
        this.reactQueueConfiguration.destroy();
        this.turboModuleManager.invalidate();
        this.fabricUIManager.invalidate();
        this.javaTimerManager.onInstanceDestroy();
        this.mHybridData.resetNative();
        this.javaScriptContextHolder.clear();
    }

    @NotNull
    public final native RuntimeExecutor getBufferedRuntimeExecutor();

    @NotNull
    public final EventDispatcher getEventDispatcher() {
        EventDispatcher eventDispatcher = this.fabricUIManager.getEventDispatcher();
        Intrinsics.checkNotNullExpressionValue(eventDispatcher, "<get-eventDispatcher>(...)");
        return eventDispatcher;
    }

    @NotNull
    public final FabricUIManager getFabricUIManager() {
        return this.fabricUIManager;
    }

    @NotNull
    public final native CallInvokerHolderImpl getJSCallInvokerHolder();

    @NotNull
    public final JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.javaScriptContextHolder;
    }

    public final <T extends NativeModule> T getNativeModule(@NotNull Class<T> nativeModuleInterface) {
        Intrinsics.checkNotNullParameter(nativeModuleInterface, "nativeModuleInterface");
        ReactModule reactModule = (ReactModule) nativeModuleInterface.getAnnotation(ReactModule.class);
        if (reactModule != null) {
            return (T) getNativeModule(reactModule.name());
        }
        return null;
    }

    @NotNull
    public final Collection<NativeModule> getNativeModules() {
        return this.turboModuleManager.getModules();
    }

    @NotNull
    public final ReactQueueConfiguration getReactQueueConfiguration() {
        return this.reactQueueConfiguration;
    }

    public final void handleMemoryPressure(int level) {
        try {
            handleMemoryPressureJs(level);
        } catch (NullPointerException unused) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Native method handleMemoryPressureJs is called earlier than librninstance.so got ready."));
        }
    }

    public final <T extends NativeModule> boolean hasNativeModule(@NotNull Class<T> nativeModuleInterface) {
        Intrinsics.checkNotNullParameter(nativeModuleInterface, "nativeModuleInterface");
        ReactModule reactModule = (ReactModule) nativeModuleInterface.getAnnotation(ReactModule.class);
        if (reactModule != null) {
            return this.turboModuleManager.hasModule(reactModule.name());
        }
        return false;
    }

    public final void initializeEagerTurboModules() {
        this.reactQueueConfiguration.getNativeModulesQueueThread().runOnQueue(new am.c(23, this));
    }

    public final void loadJSBundle(@NotNull JSBundleLoader bundleLoader) {
        Intrinsics.checkNotNullParameter(bundleLoader, "bundleLoader");
        Intrinsics.checkNotNullParameter("ReactInstance.loadJSBundle", "sectionName");
        c0.d("ReactInstance.loadJSBundle");
        bundleLoader.loadScript(new JSBundleLoaderDelegate() { // from class: com.facebook.react.runtime.ReactInstance.loadJSBundle.1
            @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
            public void loadScriptFromAssets(AssetManager assetManager, String assetURL, boolean loadSynchronously) {
                Intrinsics.checkNotNullParameter(assetManager, "assetManager");
                Intrinsics.checkNotNullParameter(assetURL, "assetURL");
                ReactInstance.this.context.setSourceURL(assetURL);
                ReactInstance.this.loadJSBundleFromAssets(assetManager, assetURL);
            }

            @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
            public void loadScriptFromFile(String fileName, String sourceURL, boolean loadSynchronously) {
                Intrinsics.checkNotNullParameter(fileName, "fileName");
                Intrinsics.checkNotNullParameter(sourceURL, "sourceURL");
                ReactInstance.this.context.setSourceURL(sourceURL);
                ReactInstance.this.loadJSBundleFromFile(fileName, sourceURL);
            }

            @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
            public void loadSplitBundleFromFile(String fileName, String sourceURL) {
                Intrinsics.checkNotNullParameter(fileName, "fileName");
                Intrinsics.checkNotNullParameter(sourceURL, "sourceURL");
                ReactInstance.this.loadJSBundleFromFile(fileName, sourceURL);
            }

            @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
            public void setSourceURLs(String deviceURL, String remoteURL) {
                Intrinsics.checkNotNullParameter(deviceURL, "deviceURL");
                Intrinsics.checkNotNullParameter(remoteURL, "remoteURL");
                ReactInstance.this.context.setSourceURL(deviceURL);
            }
        });
        Trace.endSection();
    }

    public final void prerenderSurface(@NotNull ReactSurfaceImpl surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Intrinsics.checkNotNullParameter("ReactInstance.prerenderSurface", "sectionName");
        c0.d("ReactInstance.prerenderSurface");
        o8.a.b(TAG, "call prerenderSurface with surface: " + surface.getModuleName());
        this.fabricUIManager.startSurface(surface.getSurfaceHandler(), surface.getContext(), null);
        Trace.endSection();
    }

    public final void registerSegment(int segmentId, @NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        registerSegmentNative(segmentId, path);
    }

    public final void startSurface(@NotNull ReactSurfaceImpl surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        String str = TAG;
        o8.a.b(str, "startSurface() is called with surface: " + surface.getSurfaceID());
        Intrinsics.checkNotNullParameter("ReactInstance.startSurface", "sectionName");
        c0.d("ReactInstance.startSurface");
        ReactSurfaceView view = surface.getView();
        if (view == null) {
            throw new IllegalStateException("Starting surface without a view is not supported, use prerenderSurface instead.");
        }
        if (view.getId() != -1) {
            ReactSoftExceptionLogger.logSoftException(str, new IllegalViewOperationException("surfaceView's is NOT equal to View.NO_ID before calling startSurface."));
            view.setId(-1);
        }
        if (surface.isRunning()) {
            this.fabricUIManager.attachRootView(surface.getSurfaceHandler(), view);
        } else {
            this.fabricUIManager.startSurface(surface.getSurfaceHandler(), surface.getContext(), view);
        }
        Trace.endSection();
    }

    public final void stopSurface(@NotNull ReactSurfaceImpl surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        o8.a.b(TAG, "stopSurface() is called with surface: " + surface.getSurfaceID());
        this.fabricUIManager.stopSurface(surface.getSurfaceHandler());
    }

    public final native void unregisterFromInspector();

    @SuppressLint({"KotlinGenericsCast"})
    public final <T extends NativeModule> T getNativeModule(@NotNull String nativeModuleName) {
        T t5;
        Intrinsics.checkNotNullParameter(nativeModuleName, "nativeModuleName");
        synchronized (this.turboModuleManager) {
            t5 = (T) this.turboModuleManager.getModule(nativeModuleName);
        }
        return t5;
    }
}
