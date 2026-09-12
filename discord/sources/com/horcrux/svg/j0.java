package com.horcrux.svg;

import android.graphics.Matrix;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends a0 {
    public static final float[] P = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    public r0 E;
    public r0 F;
    public int G;
    public int H;
    public float I;
    public float J;
    public float K;
    public float L;
    public String M;
    public int N;
    public Matrix O;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public r0 f6738x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public r0 f6739y;

    @Override // com.horcrux.svg.a0, com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        if (this.mName != null) {
            a aVar = new a(3, new r0[]{this.f6738x, this.f6739y, this.E, this.F}, this.G);
            aVar.f6659e = this.H == 1;
            aVar.f6662h = this;
            Matrix matrix = this.O;
            if (matrix != null) {
                aVar.f6660f = matrix;
            }
            SvgView svgView = getSvgView();
            if (this.G == 2 || this.H == 2) {
                aVar.f6661g = svgView.getCanvasBounds();
            }
            svgView.defineBrush(aVar, this.mName);
        }
    }
}
