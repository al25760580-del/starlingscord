package ShiggyXposed.xposed.modules.LogBox;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LogBoxNavigation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"LShiggyXposed/xposed/modules/LogBox/LogBoxNavigation;", "", "<init>", "()V", "showRecoveryMenu", "", "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class LogBoxNavigation {
    public static final LogBoxNavigation INSTANCE = new LogBoxNavigation();

    private LogBoxNavigation() {
    }

    public final void showRecoveryMenu(Context context) throws Exception {
        Intrinsics.checkNotNullParameter(context, "context");
        LogBoxMenu.INSTANCE.showRecoveryMenu(context);
    }
}
