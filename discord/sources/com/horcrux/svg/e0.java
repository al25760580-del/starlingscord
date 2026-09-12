package com.horcrux.svg;

import android.graphics.Matrix;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends e {
    public static final float[] E = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r0 f6694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r0 f6695e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r0 f6696i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public r0 f6697v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ReadableArray f6698w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6699x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Matrix f6700y;

    @Override // com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        if (this.mName != null) {
            a aVar = new a(1, new r0[]{this.f6694d, this.f6695e, this.f6696i, this.f6697v}, this.f6699x);
            aVar.f6657c = this.f6698w;
            Matrix matrix = this.f6700y;
            if (matrix != null) {
                aVar.f6660f = matrix;
            }
            SvgView svgView = getSvgView();
            if (this.f6699x == 2) {
                aVar.f6661g = svgView.getCanvasBounds();
            }
            svgView.defineBrush(aVar, this.mName);
        }
    }
}
