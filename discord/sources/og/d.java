package og;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.core.view.u0;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements AccessibilityViewCommand {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f17258d;

    public d(SwipeDismissBehavior swipeDismissBehavior) {
        this.f17258d = swipeDismissBehavior;
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean c(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        SwipeDismissBehavior swipeDismissBehavior = this.f17258d;
        if (!swipeDismissBehavior.s(view)) {
            return false;
        }
        boolean z5 = view.getLayoutDirection() == 1;
        int i7 = swipeDismissBehavior.f6267d;
        int width = (!(i7 == 0 && z5) && (i7 != 1 || z5)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = u0.f1729a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }
}
