package com.facebook.react.fabric;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewTransitionSnapshotManager f5224e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5225i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f5226v;

    public /* synthetic */ d(ViewTransitionSnapshotManager viewTransitionSnapshotManager, int i7, int i10, int i11) {
        this.f5223d = i11;
        this.f5224e = viewTransitionSnapshotManager;
        this.f5225i = i7;
        this.f5226v = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5223d) {
            case 0:
                ViewTransitionSnapshotManager.setViewSnapshot$lambda$5(this.f5224e, this.f5225i, this.f5226v);
                break;
            default:
                ViewTransitionSnapshotManager.captureViewSnapshot$lambda$1(this.f5224e, this.f5225i, this.f5226v);
                break;
        }
    }
}
