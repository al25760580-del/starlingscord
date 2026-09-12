package com.horcrux.svg;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ArrayList f6750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f6751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static k0 f6752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static k0 f6753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static k0 f6754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static k0 f6755i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f6757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f6758c;

    public m0(int i7, k0 k0Var, double d6) {
        this.f6756a = i7;
        this.f6757b = k0Var;
        this.f6758c = d6;
    }

    public static double a(int i7) {
        k0 k0Var = f6754h;
        double dAtan2 = Math.atan2(k0Var.f6744b, k0Var.f6743a) * 57.29577951308232d;
        k0 k0Var2 = f6755i;
        double dAtan3 = Math.atan2(k0Var2.f6744b, k0Var2.f6743a) * 57.29577951308232d;
        int iB = f0.e.b(i7);
        if (iB == 0) {
            return dAtan3;
        }
        if (iB != 1) {
            if (iB != 2) {
                return 0.0d;
            }
            return dAtan2;
        }
        if (Math.abs(dAtan2 - dAtan3) > 180.0d) {
            dAtan2 += 360.0d;
        }
        return (dAtan2 + dAtan3) / 2.0d;
    }

    public static boolean b(k0 k0Var) {
        return k0Var.f6743a == 0.0d && k0Var.f6744b == 0.0d;
    }

    public static k0 c(k0 k0Var, k0 k0Var2) {
        return new k0(k0Var2.f6743a - k0Var.f6743a, k0Var2.f6744b - k0Var.f6744b);
    }
}
