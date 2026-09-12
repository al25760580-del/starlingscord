package j$.time.format;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.temporal.j f13496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13498c;

    public g(j$.time.temporal.a aVar) {
        Objects.requireNonNull(aVar, "field");
        j$.time.temporal.n nVar = aVar.f13547b;
        if (nVar.f13564a != nVar.f13565b || nVar.f13566c != nVar.f13567d) {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + aVar);
        }
        this.f13496a = aVar;
        this.f13497b = 9;
        this.f13498c = true;
    }

    @Override // j$.time.format.f
    public final boolean a(p pVar, StringBuilder sb2) {
        j$.time.temporal.j jVar = this.f13496a;
        Long lA = pVar.a(jVar);
        if (lA == null) {
            return false;
        }
        s sVar = pVar.f13527b.f13487c;
        long jLongValue = lA.longValue();
        j$.time.temporal.n nVarC = jVar.c();
        if (!nVarC.c(jLongValue)) {
            throw new j$.time.a(nVarC.b(jLongValue, jVar));
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(nVarC.f13564a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(nVarC.f13567d).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        if (bigDecimal.scale() == 0) {
            return true;
        }
        String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), 0), this.f13497b), roundingMode).toPlainString().substring(2);
        sVar.getClass();
        if (this.f13498c) {
            sb2.append('.');
        }
        sb2.append(strSubstring);
        return true;
    }

    public final String toString() {
        return "Fraction(" + this.f13496a + ",0," + this.f13497b + (this.f13498c ? ",DecimalPoint" : "") + ")";
    }
}
