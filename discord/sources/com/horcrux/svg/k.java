package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends o {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Pattern f6740w = Pattern.compile("[0-9.-]+");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ReadableArray f6741i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f6742v;

    @Override // com.horcrux.svg.o
    public final Bitmap c(HashMap map, Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setFlags(129);
        paint.setStyle(Paint.Style.FILL);
        float f2 = this.f6742v;
        ReadableArray readableArray = this.f6741i;
        if (readableArray.getInt(0) == 0) {
            if (readableArray.size() == 2) {
                int iIntValue = readableArray.getType(1) == ReadableType.Map ? ColorPropConverter.getColor(readableArray.getMap(1), getContext()).intValue() : readableArray.getInt(1);
                paint.setColor((Math.round((iIntValue >>> 24) * f2) << 24) | (iIntValue & 16777215));
            } else {
                paint.setARGB((int) (readableArray.size() > 4 ? readableArray.getDouble(4) * ((double) f2) * 255.0d : f2 * 255.0f), (int) (readableArray.getDouble(1) * 255.0d), (int) (readableArray.getDouble(2) * 255.0d), (int) (readableArray.getDouble(3) * 255.0d));
            }
        }
        canvas.drawPaint(paint);
        return bitmapCreateBitmap;
    }

    public final void e(ReadableMap readableMap) {
        if (readableMap == null) {
            this.f6741i = null;
            invalidate();
            return;
        }
        int i7 = readableMap.getInt("type");
        if (i7 == 0) {
            ReadableType type = readableMap.getType("payload");
            if (type.equals(ReadableType.Number)) {
                this.f6741i = JavaOnlyArray.of(0, Integer.valueOf(readableMap.getInt("payload")));
            } else if (type.equals(ReadableType.Map)) {
                this.f6741i = JavaOnlyArray.of(0, readableMap.getMap("payload"));
            }
        } else if (i7 == 1) {
            this.f6741i = JavaOnlyArray.of(1, readableMap.getString("brushRef"));
        } else {
            this.f6741i = JavaOnlyArray.of(Integer.valueOf(i7));
        }
        invalidate();
    }
}
