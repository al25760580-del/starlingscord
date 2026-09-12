package wh;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22303a;

    public r(long j) {
        this.f22303a = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof r) && this.f22303a == ((r) obj).f22303a;
    }

    public final int hashCode() {
        long j = this.f22303a;
        return (((int) ((j >>> 32) ^ j)) ^ 1000003) * (-721379959);
    }

    public final String toString() {
        return a3.e.n(new StringBuilder("PrepareIntegrityTokenRequest{cloudProjectNumber="), this.f22303a, ", webViewRequestMode=0, sessionId=null}");
    }
}
