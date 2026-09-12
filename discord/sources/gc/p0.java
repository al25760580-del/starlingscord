package gc;

import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 implements g {
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final gb.a L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri f9811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9812e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n0 f9813i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final i0 f9814v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f9815w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f9816x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ei.e0 f9817y;

    static {
        int i7 = je.e0.f13788a;
        E = Integer.toString(0, 36);
        F = Integer.toString(1, 36);
        G = Integer.toString(2, 36);
        H = Integer.toString(3, 36);
        I = Integer.toString(4, 36);
        J = Integer.toString(5, 36);
        K = Integer.toString(6, 36);
        L = new gb.a(15);
    }

    public p0(Uri uri, String str, n0 n0Var, i0 i0Var, List list, String str2, ei.e0 e0Var) {
        this.f9811d = uri;
        this.f9812e = str;
        this.f9813i = n0Var;
        this.f9814v = i0Var;
        this.f9815w = list;
        this.f9816x = str2;
        this.f9817y = e0Var;
        ei.c0 c0Var = ei.e0.f8303e;
        ei.p.c(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i7 = 0;
        int i10 = 0;
        boolean z5 = false;
        while (i7 < e0Var.size()) {
            t0 t0Var = (t0) e0Var.get(i7);
            s0 s0Var = new s0();
            s0Var.f9842d = t0Var.f9853d;
            s0Var.f9839a = t0Var.f9854e;
            s0Var.f9843e = t0Var.f9855i;
            s0Var.f9840b = t0Var.f9856v;
            s0Var.f9841c = t0Var.f9857w;
            s0Var.f9844f = t0Var.f9858x;
            s0Var.f9845g = t0Var.f9859y;
            r0 r0Var = new r0(s0Var);
            int i11 = i10 + 1;
            if (objArrCopyOf.length < i11) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, ei.y.d(objArrCopyOf.length, i11));
            } else {
                if (z5) {
                    objArrCopyOf = (Object[]) objArrCopyOf.clone();
                }
                objArrCopyOf[i10] = r0Var;
                i7++;
                i10++;
            }
            z5 = false;
            objArrCopyOf[i10] = r0Var;
            i7++;
            i10++;
        }
        ei.e0.j(i10, objArrCopyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return this.f9811d.equals(p0Var.f9811d) && je.e0.a(this.f9812e, p0Var.f9812e) && je.e0.a(this.f9813i, p0Var.f9813i) && je.e0.a(this.f9814v, p0Var.f9814v) && this.f9815w.equals(p0Var.f9815w) && je.e0.a(this.f9816x, p0Var.f9816x) && this.f9817y.equals(p0Var.f9817y);
    }

    public final int hashCode() {
        int iHashCode = this.f9811d.hashCode() * 31;
        String str = this.f9812e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        n0 n0Var = this.f9813i;
        int iHashCode3 = (iHashCode2 + (n0Var == null ? 0 : n0Var.hashCode())) * 31;
        i0 i0Var = this.f9814v;
        int iHashCode4 = (this.f9815w.hashCode() + ((iHashCode3 + (i0Var == null ? 0 : i0Var.hashCode())) * 31)) * 31;
        String str2 = this.f9816x;
        return (this.f9817y.hashCode() + ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
    }
}
