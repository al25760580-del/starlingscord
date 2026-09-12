package com.facebook.react.defaults;

import android.content.Context;
import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.react.ReactPackage;
import com.facebook.react.ReactPackageTurboModuleManagerDelegate;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.runtime.BindingsInstaller;
import com.facebook.react.runtime.JSRuntimeFactory;
import com.facebook.react.runtime.ReactHostDelegate;
import com.facebook.react.runtime.ReactSurfaceImpl;
import com.facebook.react.runtime.ReactSurfaceView;
import com.facebook.react.runtime.hermes.HermesInstance;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@DoNotStrip
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0018\b\u0002\u0010\r\u001a\u0012\u0012\b\u0012\u00060\u000fj\u0002`\u0010\u0012\u0004\u0012\u00020\u00110\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010'\u001a\u00020\u00112\n\u0010(\u001a\u00060\u000fj\u0002`\u0010H\u0016J\u0018\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u0017H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001e\u0010\r\u001a\u0012\u0012\b\u0012\u00060\u000fj\u0002`\u0010\u0012\u0004\u0012\u00020\u00110\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R \u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/facebook/react/defaults/DefaultReactHostDelegate;", "Lcom/facebook/react/runtime/ReactHostDelegate;", "jsMainModulePath", "", "jsBundleLoader", "Lcom/facebook/react/bridge/JSBundleLoader;", "reactPackages", "", "Lcom/facebook/react/ReactPackage;", "jsRuntimeFactory", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "bindingsInstaller", "Lcom/facebook/react/runtime/BindingsInstaller;", "exceptionHandler", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "turboModuleManagerDelegateBuilder", "Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;", "createReactSurfaceViewCallback", "Lkotlin/Function2;", "Landroid/content/Context;", "Lcom/facebook/react/runtime/ReactSurfaceImpl;", "Lcom/facebook/react/runtime/ReactSurfaceView;", "<init>", "(Ljava/lang/String;Lcom/facebook/react/bridge/JSBundleLoader;Ljava/util/List;Lcom/facebook/react/runtime/JSRuntimeFactory;Lcom/facebook/react/runtime/BindingsInstaller;Lkotlin/jvm/functions/Function1;Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;Lkotlin/jvm/functions/Function2;)V", "getJsMainModulePath", "()Ljava/lang/String;", "getJsBundleLoader", "()Lcom/facebook/react/bridge/JSBundleLoader;", "getReactPackages", "()Ljava/util/List;", "getJsRuntimeFactory", "()Lcom/facebook/react/runtime/JSRuntimeFactory;", "getBindingsInstaller", "()Lcom/facebook/react/runtime/BindingsInstaller;", "getTurboModuleManagerDelegateBuilder", "()Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;", "handleInstanceException", "error", "createReactSurfaceView", "context", "surfaceImpl", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@UnstableReactNativeAPI
public final class DefaultReactHostDelegate implements ReactHostDelegate {
    private final BindingsInstaller bindingsInstaller;

    @NotNull
    private final Function2<Context, ReactSurfaceImpl, ReactSurfaceView> createReactSurfaceViewCallback;

    @NotNull
    private final Function1<Exception, Unit> exceptionHandler;

    @NotNull
    private final JSBundleLoader jsBundleLoader;

    @NotNull
    private final String jsMainModulePath;

    @NotNull
    private final JSRuntimeFactory jsRuntimeFactory;

    @NotNull
    private final List<ReactPackage> reactPackages;

    @NotNull
    private final ReactPackageTurboModuleManagerDelegate.Builder turboModuleManagerDelegateBuilder;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultReactHostDelegate(@NotNull String jsMainModulePath, @NotNull JSBundleLoader jsBundleLoader, @NotNull List<? extends ReactPackage> reactPackages, @NotNull JSRuntimeFactory jsRuntimeFactory, BindingsInstaller bindingsInstaller, @NotNull Function1<? super Exception, Unit> exceptionHandler, @NotNull ReactPackageTurboModuleManagerDelegate.Builder turboModuleManagerDelegateBuilder, @NotNull Function2<? super Context, ? super ReactSurfaceImpl, ? extends ReactSurfaceView> createReactSurfaceViewCallback) {
        Intrinsics.checkNotNullParameter(jsMainModulePath, "jsMainModulePath");
        Intrinsics.checkNotNullParameter(jsBundleLoader, "jsBundleLoader");
        Intrinsics.checkNotNullParameter(reactPackages, "reactPackages");
        Intrinsics.checkNotNullParameter(jsRuntimeFactory, "jsRuntimeFactory");
        Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
        Intrinsics.checkNotNullParameter(turboModuleManagerDelegateBuilder, "turboModuleManagerDelegateBuilder");
        Intrinsics.checkNotNullParameter(createReactSurfaceViewCallback, "createReactSurfaceViewCallback");
        this.jsMainModulePath = jsMainModulePath;
        this.jsBundleLoader = jsBundleLoader;
        this.reactPackages = reactPackages;
        this.jsRuntimeFactory = jsRuntimeFactory;
        this.bindingsInstaller = bindingsInstaller;
        this.exceptionHandler = exceptionHandler;
        this.turboModuleManagerDelegateBuilder = turboModuleManagerDelegateBuilder;
        this.createReactSurfaceViewCallback = createReactSurfaceViewCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(Exception it) throws Exception {
        Intrinsics.checkNotNullParameter(it, "it");
        throw it;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    @NotNull
    public ReactSurfaceView createReactSurfaceView(@NotNull Context context, @NotNull ReactSurfaceImpl surfaceImpl) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(surfaceImpl, "surfaceImpl");
        return (ReactSurfaceView) this.createReactSurfaceViewCallback.invoke(context, surfaceImpl);
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    public BindingsInstaller getBindingsInstaller() {
        return this.bindingsInstaller;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    @NotNull
    public JSBundleLoader getJsBundleLoader() {
        return this.jsBundleLoader;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    @NotNull
    public String getJsMainModulePath() {
        return this.jsMainModulePath;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    @NotNull
    public JSRuntimeFactory getJsRuntimeFactory() {
        return this.jsRuntimeFactory;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    @NotNull
    public List<ReactPackage> getReactPackages() {
        return this.reactPackages;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    @NotNull
    public ReactPackageTurboModuleManagerDelegate.Builder getTurboModuleManagerDelegateBuilder() {
        return this.turboModuleManagerDelegateBuilder;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    public void handleInstanceException(@NotNull Exception error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.exceptionHandler.invoke(error);
    }

    public DefaultReactHostDelegate(String str, JSBundleLoader jSBundleLoader, List list, JSRuntimeFactory jSRuntimeFactory, BindingsInstaller bindingsInstaller, Function1 function1, ReactPackageTurboModuleManagerDelegate.Builder builder, Function2 function2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, jSBundleLoader, (i7 & 4) != 0 ? n0.f14659d : list, (i7 & 8) != 0 ? new HermesInstance() : jSRuntimeFactory, (i7 & 16) != 0 ? null : bindingsInstaller, (i7 & 32) != 0 ? new com.discord.user_search_worker.a(6) : function1, builder, function2);
    }
}
