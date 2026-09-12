package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;
import androidx.core.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public class c2 extends b2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final WindowInsetsCompat f1643r = WindowInsetsCompat.g(null, WindowInsets.CONSUMED);

    public c2(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
        super(windowInsetsCompat, windowInsets);
    }

    @Override // androidx.core.view.y1, androidx.core.view.f2
    public final void d(View view) {
    }

    @Override // androidx.core.view.y1, androidx.core.view.f2
    public Insets f(int i7) {
        return Insets.c(this.f1749c.getInsets(g2.a(i7)));
    }

    @Override // androidx.core.view.y1, androidx.core.view.f2
    public Insets g(int i7) {
        return Insets.c(this.f1749c.getInsetsIgnoringVisibility(g2.a(i7)));
    }

    @Override // androidx.core.view.y1, androidx.core.view.f2
    public boolean p(int i7) {
        return this.f1749c.isVisible(g2.a(i7));
    }
}
