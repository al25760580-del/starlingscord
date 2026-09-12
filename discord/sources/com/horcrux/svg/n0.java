package com.horcrux.svg;

import android.graphics.Matrix;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends e {
    public static final float[] G = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    public int E;
    public Matrix F;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r0 f6762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r0 f6763e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r0 f6764i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public r0 f6765v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public r0 f6766w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public r0 f6767x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ReadableArray f6768y;

    @Override // com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        if (this.mName != null) {
            a aVar = new a(2, new r0[]{this.f6762d, this.f6763e, this.f6764i, this.f6765v, this.f6766w, this.f6767x}, this.E);
            aVar.f6657c = this.f6768y;
            Matrix matrix = this.F;
            if (matrix != null) {
                aVar.f6660f = matrix;
            }
            SvgView svgView = getSvgView();
            if (this.E == 2) {
                aVar.f6661g = svgView.getCanvasBounds();
            }
            svgView.defineBrush(aVar, this.mName);
        }
    }
}
