package gc;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 implements g {
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final gb.a I;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final o0 f9800x = new o0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f9801y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9803e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f9804i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f9805v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float f9806w;

    static {
        int i7 = je.e0.f13788a;
        f9801y = Integer.toString(0, 36);
        E = Integer.toString(1, 36);
        F = Integer.toString(2, 36);
        G = Integer.toString(3, 36);
        H = Integer.toString(4, 36);
        I = new gb.a(14);
    }

    public o0(long j, long j5, long j7, float f2, float f7) {
        this.f9802d = j;
        this.f9803e = j5;
        this.f9804i = j7;
        this.f9805v = f2;
        this.f9806w = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f9802d == o0Var.f9802d && this.f9803e == o0Var.f9803e && this.f9804i == o0Var.f9804i && this.f9805v == o0Var.f9805v && this.f9806w == o0Var.f9806w;
    }

    public final int hashCode() {
        long j = this.f9802d;
        long j5 = this.f9803e;
        int i7 = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j7 = this.f9804i;
        int i10 = (i7 + ((int) ((j7 >>> 32) ^ j7))) * 31;
        float f2 = this.f9805v;
        int iFloatToIntBits = (i10 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        float f7 = this.f9806w;
        return iFloatToIntBits + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0);
    }
}
