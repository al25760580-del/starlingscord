package com.horcrux.svg;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends a0 {
    public r0 E;
    public r0 F;
    public String G;
    public String H;
    public float I;
    public float J;
    public float K;
    public float L;
    public String M;
    public int N;
    public Matrix O;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public r0 f6707x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public r0 f6708y;

    @Override // com.horcrux.svg.a0, com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMarker(this, this.mName);
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                if (childAt instanceof VirtualView) {
                    ((VirtualView) childAt).saveDefinition();
                }
            }
        }
    }
}
