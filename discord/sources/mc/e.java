package mc;

import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f15521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f15522e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15523i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ f f15524v;

    public e(f fVar, n nVar) {
        this.f15524v = fVar;
        this.f15521d = nVar;
    }

    @Override // mc.r
    public final void release() {
        Handler handler = this.f15524v.f15546u;
        handler.getClass();
        je.e0.M(handler, new io.sentry.android.core.p(22, this));
    }
}
