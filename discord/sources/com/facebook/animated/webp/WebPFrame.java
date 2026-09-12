package com.facebook.animated.webp;

import aa.c;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class WebPFrame implements c {

    @n8.c
    private long mNativeContext;

    @n8.c
    public WebPFrame(long j) {
        this.mNativeContext = j;
    }

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetWidth();

    private native int nativeGetXOffset();

    private native int nativeGetYOffset();

    private native boolean nativeIsBlendWithPreviousFrame();

    private native void nativeRenderFrame(int i7, int i10, Bitmap bitmap);

    private native boolean nativeShouldDisposeToBackgroundColor();

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

    public final boolean d() {
        return nativeIsBlendWithPreviousFrame();
    }

    @Override // aa.c
    public final void dispose() {
        nativeDispose();
    }

    public final boolean e() {
        return nativeShouldDisposeToBackgroundColor();
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
