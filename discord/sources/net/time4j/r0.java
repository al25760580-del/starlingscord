package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 extends xr.q implements vr.e {
    public static final xr.p E;
    public static final r0 F;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f16697i;
    private static final long serialVersionUID = -3192884724477742274L;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final long f16698v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final r0 f16699w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final r0 f16700x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Map f16701y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient long f16702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f16703e;

    static {
        long jT = xr.m.T(-999999999, 1, 1);
        long jT2 = xr.m.T(999999999, 12, 31);
        xr.k kVar = xr.k.UNIX;
        xr.k kVar2 = xr.k.MODIFIED_JULIAN_DATE;
        long jB = kVar.b(jT, kVar2) * 86400;
        f16697i = jB;
        long jB2 = (kVar.b(jT2, kVar2) * 86400) + 86399;
        f16698v = jB2;
        as.e eVar = as.e.f3000d;
        r0 r0Var = new r0(jB, 0, eVar);
        f16699w = r0Var;
        r0 r0Var2 = new r0(jB2, 999999999, eVar);
        f16700x = r0Var2;
        new r0(63158400L, 0, eVar);
        HashSet hashSet = new HashSet();
        hashSet.add(b1.S);
        hashSet.add(b1.R);
        hashSet.add(b1.Q);
        hashSet.add(b1.P);
        hashSet.add(b1.O);
        hashSet.add(b1.N);
        hashSet.add(b1.T);
        hashSet.add(b1.U);
        Collections.unmodifiableSet(hashSet);
        HashMap map = new HashMap();
        map.put(b1.V, 1);
        map.put(b1.W, 1);
        map.put(b1.X, 1000);
        map.put(b1.a0, 1000);
        map.put(b1.Y, 1000000);
        map.put(b1.f16598b0, 1000000);
        map.put(b1.Z, 1000000000);
        map.put(b1.f16599c0, 1000000000);
        Collections.unmodifiableMap(map);
        EnumMap enumMap = new EnumMap(TimeUnit.class);
        enumMap.put(TimeUnit.DAYS, Double.valueOf(86400.0d));
        enumMap.put(TimeUnit.HOURS, Double.valueOf(3600.0d));
        enumMap.put(TimeUnit.MINUTES, Double.valueOf(60.0d));
        enumMap.put(TimeUnit.SECONDS, Double.valueOf(1.0d));
        enumMap.put(TimeUnit.MILLISECONDS, Double.valueOf(0.001d));
        enumMap.put(TimeUnit.MICROSECONDS, Double.valueOf(1.0E-6d));
        enumMap.put(TimeUnit.NANOSECONDS, Double.valueOf(1.0E-9d));
        f16701y = Collections.unmodifiableMap(enumMap);
        xr.n nVar = new xr.n(TimeUnit.class, r0.class, new vi.d(12, (byte) 0), r0Var, r0Var2, null);
        for (TimeUnit timeUnit : TimeUnit.values()) {
            q0 q0Var = new q0(timeUnit, 0);
            Map map2 = f16701y;
            nVar.d(timeUnit, q0Var, ((Double) map2.get(timeUnit)).doubleValue(), map2.keySet());
        }
        o0 o0Var = o0.f16683d;
        nVar.a(o0Var, o0Var, TimeUnit.SECONDS);
        n0 n0Var = n0.f16676d;
        nVar.a(n0Var, n0Var, TimeUnit.NANOSECONDS);
        nVar.b(f1.f16635w, new p0(0));
        nVar.f23065m = new ag.t(6);
        E = nVar.e();
        F = new r0(0L, 0, eVar);
    }

    public r0(int i7, long j) {
        m(j);
        this.f16702d = j;
        this.f16703e = i7;
    }

    public static void m(long j) {
        if (j > f16698v || j < f16697i) {
            throw new IllegalArgumentException(kk.b.i(j, "UNIX time (UT) out of supported range: "));
        }
    }

    public static void o(int i7, int i10, StringBuilder sb2) {
        int i11 = 1;
        for (int i12 = 0; i12 < i10 - 1; i12++) {
            i11 *= 10;
        }
        while (i7 < i11 && i11 >= 10) {
            sb2.append('0');
            i11 /= 10;
        }
        sb2.append(String.valueOf(i7));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    public static r0 s(long j, int i7, as.e eVar) {
        return (j == 0 && i7 == 0 && eVar == as.e.f3000d) ? F : new r0(j, i7, eVar);
    }

    public static int t(double d6, long j) {
        try {
            return (int) ((d6 * 1.0E9d) - yk.a.C(j, 1000000000L));
        } catch (ArithmeticException unused) {
            return (int) ((d6 - j) * 1.0E9d);
        }
    }

    private Object writeReplace() {
        return new SPX(4, this);
    }

    @Override // xr.e
    public final xr.p e() {
        return E;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r0) {
            r0 r0Var = (r0) obj;
            if (this.f16702d != r0Var.f16702d) {
                return false;
            }
            if (as.c.F.e()) {
                return this.f16703e == r0Var.f16703e;
            }
            if (r() == r0Var.r()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f16702d;
        return (r() * 37) + (((int) (j ^ (j >>> 32))) * 19);
    }

    @Override // xr.q
    public final xr.p j() {
        return E;
    }

    @Override // xr.q
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final int i(r0 r0Var) {
        int iR;
        long jQ = q();
        long jQ2 = r0Var.q();
        if (jQ < jQ2) {
            return -1;
        }
        if (jQ <= jQ2 && (iR = r() - r0Var.r()) <= 0) {
            return iR < 0 ? -1 : 0;
        }
        return 1;
    }

    public final x0 p() {
        return x0.B(yk.a.k(86400, this.f16702d), xr.k.UNIX);
    }

    public final long q() {
        as.c cVar = as.c.F;
        boolean zE = cVar.e();
        long j = this.f16702d;
        if (!zE) {
            return j - 63072000;
        }
        long jB = cVar.b(j);
        return (this.f16703e >>> 30) != 0 ? jB + 1 : jB;
    }

    public final int r() {
        return this.f16703e & (-1073741825);
    }

    public final String toString() {
        x0 x0VarP = p();
        int iM = yk.a.m(86400, this.f16702d);
        int i7 = iM / 60;
        int i10 = i7 / 60;
        int i11 = i7 % 60;
        int i12 = iM % 60;
        as.c cVar = as.c.F;
        long jQ = q();
        int i13 = 0;
        if (jQ <= 0) {
            cVar.getClass();
        } else {
            for (as.b bVar : cVar.d()) {
                if (jQ > bVar.d()) {
                    break;
                }
                long jD = bVar.d() - ((long) bVar.b());
                if (jQ > jD) {
                    i13 = (int) (jQ - jD);
                    break;
                }
            }
        }
        int iR = r();
        StringBuilder sb2 = new StringBuilder(50);
        sb2.append(x0VarP);
        sb2.append('T');
        o(i10, 2, sb2);
        sb2.append(':');
        o(i11, 2, sb2);
        sb2.append(':');
        o(i12 + i13, 2, sb2);
        if (iR > 0) {
            sb2.append(',');
            o(iR, 9, sb2);
        }
        sb2.append('Z');
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0151  */
    public r0(long j, int i7, as.e eVar) {
        long j5;
        long jFloor;
        long jB;
        long jE = j;
        int iT = i7;
        if (eVar == as.e.f3000d) {
            this.f16702d = jE;
            this.f16703e = iT;
        } else {
            as.c cVar = as.c.F;
            if (cVar.e()) {
                if (eVar == as.e.f3001e) {
                    j5 = 0;
                } else {
                    j5 = 0;
                    if (eVar == as.e.f3002i) {
                        if (jE < 0) {
                            throw new IllegalArgumentException(kk.b.i(jE, "TAI not supported before 1958-01-01: "));
                        }
                        if (jE < 441763200) {
                            long jA = yk.a.A(jE, -441763168L);
                            int iZ = yk.a.z(iT, 184000000);
                            if (iZ >= 1000000000) {
                                jA = yk.a.A(jA, 1L);
                                iZ = yk.a.D(iZ, 1000000000);
                            }
                            double d6 = (((double) iZ) / 1.0E9d) + jA;
                            double dA = d6 - as.e.a(x0.B(yk.a.k(86400, (long) (d6 - 42.184d)), xr.k.UTC));
                            jFloor = (long) Math.floor(dA);
                            iT = t(dA, jFloor);
                        } else {
                            jFloor = yk.a.E(jE, 441763210L);
                        }
                    } else if (eVar == as.e.f3003v) {
                        long jA2 = yk.a.A(jE, 252892809L);
                        if (jA2 < 252892809) {
                            throw new IllegalArgumentException(kk.b.i(jE, "GPS not supported before 1980-01-06: "));
                        }
                        jFloor = jA2;
                    } else if (eVar == as.e.f3004w) {
                        if (jE >= 42 && (jE != 42 || iT >= 184000000)) {
                            jE = yk.a.E(jE, 42L);
                            iT = yk.a.D(iT, 184000000);
                            if (iT < 0) {
                                jE = yk.a.E(jE, 1L);
                                iT = yk.a.z(iT, 1000000000);
                            }
                        } else {
                            double d7 = (((double) iT) / 1.0E9d) + jE;
                            double dA2 = d7 - as.e.a(x0.B(yk.a.k(86400, (long) (d7 - 42.184d)), xr.k.UTC));
                            jFloor = (long) Math.floor(dA2);
                            iT = t(dA2, jFloor);
                        }
                    } else {
                        if (eVar != as.e.f3005x) {
                            throw new UnsupportedOperationException("Not yet implemented: " + eVar.name());
                        }
                        if (jE >= 0) {
                            double dA3 = (as.e.a(x0.B(yk.a.k(86400, jE), xr.k.UTC)) + ((((double) iT) / 1.0E9d) + jE)) - 42.184d;
                            jFloor = (long) Math.floor(dA3);
                            iT = t(dA3, jFloor);
                        }
                    }
                    long j7 = cVar.j(jFloor);
                    jB = jFloor - cVar.b(j7);
                    this.f16702d = j7;
                    if (jB != j5 || j7 == f16698v) {
                        this.f16703e = iT;
                    } else if (jB == 1) {
                        this.f16703e = 1073741824 | iT;
                    } else {
                        throw new IllegalStateException(a3.e.h(jE, "Cannot handle leap shift of ", "."));
                    }
                }
                jFloor = jE;
                long j10 = cVar.j(jFloor);
                jB = jFloor - cVar.b(j10);
                this.f16702d = j10;
                if (jB != j5) {
                    this.f16703e = iT;
                } else {
                    this.f16703e = iT;
                }
            } else {
                throw new IllegalStateException("Leap seconds are not supported by configuration.");
            }
        }
        m(this.f16702d);
        if (iT >= 1000000000 || iT < 0) {
            throw new IllegalArgumentException(kk.b.h(iT, "Nanosecond out of range: "));
        }
    }

    @Override // xr.e
    public final xr.e f() {
        return this;
    }
}
