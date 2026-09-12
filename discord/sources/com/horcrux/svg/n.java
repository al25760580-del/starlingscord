package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends o {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f6759i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public r0 f6760v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public r0 f6761w;

    @Override // com.horcrux.svg.o
    public final Bitmap c(HashMap map, Bitmap bitmap) {
        Bitmap bitmapD = o.d(map, bitmap, this.f6759i);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        r0 r0Var = this.f6760v;
        float fRelativeOnWidth = r0Var != null ? (float) relativeOnWidth(r0Var) : 0.0f;
        r0 r0Var2 = this.f6761w;
        RectF rectF = new RectF(0.0f, 0.0f, fRelativeOnWidth, r0Var2 != null ? (float) relativeOnHeight(r0Var2) : 0.0f);
        getSvgView().getCtm().mapRect(rectF);
        float fWidth = rectF.left;
        if (fWidth >= 0.0f) {
            fWidth = rectF.width();
        }
        float fHeight = rectF.top;
        if (fHeight >= 0.0f) {
            fHeight = rectF.height();
        }
        canvas.drawBitmap(bitmapD, fWidth, fHeight, (Paint) null);
        return bitmapCreateBitmap;
    }
}
