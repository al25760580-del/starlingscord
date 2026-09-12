package md;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15618b;

    public f0(int i7, boolean z5) {
        this.f15617a = i7;
        this.f15618b = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f15617a == f0Var.f15617a && this.f15618b == f0Var.f15618b;
    }

    public final int hashCode() {
        return (this.f15617a * 31) + (this.f15618b ? 1 : 0);
    }
}
