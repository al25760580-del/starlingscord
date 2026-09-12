package com.facebook.react.internal.turbomodule.core;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.NativeMethodCallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.turbomodule.core.interfaces.NativeMethodCallInvokerHolder;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.soloader.SoLoader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 92\u00020\u0001:\u0003789B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u000eH\u0002J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u000eH\u0002J\u0012\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010 \u001a\u00020\u000eH\u0003J\u0012\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010 \u001a\u00020\u000eH\u0003J\u0012\u0010&\u001a\u0004\u0018\u00010#2\u0006\u0010 \u001a\u00020\u000eH\u0016J\"\u0010'\u001a\u0004\u0018\u00010#2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u0017H\u0002J\u0010\u0010.\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u000eH\u0016J#\u0010/\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u0002002\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0005H\u0082 J\u0011\u00104\u001a\u0002052\u0006\u0010\u0002\u001a\u00020\u0003H\u0082 J\b\u00106\u001a\u000205H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u001d\u0010\u001eR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020#0+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006:"}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;", "Lcom/facebook/react/internal/turbomodule/core/interfaces/TurboModuleRegistry;", "runtimeExecutor", "Lcom/facebook/react/bridge/RuntimeExecutor;", "delegate", "Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;", "jsCallInvokerHolder", "Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;", "nativeMethodCallInvokerHolder", "Lcom/facebook/react/turbomodule/core/interfaces/NativeMethodCallInvokerHolder;", "<init>", "(Lcom/facebook/react/bridge/RuntimeExecutor;Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;Lcom/facebook/react/turbomodule/core/interfaces/NativeMethodCallInvokerHolder;)V", "eagerInitModuleNames", "", "", "getEagerInitModuleNames", "()Ljava/util/List;", "turboModuleProvider", "Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleProvider;", "legacyModuleProvider", "moduleCleanupLock", "Ljava/lang/Object;", "moduleCleanupStarted", "", "moduleHolders", "", "Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;", "mHybridData", "Lcom/facebook/jni/HybridData;", "getMHybridData$annotations", "()V", "isTurboModule", "moduleName", "isLegacyModule", "getLegacyJavaModule", "Lcom/facebook/react/bridge/NativeModule;", "getTurboJavaModule", "Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;", "getModule", "getOrCreateModule", "moduleHolder", "shouldPerfLog", "modules", "", "getModules", "()Ljava/util/Collection;", "hasModule", "initHybrid", "Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;", "nativeMethodCallInvoker", "Lcom/facebook/react/turbomodule/core/NativeMethodCallInvokerHolderImpl;", "tmmDelegate", "dispatchJSBindingInstall", "", "invalidate", "ModuleHolder", "ModuleProvider", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTurboModuleManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TurboModuleManager.kt\ncom/facebook/react/internal/turbomodule/core/TurboModuleManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,371:1\n1#2:372\n1#2:383\n1617#3,9:373\n1869#3:382\n1870#3:384\n1626#3:385\n*S KotlinDebug\n*F\n+ 1 TurboModuleManager.kt\ncom/facebook/react/internal/turbomodule/core/TurboModuleManager\n*L\n270#1:383\n270#1:373,9\n270#1:382\n270#1:384\n270#1:385\n*E\n"})
public final class TurboModuleManager implements TurboModuleRegistry {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "TurboModuleManager";
    private final TurboModuleManagerDelegate delegate;

    @NotNull
    private final List<String> eagerInitModuleNames;

    @NotNull
    private final ModuleProvider legacyModuleProvider;

    @xa.a
    @NotNull
    private final HybridData mHybridData;

    @NotNull
    private final Object moduleCleanupLock;
    private boolean moduleCleanupStarted;

    @NotNull
    private final Map<String, ModuleHolder> moduleHolders;

