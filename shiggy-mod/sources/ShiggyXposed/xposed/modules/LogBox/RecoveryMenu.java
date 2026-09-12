package ShiggyXposed.xposed.modules.LogBox;

import ShiggyXposed.xposed.Utils;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import io.ktor.http.ContentType;
import io.ktor.http.LinkHeader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: RecoveryMenu.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J.\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u0002¨\u0006\u0011"}, d2 = {"LShiggyXposed/xposed/modules/LogBox/RecoveryMenu;", "", "<init>", "()V", "showRecoveryMenu", "", "context", "Landroid/content/Context;", "handleMenuSelection", "index", "", "showConfirmAction", LinkHeader.Parameters.Title, "", ContentType.Message.TYPE, "action", "Lkotlin/Function0;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class RecoveryMenu {
    public static final RecoveryMenu INSTANCE = new RecoveryMenu();

    private RecoveryMenu() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v25, types: [T, android.app.AlertDialog] */
    public final void showRecoveryMenu(final Context context) {
        AlertDialog alertDialog;
        Intrinsics.checkNotNullParameter(context, "context");
        Utils.Log.INSTANCE.e("showRecoveryMenu called with context: " + context);
        try {
            M3Colors m3Colors = LogBoxTheme.INSTANCE.getM3Colors(context);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            LinearLayout linearLayoutCreateMenuContainer$default = LogBoxComponents.createMenuContainer$default(LogBoxComponents.INSTANCE, context, m3Colors, 0, 4, null);
            linearLayoutCreateMenuContainer$default.addView(LogBoxComponents.INSTANCE.createTitle(context, m3Colors, "ShiggyXposed Recovery", true));
            linearLayoutCreateMenuContainer$default.addView(LogBoxComponents.INSTANCE.createSubtitle(context, m3Colors, "Select an option to continue"));
            linearLayoutCreateMenuContainer$default.addView(LogBoxComponents.INSTANCE.createM3Button(context, LogBoxUtils.INSTANCE.isSafeModeEnabled(context) ? "Disable Safe Mode" : "Enable Safe Mode", m3Colors, new Function0() { // from class: ShiggyXposed.xposed.modules.LogBox.RecoveryMenu$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecoveryMenu.showRecoveryMenu$lambda$0(objectRef, context);
                }
            }));
            linearLayoutCreateMenuContainer$default.addView(LogBoxComponents.INSTANCE.createM3Button(context, "Load Custom Bundle", m3Colors, new Function0() { // from class: ShiggyXposed.xposed.modules.LogBox.RecoveryMenu$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecoveryMenu.showRecoveryMenu$lambda$1(objectRef, context);
                }
            }));
            linearLayoutCreateMenuContainer$default.addView(LogBoxComponents.INSTANCE.createM3Button(context, "Reload App", m3Colors, new Function0() { // from class: ShiggyXposed.xposed.modules.LogBox.RecoveryMenu$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecoveryMenu.showRecoveryMenu$lambda$2(objectRef, context);
                }
            }));
            View viewCreateM3Button = LogBoxComponents.INSTANCE.createM3Button(context, "Options", m3Colors, new Function0() { // from class: ShiggyXposed.xposed.modules.LogBox.RecoveryMenu$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecoveryMenu.showRecoveryMenu$lambda$3(objectRef, context);
                }
            });
            ViewGroup.LayoutParams layoutParams = viewCreateM3Button.getLayoutParams();
            AlertDialog alertDialog2 = null;
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.setMargins(layoutParams2.leftMargin, LogBoxUtils.INSTANCE.dpToPx(context, 16), layoutParams2.rightMargin, layoutParams2.bottomMargin);
                viewCreateM3Button.setLayoutParams(layoutParams2);
            }
            linearLayoutCreateMenuContainer$default.addView(viewCreateM3Button);
            objectRef.element = LogBoxDialogs.INSTANCE.createDialog(context, linearLayoutCreateMenuContainer$default);
            LogBoxDialogs.INSTANCE.setCurrentMenuContainer(linearLayoutCreateMenuContainer$default);
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
            Utils.Log.INSTANCE.e("Recovery menu shown successfully");
        } catch (Exception e) {
            Utils.Log.INSTANCE.e("Error showing recovery menu: " + e.getMessage(), e);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showRecoveryMenu$lambda$0(Ref.ObjectRef objectRef, Context context) {
        AlertDialog alertDialog;
        if (objectRef.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        } else {
            alertDialog = (AlertDialog) objectRef.element;
        }
        alertDialog.dismiss();
        INSTANCE.handleMenuSelection(context, 0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showRecoveryMenu$lambda$1(Ref.ObjectRef objectRef, Context context) {
        AlertDialog alertDialog;
        if (objectRef.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        } else {
            alertDialog = (AlertDialog) objectRef.element;
        }
        alertDialog.dismiss();
        INSTANCE.handleMenuSelection(context, 2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showRecoveryMenu$lambda$2(Ref.ObjectRef objectRef, Context context) {
        AlertDialog alertDialog;
        if (objectRef.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        } else {
            alertDialog = (AlertDialog) objectRef.element;
        }
        alertDialog.dismiss();
        INSTANCE.handleMenuSelection(context, 3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showRecoveryMenu$lambda$3(Ref.ObjectRef objectRef, Context context) {
        AlertDialog alertDialog;
        if (objectRef.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        } else {
            alertDialog = (AlertDialog) objectRef.element;
        }
        alertDialog.dismiss();
        INSTANCE.handleMenuSelection(context, 5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleMenuSelection$lambda$5(Context context) {
        LogBoxActions.INSTANCE.refetchBundle(context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleMenuSelection$lambda$6(Context context) {
        LogBoxActions.INSTANCE.clearCacheAndReset(context);
        return Unit.INSTANCE;
    }

    private final void handleMenuSelection(final Context context, int index) {
        if (index == 0) {
            LogBoxActions.INSTANCE.toggleSafeMode(context);
            return;
        }
        if (index == 1) {
            showConfirmAction(context, "Refetch Bundle", "This will download the latest bundle from Github.", new Function0() { // from class: ShiggyXposed.xposed.modules.LogBox.RecoveryMenu$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecoveryMenu.handleMenuSelection$lambda$5(context);
                }
            });
            return;
        }
        if (index == 2) {
            CustomBundleDialog.INSTANCE.showCustomBundleDialog(context);
            return;
        }
        if (index == 3) {
            Utils.INSTANCE.reloadApp();
        } else if (index == 4) {
            showConfirmAction(context, "Clear Cache & Reset", "This will clear all cached bundles and reset to default settings.", new Function0() { // from class: ShiggyXposed.xposed.modules.LogBox.RecoveryMenu$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecoveryMenu.handleMenuSelection$lambda$6(context);
                }
            });
        } else {
            if (index != 5) {
                return;
            }
            OptionsMenu.INSTANCE.showOptionsMenu(context);
        }
    }

    private final void showConfirmAction(Context context, String title, String message, final Function0<Unit> action) {
        M3Colors m3Colors = LogBoxTheme.INSTANCE.getM3Colors(context);
        LinearLayout linearLayoutCreateMenuContainer$default = LogBoxComponents.createMenuContainer$default(LogBoxComponents.INSTANCE, context, m3Colors, 0, 4, null);
        linearLayoutCreateMenuContainer$default.addView(LogBoxComponents.createTitle$default(LogBoxComponents.INSTANCE, context, m3Colors, title, false, 8, null));
        TextView textView = new TextView(context);
        textView.setText(message);
        textView.setTextSize(14.0f);
        textView.setTextColor(m3Colors.getOnSurfaceVariant());
        textView.setPadding(0, 0, 0, LogBoxUtils.INSTANCE.dpToPx(context, 24));
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setLineHeight(LogBoxUtils.INSTANCE.dpToPx(context, 20));
        }
        linearLayoutCreateMenuContainer$default.addView(textView);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(GravityCompat.END);
        TextView textView2 = new TextView(context);
        textView2.setText("Cancel");
        textView2.setTextColor(m3Colors.getPrimary());
        textView2.setTextSize(14.0f);
        textView2.setTypeface(Typeface.create("sans-serif-medium", 0));
        textView2.setPadding(LogBoxUtils.INSTANCE.dpToPx(context, 16), LogBoxUtils.INSTANCE.dpToPx(context, 10), LogBoxUtils.INSTANCE.dpToPx(context, 16), LogBoxUtils.INSTANCE.dpToPx(context, 10));
        TextView textView3 = new TextView(context);
        textView3.setText("Confirm");
        textView3.setTextColor(m3Colors.getPrimary());
        textView3.setTextSize(14.0f);
        textView3.setTypeface(Typeface.create("sans-serif-medium", 0));
        textView3.setPadding(LogBoxUtils.INSTANCE.dpToPx(context, 16), LogBoxUtils.INSTANCE.dpToPx(context, 10), LogBoxUtils.INSTANCE.dpToPx(context, 16), LogBoxUtils.INSTANCE.dpToPx(context, 10));
        final AlertDialog alertDialogCreateDialog = LogBoxDialogs.INSTANCE.createDialog(context, linearLayoutCreateMenuContainer$default);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: ShiggyXposed.xposed.modules.LogBox.RecoveryMenu$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                alertDialogCreateDialog.dismiss();
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() { // from class: ShiggyXposed.xposed.modules.LogBox.RecoveryMenu$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecoveryMenu.showConfirmAction$lambda$12(alertDialogCreateDialog, action, view);
            }
        });
        linearLayout.addView(textView2);
        linearLayout.addView(textView3);
        linearLayoutCreateMenuContainer$default.addView(linearLayout);
        LogBoxDialogs.INSTANCE.setCurrentMenuContainer(linearLayoutCreateMenuContainer$default);
        alertDialogCreateDialog.show();
        LogBoxDialogs.INSTANCE.setDialogWindowWidth(alertDialogCreateDialog, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showConfirmAction$lambda$12(AlertDialog alertDialog, Function0 function0, View view) {
        alertDialog.dismiss();
        function0.invoke();
    }
}
