package com.facebook.react;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlags;
import com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002$%B\u001f\b\u0014\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bB'\b\u0014\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bJ\u001e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u001e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u0012H\u0016J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0012H\u0016J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0012H\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u001d\u001a\u00020\u0012H\u0016J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005H\u0016J\b\u0010#\u001a\u00020\u0015H\u0002R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate;", "Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;", "reactApplicationContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "packages", "", "Lcom/facebook/react/ReactPackage;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;)V", "hybridData", "Lcom/facebook/jni/HybridData;", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;Lcom/facebook/jni/HybridData;)V", "moduleProviders", "", "Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$ModuleProvider;", "packageModuleInfos", "", "", "", "Lcom/facebook/react/module/model/ReactModuleInfo;", "shouldEnableLegacyModuleInterop", "", "initTasksLeft", "Ljava/util/concurrent/CountDownLatch;", "initialize", "", "initializeModules", "getModule", "Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;", "moduleName", "unstable_isModuleRegistered", "unstable_isLegacyModuleRegistered", "getLegacyModule", "Lcom/facebook/react/bridge/NativeModule;", "getEagerInitModuleNames", "shouldSupportLegacyPackages", "ModuleProvider", "Builder", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ReactPackageTurboModuleManagerDelegate extends TurboModuleManagerDelegate {

    @NotNull
    private final CountDownLatch initTasksLeft;

    @NotNull
    private final List<ModuleProvider> moduleProviders;

    @NotNull
    private final Map<ModuleProvider, Map<String, ReactModuleInfo>> packageModuleInfos;
    private final boolean shouldEnableLegacyModuleInterop;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\t\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H$J\u0006\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;", "", "<init>", "()V", "packages", "", "Lcom/facebook/react/ReactPackage;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "setPackages", "setReactApplicationContext", "build", "Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Builder {
        private ReactApplicationContext context;
        private List<? extends ReactPackage> packages;

        @NotNull
        public final ReactPackageTurboModuleManagerDelegate build() {
            ReactApplicationContext reactApplicationContext = this.context;
            if (reactApplicationContext == null) {
                throw new IllegalArgumentException("The ReactApplicationContext must be provided to create ReactPackageTurboModuleManagerDelegate");
            }
            List<? extends ReactPackage> list = this.packages;
            if (list != null) {
                return build(reactApplicationContext, list);
            }
            throw new IllegalArgumentException("A set of ReactPackages must be provided to create ReactPackageTurboModuleManagerDelegate");
        }

        @NotNull
        public abstract ReactPackageTurboModuleManagerDelegate build(@NotNull ReactApplicationContext context, @NotNull List<? extends ReactPackage> packages);

        @NotNull
        public final Builder setPackages(@NotNull List<? extends ReactPackage> packages) {
            Intrinsics.checkNotNullParameter(packages, "packages");
            this.packages = CollectionsKt.i0(packages);
            return this;
        }

        @NotNull
        public final Builder setReactApplicationContext(ReactApplicationContext context) {
            this.context = context;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$ModuleProvider;", "", "getModule", "Lcom/facebook/react/bridge/NativeModule;", "moduleName", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ModuleProvider {
        NativeModule getModule(@NotNull String moduleName);
    }

    public ReactPackageTurboModuleManagerDelegate(@NotNull ReactApplicationContext reactApplicationContext, @NotNull List<? extends ReactPackage> packages) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        Intrinsics.checkNotNullParameter(packages, "packages");
        this.moduleProviders = new ArrayList();
        this.packageModuleInfos = new LinkedHashMap();
        this.shouldEnableLegacyModuleInterop = ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture() && ReactNativeNewArchitectureFeatureFlags.useTurboModuleInterop();
        this.initTasksLeft = new CountDownLatch(1);
        initialize(reactApplicationContext, packages);
    }

    private final void initialize(ReactApplicationContext reactApplicationContext, List<? extends ReactPackage> packages) {
        if (reactApplicationContext.isBridgeless()) {
            new Thread(new ac.a(this, reactApplicationContext, packages, 10)).start();
        } else {
            initializeModules(reactApplicationContext, packages);
            this.initTasksLeft.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$0(ReactPackageTurboModuleManagerDelegate reactPackageTurboModuleManagerDelegate, ReactApplicationContext reactApplicationContext, List list) {
        reactPackageTurboModuleManagerDelegate.initializeModules(reactApplicationContext, list);
        reactPackageTurboModuleManagerDelegate.initTasksLeft.countDown();
    }

    private final void initializeModules(final ReactApplicationContext reactApplicationContext, List<? extends ReactPackage> packages) {
        String name;
        ReactModuleInfo reactModuleInfo;
        for (ReactPackage reactPackage : packages) {
            if (reactPackage instanceof BaseReactPackage) {
                final BaseReactPackage baseReactPackage = (BaseReactPackage) reactPackage;
                ModuleProvider moduleProvider = new ModuleProvider() { // from class: com.facebook.react.e
                    @Override // com.facebook.react.ReactPackageTurboModuleManagerDelegate.ModuleProvider
                    public final NativeModule getModule(String str) {
                        return ReactPackageTurboModuleManagerDelegate.initializeModules$lambda$1(baseReactPackage, reactApplicationContext, str);
                    }
                };
                this.moduleProviders.add(moduleProvider);
                this.packageModuleInfos.put(moduleProvider, baseReactPackage.getReactModuleInfoProvider().getReactModuleInfos());
            } else if (getShouldEnableLegacyModuleInterop()) {
                List<NativeModule> listCreateNativeModules = reactPackage.createNativeModules(reactApplicationContext);
                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (NativeModule nativeModule : listCreateNativeModules) {
                    Class<?> cls = nativeModule.getClass();
                    ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
                    if (reactModule == null || (name = reactModule.name()) == null) {
                        name = nativeModule.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    }
                    String str = name;
                    if (reactModule != null) {
                        String name2 = cls.getName();
                        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                        reactModuleInfo = new ReactModuleInfo(str, name2, reactModule.canOverrideExistingModule(), true, false, ReactModuleInfo.INSTANCE.classIsTurboModule(cls));
                    } else {
                        String name3 = cls.getName();
                        Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
                        reactModuleInfo = new ReactModuleInfo(str, name3, nativeModule.canOverrideExistingModule(), true, false, ReactModuleInfo.INSTANCE.classIsTurboModule(cls));
                    }
                    linkedHashMap2.put(str, reactModuleInfo);
                    linkedHashMap.put(str, nativeModule);
                }
                ModuleProvider moduleProvider2 = new ModuleProvider() { // from class: com.facebook.react.f
                    @Override // com.facebook.react.ReactPackageTurboModuleManagerDelegate.ModuleProvider
                    public final NativeModule getModule(String str2) {
                        return ReactPackageTurboModuleManagerDelegate.initializeModules$lambda$2(linkedHashMap, str2);
                    }
                };
                this.moduleProviders.add(moduleProvider2);
                this.packageModuleInfos.put(moduleProvider2, linkedHashMap2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule initializeModules$lambda$1(ReactPackage reactPackage, ReactApplicationContext reactApplicationContext, String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        return ((BaseReactPackage) reactPackage).getModule(moduleName, reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule initializeModules$lambda$2(Map map, String module) {
        Intrinsics.checkNotNullParameter(module, "module");
        return (NativeModule) map.get(module);
    }

    /* JADX INFO: renamed from: shouldSupportLegacyPackages, reason: from getter */
    private final boolean getShouldEnableLegacyModuleInterop() {
        return this.shouldEnableLegacyModuleInterop;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    @NotNull
    public List<String> getEagerInitModuleNames() {
        Collection<ReactModuleInfo> collectionValues;
        try {
            this.initTasksLeft.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        sn.e eVarB = c0.b();
        Iterator<ModuleProvider> it = this.moduleProviders.iterator();
        while (it.hasNext()) {
            Map<String, ReactModuleInfo> map = this.packageModuleInfos.get(it.next());
            if (map == null || (collectionValues = map.values()) == null) {
                collectionValues = n0.f14659d;
            }
            for (ReactModuleInfo reactModuleInfo : collectionValues) {
                if (reactModuleInfo.getIsTurboModule() && reactModuleInfo.getNeedsEagerInit()) {
                    eVarB.add(reactModuleInfo.getName());
                }
            }
        }
        return c0.a(eVarB);
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public NativeModule getLegacyModule(@NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        try {
            this.initTasksLeft.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        if (this.shouldEnableLegacyModuleInterop) {
            NativeModule nativeModule = null;
            for (ModuleProvider moduleProvider : this.moduleProviders) {
                Map<String, ReactModuleInfo> map = this.packageModuleInfos.get(moduleProvider);
                ReactModuleInfo reactModuleInfo = map != null ? map.get(moduleName) : null;
                if (reactModuleInfo != null && !reactModuleInfo.getIsTurboModule() && (nativeModule == null || reactModuleInfo.getCanOverrideExistingModule())) {
                    NativeModule module = moduleProvider.getModule(moduleName);
                    if (module != null) {
                        nativeModule = module;
                    }
                }
            }
            if (!(nativeModule instanceof TurboModule)) {
                return nativeModule;
            }
        }
        return null;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public TurboModule getModule(@NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        try {
            this.initTasksLeft.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        NativeModule nativeModule = null;
        for (ModuleProvider moduleProvider : this.moduleProviders) {
            Map<String, ReactModuleInfo> map = this.packageModuleInfos.get(moduleProvider);
            ReactModuleInfo reactModuleInfo = map != null ? map.get(moduleName) : null;
            if (reactModuleInfo != null && reactModuleInfo.getIsTurboModule() && (nativeModule == null || reactModuleInfo.getCanOverrideExistingModule())) {
                NativeModule module = moduleProvider.getModule(moduleName);
                if (module != null) {
                    nativeModule = module;
                }
            }
        }
        if (!(nativeModule instanceof TurboModule)) {
            return null;
        }
        Intrinsics.checkNotNull(nativeModule, "null cannot be cast to non-null type com.facebook.react.turbomodule.core.interfaces.TurboModule");
        return (TurboModule) nativeModule;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_isLegacyModuleRegistered(@NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        try {
            this.initTasksLeft.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        Iterator<ModuleProvider> it = this.moduleProviders.iterator();
        while (it.hasNext()) {
            Map<String, ReactModuleInfo> map = this.packageModuleInfos.get(it.next());
            ReactModuleInfo reactModuleInfo = map != null ? map.get(moduleName) : null;
            if (reactModuleInfo != null && !reactModuleInfo.getIsTurboModule()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_isModuleRegistered(@NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        try {
            this.initTasksLeft.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        Iterator<ModuleProvider> it = this.moduleProviders.iterator();
        while (it.hasNext()) {
            Map<String, ReactModuleInfo> map = this.packageModuleInfos.get(it.next());
            ReactModuleInfo reactModuleInfo = map != null ? map.get(moduleName) : null;
            if (reactModuleInfo != null && reactModuleInfo.getIsTurboModule()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactPackageTurboModuleManagerDelegate(@NotNull ReactApplicationContext reactApplicationContext, @NotNull List<? extends ReactPackage> packages, @NotNull HybridData hybridData) {
        super(hybridData);
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        Intrinsics.checkNotNullParameter(packages, "packages");
        Intrinsics.checkNotNullParameter(hybridData, "hybridData");
        this.moduleProviders = new ArrayList();
        this.packageModuleInfos = new LinkedHashMap();
        this.shouldEnableLegacyModuleInterop = ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture() && ReactNativeNewArchitectureFeatureFlags.useTurboModuleInterop();
        this.initTasksLeft = new CountDownLatch(1);
        initialize(reactApplicationContext, packages);
    }
}
