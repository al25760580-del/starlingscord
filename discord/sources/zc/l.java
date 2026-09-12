package zc;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pc.x f23755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f23761g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f23762h;

    public l(pc.x xVar) {
        this.f23755a = xVar;
    }

    public final void a(byte[] bArr, int i7, int i10) {
        if (this.f23757c) {
            int i11 = this.f23760f;
            int i12 = (i7 + 1) - i11;
            if (i12 >= i10) {
                this.f23760f = (i10 - i7) + i11;
            } else {
                this.f23758d = ((bArr[i12] & 192) >> 6) == 0;
                this.f23757c = false;
            }
        }
    }
}
