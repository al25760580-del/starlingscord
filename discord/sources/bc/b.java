package bc;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ec.a f3089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f3090b;

    public b(ec.a aVar, HashMap map) {
        this.f3089a = aVar;
        this.f3090b = map;
    }

    public final long a(sb.d dVar, long j, int i7) {
        long jB = j - this.f3089a.b();
        c cVar = (c) this.f3090b.get(dVar);
        long j5 = cVar.f3091a;
        int i10 = i7 - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i10) * j5 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j5 > 1 ? j5 : 2L) * ((long) i10)))), jB), cVar.f3092b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3089a.equals(bVar.f3089a) && this.f3090b.equals(bVar.f3090b);
    }

    public final int hashCode() {
        return ((this.f3089a.hashCode() ^ 1000003) * 1000003) ^ this.f3090b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f3089a + ", values=" + this.f3090b + "}";
    }
}
