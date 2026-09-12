package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n implements ScalingUtils$ScaleType {
    @Override // com.facebook.drawee.drawable.ScalingUtils$ScaleType
    public Matrix getTransform(Matrix matrix, Rect rect, int i7, int i10, float f2, float f7) {
        getTransformImpl(matrix, rect, i7, i10, f2, f7, rect.width() / i7, rect.height() / i10);
        return matrix;
    }

    public abstract void getTransformImpl(Matrix matrix, Rect rect, int i7, int i10, float f2, float f7, float f10, float f11);
}
