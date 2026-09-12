package je;

/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f13863c = new x(-1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13865b;

    static {
        new x(0, 0);
    }

    public x(int i7, int i10) {
        b.g((i7 == -1 || i7 >= 0) && (i10 == -1 || i10 >= 0));
        this.f13864a = i7;
        this.f13865b = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f13864a == xVar.f13864a && this.f13865b == xVar.f13865b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f13864a;
        return ((i7 >>> 16) | (i7 << 16)) ^ this.f13865b;
    }

    public final String toString() {
        return this.f13864a + "x" + this.f13865b;
    }
}
