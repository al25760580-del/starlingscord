package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends o {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f6722i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f6723v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public q f6724w;

    @Override // com.horcrux.svg.o
    public final Bitmap c(HashMap map, Bitmap bitmap) {
        Bitmap bitmapD = o.d(map, bitmap, this.f6722i);
        Bitmap bitmapD2 = o.d(map, bitmap, this.f6723v);
        if (this.f6724w == q.MULTIPLY) {
            return CustomFilter.apply(bitmapD, bitmapD2, new com.google.firebase.messaging.n(2));
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapD.getWidth(), bitmapD.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        canvas.drawBitmap(bitmapD, 0.0f, 0.0f, paint);
        int iOrdinal = this.f6724w.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        } else if (iOrdinal == 3) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
        } else if (iOrdinal == 4) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DARKEN));
        } else if (iOrdinal == 5) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
        }
        canvas.drawBitmap(bitmapD2, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }
}
