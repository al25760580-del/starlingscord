package com.facebook.react.shell;

import android.annotation.SuppressLint;
import com.facebook.react.BaseReactPackage;
import com.facebook.react.ViewManagerOnDemandReactPackage;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.ClassFinder;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.blob.BlobModule;
import com.facebook.react.modules.blob.FileReaderModule;
import com.facebook.react.modules.camera.ImageStoreManager;
import com.facebook.react.modules.clipboard.ClipboardModule;
import com.facebook.react.modules.devloading.DevLoadingModule;
import com.facebook.react.modules.devtoolsruntimesettings.ReactDevToolsRuntimeSettingsModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.fresco.FrescoModule;
import com.facebook.react.modules.i18nmanager.I18nManagerModule;
import com.facebook.react.modules.image.ImageLoaderModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.facebook.react.modules.reactdevtoolssettings.ReactDevToolsSettingsManagerModule;
import com.facebook.react.modules.share.ShareModule;
import com.facebook.react.modules.sound.SoundManagerModule;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.modules.toast.ToastModule;
import com.facebook.react.modules.vibration.VibrationModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.facebook.react.runtime.a;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.drawer.ReactDrawerLayoutManager;
import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.safeareaview.ReactSafeAreaViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollContainerViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollViewManager;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;
import com.facebook.react.views.switchview.ReactSwitchManager;
import com.facebook.react.views.text.PreparedLayoutTextViewManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.text.SelectableTextViewManager;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.facebook.react.views.unimplementedview.ReactUnimplementedViewManager;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.react.views.virtual.view.ReactVirtualViewManager;
import com.google.firebase.messaging.n;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.collections.v0;
import kotlin.collections.w0;
import kotlin.collections.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001e\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\u001a\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\nH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/facebook/react/shell/MainReactPackage;", "Lcom/facebook/react/BaseReactPackage;", "Lcom/facebook/react/ViewManagerOnDemandReactPackage;", "config", "Lcom/facebook/react/shell/MainPackageConfig;", "<init>", "(Lcom/facebook/react/shell/MainPackageConfig;)V", "getModule", "Lcom/facebook/react/bridge/NativeModule;", StackTraceHelper.NAME_KEY, "", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "createViewManagers", "", "Lcom/facebook/react/uimanager/ViewManager;", "viewManagersMap", "", "Lcom/facebook/react/bridge/ModuleSpec;", "getViewManagersMap$annotations", "()V", "getViewManagersMap", "()Ljava/util/Map;", "getViewManagers", "getViewManagerNames", "", "createViewManager", "viewManagerName", "getReactModuleInfoProvider", "Lcom/facebook/react/module/model/ReactModuleInfoProvider;", "fallbackForMissingClass", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMainReactPackage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainReactPackage.kt\ncom/facebook/react/shell/MainReactPackage\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,305:1\n37#2:306\n36#2,3:307\n3829#3:310\n4344#3,2:311\n1193#4,2:313\n1267#4,4:315\n*S KotlinDebug\n*F\n+ 1 MainReactPackage.kt\ncom/facebook/react/shell/MainReactPackage\n*L\n285#1:306\n285#1:307,3\n289#1:310\n289#1:311,2\n290#1:313,2\n290#1:315,4\n*E\n"})
public final class MainReactPackage extends BaseReactPackage implements ViewManagerOnDemandReactPackage {
    private final MainPackageConfig config;

    @SuppressLint({"VisibleForTests"})
    @NotNull
    private final Map<String, ModuleSpec> viewManagersMap;

