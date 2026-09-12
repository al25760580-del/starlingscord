package org.webrtc;

/* JADX INFO: loaded from: classes4.dex */
interface BitrateAdjuster {
    int getAdjustedBitrateBps();

    double getAdjustedFramerateFps();

    void reportEncodedFrame(int i7);

    void setTargets(int i7, double d6);
}
