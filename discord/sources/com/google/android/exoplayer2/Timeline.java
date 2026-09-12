package com.google.android.exoplayer2;

import android.util.Pair;
import com.facebook.imageutils.JfifUtil;
import gc.g;
import gc.t1;
import gc.u1;
import gc.v1;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Timeline implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t1 f5588d = new t1();

    static {
        int i7 = e0.f13788a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public int a(boolean z5) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z5) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i7, u1 u1Var, v1 v1Var, int i10, boolean z5) {
        int i11 = f(i7, u1Var, false).f9888i;
        if (m(i11, v1Var, 0L).M != i7) {
            return i7 + 1;
        }
        int iE = e(i11, i10, z5);
        if (iE == -1) {
            return -1;
        }
        return m(iE, v1Var, 0L).L;
    }

    public int e(int i7, int i10, boolean z5) {
        if (i10 == 0) {
            if (i7 == c(z5)) {
                return -1;
            }
            return i7 + 1;
        }
        if (i10 == 1) {
            return i7;
        }
        if (i10 == 2) {
            return i7 == c(z5) ? a(z5) : i7 + 1;
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        int iC;
        if (this != obj) {
            if (obj instanceof Timeline) {
                Timeline timeline = (Timeline) obj;
                if (timeline.o() == o() && timeline.h() == h()) {
                    v1 v1Var = new v1();
                    u1 u1Var = new u1();
                    v1 v1Var2 = new v1();
                    u1 u1Var2 = new u1();
                    for (int i7 = 0; i7 < o(); i7++) {
                        if (m(i7, v1Var, 0L).equals(timeline.m(i7, v1Var2, 0L))) {
                        }
                    }
                    for (int i10 = 0; i10 < h(); i10++) {
                        if (f(i10, u1Var, true).equals(timeline.f(i10, u1Var2, true))) {
                        }
                    }
                    int iA = a(true);
                    if (iA == timeline.a(true) && (iC = c(true)) == timeline.c(true)) {
                        while (iA != iC) {
                            int iE = e(iA, 0, true);
                            if (iE == timeline.e(iA, 0, true)) {
                                iA = iE;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract u1 f(int i7, u1 u1Var, boolean z5);

    public u1 g(Object obj, u1 u1Var) {
        return f(b(obj), u1Var, true);
    }

    public abstract int h();

    public final int hashCode() {
        v1 v1Var = new v1();
        u1 u1Var = new u1();
        int iO = o() + JfifUtil.MARKER_EOI;
        for (int i7 = 0; i7 < o(); i7++) {
            iO = (iO * 31) + m(i7, v1Var, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i10 = 0; i10 < h(); i10++) {
            iH = (iH * 31) + f(i10, u1Var, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, 0, true);
        }
        return iH;
    }

    public final Pair i(v1 v1Var, u1 u1Var, int i7, long j) {
        Pair pairJ = j(v1Var, u1Var, i7, j, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair j(v1 v1Var, u1 u1Var, int i7, long j, long j5) {
        je.b.j(i7, o());
        m(i7, v1Var, j5);
        if (j == -9223372036854775807L) {
            j = v1Var.J;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i10 = v1Var.L;
        f(i10, u1Var, false);
        while (i10 < v1Var.M && u1Var.f9890w != j) {
            int i11 = i10 + 1;
            if (f(i11, u1Var, false).f9890w > j) {
                break;
            }
            i10 = i11;
        }
        f(i10, u1Var, true);
        long jMin = j - u1Var.f9890w;
        long j7 = u1Var.f9889v;
        if (j7 != -9223372036854775807L) {
            jMin = Math.min(jMin, j7 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = u1Var.f9887e;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int k(int i7, int i10, boolean z5) {
        if (i10 == 0) {
            if (i7 == a(z5)) {
                return -1;
            }
            return i7 - 1;
        }
        if (i10 == 1) {
            return i7;
        }
        if (i10 == 2) {
            return i7 == a(z5) ? c(z5) : i7 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object l(int i7);

    public abstract v1 m(int i7, v1 v1Var, long j);

    public final void n(int i7, v1 v1Var) {
        m(i7, v1Var, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
