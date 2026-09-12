package ji;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13882c;

    public a(long j, long j5, long j7) {
        this.f13880a = j;
        this.f13881b = j5;
        this.f13882c = j7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f13880a == aVar.f13880a && this.f13881b == aVar.f13881b && this.f13882c == aVar.f13882c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f13880a;
        long j5 = this.f13881b;
        int i7 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        long j7 = this.f13882c;
        return i7 ^ ((int) ((j7 >>> 32) ^ j7));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f13880a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f13881b);
        sb2.append(", uptimeMillis=");
        return a3.e.n(sb2, this.f13882c, "}");
    }
}
