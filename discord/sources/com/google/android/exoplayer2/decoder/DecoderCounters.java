package com.google.android.exoplayer2.decoder;

import a3.e;
import java.util.Locale;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class DecoderCounters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5677h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5678i;
    public int j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5679l;

    public final String toString() {
        int i7 = this.f5670a;
        int i10 = this.f5671b;
        int i11 = this.f5672c;
        int i12 = this.f5673d;
        int i13 = this.f5674e;
        int i14 = this.f5675f;
        int i15 = this.f5676g;
        int i16 = this.f5677h;
        int i17 = this.f5678i;
        int i18 = this.j;
        long j = this.k;
        int i19 = this.f5679l;
        int i20 = e0.f13788a;
        Locale locale = Locale.US;
        StringBuilder sbR = e.r(i7, "DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", "\n queuedInputBuffers=");
        e.z(sbR, i11, "\n skippedInputBuffers=", i12, "\n renderedOutputBuffers=");
        e.z(sbR, i13, "\n skippedOutputBuffers=", i14, "\n droppedBuffers=");
        e.z(sbR, i15, "\n droppedInputBuffers=", i16, "\n maxConsecutiveDroppedBuffers=");
        e.z(sbR, i17, "\n droppedToKeyframeEvents=", i18, "\n totalVideoFrameProcessingOffsetUs=");
        sbR.append(j);
        sbR.append("\n videoFrameProcessingOffsetCount=");
        sbR.append(i19);
        sbR.append("\n}");
        return sbR.toString();
    }
}
