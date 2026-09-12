package com.facebook.animated.gif;

import aa.c;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class GifFrame implements c {

    @n8.c
    private long mNativeContext;

    @n8.c
    public GifFrame(long j) {
        this.mNativeContext = j;
    }

    @n8.c
    private native void nativeDispose();

    @n8.c
    private native void nativeFinalize();

    @n8.c
    private native int nativeGetDisposalMode();

    @n8.c
    private native int nativeGetDurationMs();

    @n8.c
    private native int nativeGetHeight();

    @n8.c
    private native int nativeGetTransparentPixelColor();

    @n8.c
    private native int nativeGetWidth();

    @n8.c
    private native int nativeGetXOffset();

    @n8.c
    private native int nativeGetYOffset();

    @n8.c
    private native boolean nativeHasTransparency();

    @n8.c
    private native void nativeRenderFrame(int i7, int i10, Bitmap bitmap);

    @Override // aa.c
    public final void a(int i7, int i10, Bitmap bitmap) {
        nativeRenderFrame(i7, i10, bitmap);
    }

    @Override // aa.c
    public final int b() {
        return nativeGetXOffset();
    }

    @Override // aa.c
    public final int c() {
        return nativeGetYOffset();
    }

    public final int d() {
        return nativeGetDisposalMode();
    }

    @Override // aa.c
    public final void dispose() {
        nativeDispose();
    }

    public final void finalize() {
        nativeFinalize();
    }

    @Override // aa.c
    public final int getHeight() {
        return nativeGetHeight();
    }

    @Override // aa.c
    public final int getWidth() {
        return nativeGetWidth();
    }
}
