package org.webrtc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u implements VideoDecoder.Callback, VideoEncoder.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f17708a;

    public /* synthetic */ u(long j) {
        this.f17708a = j;
    }

    @Override // org.webrtc.VideoDecoder.Callback
    public void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2) {
        VideoDecoderWrapper.nativeOnDecodedFrame(this.f17708a, videoFrame, num, num2);
    }

    @Override // org.webrtc.VideoEncoder.Callback
    public void onEncodedFrame(EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
        VideoEncoderWrapper.nativeOnEncodedFrame(this.f17708a, encodedImage);
    }
}
