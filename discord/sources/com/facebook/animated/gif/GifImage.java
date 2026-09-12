package com.facebook.animated.gif;

import aa.b;
import android.graphics.Bitmap;
import ba.a;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import java.nio.ByteBuffer;
import n8.c;
import n8.i;

/* JADX INFO: loaded from: classes3.dex */
@c
public class GifImage implements b, a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f4610b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap.Config f4611a = null;

    @c
    private long mNativeContext;

    @c
    public GifImage() {
    }

    public static synchronized void c() {
        if (!f4610b) {
            f4610b = true;
            ib.a.z("gifimage");
        }
    }

    @c
    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i7, boolean z5);

    @c
    private static native GifImage nativeCreateFromFileDescriptor(int i7, int i10, boolean z5);

    @c
    private static native GifImage nativeCreateFromNativeMemory(long j, int i7, int i10, boolean z5);

    @c
    private native void nativeDispose();

    @c
    private native void nativeFinalize();

    @c
    private native int nativeGetDuration();

    @c
    private native GifFrame nativeGetFrame(int i7);

    @c
    private native int nativeGetFrameCount();

    @c
    private native int[] nativeGetFrameDurations();

    @c
    private native int nativeGetHeight();

    @c
    private native int nativeGetLoopCount();

    @c
    private native int nativeGetSizeInBytes();

    @c
    private native int nativeGetWidth();

    @c
    private native boolean nativeIsAnimated();

    @Override // ba.a
    public final b a(ByteBuffer byteBuffer, ImageDecodeOptions imageDecodeOptions) {
        c();
        byteBuffer.rewind();
        imageDecodeOptions.getClass();
        GifImage gifImageNativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer, Integer.MAX_VALUE, false);
        gifImageNativeCreateFromDirectByteBuffer.f4611a = imageDecodeOptions.f4811b;
        return gifImageNativeCreateFromDirectByteBuffer;
    }

    @Override // ba.a
    public final b b(long j, int i7, ImageDecodeOptions imageDecodeOptions) {
        c();
        i.a(Boolean.valueOf(j != 0));
        imageDecodeOptions.getClass();
        GifImage gifImageNativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j, i7, Integer.MAX_VALUE, false);
        gifImageNativeCreateFromNativeMemory.f4611a = imageDecodeOptions.f4811b;
        return gifImageNativeCreateFromNativeMemory;
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
        return this.f4611a;
    }

    @Override // aa.b
    public final aa.c m(int i7) {
        return nativeGetFrame(i7);
    }

    @Override // aa.b
    public final boolean n() {
        return false;
    }

    @Override // aa.b
    public final aa.a o(int i7) {
        GifFrame gifFrameNativeGetFrame = nativeGetFrame(i7);
        try {
            int iB = gifFrameNativeGetFrame.b();
            int iC = gifFrameNativeGetFrame.c();
            int width = gifFrameNativeGetFrame.getWidth();
            int height = gifFrameNativeGetFrame.getHeight();
            int iD = gifFrameNativeGetFrame.d();
            int i10 = 1;
            if (iD != 0 && iD != 1) {
                int i11 = 2;
                if (iD == 2) {
                    i10 = i11;
                } else {
                    i11 = 3;
                    if (iD == 3) {
                        i10 = i11;
                    }
                }
            }
            return new aa.a(iB, iC, width, height, 1, i10);
        } finally {
            gifFrameNativeGetFrame.dispose();
        }
    }

    @Override // aa.b
    public final int[] p() {
        return nativeGetFrameDurations();
    }

    @Override // aa.b
    public final int q() {
        int iNativeGetLoopCount = nativeGetLoopCount();
        if (iNativeGetLoopCount == -1) {
            return 1;
        }
        if (iNativeGetLoopCount != 0) {
            return iNativeGetLoopCount + 1;
        }
        return 0;
    }

    @c
    public GifImage(long j) {
        this.mNativeContext = j;
    }
}
