package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public final class z1 extends a0 {
    public float E;
    public float F;
    public String G;
    public int H;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f6853x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f6854y;

    @Override // com.horcrux.svg.a0, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f2) {
        saveDefinition();
    }

    public final void j(Canvas canvas, Paint paint, float f2, float f7, float f10) {
        if (this.G != null) {
            float f11 = this.f6853x;
            float f12 = this.mScale;
            float f13 = this.f6854y;
            canvas.concat(a5.l0.C(new RectF(f11 * f12, f13 * f12, (f11 + this.E) * f12, (f13 + this.F) * f12), new RectF(0.0f, 0.0f, f7, f10), this.G, this.H));
            super.draw(canvas, paint, f2);
        }
    }
}
