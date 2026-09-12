package ShiggyXposed.xposed.modules.no_track;

import ShiggyXposed.xposed.Module;
import ShiggyXposed.xposed.Utils;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BlockCrashReportingModule.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"LShiggyXposed/xposed/modules/no_track/BlockCrashReportingModule;", "LShiggyXposed/xposed/Module;", "<init>", "()V", "onLoad", "", "packageParam", "Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class BlockCrashReportingModule extends Module {
    public static final BlockCrashReportingModule INSTANCE = new BlockCrashReportingModule();

    private BlockCrashReportingModule() {
    }

    @Override // ShiggyXposed.xposed.Module
    public void onLoad(XC_LoadPackage.LoadPackageParam packageParam) {
        Object objM453constructorimpl;
        Intrinsics.checkNotNullParameter(packageParam, "packageParam");
        BlockCrashReportingModule blockCrashReportingModule = INSTANCE;
        ClassLoader classLoader = packageParam.classLoader;
        Intrinsics.checkNotNullExpressionValue(classLoader, "classLoader");
        Class<?> clsSafeLoadClass = blockCrashReportingModule.safeLoadClass(classLoader, "com.discord.crash_reporting.CrashReporting");
        if (clsSafeLoadClass != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM453constructorimpl = Result.m453constructorimpl(blockCrashReportingModule.hookMethod(clsSafeLoadClass, "isDisabled", new Class[0], new Function1() { // from class: ShiggyXposed.xposed.modules.no_track.BlockCrashReportingModule$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BlockCrashReportingModule.onLoad$lambda$9$lambda$6$lambda$2$lambda$1((Module.MethodHookBuilder) obj);
                    }
                }));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM453constructorimpl = Result.m453constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m456exceptionOrNullimpl(objM453constructorimpl) != null) {
                INSTANCE.hookMethod(clsSafeLoadClass, "init", new Class[]{Context.class, String.class}, new Function1() { // from class: ShiggyXposed.xposed.modules.no_track.BlockCrashReportingModule$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BlockCrashReportingModule.onLoad$lambda$9$lambda$6$lambda$5$lambda$4((Module.MethodHookBuilder) obj);
                    }
                });
            }
        }
        BlockCrashReportingModule blockCrashReportingModule2 = INSTANCE;
        ClassLoader classLoader2 = packageParam.classLoader;
        Intrinsics.checkNotNullExpressionValue(classLoader2, "classLoader");
        Class<?> clsSafeLoadClass2 = blockCrashReportingModule2.safeLoadClass(classLoader2, "io.sentry.android.core.SentryInitProvider");
        if (clsSafeLoadClass2 != null) {
            blockCrashReportingModule2.hookMethod(clsSafeLoadClass2, "onCreate", new Class[0], new Function1() { // from class: ShiggyXposed.xposed.modules.no_track.BlockCrashReportingModule$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BlockCrashReportingModule.onLoad$lambda$9$lambda$8((Module.MethodHookBuilder) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLoad$lambda$9$lambda$6$lambda$2$lambda$1(Module.MethodHookBuilder hookMethod) {
        Intrinsics.checkNotNullParameter(hookMethod, "$this$hookMethod");
        hookMethod.before(new Function1() { // from class: ShiggyXposed.xposed.modules.no_track.BlockCrashReportingModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlockCrashReportingModule.onLoad$lambda$9$lambda$6$lambda$2$lambda$1$lambda$0((Module.HookScope) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLoad$lambda$9$lambda$6$lambda$2$lambda$1$lambda$0(Module.HookScope before) {
        Intrinsics.checkNotNullParameter(before, "$this$before");
        Utils.Log.INSTANCE.i("Forced CrashReporting.isDisabled() to true");
        before.setResult(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLoad$lambda$9$lambda$6$lambda$5$lambda$4(Module.MethodHookBuilder hookMethod) {
        Intrinsics.checkNotNullParameter(hookMethod, "$this$hookMethod");
        hookMethod.before(new Function1() { // from class: ShiggyXposed.xposed.modules.no_track.BlockCrashReportingModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlockCrashReportingModule.onLoad$lambda$9$lambda$6$lambda$5$lambda$4$lambda$3((Module.HookScope) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLoad$lambda$9$lambda$6$lambda$5$lambda$4$lambda$3(Module.HookScope before) {
        Intrinsics.checkNotNullParameter(before, "$this$before");
        Utils.Log.INSTANCE.i("Blocked CrashReporting initialization");
        before.setResult(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLoad$lambda$9$lambda$8(Module.MethodHookBuilder hookMethod) {
        Intrinsics.checkNotNullParameter(hookMethod, "$this$hookMethod");
        hookMethod.before(new Function1() { // from class: ShiggyXposed.xposed.modules.no_track.BlockCrashReportingModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlockCrashReportingModule.onLoad$lambda$9$lambda$8$lambda$7((Module.HookScope) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLoad$lambda$9$lambda$8$lambda$7(Module.HookScope before) {
        Intrinsics.checkNotNullParameter(before, "$this$before");
        Utils.Log.INSTANCE.i("Blocked SentryInitProvider initialization");
        before.setResult(true);
        return Unit.INSTANCE;
    }
}
