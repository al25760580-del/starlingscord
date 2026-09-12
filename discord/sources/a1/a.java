package a1;

import android.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f3b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f5d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f6e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f7f;

    public a(float f2, float f7, float f10, float f11, float f12, float f13) {
        this.f2a = f2;
        this.f3b = f7;
        this.f4c = f10;
        this.f5d = f11;
        this.f6e = f12;
        this.f7f = f13;
    }

    public static a a(int i7) {
        o oVar = o.k;
        float fE = b.e(Color.red(i7));
        float fE2 = b.e(Color.green(i7));
        float fE3 = b.e(Color.blue(i7));
        float[][] fArr = b.f11d;
        float[] fArr2 = fArr[0];
        float f2 = (fArr2[2] * fE3) + (fArr2[1] * fE2) + (fArr2[0] * fE);
        float[] fArr3 = fArr[1];
        float f7 = (fArr3[2] * fE3) + (fArr3[1] * fE2) + (fArr3[0] * fE);
        float[] fArr4 = fArr[2];
        float f10 = (fE3 * fArr4[2]) + (fE2 * fArr4[1]) + (fE * fArr4[0]);
        float[][] fArr5 = b.f8a;
        float[] fArr6 = fArr5[0];
        float f11 = (fArr6[2] * f10) + (fArr6[1] * f7) + (fArr6[0] * f2);
        float[] fArr7 = fArr5[1];
        float f12 = (fArr7[2] * f10) + (fArr7[1] * f7) + (fArr7[0] * f2);
        float[] fArr8 = fArr5[2];
        float f13 = (f10 * fArr8[2]) + (f7 * fArr8[1]) + (f2 * fArr8[0]);
        float[] fArr9 = oVar.f51g;
        float f14 = oVar.f53i;
        float f15 = oVar.f48d;
        float f16 = oVar.f45a;
        float f17 = fArr9[0] * f11;
        float f18 = fArr9[1] * f12;
        float f19 = fArr9[2] * f13;
        float f20 = oVar.f52h;
        float fPow = (float) Math.pow(((double) (Math.abs(f17) * f20)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f18) * f20)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f19) * f20)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f17) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f18) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f19) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d6 = fSignum3;
        float f21 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d6)) / 11.0f;
        float f22 = ((float) (((double) (fSignum + fSignum2)) - (d6 * 2.0d))) / 9.0f;
        float f23 = fSignum2 * 20.0f;
        float f24 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f23)) / 20.0f;
        float f25 = (((fSignum * 40.0f) + f23) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f22, f21)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f26 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f25 * oVar.f46b) / f16, oVar.j * f15)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f27 = f16 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, oVar.f50f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * oVar.f49e) * oVar.f47c) * ((float) Math.sqrt((f22 * f22) + (f21 * f21)))) / (f24 + 0.305f), 0.9d));
        float fSqrt = fPow5 * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        Math.sqrt((fPow5 * f15) / f27);
        float f28 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f14 * fSqrt * 0.0228f) + 1.0f)) * 43.85965f;
        double d7 = f26;
        return new a(fAtan2, fSqrt, fPow4, f28, fLog * ((float) Math.cos(d7)), fLog * ((float) Math.sin(d7)));
    }

    public static a b(float f2, float f7, float f10) {
        o oVar = o.k;
        float f11 = oVar.f48d;
        double d6 = ((double) f2) / 100.0d;
        Math.sqrt(d6);
        float f12 = oVar.f45a + 4.0f;
        float f13 = oVar.f53i * f7;
        Math.sqrt(((f7 / ((float) Math.sqrt(d6))) * oVar.f48d) / f12);
        float f14 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float fLog = ((float) Math.log((((double) f13) * 0.0228d) + 1.0d)) * 43.85965f;
        double d7 = (3.1415927f * f10) / 180.0f;
        return new a(f10, f7, f2, f14, fLog * ((float) Math.cos(d7)), fLog * ((float) Math.sin(d7)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public final int c(o oVar) {
        float fSqrt;
        float f2 = this.f3b;
        double d6 = f2;
        float f7 = this.f4c;
        if (d6 != 0.0d) {
            double d7 = f7;
            if (d7 == 0.0d) {
                fSqrt = 0.0f;
            } else {
                fSqrt = f2 / ((float) Math.sqrt(d7 / 100.0d));
            }
        } else {
            fSqrt = 0.0f;
        }
        float f10 = oVar.f50f;
        float f11 = oVar.f52h;
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, f10), 0.73d), 1.1111111111111112d);
        double d8 = (this.f2a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d8) + 3.8d)) * 0.25f;
        float fPow2 = oVar.f45a * ((float) Math.pow(((double) f7) / 100.0d, (1.0d / ((double) oVar.f48d)) / ((double) oVar.j)));
        float f12 = fCos * 3846.1538f * oVar.f49e * oVar.f47c;
        float f13 = fPow2 / oVar.f46b;
        float fSin = (float) Math.sin(d8);
        float fCos2 = (float) Math.cos(d8);
        float f14 = (((0.305f + f13) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f12 * 23.0f)));
        float f15 = fCos2 * f14;
        float f16 = f14 * fSin;
        float f17 = f13 * 460.0f;
        float f18 = ((288.0f * f16) + ((451.0f * f15) + f17)) / 1403.0f;
        float f19 = ((f17 - (891.0f * f15)) - (261.0f * f16)) / 1403.0f;
        float f20 = ((f17 - (f15 * 220.0f)) - (f16 * 6300.0f)) / 1403.0f;
        float f21 = 100.0f / f11;
        float fSignum = Math.signum(f18) * f21 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f18)) * 27.13d) / (400.0d - ((double) Math.abs(f18)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f19) * f21 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f19)) * 27.13d) / (400.0d - ((double) Math.abs(f19)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f20) * f21 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f20)) * 27.13d) / (400.0d - ((double) Math.abs(f20)))), 2.380952380952381d));
        float[] fArr = oVar.f51g;
        float f22 = fSignum / fArr[0];
        float f23 = fSignum2 / fArr[1];
        float f24 = fSignum3 / fArr[2];
        float[][] fArr2 = b.f9b;
        float[] fArr3 = fArr2[0];
        float f25 = (fArr3[2] * f24) + (fArr3[1] * f23) + (fArr3[0] * f22);
        float[] fArr4 = fArr2[1];
        float f26 = (fArr4[2] * f24) + (fArr4[1] * f23) + (fArr4[0] * f22);
        float[] fArr5 = fArr2[2];
        return b1.c.a(f25, f26, (f24 * fArr5[2]) + (f23 * fArr5[1]) + (f22 * fArr5[0]));
    }
}
