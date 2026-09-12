package androidx.core.view;

import android.os.Build;
import android.view.View;
import androidx.core.graphics.Insets;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class f2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WindowInsetsCompat f1661b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowInsetsCompat f1662a;

    static {
        x1 t1Var;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            t1Var = new w1();
        } else if (i7 >= 31) {
            t1Var = new v1();
        } else if (i7 >= 30) {
            t1Var = new u1();
        } else {
            t1Var = i7 >= 29 ? new t1() : new r1();
        }
        f1661b = t1Var.b().f1605a.a().f1605a.b().f1605a.c();
    }

    public f2(WindowInsetsCompat windowInsetsCompat) {
        this.f1662a = windowInsetsCompat;
    }

    public WindowInsetsCompat a() {
        return this.f1662a;
    }

    public WindowInsetsCompat b() {
        return this.f1662a;
    }

    public WindowInsetsCompat c() {
        return this.f1662a;
    }

    public void d(View view) {
    }

    public i e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj;
        return o() == f2Var.o() && n() == f2Var.n() && Objects.equals(k(), f2Var.k()) && Objects.equals(i(), f2Var.i()) && Objects.equals(e(), f2Var.e());
    }

    public Insets f(int i7) {
        return Insets.f1555e;
    }

    public Insets g(int i7) {
        if ((i7 & 8) == 0) {
            return Insets.f1555e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public Insets h() {
        return k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), e());
    }

    public Insets i() {
        return Insets.f1555e;
    }

    public Insets j() {
        return k();
    }

    public Insets k() {
        return Insets.f1555e;
    }

    public Insets l() {
        return k();
    }

    public WindowInsetsCompat m(int i7, int i10, int i11, int i12) {
        return f1661b;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public boolean p(int i7) {
        return true;
    }

    public void q(Insets[] insetsArr) {
    }

    public void r(WindowInsetsCompat windowInsetsCompat) {
    }

    public void s(Insets insets) {
    }

    public void t(int i7) {
    }
}
