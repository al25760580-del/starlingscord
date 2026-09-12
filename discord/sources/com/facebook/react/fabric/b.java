package com.facebook.react.fabric;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5221e;

    public /* synthetic */ b(int i7, Object obj) {
        this.f5220d = i7;
        this.f5221e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5220d) {
            case 0:
                ((FabricUIManager.MountItemDispatchListener) this.f5221e).lambda$didMountItems$0();
                break;
            default:
                ViewTransitionSnapshotManager.clearPendingSnapshots$lambda$6((ViewTransitionSnapshotManager) this.f5221e);
                break;
        }
    }
}
