package as;

import net.time4j.x0;
import xr.m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f3000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f3001e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f3002i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final e f3003v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final e f3004w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final e f3005x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ e[] f3006y;

    static {
        e eVar = new e("POSIX", 0);
        f3000d = eVar;
        e eVar2 = new e("UTC", 1);
        f3001e = eVar2;
        e eVar3 = new e("TAI", 2);
        f3002i = eVar3;
        e eVar4 = new e("GPS", 3);
        f3003v = eVar4;
        e eVar5 = new e("TT", 4);
        f3004w = eVar5;
        e eVar6 = new e("UT", 5);
        f3005x = eVar6;
        f3006y = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6};
    }

    public static double a(x0 x0Var) {
        double d6;
        double d7;
        int i7 = x0Var.f16786d;
        int i10 = m.A(i7) ? 366 : 365;
        byte b10 = x0Var.f16787e;
        int i11 = 1;
        int iT = 0;
        for (int i12 = 1; i12 < b10; i12++) {
            iT += m.t(i7, i12);
        }
        int i13 = x0Var.f16788i + iT;
        if (i13 > i10) {
            throw new IllegalArgumentException(x0Var.toString());
        }
        if (i7 == -2001 && i13 == 365) {
            i7 = -2000;
        } else {
            i11 = i13;
        }
        double d8 = ((((double) i11) - 1.0d) / ((double) i10)) + ((double) i7);
        if (i7 < -2000 || i7 > 3000) {
            throw new IllegalArgumentException(kk.b.h(i7, "Year out of range: "));
        }
        if (i7 <= 2050) {
            if (i7 >= 2018) {
                double d9 = d8 - 2000.0d;
                d6 = ((0.012125d * d9) + 0.0533d) * d9;
                d7 = 64.16d;
            } else if (i7 >= 2005) {
                double d10 = d8 - 2000.0d;
                d6 = ((((((4.2060317E-5d * d10) - 0.00112745d) * d10) + 0.014201d) * d10) + 0.171417d) * d10;
                d7 = 63.5934d;
            } else if (i7 >= 1986) {
                double d11 = d8 - 2000.0d;
                d6 = ((((((((2.373599E-5d * d11) + 6.51814E-4d) * d11) + 0.0017275d) * d11) - 0.060374d) * d11) + 0.3345d) * d11;
                d7 = 63.86d;
            } else {
                if (i7 >= 1961) {
                    double d12 = d8 - 1975.0d;
                    return ((((0.0d - (d12 / 718.0d)) * d12) + 1.067d) * d12) + 45.45d;
                }
                if (i7 >= 1941) {
                    double d13 = d8 - 1950.0d;
                    d6 = ((((d13 / 2547.0d) + 0.0d) * d13) + 0.407d) * d13;
                    d7 = 29.07d;
                } else if (i7 >= 1920) {
                    double d14 = d8 - 1920.0d;
                    d6 = ((((0.0020936d * d14) - 0.0761d) * d14) + 0.84493d) * d14;
                    d7 = 21.2d;
                } else {
                    if (i7 >= 1900) {
                        double d15 = d8 - 1900.0d;
                        return ((((((0.0061966d - (1.97E-4d * d15)) * d15) - 0.0598939d) * d15) + 1.494119d) * d15) - 2.79d;
                    }
                    if (i7 >= 1860) {
                        double d16 = d8 - 1860.0d;
                        d6 = ((((((((d16 / 233174.0d) - 4.473624E-4d) * d16) + 0.01680668d) * d16) - 0.251754d) * d16) + 0.5737d) * d16;
                        d7 = 7.62d;
                    } else if (i7 >= 1800) {
                        double d17 = d8 - 1800.0d;
                        d6 = ((((((((((((8.75E-10d * d17) - 1.699E-7d) * d17) + 1.21272E-5d) * d17) - 3.7436E-4d) * d17) + 0.0041116d) * d17) + 0.0068612d) * d17) - 0.332447d) * d17;
                        d7 = 13.72d;
                    } else if (i7 >= 1700) {
                        double d18 = d8 - 1700.0d;
                        d6 = ((((((d18 / 1174000.0d) + 1.3336E-4d) * d18) - 0.0059285d) * d18) + 0.1603d) * d18;
                        d7 = 8.83d;
                    } else if (i7 >= 1600) {
                        double d19 = d8 - 1600.0d;
                        d6 = ((((d19 / 7129.0d) - 0.01532d) * d19) - 0.9808d) * d19;
                        d7 = 120.0d;
                    } else if (i7 >= 500) {
                        double d20 = (d8 - 1000.0d) / 100.0d;
                        d6 = ((((((((((0.0083572073d * d20) - 0.005050998d) * d20) - 0.8503463d) * d20) + 0.319781d) * d20) + 71.23472d) * d20) - 556.01d) * d20;
                        d7 = 1574.2d;
                    } else if (i7 >= -500) {
                        double d21 = d8 / 100.0d;
                        d6 = ((((((((((0.0090316521d * d21) + 0.022174192d) * d21) - 0.1798452d) * d21) - 5.952053d) * d21) + 33.78311d) * d21) - 1014.41d) * d21;
                        d7 = 10583.6d;
                    }
                }
            }
            return d6 + d7;
        }
        double d22 = (d8 - 1820.0d) / 100.0d;
        return ((32.0d * d22) * d22) - 20.0d;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f3006y.clone();
    }
}
