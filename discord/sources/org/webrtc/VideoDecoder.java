package org.webrtc;

/* JADX INFO: loaded from: classes4.dex */
public interface VideoDecoder {
    public static final String TAG = "VideoDecoderDiscord";

    public interface Callback {
        void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2);
    }

    public static class DecodeInfo {
        public final boolean isMissingFrames;
        public final long renderTimeMs;

        public DecodeInfo(boolean z5, long j) {
            this.isMissingFrames = z5;
            this.renderTimeMs = j;
        }
    }

    public static class Settings {
        public final int height;
        public final int numberOfCores;
        public final int width;

        @CalledByNative("Settings")
        public Settings(int i7, int i10, int i11) {
            this.numberOfCores = i7;
            this.width = i10;
            this.height = i11;
        }
    }

    @CalledByNative
    default long createNative(long j) {
        return 0L;
    }

    @CalledByNative
    VideoCodecStatus decode(EncodedImage encodedImage, DecodeInfo decodeInfo);

    @CalledByNative
    String getImplementationName();

    @CalledByNative
    VideoCodecStatus initDecode(Settings settings, Callback callback);

    @CalledByNative
    VideoCodecStatus release();

    @CalledByNative
    default void setStreamId(String str) {
    }
}
