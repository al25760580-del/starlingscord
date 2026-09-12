package com.swmansion.gesturehandler.react;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.turbomodule.core.interfaces.BindingsInstallerHolder;
import com.facebook.react.turbomodule.core.interfaces.TurboModuleWithJSIBindings;
import com.facebook.soloader.SoLoader;
import com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec;
import im.f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jm.h;
import jm.i;
import jm.j;
import jm.k;
import jm.m;
import km.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import s0.g;
import xa.a;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = "RNGestureHandlerModule")
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 O2\u00020\u00012\u00020\u0002:\u0001PB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u0010\u001a\u00020\u000f\"\b\b\u0000\u0010\b*\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0082 ¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H\u0082 ¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH\u0082 ¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000fH\u0082 ¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010!J'\u0010$\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b$\u0010%J'\u0010(\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020\"H\u0017¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b,\u0010+J\u001f\u0010.\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010-\u001a\u00020\rH\u0017¢\u0006\u0004\b.\u0010+J\u0017\u0010/\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"H\u0017¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u000fH\u0017¢\u0006\u0004\b1\u0010\u001fJ\u000f\u00102\u001a\u00020\u001bH\u0017¢\u0006\u0004\b2\u0010\u001dJ\u001f\u00103\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0007¢\u0006\u0004\b3\u0010\u0014J\u000f\u00104\u001a\u00020\u0018H\u0016¢\u0006\u0004\b4\u0010\u001aJ\u000f\u00105\u001a\u00020\u000fH\u0016¢\u0006\u0004\b5\u0010\u001fJ\u0015\u00108\u001a\u00020\u000f2\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u000f2\u0006\u00107\u001a\u000206¢\u0006\u0004\b:\u00109R\u0014\u0010;\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u0002060C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001c\u0010F\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\bF\u0010G\u0012\u0004\bH\u0010\u001fR\u0016\u0010I\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020K8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006Q"}, d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule;", "Lcom/swmansion/gesturehandler/NativeRNGestureHandlerModuleSpec;", "Lcom/facebook/react/turbomodule/core/interfaces/TurboModuleWithJSIBindings;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lim/f;", "T", "", "handlerName", "", "handlerTag", "Lcom/facebook/react/bridge/ReadableMap;", "config", "", "createGestureHandlerHelper", "(Ljava/lang/String;ILcom/facebook/react/bridge/ReadableMap;)V", "newState", "setGestureStateSync", "(II)V", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "Lcom/facebook/react/turbomodule/core/interfaces/BindingsInstallerHolder;", "getBindingsInstallerCxx", "()Lcom/facebook/react/turbomodule/core/interfaces/BindingsInstallerHolder;", "", "decorateUIRuntime", "()Z", "invalidateNative", "()V", "getName", "()Ljava/lang/String;", "", "handlerTagDouble", "createGestureHandler", "(Ljava/lang/String;DLcom/facebook/react/bridge/ReadableMap;)V", "viewTagDouble", "actionTypeDouble", "attachGestureHandler", "(DDD)V", "setGestureHandlerConfig", "(DLcom/facebook/react/bridge/ReadableMap;)V", "updateGestureHandlerConfig", "relations", "configureRelations", "dropGestureHandler", "(D)V", "flushOperations", "installUIRuntimeBindings", "setGestureHandlerState", "getBindingsInstaller", "invalidate", "Ljm/m;", "root", "registerRootHelper", "(Ljm/m;)V", "unregisterRootHelper", "moduleId", "I", "Lkm/c;", "eventDispatcher", "Lkm/c;", "Ljm/i;", "interactionManager", "Ljm/i;", "", "roots", "Ljava/util/List;", "mHybridData", "Lcom/facebook/jni/HybridData;", "getMHybridData$annotations", "uiRuntimeDecorated", "Z", "Ljm/k;", "getRegistry", "()Ljm/k;", "registry", "Companion", "jm/j", "react-native-gesture-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRNGestureHandlerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RNGestureHandlerModule.kt\ncom/swmansion/gesturehandler/react/RNGestureHandlerModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,211:1\n1#2:212\n*E\n"})
public final class RNGestureHandlerModule extends NativeRNGestureHandlerModuleSpec implements TurboModuleWithJSIBindings {

