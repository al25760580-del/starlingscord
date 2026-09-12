package qd;

import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18754e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f18750a = str;
        this.f18751b = str2;
        this.f18752c = str3;
        this.f18753d = str4;
        this.f18754e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return e0.a(this.f18750a, iVar.f18750a) && e0.a(this.f18751b, iVar.f18751b) && e0.a(this.f18752c, iVar.f18752c) && e0.a(this.f18753d, iVar.f18753d) && e0.a(this.f18754e, iVar.f18754e);
    }

    public final int hashCode() {
        String str = this.f18750a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f18751b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f18752c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f18753d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f18754e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
