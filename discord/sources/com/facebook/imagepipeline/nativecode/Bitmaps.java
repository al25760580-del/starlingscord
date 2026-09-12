package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import java.util.List;
import n8.i;

/* JADX INFO: loaded from: classes3.dex */
@n8.c
public class Bitmaps {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4912a = 0;

    static {
        List list = a.f4921a;
        ib.a.z("imagepipeline");
    }

    @n8.c
    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        i.a(Boolean.valueOf(bitmap2.getConfig() == bitmap.getConfig()));
        i.a(Boolean.valueOf(bitmap.isMutable()));
        i.a(Boolean.valueOf(bitmap.getWidth() == bitmap2.getWidth()));
        i.a(Boolean.valueOf(bitmap.getHeight() == bitmap2.getHeight()));
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    @n8.c
    private static native void nativeCopyBitmap(Bitmap bitmap, int i7, Bitmap bitmap2, int i10, int i11);
}
