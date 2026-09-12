package com.horcrux.svg;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class CustomFilter {
    public static Bitmap apply(Bitmap bitmap, Bitmap bitmap2, d dVar) {
        int[] iArr;
        int[] iArr2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i7 = width * height;
        int[] iArr3 = new int[i7];
        int[] iArr4 = new int[i7];
        int[] iArr5 = new int[i7];
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        float[] fArr2 = {0.0f, 0.0f, 0.0f, 0.0f};
        try {
            bitmap.getPixels(iArr3, 0, width, 0, 0, width, height);
            iArr = iArr3;
            iArr2 = iArr4;
            try {
                bitmap2.getPixels(iArr2, 0, width, 0, 0, width, height);
            } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused) {
            }
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused2) {
            iArr = iArr3;
            iArr2 = iArr4;
        }
        for (int i10 = 0; i10 < height; i10++) {
            for (int i11 = 0; i11 < width; i11++) {
                int i12 = (i10 * width) + i11;
                int i13 = iArr[i12];
                fArr[0] = ((i13 >> 24) & 255) / 255.0f;
                fArr[1] = ((i13 >> 16) & 255) / 255.0f;
                fArr[2] = ((i13 >> 8) & 255) / 255.0f;
                fArr[3] = (i13 & 255) / 255.0f;
                int i14 = iArr2[i12];
                fArr2[0] = ((i14 >> 24) & 255) / 255.0f;
                fArr2[1] = ((i14 >> 16) & 255) / 255.0f;
                fArr2[2] = ((i14 >> 8) & 255) / 255.0f;
                fArr2[3] = (i14 & 255) / 255.0f;
                ((com.google.firebase.messaging.n) dVar).getClass();
                float f2 = fArr[0];
                float f7 = 1.0f - f2;
                float f10 = fArr2[0];
                float f11 = 1.0f - f10;
                float f12 = fArr[1] * f2;
                float f13 = fArr2[1];
                float f14 = (f12 * f13 * f10) + (f13 * f10 * f7) + (f11 * f12);
                float f15 = fArr[2] * f2;
                float f16 = fArr2[2];
                float f17 = fArr[3] * f2;
                float f18 = fArr2[3];
                iArr5[i12] = normalizeFromFloats(new float[]{1.0f - (f11 * f7), f14, (f15 * f16 * f10) + (f16 * f10 * f7) + (f11 * f15), (f17 * f18 * f10) + (f18 * f10 * f7) + (f11 * f17)});
            }
        }
        return Bitmap.createBitmap(iArr5, width, height, Bitmap.Config.ARGB_8888);
    }

    public static int normalizeFromFloat(float f2) {
        return Math.min(255, Math.max(0, Math.round(f2 * 255.0f)));
    }

    public static int normalizeFromFloats(float[] fArr) {
        if (fArr.length < 4 || normalizeFromFloat(fArr[0]) <= 0) {
            return 0;
        }
        return normalizeFromFloat(fArr[3] / fArr[0]) | (normalizeFromFloat(fArr[0]) << 24) | (normalizeFromFloat(fArr[1] / fArr[0]) << 16) | (normalizeFromFloat(fArr[2] / fArr[0]) << 8);
    }
}
