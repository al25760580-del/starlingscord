package com.horcrux.svg;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends a0 {
    public r0 E;
    public r0 F;
    public int G;
    public int H;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public r0 f6715x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public r0 f6716y;

    @Override // com.horcrux.svg.a0, com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMask(this, this.mName);
        }
    }
}
