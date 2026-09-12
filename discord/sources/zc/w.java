package zc;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final je.b0 f23884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final je.w f23885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f23888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f23889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f23890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f23891i;

    public w(int i7) {
        this.f23883a = i7;
        switch (i7) {
            case 1:
                this.f23884b = new je.b0(0L);
                this.f23889g = -9223372036854775807L;
                this.f23890h = -9223372036854775807L;
                this.f23891i = -9223372036854775807L;
                this.f23885c = new je.w();
                break;
            default:
                this.f23884b = new je.b0(0L);
                this.f23889g = -9223372036854775807L;
                this.f23890h = -9223372036854775807L;
                this.f23891i = -9223372036854775807L;
                this.f23885c = new je.w();
                break;
        }
    }

    public static int b(byte[] bArr, int i7) {
        return (bArr[i7 + 3] & 255) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7 + 2] & 255) << 8);
    }

    public static long c(je.w wVar) {
        int i7 = wVar.f13861b;
        if (wVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        wVar.e(bArr, 0, 9);
        wVar.F(i7);
        byte b10 = bArr[0];
        if ((b10 & 196) == 68) {
            byte b11 = bArr[2];
            if ((b11 & 4) == 4) {
                byte b12 = bArr[4];
                if ((b12 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b10;
                    long j5 = b11;
                    return ((j5 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j5 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b12) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(pc.l lVar) {
        switch (this.f23883a) {
            case 0:
                byte[] bArr = je.e0.f13793f;
                je.w wVar = this.f23885c;
                wVar.getClass();
                wVar.D(bArr, bArr.length);
                this.f23886d = true;
                lVar.t();
                break;
            default:
                byte[] bArr2 = je.e0.f13793f;
                je.w wVar2 = this.f23885c;
                wVar2.getClass();
                wVar2.D(bArr2, bArr2.length);
                this.f23886d = true;
                lVar.t();
                break;
        }
    }
}
