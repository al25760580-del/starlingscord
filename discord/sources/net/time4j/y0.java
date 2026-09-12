package net.time4j;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 implements xr.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f16796e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f16797i;

    public /* synthetic */ y0(int i7, Object obj, Object obj2) {
        this.f16795d = i7;
        this.f16796e = obj;
        this.f16797i = obj2;
    }

    public static BigDecimal a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return bigDecimal.divide(bigDecimal2, 16, RoundingMode.FLOOR);
    }

    public static int e(BigDecimal bigDecimal) {
        return Math.min(999999999, bigDecimal.movePointRight(9).setScale(0, RoundingMode.HALF_UP).intValue());
    }

    @Override // xr.j
    public final Object b(xr.e eVar, Object obj, boolean z5) {
        int iM;
        long jLongValueExact;
        int iIntValue;
        int iIntValue2;
        int iE;
        int iM2;
        int iM3;
        switch (this.f16795d) {
            case 0:
                b1 b1Var = (b1) eVar;
                BigDecimal bigDecimal = (BigDecimal) obj;
                z zVar = (z) this.f16796e;
                if (bigDecimal == null) {
                    throw new IllegalArgumentException("Missing element value.");
                }
                if (zVar == b1.f16600d0) {
                    RoundingMode roundingMode = RoundingMode.FLOOR;
                    BigDecimal scale = bigDecimal.setScale(0, roundingMode);
                    BigDecimal bigDecimalSubtract = bigDecimal.subtract(scale);
                    BigDecimal bigDecimal2 = b1.f16606x;
                    BigDecimal bigDecimalMultiply = bigDecimalSubtract.multiply(bigDecimal2);
                    BigDecimal scale2 = bigDecimalMultiply.setScale(0, roundingMode);
                    BigDecimal bigDecimalMultiply2 = bigDecimalMultiply.subtract(scale2).multiply(bigDecimal2);
                    BigDecimal scale3 = bigDecimalMultiply2.setScale(0, roundingMode);
                    jLongValueExact = scale.longValueExact();
                    iIntValue2 = scale2.intValue();
                    iIntValue = scale3.intValue();
                    iE = e(bigDecimalMultiply2.subtract(scale3));
                } else if (zVar == b1.f16601e0) {
                    RoundingMode roundingMode2 = RoundingMode.FLOOR;
                    BigDecimal scale4 = bigDecimal.setScale(0, roundingMode2);
                    BigDecimal bigDecimalMultiply3 = bigDecimal.subtract(scale4).multiply(b1.f16606x);
                    BigDecimal scale5 = bigDecimalMultiply3.setScale(0, roundingMode2);
                    int iIntValue3 = scale5.intValue();
                    int iE2 = e(bigDecimalMultiply3.subtract(scale5));
                    long jLongValueExact2 = scale4.longValueExact();
                    long j = b1Var.f16608d;
                    if (z5) {
                        long jK = yk.a.k(60, jLongValueExact2) + j;
                        iM2 = yk.a.m(60, jLongValueExact2);
                        j = jK;
                    } else {
                        b1.s(jLongValueExact2);
                        iM2 = (int) jLongValueExact2;
                    }
                    iIntValue2 = iM2;
                    iE = iE2;
                    iIntValue = iIntValue3;
                    jLongValueExact = j;
                } else {
                    if (zVar != b1.f16602f0) {
                        throw new UnsupportedOperationException(zVar.name());
                    }
                    BigDecimal scale6 = bigDecimal.setScale(0, RoundingMode.FLOOR);
                    int iE3 = e(bigDecimal.subtract(scale6));
                    long jLongValueExact3 = scale6.longValueExact();
                    long j5 = b1Var.f16608d;
                    int iM4 = b1Var.f16609e;
                    if (z5) {
                        iM = yk.a.m(60, jLongValueExact3);
                        long jK2 = yk.a.k(60, jLongValueExact3) + ((long) iM4);
                        long jK3 = yk.a.k(60, jK2) + j5;
                        iM4 = yk.a.m(60, jK2);
                        jLongValueExact = jK3;
                    } else {
                        b1.t(jLongValueExact3);
                        iM = (int) jLongValueExact3;
                        jLongValueExact = j5;
                    }
                    iIntValue = iM;
                    iIntValue2 = iM4;
                    iE = iE3;
                }
                if (z5) {
                    iM3 = yk.a.m(24, jLongValueExact);
                    if (jLongValueExact > 0 && (iM3 | iIntValue2 | iIntValue | iE) == 0) {
                        return b1.K;
                    }
                } else {
                    if (jLongValueExact < 0 || jLongValueExact > 24) {
                        throw new IllegalArgumentException("Value out of range: " + bigDecimal);
                    }
                    iM3 = (int) jLongValueExact;
                }
                return b1.y(iM3, iIntValue2, iIntValue, iE, true);
            default:
                Long l6 = (Long) obj;
                if (l6 == null) {
                    throw new IllegalArgumentException("Missing epoch day value.");
                }
                return (xr.e) ((ga.k) this.f16797i).y(yk.a.E(xr.k.UNIX.b(l6.longValue(), (xr.k) this.f16796e), 730L));
        }
    }

    @Override // xr.j
    public final Object c(xr.e eVar) {
        BigDecimal bigDecimalAdd;
        switch (this.f16795d) {
            case 0:
                b1 b1Var = (b1) eVar;
                z zVar = (z) this.f16796e;
                if (zVar == b1.f16600d0) {
                    if (b1Var.equals(b1.J)) {
                        return BigDecimal.ZERO;
                    }
                    byte b10 = b1Var.f16608d;
                    if (b10 == 24) {
                        return b1.F;
                    }
                    BigDecimal bigDecimalAdd2 = BigDecimal.valueOf(b10).add(a(BigDecimal.valueOf(b1Var.f16609e), b1.f16606x));
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(b1Var.f16610i);
                    BigDecimal bigDecimal = b1.f16607y;
                    bigDecimalAdd = bigDecimalAdd2.add(a(bigDecimalValueOf, bigDecimal)).add(a(BigDecimal.valueOf(b1Var.f16611v), bigDecimal.multiply(b1.E)));
                } else if (zVar == b1.f16601e0) {
                    if (b1Var.v()) {
                        return BigDecimal.ZERO;
                    }
                    BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(b1Var.f16609e);
                    BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(b1Var.f16610i);
                    BigDecimal bigDecimal2 = b1.f16606x;
                    bigDecimalAdd = bigDecimalValueOf2.add(a(bigDecimalValueOf3, bigDecimal2)).add(a(BigDecimal.valueOf(b1Var.f16611v), bigDecimal2.multiply(b1.E)));
                } else {
                    if (zVar != b1.f16602f0) {
                        throw new UnsupportedOperationException(zVar.name());
                    }
                    if (b1Var.w()) {
                        return BigDecimal.ZERO;
                    }
                    bigDecimalAdd = BigDecimal.valueOf(b1Var.f16610i).add(a(BigDecimal.valueOf(b1Var.f16611v), b1.E));
                }
                BigDecimal scale = bigDecimalAdd.setScale(15, RoundingMode.FLOOR);
                return scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros();
            default:
                return Long.valueOf(((xr.k) this.f16796e).b(((ga.k) this.f16797i).x(eVar) + 730, xr.k.UNIX));
        }
    }

    @Override // xr.j
    public final Object d(xr.e eVar) {
        z zVar;
        switch (this.f16795d) {
            case 0:
                return (((b1) eVar).f16608d == 24 && ((zVar = (z) this.f16796e) == b1.f16601e0 || zVar == b1.f16602f0)) ? BigDecimal.ZERO : (BigDecimal) this.f16797i;
            default:
                return Long.valueOf(((xr.k) this.f16796e).b(((ga.k) this.f16797i).v() + 730, xr.k.UNIX));
        }
    }
}
