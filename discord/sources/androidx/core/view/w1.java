package androidx.core.view;

import androidx.core.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class w1 extends v1 {
    public w1() {
    }

    @Override // androidx.core.view.u1, androidx.core.view.x1
    public void c(int i7, Insets insets) {
        this.f1728c.setInsets(h2.a(i7), insets.d());
    }

    public w1(WindowInsetsCompat windowInsetsCompat) {
        super(windowInsetsCompat);
    }
}
