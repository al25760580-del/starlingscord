package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.graphics.Insets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class WindowInsetsCompat {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WindowInsetsCompat f1604b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2 f1605a;

    static {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            f1604b = e2.f1652s;
        } else if (i7 >= 30) {
            f1604b = c2.f1643r;
        } else {
            f1604b = f2.f1661b;
        }
    }

    public WindowInsetsCompat(WindowInsets windowInsets) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            this.f1605a = new e2(this, windowInsets);
            return;
        }
        if (i7 >= 31) {
            this.f1605a = new d2(this, windowInsets);
            return;
        }
        if (i7 >= 30) {
            this.f1605a = new c2(this, windowInsets);
            return;
        }
        if (i7 >= 29) {
            this.f1605a = new b2(this, windowInsets);
        } else if (i7 >= 28) {
            this.f1605a = new a2(this, windowInsets);
        } else {
            this.f1605a = new z1(this, windowInsets);
        }
    }

    public static Insets e(Insets insets, int i7, int i10, int i11, int i12) {
        int iMax = Math.max(0, insets.f1556a - i7);
        int iMax2 = Math.max(0, insets.f1557b - i10);
        int iMax3 = Math.max(0, insets.f1558c - i11);
        int iMax4 = Math.max(0, insets.f1559d - i12);
        return (iMax == i7 && iMax2 == i10 && iMax3 == i11 && iMax4 == i12) ? insets : Insets.b(iMax, iMax2, iMax3, iMax4);
    }

    public static WindowInsetsCompat g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        WindowInsetsCompat windowInsetsCompat = new WindowInsetsCompat(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = u0.f1729a;
            WindowInsetsCompat windowInsetsCompatA = m0.a(view);
            f2 f2Var = windowInsetsCompat.f1605a;
            f2Var.r(windowInsetsCompatA);
            f2Var.d(view.getRootView());
            f2Var.t(view.getWindowSystemUiVisibility());
        }
        return windowInsetsCompat;
    }

    public final int a() {
        return this.f1605a.k().f1559d;
    }

    public final int b() {
        return this.f1605a.k().f1556a;
    }

    public final int c() {
        return this.f1605a.k().f1558c;
    }

    public final int d() {
        return this.f1605a.k().f1557b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WindowInsetsCompat) {
            return Objects.equals(this.f1605a, ((WindowInsetsCompat) obj).f1605a);
        }
        return false;
    }

    public final WindowInsets f() {
        f2 f2Var = this.f1605a;
        if (f2Var instanceof y1) {
            return ((y1) f2Var).f1749c;
        }
        return null;
    }

    public final int hashCode() {
        f2 f2Var = this.f1605a;
        if (f2Var == null) {
            return 0;
        }
        return f2Var.hashCode();
    }

    public WindowInsetsCompat() {
        this.f1605a = new f2(this);
    }
}
