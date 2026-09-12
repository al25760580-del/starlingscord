package ShiggyXposed.xposed.modules.LogBox;

import ShiggyXposed.xposed.Utils;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.AlertDialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import io.ktor.http.ContentType;
import io.ktor.http.LinkHeader;
import java.io.File;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: LogBoxMenu.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ,\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012J\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ \u0010\u0014\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\"\u0010\u0015\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0002J*\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u000f2\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0002J \u0010\u001f\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u000fH\u0002J,\u0010 \u001a\u00020!2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012J\u0018\u0010#\u001a\u00020!2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J \u0010$\u001a\u00020!2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u001eH\u0002J(\u0010&\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010'\u001a\u00020!2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u001eH\u0002J\u0018\u0010(\u001a\u00020)2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0005H\u0002J\u0018\u0010+\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0005H\u0002J\u0018\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020)2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010.\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u0019H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"LShiggyXposed/xposed/modules/LogBox/LogBoxMenu;", "", "<init>", "()V", "currentMenuContainer", "Landroid/widget/LinearLayout;", "showRecoveryMenu", "", "context", "Landroid/content/Context;", "showOptionsMenu", "showThemesMenu", "showFlavorSelection", "showConfirmAction", LinkHeader.Parameters.Title, "", ContentType.Message.TYPE, "action", "Lkotlin/Function0;", "showCustomBundleDialog", "showErrorDialog", "createMenuContainer", "colors", "LShiggyXposed/xposed/modules/LogBox/M3Colors;", "padding", "", "createTitle", "Landroid/widget/TextView;", ContentType.Text.TYPE, "center", "", "createSubtitle", "createM3Button", "Landroid/view/View;", "onClick", "createAppearanceSelector", "createM3Switch", "isChecked", "updateSwitchAppearance", "switchView", "createDialog", "Landroid/app/AlertDialog;", "container", "constrainContainerWidth", "setDialogWindowWidth", "dialog", "handleMenuSelection", "index", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class LogBoxMenu {
    public static final LogBoxMenu INSTANCE = new LogBoxMenu();
    private static LinearLayout currentMenuContainer;

    private LogBoxMenu() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, android.app.AlertDialog] */
    public final void showRecoveryMenu(final Context context) throws Exception {
        AlertDialog alertDialog;
        Intrinsics.checkNotNullParameter(context, "context");
        Utils.Log.INSTANCE.e("showRecoveryMenu called with context: " + context);
        try {
            M3Colors m3Colors = LogBoxTheme.INSTANCE.getM3Colors(context);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            try {
                LinearLayout linearLayoutCreateMenuContainer$default = createMenuContainer$default(this, context, m3Colors, 0, 4, null);
                linearLayoutCreateMenuContainer$default.addView(createTitle(context, m3Colors, "ShiggyXposed Recovery", true));
                linearLayoutCreateMenuContainer$default.addView(createSubtitle(context, m3Colors, "Select an option to continue"));
                linearLayoutCreateMenuContainer$default.addView(createM3Button(context, LogBoxUtils.INSTANCE.isSafeModeEnabled(context) ? "Disable Safe Mode" : "Enable Safe Mode", m3Colors, new Function0() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxMenu$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LogBoxMenu.showRecoveryMenu$lambda$0(objectRef, context);
                    }
                }));
                linearLayoutCreateMenuContainer$default.addView(createM3Button(context, "Load Custom Bundle", m3Colors, new Function0() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxMenu$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LogBoxMenu.showRecoveryMenu$lambda$1(objectRef, context);
                    }
                }));
                linearLayoutCreateMenuContainer$default.addView(createM3Button(context, "Reload App", m3Colors, new Function0() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxMenu$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LogBoxMenu.showRecoveryMenu$lambda$2(objectRef, context);
                    }
                }));
                View viewCreateM3Button = createM3Button(context, "Options", m3Colors, new Function0() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxMenu$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LogBoxMenu.showRecoveryMenu$lambda$3(objectRef, context);
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
                objectRef.element = createDialog(context, linearLayoutCreateMenuContainer$default);
                currentMenuContainer = linearLayoutCreateMenuContainer$default;
                if (objectRef.element == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    alertDialog = null;
                } else {
                    alertDialog = (AlertDialog) objectRef.element;
                }
                alertDialog.show();
                if (objectRef.element == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    alertDialog2 = (AlertDialog) objectRef.element;
                }
                setDialogWindowWidth(alertDialog2, context);
                Utils.Log.INSTANCE.e("Recovery menu shown successfully");
            } catch (Exception e) {
                e = e;
                Exception exc = e;
                Utils.Log.INSTANCE.e("Error showing recovery menu: " + exc.getMessage(), exc);
                throw exc;
            }
        } catch (Exception e2) {
            e = e2;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, android.app.AlertDialog] */
    public final void showOptionsMenu(final Context context) {
        AlertDialog alertDialog;
        Intrinsics.checkNotNullParameter(context, "context");
        M3Colors m3Colors = LogBoxTheme.INSTANCE.getM3Colors(context);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        LinearLayout linearLayoutCreateMenuContainer = createMenuContainer(context, m3Colors, 20);
        linearLayoutCreateMenuContainer.addView(createTitle(context, m3Colors, "Options", true));
        linearLayoutCreateMenuContainer.addView(createM3Button(context, "Themes", m3Colors, new Function0() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxMenu$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LogBoxMenu.showOptionsMenu$lambda$5(objectRef, context);
            }
        }));
        linearLayoutCreateMenuContainer.addView(createM3Button(context, LogBoxUtils.INSTANCE.isBundleInjectionDisabled(context) ? "Enable Bundle Injection" : "Disable Bundle Injection", m3Colors, new Function0() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxMenu$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LogBoxMenu.showOptionsMenu$lambda$6(objectRef, context);
            }
        }));
        linearLayoutCreateMenuContainer.addView(createM3Button(context, "Refetch Bundle", m3Colors, new Function0() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxMenu$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LogBoxMenu.showOptionsMenu$lambda$8(objectRef, context);
            }
        }));
        linearLayoutCreateMenuContainer.addView(createM3Button(context, "Clear Cache & Reset", m3Colors, new Function0() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxMenu$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LogBoxMenu.showOptionsMenu$lambda$10(objectRef, context);
            }
        }));
        linearLayoutCreateMenuContainer.addView(createM3Button(context, "Delete Devtools", m3Colors, new Function0() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxMenu$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LogBoxMenu.showOptionsMenu$lambda$12(objectRef, context);
            }
        }));
        linearLayoutCreateMenuContainer.addView(createM3Button(context, "Back", m3Colors, new Function0() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxMenu$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LogBoxMenu.showOptionsMenu$lambda$13(objectRef, context);
            }
        }));
        objectRef.element = createDialog(context, linearLayoutCreateMenuContainer);
        currentMenuContainer = linearLayoutCreateMenuContainer;
        AlertDialog alertDialog2 = null;
        if (objectRef.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        } else {
            alertDialog = (AlertDialog) objectRef.element;
        }
        alertDialog.show();
        if (objectRef.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        } else {
            alertDialog2 = (AlertDialog) objectRef.element;
        }
        setDialogWindowWidth(alertDialog2, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showOptionsMenu$lambda$5(Ref.ObjectRef objectRef, Context context) {
        AlertDialog alertDialog;
        if (objectRef.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        } else {
            alertDialog = (AlertDialog) objectRef.element;
        }
        alertDialog.dismiss();
        INSTANCE.showThemesMenu(context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showOptionsMenu$lambda$6(Ref.ObjectRef objectRef, Context context) {
        AlertDialog alertDialog;
        if (objectRef.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        } else {
            alertDialog = (AlertDialog) objectRef.element;
        }
        alertDialog.dismiss();
        LogBoxActions.INSTANCE.toggleBundleInjection(context);
        Utils.INSTANCE.reloadApp();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showOptionsMenu$lambda$8(Ref.ObjectRef objectRef, final Context context) {
        AlertDialog alertDialog;
        if (objectRef.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        } else {
            alertDialog = (AlertDialog) objectRef.element;
        }
        alertDialog.dismiss();
        INSTANCE.showConfirmAction(context, "Refetch Bundle", "This will download the latest bundle from Github.", new Function0() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxMenu$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LogBoxMenu.showOptionsMenu$lambda$8$lambda$7(context);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showOptionsMenu$lambda$8$lambda$7(Context context) {
        LogBoxActions.INSTANCE.refetchBundle(context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showOptionsMenu$lambda$10(Ref.ObjectRef objectRef, final Context context) {
        AlertDialog alertDialog;
        if (objectRef.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        } else {
            alertDialog = (AlertDialog) objectRef.element;
        }
        alertDialog.dismiss();
        INSTANCE.showConfirmAction(context, "Clear Cache & Reset", "This will clear all cached bundles and reset to default settings.", new Function0() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxMenu$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LogBoxMenu.showOptionsMenu$lambda$10$lambda$9(context);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showOptionsMenu$lambda$10$lambda$9(Context context) {
        LogBoxActions.INSTANCE.clearCacheAndReset(context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showOptionsMenu$lambda$12(Ref.ObjectRef objectRef, final Context context) {
        AlertDialog alertDialog;
        if (objectRef.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        } else {
            alertDialog = (AlertDialog) objectRef.element;
        }
        alertDialog.dismiss();
        INSTANCE.showConfirmAction(context, "Delete Devtools", "This will delete the reactDevtools.js preload file if it exists.", new Function0() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxMenu$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LogBoxMenu.showOptionsMenu$lambda$12$lambda$11(context);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showOptionsMenu$lambda$12$lambda$11(Context context) {
        LogBoxActions.INSTANCE.deleteDevtools(context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showOptionsMenu$lambda$13(Ref.ObjectRef objectRef, Context context) throws Exception {
        AlertDialog alertDialog;
        if (objectRef.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        } else {
            alertDialog = (AlertDialog) objectRef.element;
        }
        alertDialog.dismiss();
        INSTANCE.showRecoveryMenu(context);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, android.app.AlertDialog] */
    public final void showThemesMenu(final Context context) {
        AlertDialog alertDialog;
        Intrinsics.checkNotNullParameter(context, "context");
        M3Colors m3Colors = LogBoxTheme.INSTANCE.getM3Colors(context);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        LinearLayout linearLayoutCreateMenuContainer = createMenuContainer(context, m3Colors, 20);
        linearLayoutCreateMenuContainer.addView(createTitle(context, m3Colors, "Themes", true));
        linearLayoutCreateMenuContainer.addView(createAppearanceSelector(context, m3Colors));
        linearLayoutCreateMenuContainer.addView(createM3Button(context, "Menu Color Flavor", m3Colors, new Function0() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxMenu$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LogBoxMenu.showThemesMenu$lambda$14(objectRef, context);
            }
        }));
        linearLayoutCreateMenuContainer.addView(createM3Button(context, "Back", m3Colors, new Function0() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxMenu$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LogBoxMenu.showThemesMenu$lambda$15(objectRef, context);
            }
        }));
        objectRef.element = createDialog(context, linearLayoutCreateMenuContainer);
        currentMenuContainer = linearLayoutCreateMenuContainer;
        AlertDialog alertDialog2 = null;
        if (objectRef.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        } else {
            alertDialog = (AlertDialog) objectRef.element;
        }
        alertDialog.show();
        if (objectRef.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        } else {
            alertDialog2 = (AlertDialog) objectRef.element;
        }
        setDialogWindowWidth(alertDialog2, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showThemesMenu$lambda$14(Ref.ObjectRef objectRef, Context context) {
        AlertDialog alertDialog;
        if (objectRef.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        } else {
            alertDialog = (AlertDialog) objectRef.element;
        }
        alertDialog.dismiss();
        INSTANCE.showFlavorSelection(context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showThemesMenu$lambda$15(Ref.ObjectRef objectRef, Context context) {
        AlertDialog alertDialog;
        if (objectRef.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        } else {
            alertDialog = (AlertDialog) objectRef.element;
        }
        alertDialog.dismiss();
        INSTANCE.showOptionsMenu(context);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, android.app.AlertDialog] */
    public final void showFlavorSelection(final Context context) {
        AlertDialog alertDialog;
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        M3Colors m3Colors = LogBoxTheme.INSTANCE.getM3Colors(context);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        LinearLayout linearLayoutCreateMenuContainer = createMenuContainer(context, m3Colors, 20);
        linearLayoutCreateMenuContainer.addView(createTitle(context, m3Colors, "Select Menu Flavor", true));
        for (final String str : LogBoxConstants.INSTANCE.getFLAVORS()) {
            LogBoxMenu logBoxMenu = INSTANCE;
            if (str.length() > 0) {
                StringBuilder sb = new StringBuilder();
                String strValueOf = String.valueOf(str.charAt(0));
                Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                StringBuilder sbAppend = sb.append((Object) upperCase);
                String strSubstring = str.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                string = sbAppend.append(strSubstring).toString();
            } else {
                string = str;
            }
            linearLayoutCreateMenuContainer.addView(logBoxMenu.createM3Button(context, string, m3Colors, new Function0() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxMenu$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LogBoxMenu.showFlavorSelection$lambda$18$lambda$17(objectRef, context, str);
                }
            }));
        }
        objectRef.element = createDialog(context, linearLayoutCreateMenuContainer);
        currentMenuContainer = linearLayoutCreateMenuContainer;
        AlertDialog alertDialog2 = null;
        if (objectRef.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        } else {
            alertDialog = (AlertDialog) objectRef.element;
        }
        alertDialog.show();
        if (objectRef.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        } else {
            alertDialog2 = (AlertDialog) objectRef.element;
        }
        setDialogWindowWidth(alertDialog2, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showFlavorSelection$lambda$18$lambda$17(Ref.ObjectRef objectRef, Context context, String str) {
        AlertDialog alertDialog;
        try {
            if (objectRef.element == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                alertDialog = null;
            } else {
                alertDialog = (AlertDialog) objectRef.element;
            }
            alertDialog.dismiss();
        } catch (Exception unused) {
        }
        LogBoxUtils.INSTANCE.saveMenuFlavor(context, str);
        INSTANCE.showThemesMenu(context);
        return Unit.INSTANCE;
    }

    public final void showConfirmAction(Context context, String title, String message, final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(action, "action");
        M3Colors m3Colors = LogBoxTheme.INSTANCE.getM3Colors(context);
        LinearLayout linearLayoutCreateMenuContainer$default = createMenuContainer$default(this, context, m3Colors, 0, 4, null);
        linearLayoutCreateMenuContainer$default.addView(createTitle$default(this, context, m3Colors, title, false, 8, null));
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
        final AlertDialog alertDialogCreateDialog = createDialog(context, linearLayoutCreateMenuContainer$default);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxMenu$$ExternalSyntheticLambda10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                alertDialogCreateDialog.dismiss();
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxMenu$$ExternalSyntheticLambda12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogBoxMenu.showConfirmAction$lambda$24(alertDialogCreateDialog, action, view);
            }
        });
        linearLayout.addView(textView2);
        linearLayout.addView(textView3);
        linearLayoutCreateMenuContainer$default.addView(linearLayout);
        currentMenuContainer = linearLayoutCreateMenuContainer$default;
        alertDialogCreateDialog.show();
        setDialogWindowWidth(alertDialogCreateDialog, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showConfirmAction$lambda$24(AlertDialog alertDialog, Function0 function0, View view) {
        alertDialog.dismiss();
        function0.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0048  */
    public final void showCustomBundleDialog(final Context context) {
        boolean zOptBoolean;
        boolean z;
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        final M3Colors m3Colors = LogBoxTheme.INSTANCE.getM3Colors(context);
        File file = new File(LogBoxUtils.INSTANCE.getPyoncordDirectory(context), "loader.json");
        String strOptString = null;
        if (file.exists()) {
            try {
                JSONObject jSONObjectOptJSONObject = new JSONObject(FilesKt.readText$default(file, null, 1, null)).optJSONObject("customLoadUrl");
                if (jSONObjectOptJSONObject != null) {
                    zOptBoolean = jSONObjectOptJSONObject.optBoolean("enabled", false);
                    try {
                        strOptString = jSONObjectOptJSONObject.optString("url", "");
                    } catch (Exception unused) {
                    }
                    z = zOptBoolean;
                    str = strOptString;
                } else {
                    str = null;
                    z = false;
                }
            } catch (Exception unused2) {
                zOptBoolean = false;
            }
        } else {
            str = null;
            z = false;
        }
        LinearLayout linearLayoutCreateMenuContainer$default = createMenuContainer$default(this, context, m3Colors, 0, 4, null);
        linearLayoutCreateMenuContainer$default.addView(createTitle$default(this, context, m3Colors, "Custom Bundle URL", false, 8, null));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, LogBoxUtils.INSTANCE.dpToPx(context, 16));
        linearLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(context);
        textView.setText("Enable Custom URL");
        textView.setTextSize(14.0f);
        textView.setTextColor(m3Colors.getOnSurface());
        textView.setTypeface(Typeface.create("sans-serif-medium", 0));
        textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        final View viewCreateM3Switch = createM3Switch(context, m3Colors, z);
        linearLayout.addView(textView);
        linearLayout.addView(viewCreateM3Switch);
        linearLayoutCreateMenuContainer$default.addView(linearLayout);
        final EditText editText = new EditText(context);
        editText.setHint("http://localhost:4040/shiggycord.js");
        editText.setTextColor(m3Colors.getOnSurface());
        editText.setHintTextColor(m3Colors.getOnSurfaceVariant());
        editText.setBackground(LogBoxUtils.INSTANCE.createM3Background(context, m3Colors.getSurfaceVariant(), 12.0f));
        editText.setInputType(16);
        editText.setText(str != null ? str : "");
        editText.setTextSize(14.0f);
        editText.setPadding(LogBoxUtils.INSTANCE.dpToPx(context, 16), LogBoxUtils.INSTANCE.dpToPx(context, 12), LogBoxUtils.INSTANCE.dpToPx(context, 16), LogBoxUtils.INSTANCE.dpToPx(context, 12));
        editText.setAlpha(z ? 1.0f : 0.5f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, 0, LogBoxUtils.INSTANCE.dpToPx(context, 24));
        editText.setLayoutParams(layoutParams2);
        linearLayoutCreateMenuContainer$default.addView(editText);
        viewCreateM3Switch.setOnClickListener(new View.OnClickListener() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxMenu$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogBoxMenu.showCustomBundleDialog$lambda$31(viewCreateM3Switch, context, m3Colors, editText, view);
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(GravityCompat.END);
        TextView textView2 = new TextView(context);
        textView2.setText("Cancel");
        textView2.setTextColor(m3Colors.getPrimary());
        textView2.setTextSize(14.0f);
        textView2.setTypeface(Typeface.create("sans-serif-medium", 0));
        textView2.setPadding(LogBoxUtils.INSTANCE.dpToPx(context, 16), LogBoxUtils.INSTANCE.dpToPx(context, 10), LogBoxUtils.INSTANCE.dpToPx(context, 16), LogBoxUtils.INSTANCE.dpToPx(context, 10));
        TextView textView3 = new TextView(context);
        textView3.setText("Save");
        textView3.setTextColor(m3Colors.getPrimary());
        textView3.setTextSize(14.0f);
        textView3.setTypeface(Typeface.create("sans-serif-medium", 0));
        textView3.setPadding(LogBoxUtils.INSTANCE.dpToPx(context, 16), LogBoxUtils.INSTANCE.dpToPx(context, 10), LogBoxUtils.INSTANCE.dpToPx(context, 16), LogBoxUtils.INSTANCE.dpToPx(context, 10));
        final AlertDialog alertDialogCreateDialog = createDialog(context, linearLayoutCreateMenuContainer$default);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxMenu$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                alertDialogCreateDialog.dismiss();
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxMenu$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogBoxMenu.showCustomBundleDialog$lambda$37(editText, viewCreateM3Switch, context, alertDialogCreateDialog, view);
            }
        });
        linearLayout2.addView(textView2);
        linearLayout2.addView(textView3);
        linearLayoutCreateMenuContainer$default.addView(linearLayout2);
        currentMenuContainer = linearLayoutCreateMenuContainer$default;
        alertDialogCreateDialog.show();
        setDialogWindowWidth(alertDialogCreateDialog, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCustomBundleDialog$lambda$31(View view, Context context, M3Colors m3Colors, final EditText editText, View view2) {
        Object tag = view.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Boolean");
        boolean zBooleanValue = ((Boolean) tag).booleanValue();
        final boolean z = !zBooleanValue;
        view.setTag(Boolean.valueOf(z));
        INSTANCE.updateSwitchAppearance(context, view, m3Colors, z);
        editText.animate().alpha(!zBooleanValue ? 1.0f : 0.5f).setDuration(250L).withEndAction(new Runnable() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxMenu$$ExternalSyntheticLambda30
            @Override // java.lang.Runnable
            public final void run() {
                editText.setEnabled(z);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCustomBundleDialog$lambda$37(EditText editText, View view, Context context, AlertDialog alertDialog, View view2) {
        String string;
        String string2;
        try {
            Editable text = editText.getText();
            if (text == null || (string2 = text.toString()) == null || (string = StringsKt.trim((CharSequence) string2).toString()) == null) {
                string = "";
            }
            Object tag = view.getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue = ((Boolean) tag).booleanValue();
            if (zBooleanValue && string.length() > 0) {
                LogBoxActions.INSTANCE.setCustomBundleURL(context, string, true);
                alertDialog.dismiss();
            } else {
                if (!zBooleanValue) {
                    LogBoxActions logBoxActions = LogBoxActions.INSTANCE;
                    String str = string;
                    if (str.length() == 0) {
                        str = "http://localhost:4040/shiggycord.js";
                    }
                    logBoxActions.setCustomBundleURL(context, str, false);
                    alertDialog.dismiss();
                    return;
                }
                Toast.makeText(context, "Please enter a valid URL", 0).show();
            }
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "unknown error";
            }
            Toast.makeText(context, "Failed to set custom bundle: " + message, 1).show();
        }
    }

    public final void showErrorDialog(Context context, String title, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        M3Colors m3Colors = LogBoxTheme.INSTANCE.getM3Colors(context);
        LinearLayout linearLayoutCreateMenuContainer$default = createMenuContainer$default(this, context, m3Colors, 0, 4, null);
        TextView textView = new TextView(context);
        textView.setText(title);
        textView.setTextSize(20.0f);
        textView.setTextColor(m3Colors.getError());
        textView.setTypeface(Typeface.create("sans-serif", 1));
        textView.setPadding(0, 0, 0, LogBoxUtils.INSTANCE.dpToPx(context, 16));
        linearLayoutCreateMenuContainer$default.addView(textView);
        TextView textView2 = new TextView(context);
        if (message == null) {
            message = "An unknown error occurred";
        }
        textView2.setText(message);
        textView2.setTextSize(14.0f);
        textView2.setTextColor(m3Colors.getOnSurfaceVariant());
        textView2.setPadding(0, 0, 0, LogBoxUtils.INSTANCE.dpToPx(context, 24));
        if (Build.VERSION.SDK_INT >= 28) {
            textView2.setLineHeight(LogBoxUtils.INSTANCE.dpToPx(context, 20));
        }
        linearLayoutCreateMenuContainer$default.addView(textView2);
        TextView textView3 = new TextView(context);
        textView3.setText("OK");
        textView3.setTextColor(m3Colors.getPrimary());
        textView3.setTextSize(14.0f);
        textView3.setTypeface(Typeface.create("sans-serif-medium", 0));
        textView3.setGravity(GravityCompat.END);
        textView3.setPadding(LogBoxUtils.INSTANCE.dpToPx(context, 16), LogBoxUtils.INSTANCE.dpToPx(context, 10), LogBoxUtils.INSTANCE.dpToPx(context, 16), LogBoxUtils.INSTANCE.dpToPx(context, 10));
        final AlertDialog alertDialogCreateDialog = createDialog(context, linearLayoutCreateMenuContainer$default);
        textView3.setOnClickListener(new View.OnClickListener() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxMenu$$ExternalSyntheticLambda19
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                alertDialogCreateDialog.dismiss();
            }
        });
        linearLayoutCreateMenuContainer$default.addView(textView3);
        currentMenuContainer = linearLayoutCreateMenuContainer$default;
        alertDialogCreateDialog.show();
        setDialogWindowWidth(alertDialogCreateDialog, context);
    }

    static /* synthetic */ LinearLayout createMenuContainer$default(LogBoxMenu logBoxMenu, Context context, M3Colors m3Colors, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 24;
        }
        return logBoxMenu.createMenuContainer(context, m3Colors, i);
    }

    private final LinearLayout createMenuContainer(Context context, M3Colors colors, int padding) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(LogBoxUtils.INSTANCE.dpToPx(context, padding), LogBoxUtils.INSTANCE.dpToPx(context, padding), LogBoxUtils.INSTANCE.dpToPx(context, padding), LogBoxUtils.INSTANCE.dpToPx(context, padding));
        linearLayout.setBackground(LogBoxUtils.INSTANCE.createM3Background(context, colors.getSurface(), padding == 24 ? 28.0f : 24.0f));
        return linearLayout;
    }

    static /* synthetic */ TextView createTitle$default(LogBoxMenu logBoxMenu, Context context, M3Colors m3Colors, String str, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return logBoxMenu.createTitle(context, m3Colors, str, z);
    }

    private final TextView createTitle(Context context, M3Colors colors, String text, boolean center) {
        TextView textView = new TextView(context);
        textView.setText(text);
        textView.setTextSize(center ? 20.0f : 22.0f);
        textView.setTextColor(colors.getOnSurface());
        textView.setTypeface(Typeface.create("sans-serif", 1));
        textView.setPadding(0, 0, 0, LogBoxUtils.INSTANCE.dpToPx(context, center ? 12 : 16));
        textView.setGravity(center ? 17 : GravityCompat.START);
        return textView;
    }

    private final TextView createSubtitle(Context context, M3Colors colors, String text) {
        TextView textView = new TextView(context);
        textView.setText(text);
        textView.setTextSize(14.0f);
        textView.setTextColor(colors.getOnSurfaceVariant());
        textView.setTypeface(Typeface.create("sans-serif", 0));
        textView.setPadding(0, 0, 0, LogBoxUtils.INSTANCE.dpToPx(context, 24));
        textView.setGravity(17);
        return textView;
    }

    public final View createM3Button(Context context, String text, M3Colors colors, final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setBackground(LogBoxUtils.INSTANCE.createM3Background(context, colors.getPrimaryContainer(), 20.0f));
        linearLayout.setPadding(LogBoxUtils.INSTANCE.dpToPx(context, 24), LogBoxUtils.INSTANCE.dpToPx(context, 10), LogBoxUtils.INSTANCE.dpToPx(context, 24), LogBoxUtils.INSTANCE.dpToPx(context, 10));
        linearLayout.setClipToOutline(true);
        linearLayout.setClickable(true);
        linearLayout.setFocusable(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, LogBoxUtils.INSTANCE.dpToPx(context, 40));
        layoutParams.setMargins(0, LogBoxUtils.INSTANCE.dpToPx(context, 8), 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(context);
        textView.setText(text);
        textView.setTextColor(colors.getOnPrimaryContainer());
        textView.setTextSize(14.0f);
        textView.setTypeface(Typeface.create("sans-serif-medium", 0));
        textView.setGravity(17);
        linearLayout.addView(textView);
        linearLayout.setBackground(new RippleDrawable(ColorStateList.valueOf(Color.argb(30, 255, 255, 255)), LogBoxUtils.INSTANCE.createM3Background(context, colors.getPrimaryContainer(), 20.0f), null));
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxMenu$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                onClick.invoke();
            }
        });
        return linearLayout;
    }

    private final View createAppearanceSelector(Context context, final M3Colors colors) {
        final Context context2 = context;
        String appearanceMode = LogBoxUtils.INSTANCE.getAppearanceMode(context2);
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{"System", "Light", "Dark"});
        List listListOf2 = CollectionsKt.listOf((Object[]) new String[]{"system", "light", "dark"});
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(1);
        int i = -1;
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setPadding(0, 0, 0, LogBoxUtils.INSTANCE.dpToPx(context2, 8));
        TextView textView = new TextView(context2);
        textView.setText("Appearance");
        float f = 14.0f;
        textView.setTextSize(14.0f);
        textView.setTextColor(colors.getOnSurface());
        textView.setPadding(0, 0, 0, LogBoxUtils.INSTANCE.dpToPx(context2, 8));
        textView.setTypeface(Typeface.create("sans-serif-medium", 0));
        linearLayout.addView(textView);
        final LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, LogBoxUtils.INSTANCE.dpToPx(context2, 40)));
        int i2 = 0;
        for (Object obj : listListOf) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final String str = (String) listListOf2.get(i2);
            TextView textView2 = new TextView(context2);
            textView2.setText((String) obj);
            textView2.setGravity(17);
            textView2.setTextSize(f);
            textView2.setTypeface(Typeface.create("sans-serif-medium", 0));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, i, 1.0f);
            if (i2 > 0) {
                layoutParams.setMargins(LogBoxUtils.INSTANCE.dpToPx(context2, 8), 0, 0, 0);
            }
            textView2.setLayoutParams(layoutParams);
            boolean zAreEqual = Intrinsics.areEqual(appearanceMode, str);
            textView2.setBackground(LogBoxUtils.INSTANCE.createM3Background(context2, zAreEqual ? colors.getPrimaryContainer() : colors.getSurfaceVariant(), 12.0f));
            textView2.setTextColor(zAreEqual ? colors.getOnPrimaryContainer() : colors.getOnSurface());
            textView2.setPadding(0, 0, 0, 0);
            final List list = listListOf2;
            textView2.setOnClickListener(new View.OnClickListener() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxMenu$$ExternalSyntheticLambda29
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LogBoxMenu.createAppearanceSelector$lambda$54$lambda$53$lambda$52(context2, str, linearLayout2, list, colors, view);
                }
            });
            linearLayout2.addView(textView2);
            context2 = context;
            listListOf2 = list;
            i2 = i3;
            i = -1;
            f = 14.0f;
        }
        linearLayout.addView(linearLayout2);
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createAppearanceSelector$lambda$54$lambda$53$lambda$52(Context context, String str, LinearLayout linearLayout, List list, M3Colors m3Colors, View view) {
        LogBoxUtils.INSTANCE.setAppearanceMode(context, str);
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) childAt;
            boolean zAreEqual = Intrinsics.areEqual(list.get(i), str);
            textView.setBackground(LogBoxUtils.INSTANCE.createM3Background(context, zAreEqual ? m3Colors.getPrimaryContainer() : m3Colors.getSurfaceVariant(), 12.0f));
            textView.setTextColor(zAreEqual ? m3Colors.getOnPrimaryContainer() : m3Colors.getOnSurface());
        }
    }

    private final View createM3Switch(Context context, M3Colors colors, boolean isChecked) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setTag(Boolean.valueOf(isChecked));
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(LogBoxUtils.INSTANCE.dpToPx(context, 52), LogBoxUtils.INSTANCE.dpToPx(context, 32)));
        LinearLayout linearLayout2 = linearLayout;
        updateSwitchAppearance(context, linearLayout2, colors, isChecked);
        return linearLayout2;
    }

    private final void updateSwitchAppearance(final Context context, final View switchView, M3Colors colors, boolean isChecked) {
        int primary;
        final View childAt;
        int onPrimary;
        int primary2 = isChecked ? colors.getPrimary() : colors.getSurfaceVariant();
        int onPrimary2 = isChecked ? colors.getOnPrimary() : colors.getOnSurfaceVariant();
        if (switchView.getBackground() instanceof GradientDrawable) {
            Drawable background = switchView.getBackground();
            Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ColorStateList color = ((GradientDrawable) background).getColor();
            if (color != null) {
                primary = color.getDefaultColor();
            } else {
                primary = !isChecked ? colors.getPrimary() : colors.getSurfaceVariant();
            }
        } else {
            primary = !isChecked ? colors.getPrimary() : colors.getSurfaceVariant();
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(primary), Integer.valueOf(primary2));
        valueAnimatorOfObject.setDuration(250L);
        valueAnimatorOfObject.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxMenu$$ExternalSyntheticLambda2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LogBoxMenu.updateSwitchAppearance$lambda$57(switchView, context, valueAnimator);
            }
        });
        if (switchView instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) switchView;
            if (linearLayout.getChildCount() > 0) {
                childAt = linearLayout.getChildAt(0);
            } else {
                View view = new View(context);
                int iDpToPx = LogBoxUtils.INSTANCE.dpToPx(context, 24);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iDpToPx, iDpToPx);
                layoutParams.setMarginStart(LogBoxUtils.INSTANCE.dpToPx(context, 4));
                layoutParams.setMarginEnd(LogBoxUtils.INSTANCE.dpToPx(context, 24));
                view.setLayoutParams(layoutParams);
                linearLayout.addView(view);
                childAt = view;
            }
            ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(((LinearLayout.LayoutParams) layoutParams2).getMarginStart(), isChecked ? LogBoxUtils.INSTANCE.dpToPx(context, 24) : LogBoxUtils.INSTANCE.dpToPx(context, 4));
            valueAnimatorOfInt.setDuration(250L);
            valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxMenu$$ExternalSyntheticLambda3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LogBoxMenu.updateSwitchAppearance$lambda$60(childAt, context, valueAnimator);
                }
            });
            if (childAt.getBackground() instanceof GradientDrawable) {
                Drawable background2 = childAt.getBackground();
                Intrinsics.checkNotNull(background2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                ColorStateList color2 = ((GradientDrawable) background2).getColor();
                if (color2 != null) {
                    onPrimary = color2.getDefaultColor();
                } else {
                    onPrimary = !isChecked ? colors.getOnPrimary() : colors.getOnSurfaceVariant();
                }
            } else {
                onPrimary = !isChecked ? colors.getOnPrimary() : colors.getOnSurfaceVariant();
            }
            ValueAnimator valueAnimatorOfObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(onPrimary), Integer.valueOf(onPrimary2));
            valueAnimatorOfObject2.setDuration(250L);
            valueAnimatorOfObject2.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfObject2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxMenu$$ExternalSyntheticLambda4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LogBoxMenu.updateSwitchAppearance$lambda$62(childAt, valueAnimator);
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(valueAnimatorOfObject, valueAnimatorOfInt, valueAnimatorOfObject2);
            animatorSet.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateSwitchAppearance$lambda$57(View view, Context context, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(iIntValue);
        gradientDrawable.setCornerRadius(LogBoxUtils.INSTANCE.dpToPx(context, 16));
        view.setBackground(gradientDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateSwitchAppearance$lambda$60(View view, Context context, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginStart(iIntValue);
        layoutParams2.setMarginEnd(LogBoxUtils.INSTANCE.dpToPx(context, 28) - iIntValue);
        view.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateSwitchAppearance$lambda$62(View view, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(iIntValue);
        gradientDrawable.setShape(1);
        view.setBackground(gradientDrawable);
    }

    private final AlertDialog createDialog(Context context, LinearLayout container) {
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setView(container).create();
        Window window = alertDialogCreate.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(LogBoxUtils.INSTANCE.createM3Background(context, 0, 28.0f));
        }
        constrainContainerWidth(context, container);
        Intrinsics.checkNotNull(alertDialogCreate);
        return alertDialogCreate;
    }

    private final void constrainContainerWidth(Context context, LinearLayout container) {
        try {
            int i = (int) (((double) context.getResources().getDisplayMetrics().widthPixels) * 0.9d);
            container.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            container.setMinimumWidth(i);
        } catch (Exception unused) {
        }
    }

    private final void setDialogWindowWidth(AlertDialog dialog, Context context) {
        try {
            int i = (int) (((double) context.getResources().getDisplayMetrics().widthPixels) * 0.9d);
            int iDpToPx = LogBoxUtils.INSTANCE.dpToPx(context, 420);
            if (i >= iDpToPx) {
                i = iDpToPx;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(i, -2);
            }
            try {
                final LinearLayout linearLayout = currentMenuContainer;
                if (linearLayout != null) {
                    ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new ViewGroup.LayoutParams(-1, -2);
                    }
                    layoutParams.width = -1;
                    linearLayout.setLayoutParams(layoutParams);
                    try {
                        linearLayout.setMinimumWidth(i);
                    } catch (Exception unused) {
                    }
                    Boolean.valueOf(linearLayout.post(new Runnable() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxMenu$$ExternalSyntheticLambda23
                        @Override // java.lang.Runnable
                        public final void run() {
                            LogBoxMenu.setDialogWindowWidth$lambda$64$lambda$63(linearLayout);
                        }
                    }));
                }
            } catch (Exception unused2) {
                Unit unit = Unit.INSTANCE;
            }
        } catch (Exception unused3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDialogWindowWidth$lambda$64$lambda$63(LinearLayout linearLayout) {
        try {
            linearLayout.requestLayout();
            linearLayout.invalidate();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleMenuSelection$lambda$65(Context context) {
        LogBoxActions.INSTANCE.refetchBundle(context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleMenuSelection$lambda$66(Context context) {
        LogBoxActions.INSTANCE.clearCacheAndReset(context);
        return Unit.INSTANCE;
    }

    private final void handleMenuSelection(final Context context, int index) {
        if (index == 0) {
            LogBoxActions.INSTANCE.toggleSafeMode(context);
            return;
        }
        if (index == 1) {
            showConfirmAction(context, "Refetch Bundle", "This will download the latest bundle from Github.", new Function0() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxMenu$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LogBoxMenu.handleMenuSelection$lambda$65(context);
                }
            });
            return;
        }
        if (index == 2) {
            showCustomBundleDialog(context);
            return;
        }
        if (index == 3) {
            Utils.INSTANCE.reloadApp();
        } else if (index == 4) {
            showConfirmAction(context, "Clear Cache & Reset", "This will clear all cached bundles and reset to default settings.", new Function0() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxMenu$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LogBoxMenu.handleMenuSelection$lambda$66(context);
                }
            });
        } else {
            if (index != 5) {
                return;
            }
            showOptionsMenu(context);
        }
    }
}
