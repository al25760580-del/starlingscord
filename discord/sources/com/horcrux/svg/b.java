package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends RenderableView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r0 f6668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r0 f6669e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r0 f6670i;

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.f6668d);
        double dRelativeOnHeight = relativeOnHeight(this.f6669e);
        double dRelativeOnOther = relativeOnOther(this.f6670i);
        path.addCircle((float) dRelativeOnWidth, (float) dRelativeOnHeight, (float) dRelativeOnOther, Path.Direction.CW);
        ArrayList<h0> arrayList = new ArrayList<>();
        this.elements = arrayList;
        double d6 = dRelativeOnHeight - dRelativeOnOther;
        arrayList.add(new h0(3, new k0[]{new k0(dRelativeOnWidth, d6)}));
        double d7 = dRelativeOnWidth + dRelativeOnOther;
        this.elements.add(new h0(4, new k0[]{new k0(dRelativeOnWidth, d6), new k0(d7, dRelativeOnHeight)}));
        double d8 = dRelativeOnHeight + dRelativeOnOther;
        this.elements.add(new h0(4, new k0[]{new k0(d7, dRelativeOnHeight), new k0(dRelativeOnWidth, d8)}));
        double d9 = dRelativeOnWidth - dRelativeOnOther;
        this.elements.add(new h0(4, new k0[]{new k0(dRelativeOnWidth, d8), new k0(d9, dRelativeOnHeight)}));
        this.elements.add(new h0(4, new k0[]{new k0(d9, dRelativeOnHeight), new k0(dRelativeOnWidth, d6)}));
        return path;
    }
}
