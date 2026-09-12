package uk;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteBuffer f21182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaCodec.BufferInfo f21183c;

    public c(int i7, ByteBuffer buffer, MediaCodec.BufferInfo info) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f21181a = i7;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(buffer.capacity());
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(buffer.capacity())");
        this.f21182b = byteBufferAllocate;
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        this.f21183c = bufferInfo;
        bufferInfo.set(0, info.size, info.presentationTimeUs, info.flags);
        byteBufferAllocate.put(buffer);
        byteBufferAllocate.flip();
    }
}
