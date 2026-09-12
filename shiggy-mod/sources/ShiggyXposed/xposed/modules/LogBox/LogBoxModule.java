package ShiggyXposed.xposed.modules.LogBox;

import ShiggyXposed.xposed.Module;
import ShiggyXposed.xposed.Utils;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: LogBoxModule.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\rH\u0002J\u001c\u0010\u0017\u001a\u00020\u00132\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010\u0015\u001a\u00020\rH\u0002J \u0010\u001a\u001a\u0004\u0018\u00010\r2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"LShiggyXposed/xposed/modules/LogBox/LogBoxModule;", "LShiggyXposed/xposed/Module;", "<init>", "()V", "packageParam", "Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;", "getPackageParam", "()Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;", "setPackageParam", "(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "contextForMenu", "Landroid/content/Context;", "getContextForMenu", "()Landroid/content/Context;", "setContextForMenu", "(Landroid/content/Context;)V", "onLoad", "", "onContext", "context", "tryFindDevSupportClasses", "hookDevSupportManager", "clazz", "Ljava/lang/Class;", "getContextFromDevSupport", "instance", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class LogBoxModule extends Module {
    private static Context contextForMenu;
    public static XC_LoadPackage.LoadPackageParam packageParam;
    public static final LogBoxModule INSTANCE = new LogBoxModule();
    private static final CoroutineScope scope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));

    private LogBoxModule() {
    }

    public final XC_LoadPackage.LoadPackageParam getPackageParam() {
        XC_LoadPackage.LoadPackageParam loadPackageParam = packageParam;
        if (loadPackageParam != null) {
            return loadPackageParam;
        }
        Intrinsics.throwUninitializedPropertyAccessException("packageParam");
        return null;
    }

    public final void setPackageParam(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        Intrinsics.checkNotNullParameter(loadPackageParam, "<set-?>");
        packageParam = loadPackageParam;
    }

    public final Context getContextForMenu() {
        return contextForMenu;
    }

    public final void setContextForMenu(Context context) {
        contextForMenu = context;
    }

    @Override // ShiggyXposed.xposed.Module
    public void onLoad(XC_LoadPackage.LoadPackageParam packageParam2) {
        Intrinsics.checkNotNullParameter(packageParam2, "packageParam");
        INSTANCE.setPackageParam(packageParam2);
        try {
            Method[] methods = packageParam2.classLoader.loadClass("com.discord.bridge.DCDReactNativeHost").getMethods();
            Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
            for (Method method : methods) {
                if (Intrinsics.areEqual(method.getName(), "getUseDeveloperSupport")) {
                    Method method2 = method;
                    LogBoxModule logBoxModule = INSTANCE;
                    Intrinsics.checkNotNull(method2);
                    logBoxModule.hook(method2, new Function1() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxModule$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LogBoxModule.onLoad$lambda$3$lambda$2((Module.MethodHookBuilder) obj);
                        }
                    });
                    Utils.Log.INSTANCE.e("Successfully hooked DCDReactNativeHost");
                    return;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Exception e) {
            Utils.Log.INSTANCE.e("Failed to hook DCDReactNativeHost: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLoad$lambda$3$lambda$2(Module.MethodHookBuilder hook) {
        Intrinsics.checkNotNullParameter(hook, "$this$hook");
        hook.before(new Function1() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LogBoxModule.onLoad$lambda$3$lambda$2$lambda$1((Module.HookScope) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLoad$lambda$3$lambda$2$lambda$1(Module.HookScope before) {
        Intrinsics.checkNotNullParameter(before, "$this$before");
        before.setResult(true);
        return Unit.INSTANCE;
    }

    @Override // ShiggyXposed.xposed.Module
    public void onContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Utils.Log.INSTANCE.e("onContext called with context: " + context);
            contextForMenu = context;
            boolean z = false;
            for (String str : CollectionsKt.listOf((Object[]) new String[]{"com.facebook.react.devsupport.BridgeDevSupportManager", "com.facebook.react.devsupport.BridgelessDevSupportManager", "com.facebook.react.devsupport.DevSupportManagerImpl", "com.facebook.react.devsupport.DevSupportManagerBase", "com.facebook.react.devsupport.DefaultDevSupportManager"})) {
                try {
                    LogBoxModule logBoxModule = INSTANCE;
                    Class<?> clsLoadClass = logBoxModule.getPackageParam().classLoader.loadClass(str);
                    Utils.Log.INSTANCE.e("Found class: " + str);
                    Intrinsics.checkNotNull(clsLoadClass);
                    logBoxModule.hookDevSupportManager(clsLoadClass, context);
                    z = true;
                } catch (Exception e) {
                    Utils.Log.INSTANCE.e("Class not found: " + str + " - " + e.getMessage());
                }
            }
            if (z) {
                return;
            }
            tryFindDevSupportClasses(context);
        } catch (Exception unused) {
        }
    }

    private final void tryFindDevSupportClasses(Context context) {
        try {
            getPackageParam().classLoader.getClass().getDeclaredField("pathList").setAccessible(true);
            Utils.Log.INSTANCE.e("Searching for DevSupport classes in classloader...");
        } catch (Exception e) {
            Utils.Log.INSTANCE.e("Could not search for classes: " + e.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0087  */
    private final void hookDevSupportManager(final Class<?> clazz, final Context context) {
        Method method;
        Method method2;
        Utils.Log.INSTANCE.e("Attempting to hook " + clazz.getName());
        Utils.Log.INSTANCE.e("Available methods in " + clazz.getSimpleName() + AbstractJsonLexerKt.COLON);
        Method[] methods = clazz.getMethods();
        Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
        Method[] methodArr = methods;
        int length = methodArr.length;
        int i = 0;
        while (true) {
            method = null;
            if (i < length) {
                Method method3 = methodArr[i];
                String name = method3.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (StringsKt.contains$default((CharSequence) name, (CharSequence) "Dev", false, 2, (Object) null)) {
                    Utils.Log.INSTANCE.e("  - " + method3.getName());
                } else {
                    String name2 = method3.getName();
                    Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                    if (StringsKt.contains$default((CharSequence) name2, (CharSequence) "Reload", false, 2, (Object) null)) {
                        Utils.Log.INSTANCE.e("  - " + method3.getName());
                    } else {
                        String name3 = method3.getName();
                        Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
                        if (StringsKt.contains$default((CharSequence) name3, (CharSequence) "Options", false, 2, (Object) null)) {
                            Utils.Log.INSTANCE.e("  - " + method3.getName());
                        }
                    }
                }
                i++;
            } else {
                try {
                    try {
                        break;
                    } catch (Exception e) {
                        Utils.Log.INSTANCE.e("Failed to hook handleReloadJS: " + e.getMessage());
                    }
                } catch (Exception unused) {
                    return;
                }
            }
        }
        Method[] methods2 = clazz.getMethods();
        Intrinsics.checkNotNullExpressionValue(methods2, "getMethods(...)");
        Method[] methodArr2 = methods2;
        int length2 = methodArr2.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                method2 = null;
                break;
            }
            method2 = methodArr2[i2];
            if (Intrinsics.areEqual(method2.getName(), "handleReloadJS")) {
                break;
            } else {
                i2++;
            }
        }
        Method method4 = method2;
        if (method4 != null) {
            XposedBridge.hookMethod(method4, new XC_MethodReplacement() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxModule.hookDevSupportManager.2
                protected Object replaceHookedMethod(XC_MethodHook.MethodHookParam param) {
                    Intrinsics.checkNotNullParameter(param, "param");
                    Utils.Log.INSTANCE.e("handleReloadJS called - reloading app");
                    Utils.INSTANCE.reloadApp();
                    return null;
                }
            });
        }
        Method[] methods3 = clazz.getMethods();
        Intrinsics.checkNotNullExpressionValue(methods3, "getMethods(...)");
        for (Method method5 : methods3) {
            if (Intrinsics.areEqual(method5.getName(), "showDevOptionsDialog")) {
                method = method5;
                break;
            }
        }
        Method method6 = method;
        if (method6 != null) {
            XposedBridge.hookMethod(method6, new XC_MethodReplacement() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxModule.hookDevSupportManager.3
                protected Object replaceHookedMethod(XC_MethodHook.MethodHookParam param) {
                    Context contextForMenu2;
                    Intrinsics.checkNotNullParameter(param, "param");
                    try {
                        contextForMenu2 = LogBoxModule.INSTANCE.getContextFromDevSupport(clazz, param.thisObject);
                        if (contextForMenu2 != null) {
                            try {
                                Utils.Log.INSTANCE.e("Successfully got context from DevSupport");
                            } catch (Exception e2) {
                                e = e2;
                                try {
                                    Utils.Log.INSTANCE.e("Failed to get context from DevSupport (non-fatal): " + e.getMessage());
                                } catch (Exception e3) {
                                    e3.printStackTrace();
                                }
                            }
                        }
                    } catch (Exception e4) {
                        e = e4;
                        contextForMenu2 = null;
                    }
                    if (contextForMenu2 == null && (contextForMenu2 = LogBoxModule.INSTANCE.getContextForMenu()) == null) {
                        contextForMenu2 = context;
                    }
                    Utils.Log.INSTANCE.e("Using context: " + contextForMenu2 + " (type: " + contextForMenu2.getClass().getName() + ')');
                    LogBoxNavigation.INSTANCE.showRecoveryMenu(contextForMenu2);
                    return null;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContextFromDevSupport(Class<?> clazz, Object instance) {
        Method method;
        if (instance == null) {
            Utils.Log.INSTANCE.e("getContextFromDevSupport: instance is null");
            return null;
        }
        try {
            for (String str : CollectionsKt.listOf((Object[]) new String[]{"mReactInstanceDevHelper", "reactInstanceDevHelper", "mReactInstanceManager", "mApplicationContext"})) {
                try {
                    Utils.Log.INSTANCE.e("Trying field: " + str);
                    Field fieldFindFieldIfExists = XposedHelpers.findFieldIfExists(clazz, str);
                    if (fieldFindFieldIfExists == null) {
                        Utils.Log.INSTANCE.e("Field " + str + " not found, skipping");
                    } else {
                        Object obj = fieldFindFieldIfExists.get(instance);
                        if (obj == null) {
                            Utils.Log.INSTANCE.e("Field " + str + " is null, skipping");
                        } else {
                            if (obj instanceof Context) {
                                Utils.Log.INSTANCE.e("Field " + str + " is a Context, returning it");
                                return (Context) obj;
                            }
                            Method[] methods = obj.getClass().getMethods();
                            Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
                            Method[] methodArr = methods;
                            int length = methodArr.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    method = null;
                                    break;
                                }
                                method = methodArr[i];
                                if (Intrinsics.areEqual(method.getName(), "getCurrentActivity")) {
                                    break;
                                }
                                i++;
                            }
                            Method method2 = method;
                            if (method2 != null) {
                                Object objInvoke = method2.invoke(obj, new Object[0]);
                                Context context = objInvoke instanceof Context ? (Context) objInvoke : null;
                                if (context != null) {
                                    Utils.Log.INSTANCE.e("Got context from " + str + ".getCurrentActivity()");
                                    return context;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                } catch (Exception e) {
                    Utils.Log.INSTANCE.e("Error trying " + str + ": " + e.getMessage());
                }
            }
            Utils.Log.INSTANCE.e("Could not get context from DevSupport object using any method");
        } catch (Exception e2) {
            Utils.Log.INSTANCE.e("Failed to get context (outer catch): " + e2.getMessage());
        }
        return null;
    }
}
