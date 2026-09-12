package yc;

import com.discord.jank_stats.JankRecordStore;
import java.math.BigInteger;
import je.e0;
import pc.t;
import pc.u;
import pc.v;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f23237a;

    public a(b bVar) {
        this.f23237a = bVar;
    }

    @Override // pc.u
    public final boolean c() {
        return true;
    }

    @Override // pc.u
    public final t h(long j) {
        b bVar = this.f23237a;
        long j5 = (((long) bVar.f23241v.f23268i) * j) / 1000000;
        long j7 = bVar.f23239e;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j5);
        long j10 = bVar.f23240i;
        v vVar = new v(j, e0.j((bigIntegerValueOf.multiply(BigInteger.valueOf(j10 - j7)).divide(BigInteger.valueOf(bVar.f23243x)).longValue() + j7) - JankRecordStore.FLUSH_INTERVAL_MS, bVar.f23239e, j10 - 1));
        return new t(vVar, vVar);
    }

    @Override // pc.u
    public final long i() {
        b bVar = this.f23237a;
        return (bVar.f23243x * 1000000) / ((long) bVar.f23241v.f23268i);
    }
}
