package qd;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18774b;

    public q(long j, long j5) {
        this.f18773a = j;
        this.f18774b = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f18773a == qVar.f18773a && this.f18774b == qVar.f18774b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f18773a) * 31) + ((int) this.f18774b);
    }
}
