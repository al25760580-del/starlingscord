package ShiggyXposed.xposed;

import androidx.constraintlayout.widget.ConstraintLayout;
import de.robv.android.xposed.XC_MethodHook;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Module.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\u0007"}, d2 = {"ShiggyXposed/xposed/Module$MethodHookBuilder$build$1", "Lde/robv/android/xposed/XC_MethodHook;", "beforeHookedMethod", "", "param", "Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;", "afterHookedMethod", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class Module$MethodHookBuilder$build$1 extends XC_MethodHook {
    final /* synthetic */ Module.MethodHookBuilder this$0;

    Module$MethodHookBuilder$build$1(Module.MethodHookBuilder methodHookBuilder) {
        this.this$0 = methodHookBuilder;
    }

    protected void beforeHookedMethod(XC_MethodHook.MethodHookParam param) {
        Intrinsics.checkNotNullParameter(param, "param");
        Function1 function1 = this.this$0.beforeBlock;
        if (function1 != null) {
            function1.invoke(new Module.HookScope(param, new Function1() { // from class: ShiggyXposed.xposed.Module$MethodHookBuilder$build$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Module$MethodHookBuilder$build$1.beforeHookedMethod$lambda$0(this.f$0, (XC_MethodHook.MethodHookParam) obj);
                }
            }));
        } else {
            super.beforeHookedMethod(param);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit beforeHookedMethod$lambda$0(Module$MethodHookBuilder$build$1 module$MethodHookBuilder$build$1, XC_MethodHook.MethodHookParam p) {
        Intrinsics.checkNotNullParameter(p, "p");
        super.beforeHookedMethod(p);
        return Unit.INSTANCE;
    }

    protected void afterHookedMethod(XC_MethodHook.MethodHookParam param) {
        Intrinsics.checkNotNullParameter(param, "param");
        Function1 function1 = this.this$0.afterBlock;
        if (function1 != null) {
            function1.invoke(new Module.HookScope(param, new Function1() { // from class: ShiggyXposed.xposed.Module$MethodHookBuilder$build$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Module$MethodHookBuilder$build$1.afterHookedMethod$lambda$1(this.f$0, (XC_MethodHook.MethodHookParam) obj);
                }
            }));
        } else {
            super.afterHookedMethod(param);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit afterHookedMethod$lambda$1(Module$MethodHookBuilder$build$1 module$MethodHookBuilder$build$1, XC_MethodHook.MethodHookParam p) {
        Intrinsics.checkNotNullParameter(p, "p");
        super.afterHookedMethod(p);
        return Unit.INSTANCE;
    }
}
