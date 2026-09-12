package org.webrtc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements VideoSink {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17664e;

    public /* synthetic */ b(int i7, Object obj) {
        this.f17663d = i7;
        this.f17664e = obj;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f17663d) {
            case 0:
                ((Camera1Session) this.f17664e).lambda$listenForTextureFrames$0(videoFrame);
                break;
            case 1:
                ((Camera2Session.CaptureSessionCallback) this.f17664e).lambda$onConfigured$0(videoFrame);
                break;
            default:
                ((VideoSource) this.f17664e).lambda$setVideoProcessor$1(videoFrame);
                break;
        }
    }
}
