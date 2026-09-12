package com.facebook.animated.webp;

import aa.b;
import android.graphics.Bitmap;
import ba.a;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import java.nio.ByteBuffer;
import n8.c;
import n8.i;

/* JADX INFO: loaded from: classes3.dex */
@c
public class WebPImage implements b, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap.Config f4612a = null;

    @c
    private long mNativeContext;

    @c
    public WebPImage() {
    }

    private static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    private static native WebPImage nativeCreateFromNativeMemory(long j, int i7);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native WebPFrame nativeGetFrame(int i7);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    @Override // ba.a
    public final b a(ByteBuffer byteBuffer, ImageDecodeOptions imageDecodeOptions) {
        com.facebook.imagepipeline.nativecode.c.q();
        byteBuffer.rewind();
        WebPImage webPImageNativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer);
        if (imageDecodeOptions != null) {
            webPImageNativeCreateFromDirectByteBuffer.f4612a = imageDecodeOptions.f4811b;
        }
        return webPImageNativeCreateFromDirectByteBuffer;
    }

    @Override // ba.a
    public final b b(long j, int i7, ImageDecodeOptions imageDecodeOptions) {
        com.facebook.imagepipeline.nativecode.c.q();
        i.a(Boolean.valueOf(j != 0));
        WebPImage webPImageNativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j, i7);
        if (imageDecodeOptions != null) {
            webPImageNativeCreateFromNativeMemory.f4612a = imageDecodeOptions.f4811b;
        }
        return webPImageNativeCreateFromNativeMemory;
    }

    public final void finalize() {
        nativeFinalize();
    }

    @Override // aa.b
    public final int getHeight() {
        return nativeGetHeight();
    }

    @Override // aa.b
    public final int getWidth() {
        return nativeGetWidth();
    }

    @Override // aa.b
    public final int j() {
        return nativeGetSizeInBytes();
    }

    @Override // aa.b
    public final int k() {
        return nativeGetFrameCount();
    }

    @Override // aa.b
    public final Bitmap.Config l() {
        return this.f4612a;
    }

    @Override // aa.b
    public final aa.c m(int i7) {
        return nativeGetFrame(i7);
    }

    @Override // aa.b
    public final boolean n() {
        return true;
    }

    @Override // aa.b
    public final aa.a o(int i7) {
        WebPFrame webPFrameNativeGetFrame = nativeGetFrame(i7);
        try {
            int iB = webPFrameNativeGetFrame.b();
            int iC = webPFrameNativeGetFrame.c();
            int width = webPFrameNativeGetFrame.getWidth();
            int height = webPFrameNativeGetFrame.getHeight();
            int i10 = 2;
            int i11 = webPFrameNativeGetFrame.d() ? 1 : 2;
            if (!webPFrameNativeGetFrame.e()) {
                i10 = 1;
            }
            return new aa.a(iB, iC, width, height, i11, i10);
        } finally {
            webPFrameNativeGetFrame.dispose();
        }
    }

    @Override // aa.b
    public final int[] p() {
        return nativeGetFrameDurations();
    }

    @Override // aa.b
    public final int q() {
        return nativeGetLoopCount();
    }

    @c
    public WebPImage(long j) {
        this.mNativeContext = j;
    }
}
