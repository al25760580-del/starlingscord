package org.webrtc;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class NV21Buffer implements VideoFrame.Buffer {
    private final byte[] data;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private final int width;

    public NV21Buffer(byte[] bArr, int i7, int i10, Runnable runnable) {
        this.data = bArr;
        this.width = i7;
        this.height = i10;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    private static native void nativeCropAndScale(int i7, int i10, int i11, int i12, int i13, int i14, byte[] bArr, int i15, int i16, ByteBuffer byteBuffer, int i17, ByteBuffer byteBuffer2, int i18, ByteBuffer byteBuffer3, int i19);

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i7, int i10, int i11, int i12, int i13, int i14) {
        JavaI420Buffer javaI420BufferAllocate = JavaI420Buffer.allocate(i13, i14);
        nativeCropAndScale(i7, i10, i11, i12, i13, i14, this.data, this.width, this.height, javaI420BufferAllocate.getDataY(), javaI420BufferAllocate.getStrideY(), javaI420BufferAllocate.getDataU(), javaI420BufferAllocate.getStrideU(), javaI420BufferAllocate.getDataV(), javaI420BufferAllocate.getStrideV());
        return javaI420BufferAllocate;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        int i7 = this.width;
        int i10 = this.height;
        return (VideoFrame.I420Buffer) cropAndScale(0, 0, i7, i10, i7, i10);
    }
}
