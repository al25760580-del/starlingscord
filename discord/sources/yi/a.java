package yi;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23353c;

    public a(long j, long j5, String str) {
        this.f23351a = str;
        this.f23352b = j;
        this.f23353c = j5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f23351a.equals(aVar.f23351a) && this.f23352b == aVar.f23352b && this.f23353c == aVar.f23353c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f23351a.hashCode() ^ 1000003) * 1000003;
        long j = this.f23352b;
        long j5 = this.f23353c;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j5 ^ (j5 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f23351a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f23352b);
        sb2.append(", tokenCreationTimestamp=");
        return a3.e.n(sb2, this.f23353c, "}");
    }
}
