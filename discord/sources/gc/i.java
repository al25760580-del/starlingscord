package gc;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f9683c = -9223372036854775807L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9684d = -9223372036854775807L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f9686f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f9687g = -9223372036854775807L;
    public float j = 0.97f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f9689i = 1.03f;
    public float k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f9690l = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f9685e = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f9688h = -9223372036854775807L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f9691m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f9692n = -9223372036854775807L;

    public i(long j, long j5) {
        this.f9681a = j;
        this.f9682b = j5;
    }

    public final void a() {
        long j = this.f9683c;
        if (j != -9223372036854775807L) {
            long j5 = this.f9684d;
            if (j5 != -9223372036854775807L) {
                j = j5;
            }
            long j7 = this.f9686f;
            if (j7 != -9223372036854775807L && j < j7) {
                j = j7;
            }
            long j10 = this.f9687g;
            if (j10 != -9223372036854775807L && j > j10) {
                j = j10;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f9685e == j) {
            return;
        }
        this.f9685e = j;
        this.f9688h = j;
        this.f9691m = -9223372036854775807L;
        this.f9692n = -9223372036854775807L;
        this.f9690l = -9223372036854775807L;
    }
}
