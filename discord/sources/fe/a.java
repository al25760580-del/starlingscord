package fe;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9065b;

    public a(long j, long j5) {
        this.f9064a = j;
        this.f9065b = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f9064a == aVar.f9064a && this.f9065b == aVar.f9065b;
    }

    public final int hashCode() {
        return (((int) this.f9064a) * 31) + ((int) this.f9065b);
    }
}
