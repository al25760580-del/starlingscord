package io.sentry.android.core;

/* JADX INFO: loaded from: classes3.dex */
public final class g1 implements Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12195e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f12196i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f12197v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f12198w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f12199x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f12200y;

    public g1(long j) {
        this(j, j, 0L, 0L, false, false, 0L);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f12195e, ((g1) obj).f12195e);
    }

    public g1(long j, long j5, long j7, long j10, boolean z5, boolean z6, long j11) {
        this.f12194d = j;
        this.f12195e = j5;
        this.f12196i = j7;
        this.f12197v = j10;
        this.f12198w = z5;
        this.f12199x = z6;
        this.f12200y = j11;
    }
}
