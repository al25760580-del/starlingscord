package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ScalingUtils$ScaleType f4683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4684e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4685i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Matrix f4686v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Matrix f4687w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Drawable drawable, ScalingUtils$ScaleType scaleType) {
        super(drawable);
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.f4687w = new Matrix();
        this.f4683d = scaleType;
    }

    @Override // com.facebook.drawee.drawable.e, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Drawable current = getCurrent();
        if (current != null && (this.f4684e != current.getIntrinsicWidth() || this.f4685i != current.getIntrinsicHeight())) {
            h();
        }
        if (this.f4686v == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.f4686v);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // com.facebook.drawee.drawable.e, com.facebook.drawee.drawable.TransformCallback
    public final void getTransform(Matrix transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        getParentTransform(transform);
        Drawable current = getCurrent();
        if (current != null && (this.f4684e != current.getIntrinsicWidth() || this.f4685i != current.getIntrinsicHeight())) {
            h();
        }
        Matrix matrix = this.f4686v;
        if (matrix != null) {
            transform.preConcat(matrix);
        }
    }

    public final void h() {
        Drawable current = getCurrent();
        if (current == null) {
            this.f4685i = 0;
            this.f4684e = 0;
            this.f4686v = null;
            return;
        }
        Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f4684e = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f4685i = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f4686v = null;
            return;
        }
        if (intrinsicWidth == iWidth && intrinsicHeight == iHeight) {
            current.setBounds(bounds);
            this.f4686v = null;
        } else {
            if (this.f4683d == o.f4695i) {
                current.setBounds(bounds);
                this.f4686v = null;
                return;
            }
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            Matrix matrix = this.f4687w;
            matrix.reset();
            this.f4683d.getTransform(matrix, bounds, intrinsicWidth, intrinsicHeight, 0.5f, 0.5f);
            this.f4686v = matrix;
        }
    }

    @Override // com.facebook.drawee.drawable.e, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        h();
    }

    @Override // com.facebook.drawee.drawable.e
    public final Drawable setCurrent(Drawable drawable) {
        Drawable current = super.setCurrent(drawable);
        h();
        return current;
    }
}
