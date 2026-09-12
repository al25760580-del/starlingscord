package io.sentry.cache.tape;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f12550c = new f(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12552b;

    public f(long j, int i7) {
        this.f12551a = j;
        this.f12552b = i7;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f.class.getSimpleName());
        sb2.append("[position=");
        sb2.append(this.f12551a);
        sb2.append(", length=");
        return kk.b.l(sb2, this.f12552b, "]");
    }
}
