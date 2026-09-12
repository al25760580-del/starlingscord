package ci;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3724b;

    public t(int i7, long j) {
        this.f3723a = i7;
        this.f3724b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f3723a == tVar.f3723a && this.f3724b == tVar.f3724b;
    }

    public final int hashCode() {
        long j = this.f3724b;
        return ((int) ((j >>> 32) ^ j)) ^ ((this.f3723a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.f3723a);
        sb2.append(", eventTimestamp=");
        return a3.e.n(sb2, this.f3724b, "}");
    }
}
