package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends RenderableView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r0 f6683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r0 f6684e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r0 f6685i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public r0 f6686v;

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.f6683d);
        double dRelativeOnHeight = relativeOnHeight(this.f6684e);
        double dRelativeOnWidth2 = relativeOnWidth(this.f6685i);
        double dRelativeOnHeight2 = relativeOnHeight(this.f6686v);
        path.moveTo((float) dRelativeOnWidth, (float) dRelativeOnHeight);
        path.lineTo((float) dRelativeOnWidth2, (float) dRelativeOnHeight2);
        ArrayList<h0> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new h0(3, new k0[]{new k0(dRelativeOnWidth, dRelativeOnHeight)}));
        this.elements.add(new h0(4, new k0[]{new k0(dRelativeOnWidth2, dRelativeOnHeight2)}));
        return path;
    }
}
