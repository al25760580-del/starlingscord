package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends e {
    @Override // com.horcrux.svg.e, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f2) {
    }

    @Override // com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
    }
}
