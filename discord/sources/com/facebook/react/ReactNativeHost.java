package com.facebook.react;

import android.app.Application;
import android.content.Context;
import com.discord.bundle_updater.BundleUpdater;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.common.SurfaceDelegate;
import com.facebook.react.common.SurfaceDelegateFactory;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.devsupport.DevSupportManagerFactory;
import com.facebook.react.devsupport.interfaces.DevLoadingViewManager;
import com.facebook.react.devsupport.interfaces.PausedInDebuggerOverlayManager;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import com.facebook.react.internal.ChoreographerProvider;
import com.facebook.react.runtime.ReactSurfaceImpl;
import com.facebook.react.runtime.ReactSurfaceView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated(since = "This class is part of Legacy Architecture and will be removed in a future release")
public abstract class ReactNativeHost {
    private final Application mApplication;
    private ReactInstanceManager mReactInstanceManager;

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("ReactNativeHost", LegacyArchitectureLogLevel.ERROR);
    }

    public ReactNativeHost(Application application) {
        this.mApplication = application;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ UIManager lambda$getUIManagerProvider$0(ReactApplicationContext reactApplicationContext) {
        return null;
    }

    public synchronized void clear() {
        ReactInstanceManager reactInstanceManager = this.mReactInstanceManager;
        if (reactInstanceManager != null) {
            reactInstanceManager.invalidate();
            this.mReactInstanceManager = null;
        }
    }

    public ReactInstanceManager createReactInstanceManager() {
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_START);
        ReactInstanceManagerBuilder baseReactInstanceManagerBuilder = getBaseReactInstanceManagerBuilder();
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_END);
        return baseReactInstanceManagerBuilder.build();
    }

    public ReactSurfaceView createReactSurfaceView(Context context, ReactSurfaceImpl reactSurfaceImpl) {
        return new ReactSurfaceView(context, reactSurfaceImpl);
    }

    public final Application getApplication() {
        return this.mApplication;
    }

    public ReactInstanceManagerBuilder getBaseReactInstanceManagerBuilder() {
        ReactInstanceManagerBuilder pausedInDebuggerOverlayManager = ReactInstanceManager.builder().setApplication(this.mApplication).setJSMainModulePath(getJSMainModuleName()).setUseDeveloperSupport(getUseDeveloperSupport()).setDevSupportManagerFactory(getDevSupportManagerFactory()).setDevLoadingViewManager(getDevLoadingViewManager()).setRequireActivity(getShouldRequireActivity()).setSurfaceDelegateFactory(getSurfaceDelegateFactory()).setJSExceptionHandler(getJSExceptionHandler()).setLazyViewManagersEnabled(getLazyViewManagersEnabled()).setRedBoxHandler(getRedBoxHandler()).setJavaScriptExecutorFactory(getJavaScriptExecutorFactory()).setUIManagerProvider(getUIManagerProvider()).setInitialLifecycleState(LifecycleState.BEFORE_CREATE).setReactPackageTurboModuleManagerDelegateBuilder(getReactPackageTurboModuleManagerDelegateBuilder()).setChoreographerProvider(getChoreographerProvider()).setPausedInDebuggerOverlayManager(getPausedInDebuggerOverlayManager());
        Iterator<ReactPackage> it = getPackages().iterator();
        while (it.hasNext()) {
            pausedInDebuggerOverlayManager.addPackage(it.next());
        }
        String jSBundleFile = getJSBundleFile();
        if (jSBundleFile != null) {
            pausedInDebuggerOverlayManager.setJSBundleFile(jSBundleFile);
            return pausedInDebuggerOverlayManager;
        }
        String bundleAssetName = getBundleAssetName();
        io.sentry.config.a.f(bundleAssetName);
        pausedInDebuggerOverlayManager.setBundleAssetName(bundleAssetName);
        return pausedInDebuggerOverlayManager;
    }

    public String getBundleAssetName() {
        return BundleUpdater.ANDROID_JS_BUNDLE_ASSET_NAME;
    }

    public ChoreographerProvider getChoreographerProvider() {
        return null;
    }

    public DevLoadingViewManager getDevLoadingViewManager() {
        return null;
    }

    public DevSupportManagerFactory getDevSupportManagerFactory() {
        return null;
    }

    public String getJSBundleFile() {
        return null;
    }

    public JSExceptionHandler getJSExceptionHandler() {
        return null;
    }

    public String getJSMainModuleName() {
        return "index.android";
    }

    public JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
        return null;
    }

    public boolean getLazyViewManagersEnabled() {
        return false;
    }

    public abstract List<ReactPackage> getPackages();

    public PausedInDebuggerOverlayManager getPausedInDebuggerOverlayManager() {
        return null;
    }

    public synchronized ReactInstanceManager getReactInstanceManager() {
        try {
            if (this.mReactInstanceManager == null) {
                ReactMarker.logMarker(ReactMarkerConstants.INIT_REACT_RUNTIME_START);
                ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_START);
                this.mReactInstanceManager = createReactInstanceManager();
                ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_END);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.mReactInstanceManager;
    }

    public ReactPackageTurboModuleManagerDelegate.Builder getReactPackageTurboModuleManagerDelegateBuilder() {
        return null;
    }

    public RedBoxHandler getRedBoxHandler() {
        return null;
    }

    public boolean getShouldRequireActivity() {
        return true;
    }

    public SurfaceDelegateFactory getSurfaceDelegateFactory() {
        return new SurfaceDelegateFactory(this) { // from class: com.facebook.react.ReactNativeHost.1
            @Override // com.facebook.react.common.SurfaceDelegateFactory
            public SurfaceDelegate createSurfaceDelegate(String str) {
                return null;
            }
        };
    }

    public UIManagerProvider getUIManagerProvider() {
        return new a(1);
    }

    public abstract boolean getUseDeveloperSupport();

    public synchronized boolean hasInstance() {
        return this.mReactInstanceManager != null;
    }
}
