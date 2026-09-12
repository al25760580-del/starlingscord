package ub;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f21013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f21014b;

    public n(u uVar, t tVar) {
        this.f21013a = uVar;
        this.f21014b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f21013a;
            if (uVar != null ? uVar.equals(((n) vVar).f21013a) : ((n) vVar).f21013a == null) {
                t tVar = this.f21014b;
                if (tVar != null ? tVar.equals(((n) vVar).f21014b) : ((n) vVar).f21014b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        u uVar = this.f21013a;
        int iHashCode = ((uVar == null ? 0 : uVar.hashCode()) ^ 1000003) * 1000003;
        t tVar = this.f21014b;
        return (tVar != null ? tVar.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f21013a + ", mobileSubtype=" + this.f21014b + "}";
    }
}
