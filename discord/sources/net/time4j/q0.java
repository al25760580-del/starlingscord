package net.time4j;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements xr.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Enum f16695b;

    public /* synthetic */ q0(Enum r5, int i7) {
        this.f16694a = i7;
        this.f16695b = r5;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00db  */
    /* JADX WARN: Code duplicated, block: B:32:0x00de  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e9  */
    public static Object b(Class cls, t tVar, b1 b1Var, long j) {
        long j5;
        long jA;
        int iM;
        long jA2;
        int iM2;
        b1 b1VarY;
        int iM3 = b1Var.f16609e;
        byte b10 = b1Var.f16608d;
        int iM4 = b1Var.f16610i;
        int iM5 = b1Var.f16611v;
        int iOrdinal = tVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                j5 = j;
                long jA3 = yk.a.A(iM3, j5);
                jA2 = yk.a.A(b10, yk.a.k(60, jA3));
                iM = yk.a.m(60, jA3);
            } else if (iOrdinal != 2) {
                s sVar = t.f16715x;
                if (iOrdinal == 3) {
                    return b(cls, sVar, b1Var, yk.a.C(j, 1000000L));
                }
                if (iOrdinal == 4) {
                    return b(cls, sVar, b1Var, yk.a.C(j, 1000L));
                }
                if (iOrdinal != 5) {
                    throw new UnsupportedOperationException(tVar.name());
                }
                long jA4 = yk.a.A(iM5, j);
                long jA5 = yk.a.A(iM4, yk.a.k(1000000000, jA4));
                long jA6 = yk.a.A(iM3, yk.a.k(60, jA5));
                jA2 = yk.a.A(b10, yk.a.k(60, jA6));
                iM = yk.a.m(60, jA6);
                iM4 = yk.a.m(60, jA5);
                iM5 = yk.a.m(1000000000, jA4);
                j5 = j;
            } else {
                j5 = j;
                long jA7 = yk.a.A(iM4, j5);
                long jA8 = yk.a.A(iM3, yk.a.k(60, jA7));
                long jA9 = yk.a.A(b10, yk.a.k(60, jA8));
                iM3 = yk.a.m(60, jA8);
                jA = jA9;
                iM4 = yk.a.m(60, jA7);
            }
            iM2 = yk.a.m(24, jA2);
            if ((iM2 | iM | iM4 | iM5) == 0) {
                b1VarY = b1.y(iM2, iM, iM4, iM5, true);
            } else if (j5 > 0 || cls != b1.class) {
                b1VarY = b1.J;
            } else {
                b1VarY = b1.K;
            }
            return cls == b1.class ? cls.cast(b1VarY) : cls.cast(new v(yk.a.k(24, jA2), b1VarY));
        }
        j5 = j;
        jA = yk.a.A(b10, j5);
        iM = iM3;
        jA2 = jA;
        iM2 = yk.a.m(24, jA2);
        if ((iM2 | iM | iM4 | iM5) == 0) {
            b1VarY = b1.y(iM2, iM, iM4, iM5, true);
        } else if (j5 > 0) {
            b1VarY = b1.J;
        } else {
            b1VarY = b1.J;
        }
        if (cls == b1.class) {
        }
    }

    @Override // xr.s
    public final Object a(xr.e eVar, long j) {
        switch (this.f16694a) {
            case 0:
                r0 r0Var = (r0) eVar;
                TimeUnit timeUnit = (TimeUnit) this.f16695b;
                int iCompareTo = timeUnit.compareTo(TimeUnit.SECONDS);
                as.e eVar2 = as.e.f3000d;
                if (iCompareTo >= 0) {
                    return r0.s(yk.a.A(r0Var.f16702d, yk.a.C(j, timeUnit.toSeconds(1L))), r0Var.r(), eVar2);
                }
                long jA = yk.a.A(r0Var.r(), yk.a.C(j, timeUnit.toNanos(1L)));
                return r0.s(yk.a.A(r0Var.f16702d, yk.a.k(1000000000, jA)), yk.a.m(1000000000, jA), eVar2);
            default:
                b1 b1Var = (b1) eVar;
                return j == 0 ? b1Var : (b1) b(b1.class, (t) this.f16695b, b1Var, j);
        }
    }
}
