package ShiggyXposed.xposed.modules;

import ShiggyXposed.xposed.BuildConfig;
import ShiggyXposed.xposed.Module;
import ShiggyXposed.xposed.Utils;
import android.content.res.AssetManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;

/* JADX INFO: compiled from: PayloadGlobalModule.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\t2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\f\u001a\u00020\u000fH\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"LShiggyXposed/xposed/modules/PayloadGlobalModule;", "LShiggyXposed/xposed/Module;", "modules", "", "<init>", "(Ljava/util/List;)V", "getPayloadString", "", "onLoad", "", "packageParam", "Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;", "hook", "instance", "Ljava/lang/Class;", "Lde/robv/android/xposed/XC_MethodHook;", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class PayloadGlobalModule extends Module {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String GLOBAL_NAME = "__PYON_LOADER__";
    private final List<Module> modules;

    /* JADX INFO: compiled from: PayloadGlobalModule.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"LShiggyXposed/xposed/modules/PayloadGlobalModule$Companion;", "", "<init>", "()V", "GLOBAL_NAME", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PayloadGlobalModule(List<? extends Module> modules) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        this.modules = modules;
    }

    private final String getPayloadString() {
        Json json = Utils.INSTANCE.getJSON();
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder, "loaderName", "ShiggyXposed");
        JsonElementBuildersKt.put(jsonObjectBuilder, "loaderVersion", BuildConfig.VERSION_NAME);
        Iterator<Module> it = this.modules.iterator();
        while (it.hasNext()) {
            it.next().buildPayload(jsonObjectBuilder);
        }
        JsonObject jsonObjectBuild = jsonObjectBuilder.build();
        json.getSerializersModule();
        return json.encodeToString(JsonObject.INSTANCE.serializer(), jsonObjectBuild);
    }

    @Override // ShiggyXposed.xposed.Module
    public void onLoad(final XC_LoadPackage.LoadPackageParam packageParam) {
        Intrinsics.checkNotNullParameter(packageParam, "packageParam");
        ClassLoader classLoader = packageParam.classLoader;
        Intrinsics.checkNotNullExpressionValue(classLoader, "classLoader");
        final Class<?> clsSafeLoadClass = safeLoadClass(classLoader, "com.facebook.react.bridge.CatalystInstanceImpl");
        ClassLoader classLoader2 = packageParam.classLoader;
        Intrinsics.checkNotNullExpressionValue(classLoader2, "classLoader");
        final Class<?> clsSafeLoadClass2 = safeLoadClass(classLoader2, "com.facebook.react.runtime.ReactInstance$loadJSBundle$1");
        if (clsSafeLoadClass2 == null) {
            ClassLoader classLoader3 = packageParam.classLoader;
            Intrinsics.checkNotNullExpressionValue(classLoader3, "classLoader");
            clsSafeLoadClass2 = safeLoadClass(classLoader3, "com.facebook.react.runtime.ReactInstance$1");
        }
        final Function3 function3 = new Function3() { // from class: ShiggyXposed.xposed.modules.PayloadGlobalModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return PayloadGlobalModule.onLoad$lambda$8$lambda$4(packageParam, this, clsSafeLoadClass, clsSafeLoadClass2, (XC_MethodHook.MethodHookParam) obj, (String) obj2, (String) obj3);
            }
        };
        Module.MethodHookBuilder methodHookBuilder = new Module.MethodHookBuilder();
        methodHookBuilder.before(new Function1() { // from class: ShiggyXposed.xposed.modules.PayloadGlobalModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PayloadGlobalModule.onLoad$lambda$8$lambda$6$lambda$5(function3, this, (Module.HookScope) obj);
            }
        });
        XC_MethodHook xC_MethodHookBuild = methodHookBuilder.build();
        for (Class<?> cls : CollectionsKt.listOf((Object[]) new Class[]{clsSafeLoadClass, clsSafeLoadClass2})) {
            if (cls != null) {
                hook(cls, xC_MethodHookBuild);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLoad$lambda$8$lambda$4(XC_LoadPackage.LoadPackageParam loadPackageParam, PayloadGlobalModule payloadGlobalModule, Class cls, Class cls2, XC_MethodHook.MethodHookParam param, String key, String json) {
        Object objM453constructorimpl;
        Intrinsics.checkNotNullParameter(param, "param");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            Result.Companion companion = Result.INSTANCE;
            Intrinsics.checkNotNull(cls);
            objM453constructorimpl = Result.m453constructorimpl(payloadGlobalModule.method(cls, "setGlobalVariable", String.class, String.class).invoke(param.thisObject, key, json));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM453constructorimpl = Result.m453constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m456exceptionOrNullimpl(objM453constructorimpl) != null) {
            File file = new File(new File(loadPackageParam.appInfo.dataDir + "/files/pyoncord", HookScriptLoaderModule.PRELOADS_DIR), "rv_globals_" + key + ".js");
            StringBuilder sb = new StringBuilder("this[");
            Json json2 = Utils.INSTANCE.getJSON();
            json2.getSerializersModule();
            FilesKt.writeText$default(file, sb.append(json2.encodeToString(StringSerializer.INSTANCE, key)).append("]=").append(json).toString(), null, 2, null);
            Intrinsics.checkNotNull(cls2);
            XposedBridge.invokeOriginalMethod(payloadGlobalModule.method(cls2, "loadScriptFromFile", String.class, String.class, Boolean.TYPE), param.thisObject, new Object[]{file.getAbsolutePath(), file.getAbsolutePath(), param.args[2]});
            file.delete();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLoad$lambda$8$lambda$6$lambda$5(Function3 function3, PayloadGlobalModule payloadGlobalModule, Module.HookScope before) {
        Intrinsics.checkNotNullParameter(before, "$this$before");
        function3.invoke(before.getParam(), GLOBAL_NAME, payloadGlobalModule.getPayloadString());
        return Unit.INSTANCE;
    }

    private final void hook(Class<?> instance, XC_MethodHook hook) {
        hook(method(instance, "loadScriptFromAssets", AssetManager.class, String.class, Boolean.TYPE), hook);
        hook(method(instance, "loadScriptFromFile", String.class, String.class, Boolean.TYPE), hook);
    }
}
