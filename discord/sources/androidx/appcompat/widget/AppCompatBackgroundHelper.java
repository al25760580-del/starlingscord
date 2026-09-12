package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class AppCompatBackgroundHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f822a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m3 f825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m3 f826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m3 f827f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f824c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f823b = w.a();

    public AppCompatBackgroundHelper(View view) {
        this.f822a = view;
    }

    public final void a() {
        View view = this.f822a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f825d != null) {
                if (this.f827f == null) {
                    this.f827f = new m3();
                }
                m3 m3Var = this.f827f;
                m3Var.f1034c = null;
                m3Var.f1033b = false;
                m3Var.f1035d = null;
                m3Var.f1032a = false;
                WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
                ColorStateList colorStateListC = androidx.core.view.l0.c(view);
                if (colorStateListC != null) {
                    m3Var.f1033b = true;
                    m3Var.f1034c = colorStateListC;
                }
                PorterDuff.Mode modeD = androidx.core.view.l0.d(view);
                if (modeD != null) {
                    m3Var.f1032a = true;
                    m3Var.f1035d = modeD;
                }
                if (m3Var.f1033b || m3Var.f1032a) {
                    w.e(background, m3Var, view.getDrawableState());
                    return;
                }
            }
            m3 m3Var2 = this.f826e;
            if (m3Var2 != null) {
                w.e(background, m3Var2, view.getDrawableState());
                return;
            }
            m3 m3Var3 = this.f825d;
            if (m3Var3 != null) {
                w.e(background, m3Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        m3 m3Var = this.f826e;
        if (m3Var != null) {
            return (ColorStateList) m3Var.f1034c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        m3 m3Var = this.f826e;
        if (m3Var != null) {
            return (PorterDuff.Mode) m3Var.f1035d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i7) {
        ColorStateList colorStateListF;
        View view = this.f822a;
        Context context = view.getContext();
        int[] iArr = h.a.A;
        e4.m mVarE = e4.m.E(context, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) mVarE.f7994i;
        View view2 = this.f822a;
        androidx.core.view.u0.o(view2, view2.getContext(), iArr, attributeSet, (TypedArray) mVarE.f7994i, i7, 0);
        try {
            if (typedArray.hasValue(0)) {
                this.f824c = typedArray.getResourceId(0, -1);
                w wVar = this.f823b;
                Context context2 = view.getContext();
                int i10 = this.f824c;
                synchronized (wVar) {
                    colorStateListF = wVar.f1148a.f(context2, i10);
                }
                if (colorStateListF != null) {
                    g(colorStateListF);
                }
            }
            if (typedArray.hasValue(1)) {
                androidx.core.view.l0.i(view, mVarE.w(1));
            }
            if (typedArray.hasValue(2)) {
                androidx.core.view.l0.j(view, n1.c(typedArray.getInt(2, -1), null));
            }
            mVarE.H();
        } catch (Throwable th2) {
            mVarE.H();
            throw th2;
        }
    }

    public final void e() {
        this.f824c = -1;
        g(null);
        a();
    }

    public final void f(int i7) {
        ColorStateList colorStateListF;
        this.f824c = i7;
        w wVar = this.f823b;
        if (wVar != null) {
            Context context = this.f822a.getContext();
            synchronized (wVar) {
                colorStateListF = wVar.f1148a.f(context, i7);
            }
        } else {
            colorStateListF = null;
        }
        g(colorStateListF);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f825d == null) {
                this.f825d = new m3();
            }
            m3 m3Var = this.f825d;
            m3Var.f1034c = colorStateList;
            m3Var.f1033b = true;
        } else {
            this.f825d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f826e == null) {
            this.f826e = new m3();
        }
        m3 m3Var = this.f826e;
        m3Var.f1034c = colorStateList;
        m3Var.f1033b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f826e == null) {
            this.f826e = new m3();
        }
        m3 m3Var = this.f826e;
        m3Var.f1035d = mode;
        m3Var.f1032a = true;
        a();
    }
}
