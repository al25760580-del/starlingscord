package ag;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 extends j1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f513d;

    public c1(boolean z5) {
        this.f513d = z5;
    }

    @Override // ag.j1
    public final int a() {
        return j1.d((byte) -32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        j1 j1Var = (j1) obj;
        int iA = j1Var.a();
        int iD = j1.d((byte) -32);
        if (iD != iA) {
            return iD - j1Var.a();
        }
        return (true != this.f513d ? 20 : 21) - (true != ((c1) j1Var).f513d ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && c1.class == obj.getClass() && this.f513d == ((c1) obj).f513d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(j1.d((byte) -32)), Boolean.valueOf(this.f513d)});
    }

    public final String toString() {
        return Boolean.toString(this.f513d);
    }
}
