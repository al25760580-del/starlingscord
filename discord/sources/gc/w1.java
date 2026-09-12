package gc;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class w1 implements g {
    public static final String E;
    public static final String F;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f9926x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f9927y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final md.x0 f9929e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f9930i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int[] f9931v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean[] f9932w;

    static {
        int i7 = je.e0.f13788a;
        f9926x = Integer.toString(0, 36);
        f9927y = Integer.toString(1, 36);
        E = Integer.toString(3, 36);
        F = Integer.toString(4, 36);
    }

    public w1(md.x0 x0Var, boolean z5, int[] iArr, boolean[] zArr) {
        int i7 = x0Var.f15727d;
        this.f9928d = i7;
        boolean z6 = false;
        je.b.g(i7 == iArr.length && i7 == zArr.length);
        this.f9929e = x0Var;
        if (z5 && i7 > 1) {
            z6 = true;
        }
        this.f9930i = z6;
        this.f9931v = (int[]) iArr.clone();
        this.f9932w = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w1.class == obj.getClass()) {
            w1 w1Var = (w1) obj;
            if (this.f9930i == w1Var.f9930i && this.f9929e.equals(w1Var.f9929e) && Arrays.equals(this.f9931v, w1Var.f9931v) && Arrays.equals(this.f9932w, w1Var.f9932w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9932w) + ((Arrays.hashCode(this.f9931v) + (((this.f9929e.hashCode() * 31) + (this.f9930i ? 1 : 0)) * 31)) * 31);
    }
}
