package com.horcrux.svg;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends o {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f6745i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f6746v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f6747w;

    @Override // com.horcrux.svg.o
    public final Bitmap c(HashMap map, Bitmap bitmap) {
        Bitmap bitmapD = o.d(map, bitmap, this.f6745i);
        Context context = getContext();
        float fMax = Math.max(this.f6746v, this.f6747w) * 2.0f;
        if (fMax <= 0.0f) {
            return bitmapD;
        }
        float fMin = Math.min(fMax, 25.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapD);
        RenderScript renderScriptCreate = RenderScript.create(context);
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapD);
        Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
        scriptIntrinsicBlurCreate.setRadius(fMin);
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
        allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
        allocationCreateFromBitmap.destroy();
        allocationCreateFromBitmap2.destroy();
        renderScriptCreate.destroy();
        return Bitmap.createScaledBitmap(bitmapCreateBitmap, bitmapD.getWidth(), bitmapD.getHeight(), false);
    }
}
