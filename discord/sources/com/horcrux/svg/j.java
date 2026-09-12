package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends o {
    public float E;
    public t F;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f6733i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f6734v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f6735w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f6736x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f6737y;

    @Override // com.horcrux.svg.o
    public final Bitmap c(HashMap map, Bitmap bitmap) {
        Bitmap bitmapD = o.d(map, bitmap, this.f6733i);
        Bitmap bitmapD2 = o.d(map, bitmap, this.f6734v);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapD.getWidth(), bitmapD.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        canvas.drawBitmap(bitmapD, 0.0f, 0.0f, paint);
        int iOrdinal = this.F.ordinal();
        if (iOrdinal == 0) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        } else if (iOrdinal == 1) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        } else if (iOrdinal == 2) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else if (iOrdinal == 3) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
        } else if (iOrdinal == 4) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
        } else if (iOrdinal == 5) {
            int height = bitmapCreateBitmap.getHeight() * bitmapCreateBitmap.getWidth();
            int[] iArr = new int[height];
            bitmapCreateBitmap.getPixels(iArr, 0, bitmapCreateBitmap.getWidth(), 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
            int width = bitmapCreateBitmap.getWidth();
            int width2 = bitmapCreateBitmap.getWidth();
            int height2 = bitmapCreateBitmap.getHeight();
            int[] iArr2 = new int[height];
            bitmapD2.getPixels(iArr2, 0, width, 0, 0, width2, height2);
            int i7 = 0;
            while (i7 < height) {
                int i10 = iArr[i7];
                int i11 = iArr2[i7];
                int i12 = height;
                int[] iArr3 = iArr2;
                float f2 = this.f6735w;
                float f7 = (i10 >> 16) & 255;
                float f10 = (i11 >> 16) & 255;
                float f11 = f2 * f7 * f10;
                float f12 = this.f6736x;
                float f13 = (f7 * f12) + f11;
                float f14 = this.f6737y;
                float f15 = (f10 * f14) + f13;
                float f16 = this.E;
                int i13 = (int) (f15 + f16);
                float f17 = (i10 >> 8) & 255;
                float f18 = (i11 >> 8) & 255;
                int i14 = (int) ((f18 * f14) + (f17 * f12) + (f2 * f17 * f18) + f16);
                float f19 = i10 & 255;
                float f20 = i11 & 255;
                int i15 = (int) ((f20 * f14) + (f19 * f12) + (f2 * f19 * f20) + f16);
                float f21 = i10 >>> 24;
                float f22 = i11 >>> 24;
                int i16 = (int) ((f14 * f22) + (f21 * f12) + (f2 * f21 * f22) + f16);
                iArr[i7] = (Math.min(255, Math.max(0, i13)) << 16) | (Math.min(255, Math.max(0, i16)) << 24) | (Math.min(255, Math.max(0, i14)) << 8) | Math.min(255, Math.max(0, i15));
                i7++;
                height = i12;
                iArr2 = iArr3;
            }
            int width3 = bitmapCreateBitmap.getWidth();
            int width4 = bitmapCreateBitmap.getWidth();
            bitmapCreateBitmap = bitmapCreateBitmap;
            bitmapCreateBitmap.setPixels(iArr, 0, width3, 0, 0, width4, bitmapCreateBitmap.getHeight());
        }
        if (this.F != t.ARITHMETIC) {
            canvas.drawBitmap(bitmapD2, 0.0f, 0.0f, paint);
        }
        return bitmapCreateBitmap;
    }
}
