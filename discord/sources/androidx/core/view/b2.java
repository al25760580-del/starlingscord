package androidx.core.view;

import android.view.WindowInsets;
import androidx.core.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public class b2 extends a2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Insets f1636o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Insets f1637p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Insets f1638q;

    public b2(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
        super(windowInsetsCompat, windowInsets);
        this.f1636o = null;
        this.f1637p = null;
        this.f1638q = null;
    }

    @Override // androidx.core.view.f2
    public Insets h() {
        if (this.f1637p == null) {
            this.f1637p = Insets.c(this.f1749c.getMandatorySystemGestureInsets());
        }
        return this.f1637p;
    }

    @Override // androidx.core.view.f2
    public Insets j() {
        if (this.f1636o == null) {
            this.f1636o = Insets.c(this.f1749c.getSystemGestureInsets());
        }
        return this.f1636o;
    }

    @Override // androidx.core.view.f2
    public Insets l() {
        if (this.f1638q == null) {
            this.f1638q = Insets.c(this.f1749c.getTappableElementInsets());
        }
        return this.f1638q;
    }

    @Override // androidx.core.view.y1, androidx.core.view.f2
    public WindowInsetsCompat m(int i7, int i10, int i11, int i12) {
        return WindowInsetsCompat.g(null, this.f1749c.inset(i7, i10, i11, i12));
    }

    @Override // androidx.core.view.z1, androidx.core.view.f2
    public void s(Insets insets) {
    }
}
