package com.linkedin.android.litr.render;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vk.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001J0\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\b\u0010\tJ0\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/linkedin/android/litr/render/OboeAudioProcessor;", "Lvk/a;", "", "sourceChannelCount", "sourceSampleRate", "targetChannelCount", "targetSampleRate", "", "initProcessor", "(IIII)V", "Ljava/nio/ByteBuffer;", "sourceBuffer", "sampleCount", "targetBuffer", "targetBufferSize", "processAudioFrame", "(Ljava/nio/ByteBuffer;ILjava/nio/ByteBuffer;I)I", "releaseProcessor", "()V", "litr_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class OboeAudioProcessor implements a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6893e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final double f6894i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f6895v;

    static {
        System.loadLibrary("litr-jni");
    }

    public OboeAudioProcessor(int i7, int i10, int i11, int i12) {
        this.f6892d = i7;
        this.f6893e = i11;
        initProcessor(i7, i10, i11, i12);
        this.f6894i = 1000000.0d / ((double) i12);
        this.f6895v = 0L;
    }

    private final native void initProcessor(int sourceChannelCount, int sourceSampleRate, int targetChannelCount, int targetSampleRate);

    private final native int processAudioFrame(ByteBuffer sourceBuffer, int sampleCount, ByteBuffer targetBuffer, int targetBufferSize);

    private final native void releaseProcessor();

    @Override // vk.a
    public final void b(qk.a sourceFrame, qk.a targetFrame) {
        ByteBuffer byteBuffer;
        Intrinsics.checkNotNullParameter(sourceFrame, "sourceFrame");
        Intrinsics.checkNotNullParameter(targetFrame, "targetFrame");
        ByteBuffer byteBuffer2 = sourceFrame.f18915b;
        MediaCodec.BufferInfo bufferInfo = sourceFrame.f18916c;
        if (byteBuffer2 == null || (byteBuffer = targetFrame.f18915b) == null) {
            throw new IllegalArgumentException("Source or target frame doesn't have a buffer, cannot process it!");
        }
        int i7 = bufferInfo.size / (this.f6892d * 2);
        Intrinsics.checkNotNullExpressionValue(byteBuffer2, "sourceFrame.buffer");
        Intrinsics.checkNotNullExpressionValue(byteBuffer, "targetFrame.buffer");
        int iProcessAudioFrame = processAudioFrame(byteBuffer2, i7, byteBuffer, byteBuffer.capacity());
        int i10 = iProcessAudioFrame * 2 * this.f6893e;
        byteBuffer.rewind();
        byteBuffer.limit(Math.min(i10, byteBuffer.capacity()));
        targetFrame.f18916c.set(0, i10, this.f6895v, bufferInfo.flags);
        this.f6895v += (long) (((double) iProcessAudioFrame) * this.f6894i);
    }

    @Override // vk.a
    public final void release() {
        releaseProcessor();
    }
}
