package com.facebook.react.devsupport;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DevSupportManagerBase f5197e;

    public /* synthetic */ k(DevSupportManagerBase devSupportManagerBase, int i7) {
        this.f5196d = i7;
        this.f5197e = devSupportManagerBase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5196d) {
            case 0:
                DevSupportManagerBase.showDevOptionsDialog$lambda$12$lambda$11(this.f5197e);
                break;
            case 1:
                DevSupportManagerBase.toggleElementInspector$lambda$36(this.f5197e);
                break;
            case 2:
                this.f5197e.reload();
                break;
            case 3:
                DevSupportManagerBase.access$hideSplitBundleDevLoadingView(this.f5197e);
                break;
            case 4:
                DevSupportManagerBase.access$hideSplitBundleDevLoadingView(this.f5197e);
                break;
            case 5:
                this.f5197e.handleReloadJS();
                break;
            default:
                this.f5197e.showDevOptionsDialog();
                break;
        }
    }
}
