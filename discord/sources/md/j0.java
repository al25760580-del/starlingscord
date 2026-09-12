package md;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements yc.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f15636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f15637e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f15638i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f15639v;

    public j0(long j, int i7) {
        je.b.k(((he.a) this.f15638i) == null);
        this.f15636d = j;
        this.f15637e = j + ((long) i7);
    }

    @Override // yc.f
    public long a(pc.l lVar) {
        long j = this.f15637e;
        if (j < 0) {
            return -1L;
        }
        long j5 = -(j + 2);
        this.f15637e = -1L;
        return j5;
    }

    @Override // yc.f
    public pc.u c() {
        je.b.k(this.f15636d != -1);
        return new pc.o((pc.p) this.f15638i, this.f15636d, 0);
    }

    @Override // yc.f
    public void d(long j) {
        long[] jArr = (long[]) ((e4.r) this.f15639v).f8034e;
        this.f15637e = jArr[je.e0.e(jArr, j, true)];
    }

    public j0(String str, byte[] bArr, long j, long j5) {
        this.f15638i = str;
        this.f15639v = bArr;
        this.f15636d = j;
        this.f15637e = j5;
    }
}
