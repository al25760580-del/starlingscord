package aj;

import f0.e;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f619c;

    public b(String str, long j, int i7) {
        this.f617a = str;
        this.f618b = j;
        this.f619c = i7;
    }

    public static a1.d a() {
        a1.d dVar = new a1.d(2, (byte) 0);
        dVar.f19v = 0L;
        return dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        int i7 = bVar.f619c;
        String str = bVar.f617a;
        String str2 = this.f617a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f618b != bVar.f618b) {
            return false;
        }
        int i10 = this.f619c;
        if (i10 == 0) {
            return i7 == 0;
        }
        return e.a(i10, i7);
    }

    public final int hashCode() {
        String str = this.f617a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.f618b;
        int i7 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        int i10 = this.f619c;
        return (i10 != 0 ? e.b(i10) : 0) ^ i7;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TokenResult{token=");
        sb2.append(this.f617a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f618b);
        sb2.append(", responseCode=");
        int i7 = this.f619c;
        if (i7 == 1) {
            str = "OK";
        } else if (i7 != 2) {
            str = i7 != 3 ? "null" : "AUTH_ERROR";
        } else {
            str = "BAD_CONFIG";
        }
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}
