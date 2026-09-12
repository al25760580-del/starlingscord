package b1;

import android.graphics.Path;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char f3026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f3027b;

    public e(char c8, float[] fArr) {
        this.f3026a = c8;
        this.f3027b = fArr;
    }

    public static void a(Path path, float f2, float f7, float f10, float f11, float f12, float f13, float f14, boolean z5, boolean z6) {
        double d6;
        double d7;
        double radians = Math.toRadians(f14);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d8 = f2;
        double d9 = f7;
        double d10 = f12;
        double d11 = ((d9 * dSin) + (d8 * dCos)) / d10;
        double d12 = f13;
        double d13 = ((d9 * dCos) + (((double) (-f2)) * dSin)) / d12;
        double d14 = f11;
        double d15 = ((d14 * dSin) + (((double) f10) * dCos)) / d10;
        double d16 = ((d14 * dCos) + (((double) (-f10)) * dSin)) / d12;
        double d17 = d11 - d15;
        double d18 = d13 - d16;
        double d19 = (d11 + d15) / 2.0d;
        double d20 = (d13 + d16) / 2.0d;
        double d21 = (d18 * d18) + (d17 * d17);
        if (d21 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d21);
            float fSqrt = (float) (Math.sqrt(d21) / 1.99999d);
            a(path, f2, f7, f10, f11, f12 * fSqrt, fSqrt * f13, f14, z5, z6);
            return;
        }
        double dSqrt = Math.sqrt(d22);
        double d23 = dSqrt * d17;
        double d24 = dSqrt * d18;
        if (z5 == z6) {
            d6 = d19 - d24;
            d7 = d20 + d23;
        } else {
            d6 = d19 + d24;
            d7 = d20 - d23;
        }
        double dAtan2 = Math.atan2(d13 - d7, d11 - d6);
        double dAtan3 = Math.atan2(d16 - d7, d15 - d6) - dAtan2;
        if (z6 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d25 = d6 * d10;
        double d26 = d7 * d12;
        double d27 = (d25 * dCos) - (d26 * dSin);
        double d28 = (d26 * dCos) + (d25 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d29 = -d10;
        double d30 = d29 * dCos2;
        double d31 = d12 * dSin2;
        double d32 = (d30 * dSin3) - (d31 * dCos3);
        double d33 = d29 * dSin2;
        double d34 = d12 * dCos2;
        double d35 = dAtan3 / ((double) iCeil);
        double d36 = (dCos3 * d34) + (dSin3 * d33);
        double d37 = d8;
        double d38 = d9;
        int i7 = 0;
        double d39 = dAtan2;
        while (i7 < iCeil) {
            double d40 = d39 + d35;
            double dSin4 = Math.sin(d40);
            double dCos4 = Math.cos(d40);
            int i10 = iCeil;
            double d41 = (((d10 * dCos2) * dCos4) + d27) - (d31 * dSin4);
            double d42 = (d34 * dSin4) + (d10 * dSin2 * dCos4) + d28;
            double d43 = (d30 * dSin4) - (d31 * dCos4);
            double d44 = (dCos4 * d34) + (dSin4 * d33);
            double d45 = d40 - d39;
            double dTan = Math.tan(d45 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d32 * dSqrt2) + d37), (float) ((d36 * dSqrt2) + d38), (float) (d41 - (dSqrt2 * d43)), (float) (d42 - (dSqrt2 * d44)), (float) d41, (float) d42);
            i7++;
            d38 = d42;
            dCos2 = dCos2;
            d33 = d33;
            d39 = d40;
            d36 = d44;
            d37 = d41;
            iCeil = i10;
            d32 = d43;
            d35 = d35;
        }
    }

    public e(e eVar) {
        this.f3026a = eVar.f3026a;
        float[] fArr = eVar.f3027b;
        this.f3027b = e4.f.s(fArr, fArr.length);
    }
}
