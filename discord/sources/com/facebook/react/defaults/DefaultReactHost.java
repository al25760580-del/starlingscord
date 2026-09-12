package com.facebook.react.defaults;

import android.content.Context;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.runtime.BindingsInstaller;
import com.facebook.react.runtime.JSRuntimeFactory;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.ReactSurfaceImpl;
import com.facebook.react.runtime.ReactSurfaceView;
import com.facebook.react.runtime.cxxreactpackage.CxxReactPackage;
import com.facebook.react.runtime.hermes.HermesInstance;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¬\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u001a\b\u0002\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00190\n2\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u00192\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H\u0007J$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010!\u001a\u00020\"2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J\r\u0010#\u001a\u00020\u001eH\u0000¢\u0006\u0002\b$R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/facebook/react/defaults/DefaultReactHost;", "", "<init>", "()V", "reactHost", "Lcom/facebook/react/ReactHost;", "getDefaultReactHost", "context", "Landroid/content/Context;", "packageList", "", "Lcom/facebook/react/ReactPackage;", "createReactSurfaceView", "Lkotlin/Function2;", "Lcom/facebook/react/runtime/ReactSurfaceImpl;", "Lcom/facebook/react/runtime/ReactSurfaceView;", "jsMainModulePath", "", "jsBundleAssetPath", "jsBundleFilePath", "jsRuntimeFactory", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "useDevSupport", "", "cxxReactPackageProviders", "Lkotlin/Function1;", "Lcom/facebook/react/bridge/ReactContext;", "Lcom/facebook/react/runtime/cxxreactpackage/CxxReactPackage;", "exceptionHandler", "Ljava/lang/Exception;", "", "bindingsInstaller", "Lcom/facebook/react/runtime/BindingsInstaller;", "reactNativeHost", "Lcom/facebook/react/ReactNativeHost;", "invalidate", "invalidate$ReactAndroid_release", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultReactHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultReactHost.kt\ncom/facebook/react/defaults/DefaultReactHost\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1869#2,2:154\n*S KotlinDebug\n*F\n+ 1 DefaultReactHost.kt\ncom/facebook/react/defaults/DefaultReactHost\n*L\n92#1:154,2\n*E\n"})
public final class DefaultReactHost {

    @NotNull
    public static final DefaultReactHost INSTANCE = new DefaultReactHost();
    private static ReactHost reactHost;

    private DefaultReactHost() {
    }

    @NotNull
    public static final ReactHost getDefaultReactHost(@NotNull Context context, @NotNull List<? extends ReactPackage> packageList, @NotNull Function2<? super Context, ? super ReactSurfaceImpl, ? extends ReactSurfaceView> createReactSurfaceView, @NotNull String jsMainModulePath, @NotNull String jsBundleAssetPath, String jsBundleFilePath, JSRuntimeFactory jsRuntimeFactory, boolean useDevSupport, @NotNull List<? extends Function1<? super ReactContext, ? extends CxxReactPackage>> cxxReactPackageProviders, @NotNull Function1<? super Exception, Unit> exceptionHandler, BindingsInstaller bindingsInstaller) {
        JSBundleLoader jSBundleLoaderCreateAssetLoader;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageList, "packageList");
        Intrinsics.checkNotNullParameter(createReactSurfaceView, "createReactSurfaceView");
        Intrinsics.checkNotNullParameter(jsMainModulePath, "jsMainModulePath");
        Intrinsics.checkNotNullParameter(jsBundleAssetPath, "jsBundleAssetPath");
        Intrinsics.checkNotNullParameter(cxxReactPackageProviders, "cxxReactPackageProviders");
        Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
        ReactHost reactHost2 = reactHost;
        if (reactHost2 != null) {
            return reactHost2;
        }
        if (jsBundleFilePath != null) {
            jSBundleLoaderCreateAssetLoader = x.o(jsBundleFilePath, "assets://", false) ? JSBundleLoader.INSTANCE.createAssetLoader(context, jsBundleFilePath, true) : JSBundleLoader.INSTANCE.createFileLoader(jsBundleFilePath);
        } else {
            jSBundleLoaderCreateAssetLoader = JSBundleLoader.INSTANCE.createAssetLoader(context, "assets://" + jsBundleAssetPath, true);
        }
        JSBundleLoader jSBundleLoader = jSBundleLoaderCreateAssetLoader;
        DefaultTurboModuleManagerDelegate.Builder builder = new DefaultTurboModuleManagerDelegate.Builder();
        Iterator<T> it = cxxReactPackageProviders.iterator();
        while (it.hasNext()) {
            builder.addCxxReactPackage((Function1<? super ReactApplicationContext, ? extends CxxReactPackage>) it.next());
        }
        DefaultReactHostDelegate defaultReactHostDelegate = new DefaultReactHostDelegate(jsMainModulePath, jSBundleLoader, packageList, jsRuntimeFactory == null ? new HermesInstance() : jsRuntimeFactory, bindingsInstaller, exceptionHandler, builder, createReactSurfaceView);
        ComponentFactory componentFactory = new ComponentFactory();
        DefaultComponentsRegistry.register(componentFactory);
        ReactHostImpl reactHostImpl = new ReactHostImpl(context, defaultReactHostDelegate, componentFactory, true, useDevSupport);
        reactHost = reactHostImpl;
        return reactHostImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDefaultReactHost$lambda$0(Exception it) throws Exception {
        Intrinsics.checkNotNullParameter(it, "it");
        throw it;
    }

    public final void invalidate$ReactAndroid_release() {
        reactHost = null;
    }

    public static /* synthetic */ ReactHost getDefaultReactHost$default(Context context, ReactNativeHost reactNativeHost, JSRuntimeFactory jSRuntimeFactory, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            jSRuntimeFactory = null;
        }
        return getDefaultReactHost(context, reactNativeHost, jSRuntimeFactory);
    }

    @NotNull
    public static final ReactHost getDefaultReactHost(@NotNull Context context, @NotNull ReactNativeHost reactNativeHost, JSRuntimeFactory jsRuntimeFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactNativeHost, "reactNativeHost");
        if (reactNativeHost instanceof DefaultReactNativeHost) {
            return ((DefaultReactNativeHost) reactNativeHost).toReactHost$ReactAndroid_release(context, jsRuntimeFactory);
        }
        throw new IllegalArgumentException("You can call getDefaultReactHost only with instances of DefaultReactNativeHost");
    }
}
