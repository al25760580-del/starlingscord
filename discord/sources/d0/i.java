package d0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f7541a = new r(0.31006f, 0.31616f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f7542b = new r(0.34567f, 0.3585f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f7543c = new r(0.32168f, 0.33767f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f7544d = new r(0.31271f, 0.32902f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float[] f7545e = {0.964212f, 1.0f, 0.825188f};

    public static c a(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        r whitePoint = f7542b;
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        a adaptation = a.f7516b;
        Intrinsics.checkNotNullParameter(adaptation, "adaptation");
        if (b.a(cVar.f7524b, b.f7518a)) {
            p colorSpace = (p) cVar;
            r rVar = colorSpace.f7560d;
            if (!d(rVar, whitePoint)) {
                float[] transform = g(c(adaptation.f7517a, rVar.a(), whitePoint.a()), colorSpace.f7565i);
                Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
                Intrinsics.checkNotNullParameter(transform, "transform");
                Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
                return new p(colorSpace.f7523a, colorSpace.f7564h, whitePoint, transform, colorSpace.k, colorSpace.f7567m, colorSpace.f7561e, colorSpace.f7562f, colorSpace.f7563g, -1);
            }
        }
        return cVar;
    }

    public static float b(float[] fArr) {
        float f2 = fArr[0];
        float f7 = fArr[1];
        float f10 = fArr[2];
        float f11 = fArr[3];
        float f12 = fArr[4];
        float f13 = fArr[5];
        float f14 = (((((f10 * f13) + ((f7 * f12) + (f2 * f11))) - (f11 * f12)) - (f7 * f10)) - (f2 * f13)) * 0.5f;
        return f14 < 0.0f ? -f14 : f14;
    }

    public static final float[] c(float[] rhs, float[] srcWhitePoint, float[] dstWhitePoint) {
        Intrinsics.checkNotNullParameter(rhs, "matrix");
        Intrinsics.checkNotNullParameter(srcWhitePoint, "srcWhitePoint");
        Intrinsics.checkNotNullParameter(dstWhitePoint, "dstWhitePoint");
        h(rhs, srcWhitePoint);
        h(rhs, dstWhitePoint);
        float[] lhs = {dstWhitePoint[0] / srcWhitePoint[0], dstWhitePoint[1] / srcWhitePoint[1], dstWhitePoint[2] / srcWhitePoint[2]};
        float[] fArrF = f(rhs);
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        float f2 = lhs[0];
        float f7 = rhs[0] * f2;
        float f10 = lhs[1];
        float f11 = rhs[1] * f10;
        float f12 = lhs[2];
        return g(fArrF, new float[]{f7, f11, rhs[2] * f12, rhs[3] * f2, rhs[4] * f10, rhs[5] * f12, f2 * rhs[6], f10 * rhs[7], f12 * rhs[8]});
    }

    public static final boolean d(r a10, r b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        if (a10 == b10) {
            return true;
        }
        return Math.abs(a10.f7575a - b10.f7575a) < 0.001f && Math.abs(a10.f7576b - b10.f7576b) < 0.001f;
    }

    public static float e(float f2, float f7, float f10, float f11) {
        return (f2 * f11) - (f7 * f10);
    }

    public static final float[] f(float[] m5) {
        Intrinsics.checkNotNullParameter(m5, "m");
        float f2 = m5[0];
        float f7 = m5[3];
        float f10 = m5[6];
        float f11 = m5[1];
        float f12 = m5[4];
        float f13 = m5[7];
        float f14 = m5[2];
        float f15 = m5[5];
        float f16 = m5[8];
        float f17 = (f12 * f16) - (f13 * f15);
        float f18 = (f13 * f14) - (f11 * f16);
        float f19 = (f11 * f15) - (f12 * f14);
        float f20 = (f10 * f19) + (f7 * f18) + (f2 * f17);
        float[] fArr = new float[m5.length];
        fArr[0] = f17 / f20;
        fArr[1] = f18 / f20;
        fArr[2] = f19 / f20;
        fArr[3] = ((f10 * f15) - (f7 * f16)) / f20;
        fArr[4] = ((f16 * f2) - (f10 * f14)) / f20;
        fArr[5] = ((f14 * f7) - (f15 * f2)) / f20;
        fArr[6] = ((f7 * f13) - (f10 * f12)) / f20;
        fArr[7] = ((f10 * f11) - (f13 * f2)) / f20;
        fArr[8] = ((f2 * f12) - (f7 * f11)) / f20;
        return fArr;
    }

    public static final float[] g(float[] lhs, float[] rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        float f2 = lhs[0];
        float f7 = rhs[0];
        float f10 = lhs[3];
        float f11 = rhs[1];
        float f12 = lhs[6];
        float f13 = rhs[2];
        float f14 = (f12 * f13) + (f10 * f11) + (f2 * f7);
        float f15 = lhs[1];
        float f16 = lhs[4];
        float f17 = lhs[7];
        float f18 = (f17 * f13) + (f16 * f11) + (f15 * f7);
        float f19 = lhs[2];
        float f20 = lhs[5];
        float f21 = lhs[8];
        float f22 = (f13 * f21) + (f11 * f20) + (f7 * f19);
        float f23 = rhs[3];
        float f24 = rhs[4];
        float f25 = rhs[5];
        float f26 = (f12 * f25) + (f10 * f24) + (f2 * f23);
        float f27 = (f17 * f25) + (f16 * f24) + (f15 * f23);
        float f28 = (f25 * f21) + (f24 * f20) + (f23 * f19);
        float f29 = rhs[6];
        float f30 = rhs[7];
        float f31 = rhs[8];
        return new float[]{f14, f18, f22, f26, f27, f28, (f12 * f31) + (f10 * f30) + (f2 * f29), (f17 * f31) + (f16 * f30) + (f15 * f29), (f21 * f31) + (f20 * f30) + (f19 * f29)};
    }

    public static final void h(float[] lhs, float[] rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        float f2 = rhs[0];
        float f7 = rhs[1];
        float f10 = rhs[2];
        rhs[0] = (lhs[6] * f10) + (lhs[3] * f7) + (lhs[0] * f2);
        rhs[1] = (lhs[7] * f10) + (lhs[4] * f7) + (lhs[1] * f2);
        rhs[2] = (lhs[8] * f10) + (lhs[5] * f7) + (lhs[2] * f2);
    }

    public static final float i(float[] lhs, float f2, float f7, float f10) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        return (lhs[6] * f10) + (lhs[3] * f7) + (lhs[0] * f2);
    }

    public static final float j(float[] lhs, float f2, float f7, float f10) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        return (lhs[7] * f10) + (lhs[4] * f7) + (lhs[1] * f2);
    }

    public static final float k(float[] lhs, float f2, float f7, float f10) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        return (lhs[8] * f10) + (lhs[5] * f7) + (lhs[2] * f2);
    }
}
