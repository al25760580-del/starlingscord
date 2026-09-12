package h5;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10375b;

    public q(int i7, int i10) {
        this.f10374a = i7;
        this.f10375b = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f10374a == qVar.f10374a && this.f10375b == qVar.f10375b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f10375b;
        return ((i7 >>> 16) | (i7 << 16)) ^ this.f10374a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(this.f10374a);
        sb2.append("; ");
        return kk.b.l(sb2, this.f10375b, ")");
    }
}
