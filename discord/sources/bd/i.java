package bd;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f3165c;

    public synchronized long a() {
        return this.f3164b;
    }

    public synchronized void b(long j, long j5) {
        if (this.f3163a) {
            this.f3164b += j;
            this.f3165c += j5;
        }
    }
}
