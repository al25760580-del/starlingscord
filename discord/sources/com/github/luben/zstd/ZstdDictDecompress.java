package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class ZstdDictDecompress extends SharedDictBase {
    private long nativePtr;
    private ByteBuffer sharedDict;

    static {
        Native.load();
    }

    private native void free();

    private native void init(byte[] bArr, int i7, int i10);

    private native void initDirect(ByteBuffer byteBuffer, int i7, int i10, int i11);

    @Override // com.github.luben.zstd.AutoCloseBase, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Override // com.github.luben.zstd.AutoCloseBase
    public void doClose() {
        if (this.nativePtr != 0) {
            free();
            this.nativePtr = 0L;
            this.sharedDict = null;
        }
    }
}