    @NotNull
    private final ModuleProvider turboModuleProvider;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$Companion;", "", "<init>", "()V", "TAG", "", "getMethodDescriptorsFromModule", "", "Lcom/facebook/react/internal/turbomodule/core/TurboModuleInteropUtils$MethodDescriptor;", "module", "Lcom/facebook/react/bridge/NativeModule;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @xa.a
        public final List<TurboModuleInteropUtils.MethodDescriptor> getMethodDescriptorsFromModule(NativeModule module) {
            return TurboModuleInteropUtils.getMethodDescriptorsFromModule(module);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;", "", "<init>", "()V", "module", "Lcom/facebook/react/bridge/NativeModule;", "getModule", "()Lcom/facebook/react/bridge/NativeModule;", "setModule", "(Lcom/facebook/react/bridge/NativeModule;)V", "value", "", "isCreatingModule", "()Z", "isDoneCreatingModule", "", "moduleId", "getModuleId", "()I", "startCreatingModule", "", "endCreatingModule", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ModuleHolder {
        private static volatile int holderCount;
        private volatile boolean isCreatingModule;
        private volatile boolean isDoneCreatingModule;
        private volatile NativeModule module;
        private volatile int moduleId = holderCount;

        public ModuleHolder() {
            holderCount++;
        }

        public final void endCreatingModule() {
            this.isCreatingModule = false;
            this.isDoneCreatingModule = true;
        }

        public final NativeModule getModule() {
            return this.module;
        }

        public final int getModuleId() {
            return this.moduleId;
        }

        /* JADX INFO: renamed from: isCreatingModule, reason: from getter */
        public final boolean getIsCreatingModule() {
            return this.isCreatingModule;
        }

        /* JADX INFO: renamed from: isDoneCreatingModule, reason: from getter */
        public final boolean getIsDoneCreatingModule() {
            return this.isDoneCreatingModule;
        }

        public final void setModule(NativeModule nativeModule) {
            this.module = nativeModule;
        }

        public final void startCreatingModule() {
            this.isCreatingModule = true;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bâ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleProvider;", "", "getModule", "Lcom/facebook/react/bridge/NativeModule;", StackTraceHelper.NAME_KEY, "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ModuleProvider {
        NativeModule getModule(@NotNull String name);
    }

    static {
        SoLoader.m("turbomodulejsijni");
    }

    public TurboModuleManager(@NotNull RuntimeExecutor runtimeExecutor, TurboModuleManagerDelegate turboModuleManagerDelegate, @NotNull CallInvokerHolder jsCallInvokerHolder, @NotNull NativeMethodCallInvokerHolder nativeMethodCallInvokerHolder) {
        ModuleProvider moduleProvider;
        List<String> eagerInitModuleNames;
        Intrinsics.checkNotNullParameter(runtimeExecutor, "runtimeExecutor");
        Intrinsics.checkNotNullParameter(jsCallInvokerHolder, "jsCallInvokerHolder");
        Intrinsics.checkNotNullParameter(nativeMethodCallInvokerHolder, "nativeMethodCallInvokerHolder");
        this.delegate = turboModuleManagerDelegate;
        this.moduleCleanupLock = new Object();
        this.moduleHolders = new LinkedHashMap();
        this.mHybridData = initHybrid((CallInvokerHolderImpl) jsCallInvokerHolder, (NativeMethodCallInvokerHolderImpl) nativeMethodCallInvokerHolder, turboModuleManagerDelegate);
        dispatchJSBindingInstall(runtimeExecutor);
        this.eagerInitModuleNames = (turboModuleManagerDelegate == null || (eagerInitModuleNames = turboModuleManagerDelegate.getEagerInitModuleNames()) == null) ? n0.f14659d : eagerInitModuleNames;
        ModuleProvider aVar = new a();
        if (turboModuleManagerDelegate == null) {
            moduleProvider = aVar;
        } else {
            final int i7 = 0;
            moduleProvider = new ModuleProvider(this) { // from class: com.facebook.react.internal.turbomodule.core.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TurboModuleManager f5252b;

                {
                    this.f5252b = this;
                }

                @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManager.ModuleProvider
                public final NativeModule getModule(String str) {
                    switch (i7) {
                        case 0:
                            return TurboModuleManager._init_$lambda$1(this.f5252b, str);
                        default:
                            return TurboModuleManager._init_$lambda$3(this.f5252b, str);
                    }
                }
            };
        }
        this.turboModuleProvider = moduleProvider;
        if (turboModuleManagerDelegate != null) {
            final int i10 = 1;
            aVar = new ModuleProvider(this) { // from class: com.facebook.react.internal.turbomodule.core.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TurboModuleManager f5252b;

                {
                    this.f5252b = this;
                }

                @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManager.ModuleProvider
                public final NativeModule getModule(String str) {
                    switch (i10) {
                        case 0:
                            return TurboModuleManager._init_$lambda$1(this.f5252b, str);
                        default:
                            return TurboModuleManager._init_$lambda$3(this.f5252b, str);
                    }
                }
            };
        }
        this.legacyModuleProvider = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule _init_$lambda$0(String str) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule _init_$lambda$1(TurboModuleManager turboModuleManager, String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        return (NativeModule) turboModuleManager.delegate.getModule(moduleName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule _init_$lambda$3(TurboModuleManager turboModuleManager, String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        NativeModule legacyModule = turboModuleManager.delegate.getLegacyModule(moduleName);
        if (legacyModule == null) {
            return null;
        }
        if (legacyModule instanceof TurboModule) {
            throw new IllegalArgumentException(g.e("NativeModule \"", moduleName, "\" is a TurboModule").toString());
        }
        return legacyModule;
    }

    private final native void dispatchJSBindingInstall(RuntimeExecutor runtimeExecutor);

    @xa.a
    private final NativeModule getLegacyJavaModule(String moduleName) {
        if (!isLegacyModule(moduleName)) {
            return null;
        }
        NativeModule module = getModule(moduleName);
        if (module instanceof TurboModule) {
            return null;
        }
        return module;
    }

    private static /* synthetic */ void getMHybridData$annotations() {
    }

    @xa.a
    private static final List<TurboModuleInteropUtils.MethodDescriptor> getMethodDescriptorsFromModule(NativeModule nativeModule) {
        return INSTANCE.getMethodDescriptorsFromModule(nativeModule);
    }

    private final NativeModule getOrCreateModule(String moduleName, ModuleHolder moduleHolder, boolean shouldPerfLog) {
        boolean z5;
        NativeModule module;
        synchronized (moduleHolder) {
            try {
                if (moduleHolder.getIsDoneCreatingModule()) {
                    if (shouldPerfLog) {
                        TurboModulePerfLogger.moduleCreateCacheHit(moduleName, moduleHolder.getModuleId());
                    }
                    return moduleHolder.getModule();
                }
                boolean z6 = false;
                if (moduleHolder.getIsCreatingModule()) {
                    z5 = false;
                } else {
                    moduleHolder.startCreatingModule();
                    z5 = true;
                }
                Unit unit = Unit.f14616a;
                if (!z5) {
                    synchronized (moduleHolder) {
                        while (moduleHolder.getIsCreatingModule()) {
                            try {
                                Intrinsics.checkNotNull(moduleHolder, "null cannot be cast to non-null type java.lang.Object");
                                moduleHolder.wait();
                            } catch (InterruptedException unused) {
                                z6 = true;
                            }
                        }
                        if (z6) {
                            Thread.currentThread().interrupt();
                        }
                        module = moduleHolder.getModule();
                    }
                    return module;
                }
                TurboModulePerfLogger.moduleCreateConstructStart(moduleName, moduleHolder.getModuleId());
                NativeModule module2 = this.turboModuleProvider.getModule(moduleName);
                if (module2 == null) {
                    module2 = this.legacyModuleProvider.getModule(moduleName);
                }
                TurboModulePerfLogger.moduleCreateConstructEnd(moduleName, moduleHolder.getModuleId());
                TurboModulePerfLogger.moduleCreateSetUpStart(moduleName, moduleHolder.getModuleId());
                if (module2 != null) {
                    synchronized (moduleHolder) {
                        moduleHolder.setModule(module2);
                    }
                    module2.initialize();
                } else {
                    o8.a.i(TAG, "getOrCreateModule(): Unable to create module \"%s\" (legacy: %b, turbo: %b)", moduleName, Boolean.valueOf(isLegacyModule(moduleName)), Boolean.valueOf(isTurboModule(moduleName)));
                }
                TurboModulePerfLogger.moduleCreateSetUpEnd(moduleName, moduleHolder.getModuleId());
                synchronized (moduleHolder) {
                    moduleHolder.endCreatingModule();
                    Intrinsics.checkNotNull(moduleHolder, "null cannot be cast to non-null type java.lang.Object");
                    moduleHolder.notifyAll();
                }
                return module2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @xa.a
    private final TurboModule getTurboJavaModule(String moduleName) {
        if (!isTurboModule(moduleName)) {
            return null;
        }
        NativeModule module = getModule(moduleName);
        if (module instanceof TurboModule) {
            return (TurboModule) module;
        }
        return null;
    }

    private final native HybridData initHybrid(CallInvokerHolderImpl jsCallInvokerHolder, NativeMethodCallInvokerHolderImpl nativeMethodCallInvoker, TurboModuleManagerDelegate tmmDelegate);

    private final boolean isLegacyModule(String moduleName) {
        TurboModuleManagerDelegate turboModuleManagerDelegate = this.delegate;
        return turboModuleManagerDelegate != null && turboModuleManagerDelegate.unstable_isLegacyModuleRegistered(moduleName);
    }

    private final boolean isTurboModule(String moduleName) {
        TurboModuleManagerDelegate turboModuleManagerDelegate = this.delegate;
        return turboModuleManagerDelegate != null && turboModuleManagerDelegate.unstable_isModuleRegistered(moduleName);
    }

    @Override // com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry
    @NotNull
    public List<String> getEagerInitModuleNames() {
        return this.eagerInitModuleNames;
    }

    @Override // com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry
    public NativeModule getModule(@NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        synchronized (this.moduleCleanupLock) {
            if (this.moduleCleanupStarted) {
                o8.a.i(TAG, "getModule(): Tried to get module \"%s\", but TurboModuleManager was tearing down (legacy: %b, turbo: %b)", moduleName, Boolean.valueOf(isLegacyModule(moduleName)), Boolean.valueOf(isTurboModule(moduleName)));
                return null;
            }
            if (!this.moduleHolders.containsKey(moduleName)) {
                this.moduleHolders.put(moduleName, new ModuleHolder());
            }
            ModuleHolder moduleHolder = this.moduleHolders.get(moduleName);
            Unit unit = Unit.f14616a;
            if (moduleHolder == null) {
                o8.a.i(TAG, "getModule(): Tried to get module \"%s\", but moduleHolder was null", moduleName);
                return null;
            }
            ModuleHolder moduleHolder2 = moduleHolder;
            TurboModulePerfLogger.moduleCreateStart(moduleName, moduleHolder2.getModuleId());
            NativeModule orCreateModule = getOrCreateModule(moduleName, moduleHolder2, true);
            if (orCreateModule != null) {
                TurboModulePerfLogger.moduleCreateEnd(moduleName, moduleHolder2.getModuleId());
                return orCreateModule;
            }
            TurboModulePerfLogger.moduleCreateFail(moduleName, moduleHolder2.getModuleId());
            return orCreateModule;
        }
    }

    @Override // com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry
    @NotNull
    public Collection<NativeModule> getModules() {
        List<ModuleHolder> listI0;
        NativeModule module;
        synchronized (this.moduleCleanupLock) {
            listI0 = CollectionsKt.i0(this.moduleHolders.values());
        }
        ArrayList arrayList = new ArrayList();
        for (ModuleHolder moduleHolder : listI0) {
            synchronized (listI0) {
                module = moduleHolder.getModule();
            }
            if (module != null) {
                arrayList.add(module);
            }
        }
        return arrayList;
    }

    @Override // com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry
    public boolean hasModule(@NotNull String moduleName) {
        ModuleHolder moduleHolder;
        boolean z5;
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        synchronized (this.moduleCleanupLock) {
            moduleHolder = this.moduleHolders.get(moduleName);
        }
        if (moduleHolder == null) {
            return false;
        }
        synchronized (moduleHolder) {
            z5 = moduleHolder.getModule() != null;
        }
        return z5;
    }

    @Override // com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry
    public void invalidate() {
        synchronized (this.moduleCleanupLock) {
            this.moduleCleanupStarted = true;
            Unit unit = Unit.f14616a;
        }
        for (Map.Entry<String, ModuleHolder> entry : this.moduleHolders.entrySet()) {
            NativeModule orCreateModule = getOrCreateModule(entry.getKey(), entry.getValue(), false);
            if (orCreateModule != null) {
                orCreateModule.invalidate();
            }
        }
        this.moduleHolders.clear();
        this.mHybridData.resetNative();
    }
}
