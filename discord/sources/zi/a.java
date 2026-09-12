package zi;

import f0.e;
import gs.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f24011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f24012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f24013g;

    public a(String str, int i7, String str2, String str3, long j, long j5, String str4) {
        this.f24007a = str;
        this.f24008b = i7;
        this.f24009c = str2;
        this.f24010d = str3;
        this.f24011e = j;
        this.f24012f = j5;
        this.f24013g = str4;
    }

    public final o a() {
        o oVar = new o();
        oVar.f10247c = this.f24007a;
        oVar.f10246b = this.f24008b;
        oVar.f10248d = this.f24009c;
        oVar.f10249e = this.f24010d;
        oVar.f10250f = Long.valueOf(this.f24011e);
        oVar.f10251g = Long.valueOf(this.f24012f);
        oVar.f10252h = this.f24013g;
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = aVar.f24013g;
        String str2 = aVar.f24010d;
        String str3 = aVar.f24009c;
        String str4 = aVar.f24007a;
        String str5 = this.f24007a;
        if (str5 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str5.equals(str4)) {
            return false;
        }
        if (!e.a(this.f24008b, aVar.f24008b)) {
            return false;
        }
        String str6 = this.f24009c;
        if (str6 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str6.equals(str3)) {
            return false;
        }
        String str7 = this.f24010d;
        if (str7 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str7.equals(str2)) {
            return false;
        }
        if (this.f24011e != aVar.f24011e || this.f24012f != aVar.f24012f) {
            return false;
        }
        String str8 = this.f24013g;
        if (str8 == null) {
            return str == null;
        }
        return str8.equals(str);
    }

    public final int hashCode() {
        String str = this.f24007a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ e.b(this.f24008b)) * 1000003;
        String str2 = this.f24009c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f24010d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f24011e;
        int i7 = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j5 = this.f24012f;
        int i10 = (i7 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        String str4 = this.f24013g;
        return (str4 != null ? str4.hashCode() : 0) ^ i10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f24007a);
        sb2.append(", registrationStatus=");
        int i7 = this.f24008b;
        if (i7 == 1) {
            str = "ATTEMPT_MIGRATION";
        } else if (i7 == 2) {
            str = "NOT_GENERATED";
        } else if (i7 == 3) {
            str = "UNREGISTERED";
        } else if (i7 != 4) {
            str = i7 != 5 ? "null" : "REGISTER_ERROR";
        } else {
            str = "REGISTERED";
        }
        sb2.append(str);
        sb2.append(", authToken=");
        sb2.append(this.f24009c);
        sb2.append(", refreshToken=");
        sb2.append(this.f24010d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f24011e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f24012f);
        sb2.append(", fisError=");
        return com.discord.chat.presentation.list.a.k(sb2, this.f24013g, "}");
    }
}
