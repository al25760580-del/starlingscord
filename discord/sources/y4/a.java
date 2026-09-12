package y4;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import l4.i;
import s4.c;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f23193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f23194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f23195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Interpolator f23196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Interpolator f23197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Interpolator f23198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f23199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Float f23200h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f23201i;
    public float j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f23202l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f23203m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f23204n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PointF f23205o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PointF f23206p;

    public a(i iVar, Object obj, Object obj2, BaseInterpolator baseInterpolator, float f2, Float f7) {
        this.f23201i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.f23202l = 784923401;
        this.f23203m = Float.MIN_VALUE;
        this.f23204n = Float.MIN_VALUE;
        this.f23205o = null;
        this.f23206p = null;
        this.f23193a = iVar;
        this.f23194b = obj;
        this.f23195c = obj2;
        this.f23196d = baseInterpolator;
        this.f23197e = null;
        this.f23198f = null;
        this.f23199g = f2;
        this.f23200h = f7;
    }

    public final float a() {
        i iVar = this.f23193a;
        if (iVar == null) {
            return 1.0f;
        }
        if (this.f23204n == Float.MIN_VALUE) {
            if (this.f23200h == null) {
                this.f23204n = 1.0f;
            } else {
                this.f23204n = ((this.f23200h.floatValue() - this.f23199g) / (iVar.f14873m - iVar.f14872l)) + b();
            }
        }
        return this.f23204n;
    }

    public final float b() {
        i iVar = this.f23193a;
        if (iVar == null) {
            return 0.0f;
        }
        if (this.f23203m == Float.MIN_VALUE) {
            float f2 = iVar.f14872l;
            this.f23203m = (this.f23199g - f2) / (iVar.f14873m - f2);
        }
        return this.f23203m;
    }

    public final boolean c() {
        return this.f23196d == null && this.f23197e == null && this.f23198f == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f23194b + ", endValue=" + this.f23195c + ", startFrame=" + this.f23199g + ", endFrame=" + this.f23200h + ", interpolator=" + this.f23196d + '}';
    }

    public a(i iVar, Object obj, Object obj2, BaseInterpolator baseInterpolator, BaseInterpolator baseInterpolator2, float f2) {
        this.f23201i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.f23202l = 784923401;
        this.f23203m = Float.MIN_VALUE;
        this.f23204n = Float.MIN_VALUE;
        this.f23205o = null;
        this.f23206p = null;
        this.f23193a = iVar;
        this.f23194b = obj;
        this.f23195c = obj2;
        this.f23196d = null;
        this.f23197e = baseInterpolator;
        this.f23198f = baseInterpolator2;
        this.f23199g = f2;
        this.f23200h = null;
    }

    public a(i iVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f2, Float f7) {
        this.f23201i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.f23202l = 784923401;
        this.f23203m = Float.MIN_VALUE;
        this.f23204n = Float.MIN_VALUE;
        this.f23205o = null;
        this.f23206p = null;
        this.f23193a = iVar;
        this.f23194b = obj;
        this.f23195c = obj2;
        this.f23196d = interpolator;
        this.f23197e = interpolator2;
        this.f23198f = interpolator3;
        this.f23199g = f2;
        this.f23200h = f7;
    }

    public a(Object obj) {
        this.f23201i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.f23202l = 784923401;
        this.f23203m = Float.MIN_VALUE;
        this.f23204n = Float.MIN_VALUE;
        this.f23205o = null;
        this.f23206p = null;
        this.f23193a = null;
        this.f23194b = obj;
        this.f23195c = obj;
        this.f23196d = null;
        this.f23197e = null;
        this.f23198f = null;
        this.f23199g = Float.MIN_VALUE;
        this.f23200h = Float.valueOf(Float.MAX_VALUE);
    }

    public a(c cVar, c cVar2) {
        this.f23201i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.f23202l = 784923401;
        this.f23203m = Float.MIN_VALUE;
        this.f23204n = Float.MIN_VALUE;
        this.f23205o = null;
        this.f23206p = null;
        this.f23193a = null;
        this.f23194b = cVar;
        this.f23195c = cVar2;
        this.f23196d = null;
        this.f23197e = null;
        this.f23198f = null;
        this.f23199g = Float.MIN_VALUE;
        this.f23200h = Float.valueOf(Float.MAX_VALUE);
    }
}
