package ag;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends j1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f523d;

    public f1(long j) {
        this.f523d = j;
    }

    @Override // ag.j1
    public final int a() {
        return j1.d(this.f523d >= 0 ? (byte) 0 : (byte) 32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        j1 j1Var = (j1) obj;
        return a() != j1Var.a() ? a() - j1Var.a() : Long.compare(Math.abs(this.f523d), Math.abs(((f1) j1Var).f523d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && f1.class == obj.getClass() && this.f523d == ((f1) obj).f523d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), Long.valueOf(this.f523d)});
    }

    public final String toString() {
        return Long.toString(this.f523d);
    }
}
