package aj;

import f0.e;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f616e;

    public a(String str, String str2, String str3, b bVar, int i7) {
        this.f612a = str;
        this.f613b = str2;
        this.f614c = str3;
        this.f615d = bVar;
        this.f616e = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        int i7 = aVar.f616e;
        b bVar = aVar.f615d;
        String str = aVar.f614c;
        String str2 = aVar.f613b;
        String str3 = aVar.f612a;
        String str4 = this.f612a;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = this.f613b;
        if (str5 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str5.equals(str2)) {
            return false;
        }
        String str6 = this.f614c;
        if (str6 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str6.equals(str)) {
            return false;
        }
        b bVar2 = this.f615d;
        if (bVar2 == null) {
            if (bVar != null) {
                return false;
            }
        } else if (!bVar2.equals(bVar)) {
            return false;
        }
        int i10 = this.f616e;
        if (i10 == 0) {
            return i7 == 0;
        }
        return e.a(i10, i7);
    }

    public final int hashCode() {
        String str = this.f612a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f613b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f614c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        b bVar = this.f615d;
        int iHashCode4 = (iHashCode3 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        int i7 = this.f616e;
        return (i7 != 0 ? e.b(i7) : 0) ^ iHashCode4;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("InstallationResponse{uri=");
        sb2.append(this.f612a);
        sb2.append(", fid=");
        sb2.append(this.f613b);
        sb2.append(", refreshToken=");
        sb2.append(this.f614c);
        sb2.append(", authToken=");
        sb2.append(this.f615d);
        sb2.append(", responseCode=");
        int i7 = this.f616e;
        if (i7 != 1) {
            str = i7 != 2 ? "null" : "BAD_CONFIG";
        } else {
            str = "OK";
        }
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}
