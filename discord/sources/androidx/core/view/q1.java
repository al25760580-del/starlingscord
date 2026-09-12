package androidx.core.view;

import android.view.WindowInsetsAnimationController;
import androidx.core.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class q1 extends ls.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowInsetsAnimationController f1716a;

    public q1(WindowInsetsAnimationController windowInsetsAnimationController) {
        this.f1716a = windowInsetsAnimationController;
    }

    public final void D(boolean z5) {
        this.f1716a.finish(z5);
    }

    public final float E() {
        return this.f1716a.getCurrentFraction();
    }

    public final Insets F() {
        return Insets.c(this.f1716a.getCurrentInsets());
    }

    public final Insets G() {
        return Insets.c(this.f1716a.getHiddenStateInsets());
    }

    public final Insets H() {
        return Insets.c(this.f1716a.getShownStateInsets());
    }

    public final void I(Insets insets, float f2) {
        this.f1716a.setInsetsAndAlpha(insets.d(), 1.0f, f2);
    }
}
