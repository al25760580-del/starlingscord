package ShiggyXposed.xposed.modules.LogBox;

import android.app.AlertDialog;
import android.content.Context;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: FlavorSelectionMenu.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"LShiggyXposed/xposed/modules/LogBox/FlavorSelectionMenu;", "", "<init>", "()V", "showFlavorSelection", "", "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class FlavorSelectionMenu {
    public static final FlavorSelectionMenu INSTANCE = new FlavorSelectionMenu();

    private FlavorSelectionMenu() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, android.app.AlertDialog] */
    public final void showFlavorSelection(final Context context) {
        AlertDialog alertDialog;
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        M3Colors m3Colors = LogBoxTheme.INSTANCE.getM3Colors(context);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        LinearLayout linearLayoutCreateMenuContainer = LogBoxComponents.INSTANCE.createMenuContainer(context, m3Colors, 20);
        linearLayoutCreateMenuContainer.addView(LogBoxComponents.INSTANCE.createTitle(context, m3Colors, "Select Menu Flavor", true));
        for (final String str : LogBoxConstants.INSTANCE.getFLAVORS()) {
            LogBoxComponents logBoxComponents = LogBoxComponents.INSTANCE;
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
            linearLayoutCreateMenuContainer.addView(logBoxComponents.createM3Button(context, string, m3Colors, new Function0() { // from class: ShiggyXposed.xposed.modules.LogBox.FlavorSelectionMenu$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FlavorSelectionMenu.showFlavorSelection$lambda$2$lambda$1(objectRef, context, str);
                }
            }));
        }
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
    public static final Unit showFlavorSelection$lambda$2$lambda$1(Ref.ObjectRef objectRef, Context context, String str) {
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
        return Unit.INSTANCE;
    }
}