    @NotNull
    public static final String NAME = "RNGestureHandlerModule";
    private static int nextModuleId;

    @NotNull
    private final c eventDispatcher;

    @NotNull
    private final i interactionManager;

    @a
    @NotNull
    private HybridData mHybridData;
    private final int moduleId;

    @NotNull
    private final List<m> roots;
    private boolean uiRuntimeDecorated;

    @NotNull
    public static final j Companion = new j();

    @NotNull
    private static final Map<Integer, k> registries = new LinkedHashMap();

    static {
        SoLoader.m("gesturehandler");
    }

    public RNGestureHandlerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        int i7 = nextModuleId;
        nextModuleId = i7 + 1;
        this.moduleId = i7;
        ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext2, "getReactApplicationContext(...)");
        this.eventDispatcher = new c(reactApplicationContext2);
        this.interactionManager = new i();
        this.roots = new ArrayList();
        this.mHybridData = initHybrid();
        registries.put(Integer.valueOf(i7), new k());
    }

    private final <T extends f> void createGestureHandlerHelper(String handlerName, int handlerTag, ReadableMap config) {
        com.facebook.imagepipeline.nativecode.c cVar;
        if (getRegistry().f(handlerTag) != null) {
            throw new IllegalStateException(g.d(handlerTag, "Handler with tag ", " already exists. Please ensure that no Gesture instance is used across multiple GestureDetectors."));
        }
        Intrinsics.checkNotNullParameter(handlerName, "handlerName");
        int i7 = 0;
        while (true) {
            if (i7 >= 9) {
                cVar = null;
                break;
            }
            cVar = h.f13952a[i7];
            if (Intrinsics.areEqual(cVar.x(), handlerName)) {
                break;
            } else {
                i7++;
            }
        }
        if (cVar == null) {
            throw new JSApplicationIllegalArgumentException("Invalid handler name ".concat(handlerName));
        }
        f handler = cVar.l(getReactApplicationContext());
        handler.f11892d = handlerTag;
        handler.G = this.eventDispatcher;
        getRegistry().h(handler);
        this.interactionManager.a(handler, config);
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(config, "config");
        handler.D();
        cVar.O(handler, config);
    }

    private final native boolean decorateUIRuntime();

    private final native BindingsInstallerHolder getBindingsInstallerCxx();

    private static /* synthetic */ void getMHybridData$annotations() {
    }

    private final k getRegistry() {
        k kVar = registries.get(Integer.valueOf(this.moduleId));
        Intrinsics.checkNotNull(kVar);
        return kVar;
    }

    private final native HybridData initHybrid();

    private final native void invalidateNative();

    /* JADX INFO: Access modifiers changed from: private */
    public final void setGestureStateSync(int handlerTag, int newState) {
        UiThreadUtil.assertOnUiThread();
        f fVarF = getRegistry().f(handlerTag);
        if (fVarF != null) {
            if (newState == 4) {
                if (fVarF.f11896h != 2) {
                    return;
                }
                jm.f fVar = fVarF.f11895g;
                if (fVar != null) {
                    fVar.h(fVarF);
                }
            }
            if (newState == 1) {
                fVarF.m();
                return;
            }
            if (newState == 2) {
                fVarF.d();
                return;
            }
            if (newState == 3) {
                fVarF.e();
            } else if (newState == 4) {
                fVarF.a(true);
            } else {
                if (newState != 5) {
                    return;
                }
                fVarF.k();
            }
        }
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void attachGestureHandler(double handlerTagDouble, double viewTagDouble, double actionTypeDouble) {
        int i7 = (int) handlerTagDouble;
        if (!getRegistry().a(i7, (int) viewTagDouble, (int) actionTypeDouble, null)) {
            throw new JSApplicationIllegalArgumentException(g.d(i7, "Handler with tag ", " does not exists"));
        }
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void configureRelations(double handlerTagDouble, @NotNull ReadableMap relations) {
        Intrinsics.checkNotNullParameter(relations, "relations");
        int i7 = (int) handlerTagDouble;
        f fVarF = getRegistry().f(i7);
        if (fVarF == null) {
            return;
        }
        i iVar = this.interactionManager;
        iVar.f13953a.remove(i7);
        iVar.f13954b.remove(i7);
        iVar.f13955c.remove(i7);
        this.interactionManager.a(fVarF, relations);
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void createGestureHandler(@NotNull String handlerName, double handlerTagDouble, @NotNull ReadableMap config) {
        Intrinsics.checkNotNullParameter(handlerName, "handlerName");
        Intrinsics.checkNotNullParameter(config, "config");
        createGestureHandlerHelper(handlerName, (int) handlerTagDouble, config);
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void dropGestureHandler(double handlerTagDouble) {
        int i7 = (int) handlerTagDouble;
        i iVar = this.interactionManager;
        iVar.f13953a.remove(i7);
        iVar.f13954b.remove(i7);
        iVar.f13955c.remove(i7);
        getRegistry().e(i7);
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void flushOperations() {
    }

    @Override // com.facebook.react.turbomodule.core.interfaces.TurboModuleWithJSIBindings
    @NotNull
    public BindingsInstallerHolder getBindingsInstaller() {
        return getBindingsInstallerCxx();
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "RNGestureHandlerModule";
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public boolean installUIRuntimeBindings() {
        if (!this.uiRuntimeDecorated) {
            this.uiRuntimeDecorated = decorateUIRuntime();
        }
        return this.uiRuntimeDecorated;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        k registry = getRegistry();
        synchronized (registry) {
            registry.f13956a.clear();
            registry.f13957b.clear();
            registry.f13958c.clear();
        }
        i iVar = this.interactionManager;
        iVar.f13953a.clear();
        iVar.f13954b.clear();
        iVar.f13955c.clear();
        synchronized (this.roots) {
            while (!this.roots.isEmpty()) {
                try {
                    this.roots.size();
                    this.roots.get(0).b();
                    this.roots.size();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Unit unit = Unit.f14616a;
        }
        registries.remove(Integer.valueOf(this.moduleId));
        invalidateNative();
        super.invalidate();
    }

    public final void registerRootHelper(@NotNull m root) {
        Intrinsics.checkNotNullParameter(root, "root");
        synchronized (this.roots) {
            this.roots.contains(root);
            this.roots.add(root);
        }
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void setGestureHandlerConfig(double handlerTagDouble, @NotNull ReadableMap config) {
        com.facebook.imagepipeline.nativecode.c cVar;
        Intrinsics.checkNotNullParameter(config, "config");
        f handler = getRegistry().f((int) handlerTagDouble);
        if (handler == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(handler, "handler");
        int i7 = 0;
        while (true) {
            if (i7 >= 9) {
                cVar = null;
                break;
            }
            cVar = h.f13952a[i7];
            if (Intrinsics.areEqual(cVar.y(), handler.getClass())) {
                break;
            } else {
                i7++;
            }
        }
        if (cVar == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(config, "config");
        handler.D();
        cVar.O(handler, config);
    }

    @a
    public final void setGestureHandlerState(int handlerTag, int newState) {
        if (UiThreadUtil.isOnUiThread()) {
            setGestureStateSync(handlerTag, newState);
        } else {
            UiThreadUtil.runOnUiThread(new com.swmansion.reanimated.keyboard.c(this, handlerTag, newState, 1));
        }
    }

    public final void unregisterRootHelper(@NotNull m root) {
        Intrinsics.checkNotNullParameter(root, "root");
        synchronized (this.roots) {
            this.roots.remove(root);
        }
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void updateGestureHandlerConfig(double handlerTagDouble, @NotNull ReadableMap config) {
        com.facebook.imagepipeline.nativecode.c cVar;
        Intrinsics.checkNotNullParameter(config, "config");
        f handler = getRegistry().f((int) handlerTagDouble);
        if (handler == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(handler, "handler");
        int i7 = 0;
        while (true) {
            if (i7 >= 9) {
                cVar = null;
                break;
            }
            cVar = h.f13952a[i7];
            if (Intrinsics.areEqual(cVar.y(), handler.getClass())) {
                break;
            } else {
                i7++;
            }
        }
        if (cVar == null) {
            return;
        }
        cVar.O(handler, config);
    }
}
