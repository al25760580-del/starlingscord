package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/NativeModuleRegistryBuilder;", "", "reactApplicationContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "reactInstanceManager", "Lcom/facebook/react/ReactInstanceManager;", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/ReactInstanceManager;)V", "modules", "Ljava/util/HashMap;", "", "Lcom/facebook/react/bridge/ModuleHolder;", "Lkotlin/collections/HashMap;", "processPackage", "", "reactPackage", "Lcom/facebook/react/ReactPackage;", "build", "Lcom/facebook/react/bridge/NativeModuleRegistry;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@rn.d
public final class NativeModuleRegistryBuilder {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final HashMap<String, ModuleHolder> modules;

    @NotNull
    private final ReactApplicationContext reactApplicationContext;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/react/NativeModuleRegistryBuilder$Companion;", "", "<init>", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("NativeModuleRegistryBuilder", LegacyArchitectureLogLevel.ERROR);
    }

    public NativeModuleRegistryBuilder(@NotNull ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        this.reactApplicationContext = reactApplicationContext;
        this.modules = new HashMap<>();
    }

    @NotNull
    public final NativeModuleRegistry build() {
        return new NativeModuleRegistry(this.reactApplicationContext, this.modules);
    }

    public final void processPackage(@NotNull ReactPackage reactPackage) {
        Intrinsics.checkNotNullParameter(reactPackage, "reactPackage");
        for (ModuleHolder moduleHolder : reactPackage instanceof BaseReactPackage ? ((BaseReactPackage) reactPackage).getNativeModuleIterator$ReactAndroid_release(this.reactApplicationContext) : ReactPackageHelper.INSTANCE.getNativeModuleIterator(reactPackage, this.reactApplicationContext)) {
            String name = moduleHolder.getName();
            ModuleHolder moduleHolder2 = this.modules.get(name);
            if (moduleHolder2 != null && !moduleHolder.getCanOverrideExistingModule()) {
                throw new IllegalStateException(g.f("\nNative module ", name, " tried to override ", moduleHolder2.getClassName(), ".\n\nCheck the getPackages() method in MainApplication.java, it might be that module is being created twice.\nIf this was your intention, set canOverrideExistingModule=true. This error may also be present if the\npackage is present only once in getPackages() but is also automatically added later during build time\nby autolinking. Try removing the existing entry and rebuild.\n").toString());
            }
            this.modules.put(name, moduleHolder);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @rn.d
    public NativeModuleRegistryBuilder(@NotNull ReactApplicationContext reactApplicationContext, @NotNull ReactInstanceManager reactInstanceManager) {
        this(reactApplicationContext);
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        Intrinsics.checkNotNullParameter(reactInstanceManager, "reactInstanceManager");
    }
}
