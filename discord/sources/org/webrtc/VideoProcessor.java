package org.webrtc;

/* JADX INFO: loaded from: classes4.dex */
public interface VideoProcessor extends CapturerObserver {

    public static class FrameAdaptationParameters {
        public final int cropHeight;
        public final int cropWidth;
        public final int cropX;
        public final int cropY;
        public final boolean drop;
        public final int scaleHeight;
        public final int scaleWidth;
        public final long timestampNs;

        public FrameAdaptationParameters(int i7, int i10, int i11, int i12, int i13, int i14, long j, boolean z5) {
            this.cropX = i7;
            this.cropY = i10;
            this.cropWidth = i11;
            this.cropHeight = i12;
            this.scaleWidth = i13;
            this.scaleHeight = i14;
            this.timestampNs = j;
            this.drop = z5;
        }
    }

    static VideoFrame applyFrameAdaptationParameters(VideoFrame videoFrame, FrameAdaptationParameters frameAdaptationParameters) {
        if (frameAdaptationParameters.drop) {
            return null;
        }
        return new VideoFrame(videoFrame.getBuffer().cropAndScale(frameAdaptationParameters.cropX, frameAdaptationParameters.cropY, frameAdaptationParameters.cropWidth, frameAdaptationParameters.cropHeight, frameAdaptationParameters.scaleWidth, frameAdaptationParameters.scaleHeight), videoFrame.getRotation(), frameAdaptationParameters.timestampNs);
    }

    default void onFrameCaptured(VideoFrame videoFrame, FrameAdaptationParameters frameAdaptationParameters) {
        VideoFrame videoFrameApplyFrameAdaptationParameters = applyFrameAdaptationParameters(videoFrame, frameAdaptationParameters);
        if (videoFrameApplyFrameAdaptationParameters != null) {
            onFrameCaptured(videoFrameApplyFrameAdaptationParameters);
            videoFrameApplyFrameAdaptationParameters.release();
        }
    }

    void setSink(VideoSink videoSink);
}
