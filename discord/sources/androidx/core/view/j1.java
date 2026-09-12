package androidx.core.view;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import androidx.core.graphics.Insets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j1 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1 f1682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WindowInsetsCompat f1683b;

    public j1(View view, g1 g1Var) {
        WindowInsetsCompat windowInsetsCompatB;
        this.f1682a = g1Var;
        WeakHashMap weakHashMap = u0.f1729a;
        WindowInsetsCompat windowInsetsCompatA = m0.a(view);
        if (windowInsetsCompatA != null) {
            int i7 = Build.VERSION.SDK_INT;
            windowInsetsCompatB = (i7 >= 34 ? new w1(windowInsetsCompatA) : i7 >= 31 ? new v1(windowInsetsCompatA) : i7 >= 30 ? new u1(windowInsetsCompatA) : i7 >= 29 ? new t1(windowInsetsCompatA) : new r1(windowInsetsCompatA)).b();
        } else {
            windowInsetsCompatB = null;
        }
        this.f1683b = windowInsetsCompatB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.f1683b = WindowInsetsCompat.g(view, windowInsets);
            return k1.i(view, windowInsets);
        }
        WindowInsetsCompat windowInsetsCompatG = WindowInsetsCompat.g(view, windowInsets);
        f2 f2Var = windowInsetsCompatG.f1605a;
        if (this.f1683b == null) {
            WeakHashMap weakHashMap = u0.f1729a;
            this.f1683b = m0.a(view);
        }
        if (this.f1683b == null) {
            this.f1683b = windowInsetsCompatG;
            return k1.i(view, windowInsets);
        }
        g1 g1VarJ = k1.j(view);
        if (g1VarJ != null && Objects.equals(g1VarJ.mDispachedInsets, windowInsetsCompatG)) {
            return k1.i(view, windowInsets);
        }
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        WindowInsetsCompat windowInsetsCompat = this.f1683b;
        int i7 = 1;
        while (i7 <= 512) {
            Insets insetsF = f2Var.f(i7);
            Insets insetsF2 = windowInsetsCompat.f1605a.f(i7);
            int i10 = insetsF.f1556a;
            int i11 = insetsF.f1559d;
            int i12 = insetsF.f1558c;
            int i13 = insetsF.f1557b;
            int i14 = insetsF2.f1556a;
            int i15 = insetsF2.f1559d;
            int i16 = insetsF2.f1558c;
            int i17 = insetsF2.f1557b;
            boolean z5 = i10 > i14 || i13 > i17 || i12 > i16 || i11 > i15;
            if (z5 != (i10 < i14 || i13 < i17 || i12 < i16 || i11 < i15)) {
                if (z5) {
                    iArr[0] = iArr[0] | i7;
                } else {
                    iArr2[0] = iArr2[0] | i7;
                }
            }
            i7 <<= 1;
            iArr = iArr;
        }
        int i18 = iArr[0];
        int i19 = iArr2[0];
        int i20 = i18 | i19;
        if (i20 == 0) {
            this.f1683b = windowInsetsCompatG;
            return k1.i(view, windowInsets);
        }
        WindowInsetsCompat windowInsetsCompat2 = this.f1683b;
        if ((i18 & 8) != 0) {
            interpolator = k1.f1687e;
        } else if ((i19 & 8) != 0) {
            interpolator = k1.f1688f;
        } else if ((i18 & 519) != 0) {
            interpolator = k1.f1689g;
        } else {
            interpolator = (i19 & 519) != 0 ? k1.f1690h : null;
        }
        p1 p1Var = new p1(i20, interpolator, (i20 & 8) != 0 ? 160L : 250L);
        p1Var.f1715a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(p1Var.f1715a.a());
        Insets insetsF3 = f2Var.f(i20);
        Insets insetsF4 = windowInsetsCompat2.f1605a.f(i20);
        int iMin = Math.min(insetsF3.f1556a, insetsF4.f1556a);
        int i21 = insetsF3.f1557b;
        int i22 = insetsF4.f1557b;
        int iMin2 = Math.min(i21, i22);
        int i23 = insetsF3.f1558c;
        int i24 = insetsF4.f1558c;
        int iMin3 = Math.min(i23, i24);
        int i25 = insetsF3.f1559d;
        int i26 = insetsF4.f1559d;
        f1 f1Var = new f1(Insets.b(iMin, iMin2, iMin3, Math.min(i25, i26)), Insets.b(Math.max(insetsF3.f1556a, insetsF4.f1556a), Math.max(i21, i22), Math.max(i23, i24), Math.max(i25, i26)));
        k1.f(view, p1Var, windowInsetsCompatG, false);
        duration.addUpdateListener(new h1(p1Var, windowInsetsCompatG, windowInsetsCompat2, i20, view));
        duration.addListener(new b1(p1Var, view, 1));
        w.a(view, new i1(view, p1Var, f1Var, duration));
        this.f1683b = windowInsetsCompatG;
        return k1.i(view, windowInsets);
    }
}
