package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f4657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4658e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f4659i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Matrix f4660v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RectF f4661w;

    public f(BitmapDrawable bitmapDrawable, int i7, int i10) {
        super(bitmapDrawable);
        this.f4657d = new Matrix();
        this.f4658e = i7 - (i7 % 90);
        this.f4659i = (i10 < 0 || i10 > 8) ? 0 : i10;
        this.f4660v = new Matrix();
        this.f4661w = new RectF();
    }

    @Override // com.facebook.drawee.drawable.e, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i7;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f4658e <= 0 && ((i7 = this.f4659i) == 0 || i7 == 1)) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.concat(this.f4657d);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // com.facebook.drawee.drawable.e, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i7 = this.f4659i;
        return (i7 == 5 || i7 == 7 || this.f4658e % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    @Override // com.facebook.drawee.drawable.e, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i7 = this.f4659i;
        return (i7 == 5 || i7 == 7 || this.f4658e % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    @Override // com.facebook.drawee.drawable.e, com.facebook.drawee.drawable.TransformCallback
    public final void getTransform(Matrix transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        getParentTransform(transform);
        Matrix matrix = this.f4657d;
        if (matrix.isIdentity()) {
            return;
        }
        transform.preConcat(matrix);
    }

    @Override // com.facebook.drawee.drawable.e, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        int i7 = this.f4659i;
        int i10 = this.f4658e;
        if (i10 <= 0 && (i7 == 0 || i7 == 1)) {
            current.setBounds(bounds);
            return;
        }
        Matrix matrix = this.f4657d;
        if (i7 == 2) {
            matrix.setScale(-1.0f, 1.0f);
        } else if (i7 == 7) {
            matrix.setRotate(270.0f, bounds.centerX(), bounds.centerY());
            matrix.postScale(-1.0f, 1.0f);
        } else if (i7 == 4) {
            matrix.setScale(1.0f, -1.0f);
        } else if (i7 != 5) {
            matrix.setRotate(i10, bounds.centerX(), bounds.centerY());
        } else {
            matrix.setRotate(270.0f, bounds.centerX(), bounds.centerY());
            matrix.postScale(1.0f, -1.0f);
        }
        Matrix matrix2 = this.f4660v;
        matrix2.reset();
        matrix.invert(matrix2);
        RectF rectF = this.f4661w;
        rectF.set(bounds);
        matrix2.mapRect(rectF);
        current.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
