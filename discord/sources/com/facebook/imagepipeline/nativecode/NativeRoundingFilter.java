package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
@n8.c
public class NativeRoundingFilter {
    static {
        ib.a.z("native-filters");
    }

    @n8.c
    private static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i7, int i10, int i11, int i12);

    @n8.c
    private static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z5);

    @n8.c
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z5);

    @n8.c
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i7, int i10, boolean z5);

    @n8.c
    public static void toCircle(Bitmap bitmap, boolean z5) {
        bitmap.getClass();
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFilter(bitmap, z5);
    }

    @n8.c
    public static void toCircleFast(Bitmap bitmap, boolean z5) {
        bitmap.getClass();
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFastFilter(bitmap, z5);
    }
}
