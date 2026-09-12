package com.facebook.react;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.facebook.hermes.reactexecutor.HermesExecutor;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.common.SurfaceDelegateFactory;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.devsupport.DefaultDevSupportManagerFactory;
import com.facebook.react.devsupport.DevSupportManagerFactory;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.DevLoadingViewManager;
import com.facebook.react.devsupport.interfaces.PausedInDebuggerOverlayManager;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import com.facebook.react.internal.ChoreographerProvider;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import com.facebook.react.packagerconnection.RequestHandler;
import io.sentry.hints.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 a2\u00020\u0001:\u0001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u00105\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\"J\u0010\u00106\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010'J\u0010\u00107\u001a\u00020\u00002\b\u00108\u001a\u0004\u0018\u00010\bJ\u000e\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\bJ\u000e\u0010;\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010<\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0006J\u0014\u0010?\u001a\u00020\u00002\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00060AJ\u000e\u0010B\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u0019J\u000e\u0010E\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010F\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010G\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u000e\u0010H\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000fJ\u000e\u0010I\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000fJ\u0010\u0010J\u001a\u00020\u00002\b\u0010-\u001a\u0004\u0018\u00010.J\u0010\u0010K\u001a\u00020\u00002\b\u0010/\u001a\u0004\u0018\u000100J\u0010\u0010L\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u000104J\u000e\u0010M\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010N\u001a\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010\u0017J\u0010\u0010P\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u000e\u0010Q\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u000fJ\u0010\u0010R\u001a\u00020\u00002\b\u0010S\u001a\u0004\u0018\u00010 J\u000e\u0010T\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$J\u000e\u0010U\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$J\u001c\u0010V\u001a\u00020\u00002\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020*\u0018\u00010)J\u0010\u0010W\u001a\u00020\u00002\b\u0010X\u001a\u0004\u0018\u00010,J\u0010\u0010Y\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u000102J\u0006\u0010Z\u001a\u00020[J\"\u0010\\\u001a\u0004\u0018\u00010\"2\u0006\u0010]\u001a\u00020\b2\u0006\u0010^\u001a\u00020\b2\u0006\u0010_\u001a\u00020`H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020*\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000104X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006b"}, d2 = {"Lcom/facebook/react/ReactInstanceManagerBuilder;", "", "<init>", "()V", "packages", "", "Lcom/facebook/react/ReactPackage;", "jsBundleAssetUrl", "", "jsBundleLoader", "Lcom/facebook/react/bridge/JSBundleLoader;", "jsMainModulePath", "application", "Landroid/app/Application;", "useDeveloperSupport", "", "devSupportManagerFactory", "Lcom/facebook/react/devsupport/DevSupportManagerFactory;", "requireActivity", "keepActivity", "initialLifecycleState", "Lcom/facebook/react/common/LifecycleState;", "jsExceptionHandler", "Lcom/facebook/react/bridge/JSExceptionHandler;", "currentActivity", "Landroid/app/Activity;", "defaultHardwareBackBtnHandler", "Lcom/facebook/react/modules/core/DefaultHardwareBackBtnHandler;", "redBoxHandler", "Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;", "lazyViewManagersEnabled", "devBundleDownloadListener", "Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;", "javaScriptExecutorFactory", "Lcom/facebook/react/bridge/JavaScriptExecutorFactory;", "minNumShakes", "", "minTimeLeftInFrameForNonBatchedOperationMs", "uiManagerProvider", "Lcom/facebook/react/bridge/UIManagerProvider;", "customPackagerCommandHandlers", "", "Lcom/facebook/react/packagerconnection/RequestHandler;", "tmmDelegateBuilder", "Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;", "surfaceDelegateFactory", "Lcom/facebook/react/common/SurfaceDelegateFactory;", "devLoadingViewManager", "Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;", "choreographerProvider", "Lcom/facebook/react/internal/ChoreographerProvider;", "pausedInDebuggerOverlayManager", "Lcom/facebook/react/devsupport/interfaces/PausedInDebuggerOverlayManager;", "setJavaScriptExecutorFactory", "setUIManagerProvider", "setBundleAssetName", "bundleAssetName", "setJSBundleFile", "jsBundleFile", "setJSBundleLoader", "setJSMainModulePath", "addPackage", "reactPackage", "addPackages", "reactPackages", "", "setApplication", "setCurrentActivity", "activity", "setDefaultHardwareBackBtnHandler", "setUseDeveloperSupport", "setDevSupportManagerFactory", "setRequireActivity", "setKeepActivity", "setSurfaceDelegateFactory", "setDevLoadingViewManager", "setPausedInDebuggerOverlayManager", "setInitialLifecycleState", "setJSExceptionHandler", "handler", "setRedBoxHandler", "setLazyViewManagersEnabled", "setDevBundleDownloadListener", "listener", "setMinNumShakes", "setMinTimeLeftInFrameForNonBatchedOperationMs", "setCustomPackagerCommandHandlers", "setReactPackageTurboModuleManagerDelegateBuilder", "builder", "setChoreographerProvider", "build", "Lcom/facebook/react/ReactInstanceManager;", "getDefaultJSExecutorFactory", "appName", "deviceName", "applicationContext", "Landroid/content/Context;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactInstanceManagerBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactInstanceManagerBuilder.kt\ncom/facebook/react/ReactInstanceManagerBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,400:1\n1#2:401\n*E\n"})
@rn.d
public final class ReactInstanceManagerBuilder {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG;
    private Application application;
    private ChoreographerProvider choreographerProvider;
    private Activity currentActivity;
    private Map<String, ? extends RequestHandler> customPackagerCommandHandlers;
    private DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler;
    private DevBundleDownloadListener devBundleDownloadListener;
    private DevLoadingViewManager devLoadingViewManager;
    private DevSupportManagerFactory devSupportManagerFactory;
    private LifecycleState initialLifecycleState;
    private JavaScriptExecutorFactory javaScriptExecutorFactory;
    private String jsBundleAssetUrl;
    private JSBundleLoader jsBundleLoader;
    private JSExceptionHandler jsExceptionHandler;
    private String jsMainModulePath;
    private boolean keepActivity;
    private boolean lazyViewManagersEnabled;
    private PausedInDebuggerOverlayManager pausedInDebuggerOverlayManager;
    private RedBoxHandler redBoxHandler;
    private boolean requireActivity;
    private SurfaceDelegateFactory surfaceDelegateFactory;
    private ReactPackageTurboModuleManagerDelegate.Builder tmmDelegateBuilder;
    private UIManagerProvider uiManagerProvider;
    private boolean useDeveloperSupport;

