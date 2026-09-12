package gc;

import android.net.Uri;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements g {
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final gb.a N;
    public final byte[] E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final UUID f9785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri f9786e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ei.w0 f9787i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f9788v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f9789w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f9790x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ei.e0 f9791y;

    static {
        int i7 = je.e0.f13788a;
        F = Integer.toString(0, 36);
        G = Integer.toString(1, 36);
        H = Integer.toString(2, 36);
        I = Integer.toString(3, 36);
        J = Integer.toString(4, 36);
        K = Integer.toString(5, 36);
        L = Integer.toString(6, 36);
        M = Integer.toString(7, 36);
        N = new gb.a(13);
    }

    public n0(m0 m0Var) {
        je.b.k((m0Var.f9778f && m0Var.f9774b == null) ? false : true);
        UUID uuid = m0Var.f9773a;
        uuid.getClass();
        this.f9785d = uuid;
        this.f9786e = m0Var.f9774b;
        this.f9787i = m0Var.f9775c;
        this.f9788v = m0Var.f9776d;
        this.f9790x = m0Var.f9778f;
        this.f9789w = m0Var.f9777e;
        this.f9791y = m0Var.f9779g;
        byte[] bArr = m0Var.f9780h;
        this.E = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f9785d.equals(n0Var.f9785d) && je.e0.a(this.f9786e, n0Var.f9786e) && je.e0.a(this.f9787i, n0Var.f9787i) && this.f9788v == n0Var.f9788v && this.f9790x == n0Var.f9790x && this.f9789w == n0Var.f9789w && this.f9791y.equals(n0Var.f9791y) && Arrays.equals(this.E, n0Var.E);
    }

    public final int hashCode() {
        int iHashCode = this.f9785d.hashCode() * 31;
        Uri uri = this.f9786e;
        return Arrays.hashCode(this.E) + ((this.f9791y.hashCode() + ((((((((this.f9787i.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f9788v ? 1 : 0)) * 31) + (this.f9790x ? 1 : 0)) * 31) + (this.f9789w ? 1 : 0)) * 31)) * 31);
    }
}
