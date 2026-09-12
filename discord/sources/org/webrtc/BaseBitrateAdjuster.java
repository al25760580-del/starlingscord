package org.webrtc;

/* JADX INFO: loaded from: classes4.dex */
class BaseBitrateAdjuster implements BitrateAdjuster {
    protected int targetBitrateBps;
    protected double targetFramerateFps;

    @Override // org.webrtc.BitrateAdjuster
    public int getAdjustedBitrateBps() {
        return this.targetBitrateBps;
    }

    @Override // org.webrtc.BitrateAdjuster
    public double getAdjustedFramerateFps() {
        return this.targetFramerateFps;
    }

    @Override // org.webrtc.BitrateAdjuster
    public void reportEncodedFrame(int i7) {
    }

    @Override // org.webrtc.BitrateAdjuster
    public void setTargets(int i7, double d6) {
        this.targetBitrateBps = i7;
        this.targetFramerateFps = d6;
    }
}
