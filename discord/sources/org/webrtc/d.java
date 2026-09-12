package org.webrtc;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17669e;

    public /* synthetic */ d(int i7, Object obj) {
        this.f17668d = i7;
        this.f17669e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17668d) {
            case 0:
                ((EglBase10Impl.EglConnection) this.f17669e).lambda$new$0();
                break;
            case 1:
                ((EglBase14Impl.EglConnection) this.f17669e).lambda$new$0();
                break;
            case 2:
                ((EglRenderer) this.f17669e).renderFrameOnRenderThread();
                break;
            case 3:
                ((EglBase.EglConnection) this.f17669e).release();
                break;
            case 4:
                ((VideoFrame.I420Buffer) this.f17669e).release();
                break;
            case 5:
                ((ScreenCapturerAndroid) this.f17669e).updateVirtualDisplay();
                break;
            case 6:
                ((CountDownLatch) this.f17669e).countDown();
                break;
            default:
                ((VideoFileRenderer) this.f17669e).lambda$release$3();
                break;
        }
    }
}
