package wb;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22078b;

    public a(int i7, long j) {
        if (i7 == 0) {
            throw new NullPointerException("Null status");
        }
        this.f22077a = i7;
        this.f22078b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f0.e.a(this.f22077a, aVar.f22077a) && this.f22078b == aVar.f22078b;
    }

    public final int hashCode() {
        int iB = (f0.e.b(this.f22077a) ^ 1000003) * 1000003;
        long j = this.f22078b;
        return iB ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        int i7 = this.f22077a;
        if (i7 == 1) {
            str = "OK";
        } else if (i7 == 2) {
            str = "TRANSIENT_ERROR";
        } else if (i7 != 3) {
            str = i7 != 4 ? "null" : "INVALID_PAYLOAD";
        } else {
            str = "FATAL_ERROR";
        }
        sb2.append(str);
        sb2.append(", nextRequestWaitMillis=");
        return a3.e.n(sb2, this.f22078b, "}");
    }
}
