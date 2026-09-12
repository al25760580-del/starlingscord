package d0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f7518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f7519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f7520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f7521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f7522e = 0;

    static {
        long j = 3;
        long j5 = j << 32;
        f7518a = (((long) 0) & 4294967295L) | j5;
        f7519b = (((long) 1) & 4294967295L) | j5;
        f7520c = j5 | (((long) 2) & 4294967295L);
        f7521d = (j & 4294967295L) | (((long) 4) << 32);
    }

    public static final boolean a(long j, long j5) {
        return j == j5;
    }
}
