package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
@n8.c
public class NativeBlurFilter {
    static {
        ib.a.z("native-filters");
    }

    public static void a(int i7, int i10, Bitmap bitmap) {
        bitmap.getClass();
        if (!(i7 > 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i10 > 0)) {
            throw new IllegalArgumentException();
        }
        nativeIterativeBoxBlur(bitmap, i7, i10);
    }

    @n8.c
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i7, int i10);
}
