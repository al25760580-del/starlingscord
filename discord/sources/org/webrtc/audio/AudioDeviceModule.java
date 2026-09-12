package org.webrtc.audio;

/* JADX INFO: loaded from: classes4.dex */
public interface AudioDeviceModule {
    long getNative(long j);

    void release();

    void setMicrophoneMute(boolean z5);

    default boolean setNoiseSuppressorEnabled(boolean z5) {
        return false;
    }

    default boolean setPreferredMicrophoneFieldDimension(float f2) {
        return false;
    }

    void setSpeakerMute(boolean z5);
}
