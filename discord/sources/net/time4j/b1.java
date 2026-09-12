package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class b1 extends xr.q {
    public static final BigDecimal E;
    public static final BigDecimal F;
    public static final BigDecimal G;
    public static final BigDecimal H;
    public static final b1[] I;
    public static final b1 J;
    public static final b1 K;
    public static final l1 L;
    public static final l1 M;
    public static final c N;
    public static final f0 O;
    public static final f0 P;
    public static final f0 Q;
    public static final f0 R;
    public static final f0 S;
    public static final f0 T;
    public static final f0 U;
    public static final f0 V;
    public static final f0 W;
    public static final f0 X;
    public static final f0 Y;
    public static final f0 Z;
    public static final f0 a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final j0 f16598b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final j0 f16599c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final z f16600d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final z f16601e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final z f16602f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final f1 f16603g0;
    public static final Map h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final xr.p f16604i0;
    private static final long serialVersionUID = 2780881537313863339L;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final char f16605w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final BigDecimal f16606x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final BigDecimal f16607y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient byte f16608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient byte f16609e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient byte f16610i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient int f16611v;

    static {
        f16605w = Boolean.getBoolean("net.time4j.format.iso.decimal.dot") ? '.' : ',';
        f16606x = new BigDecimal(60);
        f16607y = new BigDecimal(3600);
        E = new BigDecimal(1000000000);
        F = new BigDecimal("24");
        G = new BigDecimal("23.999999999999999");
        H = new BigDecimal("59.999999999999999");
        I = new b1[25];
        for (int i7 = 0; i7 <= 24; i7++) {
            I[i7] = new b1(i7, 0, 0, 0, false);
        }
        b1[] b1VarArr = I;
        b1 b1Var = b1VarArr[0];
        J = b1Var;
        b1 b1Var2 = b1VarArr[24];
        K = b1Var2;
        l1 l1Var = l1.f16663d;
        L = l1Var;
        M = l1Var;
        c cVar = c.f16612d;
        N = cVar;
        f0 f0VarM = f0.m("CLOCK_HOUR_OF_AMPM", false);
        O = f0VarM;
        f0 f0VarM2 = f0.m("CLOCK_HOUR_OF_DAY", true);
        P = f0VarM2;
        f0 f0VarN = f0.n('K', 3, 11, "DIGITAL_HOUR_OF_AMPM");
        Q = f0VarN;
        f0 f0VarN2 = f0.n('H', 4, 23, "DIGITAL_HOUR_OF_DAY");
        R = f0VarN2;
        f0 f0VarN3 = f0.n('H', 5, 23, "HOUR_FROM_0_TO_24");
        S = f0VarN3;
        f0 f0VarN4 = f0.n('m', 6, 59, "MINUTE_OF_HOUR");
        T = f0VarN4;
        f0 f0VarN5 = f0.n((char) 0, 7, 1439, "MINUTE_OF_DAY");
        U = f0VarN5;
        f0 f0VarN6 = f0.n('s', 8, 59, "SECOND_OF_MINUTE");
        V = f0VarN6;
        f0 f0VarN7 = f0.n((char) 0, 9, 86399, "SECOND_OF_DAY");
        W = f0VarN7;
        f0 f0VarN8 = f0.n((char) 0, 10, 999, "MILLI_OF_SECOND");
        X = f0VarN8;
        f0 f0VarN9 = f0.n((char) 0, 11, 999999, "MICRO_OF_SECOND");
        Y = f0VarN9;
        f0 f0VarN10 = f0.n('S', 12, 999999999, "NANO_OF_SECOND");
        Z = f0VarN10;
        f0 f0VarN11 = f0.n('A', 13, 86399999, "MILLI_OF_DAY");
        a0 = f0VarN11;
        j0 j0Var = new j0(0L, 86399999999L, "MICRO_OF_DAY");
        f16598b0 = j0Var;
        j0 j0Var2 = new j0(0L, 86399999999999L, "NANO_OF_DAY");
        f16599c0 = j0Var2;
        z zVar = new z("DECIMAL_HOUR", G);
        f16600d0 = zVar;
        BigDecimal bigDecimal = H;
        z zVar2 = new z("DECIMAL_MINUTE", bigDecimal);
        f16601e0 = zVar2;
        z zVar3 = new z("DECIMAL_SECOND", bigDecimal);
        f16602f0 = zVar3;
        f1 f1Var = f1.f16634v;
        f16603g0 = f1Var;
        HashMap map = new HashMap();
        map.put(l1Var.name(), l1Var);
        map.put("AM_PM_OF_DAY", cVar);
        map.put(f0VarM.name(), f0VarM);
        map.put(f0VarM2.name(), f0VarM2);
        map.put(f0VarN.name(), f0VarN);
        map.put(f0VarN2.name(), f0VarN2);
        map.put(f0VarN3.name(), f0VarN3);
        map.put(f0VarN4.name(), f0VarN4);
        map.put(f0VarN5.name(), f0VarN5);
        map.put(f0VarN6.name(), f0VarN6);
        map.put(f0VarN7.name(), f0VarN7);
        map.put(f0VarN8.name(), f0VarN8);
        map.put(f0VarN9.name(), f0VarN9);
        map.put(f0VarN10.name(), f0VarN10);
        map.put(f0VarN11.name(), f0VarN11);
        map.put(j0Var.name(), j0Var);
        map.put(j0Var2.name(), j0Var2);
        map.put(zVar.name(), zVar);
        map.put(zVar2.name(), zVar2);
        map.put(zVar3.name(), zVar3);
        h0 = Collections.unmodifiableMap(map);
        y0 y0Var = new y0(0, zVar, F);
        y0 y0Var2 = new y0(0, zVar2, bigDecimal);
        y0 y0Var3 = new y0(0, zVar3, bigDecimal);
        xr.n nVar = new xr.n(h0.class, b1.class, new i8.b(13), b1Var, b1Var2, null);
        nVar.b(l1Var, new p0(4));
        nVar.b(cVar, new p0(2));
        z0 z0Var = new z0(f0VarM, 1, 12);
        n nVar2 = t.f16710d;
        nVar.a(f0VarM, z0Var, nVar2);
        nVar.a(f0VarM2, new z0(f0VarM2, 1, 24), nVar2);
        nVar.a(f0VarN, new z0(f0VarN, 0, 11), nVar2);
        nVar.a(f0VarN2, new z0(f0VarN2, 0, 23), nVar2);
        nVar.a(f0VarN3, new z0(f0VarN3, 0, 24), nVar2);
        z0 z0Var2 = new z0(f0VarN4, 0, 59);
        o oVar = t.f16711e;
        nVar.a(f0VarN4, z0Var2, oVar);
        nVar.a(f0VarN5, new z0(f0VarN5, 0, 1440), oVar);
        z0 z0Var3 = new z0(f0VarN6, 0, 59);
        p pVar = t.f16712i;
        nVar.a(f0VarN6, z0Var3, pVar);
        nVar.a(f0VarN7, new z0(f0VarN7, 0, 86400), pVar);
        z0 z0Var4 = new z0(f0VarN8, 0, 999);
        q qVar = t.f16713v;
        nVar.a(f0VarN8, z0Var4, qVar);
        z0 z0Var5 = new z0(f0VarN9, 0, 999999);
        r rVar = t.f16714w;
        nVar.a(f0VarN9, z0Var5, rVar);
        z0 z0Var6 = new z0(f0VarN10, 0, 999999999);
        s sVar = t.f16715x;
        nVar.a(f0VarN10, z0Var6, sVar);
        nVar.a(f0VarN11, new z0(f0VarN11, 0, 86400000), qVar);
        nVar.a(j0Var, new a1(j0Var, 86400000000L), rVar);
        nVar.a(j0Var2, new a1(j0Var2, 86400000000000L), sVar);
        nVar.b(zVar, y0Var);
        nVar.b(zVar2, y0Var2);
        nVar.b(zVar3, y0Var3);
        nVar.b(f1Var, new p0(3));
        for (x xVar : vr.c.f21955b.d(x.class)) {
            if (xVar.a(b1.class)) {
                nVar.c(xVar);
            }
        }
        nVar.c(new x(0));
        EnumSet enumSetAllOf = EnumSet.allOf(t.class);
        for (t tVar : t.values()) {
            nVar.d(tVar, new q0(tVar, 1), tVar.getLength(), enumSetAllOf);
        }
        f16604i0 = nVar.e();
    }

    public b1(int i7, int i10, int i11, int i12, boolean z5) {
        if (z5) {
            r(i7);
            s(i10);
            t(i11);
            if (i12 < 0 || i12 >= 1000000000) {
                throw new IllegalArgumentException(kk.b.h(i12, "NANO_OF_SECOND out of range: "));
            }
            if (i7 == 24 && (i10 | i11 | i12) != 0) {
                throw new IllegalArgumentException("T24:00:00 exceeded.");
            }
        }
        this.f16608d = (byte) i7;
        this.f16609e = (byte) i10;
        this.f16610i = (byte) i11;
        this.f16611v = i12;
    }

    public static b1 m(int i7, int i10) {
        int i11 = ((i7 % 1000) * 1000000) + i10;
        int i12 = i7 / 1000;
        int i13 = i12 % 60;
        int i14 = i12 / 60;
        return y(i14 / 60, i14 % 60, i13, i11, true);
    }

    public static b1 n(int i7, long j) {
        int i10 = (((int) (j % 1000000)) * 1000) + i7;
        int i11 = (int) (j / 1000000);
        int i12 = i11 % 60;
        int i13 = i11 / 60;
        return y(i13 / 60, i13 % 60, i12, i10, true);
    }

    public static b1 o(long j) {
        int i7 = (int) (j % 1000000000);
        int i10 = (int) (j / 1000000000);
        int i11 = i10 % 60;
        int i12 = i10 / 60;
        return y(i12 / 60, i12 % 60, i11, i7, true);
    }

    public static long p(long j, long j5) {
        return j - (j5 * (j >= 0 ? j / j5 : ((j + 1) / j5) - 1));
    }

    public static long q(b1 b1Var) {
        return (((long) b1Var.f16608d) * 3600000000000L) + (((long) b1Var.f16609e) * 60000000000L) + (((long) b1Var.f16610i) * 1000000000) + ((long) b1Var.f16611v);
    }

    public static void r(long j) {
        if (j < 0 || j > 24) {
            throw new IllegalArgumentException(kk.b.i(j, "HOUR_OF_DAY out of range: "));
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    public static void s(long j) {
        if (j < 0 || j > 59) {
            throw new IllegalArgumentException(kk.b.i(j, "MINUTE_OF_HOUR out of range: "));
        }
    }

    public static void t(long j) {
        if (j < 0 || j > 59) {
            throw new IllegalArgumentException(kk.b.i(j, "SECOND_OF_MINUTE out of range: "));
        }
    }

    private Object writeReplace() {
        return new SPX(2, this);
    }

    public static b1 x(int i7) {
        r(i7);
        return I[i7];
    }

    public static b1 y(int i7, int i10, int i11, int i12, boolean z5) {
        if ((i10 | i11 | i12) == 0) {
            return z5 ? x(i7) : I[i7];
        }
        return new b1(i7, i10, i11, i12, z5);
    }

    @Override // xr.e
    public final xr.p e() {
        return f16604i0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f16608d == b1Var.f16608d && this.f16609e == b1Var.f16609e && this.f16610i == b1Var.f16610i && this.f16611v == b1Var.f16611v) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f16611v * 37) + (this.f16610i * 3600) + (this.f16609e * 60) + this.f16608d;
    }

    @Override // xr.q
    public final xr.p j() {
        return f16604i0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(19);
        sb2.append('T');
        byte b10 = this.f16608d;
        if (b10 < 10) {
            sb2.append('0');
        }
        sb2.append((int) b10);
        byte b11 = this.f16609e;
        byte b12 = this.f16610i;
        int i7 = this.f16611v;
        if ((b11 | b12 | i7) != 0) {
            sb2.append(':');
            if (b11 < 10) {
                sb2.append('0');
            }
            sb2.append((int) b11);
            if ((b12 | i7) != 0) {
                sb2.append(':');
                if (b12 < 10) {
                    sb2.append('0');
                }
                sb2.append((int) b12);
                if (i7 != 0) {
                    sb2.append(f16605w);
                    String string = Integer.toString(i7);
                    int i10 = i7 % 1000000 == 0 ? 3 : i7 % 1000 == 0 ? 6 : 9;
                    for (int length = string.length(); length < 9; length++) {
                        sb2.append('0');
                    }
                    int length2 = (string.length() + i10) - 9;
                    for (int i11 = 0; i11 < length2; i11++) {
                        sb2.append(string.charAt(i11));
                    }
                }
            }
        }
        return sb2.toString();
    }

    @Override // xr.q
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final int i(b1 b1Var) {
        int i7 = this.f16608d - b1Var.f16608d;
        if (i7 == 0 && (i7 = this.f16609e - b1Var.f16609e) == 0 && (i7 = this.f16610i - b1Var.f16610i) == 0) {
            i7 = this.f16611v - b1Var.f16611v;
        }
        if (i7 < 0) {
            return -1;
        }
        return i7 == 0 ? 0 : 1;
    }

    public final boolean v() {
        return ((this.f16609e | this.f16610i) | this.f16611v) == 0;
    }

    public final boolean w() {
        return (this.f16610i | this.f16611v) == 0;
    }

    @Override // xr.e
    public final xr.e f() {
        return this;
    }
}
