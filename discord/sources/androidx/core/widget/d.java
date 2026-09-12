package androidx.core.widget;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.t1;

/* JADX INFO: loaded from: classes.dex */
public final class d implements View.OnTouchListener {
    public static final int O = ViewConfiguration.getTapTimeout();
    public final int E;
    public final float[] F;
    public final float[] G;
    public final float[] H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public final t1 N;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f1772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AccelerateInterpolator f1773e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t1 f1774i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a3.h f1775v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float[] f1776w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float[] f1777x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f1778y;

    public d(t1 t1Var) {
        a aVar = new a();
        aVar.f1767e = Long.MIN_VALUE;
        aVar.f1769g = -1L;
        aVar.f1768f = 0L;
        this.f1772d = aVar;
        this.f1773e = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f1776w = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1777x = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.F = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.G = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.H = fArr5;
        this.f1774i = t1Var;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f7 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr5[0] = f7;
        fArr5[1] = f7;
        float f10 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f10;
        fArr4[1] = f10;
        this.f1778y = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.E = O;
        aVar.f1763a = 500;
        aVar.f1764b = 500;
        this.N = t1Var;
    }

    public static float b(float f2, float f7, float f10) {
        if (f2 > f10) {
            return f10;
        }
        return f2 < f7 ? f7 : f2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float a(float f2, float f7, float f10, int i7) {
        float fB;
        float interpolation;
        float fB2 = b(this.f1776w[i7] * f7, 0.0f, this.f1777x[i7]);
        float fC = c(f7 - f2, fB2) - c(f2, fB2);
        AccelerateInterpolator accelerateInterpolator = this.f1773e;
        if (fC >= 0.0f) {
            if (fC > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fC);
            } else {
                fB = 0.0f;
            }
            if (fB == 0.0f) {
                return 0.0f;
            }
            float f11 = this.F[i7];
            float f12 = this.G[i7];
            float f13 = this.H[i7];
            float f14 = f11 * f10;
            return fB > 0.0f ? b(fB * f14, f12, f13) : -b((-fB) * f14, f12, f13);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fC);
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB == 0.0f) {
            return 0.0f;
        }
        float f15 = this.F[i7];
        float f16 = this.G[i7];
        float f17 = this.H[i7];
        float f18 = f15 * f10;
        if (fB > 0.0f) {
        }
    }

    public final float c(float f2, float f7) {
        if (f7 != 0.0f) {
            int i7 = this.f1778y;
            if (i7 == 0 || i7 == 1) {
                if (f2 < f7) {
                    if (f2 >= 0.0f) {
                        return 1.0f - (f2 / f7);
                    }
                    if (this.L && i7 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i7 == 2 && f2 < 0.0f) {
                return f2 / (-f7);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i7 = 0;
        if (this.J) {
            this.L = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f1772d;
        int i10 = (int) (jCurrentAnimationTimeMillis - aVar.f1767e);
        int i11 = aVar.f1764b;
        if (i10 > i11) {
            i7 = i11;
        } else if (i10 >= 0) {
            i7 = i10;
        }
        aVar.f1771i = i7;
        aVar.f1770h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f1769g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        t1 t1Var;
        int count;
        a aVar = this.f1772d;
        float f2 = aVar.f1766d;
        int iAbs = (int) (f2 / Math.abs(f2));
        Math.abs(aVar.f1765c);
        if (iAbs != 0 && (count = (t1Var = this.N).getCount()) != 0) {
            int childCount = t1Var.getChildCount();
            int firstVisiblePosition = t1Var.getFirstVisiblePosition();
            int i7 = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && t1Var.getChildAt(0).getTop() >= 0)) : !(i7 >= count && t1Var.getChildAt(childCount - 1).getBottom() <= t1Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.M
            r1 = 0
            if (r0 != 0) goto L7
            goto L7d
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7d
        L17:
            r7.d()
            return r1
        L1b:
            r7.K = r2
            r7.I = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            androidx.appcompat.widget.t1 r4 = r7.f1774i
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            androidx.core.widget.a r9 = r7.f1772d
            r9.f1765c = r0
            r9.f1766d = r8
            boolean r8 = r7.L
            if (r8 != 0) goto L7d
            boolean r8 = r7.e()
            if (r8 == 0) goto L7d
            a3.h r8 = r7.f1775v
            if (r8 != 0) goto L61
            a3.h r8 = new a3.h
            r9 = 5
            r8.<init>(r9, r7)
            r7.f1775v = r8
        L61:
            r7.L = r2
            r7.J = r2
            boolean r8 = r7.I
            if (r8 != 0) goto L76
            int r8 = r7.E
            if (r8 <= 0) goto L76
            a3.h r9 = r7.f1775v
            long r5 = (long) r8
            java.util.WeakHashMap r8 = androidx.core.view.u0.f1729a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7b
        L76:
            a3.h r8 = r7.f1775v
            r8.run()
        L7b:
            r7.I = r2
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.d.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
