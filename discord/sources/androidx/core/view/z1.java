package androidx.core.view;

import android.view.WindowInsets;
import androidx.core.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public class z1 extends y1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Insets f1760n;

    public z1(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
        super(windowInsetsCompat, windowInsets);
        this.f1760n = null;
    }

    @Override // androidx.core.view.f2
    public WindowInsetsCompat b() {
        return WindowInsetsCompat.g(null, this.f1749c.consumeStableInsets());
    }

    @Override // androidx.core.view.f2
    public WindowInsetsCompat c() {
        return WindowInsetsCompat.g(null, this.f1749c.consumeSystemWindowInsets());
    }

    @Override // androidx.core.view.f2
    public final Insets i() {
        if (this.f1760n == null) {
            WindowInsets windowInsets = this.f1749c;
            this.f1760n = Insets.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f1760n;
    }

    @Override // androidx.core.view.f2
    public boolean n() {
        return this.f1749c.isConsumed();
    }

    @Override // androidx.core.view.f2
    public void s(Insets insets) {
        this.f1760n = insets;
    }
}
