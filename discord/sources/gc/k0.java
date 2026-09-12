package gc;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k0 implements g {
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final gb.a I;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final l0 f9737x = new l0(new j0());

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f9738y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9740e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f9741i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f9742v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f9743w;

    static {
        int i7 = je.e0.f13788a;
        f9738y = Integer.toString(0, 36);
        E = Integer.toString(1, 36);
        F = Integer.toString(2, 36);
        G = Integer.toString(3, 36);
        H = Integer.toString(4, 36);
        I = new gb.a(12);
    }

    public k0(j0 j0Var) {
        this.f9739d = j0Var.f9708a;
        this.f9740e = j0Var.f9709b;
        this.f9741i = j0Var.f9710c;
        this.f9742v = j0Var.f9711d;
        this.f9743w = j0Var.f9712e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f9739d == k0Var.f9739d && this.f9740e == k0Var.f9740e && this.f9741i == k0Var.f9741i && this.f9742v == k0Var.f9742v && this.f9743w == k0Var.f9743w;
    }

    public final int hashCode() {
        long j = this.f9739d;
        int i7 = ((int) (j ^ (j >>> 32))) * 31;
        long j5 = this.f9740e;
        return ((((((i7 + ((int) ((j5 >>> 32) ^ j5))) * 31) + (this.f9741i ? 1 : 0)) * 31) + (this.f9742v ? 1 : 0)) * 31) + (this.f9743w ? 1 : 0);
    }
}
