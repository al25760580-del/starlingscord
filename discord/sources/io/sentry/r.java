package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements b1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f13089e;

    public /* synthetic */ r(int i7, Object obj) {
        this.f13088d = i7;
        this.f13089e = obj;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        switch (this.f13088d) {
            case 0:
                s.f13142a.set((x0) this.f13089e);
                break;
            default:
                ((io.sentry.util.a) this.f13089e).unlock();
                break;
        }
    }
}
