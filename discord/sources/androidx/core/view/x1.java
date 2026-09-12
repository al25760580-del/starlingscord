package androidx.core.view;

import androidx.core.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public abstract class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowInsetsCompat f1742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Insets[] f1743b;

    public x1() {
        this(new WindowInsetsCompat());
    }

    public final void a() {
        Insets[] insetsArr = this.f1743b;
        if (insetsArr != null) {
            Insets insetsF = insetsArr[0];
            Insets insetsF2 = insetsArr[1];
            WindowInsetsCompat windowInsetsCompat = this.f1742a;
            if (insetsF2 == null) {
                insetsF2 = windowInsetsCompat.f1605a.f(2);
            }
            if (insetsF == null) {
                insetsF = windowInsetsCompat.f1605a.f(1);
            }
            g(Insets.a(insetsF, insetsF2));
            Insets insets = this.f1743b[mf.f.y(16)];
            if (insets != null) {
                f(insets);
            }
            Insets insets2 = this.f1743b[mf.f.y(32)];
            if (insets2 != null) {
                d(insets2);
            }
            Insets insets3 = this.f1743b[mf.f.y(64)];
            if (insets3 != null) {
                h(insets3);
            }
        }
    }

    public abstract WindowInsetsCompat b();

    public void c(int i7, Insets insets) {
        if (this.f1743b == null) {
            this.f1743b = new Insets[10];
        }
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i7 & i10) != 0) {
                this.f1743b[mf.f.y(i10)] = insets;
            }
        }
    }

    public void d(Insets insets) {
    }

    public abstract void e(Insets insets);

    public void f(Insets insets) {
    }

    public abstract void g(Insets insets);

    public void h(Insets insets) {
    }

    public x1(WindowInsetsCompat windowInsetsCompat) {
        this.f1742a = windowInsetsCompat;
    }
}
