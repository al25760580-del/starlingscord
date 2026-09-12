package org.webrtc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17692e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f17693i;

    public /* synthetic */ k(int i7, int i10, Object obj) {
        this.f17691d = i10;
        this.f17693i = obj;
        this.f17692e = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17691d) {
            case 0:
                ((HardwareVideoEncoder) this.f17693i).lambda$deliverEncodedImage$0(this.f17692e);
                break;
            default:
                ((SurfaceTextureHelper) this.f17693i).lambda$setFrameRotation$4(this.f17692e);
                break;
        }
    }
}
