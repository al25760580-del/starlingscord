package ShiggyXposed.xposed.modules.LogBox;

import android.app.AlertDialog;
import android.content.Context;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: OptionsMenu.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"LShiggyXposed/xposed/modules/LogBox/OptionsMenu;", "", "<init>", "()V", "showOptionsMenu", "", "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class OptionsMenu {
    public static final OptionsMenu INSTANCE = new OptionsMenu();

    private OptionsMenu() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, android.app.AlertDialog] */
    public final void showOptionsMenu(final Context context) {
        AlertDialog alertDialog;
        Intrinsics.checkNotNullParameter(context, "context");
        M3Colors m3Colors = LogBoxTheme.INSTANCE.getM3Colors(context);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        LinearLayout linearLayoutCreateMenuContainer = LogBoxComponents.INSTANCE.createMenuContainer(context, m3Colors, 20);
        linearLayoutCreateMenuContainer.addView(LogBoxComponents.INSTANCE.createTitle(context, m3Colors, "Options", true));
        linearLayoutCreateMenuContainer.addView(LogBoxComponents.INSTANCE.createM3Button(context, LogBoxUtils.INSTANCE.isBundleInjectionDisabled(context) ? "Enable Bundle Injection" : "Disable Bundle Injection", m3Colors, new Function0() { // from class: ShiggyXposed.xposed.modules.LogBox.OptionsMenu$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsMenu.showOptionsMenu$lambda$0(objectRef, context);
            }
        }));
        linearLayoutCreateMenuContainer.addView(LogBoxComponents.INSTANCE.createM3Button(context, "Refetch Bundle", m3Colors, new Function0() { // from class: ShiggyXposed.xposed.modules.LogBox.OptionsMenu$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsMenu.showOptionsMenu$lambda$3(objectRef, context);
            }
        }));
        linearLayoutCreateMenuContainer.addView(LogBoxComponents.INSTANCE.createM3Button(context, "Clear Cache & Reset", m3Colors, new Function0() { // from class: ShiggyXposed.xposed.modules.LogBox.OptionsMenu$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsMenu.showOptionsMenu$lambda$6(objectRef, context);
            }
        }));
        linearLayoutCreateMenuContainer.addView(LogBoxComponents.INSTANCE.createM3Button(context, "Back", m3Colors, new Function0() { // from class: ShiggyXposed.xposed.modules.LogBox.OptionsMenu$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsMenu.showOptionsMenu$lambda$7(objectRef, context);
            }
        }));
        objectRef.element = LogBoxDialogs.INSTANCE.createDialog(context, linearLayoutCreateMenuContainer);
        LogBoxDialogs.INSTANCE.setCurrentMenuContainer(linearLayoutCreateMenuContainer);
        AlertDialog alertDialog2 = null;
        if (objectRef.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        } else {
            alertDialog = (AlertDialog) objectRef.element;
        }
        alertDialog.show();
        LogBoxDialogs logBoxDialogs = LogBoxDialogs.INSTANCE;
        if (objectRef.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        } else {
            alertDialog2 = (AlertDialog) objectRef.element;
        }
        logBoxDialogs.setDialogWindowWidth(alertDialog2, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showOptionsMenu$lambda$0(Ref.ObjectRef objectRef, Context context) {
        AlertDialog alertDialog;
        if (objectRef.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        } else {
            alertDialog = (AlertDialog) objectRef.element;
        }
        alertDialog.dismiss();
        LogBoxActions.INSTANCE.toggleBundleInjection(context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showOptionsMenu$lambda$3(Ref.ObjectRef objectRef, final Context context) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        AlertDialog alertDialog;
        if (objectRef.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        } else {
            alertDialog = (AlertDialog) objectRef.element;
        }
        alertDialog.dismiss();
        Method declaredMethod = RecoveryMenu.class.getDeclaredMethod("showConfirmAction", Context.class, String.class, String.class, Runnable.class);
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(null, context, "Refetch Bundle", "This will download the latest bundle from Github.", new Runnable() { // from class: ShiggyXposed.xposed.modules.LogBox.OptionsMenu$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                OptionsMenu.showOptionsMenu$lambda$3$lambda$2(context);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showOptionsMenu$lambda$3$lambda$2(Context context) {
        LogBoxActions.INSTANCE.refetchBundle(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showOptionsMenu$lambda$6(Ref.ObjectRef objectRef, final Context context) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        AlertDialog alertDialog;
        if (objectRef.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        } else {
            alertDialog = (AlertDialog) objectRef.element;
        }
        alertDialog.dismiss();
        Method declaredMethod = RecoveryMenu.class.getDeclaredMethod("showConfirmAction", Context.class, String.class, String.class, Runnable.class);
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(null, context, "Clear Cache & Reset", "This will clear all cached bundles and reset to default settings.", new Runnable() { // from class: ShiggyXposed.xposed.modules.LogBox.OptionsMenu$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                OptionsMenu.showOptionsMenu$lambda$6$lambda$5(context);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showOptionsMenu$lambda$6$lambda$5(Context context) {
        LogBoxActions.INSTANCE.clearCacheAndReset(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showOptionsMenu$lambda$7(Ref.ObjectRef objectRef, Context context) {
        AlertDialog alertDialog;
        if (objectRef.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        } else {
            alertDialog = (AlertDialog) objectRef.element;
        }
        alertDialog.dismiss();
        RecoveryMenu.INSTANCE.showRecoveryMenu(context);
        return Unit.INSTANCE;
    }
}
