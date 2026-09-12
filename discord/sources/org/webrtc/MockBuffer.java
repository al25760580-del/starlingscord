package org.webrtc;

/* JADX INFO: loaded from: classes4.dex */
public class MockBuffer implements VideoFrame.Buffer {
    private static final VideoFrame.Buffer SAFE_FALLBACK = JavaI420Buffer.allocate(1, 1);
    private final int height;
    private final int width;

    public MockBuffer(int i7, int i10) {
        this.width = i7;
        this.height = i10;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i7, int i10, int i11, int i12, int i13, int i14) {
        return new MockBuffer(i13, i14);
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
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void retain() {
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return SAFE_FALLBACK.toI420();
    }
}
