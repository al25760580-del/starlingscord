package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends RenderableView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r0 f6711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r0 f6712e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r0 f6713i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public r0 f6714v;

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.f6711d);
        double dRelativeOnHeight = relativeOnHeight(this.f6712e);
        double dRelativeOnWidth2 = relativeOnWidth(this.f6713i);
        double dRelativeOnHeight2 = relativeOnHeight(this.f6714v);
        double d6 = dRelativeOnWidth - dRelativeOnWidth2;
        double d7 = dRelativeOnHeight - dRelativeOnHeight2;
        double d8 = dRelativeOnWidth + dRelativeOnWidth2;
        double d9 = dRelativeOnHeight + dRelativeOnHeight2;
        path.addOval(new RectF((float) d6, (float) d7, (float) d8, (float) d9), Path.Direction.CW);
        ArrayList<h0> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new h0(3, new k0[]{new k0(dRelativeOnWidth, d7)}));
        this.elements.add(new h0(4, new k0[]{new k0(dRelativeOnWidth, d7), new k0(d8, dRelativeOnHeight)}));
        this.elements.add(new h0(4, new k0[]{new k0(d8, dRelativeOnHeight), new k0(dRelativeOnWidth, d9)}));
        this.elements.add(new h0(4, new k0[]{new k0(dRelativeOnWidth, d9), new k0(d6, dRelativeOnHeight)}));
        this.elements.add(new h0(4, new k0[]{new k0(d6, dRelativeOnHeight), new k0(dRelativeOnWidth, d7)}));
        return path;
    }
}
