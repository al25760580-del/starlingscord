package ShiggyXposed.xposed;

import ShiggyXposed.xposed.modules.CacheModule;
import ShiggyXposed.xposed.modules.FixResourcesModule;
import ShiggyXposed.xposed.modules.HookScriptLoaderModule;
import ShiggyXposed.xposed.modules.LogBox.LogBoxModule;
import ShiggyXposed.xposed.modules.PayloadGlobalModule;
import ShiggyXposed.xposed.modules.PerfPatchesModule;
import ShiggyXposed.xposed.modules.PluginsModule;
import ShiggyXposed.xposed.modules.UpdaterModule;
import ShiggyXposed.xposed.modules.appearance.FontsModule;
import ShiggyXposed.xposed.modules.appearance.SysColorsModule;
import ShiggyXposed.xposed.modules.appearance.ThemesModule;
import ShiggyXposed.xposed.modules.bridge.AdditionalBridgeMethodsModule;
import ShiggyXposed.xposed.modules.bridge.BridgeModule;
import ShiggyXposed.xposed.modules.no_track.BlockCrashReportingModule;
import ShiggyXposed.xposed.modules.no_track.BlockDeepLinksTrackingModule;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Main.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"LShiggyXposed/xposed/Main;", "LShiggyXposed/xposed/Module;", "Lde/robv/android/xposed/IXposedHookLoadPackage;", "Lde/robv/android/xposed/IXposedHookZygoteInit;", "<init>", "()V", "hooked", "", "modules", "", "initZygote", "", "startupParam", "Lde/robv/android/xposed/IXposedHookZygoteInit$StartupParam;", "handleLoadPackage", "param", "Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;", "onLoad", "packageParam", "onContext", "context", "Landroid/content/Context;", "onActivity", "activity", "Landroid/app/Activity;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class Main extends Module implements IXposedHookLoadPackage, IXposedHookZygoteInit {
    private boolean hooked;
    private final List<Module> modules;

    public Main() {
        List<Module> listMutableListOf = CollectionsKt.mutableListOf(HookScriptLoaderModule.INSTANCE, BridgeModule.INSTANCE, AdditionalBridgeMethodsModule.INSTANCE, new PluginsModule(), UpdaterModule.INSTANCE, FixResourcesModule.INSTANCE, BlockDeepLinksTrackingModule.INSTANCE, BlockCrashReportingModule.INSTANCE, LogBoxModule.INSTANCE, CacheModule.INSTANCE, PerfPatchesModule.INSTANCE, FontsModule.INSTANCE, ThemesModule.INSTANCE, SysColorsModule.INSTANCE);
        this.modules = listMutableListOf;
        listMutableListOf.add(new PayloadGlobalModule(listMutableListOf));
    }

    public void initZygote(IXposedHookZygoteInit.StartupParam startupParam) {
        Intrinsics.checkNotNullParameter(startupParam, "startupParam");
        Iterator<Module> it = this.modules.iterator();
        while (it.hasNext()) {
            it.next().onInit(startupParam);
        }
    }

    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam param) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(param, "param");
        if (this.hooked) {
            return;
        }
        Class<?> clsLoadClass = param.classLoader.loadClass(Constants.TARGET_ACTIVITY);
        hookMethod(ContextWrapper.class, "attachBaseContext", new Class[]{Context.class}, new Function1() { // from class: ShiggyXposed.xposed.Main$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Main.handleLoadPackage$lambda$4$lambda$1(this.f$0, (Module.MethodHookBuilder) obj);
            }
        });
        Intrinsics.checkNotNull(clsLoadClass);
        hookMethod(clsLoadClass, "onCreate", new Class[]{Bundle.class}, new Function1() { // from class: ShiggyXposed.xposed.Main$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Main.handleLoadPackage$lambda$4$lambda$3(this.f$0, (Module.MethodHookBuilder) obj);
            }
        });
        onLoad(param);
        this.hooked = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleLoadPackage$lambda$4$lambda$1(final Main main, Module.MethodHookBuilder hookMethod) {
        Intrinsics.checkNotNullParameter(hookMethod, "$this$hookMethod");
        hookMethod.after(new Function1() { // from class: ShiggyXposed.xposed.Main$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Main.handleLoadPackage$lambda$4$lambda$1$lambda$0(this.f$0, (Module.HookScope) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleLoadPackage$lambda$4$lambda$1$lambda$0(Main main, Module.HookScope after) {
        Intrinsics.checkNotNullParameter(after, "$this$after");
        Object obj = after.getArgs()[0];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.content.Context");
        HookStateHolder.INSTANCE.setGotContext(true);
        Utils.Log.INSTANCE.i("Received Context");
        main.onContext((Context) obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleLoadPackage$lambda$4$lambda$3(final Main main, Module.MethodHookBuilder hookMethod) {
        Intrinsics.checkNotNullParameter(hookMethod, "$this$hookMethod");
        hookMethod.after(new Function1() { // from class: ShiggyXposed.xposed.Main$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Main.handleLoadPackage$lambda$4$lambda$3$lambda$2(this.f$0, (Module.HookScope) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleLoadPackage$lambda$4$lambda$3$lambda$2(Main main, Module.HookScope after) {
        Intrinsics.checkNotNullParameter(after, "$this$after");
        Object thisObject = after.getThisObject();
        Intrinsics.checkNotNull(thisObject, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) thisObject;
        Utils.Log.INSTANCE.i("Received Activity");
        if (!HookStateHolder.INSTANCE.getGotContext()) {
            Utils.Log.INSTANCE.w("Activity created before we got Context, process may have been recreated!");
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            main.onContext(applicationContext);
        }
        main.onActivity(activity);
        HookStateHolder.INSTANCE.getReadyDeferred().complete(Unit.INSTANCE);
        return Unit.INSTANCE;
    }

    @Override // ShiggyXposed.xposed.Module
    public void onLoad(XC_LoadPackage.LoadPackageParam packageParam) {
        Intrinsics.checkNotNullParameter(packageParam, "packageParam");
        Iterator<Module> it = this.modules.iterator();
        while (it.hasNext()) {
            it.next().onLoad(packageParam);
        }
    }

    @Override // ShiggyXposed.xposed.Module
    public void onContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Iterator<Module> it = this.modules.iterator();
        while (it.hasNext()) {
            it.next().onContext(context);
        }
    }

    @Override // ShiggyXposed.xposed.Module
    public void onActivity(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Iterator<Module> it = this.modules.iterator();
        while (it.hasNext()) {
            it.next().onActivity(activity);
        }
    }
}
