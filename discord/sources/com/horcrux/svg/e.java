package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends VirtualView {
    @Override // com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f2) {
    }

    @Override // com.horcrux.svg.VirtualView
    public final Path getPath(Canvas canvas, Paint paint) {
        return null;
    }

    @Override // com.horcrux.svg.VirtualView
    public final int hitTest(float[] fArr) {
        return -1;
    }

    @Override // com.horcrux.svg.VirtualView
    public final boolean isResponsible() {
        return false;
    }
}