    /* JADX WARN: Multi-variable type inference failed */
    public MainReactPackage() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final ReactModuleInfoProvider fallbackForMissingClass() {
        Class[] clsArr = (Class[]) y.r(new Class[]{AccessibilityInfoModule.class, AppearanceModule.class, AppStateModule.class, BlobModule.class, DevLoadingModule.class, FileReaderModule.class, ClipboardModule.class, DialogModule.class, FrescoModule.class, I18nManagerModule.class, ImageLoaderModule.class, ImageStoreManager.class, IntentModule.class, ReactNativeFeatureFlags.cxxNativeAnimatedEnabled() ? null : NativeAnimatedModule.class, NetworkingModule.class, PermissionsModule.class, ReactDevToolsSettingsManagerModule.class, ReactDevToolsRuntimeSettingsModule.class, ShareModule.class, StatusBarModule.class, SoundManagerModule.class, ToastModule.class, VibrationModule.class, WebSocketModule.class}).toArray(new Class[0]);
        ArrayList<Class<?>> arrayList = new ArrayList();
        for (Class cls : clsArr) {
            if (cls.isAnnotationPresent(ReactModule.class)) {
                arrayList.add(cls);
            }
        }
        int iA = v0.a(e0.l(arrayList, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Class<?> cls2 : arrayList) {
            Annotation annotation = cls2.getAnnotation(ReactModule.class);
            if (annotation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ReactModule reactModule = (ReactModule) annotation;
            String strName = reactModule.name();
            String strName2 = reactModule.name();
            String name = cls2.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            linkedHashMap.put(strName, new ReactModuleInfo(strName2, name, reactModule.canOverrideExistingModule(), reactModule.needsEagerInit(), reactModule.isCxxModule(), ReactModuleInfo.INSTANCE.classIsTurboModule(cls2)));
        }
        return new a(linkedHashMap, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map fallbackForMissingClass$lambda$17(Map map) {
        return map;
    }

    public static /* synthetic */ void getViewManagersMap$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$0() {
        return new ReactDrawerLayoutManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final NativeModule viewManagersMap$lambda$1() {
        return new ReactHorizontalScrollViewManager(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final NativeModule viewManagersMap$lambda$10() {
        int i7 = 1;
        return ReactNativeFeatureFlags.enablePreparedTextLayout() ? new PreparedLayoutTextViewManager(null, i7, 0 == true ? 1 : 0) : new ReactTextViewManager(0 == true ? 1 : 0, i7, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final NativeModule viewManagersMap$lambda$11() {
        return new SelectableTextViewManager(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$12() {
        return new ReactViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$13() {
        return new ReactVirtualViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$14() {
        return new ReactUnimplementedViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$2() {
        return new ReactHorizontalScrollContainerViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$3() {
        return new ReactProgressBarViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$4() {
        return new ReactSafeAreaViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$5() {
        return new ReactSwitchManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$6() {
        return new SwipeRefreshLayoutManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$7() {
        return new ReactImageManager(null, null, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$8() {
        return new ReactModalHostManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$9() {
        return new ReactTextInputManager();
    }

    @Override // com.facebook.react.ViewManagerOnDemandReactPackage
    public ViewManager<?, ?> createViewManager(@NotNull ReactApplicationContext reactContext, @NotNull String viewManagerName) {
        Provider provider;
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(viewManagerName, "viewManagerName");
        ModuleSpec moduleSpec = this.viewManagersMap.get(viewManagerName);
        NativeModule nativeModule = (moduleSpec == null || (provider = moduleSpec.provider()) == null) ? null : (NativeModule) provider.get();
        if (nativeModule instanceof ViewManager) {
            return (ViewManager) nativeModule;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    @NotNull
    public List<ViewManager<?, ?>> createViewManagers(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        int i7 = 1;
        return d0.g(new ReactDrawerLayoutManager(), new ReactHorizontalScrollViewManager(null, i7, 0 == true ? 1 : 0), new ReactHorizontalScrollContainerViewManager(), new ReactProgressBarViewManager(), new ReactSwitchManager(), new ReactSafeAreaViewManager(), new SwipeRefreshLayoutManager(), new ReactImageManager(null, null, null, 7, null), new ReactModalHostManager(), new ReactTextInputManager(), ReactNativeFeatureFlags.enablePreparedTextLayout() ? new PreparedLayoutTextViewManager(0 == true ? 1 : 0, i7, 0 == true ? 1 : 0) : new ReactTextViewManager(0 == true ? 1 : 0, i7, 0 == true ? 1 : 0), new SelectableTextViewManager(0 == true ? 1 : 0, i7, 0 == true ? 1 : 0), new ReactViewManager(), new ReactVirtualViewManager(), new ReactUnimplementedViewManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(@NotNull String name, @NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        if (Intrinsics.areEqual(name, "AccessibilityInfo")) {
            return new AccessibilityInfoModule(reactContext);
        }
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (Intrinsics.areEqual(name, "Appearance")) {
            return new AppearanceModule(reactContext, objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0);
        }
        if (Intrinsics.areEqual(name, "AppState")) {
            return new AppStateModule(reactContext);
        }
        if (Intrinsics.areEqual(name, "BlobModule")) {
            return new BlobModule(reactContext);
        }
        if (Intrinsics.areEqual(name, "DevLoadingView")) {
            return new DevLoadingModule(reactContext);
        }
        if (Intrinsics.areEqual(name, FileReaderModule.INSTANCE.getNAME())) {
            return new FileReaderModule(reactContext);
        }
        if (Intrinsics.areEqual(name, "Clipboard")) {
            return new ClipboardModule(reactContext);
        }
        if (Intrinsics.areEqual(name, "DialogManagerAndroid")) {
            return new DialogModule(reactContext);
        }
        if (Intrinsics.areEqual(name, FrescoModule.NAME)) {
            MainPackageConfig mainPackageConfig = this.config;
            return new FrescoModule(reactContext, true, mainPackageConfig != null ? mainPackageConfig.getFrescoConfig() : null);
        }
        if (Intrinsics.areEqual(name, "I18nManager")) {
            return new I18nManagerModule(reactContext);
        }
        if (Intrinsics.areEqual(name, "ImageLoader")) {
            return new ImageLoaderModule(reactContext);
        }
        if (Intrinsics.areEqual(name, "ImageStoreManager")) {
            return new ImageStoreManager(reactContext);
        }
        if (Intrinsics.areEqual(name, "IntentAndroid")) {
            return new IntentModule(reactContext);
        }
        if (Intrinsics.areEqual(name, "NativeAnimatedModule")) {
            if (!ReactNativeFeatureFlags.cxxNativeAnimatedEnabled()) {
                return new NativeAnimatedModule(reactContext);
            }
        } else {
            if (Intrinsics.areEqual(name, "Networking")) {
                return new NetworkingModule(reactContext);
            }
            if (Intrinsics.areEqual(name, "PermissionsAndroid")) {
                return new PermissionsModule(reactContext);
            }
            if (Intrinsics.areEqual(name, "ShareModule")) {
                return new ShareModule(reactContext);
            }
            if (Intrinsics.areEqual(name, "StatusBarManager")) {
                return new StatusBarModule(reactContext);
            }
            if (Intrinsics.areEqual(name, "SoundManager")) {
                return new SoundManagerModule(reactContext);
            }
            if (Intrinsics.areEqual(name, "ToastAndroid")) {
                return new ToastModule(reactContext);
            }
            if (Intrinsics.areEqual(name, "Vibration")) {
                return new VibrationModule(reactContext);
            }
            if (Intrinsics.areEqual(name, "WebSocketModule")) {
                return new WebSocketModule(reactContext);
            }
            if (Intrinsics.areEqual(name, "ReactDevToolsSettingsManager")) {
                return new ReactDevToolsSettingsManagerModule(reactContext);
            }
            if (Intrinsics.areEqual(name, "ReactDevToolsRuntimeSettingsModule")) {
                return new ReactDevToolsRuntimeSettingsModule(reactContext);
            }
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    @NotNull
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        if (!ClassFinder.canLoadClassesFromAnnotationProcessors()) {
            return fallbackForMissingClass();
        }
        try {
            Class<?> clsFindClass = ClassFinder.findClass("com.facebook.react.shell.MainReactPackage$$ReactModuleInfoProvider");
            Object objNewInstance = clsFindClass != null ? clsFindClass.newInstance() : null;
            ReactModuleInfoProvider reactModuleInfoProvider = objNewInstance instanceof ReactModuleInfoProvider ? (ReactModuleInfoProvider) objNewInstance : null;
            return reactModuleInfoProvider == null ? fallbackForMissingClass() : reactModuleInfoProvider;
        } catch (ClassNotFoundException unused) {
            return fallbackForMissingClass();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("No ReactModuleInfoProvider for MainReactPackage$$ReactModuleInfoProvider", e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("No ReactModuleInfoProvider for MainReactPackage$$ReactModuleInfoProvider", e11);
        }
    }

    @Override // com.facebook.react.ViewManagerOnDemandReactPackage
    @NotNull
    public Collection<String> getViewManagerNames(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return this.viewManagersMap.keySet();
    }

    @Override // com.facebook.react.BaseReactPackage
    @NotNull
    public List<ModuleSpec> getViewManagers(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt.i0(this.viewManagersMap.values());
    }

    @NotNull
    public final Map<String, ModuleSpec> getViewManagersMap() {
        return this.viewManagersMap;
    }

    public /* synthetic */ MainReactPackage(MainPackageConfig mainPackageConfig, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : mainPackageConfig);
    }

    public MainReactPackage(MainPackageConfig mainPackageConfig) {
        this.config = mainPackageConfig;
        ModuleSpec.Companion companion = ModuleSpec.INSTANCE;
        this.viewManagersMap = w0.g(new Pair(ReactDrawerLayoutManager.REACT_CLASS, companion.viewManagerSpec(new n(23))), new Pair(ReactHorizontalScrollViewManager.REACT_CLASS, companion.viewManagerSpec(new n(29))), new Pair(ReactHorizontalScrollContainerViewManager.REACT_CLASS, companion.viewManagerSpec(new gb.a(0))), new Pair(ReactProgressBarViewManager.REACT_CLASS, companion.viewManagerSpec(new gb.a(1))), new Pair(ReactSafeAreaViewManager.REACT_CLASS, companion.viewManagerSpec(new n(17))), new Pair(ReactSwitchManager.REACT_CLASS, companion.viewManagerSpec(new n(18))), new Pair(SwipeRefreshLayoutManager.REACT_CLASS, companion.viewManagerSpec(new n(19))), new Pair(ReactImageManager.REACT_CLASS, companion.viewManagerSpec(new n(20))), new Pair(ReactModalHostManager.REACT_CLASS, companion.viewManagerSpec(new n(21))), new Pair(ReactTextInputManager.REACT_CLASS, companion.viewManagerSpec(new n(22))), new Pair("RCTText", companion.viewManagerSpec(new n(24))), new Pair(SelectableTextViewManager.REACT_CLASS, companion.viewManagerSpec(new n(25))), new Pair("RCTView", companion.viewManagerSpec(new n(26))), new Pair(ReactVirtualViewManager.REACT_CLASS, companion.viewManagerSpec(new n(27))), new Pair(ReactUnimplementedViewManager.REACT_CLASS, companion.viewManagerSpec(new n(28))));
    }
}
