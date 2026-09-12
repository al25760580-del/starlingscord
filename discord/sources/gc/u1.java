package gc;

import com.facebook.imageutils.JfifUtil;

/* JADX INFO: loaded from: classes3.dex */
public final class u1 implements g {
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f9886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f9887e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9888i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f9889v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f9890w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9891x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public nd.b f9892y = nd.b.f16555x;

    static {
        int i7 = je.e0.f13788a;
        E = Integer.toString(0, 36);
        F = Integer.toString(1, 36);
        G = Integer.toString(2, 36);
        H = Integer.toString(3, 36);
        I = Integer.toString(4, 36);
    }

    public final long a(int i7, int i10) {
        nd.a aVarA = this.f9892y.a(i7);
        if (aVarA.f16549e != -1) {
            return aVarA.f16553x[i10];
        }
        return -9223372036854775807L;
    }

    public final int b(long j) {
        nd.a aVarA;
        int i7;
        nd.b bVar = this.f9892y;
        long j5 = this.f9889v;
        int i10 = bVar.f16557d;
        if (j != Long.MIN_VALUE && (j5 == -9223372036854775807L || j < j5)) {
            int i11 = bVar.f16560v;
            while (i11 < i10 && ((bVar.a(i11).f16548d != Long.MIN_VALUE && bVar.a(i11).f16548d <= j) || ((i7 = (aVarA = bVar.a(i11)).f16549e) != -1 && aVarA.a(-1) >= i7))) {
                i11++;
            }
            if (i11 < i10) {
                return i11;
            }
        }
        return -1;
    }

    public final int c(long j) {
        nd.b bVar = this.f9892y;
        long j5 = this.f9889v;
        int i7 = bVar.f16557d - 1;
        int i10 = i7 - (bVar.b(i7) ? 1 : 0);
        while (i10 >= 0 && j != Long.MIN_VALUE) {
            nd.a aVarA = bVar.a(i10);
            long j7 = aVarA.f16548d;
            if (j7 != Long.MIN_VALUE) {
                if (j >= j7) {
                    break;
                }
                i10--;
            } else {
                if (j5 != -9223372036854775807L && ((!aVarA.E || aVarA.f16549e != -1) && j >= j5)) {
                    break;
                }
                i10--;
            }
        }
        if (i10 >= 0) {
            nd.a aVarA2 = bVar.a(i10);
            int i11 = aVarA2.f16549e;
            if (i11 != -1) {
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = aVarA2.f16552w[i12];
                    if (i13 != 0 && i13 != 1) {
                    }
                }
            }
            return i10;
        }
        return -1;
    }

    public final long d(int i7) {
        return this.f9892y.a(i7).f16548d;
    }

    public final int e(int i7, int i10) {
        nd.a aVarA = this.f9892y.a(i7);
        if (aVarA.f16549e != -1) {
            return aVarA.f16552w[i10];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u1.class.equals(obj.getClass())) {
            u1 u1Var = (u1) obj;
            if (je.e0.a(this.f9886d, u1Var.f9886d) && je.e0.a(this.f9887e, u1Var.f9887e) && this.f9888i == u1Var.f9888i && this.f9889v == u1Var.f9889v && this.f9890w == u1Var.f9890w && this.f9891x == u1Var.f9891x && je.e0.a(this.f9892y, u1Var.f9892y)) {
                return true;
            }
        }
        return false;
    }

    public final int f(int i7) {
        return this.f9892y.a(i7).a(-1);
    }

    public final boolean g(int i7) {
        nd.b bVar = this.f9892y;
        return i7 == bVar.f16557d - 1 && bVar.b(i7);
    }

    public final boolean h(int i7) {
        return this.f9892y.a(i7).E;
    }

    public final int hashCode() {
        Object obj = this.f9886d;
        int iHashCode = (JfifUtil.MARKER_EOI + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f9887e;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f9888i) * 31;
        long j = this.f9889v;
        int i7 = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j5 = this.f9890w;
        return this.f9892y.hashCode() + ((((i7 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + (this.f9891x ? 1 : 0)) * 31);
    }

    public final void i(Object obj, Object obj2, int i7, long j, long j5, nd.b bVar, boolean z5) {
        this.f9886d = obj;
        this.f9887e = obj2;
        this.f9888i = i7;
        this.f9889v = j;
        this.f9890w = j5;
        this.f9892y = bVar;
        this.f9891x = z5;
    }
}
