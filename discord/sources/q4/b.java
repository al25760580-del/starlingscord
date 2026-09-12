package q4;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f18601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f18603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f18606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f18607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18608h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18609i;
    public float j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PointF f18610l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PointF f18611m;

    public final int hashCode() {
        int iB = ((f0.e.b(this.f18604d) + (((int) (a3.e.d(this.f18601a.hashCode() * 31, 31, this.f18602b) + this.f18603c)) * 31)) * 31) + this.f18605e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f18606f);
        return (((iB * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f18608h;
    }
}
