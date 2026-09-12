package org.webrtc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ EglThread f17690e;

    public /* synthetic */ j(EglThread eglThread, int i7) {
        this.f17689d = i7;
        this.f17690e = eglThread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17689d) {
            case 0:
                this.f17690e.lambda$onRenderWindowOpen$2();
                break;
            default:
                this.f17690e.lambda$onRenderWindowClose$3();
                break;
        }
    }
}
