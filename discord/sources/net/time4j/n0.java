package net.time4j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements xr.d, xr.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n0 f16676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ n0[] f16677e;

    static {
        n0 n0Var = new n0("FRACTION", 0);
        f16676d = n0Var;
        f16677e = new n0[]{n0Var};
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) f16677e.clone();
    }

    @Override // xr.d
    public final /* bridge */ /* synthetic */ Object a() {
        return 999999999;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00bb A[PHI: r5
      0x00bb: PHI (r5v19 long) = (r5v17 long), (r5v24 long) binds: [B:34:0x00cd, B:30:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // xr.j
    public final Object b(xr.e eVar, Object obj, boolean z5) {
        int iT;
        long jFloor;
        r0 r0Var = (r0) eVar;
        Integer num = (Integer) obj;
        if (num == null) {
            throw new IllegalArgumentException("Missing fraction value.");
        }
        if (!as.c.F.e()) {
            return r0.s(r0Var.f16702d, num.intValue(), as.e.f3000d);
        }
        long jQ = r0Var.f16702d;
        as.e eVar2 = as.e.f3001e;
        int iOrdinal = eVar2.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                jQ = r0Var.q();
            } else if (iOrdinal == 2) {
                if (r0Var.q() < 0) {
                    double dR = (((double) r0Var.r()) / 1.0E9d) + as.e.a(r0Var.p()) + (jQ - 63072000);
                    long jFloor2 = (long) Math.floor(dR);
                    if (Double.compare(1.0E9d - ((dR - jFloor2) * 1.0E9d), 1.0d) < 0) {
                        jFloor2++;
                        iT = 0;
                    } else {
                        iT = r0.t(dR, jFloor2);
                    }
                    long j = jFloor2 - (-441763168);
                    if (iT - 184000000 < 0) {
                        j = jFloor2 - (-441763167);
                    }
                    jQ = j;
                } else {
                    jQ = r0Var.q() + 441763210;
                }
                if (jQ < 0) {
                    throw new IllegalArgumentException("TAI not supported before 1958-01-01: " + r0Var);
                }
            } else if (iOrdinal == 3) {
                long jQ2 = r0Var.q();
                as.c cVar = as.c.F;
                if (cVar.j(jQ2) < 315964800) {
                    throw new IllegalArgumentException("GPS not supported before 1980-01-06: " + r0Var);
                }
                if (!cVar.e()) {
                    jQ2 += 9;
                }
                jQ = jQ2 - 252892809;
            } else if (iOrdinal != 4) {
                if (iOrdinal != 5) {
                    throw new UnsupportedOperationException("Not yet implemented: " + eVar2);
                }
                if (jQ < 63072000) {
                    jQ -= 63072000;
                } else {
                    double dR2 = ((((double) r0Var.r()) / 1.0E9d) + (r0Var.q() + 42.184d)) - as.e.a(r0Var.p());
                    long jFloor3 = (long) Math.floor(dR2);
                    if (Double.compare(1.0E9d - ((dR2 - jFloor3) * 1.0E9d), 1.0d) < 0) {
                        dR2 = jFloor3 + 1;
                    }
                    jQ = (long) Math.floor(dR2);
                }
            } else if (jQ < 63072000) {
                double dR3 = (((double) r0Var.r()) / 1.0E9d) + as.e.a(r0Var.p()) + (jQ - 63072000);
                jFloor = (long) Math.floor(dR3);
                if (Double.compare(1.0E9d - ((dR3 - jFloor) * 1.0E9d), 1.0d) < 0) {
                    jQ = jFloor + 1;
                } else {
                    jQ = jFloor;
                }
            } else {
                long jQ3 = r0Var.q();
                jFloor = 42 + jQ3;
                if (r0Var.r() + 184000000 >= 1000000000) {
                    jQ = jQ3 + 43;
                } else {
                    jQ = jFloor;
                }
            }
        }
        return r0.s(jQ, num.intValue(), eVar2);
    }

    @Override // xr.j
    public final Object c(xr.e eVar) {
        return Integer.valueOf(((r0) eVar).r());
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Integer) ((xr.e) obj).d(this)).compareTo((Integer) ((xr.e) obj2).d(this));
    }

    @Override // xr.j
    public final /* bridge */ /* synthetic */ Object d(xr.e eVar) {
        return 999999999;
    }

    @Override // xr.d
    public final Class getType() {
        return Integer.class;
    }

    @Override // xr.d
    public final boolean h() {
        return false;
    }

    @Override // xr.d
    public final boolean i() {
        return false;
    }

    @Override // xr.d
    public final /* bridge */ /* synthetic */ Object v() {
        return 0;
    }

    @Override // xr.d
    public final boolean w() {
        return false;
    }
}
