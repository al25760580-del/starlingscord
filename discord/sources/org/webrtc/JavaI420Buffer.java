package org.webrtc;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class JavaI420Buffer implements VideoFrame.I420Buffer {
    private final ByteBuffer dataU;
    private final ByteBuffer dataV;
    private final ByteBuffer dataY;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private final int strideU;
    private final int strideV;
    private final int strideY;
    private final int width;

    private JavaI420Buffer(int i7, int i10, ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, Runnable runnable) {
        this.width = i7;
        this.height = i10;
        this.dataY = byteBuffer;
        this.dataU = byteBuffer2;
        this.dataV = byteBuffer3;
        this.strideY = i11;
        this.strideU = i12;
        this.strideV = i13;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    public static JavaI420Buffer allocate(int i7, int i10) {
        int i11 = (i10 + 1) / 2;
        int i12 = (i7 + 1) / 2;
        int i13 = i7 * i10;
        int i14 = i12 * i11;
        int i15 = i13 + i14;
        ByteBuffer byteBufferNativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer((i12 * 2 * i11) + i13);
        ByteBuffer byteBufferSlice = byteBufferNativeAllocateByteBuffer.slice();
        ByteBuffer byteBufferSlice2 = byteBufferNativeAllocateByteBuffer.slice();
        return new JavaI420Buffer(i7, i10, byteBufferSlice, i7, byteBufferSlice2, i12, byteBufferNativeAllocateByteBuffer.slice(), i12, new l(byteBufferNativeAllocateByteBuffer, 0));
    }

    private static void checkCapacity(ByteBuffer byteBuffer, int i7, int i10, int i11) {
        int i12 = ((i10 - 1) * i11) + i7;
        if (byteBuffer.capacity() < i12) {
            throw new IllegalArgumentException(a3.e.g(i12, byteBuffer.capacity(), "Buffer must be at least ", " bytes, but was "));
        }
    }

    public static VideoFrame.Buffer cropAndScaleI420(VideoFrame.I420Buffer i420Buffer, int i7, int i10, int i11, int i12, int i13, int i14) {
        if (i11 != i13 || i12 != i14) {
            JavaI420Buffer javaI420BufferAllocate = allocate(i13, i14);
            nativeCropAndScaleI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i7, i10, i11, i12, javaI420BufferAllocate.getDataY(), javaI420BufferAllocate.getStrideY(), javaI420BufferAllocate.getDataU(), javaI420BufferAllocate.getStrideU(), javaI420BufferAllocate.getDataV(), javaI420BufferAllocate.getStrideV(), i13, i14);
            return javaI420BufferAllocate;
        }
        ByteBuffer dataY = i420Buffer.getDataY();
        ByteBuffer dataU = i420Buffer.getDataU();
        ByteBuffer dataV = i420Buffer.getDataV();
        int i15 = i7 / 2;
        int i16 = i10 / 2;
        i420Buffer.retain();
        return wrap(i13, i14, dataY.slice(), i420Buffer.getStrideY(), dataU.slice(), i420Buffer.getStrideU(), dataV.slice(), i420Buffer.getStrideV(), new d(4, i420Buffer));
    }

    private static native void nativeCropAndScaleI420(ByteBuffer byteBuffer, int i7, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11, int i12, int i13, int i14, int i15, ByteBuffer byteBuffer4, int i16, ByteBuffer byteBuffer5, int i17, ByteBuffer byteBuffer6, int i18, int i19, int i20);

    public static JavaI420Buffer wrap(int i7, int i10, ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, Runnable runnable) {
        if (byteBuffer == null || byteBuffer2 == null || byteBuffer3 == null) {
            throw new IllegalArgumentException("Data buffers cannot be null.");
        }
        if (!byteBuffer.isDirect() || !byteBuffer2.isDirect() || !byteBuffer3.isDirect()) {
            throw new IllegalArgumentException("Data buffers must be direct byte buffers.");
        }
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        ByteBuffer byteBufferSlice2 = byteBuffer2.slice();
        ByteBuffer byteBufferSlice3 = byteBuffer3.slice();
        int i14 = (i7 + 1) / 2;
        int i15 = (i10 + 1) / 2;
        checkCapacity(byteBufferSlice, i7, i10, i11);
        checkCapacity(byteBufferSlice2, i14, i15, i12);
        checkCapacity(byteBufferSlice3, i14, i15, i13);
        return new JavaI420Buffer(i7, i10, byteBufferSlice, i11, byteBufferSlice2, i12, byteBufferSlice3, i13, runnable);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i7, int i10, int i11, int i12, int i13, int i14) {
        return cropAndScaleI420(this, i7, i10, i11, i12, i13, i14);
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataU() {
        return this.dataU.slice();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataV() {
        return this.dataV.slice();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataY() {
        return this.dataY.slice();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideU() {
        return this.strideU;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideV() {
        return this.strideV;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideY() {
        return this.strideY;
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
        retain();
        return this;
    }
}
