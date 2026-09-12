package bh;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public CharSequence B;
    public CharSequence C;
    public boolean D;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int L;
    public int[] M;
    public boolean N;
    public final TextPaint O;
    public final TextPaint P;
    public TimeInterpolator Q;
    public TimeInterpolator R;
    public float S;
    public float T;
    public float U;
    public ColorStateList V;
    public float W;
    public float X;
    public float Y;
    public StaticLayout Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f3237a;
    public float a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f3238b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f3239b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f3240c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public float f3241c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f3242d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public CharSequence f3243d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f3244e;
    public ColorStateList j;
    public ColorStateList k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f3254k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3255l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f3256m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f3257n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f3258o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f3259p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f3260q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f3261r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Typeface f3262s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Typeface f3263t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Typeface f3264u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Typeface f3265v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Typeface f3266w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Typeface f3267x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Typeface f3268y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public hh.a f3269z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3246f = 16;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3248g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f3250h = 15.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f3251i = 15.0f;
    public final TextUtils.TruncateAt A = TextUtils.TruncateAt.END;
    public final boolean E = true;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f3245e0 = 1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f3247f0 = 1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final float f3249g0 = 1.0f;
    public final int h0 = 1;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f3252i0 = -1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f3253j0 = -1;

    public c(TextInputLayout textInputLayout) {
        this.f3237a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.O = textPaint;
        this.P = new TextPaint(textPaint);
        this.f3242d = new Rect();
        this.f3240c = new Rect();
        this.f3244e = new RectF();
        i(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(int i7, int i10, float f2) {
        float f7 = 1.0f - f2;
        return Color.argb(Math.round((Color.alpha(i10) * f2) + (Color.alpha(i7) * f7)), Math.round((Color.red(i10) * f2) + (Color.red(i7) * f7)), Math.round((Color.green(i10) * f2) + (Color.green(i7) * f7)), Math.round((Color.blue(i10) * f2) + (Color.blue(i7) * f7)));
    }

    public static float h(float f2, float f7, float f10, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f10 = timeInterpolator.getInterpolation(f10);
        }
        return lg.a.a(f2, f7, f10);
    }

    public final void b() {
        float f2 = this.f3238b;
        Rect rect = this.f3240c;
        float f7 = rect.left;
        Rect rect2 = this.f3242d;
        float fH = h(f7, rect2.left, f2, this.Q);
        RectF rectF = this.f3244e;
        rectF.left = fH;
        rectF.top = h(this.f3256m, this.f3257n, f2, this.Q);
        rectF.right = h(rect.right, rect2.right, f2, this.Q);
        rectF.bottom = h(rect.bottom, rect2.bottom, f2, this.Q);
        this.f3260q = h(this.f3258o, this.f3259p, f2, this.Q);
        this.f3261r = h(this.f3256m, this.f3257n, f2, this.Q);
        d(f2, false);
        TextInputLayout textInputLayout = this.f3237a;
        textInputLayout.postInvalidateOnAnimation();
        q2.a aVar = lg.a.f15072b;
        this.f3239b0 = 1.0f - h(0.0f, 1.0f, 1.0f - f2, aVar);
        textInputLayout.postInvalidateOnAnimation();
        this.f3241c0 = h(1.0f, 0.0f, f2, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.k;
        ColorStateList colorStateList2 = this.j;
        TextPaint textPaint = this.O;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(g(colorStateList2), g(this.k), f2));
        } else {
            textPaint.setColor(g(colorStateList));
        }
        float f10 = this.W;
        float f11 = this.X;
        if (f10 != f11) {
            textPaint.setLetterSpacing(h(f11, f10, f2, aVar));
        } else {
            textPaint.setLetterSpacing(f10);
        }
        this.H = lg.a.a(0.0f, this.S, f2);
        this.I = lg.a.a(0.0f, this.T, f2);
        this.J = lg.a.a(0.0f, this.U, f2);
        int iA = a(0, g(this.V), f2);
        this.K = iA;
        textPaint.setShadowLayer(this.H, this.I, this.J, iA);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final boolean c(CharSequence charSequence) {
        boolean z5 = this.f3237a.getLayoutDirection() == 1;
        if (this.E) {
            return (z5 ? j1.d.f13611d : j1.d.f13610c).n(charSequence.length(), charSequence);
        }
        return z5;
    }

    public final void d(float f2, boolean z5) {
        float f7;
        Typeface typeface;
        float f10;
        if (this.B == null) {
            return;
        }
        float fWidth = this.f3242d.width();
        float fWidth2 = this.f3240c.width();
        if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
            f7 = o() ? this.f3251i : this.f3250h;
            f10 = o() ? this.W : this.X;
            this.F = o() ? 1.0f : h(this.f3250h, this.f3251i, f2, this.R) / this.f3250h;
            if (!o()) {
                fWidth = fWidth2;
            }
            typeface = this.f3262s;
            fWidth2 = fWidth;
        } else {
            f7 = this.f3250h;
            float f11 = this.X;
            typeface = this.f3265v;
            if (Math.abs(f2 - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = h(this.f3250h, this.f3251i, f2, this.R) / this.f3250h;
            }
            float f12 = this.f3251i / this.f3250h;
            float f13 = fWidth2 * f12;
            if (!z5 && f13 > fWidth && o()) {
                fWidth2 = Math.min(fWidth / f12, fWidth2);
            }
            f10 = f11;
        }
        int i7 = f2 < 0.5f ? this.f3245e0 : this.f3247f0;
        TextPaint textPaint = this.O;
        boolean z6 = false;
        if (fWidth2 > 0.0f) {
            boolean z7 = this.G != f7;
            boolean z10 = this.Y != f10;
            boolean z11 = this.f3268y != typeface;
            StaticLayout staticLayout = this.Z;
            boolean z12 = z7 || z10 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z11 || (this.L != i7) || this.N;
            this.G = f7;
            this.Y = f10;
            this.f3268y = typeface;
            this.N = false;
            this.L = i7;
            textPaint.setLinearText(this.F != 1.0f);
            z6 = z12;
        }
        if (this.C == null || z6) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.f3268y);
            textPaint.setLetterSpacing(this.Y);
            boolean zC = c(this.B);
            this.D = zC;
            StaticLayout staticLayoutE = e(((this.f3245e0 > 1 || this.f3247f0 > 1) && !zC) ? i7 : 1, textPaint, this.B, fWidth2 * (o() ? 1.0f : this.F), this.D);
            this.Z = staticLayoutE;
            this.C = staticLayoutE.getText();
        }
    }

    public final StaticLayout e(int i7, TextPaint textPaint, CharSequence charSequence, float f2, boolean z5) {
        Layout.Alignment alignment;
        if (i7 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f3246f, this.D ? 1 : 0) & 7;
            if (absoluteGravity == 1) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else if (absoluteGravity != 5) {
                alignment = this.D ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = this.D ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
            }
        }
        i iVar = new i(charSequence, textPaint, (int) f2);
        iVar.f3281l = this.A;
        iVar.k = z5;
        iVar.f3276e = alignment;
        iVar.j = false;
        iVar.f3277f = i7;
        float f7 = this.f3249g0;
        iVar.f3278g = 0.0f;
        iVar.f3279h = f7;
        iVar.f3280i = this.h0;
        iVar.f3282m = null;
        StaticLayout staticLayoutA = iVar.a();
        staticLayoutA.getClass();
        return staticLayoutA;
    }

    public final float f() {
        int i7 = this.f3252i0;
        if (i7 != -1) {
            return i7;
        }
        float f2 = this.f3251i;
        TextPaint textPaint = this.P;
        textPaint.setTextSize(f2);
        textPaint.setTypeface(this.f3262s);
        textPaint.setLetterSpacing(this.W);
        return -textPaint.ascent();
    }

    public final int g(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.M;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void i(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f3264u;
            if (typeface != null) {
                this.f3263t = hh.e.a(configuration, typeface);
            }
            Typeface typeface2 = this.f3267x;
            if (typeface2 != null) {
                this.f3266w = hh.e.a(configuration, typeface2);
            }
            Typeface typeface3 = this.f3263t;
            if (typeface3 == null) {
                typeface3 = this.f3264u;
            }
            this.f3262s = typeface3;
            Typeface typeface4 = this.f3266w;
            if (typeface4 == null) {
                typeface4 = this.f3267x;
            }
            this.f3265v = typeface4;
            j(true);
        }
    }

    public final void j(boolean z5) {
        float fMeasureText;
        TextInputLayout textInputLayout = this.f3237a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z5) {
            return;
        }
        d(1.0f, z5);
        CharSequence charSequence = this.C;
        TextPaint textPaint = this.O;
        if (charSequence != null && this.Z != null) {
            this.f3243d0 = o() ? TextUtils.ellipsize(this.C, textPaint, this.Z.getWidth(), this.A) : this.C;
        }
        CharSequence charSequence2 = this.f3243d0;
        if (charSequence2 != null) {
            this.a0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.a0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f3248g, this.D ? 1 : 0);
        int i7 = absoluteGravity & 112;
        Rect rect = this.f3242d;
        if (i7 == 48) {
            this.f3257n = rect.top;
        } else if (i7 != 80) {
            this.f3257n = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f3257n = textPaint.ascent() + rect.bottom;
        }
        int i10 = absoluteGravity & 8388615;
        if (i10 == 1) {
            this.f3259p = rect.centerX() - (this.a0 / 2.0f);
        } else if (i10 != 5) {
            this.f3259p = rect.left;
        } else {
            this.f3259p = rect.right - this.a0;
        }
        if (this.a0 <= rect.width()) {
            float f2 = this.f3259p;
            float fMax = Math.max(0.0f, rect.left - f2) + f2;
            this.f3259p = fMax;
            this.f3259p = Math.min(0.0f, rect.right - (this.a0 + fMax)) + fMax;
        }
        float f7 = this.f3251i;
        TextPaint textPaint2 = this.P;
        textPaint2.setTextSize(f7);
        textPaint2.setTypeface(this.f3262s);
        textPaint2.setLetterSpacing(this.W);
        if (textPaint2.descent() + (-textPaint2.ascent()) <= rect.height()) {
            float f10 = this.f3257n;
            float fMax2 = Math.max(0.0f, rect.top - f10) + f10;
            this.f3257n = fMax2;
            this.f3257n = Math.min(0.0f, rect.bottom - (f() + fMax2)) + fMax2;
        }
        d(0.0f, z5);
        StaticLayout staticLayout = this.Z;
        float height = staticLayout != null ? staticLayout.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.Z;
        if (staticLayout2 == null || this.f3245e0 <= 1) {
            CharSequence charSequence3 = this.C;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.Z;
        this.f3255l = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f3246f, this.D ? 1 : 0);
        int i11 = absoluteGravity2 & 112;
        Rect rect2 = this.f3240c;
        if (i11 == 48) {
            this.f3256m = rect2.top;
        } else if (i11 != 80) {
            this.f3256m = rect2.centerY() - (height / 2.0f);
        } else {
            this.f3256m = (rect2.bottom - height) + (this.f3254k0 ? textPaint.descent() : 0.0f);
        }
        int i12 = absoluteGravity2 & 8388615;
        if (i12 == 1) {
            this.f3258o = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i12 != 5) {
            this.f3258o = rect2.left;
        } else {
            this.f3258o = rect2.right - fMeasureText;
        }
        d(this.f3238b, false);
        textInputLayout.postInvalidateOnAnimation();
        b();
    }

    public final void k(ColorStateList colorStateList) {
        if (this.k == colorStateList && this.j == colorStateList) {
            return;
        }
        this.k = colorStateList;
        this.j = colorStateList;
        j(false);
    }

    public final boolean l(Typeface typeface) {
        hh.a aVar = this.f3269z;
        if (aVar != null) {
            aVar.f10746d = true;
        }
        if (this.f3264u == typeface) {
            return false;
        }
        this.f3264u = typeface;
        Typeface typefaceA = hh.e.a(this.f3237a.getContext().getResources().getConfiguration(), typeface);
        this.f3263t = typefaceA;
        if (typefaceA == null) {
            typefaceA = this.f3264u;
        }
        this.f3262s = typefaceA;
        return true;
    }

    public final void m(float f2) {
        float fE = yk.a.e(f2, 0.0f, 1.0f);
        if (fE != this.f3238b) {
            this.f3238b = fE;
            b();
        }
    }

    public final void n(Typeface typeface) {
        boolean z5;
        boolean zL = l(typeface);
        if (this.f3267x != typeface) {
            this.f3267x = typeface;
            Typeface typefaceA = hh.e.a(this.f3237a.getContext().getResources().getConfiguration(), typeface);
            this.f3266w = typefaceA;
            if (typefaceA == null) {
                typefaceA = this.f3267x;
            }
            this.f3265v = typefaceA;
            z5 = true;
        } else {
            z5 = false;
        }
        if (zL || z5) {
            j(false);
        }
    }

    public final boolean o() {
        return this.f3247f0 == 1;
    }
}
