package ub;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f20998a;

    public j(h hVar) {
        this.f20998a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        Object obj2 = p.f21015d;
        if (obj2.equals(obj2)) {
            return this.f20998a.equals(((j) qVar).f20998a);
        }
        return false;
    }

    public final int hashCode() {
        return ((p.f21015d.hashCode() ^ 1000003) * 1000003) ^ this.f20998a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f21015d + ", androidClientInfo=" + this.f20998a + "}";
    }
}
