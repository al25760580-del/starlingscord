package org.webrtc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RenderSynchronizer f17699e;

    public /* synthetic */ o(RenderSynchronizer renderSynchronizer, int i7) {
        this.f17698d = i7;
        this.f17699e = renderSynchronizer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17698d) {
            case 0:
                this.f17699e.lambda$registerListener$1();
                break;
            default:
                this.f17699e.lambda$new$0();
                break;
        }
    }
}
