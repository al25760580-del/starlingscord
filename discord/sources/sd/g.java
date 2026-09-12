package sd;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g implements Comparable {
    public final String E;
    public final long F;
    public final long G;
    public final boolean H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f19861e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f19862i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f19863v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f19864w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final mc.i f19865x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f19866y;

    public g(String str, f fVar, long j, int i7, long j5, mc.i iVar, String str2, String str3, long j7, long j10, boolean z5) {
        this.f19860d = str;
        this.f19861e = fVar;
        this.f19862i = j;
        this.f19863v = i7;
        this.f19864w = j5;
        this.f19865x = iVar;
        this.f19866y = str2;
        this.E = str3;
        this.F = j7;
        this.G = j10;
        this.H = z5;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l6 = (Long) obj;
        long jLongValue = l6.longValue();
        long j = this.f19864w;
        if (j > jLongValue) {
            return 1;
        }
        return j < l6.longValue() ? -1 : 0;
    }
}
