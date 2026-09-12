package ShiggyXposed.xposed.modules.bridge;

import ShiggyXposed.xposed.BuildConfig;
import ShiggyXposed.xposed.Module;
import ShiggyXposed.xposed.Utils;
import androidx.constraintlayout.widget.ConstraintLayout;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import io.ktor.http.ContentDisposition;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BridgeModule.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JP\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\t2@\u0010\u0018\u001a<\u0012,\u0012*\u0012\u0004\u0012\u00020\u00100\u000fj\u0011`\u0014¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000ej\u0002`\u0015J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0002J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0010*\u0004\u0018\u00010\u0010H\u0002J0\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001ej\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0010`\u001f2\u0006\u0010 \u001a\u00020\u0010H\u0002J@\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\"2&\u0010#\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001ej\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0010`\u001fH\u0002J\u0082\u0001\u0010$\u001aT\u0012>\u0012<\u0012,\u0012*\u0012\u0004\u0012\u00020\u00100\u000fj\u0011`\u0014¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000ej\u0002`\u0015\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00100\u000fj\u0002`\u0014\u0018\u00010%2&\u0010#\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001ej\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0010`\u001fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000RT\u0010\f\u001aH\u0012\u0004\u0012\u00020\t\u0012>\u0012<\u0012,\u0012*\u0012\u0004\u0012\u00020\u00100\u000fj\u0011`\u0014¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000ej\u0002`\u00150\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"LShiggyXposed/xposed/modules/bridge/BridgeModule;", "LShiggyXposed/xposed/Module;", "<init>", "()V", "readableMapGetString", "Ljava/lang/reflect/Method;", "readableMapToHashMap", "argumentsMakeNative", "CALL_DATA_KEY", "", "METHOD_NAME_KEY", "METHOD_ARGS_KEY", "methods", "", "Lkotlin/Function1;", "Ljava/util/ArrayList;", "", "Lkotlin/ParameterName;", ContentDisposition.Parameters.Name, BridgeModule.METHOD_ARGS_KEY, "LShiggyXposed/xposed/modules/bridge/BridgeMethodArgs;", "LShiggyXposed/xposed/modules/bridge/BridgeMethodCallback;", "registerMethod", "", "callback", "onLoad", "packageParam", "Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;", "registerDefaultMethods", "toNativeObject", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "map", "callBridgeMethod", "", "hashMap", "getBridgeCallData", "Lkotlin/Pair;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class BridgeModule extends Module {
    private static final String CALL_DATA_KEY = "Shiggy";
    private static final String METHOD_ARGS_KEY = "args";
    private static final String METHOD_NAME_KEY = "method";
    private static Method argumentsMakeNative;
    private static Method readableMapGetString;
    private static Method readableMapToHashMap;
    public static final BridgeModule INSTANCE = new BridgeModule();
    private static final Map<String, Function1<ArrayList<Object>, Object>> methods = new LinkedHashMap();

    private BridgeModule() {
    }

    public final void registerMethod(String name, Function1<? super ArrayList<Object>, ? extends Object> callback) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Map<String, Function1<ArrayList<Object>, Object>> map = methods;
        if (map.containsKey(name)) {
            Utils.Log.INSTANCE.w("Bridge method already exists and will be overridden: " + name);
        }
        map.put(name, callback);
    }

    @Override // ShiggyXposed.xposed.Module
    public void onLoad(XC_LoadPackage.LoadPackageParam packageParam) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(packageParam, "packageParam");
        Class<?> clsLoadClass = packageParam.classLoader.loadClass("com.facebook.react.bridge.Arguments");
        Class<?> clsLoadClass2 = packageParam.classLoader.loadClass("com.facebook.react.bridge.ReadableMap");
        Class<?> clsLoadClass3 = packageParam.classLoader.loadClass("com.facebook.react.bridge.Promise");
        BridgeModule bridgeModule = INSTANCE;
        Intrinsics.checkNotNull(clsLoadClass3);
        final Method method = bridgeModule.method(clsLoadClass3, "resolve", Object.class);
        Intrinsics.checkNotNull(clsLoadClass);
        argumentsMakeNative = bridgeModule.method(clsLoadClass, "makeNativeObject", Object.class);
        Intrinsics.checkNotNull(clsLoadClass2);
        readableMapGetString = bridgeModule.method(clsLoadClass2, "getString", String.class);
        readableMapToHashMap = bridgeModule.method(clsLoadClass2, "toHashMap", new Class[0]);
        Class<?> clsLoadClass4 = packageParam.classLoader.loadClass("com.horcrux.svg.RNSVGRenderableManager");
        Intrinsics.checkNotNullExpressionValue(clsLoadClass4, "loadClass(...)");
        bridgeModule.hookMethod(clsLoadClass4, "getBBox", new Class[]{Double.class, clsLoadClass2}, new Function1() { // from class: ShiggyXposed.xposed.modules.bridge.BridgeModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BridgeModule.onLoad$lambda$6$lambda$2((Module.MethodHookBuilder) obj);
            }
        });
        Class<?> clsLoadClass5 = packageParam.classLoader.loadClass("com.facebook.react.modules.blob.FileReaderModule");
        Intrinsics.checkNotNullExpressionValue(clsLoadClass5, "loadClass(...)");
        bridgeModule.hookMethod(clsLoadClass5, "readAsDataURL", new Class[]{clsLoadClass2, clsLoadClass3}, new Function1() { // from class: ShiggyXposed.xposed.modules.bridge.BridgeModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BridgeModule.onLoad$lambda$6$lambda$5(method, (Module.MethodHookBuilder) obj);
            }
        });
        methods.clear();
        bridgeModule.registerDefaultMethods();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLoad$lambda$6$lambda$2(Module.MethodHookBuilder hookMethod) {
        Intrinsics.checkNotNullParameter(hookMethod, "$this$hookMethod");
        hookMethod.before(new Function1() { // from class: ShiggyXposed.xposed.modules.bridge.BridgeModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BridgeModule.onLoad$lambda$6$lambda$2$lambda$1((Module.HookScope) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLoad$lambda$6$lambda$2$lambda$1(Module.HookScope before) {
        Intrinsics.checkNotNullParameter(before, "$this$before");
        BridgeModule bridgeModule = INSTANCE;
        Object obj = before.getArgs()[1];
        Intrinsics.checkNotNull(obj);
        Map<String, Object> mapCallBridgeMethod = bridgeModule.callBridgeMethod(bridgeModule.readableMapToHashMap(obj));
        if (mapCallBridgeMethod != null) {
            before.setResult(bridgeModule.toNativeObject(mapCallBridgeMethod));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLoad$lambda$6$lambda$5(final Method method, Module.MethodHookBuilder hookMethod) {
        Intrinsics.checkNotNullParameter(hookMethod, "$this$hookMethod");
        hookMethod.before(new Function1() { // from class: ShiggyXposed.xposed.modules.bridge.BridgeModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BridgeModule.onLoad$lambda$6$lambda$5$lambda$4(method, (Module.HookScope) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLoad$lambda$6$lambda$5$lambda$4(Method method, Module.HookScope before) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(before, "$this$before");
        Object[] args = before.getArgs();
        Object obj = args[0];
        Object obj2 = args[1];
        BridgeModule bridgeModule = INSTANCE;
        Intrinsics.checkNotNull(obj);
        Map<String, Object> mapCallBridgeMethod = bridgeModule.callBridgeMethod(bridgeModule.readableMapToHashMap(obj));
        if (mapCallBridgeMethod != null) {
            method.invoke(obj2, bridgeModule.toNativeObject(mapCallBridgeMethod));
            before.setResult(null);
        }
        return Unit.INSTANCE;
    }

    private final void registerDefaultMethods() {
        Map<String, Function1<ArrayList<Object>, Object>> map = methods;
        map.put("Shiggy.info", new Function1() { // from class: ShiggyXposed.xposed.modules.bridge.BridgeModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BridgeModule.registerDefaultMethods$lambda$7((ArrayList) obj);
            }
        });
        map.put("Shiggy.test", new Function1() { // from class: ShiggyXposed.xposed.modules.bridge.BridgeModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BridgeModule.registerDefaultMethods$lambda$8((ArrayList) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object registerDefaultMethods$lambda$7(ArrayList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return MapsKt.mapOf(TuplesKt.to(ContentDisposition.Parameters.Name, "ShiggyXposed"), TuplesKt.to("version", Integer.valueOf(BuildConfig.VERSION_CODE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object registerDefaultMethods$lambda$8(ArrayList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return MapsKt.mapOf(TuplesKt.to("string", "string"), TuplesKt.to("number", 7256), TuplesKt.to("array", CollectionsKt.listOf("testing", 527737, CollectionsKt.listOf(true))), TuplesKt.to("object", MapsKt.mapOf(TuplesKt.to("nested", true))), TuplesKt.to("boolean", false), TuplesKt.to(METHOD_ARGS_KEY, it));
    }

    private final Object toNativeObject(Object obj) {
        Method method = argumentsMakeNative;
        if (method == null) {
            Intrinsics.throwUninitializedPropertyAccessException("argumentsMakeNative");
            method = null;
        }
        if (Intrinsics.areEqual(obj, Unit.INSTANCE)) {
            obj = null;
        }
        return method.invoke(null, obj);
    }

    private final HashMap<String, Object> readableMapToHashMap(Object map) throws IllegalAccessException, InvocationTargetException {
        Method method = readableMapToHashMap;
        if (method == null) {
            Intrinsics.throwUninitializedPropertyAccessException("readableMapToHashMap");
            method = null;
        }
        Object objInvoke = method.invoke(map, new Object[0]);
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any?>");
        return (HashMap) objInvoke;
    }

    private final Map<String, Object> callBridgeMethod(HashMap<String, Object> hashMap) {
        try {
            Pair<Function1<ArrayList<Object>, Object>, ArrayList<Object>> bridgeCallData = getBridgeCallData(hashMap);
            if (bridgeCallData == null) {
                return null;
            }
            return MapsKt.mapOf(TuplesKt.to("result", toNativeObject(bridgeCallData.component1().invoke(bridgeCallData.component2()))));
        } catch (Throwable th) {
            return MapsKt.mapOf(TuplesKt.to("error", ExceptionsKt.stackTraceToString(th)));
        }
    }

    private final Pair<Function1<ArrayList<Object>, Object>, ArrayList<Object>> getBridgeCallData(HashMap<String, Object> hashMap) {
        HashMap map = (HashMap) hashMap.get("Shiggy");
        if (map == null) {
            return null;
        }
        Object obj = map.get(METHOD_NAME_KEY);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Function1<ArrayList<Object>, Object> function1 = methods.get(str);
        if (function1 == null) {
            throw new Error("Method not registered: " + str);
        }
        Object obj2 = map.get(METHOD_ARGS_KEY);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any>");
        return new Pair<>(function1, (ArrayList) obj2);
    }
}
