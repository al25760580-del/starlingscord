package net.time4j;

import com.discord.chat.presentation.message.view.MediaImageViewKt;
import com.facebook.imageutils.TiffUtil;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 extends xr.c implements vr.a {
    public static final u J;
    public static final e0 K;
    public static final x1 L;
    public static final d0 M;
    public static final d0 N;
    public static final e0 O;
    public static final e0 P;
    public static final d0 Q;
    public static final e0 R;
    public static final e0 S;
    public static final q1 T;
    public static final Map U;
    public static final ga.k V;
    public static final xr.p W;
    private static final long serialVersionUID = -6698431452072325688L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f16786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient byte f16787e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient byte f16788i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final x0 f16782v = new x0(-999999999, 1, 1);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final x0 f16783w = new x0(999999999, 12, 31);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Integer f16784x = -999999999;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Integer f16785y = 999999999;
    public static final Integer E = 12;
    public static final Integer F = 365;
    public static final Integer G = 366;
    public static final int[] H = {31, 59, 90, 120, 151, 181, MediaImageViewKt.OBSCURED_IMAGE_MIN_HEIGHT, 243, 273, 304, 334, 365};
    public static final int[] I = {31, 60, 91, 121, 152, 182, 213, 244, TiffUtil.TIFF_TAG_ORIENTATION, 305, 335, 366};

    static {
        u uVar = u.f16764d;
        J = uVar;
        e0 e0VarM = e0.m('u', 14, -999999999, 999999999, "YEAR");
        K = e0VarM;
        x1 x1Var = x1.f16790e;
        L = x1Var;
        d0 d0Var = new d0("QUARTER_OF_YEAR", h1.class, h1.f16642d, h1.f16643e, 103, 'Q');
        M = d0Var;
        d0 d0Var2 = new d0("MONTH_OF_YEAR", s0.class, s0.f16706d, s0.f16707e, 101, 'M');
        N = d0Var2;
        e0 e0VarM2 = e0.m('M', 15, 1, 12, "MONTH_AS_NUMBER");
        O = e0VarM2;
        e0 e0VarM3 = e0.m('d', 16, 1, 31, "DAY_OF_MONTH");
        P = e0VarM3;
        d0 d0Var3 = new d0("DAY_OF_WEEK", p1.class, p1.f16687d, p1.f16693y, 102, 'E');
        Q = d0Var3;
        e0 e0VarM4 = e0.m('D', 17, 1, 365, "DAY_OF_YEAR");
        R = e0VarM4;
        e0 e0VarM5 = e0.m((char) 0, 18, 1, 92, "DAY_OF_QUARTER");
        S = e0VarM5;
        q1 q1Var = q1.f16696d;
        T = q1Var;
        HashMap map = new HashMap();
        s(map, uVar);
        map.put(e0VarM.name(), e0VarM);
        s(map, x1Var);
        map.put(d0Var.name(), d0Var);
        map.put(d0Var2.name(), d0Var2);
        map.put(e0VarM2.name(), e0VarM2);
        map.put(e0VarM3.name(), e0VarM3);
        map.put(d0Var3.name(), d0Var3);
        map.put(e0VarM4.name(), e0VarM4);
        map.put(e0VarM5.name(), e0VarM5);
        s(map, q1Var);
        U = Collections.unmodifiableMap(map);
        ga.k kVar = new ga.k();
        V = kVar;
        Class<x0> cls = x0.class;
        xr.n nVar = new xr.n(g0.class, cls, new w0(), (xr.q) kVar.y(-365243219892L), (xr.q) kVar.y(kVar.v()), kVar);
        xr.k[] kVarArrValues = xr.k.values();
        int length = kVarArrValues.length;
        int i7 = 0;
        while (i7 < length) {
            int i10 = length;
            xr.k kVar2 = kVarArrValues[i7];
            kVar2.getClass();
            nVar.b(kVar2, new y0(1, kVar2, kVar));
            i7++;
            length = i10;
            cls = cls;
        }
        Class<x0> cls2 = cls;
        p0 p0Var = new p0(1);
        k kVar3 = m.E;
        nVar.a(uVar, p0Var, kVar3);
        nVar.a(e0VarM, new v0(e0VarM), m.f16667v);
        nVar.a(x1Var, new p0(5), o1.f16685d);
        nVar.a(d0Var, u0.a(d0Var), m.f16668w);
        u0 u0VarA = u0.a(d0Var2);
        i iVar = m.f16669x;
        nVar.a(d0Var2, u0VarA, iVar);
        nVar.a(e0VarM2, new v0(e0VarM2), iVar);
        nVar.a(e0VarM3, new v0(e0VarM3), kVar3);
        nVar.a(d0Var3, u0.a(d0Var3), kVar3);
        nVar.a(e0VarM4, new v0(e0VarM4), kVar3);
        nVar.a(e0VarM5, new v0(e0VarM5), kVar3);
        v0 v0Var = new v0(19, q1Var);
        j jVar = m.f16670y;
        nVar.a(q1Var, v0Var, jVar);
        EnumSet enumSetRange = EnumSet.range(m.f16664d, iVar);
        EnumSet enumSetRange2 = EnumSet.range(jVar, kVar3);
        for (m mVar : m.values()) {
            xr.n nVar2 = nVar;
            nVar2.d(mVar, new l(mVar, 0), mVar.getLength(), mVar.compareTo(m.f16670y) < 0 ? enumSetRange : enumSetRange2);
            nVar = nVar2;
        }
        for (x xVar : vr.c.f21955b.d(x.class)) {
            Class<x0> cls3 = cls2;
            if (xVar.a(cls3)) {
                nVar.c(xVar);
            }
            cls2 = cls3;
        }
        nVar.c(new x(1));
        W = nVar.e();
    }

    public x0(int i7, int i10, int i11) {
        this.f16786d = i7;
        this.f16787e = (byte) i10;
        this.f16788i = (byte) i11;
    }

    public static x0 A(int i7, int i10, p1 p1Var, boolean z5) {
        if (i10 < 1 || i10 > 53) {
            if (z5) {
                throw new IllegalArgumentException(kk.b.h(i10, "WEEK_OF_YEAR (ISO) out of range: "));
            }
            return null;
        }
        if (z5 && (i7 < f16784x.intValue() || i7 > f16785y.intValue())) {
            throw new IllegalArgumentException(kk.b.h(i7, "YEAR_OF_WEEKDATE (ISO) out of range: "));
        }
        int iA = p1.d(xr.m.r(i7, 1, 1)).a();
        int iA2 = (p1Var.a() + (((i10 - 1) * 7) + (iA <= 4 ? 2 - iA : 9 - iA))) - 1;
        if (iA2 <= 0) {
            i7--;
            iA2 += xr.m.A(i7) ? 366 : 365;
        } else {
            int i11 = xr.m.A(i7) ? 366 : 365;
            if (iA2 > i11) {
                iA2 -= i11;
                i7++;
            }
        }
        x0 x0VarY = y(i7, iA2);
        if (i10 != 53 || ((Integer) x0VarY.d(v1.G.f16776w)).intValue() == 53) {
            return x0VarY;
        }
        if (z5) {
            throw new IllegalArgumentException(kk.b.h(i10, "WEEK_OF_YEAR (ISO) out of range: "));
        }
        return null;
    }

    public static x0 B(long j, xr.k kVar) {
        return (x0) V.y(xr.k.UTC.b(j, kVar));
    }

    public static int q(x0 x0Var) {
        byte b10 = x0Var.f16788i;
        byte b11 = x0Var.f16787e;
        switch (b11) {
            case 1:
            case 4:
            case 7:
            case 10:
                return b10;
            case 2:
            case 8:
            case 11:
                return b10 + 31;
            case 3:
                return (xr.m.A(x0Var.f16786d) ? (byte) 60 : (byte) 59) + b10;
            case 5:
                return b10 + 30;
            case 6:
            case 12:
                return b10 + 61;
            case 9:
                return b10 + 62;
            default:
                throw new AssertionError(kk.b.h(b11, "Unknown month: "));
        }
    }

    public static x0 r(m mVar, x0 x0Var, long j, int i7) {
        switch (mVar.ordinal()) {
            case 0:
                return r(m.f16669x, x0Var, yk.a.C(j, 12000L), i7);
            case 1:
                return r(m.f16669x, x0Var, yk.a.C(j, 1200L), i7);
            case 2:
                return r(m.f16669x, x0Var, yk.a.C(j, 120L), i7);
            case 3:
                return r(m.f16669x, x0Var, yk.a.C(j, 12L), i7);
            case 4:
                return r(m.f16669x, x0Var, yk.a.C(j, 3L), i7);
            case 5:
                return v(x0Var, yk.a.A(((((long) (x0Var.f16786d - 1970)) * 12) + ((long) x0Var.f16787e)) - 1, j), x0Var.f16788i, i7);
            case 6:
                return r(m.E, x0Var, yk.a.C(j, 7L), i7);
            case 7:
                byte b10 = x0Var.f16788i;
                int i10 = x0Var.f16786d;
                long jA = yk.a.A(b10, j);
                if (jA >= 1 && jA <= 28) {
                    return z(i10, x0Var.f16787e, (int) jA, true);
                }
                long jA2 = yk.a.A(x0Var.x(), j);
                if (jA2 >= 1 && jA2 <= 365) {
                    return y(i10, (int) jA2);
                }
                ga.k kVar = V;
                return (x0) kVar.y(yk.a.A(kVar.x(x0Var), j));
            default:
                throw new UnsupportedOperationException(mVar.name());
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    public static void s(HashMap map, xr.d dVar) {
        map.put(dVar.name(), dVar);
    }

    public static void t(StringBuilder sb2, int i7) {
        sb2.append('-');
        if (i7 < 10) {
            sb2.append('0');
        }
        sb2.append(i7);
    }

    public static void u(StringBuilder sb2, int i7) {
        int i10;
        if (i7 < 0) {
            sb2.append('-');
            if (i7 == Integer.MIN_VALUE) {
                throw new ArithmeticException(kk.b.h(i7, "Not negatable: "));
            }
            i10 = -i7;
        } else {
            i10 = i7;
        }
        if (i10 >= 10000) {
            if (i7 > 0) {
                sb2.append('+');
            }
        } else if (i10 < 1000) {
            sb2.append('0');
            if (i10 < 100) {
                sb2.append('0');
                if (i10 < 10) {
                    sb2.append('0');
                }
            }
        }
        sb2.append(i10);
    }

    public static x0 v(x0 x0Var, long j, int i7, int i10) {
        if (i10 == 5 && x0Var.f16788i == xr.m.t(x0Var.f16786d, x0Var.f16787e)) {
            i10 = 2;
        }
        int iB = yk.a.B(yk.a.A(yk.a.k(12, j), 1970L));
        int iM = yk.a.m(12, j) + 1;
        int iT = xr.m.t(iB, iM);
        if (i7 <= iT) {
            if (i7 < iT && i10 == 2) {
            }
            return z(iB, iM, i7, true);
        }
        switch (i10) {
            case 0:
            case 2:
            case 5:
            case 6:
                break;
            case 1:
                return v(x0Var, yk.a.A(j, 1L), 1, i10);
            case 3:
                return v(x0Var, yk.a.A(j, 1L), i7 - iT, i10);
            case 4:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Day of month out of range: ");
                u(sb2, iB);
                t(sb2, iM);
                t(sb2, i7);
                throw new xr.f(sb2.toString());
            default:
                throw new UnsupportedOperationException(kk.b.h(i10, "Overflow policy not implemented: "));
        }
        return z(iB, iM, i7, true);
        i7 = iT;
        return z(iB, iM, i7, true);
    }

    private Object writeReplace() {
        return new SPX(1, this);
    }

    public static x0 y(int i7, int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(kk.b.h(i10, "Day of year out of range: "));
        }
        if (i10 <= 31) {
            return z(i7, 1, i10, true);
        }
        int[] iArr = xr.m.A(i7) ? I : H;
        for (int i11 = i10 > iArr[6] ? 7 : 1; i11 < 12; i11++) {
            if (i10 <= iArr[i11]) {
                return z(i7, i11 + 1, i10 - iArr[i11 - 1], false);
            }
        }
        throw new IllegalArgumentException(kk.b.h(i10, "Day of year out of range: "));
    }

    public static x0 z(int i7, int i10, int i11, boolean z5) {
        if (z5) {
            xr.m.c(i7, i10, i11);
        }
        return new x0(i7, i10, i11);
    }

    @Override // vr.a
    public final int a() {
        return this.f16786d;
    }

    @Override // vr.a
    public final int b() {
        return this.f16787e;
    }

    @Override // vr.a
    public final int c() {
        return this.f16788i;
    }

    @Override // xr.e
    public final xr.p e() {
        return W;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x0) {
            x0 x0Var = (x0) obj;
            if (this.f16788i == x0Var.f16788i && this.f16787e == x0Var.f16787e && this.f16786d == x0Var.f16786d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f16786d;
        return (((i7 << 11) + (this.f16787e << 6)) + this.f16788i) ^ (i7 & (-2048));
    }

    @Override // xr.q
    public final xr.p j() {
        return W;
    }

    @Override // xr.c
    public final int m(xr.c cVar) {
        if (!(cVar instanceof x0)) {
            return super.m(cVar);
        }
        x0 x0Var = (x0) cVar;
        int i7 = this.f16786d - x0Var.f16786d;
        if (i7 != 0) {
            return i7;
        }
        int i10 = this.f16787e - x0Var.f16787e;
        return i10 == 0 ? this.f16788i - x0Var.f16788i : i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        u(sb2, this.f16786d);
        t(sb2, this.f16787e);
        t(sb2, this.f16788i);
        return sb2.toString();
    }

    public final p1 w() {
        return p1.d(xr.m.r(this.f16786d, this.f16787e, this.f16788i));
    }

    public final int x() {
        byte b10 = this.f16788i;
        byte b11 = this.f16787e;
        if (b11 == 1) {
            return b10;
        }
        if (b11 == 2) {
            return b10 + 31;
        }
        return (xr.m.A(this.f16786d) ? 1 : 0) + H[b11 - 2] + b10;
    }

    @Override // xr.e
    public final xr.e f() {
        return this;
    }
}
