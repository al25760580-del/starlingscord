package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends RenderableView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r0 f6771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r0 f6772e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r0 f6773i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public r0 f6774v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public r0 f6775w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public r0 f6776x;

    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0066  */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final Path getPath(Canvas canvas, Paint paint) {
        double dRelativeOnWidth;
        double dRelativeOnHeight;
        double d6;
        double d7;
        Path path = new Path();
        double dRelativeOnWidth2 = relativeOnWidth(this.f6771d);
        double dRelativeOnHeight2 = relativeOnHeight(this.f6772e);
        double dRelativeOnWidth3 = relativeOnWidth(this.f6773i);
        double dRelativeOnHeight3 = relativeOnHeight(this.f6774v);
        r0 r0Var = this.f6775w;
        if (r0Var == null && this.f6776x == null) {
            path.addRect((float) dRelativeOnWidth2, (float) dRelativeOnHeight2, (float) (dRelativeOnWidth2 + dRelativeOnWidth3), (float) (dRelativeOnHeight2 + dRelativeOnHeight3), Path.Direction.CW);
            path.close();
        } else {
            if (r0Var == null) {
                dRelativeOnWidth = relativeOnHeight(this.f6776x);
            } else {
                if (this.f6776x == null) {
                    dRelativeOnWidth = relativeOnWidth(r0Var);
                } else {
                    dRelativeOnWidth = relativeOnWidth(r0Var);
                    dRelativeOnHeight = relativeOnHeight(this.f6776x);
                }
                d6 = dRelativeOnWidth3 / 2.0d;
                if (dRelativeOnWidth > d6) {
                    dRelativeOnWidth = d6;
                }
                d7 = dRelativeOnHeight3 / 2.0d;
                if (dRelativeOnHeight > d7) {
                    dRelativeOnHeight = d7;
                }
                path.addRoundRect((float) dRelativeOnWidth2, (float) dRelativeOnHeight2, (float) (dRelativeOnWidth2 + dRelativeOnWidth3), (float) (dRelativeOnHeight2 + dRelativeOnHeight3), (float) dRelativeOnWidth, (float) dRelativeOnHeight, Path.Direction.CW);
            }
            dRelativeOnHeight = dRelativeOnWidth;
            d6 = dRelativeOnWidth3 / 2.0d;
            if (dRelativeOnWidth > d6) {
                dRelativeOnWidth = d6;
            }
            d7 = dRelativeOnHeight3 / 2.0d;
            if (dRelativeOnHeight > d7) {
                dRelativeOnHeight = d7;
            }
            path.addRoundRect((float) dRelativeOnWidth2, (float) dRelativeOnHeight2, (float) (dRelativeOnWidth2 + dRelativeOnWidth3), (float) (dRelativeOnHeight2 + dRelativeOnHeight3), (float) dRelativeOnWidth, (float) dRelativeOnHeight, Path.Direction.CW);
        }
        ArrayList<h0> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new h0(3, new k0[]{new k0(dRelativeOnWidth2, dRelativeOnHeight2)}));
        double d8 = dRelativeOnWidth3 + dRelativeOnWidth2;
        this.elements.add(new h0(4, new k0[]{new k0(d8, dRelativeOnHeight2)}));
        double d9 = dRelativeOnHeight2 + dRelativeOnHeight3;
        this.elements.add(new h0(4, new k0[]{new k0(d8, d9)}));
        this.elements.add(new h0(4, new k0[]{new k0(dRelativeOnWidth2, d9)}));
        this.elements.add(new h0(4, new k0[]{new k0(dRelativeOnWidth2, dRelativeOnHeight2)}));
        return path;
    }
}
