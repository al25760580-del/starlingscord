package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Zstd {
    static {
        Native.load();
    }

    public static native int blockSizeMax();

    public static native int chainLogMax();

    public static native int chainLogMin();

    public static native long compressBound(long j);

    public static native long compressUnsafe(long j, long j5, long j7, long j10, int i7, boolean z5);

    public static native long decompressUnsafe(long j, long j5, long j7, long j10);

    @Deprecated
    public static native long decompressedDirectByteBufferSize(ByteBuffer byteBuffer, int i7, int i10, boolean z5);

    private static native long decompressedSize0(byte[] bArr, int i7, int i10, boolean z5);

    public static native int defaultCompressionLevel();

    public static native long errChecksumWrong();

    public static native long errCorruptionDetected();

    public static native long errDictionaryCorrupted();

    public static native long errDictionaryCreationFailed();

    public static native long errDictionaryWrong();

    public static native long errDstBufferNull();

    public static native long errDstSizeTooSmall();

    public static native long errFrameParameterUnsupported();

    public static native long errFrameParameterWindowTooLarge();

    public static native long errGeneric();

    public static native long errInitMissing();

    public static native long errMaxSymbolValueTooLarge();

    public static native long errMaxSymbolValueTooSmall();

    public static native long errMemoryAllocation();

    public static native long errNoError();

    public static native long errParameterOutOfBound();

    public static native long errParameterUnsupported();

    public static native long errPrefixUnknown();

    public static native long errSrcSizeWrong();

    public static native long errStageWrong();

    public static native long errTableLogTooLarge();

    public static native long errVersionUnsupported();

    public static native long errWorkSpaceTooSmall();

    public static native void generateSequences(long j, long j5, long j7, long j10, long j11);

    public static native long getBuiltinSequenceProducer();

    public static native long getDictIdFromDict(byte[] bArr);

    private static native long getDictIdFromDictDirect(ByteBuffer byteBuffer, int i7, int i10);

    public static native long getDictIdFromFrame(byte[] bArr);

    public static native long getDictIdFromFrameBuffer(ByteBuffer byteBuffer);

    public static native long getDirectByteBufferFrameContentSize(ByteBuffer byteBuffer, int i7, int i10, boolean z5);

    public static native long getErrorCode(long j);

    public static native String getErrorName(long j);

    private static native long getFrameContentSize0(byte[] bArr, int i7, int i10, boolean z5);

    public static native long getStubSequenceProducer();

    public static native int hashLogMax();

    public static native int hashLogMin();

    public static native boolean isError(long j);

    public static native int loadDictCompress(long j, byte[] bArr, int i7);

    public static native int loadDictDecompress(long j, byte[] bArr, int i7);

    public static native int loadFastDictCompress(long j, ZstdDictCompress zstdDictCompress);

    public static native int loadFastDictDecompress(long j, ZstdDictDecompress zstdDictDecompress);

    public static native int magicNumber();

    public static native int maxCompressionLevel();

    public static native int minCompressionLevel();

    public static native void registerSequenceProducer(long j, long j5, long j7);

    public static native int searchLengthMax();

    public static native int searchLengthMin();

    public static native int searchLogMax();

    public static native int searchLogMin();

    public static native int setCompressionChainLog(long j, int i7);

    public static native int setCompressionChecksums(long j, boolean z5);

    public static native int setCompressionHashLog(long j, int i7);

    public static native int setCompressionJobSize(long j, int i7);

    public static native int setCompressionLevel(long j, int i7);

    public static native int setCompressionLong(long j, int i7);

    public static native int setCompressionMagicless(long j, boolean z5);

    public static native int setCompressionMinMatch(long j, int i7);

    public static native int setCompressionOverlapLog(long j, int i7);

    public static native int setCompressionSearchLog(long j, int i7);

    public static native int setCompressionStrategy(long j, int i7);

    public static native int setCompressionTargetLength(long j, int i7);

    public static native int setCompressionWindowLog(long j, int i7);

    public static native int setCompressionWorkers(long j, int i7);

    public static native int setDecompressionLongMax(long j, int i7);

    public static native int setDecompressionMagicless(long j, boolean z5);

    public static native int setEnableLongDistanceMatching(long j, int i7);

    public static native int setRefMultipleDDicts(long j, boolean z5);

    public static native int setSearchForExternalRepcodes(long j, int i7);

    public static native int setSequenceProducerFallback(long j, boolean z5);

    public static native int setValidateSequences(long j, int i7);

    private static native long trainFromBuffer0(byte[][] bArr, byte[] bArr2, boolean z5, int i7);

    private static native long trainFromBufferDirect0(ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, boolean z5, int i7);

    public static native int windowLogMax();

    public static native int windowLogMin();
}
