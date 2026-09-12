package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.graphics.Insets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class y1 extends f2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f1746i = false;
    public static Method j;
    public static Class k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Field f1747l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static Field f1748m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets f1749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Insets[] f1750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Insets f1751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WindowInsetsCompat f1752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Insets f1753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1754h;

    public y1(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
        super(windowInsetsCompat);
        this.f1751e = null;
        this.f1749c = windowInsets;
    }

    public static boolean B(int i7, int i10) {
        return (i7 & 6) == (i10 & 6);
    }

    @SuppressLint({"WrongConstant"})
    private Insets u(int i7, boolean z5) {
        Insets insetsA = Insets.f1555e;
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i7 & i10) != 0) {
                insetsA = Insets.a(insetsA, v(i10, z5));
            }
        }
        return insetsA;
    }

    private Insets w() {
        WindowInsetsCompat windowInsetsCompat = this.f1752f;
        return windowInsetsCompat != null ? windowInsetsCompat.f1605a.i() : Insets.f1555e;
    }

    private Insets x(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f1746i) {
            z();
        }
        Method method = j;
        if (method != null && k != null && f1747l != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f1747l.get(f1748m.get(objInvoke));
                if (rect != null) {
                    return Insets.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void z() {
        try {
            j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            k = cls;
            f1747l = cls.getDeclaredField("mVisibleInsets");
            f1748m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f1747l.setAccessible(true);
            f1748m.setAccessible(true);
        } catch (ReflectiveOperationException e10) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
        }
        f1746i = true;
    }

    public void A(Insets insets) {
        this.f1753g = insets;
    }

    @Override // androidx.core.view.f2
    public void d(View view) {
        Insets insetsX = x(view);
        if (insetsX == null) {
            insetsX = Insets.f1555e;
        }
        A(insetsX);
    }

    @Override // androidx.core.view.f2
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return Objects.equals(this.f1753g, y1Var.f1753g) && B(this.f1754h, y1Var.f1754h);
    }

    @Override // androidx.core.view.f2
    public Insets f(int i7) {
        return u(i7, false);
    }

    @Override // androidx.core.view.f2
    public Insets g(int i7) {
        return u(i7, true);
    }

    @Override // androidx.core.view.f2
    public final Insets k() {
        if (this.f1751e == null) {
            WindowInsets windowInsets = this.f1749c;
            this.f1751e = Insets.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f1751e;
    }

    @Override // androidx.core.view.f2
    public WindowInsetsCompat m(int i7, int i10, int i11, int i12) {
        x1 t1Var;
        WindowInsetsCompat windowInsetsCompatG = WindowInsetsCompat.g(null, this.f1749c);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 34) {
            t1Var = new w1(windowInsetsCompatG);
        } else if (i13 >= 31) {
            t1Var = new v1(windowInsetsCompatG);
        } else if (i13 >= 30) {
            t1Var = new u1(windowInsetsCompatG);
        } else {
            t1Var = i13 >= 29 ? new t1(windowInsetsCompatG) : new r1(windowInsetsCompatG);
        }
        t1Var.g(WindowInsetsCompat.e(k(), i7, i10, i11, i12));
        t1Var.e(WindowInsetsCompat.e(i(), i7, i10, i11, i12));
        return t1Var.b();
    }

    @Override // androidx.core.view.f2
    public boolean o() {
        return this.f1749c.isRound();
    }

    @Override // androidx.core.view.f2
    @SuppressLint({"WrongConstant"})
    public boolean p(int i7) {
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i7 & i10) != 0 && !y(i10)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.view.f2
    public void q(Insets[] insetsArr) {
        this.f1750d = insetsArr;
    }

    @Override // androidx.core.view.f2
    public void r(WindowInsetsCompat windowInsetsCompat) {
        this.f1752f = windowInsetsCompat;
    }

    @Override // androidx.core.view.f2
    public void t(int i7) {
        this.f1754h = i7;
    }

    public Insets v(int i7, boolean z5) {
        Insets insetsI;
        int i10;
        Insets insets = Insets.f1555e;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 8) {
                    Insets[] insetsArr = this.f1750d;
                    insetsI = insetsArr != null ? insetsArr[mf.f.y(8)] : null;
                    if (insetsI != null) {
                        return insetsI;
                    }
                    Insets insetsK = k();
                    Insets insetsW = w();
                    int i11 = insetsK.f1559d;
                    if (i11 > insetsW.f1559d) {
                        return Insets.b(0, 0, 0, i11);
                    }
                    Insets insets2 = this.f1753g;
                    if (insets2 != null && !insets2.equals(insets) && (i10 = this.f1753g.f1559d) > insetsW.f1559d) {
                        return Insets.b(0, 0, 0, i10);
                    }
                } else {
                    if (i7 == 16) {
                        return j();
                    }
                    if (i7 == 32) {
                        return h();
                    }
                    if (i7 == 64) {
                        return l();
                    }
                    if (i7 == 128) {
                        WindowInsetsCompat windowInsetsCompat = this.f1752f;
                        i iVarE = windowInsetsCompat != null ? windowInsetsCompat.f1605a.e() : e();
                        if (iVarE != null) {
                            int i12 = Build.VERSION.SDK_INT;
                            return Insets.b(i12 >= 28 ? h.j(iVarE.f1670a) : 0, i12 >= 28 ? h.l(iVarE.f1670a) : 0, i12 >= 28 ? h.k(iVarE.f1670a) : 0, i12 >= 28 ? h.i(iVarE.f1670a) : 0);
                        }
                    }
                }
            } else {
                if (z5) {
                    Insets insetsW2 = w();
                    Insets insetsI2 = i();
                    return Insets.b(Math.max(insetsW2.f1556a, insetsI2.f1556a), 0, Math.max(insetsW2.f1558c, insetsI2.f1558c), Math.max(insetsW2.f1559d, insetsI2.f1559d));
                }
                if ((this.f1754h & 2) == 0) {
                    Insets insetsK2 = k();
                    WindowInsetsCompat windowInsetsCompat2 = this.f1752f;
                    insetsI = windowInsetsCompat2 != null ? windowInsetsCompat2.f1605a.i() : null;
                    int iMin = insetsK2.f1559d;
                    if (insetsI != null) {
                        iMin = Math.min(iMin, insetsI.f1559d);
                    }
                    return Insets.b(insetsK2.f1556a, 0, insetsK2.f1558c, iMin);
                }
            }
        } else {
            if (z5) {
                return Insets.b(0, Math.max(w().f1557b, k().f1557b), 0, 0);
            }
            if ((this.f1754h & 4) == 0) {
                return Insets.b(0, k().f1557b, 0, 0);
            }
        }
        return insets;
    }

    public boolean y(int i7) {
        if (i7 != 1 && i7 != 2) {
            if (i7 == 4) {
                return false;
            }
            if (i7 != 8 && i7 != 128) {
                return true;
            }
        }
        return !v(i7, false).equals(Insets.f1555e);
    }
}
