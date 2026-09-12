package ShiggyXposed.xposed;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.constraintlayout.widget.ConstraintLayout;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import io.ktor.http.ContentDisposition;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObjectBuilder;

/* JADX INFO: compiled from: Module.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002,-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\f\u0010\u0014\u001a\u00020\u0015*\u00020\u0010H\u0004J\f\u0010\u0016\u001a\u00020\u0005*\u00020\u0017H\u0004J\f\u0010\u0018\u001a\u00020\u0005*\u00020\u0017H\u0004J=\u0010\u0019\u001a\u00020\u001a*\u0006\u0012\u0002\b\u00030\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u001e\u0010\u001e\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u001b0\u001f\"\b\u0012\u0002\b\u0003\u0018\u00010\u001bH\u0004¢\u0006\u0002\u0010 J\u001a\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b*\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001dH\u0004J\u0018\u0010#\u001a\u00060$R\u00020%*\u00020\u001a2\u0006\u0010#\u001a\u00020%H\u0004J)\u0010#\u001a\u00060$R\u00020%*\u00020\u001a2\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00050'¢\u0006\u0002\b)H\u0004JZ\u0010*\u001a\u00060$R\u00020%*\u0006\u0012\u0002\b\u00030\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u001e\u0010\u001e\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u001b0\u001f\"\b\u0012\u0002\b\u0003\u0018\u00010\u001b2\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00050'¢\u0006\u0002\b)H\u0004¢\u0006\u0002\u0010+¨\u0006."}, d2 = {"LShiggyXposed/xposed/Module;", "", "<init>", "()V", "buildPayload", "", "builder", "Lkotlinx/serialization/json/JsonObjectBuilder;", "onInit", "startupParam", "Lde/robv/android/xposed/IXposedHookZygoteInit$StartupParam;", "onLoad", "packageParam", "Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;", "onContext", "context", "Landroid/content/Context;", "onActivity", "activity", "Landroid/app/Activity;", "getAppInfo", "LShiggyXposed/xposed/AppInfo;", "asDir", "Ljava/io/File;", "asFile", "method", "Ljava/lang/reflect/Method;", "Ljava/lang/Class;", ContentDisposition.Parameters.Name, "", "params", "", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "safeLoadClass", "Ljava/lang/ClassLoader;", "hook", "Lde/robv/android/xposed/XC_MethodHook$Unhook;", "Lde/robv/android/xposed/XC_MethodHook;", "block", "Lkotlin/Function1;", "LShiggyXposed/xposed/Module$MethodHookBuilder;", "Lkotlin/ExtensionFunctionType;", "hookMethod", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Lkotlin/jvm/functions/Function1;)Lde/robv/android/xposed/XC_MethodHook$Unhook;", "MethodHookBuilder", "HookScope", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public abstract class Module {
    @Deprecated(message = "This will be removed in future versions. Payloads can be replaced via synchronous bridge methods.")
    public void buildPayload(JsonObjectBuilder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
    }

    public void onActivity(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public void onContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void onInit(IXposedHookZygoteInit.StartupParam startupParam) {
        Intrinsics.checkNotNullParameter(startupParam, "startupParam");
    }

    public void onLoad(XC_LoadPackage.LoadPackageParam packageParam) {
        Intrinsics.checkNotNullParameter(packageParam, "packageParam");
    }

    protected final AppInfo getAppInfo(Context context) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(context, "<this>");
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
        String string = context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        String strValueOf = packageInfo.versionName;
        if (strValueOf == null) {
            strValueOf = String.valueOf(longVersionCode);
        }
        return new AppInfo(string, packageName, strValueOf, longVersionCode);
    }

    protected final void asDir(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        if (!file.isDirectory()) {
            file.delete();
        }
        file.mkdirs();
    }

    protected final void asFile(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        if (file.isFile()) {
            return;
        }
        FilesKt.deleteRecursively(file);
    }

    protected final Method method(Class<?> cls, String name, Class<?>... params) throws NoSuchMethodException {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(params, "params");
        Method declaredMethod = cls.getDeclaredMethod(name, (Class[]) Arrays.copyOf(params, params.length));
        declaredMethod.setAccessible(true);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "apply(...)");
        return declaredMethod;
    }

    protected final Class<?> safeLoadClass(ClassLoader classLoader, String name) {
        Object objM453constructorimpl;
        Intrinsics.checkNotNullParameter(classLoader, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM453constructorimpl = Result.m453constructorimpl(classLoader.loadClass(name));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM453constructorimpl = Result.m453constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m459isFailureimpl(objM453constructorimpl)) {
            objM453constructorimpl = null;
        }
        return (Class) objM453constructorimpl;
    }

    protected final XC_MethodHook.Unhook hook(Method method, XC_MethodHook hook) {
        Intrinsics.checkNotNullParameter(method, "<this>");
        Intrinsics.checkNotNullParameter(hook, "hook");
        XC_MethodHook.Unhook unhookHookMethod = XposedBridge.hookMethod(method, hook);
        Intrinsics.checkNotNullExpressionValue(unhookHookMethod, "hookMethod(...)");
        return unhookHookMethod;
    }

    protected final XC_MethodHook.Unhook hook(Method method, Function1<? super MethodHookBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(method, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        MethodHookBuilder methodHookBuilder = new MethodHookBuilder();
        block.invoke(methodHookBuilder);
        return hook(method, methodHookBuilder.build());
    }

    protected final XC_MethodHook.Unhook hookMethod(Class<?> cls, String name, Class<?>[] params, Function1<? super MethodHookBuilder, Unit> block) throws NoSuchMethodException {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(block, "block");
        Method method = method(cls, name, (Class[]) Arrays.copyOf(params, params.length));
        MethodHookBuilder methodHookBuilder = new MethodHookBuilder();
        block.invoke(methodHookBuilder);
        return hook(method, methodHookBuilder.build());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: compiled from: Module.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00072\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bJ\u001f\u0010\f\u001a\u00020\u00072\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bJ\u0006\u0010\r\u001a\u00020\u000eR!\u0010\u0004\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\bX\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"LShiggyXposed/xposed/Module$MethodHookBuilder;", "", "<init>", "()V", "beforeBlock", "Lkotlin/Function1;", "LShiggyXposed/xposed/Module$HookScope;", "", "Lkotlin/ExtensionFunctionType;", "afterBlock", "before", "block", "after", "build", "Lde/robv/android/xposed/XC_MethodHook;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class MethodHookBuilder {
        private Function1<? super HookScope, Unit> afterBlock;
        private Function1<? super HookScope, Unit> beforeBlock;

        public final void before(Function1<? super HookScope, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            this.beforeBlock = block;
        }

        public final void after(Function1<? super HookScope, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            this.afterBlock = block;
        }

        public final XC_MethodHook build() {
            return new Module$MethodHookBuilder$build$1(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: compiled from: Module.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0004\u001a\u00020\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R(\u0010\u0013\u001a\u0004\u0018\u00010\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u0016R(\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LShiggyXposed/xposed/Module$HookScope;", "", "param", "Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;", "proceed", "Lkotlin/Function1;", "", "<init>", "(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lkotlin/jvm/functions/Function1;)V", "getParam", "()Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;", "thisObject", "getThisObject", "()Ljava/lang/Object;", "args", "", "getArgs", "()[Ljava/lang/Object;", "value", "result", "getResult", "setResult", "(Ljava/lang/Object;)V", "", "throwable", "getThrowable", "()Ljava/lang/Throwable;", "setThrowable", "(Ljava/lang/Throwable;)V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class HookScope {
        private final XC_MethodHook.MethodHookParam param;
        private final Function1<XC_MethodHook.MethodHookParam, Unit> proceed;

        public HookScope(XC_MethodHook.MethodHookParam param, Function1<? super XC_MethodHook.MethodHookParam, Unit> proceed) {
            Intrinsics.checkNotNullParameter(param, "param");
            Intrinsics.checkNotNullParameter(proceed, "proceed");
            this.param = param;
            this.proceed = proceed;
        }

        public final XC_MethodHook.MethodHookParam getParam() {
            return this.param;
        }

        public final void proceed() {
            this.proceed.invoke(this.param);
        }

        public final Object getThisObject() {
            return this.param.thisObject;
        }

        public final Object[] getArgs() {
            Object[] args = this.param.args;
            Intrinsics.checkNotNullExpressionValue(args, "args");
            return args;
        }

        public final Object getResult() {
            return this.param.getResult();
        }

        public final void setResult(Object obj) {
            this.param.setResult(obj);
        }

        public final Throwable getThrowable() {
            return this.param.getThrowable();
        }

        public final void setThrowable(Throwable th) {
            this.param.setThrowable(th);
        }
    }
}
