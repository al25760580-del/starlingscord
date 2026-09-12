package gc;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final md.s f9917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f9923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f9924h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f9925i;

    public w0(md.s sVar, long j, long j5, long j7, long j10, boolean z5, boolean z6, boolean z7, boolean z10) {
        boolean z11 = true;
        je.b.g(!z10 || z6);
        je.b.g(!z7 || z6);
        if (z5 && (z6 || z7 || z10)) {
            z11 = false;
        }
        je.b.g(z11);
        this.f9917a = sVar;
        this.f9918b = j;
        this.f9919c = j5;
        this.f9920d = j7;
        this.f9921e = j10;
        this.f9922f = z5;
        this.f9923g = z6;
        this.f9924h = z7;
        this.f9925i = z10;
    }

    public final w0 a(long j) {
        if (j == this.f9919c) {
            return this;
        }
        return new w0(this.f9917a, this.f9918b, j, this.f9920d, this.f9921e, this.f9922f, this.f9923g, this.f9924h, this.f9925i);
    }

    public final w0 b(long j) {
        if (j == this.f9918b) {
            return this;
        }
        return new w0(this.f9917a, j, this.f9919c, this.f9920d, this.f9921e, this.f9922f, this.f9923g, this.f9924h, this.f9925i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w0.class == obj.getClass()) {
            w0 w0Var = (w0) obj;
            if (this.f9918b == w0Var.f9918b && this.f9919c == w0Var.f9919c && this.f9920d == w0Var.f9920d && this.f9921e == w0Var.f9921e && this.f9922f == w0Var.f9922f && this.f9923g == w0Var.f9923g && this.f9924h == w0Var.f9924h && this.f9925i == w0Var.f9925i && je.e0.a(this.f9917a, w0Var.f9917a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f9917a.hashCode() + 527) * 31) + ((int) this.f9918b)) * 31) + ((int) this.f9919c)) * 31) + ((int) this.f9920d)) * 31) + ((int) this.f9921e)) * 31) + (this.f9922f ? 1 : 0)) * 31) + (this.f9923g ? 1 : 0)) * 31) + (this.f9924h ? 1 : 0)) * 31) + (this.f9925i ? 1 : 0);
    }
}
