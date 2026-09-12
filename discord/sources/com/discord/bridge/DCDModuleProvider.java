package com.discord.bridge;

import com.discord.image.fresco.FrescoModuleDiscord;
import com.discord.react.utilities.ReactModuleInfoProviderExtensionsKt;
import com.facebook.react.BaseReactPackage;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.d0;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\f\u001a\u00020\u000b2\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042 \b\u0002\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u00020\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJM\u0010\u0011\u001a\u00020\u000b2>\u0010\n\u001a \u0012\u001c\b\u0001\u0012\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\t0\b0\u00040\u0010\"\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\t0\b0\u0004¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0018\u001a\u00020\u0017*\u0012\u0012\u0004\u0012\u00020\u000b0\u0013j\b\u0012\u0004\u0012\u00020\u000b`\u00142\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0010\"\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c0\u0004¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/discord/bridge/DCDModuleProvider;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "onNativeModule", "Lcom/facebook/react/uimanager/ViewManager;", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "onViewManager", "Lcom/facebook/react/ReactPackage;", "getLegacyPackageForModuleWithViewManager", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;", "getLegacyPackageForModule", "(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;", "", "getViewManagers", "([Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Lcom/facebook/react/BaseReactPackage;", "turboPackages", "", "addTurboPackages", "(Ljava/util/ArrayList;[Lcom/facebook/react/BaseReactPackage;)Z", "", "moduleName", "Lcom/facebook/react/bridge/NativeModule;", "getTurboPackageForModule", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/BaseReactPackage;", "app_googleRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DCDModuleProvider {

    @NotNull
    public static final DCDModuleProvider INSTANCE = new DCDModuleProvider();

    private DCDModuleProvider() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReactPackage getLegacyPackageForModuleWithViewManager$default(DCDModuleProvider dCDModuleProvider, Function1 function1, Function1 function2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            function1 = null;
        }
        if ((i7 & 2) != 0) {
            function2 = null;
        }
        return dCDModuleProvider.getLegacyPackageForModuleWithViewManager(function1, function2);
    }

    public final boolean addTurboPackages(@NotNull ArrayList<ReactPackage> arrayList, @NotNull BaseReactPackage... turboPackages) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(turboPackages, "turboPackages");
        return i0.q(arrayList, turboPackages);
    }

    @NotNull
    @d
    public final ReactPackage getLegacyPackageForModule(@NotNull Function1<? super ReactApplicationContext, ? extends ReactContextBaseJavaModule> onNativeModule) {
        Intrinsics.checkNotNullParameter(onNativeModule, "onNativeModule");
        return getLegacyPackageForModuleWithViewManager$default(this, onNativeModule, null, 2, null);
    }

    @NotNull
    @d
    public final ReactPackage getLegacyPackageForModuleWithViewManager(final Function1<? super ReactApplicationContext, ? extends ReactContextBaseJavaModule> onNativeModule, final Function1<? super ReactApplicationContext, ? extends ViewManager<?, LayoutShadowNode>> onViewManager) {
        return new ReactPackage() { // from class: com.discord.bridge.DCDModuleProvider.getLegacyPackageForModuleWithViewManager.1
            @Override // com.facebook.react.ReactPackage
            public List<ReactContextBaseJavaModule> createNativeModules(ReactApplicationContext reactContext) {
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                Function1<ReactApplicationContext, ReactContextBaseJavaModule> function1 = onNativeModule;
                ReactContextBaseJavaModule reactContextBaseJavaModule = function1 != null ? (ReactContextBaseJavaModule) function1.invoke(reactContext) : null;
                if ((reactContextBaseJavaModule instanceof FrescoModuleDiscord) || !(reactContextBaseJavaModule instanceof TurboModule)) {
                    return d0.h(reactContextBaseJavaModule);
                }
                throw new IllegalArgumentException(("\n                            Do not provide a TurboModule to getLegacyPackage method,\n                            use getTurboPackageForModule instead, class: " + reactContextBaseJavaModule + "\n                        ").toString());
            }

            @Override // com.facebook.react.ReactPackage
            public List<ViewManager<?, LayoutShadowNode>> createViewManagers(ReactApplicationContext reactContext) {
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                Function1<ReactApplicationContext, ViewManager<?, LayoutShadowNode>> function1 = onViewManager;
                return d0.h(function1 != null ? (ViewManager) function1.invoke(reactContext) : null);
            }
        };
    }

    @NotNull
    public final BaseReactPackage getTurboPackageForModule(@NotNull final String moduleName, @NotNull final Function1<? super ReactApplicationContext, ? extends NativeModule> onNativeModule) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(onNativeModule, "onNativeModule");
        return new BaseReactPackage() { // from class: com.discord.bridge.DCDModuleProvider.getTurboPackageForModule.1
            @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
            public NativeModule getModule(String name, ReactApplicationContext reactContext) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                if (Intrinsics.areEqual(name, moduleName)) {
                    return (NativeModule) onNativeModule.invoke(reactContext);
                }
                return null;
            }

            @Override // com.facebook.react.BaseReactPackage
            public ReactModuleInfoProvider getReactModuleInfoProvider() {
                return ReactModuleInfoProviderExtensionsKt.createReactModuleInfoProvider$default(moduleName, false, 2, (Object) null);
            }
        };
    }

    @NotNull
    public final ReactPackage getViewManagers(@NotNull final Function1<? super ReactApplicationContext, ? extends ViewManager<?, LayoutShadowNode>>... onViewManager) {
        Intrinsics.checkNotNullParameter(onViewManager, "onViewManager");
        return new ReactPackage() { // from class: com.discord.bridge.DCDModuleProvider.getViewManagers.1
            @Override // com.facebook.react.ReactPackage
            public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                return new ArrayList();
            }

            @Override // com.facebook.react.ReactPackage
            public List<ViewManager<?, LayoutShadowNode>> createViewManagers(ReactApplicationContext reactContext) {
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                Function1<ReactApplicationContext, ViewManager<?, LayoutShadowNode>>[] function1Arr = onViewManager;
                ArrayList arrayList = new ArrayList(function1Arr.length);
                for (Function1<ReactApplicationContext, ViewManager<?, LayoutShadowNode>> function1 : function1Arr) {
                    arrayList.add((ViewManager) function1.invoke(reactContext));
                }
                return arrayList;
            }
        };
    }
}
