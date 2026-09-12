package org.webrtc;

/* JADX INFO: loaded from: classes4.dex */
public interface CapturerObserver {
    void onCapturerStarted(boolean z5);

    void onCapturerStopped();

    void onFrameCaptured(VideoFrame videoFrame);
}
