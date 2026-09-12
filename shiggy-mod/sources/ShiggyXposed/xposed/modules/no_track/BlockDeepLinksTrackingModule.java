package ShiggyXposed.xposed.modules.no_track;

import ShiggyXposed.xposed.Module;
import ShiggyXposed.xposed.Utils;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BlockDeepLinksTrackingModule.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"LShiggyXposed/xposed/modules/no_track/BlockDeepLinksTrackingModule;", "LShiggyXposed/xposed/Module;", "<init>", "()V", "onLoad", "", "packageParam", "Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class BlockDeepLinksTrackingModule extends Module {
    public static final BlockDeepLinksTrackingModule INSTANCE = new BlockDeepLinksTrackingModule();

    private BlockDeepLinksTrackingModule() {
    }

    @Override // ShiggyXposed.xposed.Module
    public void onLoad(XC_LoadPackage.LoadPackageParam packageParam) {
        Intrinsics.checkNotNullParameter(packageParam, "packageParam");
        BlockDeepLinksTrackingModule blockDeepLinksTrackingModule = INSTANCE;
        ClassLoader classLoader = packageParam.classLoader;
        Intrinsics.checkNotNullExpressionValue(classLoader, "classLoader");
        Class<?> clsSafeLoadClass = blockDeepLinksTrackingModule.safeLoadClass(classLoader, "com.discord.deep_link.DeepLinks");
        if (clsSafeLoadClass != null) {
            blockDeepLinksTrackingModule.hookMethod(clsSafeLoadClass, "init", new Class[]{Context.class}, new Function1() { // from class: ShiggyXposed.xposed.modules.no_track.BlockDeepLinksTrackingModule$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BlockDeepLinksTrackingModule.onLoad$lambda$2$lambda$1((Module.MethodHookBuilder) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLoad$lambda$2$lambda$1(Module.MethodHookBuilder hookMethod) {
        Intrinsics.checkNotNullParameter(hookMethod, "$this$hookMethod");
        hookMethod.before(new Function1() { // from class: ShiggyXposed.xposed.modules.no_track.BlockDeepLinksTrackingModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlockDeepLinksTrackingModule.onLoad$lambda$2$lambda$1$lambda$0((Module.HookScope) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLoad$lambda$2$lambda$1$lambda$0(Module.HookScope before) {
        Intrinsics.checkNotNullParameter(before, "$this$before");
        Utils.Log.INSTANCE.i("Blocked DeepLinks tracking initialization");
        before.setResult(null);
        return Unit.INSTANCE;
    }
}
