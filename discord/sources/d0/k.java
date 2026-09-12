package d0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[] f7547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float[] f7548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float[] f7549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float[] f7550g;

    static {
        float[] fArrG = i.g(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, i.c(a.f7516b.f7517a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f7547d = fArrG;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f7548e = fArr;
        f7549f = i.f(fArrG);
        f7550g = i.f(fArr);
    }

    @Override // d0.c
    public final float a(int i7) {
        return i7 == 0 ? 1.0f : 0.5f;
    }

    @Override // d0.c
    public final float b(int i7) {
        return i7 == 0 ? 0.0f : -0.5f;
    }

    @Override // d0.c
    public final long d(float f2, float f7, float f10) {
        float fC = lo.j.c(f2, 0.0f, 1.0f);
        float fC2 = lo.j.c(f7, -0.5f, 0.5f);
        float fC3 = lo.j.c(f10, -0.5f, 0.5f);
        float[] fArr = f7550g;
        float fI = i.i(fArr, fC, fC2, fC3);
        float fJ = i.j(fArr, fC, fC2, fC3);
        float fK = i.k(fArr, fC, fC2, fC3);
        float f11 = fI * fI * fI;
        float f12 = fJ * fJ * fJ;
        float f13 = fK * fK * fK;
        float[] fArr2 = f7549f;
        float fI2 = i.i(fArr2, f11, f12, f13);
        float fJ2 = i.j(fArr2, f11, f12, f13);
        return (((long) Float.floatToIntBits(fI2)) << 32) | (((long) Float.floatToIntBits(fJ2)) & 4294967295L);
    }

    @Override // d0.c
    public final float e(float f2, float f7, float f10) {
        float fC = lo.j.c(f2, 0.0f, 1.0f);
        float fC2 = lo.j.c(f7, -0.5f, 0.5f);
        float fC3 = lo.j.c(f10, -0.5f, 0.5f);
        float[] fArr = f7550g;
        float fI = i.i(fArr, fC, fC2, fC3);
        float fJ = i.j(fArr, fC, fC2, fC3);
        float fK = i.k(fArr, fC, fC2, fC3);
        float f11 = fK * fK * fK;
        return i.k(f7549f, fI * fI * fI, fJ * fJ * fJ, f11);
    }

    @Override // d0.c
    public final long f(float f2, float f7, float f10, float f11, c colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        float[] fArr = f7547d;
        float fI = i.i(fArr, f2, f7, f10);
        float fJ = i.j(fArr, f2, f7, f10);
        float fK = i.k(fArr, f2, f7, f10);
        double d6 = 0.33333334f;
        float fSignum = Math.signum(fI) * ((float) Math.pow(Math.abs(fI), d6));
        float fSignum2 = Math.signum(fJ) * ((float) Math.pow(Math.abs(fJ), d6));
        float fSignum3 = Math.signum(fK) * ((float) Math.pow(Math.abs(fK), d6));
        float[] fArr2 = f7548e;
        return w3.q.a(i.i(fArr2, fSignum, fSignum2, fSignum3), i.j(fArr2, fSignum, fSignum2, fSignum3), i.k(fArr2, fSignum, fSignum2, fSignum3), f11, colorSpace);
    }
}
