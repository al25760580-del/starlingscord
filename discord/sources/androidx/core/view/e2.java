package androidx.core.view;

import android.view.WindowInsets;
import androidx.core.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class e2 extends d2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final WindowInsetsCompat f1652s = WindowInsetsCompat.g(null, WindowInsets.CONSUMED);

    public e2(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
        super(windowInsetsCompat, windowInsets);
    }

    @Override // androidx.core.view.c2, androidx.core.view.y1, androidx.core.view.f2
    public Insets f(int i7) {
        return Insets.c(this.f1749c.getInsets(h2.a(i7)));
    }

    @Override // androidx.core.view.c2, androidx.core.view.y1, androidx.core.view.f2
    public Insets g(int i7) {
        return Insets.c(this.f1749c.getInsetsIgnoringVisibility(h2.a(i7)));
    }

    @Override // androidx.core.view.c2, androidx.core.view.y1, androidx.core.view.f2
    public boolean p(int i7) {
        return this.f1749c.isVisible(h2.a(i7));
    }
}
