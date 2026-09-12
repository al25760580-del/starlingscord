package d0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7546d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(long j, String str, int i7, int i10) {
        super(str, j, i7);
        this.f7546d = i10;
    }

    public static float g(float f2) {
        return lo.j.c(f2, -2.0f, 2.0f);
    }

    @Override // d0.c
    public final float a(int i7) {
        switch (this.f7546d) {
            case 0:
                return i7 == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }

    @Override // d0.c
    public final float b(int i7) {
        switch (this.f7546d) {
            case 0:
                return i7 == 0 ? 0.0f : -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // d0.c
    public final long d(float f2, float f7, float f10) {
        switch (this.f7546d) {
            case 0:
                float fC = (lo.j.c(f2, 0.0f, 100.0f) + 16.0f) / 116.0f;
                float fC2 = (lo.j.c(f2, -128.0f, 128.0f) * 0.002f) + fC;
                float f11 = fC2 > 0.20689656f ? fC2 * fC2 * fC2 : (fC2 - 0.13793103f) * 0.12841855f;
                float f12 = fC > 0.20689656f ? fC * fC * fC : (fC - 0.13793103f) * 0.12841855f;
                float[] fArr = i.f7545e;
                return (((long) Float.floatToIntBits(f11 * fArr[0])) << 32) | (((long) Float.floatToIntBits(f12 * fArr[1])) & 4294967295L);
            default:
                float fG = g(f2);
                return (((long) Float.floatToIntBits(g(f7))) & 4294967295L) | (((long) Float.floatToIntBits(fG)) << 32);
        }
    }

    @Override // d0.c
    public final float e(float f2, float f7, float f10) {
        switch (this.f7546d) {
            case 0:
                float fC = ((lo.j.c(f2, 0.0f, 100.0f) + 16.0f) / 116.0f) - (lo.j.c(f10, -128.0f, 128.0f) * 0.005f);
                return (fC > 0.20689656f ? fC * fC * fC : 0.12841855f * (fC - 0.13793103f)) * i.f7545e[2];
            default:
                return g(f10);
        }
    }

    @Override // d0.c
    public final long f(float f2, float f7, float f10, float f11, c colorSpace) {
        switch (this.f7546d) {
            case 0:
                Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
                float[] fArr = i.f7545e;
                float f12 = f2 / fArr[0];
                float f13 = f7 / fArr[1];
                float f14 = f10 / fArr[2];
                float fPow = f12 > 0.008856452f ? (float) Math.pow(f12, 0.33333334f) : (f12 * 7.787037f) + 0.13793103f;
                float fPow2 = f13 > 0.008856452f ? (float) Math.pow(f13, 0.33333334f) : (f13 * 7.787037f) + 0.13793103f;
                return w3.q.a(lo.j.c((116.0f * fPow2) - 16.0f, 0.0f, 100.0f), lo.j.c((fPow - fPow2) * 500.0f, -128.0f, 128.0f), lo.j.c((fPow2 - (f14 > 0.008856452f ? (float) Math.pow(f14, 0.33333334f) : (f14 * 7.787037f) + 0.13793103f)) * 200.0f, -128.0f, 128.0f), f11, colorSpace);
            default:
                Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
                return w3.q.a(g(f2), g(f7), g(f10), f11, colorSpace);
        }
    }
}
