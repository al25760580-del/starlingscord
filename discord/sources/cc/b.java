package cc;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vb.i f3571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vb.h f3572c;

    public b(long j, vb.i iVar, vb.h hVar) {
        this.f3570a = j;
        this.f3571b = iVar;
        this.f3572c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3570a == bVar.f3570a && this.f3571b.equals(bVar.f3571b) && this.f3572c.equals(bVar.f3572c);
    }

    public final int hashCode() {
        long j = this.f3570a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f3571b.hashCode()) * 1000003) ^ this.f3572c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f3570a + ", transportContext=" + this.f3571b + ", event=" + this.f3572c + "}";
    }
}