    @NotNull
    private final List<ReactPackage> packages = new ArrayList();
    private int minNumShakes = 1;
    private int minTimeLeftInFrameForNonBatchedOperationMs = -1;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/react/ReactInstanceManagerBuilder$Companion;", "", "<init>", "()V", "TAG", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue("ReactInstanceManagerBuilder", "getSimpleName(...)");
        TAG = "ReactInstanceManagerBuilder";
        LegacyArchitectureLogger.assertLegacyArchitecture("ReactInstanceManagerBuilder", LegacyArchitectureLogLevel.ERROR);
    }

    private final JavaScriptExecutorFactory getDefaultJSExecutorFactory(String appName, String deviceName, Context applicationContext) {
        ReactInstanceManager.initializeSoLoaderIfNecessary(applicationContext);
        try {
            y9.a aVar = HermesExecutor.f4790a;
            y9.a.b();
            return new j(21);
        } catch (UnsatisfiedLinkError unused) {
            o8.a.g(TAG, "Unable to load Hermes. Your application is not built correctly and will fail to execute");
            return null;
        }
    }

    @NotNull
    public final ReactInstanceManagerBuilder addPackage(@NotNull ReactPackage reactPackage) {
        Intrinsics.checkNotNullParameter(reactPackage, "reactPackage");
        this.packages.add(reactPackage);
        return this;
    }

    @NotNull
    public final ReactInstanceManagerBuilder addPackages(@NotNull List<? extends ReactPackage> reactPackages) {
        Intrinsics.checkNotNullParameter(reactPackages, "reactPackages");
        this.packages.addAll(reactPackages);
        return this;
    }

    @NotNull
    public final ReactInstanceManager build() {
        Application application = this.application;
        if (application == null) {
            throw new IllegalStateException("Application property has not been set with this builder");
        }
        if (this.initialLifecycleState == LifecycleState.RESUMED && this.currentActivity == null) {
            throw new IllegalStateException("Activity needs to be set if initial lifecycle state is resumed");
        }
        if (!this.useDeveloperSupport && this.jsBundleAssetUrl == null && this.jsBundleLoader == null) {
            throw new IllegalStateException("JS Bundle File or Asset URL has to be provided when dev support is disabled");
        }
        if (this.jsMainModulePath == null && this.jsBundleAssetUrl == null && this.jsBundleLoader == null) {
            throw new IllegalStateException("Either MainModulePath or JS Bundle File needs to be provided");
        }
        String packageName = application.getPackageName();
        String friendlyDeviceName = AndroidInfoHelpers.getFriendlyDeviceName();
        String str = this.jsBundleAssetUrl;
        Activity activity = this.currentActivity;
        DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler = this.defaultHardwareBackBtnHandler;
        JavaScriptExecutorFactory defaultJSExecutorFactory = this.javaScriptExecutorFactory;
        if (defaultJSExecutorFactory == null) {
            Intrinsics.checkNotNull(packageName);
            Context applicationContext = application.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            defaultJSExecutorFactory = getDefaultJSExecutorFactory(packageName, friendlyDeviceName, applicationContext);
        }
        JSBundleLoader jSBundleLoaderCreateAssetLoader = this.jsBundleLoader;
        if (jSBundleLoaderCreateAssetLoader == null && str != null) {
            jSBundleLoaderCreateAssetLoader = JSBundleLoader.INSTANCE.createAssetLoader(application, str, false);
        }
        JavaScriptExecutorFactory javaScriptExecutorFactory = defaultJSExecutorFactory;
        String str2 = this.jsMainModulePath;
        List<ReactPackage> list = this.packages;
        boolean z5 = this.useDeveloperSupport;
        DevSupportManagerFactory defaultDevSupportManagerFactory = this.devSupportManagerFactory;
        if (defaultDevSupportManagerFactory == null) {
            defaultDevSupportManagerFactory = new DefaultDevSupportManagerFactory();
        }
        DevSupportManagerFactory devSupportManagerFactory = defaultDevSupportManagerFactory;
        boolean z6 = this.requireActivity;
        boolean z7 = this.keepActivity;
        LifecycleState lifecycleState = this.initialLifecycleState;
        if (lifecycleState == null) {
            throw new IllegalStateException("Initial lifecycle state was not set");
        }
        return new ReactInstanceManager(application, activity, defaultHardwareBackBtnHandler, javaScriptExecutorFactory, jSBundleLoaderCreateAssetLoader, str2, list, z5, devSupportManagerFactory, z6, z7, lifecycleState, this.jsExceptionHandler, this.redBoxHandler, this.lazyViewManagersEnabled, this.devBundleDownloadListener, this.minNumShakes, this.minTimeLeftInFrameForNonBatchedOperationMs, this.uiManagerProvider, this.customPackagerCommandHandlers, this.tmmDelegateBuilder, this.surfaceDelegateFactory, this.devLoadingViewManager, this.choreographerProvider, this.pausedInDebuggerOverlayManager);
    }

    @NotNull
    public final ReactInstanceManagerBuilder setApplication(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.application = application;
        return this;
    }

    @NotNull
    public final ReactInstanceManagerBuilder setBundleAssetName(String bundleAssetName) {
        this.jsBundleAssetUrl = bundleAssetName == null ? null : "assets://".concat(bundleAssetName);
        this.jsBundleLoader = null;
        return this;
    }

    @NotNull
    public final ReactInstanceManagerBuilder setChoreographerProvider(ChoreographerProvider choreographerProvider) {
        this.choreographerProvider = choreographerProvider;
        return this;
    }

    @NotNull
    public final ReactInstanceManagerBuilder setCurrentActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.currentActivity = activity;
        return this;
    }

    @NotNull
    public final ReactInstanceManagerBuilder setCustomPackagerCommandHandlers(Map<String, ? extends RequestHandler> customPackagerCommandHandlers) {
        this.customPackagerCommandHandlers = customPackagerCommandHandlers;
        return this;
    }

    @NotNull
    public final ReactInstanceManagerBuilder setDefaultHardwareBackBtnHandler(@NotNull DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler) {
        Intrinsics.checkNotNullParameter(defaultHardwareBackBtnHandler, "defaultHardwareBackBtnHandler");
        this.defaultHardwareBackBtnHandler = defaultHardwareBackBtnHandler;
        return this;
    }

    @NotNull
    public final ReactInstanceManagerBuilder setDevBundleDownloadListener(DevBundleDownloadListener listener) {
        this.devBundleDownloadListener = listener;
        return this;
    }

    @NotNull
    public final ReactInstanceManagerBuilder setDevLoadingViewManager(DevLoadingViewManager devLoadingViewManager) {
        this.devLoadingViewManager = devLoadingViewManager;
        return this;
    }

    @NotNull
    public final ReactInstanceManagerBuilder setDevSupportManagerFactory(DevSupportManagerFactory devSupportManagerFactory) {
        this.devSupportManagerFactory = devSupportManagerFactory;
        return this;
    }

    @NotNull
    public final ReactInstanceManagerBuilder setInitialLifecycleState(@NotNull LifecycleState initialLifecycleState) {
        Intrinsics.checkNotNullParameter(initialLifecycleState, "initialLifecycleState");
        this.initialLifecycleState = initialLifecycleState;
        return this;
    }

    @NotNull
    public final ReactInstanceManagerBuilder setJSBundleFile(@NotNull String jsBundleFile) {
        Intrinsics.checkNotNullParameter(jsBundleFile, "jsBundleFile");
        if (!x.o(jsBundleFile, "assets://", false)) {
            return setJSBundleLoader(JSBundleLoader.INSTANCE.createFileLoader(jsBundleFile));
        }
        this.jsBundleAssetUrl = jsBundleFile;
        this.jsBundleLoader = null;
        return this;
    }

    @NotNull
    public final ReactInstanceManagerBuilder setJSBundleLoader(@NotNull JSBundleLoader jsBundleLoader) {
        Intrinsics.checkNotNullParameter(jsBundleLoader, "jsBundleLoader");
        this.jsBundleLoader = jsBundleLoader;
        this.jsBundleAssetUrl = null;
        return this;
    }

    @NotNull
    public final ReactInstanceManagerBuilder setJSExceptionHandler(JSExceptionHandler handler) {
        this.jsExceptionHandler = handler;
        return this;
    }

    @NotNull
    public final ReactInstanceManagerBuilder setJSMainModulePath(@NotNull String jsMainModulePath) {
        Intrinsics.checkNotNullParameter(jsMainModulePath, "jsMainModulePath");
        this.jsMainModulePath = jsMainModulePath;
        return this;
    }

    @NotNull
    public final ReactInstanceManagerBuilder setJavaScriptExecutorFactory(JavaScriptExecutorFactory javaScriptExecutorFactory) {
        this.javaScriptExecutorFactory = javaScriptExecutorFactory;
        return this;
    }

    @NotNull
    public final ReactInstanceManagerBuilder setKeepActivity(boolean keepActivity) {
        this.keepActivity = keepActivity;
        return this;
    }

    @NotNull
    public final ReactInstanceManagerBuilder setLazyViewManagersEnabled(boolean lazyViewManagersEnabled) {
        this.lazyViewManagersEnabled = lazyViewManagersEnabled;
        return this;
    }

    @NotNull
    public final ReactInstanceManagerBuilder setMinNumShakes(int minNumShakes) {
        this.minNumShakes = minNumShakes;
        return this;
    }

    @NotNull
    public final ReactInstanceManagerBuilder setMinTimeLeftInFrameForNonBatchedOperationMs(int minTimeLeftInFrameForNonBatchedOperationMs) {
        this.minTimeLeftInFrameForNonBatchedOperationMs = minTimeLeftInFrameForNonBatchedOperationMs;
        return this;
    }

    @NotNull
    public final ReactInstanceManagerBuilder setPausedInDebuggerOverlayManager(PausedInDebuggerOverlayManager pausedInDebuggerOverlayManager) {
        this.pausedInDebuggerOverlayManager = pausedInDebuggerOverlayManager;
        return this;
    }

    @NotNull
    public final ReactInstanceManagerBuilder setReactPackageTurboModuleManagerDelegateBuilder(ReactPackageTurboModuleManagerDelegate.Builder builder) {
        this.tmmDelegateBuilder = builder;
        return this;
    }

    @NotNull
    public final ReactInstanceManagerBuilder setRedBoxHandler(RedBoxHandler redBoxHandler) {
        this.redBoxHandler = redBoxHandler;
        return this;
    }

    @NotNull
    public final ReactInstanceManagerBuilder setRequireActivity(boolean requireActivity) {
        this.requireActivity = requireActivity;
        return this;
    }

    @NotNull
    public final ReactInstanceManagerBuilder setSurfaceDelegateFactory(SurfaceDelegateFactory surfaceDelegateFactory) {
        this.surfaceDelegateFactory = surfaceDelegateFactory;
        return this;
    }

    @NotNull
    public final ReactInstanceManagerBuilder setUIManagerProvider(UIManagerProvider uiManagerProvider) {
        this.uiManagerProvider = uiManagerProvider;
        return this;
    }

    @NotNull
    public final ReactInstanceManagerBuilder setUseDeveloperSupport(boolean useDeveloperSupport) {
        this.useDeveloperSupport = useDeveloperSupport;
        return this;
    }
}
