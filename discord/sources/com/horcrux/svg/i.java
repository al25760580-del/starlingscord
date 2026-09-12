package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import com.facebook.react.bridge.ReadableArray;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends o {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f6728i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public s f6729v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ReadableArray f6730w;

    @Override // com.horcrux.svg.o
    public final Bitmap c(HashMap map, Bitmap bitmap) {
        Bitmap bitmapD = o.d(map, bitmap, this.f6728i);
        ColorMatrix colorMatrix = new ColorMatrix();
        int iOrdinal = this.f6729v.ordinal();
        if (iOrdinal == 0) {
            if (this.f6730w.size() >= 20) {
                float[] fArr = new float[this.f6730w.size()];
                for (int i7 = 0; i7 < this.f6730w.size(); i7++) {
                    fArr[i7] = ((float) this.f6730w.getDouble(i7)) * (i7 % 5 == 4 ? 255 : 1);
                }
                colorMatrix.set(fArr);
                return FilterUtils.getBitmapWithColorMatrix(colorMatrix, bitmapD);
            }
            return bitmapD;
        }
        if (iOrdinal == 1) {
            if (this.f6730w.size() == 1) {
                colorMatrix.setSaturation((float) this.f6730w.getDouble(0));
                return FilterUtils.getBitmapWithColorMatrix(colorMatrix, bitmapD);
            }
            return bitmapD;
        }
        if (iOrdinal == 2) {
            if (this.f6730w.size() == 1) {
                double d6 = (((double) ((float) this.f6730w.getDouble(0))) * 3.141592653589793d) / 180.0d;
                float fCos = (float) Math.cos(d6);
                float fSin = (float) Math.sin(d6);
                float f2 = 0.715f - (fCos * 0.715f);
                float f7 = fSin * 0.715f;
                float f10 = 0.072f - (fCos * 0.072f);
                float f11 = 0.213f - (fCos * 0.213f);
                colorMatrix.set(new float[]{((fCos * 0.787f) + 0.213f) - (fSin * 0.213f), f2 - f7, (fSin * 0.928f) + f10, 0.0f, 0.0f, (0.143f * fSin) + f11, (0.14f * fSin) + (0.285f * fCos) + 0.715f, f10 - (0.283f * fSin), 0.0f, 0.0f, f11 - (0.787f * fSin), f2 + f7, (fSin * 0.072f) + (fCos * 0.928f) + 0.072f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
            }
            return bitmapD;
        }
        if (iOrdinal == 3) {
            colorMatrix.set(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2125f, 0.7154f, 0.0721f, 0.0f, 0.0f});
        }
        return FilterUtils.getBitmapWithColorMatrix(colorMatrix, bitmapD);
    }
}
