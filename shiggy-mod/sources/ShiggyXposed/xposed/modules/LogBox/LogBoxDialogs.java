package ShiggyXposed.xposed.modules.LogBox;

import android.app.AlertDialog;
import android.content.Context;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LogBoxDialogs.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u0016\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"LShiggyXposed/xposed/modules/LogBox/LogBoxDialogs;", "", "<init>", "()V", "currentMenuContainer", "Landroid/widget/LinearLayout;", "getCurrentMenuContainer", "()Landroid/widget/LinearLayout;", "setCurrentMenuContainer", "(Landroid/widget/LinearLayout;)V", "createDialog", "Landroid/app/AlertDialog;", "context", "Landroid/content/Context;", "container", "constrainContainerWidth", "", "setDialogWindowWidth", "dialog", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class LogBoxDialogs {
    public static final LogBoxDialogs INSTANCE = new LogBoxDialogs();
    private static LinearLayout currentMenuContainer;

    private LogBoxDialogs() {
    }

    public final LinearLayout getCurrentMenuContainer() {
        return currentMenuContainer;
    }

    public final void setCurrentMenuContainer(LinearLayout linearLayout) {
        currentMenuContainer = linearLayout;
    }

    public final AlertDialog createDialog(Context context, LinearLayout container) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(container, "container");
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setView(container).create();
        Window window = alertDialogCreate.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(LogBoxUtils.INSTANCE.createM3Background(context, 0, 28.0f));
        }
        constrainContainerWidth(context, container);
        Intrinsics.checkNotNull(alertDialogCreate);
        return alertDialogCreate;
    }

    public final void constrainContainerWidth(Context context, LinearLayout container) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(container, "container");
        try {
            int i = (int) (((double) context.getResources().getDisplayMetrics().widthPixels) * 0.9d);
            container.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            container.setMinimumWidth(i);
        } catch (Exception unused) {
        }
    }

    public final void setDialogWindowWidth(AlertDialog dialog, Context context) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(context, "context");
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
                    LinearLayout.LayoutParams layoutParams = linearLayout.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    }
                    layoutParams.width = -1;
                    linearLayout.setLayoutParams(layoutParams);
                    try {
                        linearLayout.setMinimumWidth(i);
                    } catch (Exception unused) {
                    }
                    Boolean.valueOf(linearLayout.post(new Runnable() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxDialogs$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            LogBoxDialogs.setDialogWindowWidth$lambda$1$lambda$0(linearLayout);
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
    public static final void setDialogWindowWidth$lambda$1$lambda$0(LinearLayout linearLayout) {
        try {
            linearLayout.requestLayout();
            linearLayout.invalidate();
        } catch (Exception unused) {
        }
    }
}
