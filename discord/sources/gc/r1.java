package gc;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class r1 extends o1 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f9832w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f9833x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final gb.a f9834y;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f9835i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f9836v;

    static {
        int i7 = je.e0.f13788a;
        f9832w = Integer.toString(1, 36);
        f9833x = Integer.toString(2, 36);
        f9834y = new gb.a(21);
    }

    public r1(int i7) {
        je.b.f("maxStars must be a positive integer", i7 > 0);
        this.f9835i = i7;
        this.f9836v = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return this.f9835i == r1Var.f9835i && this.f9836v == r1Var.f9836v;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9835i), Float.valueOf(this.f9836v)});
    }

    public r1(int i7, float f2) {
        boolean z5 = false;
        je.b.f("maxStars must be a positive integer", i7 > 0);
        if (f2 >= 0.0f && f2 <= i7) {
            z5 = true;
        }
        je.b.f("starRating is out of range [0, maxStars]", z5);
        this.f9835i = i7;
        this.f9836v = f2;
    }
}
