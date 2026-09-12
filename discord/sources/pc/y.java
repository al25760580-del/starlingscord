package pc;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f17936a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17942g;

    public final void a(x xVar, w wVar) {
        if (this.f17938c > 0) {
            xVar.c(this.f17939d, this.f17940e, this.f17941f, this.f17942g, wVar);
            this.f17938c = 0;
        }
    }

    public final void b(x xVar, long j, int i7, int i10, int i11, w wVar) {
        if (!(this.f17942g <= i10 + i11)) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.f17937b) {
            int i12 = this.f17938c;
            int i13 = i12 + 1;
            this.f17938c = i13;
            if (i12 == 0) {
                this.f17939d = j;
                this.f17940e = i7;
                this.f17941f = 0;
            }
            this.f17941f += i10;
            this.f17942g = i11;
            if (i13 >= 16) {
                a(xVar, wVar);
            }
        }
    }

    public final void c(l lVar) {
        if (this.f17937b) {
            return;
        }
        byte[] bArr = this.f17936a;
        int i7 = 0;
        lVar.C(bArr, 0, 10);
        lVar.t();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                i7 = 40 << ((bArr[((b10 & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i7 == 0) {
            return;
        }
        this.f17937b = true;
    }
}
