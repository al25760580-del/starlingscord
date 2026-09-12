package androidx.core.view;

import android.view.View;
import android.view.WindowInsetsAnimation;
import androidx.core.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class n1 extends o1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f1707e;

    public n1(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f1707e = windowInsetsAnimation;
    }

    public static Insets e(WindowInsetsAnimation.Bounds bounds) {
        return Insets.c(bounds.getUpperBound());
    }

    public static Insets f(WindowInsetsAnimation.Bounds bounds) {
        return Insets.c(bounds.getLowerBound());
    }

    public static void g(View view, g1 g1Var) {
        view.setWindowInsetsAnimationCallback(g1Var != null ? new m1(g1Var) : null);
    }

    @Override // androidx.core.view.o1
    public final long a() {
        return this.f1707e.getDurationMillis();
    }

    @Override // androidx.core.view.o1
    public final float b() {
        return this.f1707e.getInterpolatedFraction();
    }

    @Override // androidx.core.view.o1
    public final int c() {
        return this.f1707e.getTypeMask();
    }

    @Override // androidx.core.view.o1
    public final void d(float f2) {
        this.f1707e.setFraction(f2);
    }
}
