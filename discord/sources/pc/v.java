package pc;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f17929c = new v(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17931b;

    public v(long j, long j5) {
        this.f17930a = j;
        this.f17931b = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            if (this.f17930a == vVar.f17930a && this.f17931b == vVar.f17931b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f17930a) * 31) + ((int) this.f17931b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f17930a);
        sb2.append(", position=");
        return a3.e.n(sb2, this.f17931b, "]");
    }
}
