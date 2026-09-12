package yr;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f23539b;

    public f0(Class cls, String str) {
        this.f23538a = str;
        this.f23539b = cls;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            if (this.f23538a.equals(f0Var.f23538a) && this.f23539b.equals(f0Var.f23539b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f23538a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        a3.e.w(this.f23539b, sb2, "@");
        sb2.append(this.f23538a);
        return sb2.toString();
    }
}
