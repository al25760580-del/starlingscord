package org.webrtc;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17705e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f17706i;

    public /* synthetic */ s(int i7, Object obj, Object obj2) {
        this.f17704d = i7;
        this.f17705e = obj;
        this.f17706i = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17704d) {
            case 0:
                ((TextureBufferImpl) this.f17705e).lambda$new$0((TextureBufferImpl.RefCountMonitor) this.f17706i);
                break;
            case 1:
                ((EglRenderer) this.f17705e).lambda$releaseEglSurface$4((Runnable) this.f17706i);
                break;
            case 2:
                ((EglRenderer) this.f17705e).lambda$release$0((CountDownLatch) this.f17706i);
                break;
            case 3:
                ((VideoFileRenderer) this.f17705e).lambda$onFrame$0((VideoFrame) this.f17706i);
                break;
            case 4:
                ((VideoFileRenderer) this.f17705e).lambda$release$2((CountDownLatch) this.f17706i);
                break;
            default:
                ((VideoSource) this.f17705e).lambda$setVideoProcessor$0((VideoFrame) this.f17706i);
                break;
        }
    }
}
