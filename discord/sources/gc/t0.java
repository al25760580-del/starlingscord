package gc;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public class t0 implements g {
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final gb.a L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri f9853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9854e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f9855i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f9856v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f9857w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f9858x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f9859y;

    static {
        int i7 = je.e0.f13788a;
        E = Integer.toString(0, 36);
        F = Integer.toString(1, 36);
        G = Integer.toString(2, 36);
        H = Integer.toString(3, 36);
        I = Integer.toString(4, 36);
        J = Integer.toString(5, 36);
        K = Integer.toString(6, 36);
        L = new gb.a(17);
    }

    public t0(s0 s0Var) {
        this.f9853d = (Uri) s0Var.f9842d;
        this.f9854e = s0Var.f9839a;
        this.f9855i = (String) s0Var.f9843e;
        this.f9856v = s0Var.f9840b;
        this.f9857w = s0Var.f9841c;
        this.f9858x = (String) s0Var.f9844f;
        this.f9859y = (String) s0Var.f9845g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f9853d.equals(t0Var.f9853d) && je.e0.a(this.f9854e, t0Var.f9854e) && je.e0.a(this.f9855i, t0Var.f9855i) && this.f9856v == t0Var.f9856v && this.f9857w == t0Var.f9857w && je.e0.a(this.f9858x, t0Var.f9858x) && je.e0.a(this.f9859y, t0Var.f9859y);
    }

    public final int hashCode() {
        int iHashCode = this.f9853d.hashCode() * 31;
        String str = this.f9854e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9855i;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f9856v) * 31) + this.f9857w) * 31;
        String str3 = this.f9858x;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f9859y;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
