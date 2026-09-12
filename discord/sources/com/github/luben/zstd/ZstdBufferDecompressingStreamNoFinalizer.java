package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class ZstdBufferDecompressingStreamNoFinalizer extends BaseZstdBufferDecompressingStreamNoFinalizer {
    static {
        Native.load();
    }

    public ZstdBufferDecompressingStreamNoFinalizer(ByteBuffer byteBuffer) {
        super(byteBuffer);
        if (byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Source buffer should be a non-direct buffer");
        }
        long jCreateDStream = createDStream();
        this.stream = jCreateDStream;
        initDStream(jCreateDStream);
    }

    private native long createDStreamNative();

    private native long decompressStreamNative(long j, byte[] bArr, int i7, int i10, byte[] bArr2, int i11, int i12);

    private native long freeDStreamNative(long j);

    private native long initDStreamNative(long j);

    private static native long recommendedDOutSizeNative();

    public static int recommendedTargetBufferSize() {
        return (int) recommendedDOutSizeNative();
    }

    public long createDStream() {
        return createDStreamNative();
    }

    @Override // com.github.luben.zstd.BaseZstdBufferDecompressingStreamNoFinalizer
    public long decompressStream(long j, ByteBuffer byteBuffer, int i7, int i10, ByteBuffer byteBuffer2, int i11, int i12) {
        if (!byteBuffer2.hasArray()) {
            throw new IllegalArgumentException("provided source ByteBuffer lacks array");
        }
        if (!byteBuffer.hasArray()) {
            throw new IllegalArgumentException("provided destination ByteBuffer lacks array");
        }
        return decompressStreamNative(j, byteBuffer.array(), byteBuffer.arrayOffset() + i7, i10, byteBuffer2.array(), byteBuffer2.arrayOffset() + i11, i12);
    }

    @Override // com.github.luben.zstd.BaseZstdBufferDecompressingStreamNoFinalizer
    public long freeDStream(long j) {
        return freeDStreamNative(j);
    }

    public long initDStream(long j) {
        return initDStreamNative(j);
    }

    public int read(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Target buffer should be a non-direct buffer");
        }
        return readInternal(byteBuffer, false);
    }
}
