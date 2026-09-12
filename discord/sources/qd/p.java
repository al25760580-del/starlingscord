package qd;

import com.google.android.exoplayer2.Format;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends n {
    public final we.k j;
    public final we.k k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f18772l;

    public p(j jVar, long j, long j5, long j7, long j10, long j11, List list, long j12, we.k kVar, we.k kVar2, long j13, long j14) {
        super(jVar, j, j5, j7, j11, list, j12, j13, j14);
        this.j = kVar;
        this.k = kVar2;
        this.f18772l = j10;
    }

    @Override // qd.s
    public final j a(m mVar) {
        we.k kVar = this.j;
        if (kVar == null) {
            return this.f18777a;
        }
        Format format = mVar.f18759d;
        return new j(0L, -1L, kVar.b(0L, 0L, format.f5524d, format.E));
    }

    @Override // qd.n
    public final long d(long j) {
        List list = this.f18768f;
        if (list != null) {
            return list.size();
        }
        long j5 = this.f18772l;
        if (j5 != -1) {
            return (j5 - this.f18766d) + 1;
        }
        if (j == -9223372036854775807L) {
            return -1L;
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.f18778b));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.f18767e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i7 = fi.a.f9258a;
        return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // qd.n
    public final j h(k kVar, long j) {
        long j5 = this.f18766d;
        List list = this.f18768f;
        long j7 = list != null ? ((q) list.get((int) (j - j5))).f18773a : (j - j5) * this.f18767e;
        Format format = kVar.f18759d;
        return new j(0L, -1L, this.k.b(j, j7, format.f5524d, format.E));
    }
}
