package qd;

import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18741c;

    public f(String str, String str2, String str3) {
        this.f18739a = str;
        this.f18740b = str2;
        this.f18741c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (e0.a(this.f18739a, fVar.f18739a) && e0.a(this.f18740b, fVar.f18740b) && e0.a(this.f18741c, fVar.f18741c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f18739a.hashCode() * 31;
        String str = this.f18740b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f18741c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
