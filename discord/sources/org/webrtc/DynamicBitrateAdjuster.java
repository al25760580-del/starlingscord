package org.webrtc;

/* JADX INFO: loaded from: classes4.dex */
class DynamicBitrateAdjuster extends BaseBitrateAdjuster {
    private static final double BITRATE_ADJUSTMENT_MAX_SCALE = 4.0d;
    private static final double BITRATE_ADJUSTMENT_SEC = 3.0d;
    private static final int BITRATE_ADJUSTMENT_STEPS = 20;
    private static final double BITS_PER_BYTE = 8.0d;
    private int bitrateAdjustmentScaleExp;
    private double deviationBytes;
    private double timeSinceLastAdjustmentMs;

    private double getBitrateAdjustmentScale() {
        return Math.pow(BITRATE_ADJUSTMENT_MAX_SCALE, ((double) this.bitrateAdjustmentScaleExp) / 20.0d);
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public int getAdjustedBitrateBps() {
        return (int) (((double) this.targetBitrateBps) * getBitrateAdjustmentScale());
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void reportEncodedFrame(int i7) {
        double d6 = this.targetFramerateFps;
        if (d6 == 0.0d) {
            return;
        }
        int i10 = this.targetBitrateBps;
        double d7 = (((double) i7) - ((((double) i10) / BITS_PER_BYTE) / d6)) + this.deviationBytes;
        this.deviationBytes = d7;
        this.timeSinceLastAdjustmentMs = (1000.0d / d6) + this.timeSinceLastAdjustmentMs;
        double d8 = ((double) i10) / BITS_PER_BYTE;
        double d9 = BITRATE_ADJUSTMENT_SEC * d8;
        double dMin = Math.min(d7, d9);
        this.deviationBytes = dMin;
        double dMax = Math.max(dMin, -d9);
        this.deviationBytes = dMax;
        if (this.timeSinceLastAdjustmentMs <= 3000.0d) {
            return;
        }
        if (dMax > d8) {
            int i11 = this.bitrateAdjustmentScaleExp - ((int) ((dMax / d8) + 0.5d));
            this.bitrateAdjustmentScaleExp = i11;
            this.bitrateAdjustmentScaleExp = Math.max(i11, -20);
            this.deviationBytes = d8;
        } else {
            double d10 = -d8;
            if (dMax < d10) {
                int i12 = this.bitrateAdjustmentScaleExp + ((int) (((-dMax) / d8) + 0.5d));
                this.bitrateAdjustmentScaleExp = i12;
                this.bitrateAdjustmentScaleExp = Math.min(i12, 20);
                this.deviationBytes = d10;
            }
        }
        this.timeSinceLastAdjustmentMs = 0.0d;
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void setTargets(int i7, double d6) {
        int i10 = this.targetBitrateBps;
        if (i10 > 0 && i7 < i10) {
            this.deviationBytes = (this.deviationBytes * ((double) i7)) / ((double) i10);
        }
        super.setTargets(i7, d6);
    }
}
