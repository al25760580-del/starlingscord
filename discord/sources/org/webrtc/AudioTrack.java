package org.webrtc;

/* JADX INFO: loaded from: classes4.dex */
public class AudioTrack extends MediaStreamTrack {
    public AudioTrack(long j) {
        super(j);
    }

    private static native void nativeSetVolume(long j, double d6);

    public long getNativeAudioTrack() {
        return getNativeMediaStreamTrack();
    }

    public void setVolume(double d6) {
        nativeSetVolume(getNativeAudioTrack(), d6);
    }
}
