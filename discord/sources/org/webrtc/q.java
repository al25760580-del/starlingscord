package org.webrtc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SurfaceTextureHelper f17702e;

    public /* synthetic */ q(SurfaceTextureHelper surfaceTextureHelper, int i7) {
        this.f17701d = i7;
        this.f17702e = surfaceTextureHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17701d) {
            case 0:
                this.f17702e.lambda$stopListening$1();
                break;
            case 1:
                this.f17702e.lambda$dispose$6();
                break;
            case 2:
                this.f17702e.lambda$returnTextureFrame$5();
                break;
            default:
                this.f17702e.lambda$forceFrame$3();
                break;
        }
    }
}
