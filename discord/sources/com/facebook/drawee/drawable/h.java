package com.facebook.drawee.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends k {
    public static final /* synthetic */ int a0 = 0;
    public final Paint V;
    public final Paint W;
    public final Bitmap X;
    public WeakReference Y;
    public RectF Z;

    public h(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.V = paint2;
        Paint paint3 = new Paint(1);
        this.W = paint3;
        this.Z = null;
        this.X = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
    }

    @Override // com.facebook.drawee.drawable.k, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Shader shader;
        sa.a.w();
        if (!((this.f4677e || this.f4678i || this.f4679v > 0.0f) && this.X != null)) {
            super.draw(canvas);
            sa.a.w();
            return;
        }
        i();
        h();
        WeakReference weakReference = this.Y;
        Paint paint = this.V;
        Bitmap bitmap = this.X;
        if (weakReference == null || weakReference.get() != bitmap) {
            this.Y = new WeakReference(bitmap);
            if (bitmap != null) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                this.f4681x = true;
            }
        }
        if (this.f4681x && (shader = paint.getShader()) != null) {
            shader.setLocalMatrix(this.Q);
            this.f4681x = false;
        }
        paint.setFilterBitmap(this.S);
        int iSave = canvas.save();
        canvas.concat(this.P);
        RectF rectF = this.Z;
        Path path = this.f4680w;
        if (rectF != null) {
            int iSave2 = canvas.save();
            canvas.clipRect(this.Z);
            canvas.drawPath(path, paint);
            canvas.restoreToCount(iSave2);
        } else {
            canvas.drawPath(path, paint);
        }
        float f2 = this.f4679v;
        if (f2 > 0.0f) {
            Paint paint2 = this.W;
            paint2.setStrokeWidth(f2);
            paint2.setColor(mf.f.B(this.f4682y, paint.getAlpha()));
            canvas.drawPath(this.E, paint2);
        }
        canvas.restoreToCount(iSave);
        sa.a.w();
    }

    @Override // com.facebook.drawee.drawable.k
    public final void i() {
        super.i();
        if (this.Z == null) {
            this.Z = new RectF();
        }
        this.Q.mapRect(this.Z, this.J);
    }

    @Override // com.facebook.drawee.drawable.k, android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        super.setAlpha(i7);
        Paint paint = this.V;
        if (i7 != paint.getAlpha()) {
            paint.setAlpha(i7);
            super.setAlpha(i7);
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.k, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.V.setColorFilter(colorFilter);
    }

    @Override // com.facebook.drawee.drawable.k, com.facebook.drawee.drawable.g
    public final void d() {
    }
}
