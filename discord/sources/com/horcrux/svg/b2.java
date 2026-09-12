package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: loaded from: classes3.dex */
public final class b2 extends f2 {
    public String N;
    public int O;
    public int P;
    public r0 Q;

    @Override // com.horcrux.svg.f2, com.horcrux.svg.a0, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f2) {
        c(canvas, paint, f2);
    }

    @Override // com.horcrux.svg.a0
    public final void g() {
    }

    @Override // com.horcrux.svg.f2, com.horcrux.svg.a0, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final Path getPath(Canvas canvas, Paint paint) {
        return j(canvas, paint);
    }

    @Override // com.horcrux.svg.f2, com.horcrux.svg.a0
    public final void h() {
    }

    @Override // com.horcrux.svg.f2
    public final void l(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (!str.equals("align") && !str.equals("stretch")) {
            throw new IllegalArgumentException("No enum constant com.horcrux.svg.TextProperties.TextPathMethod.".concat(str));
        }
        invalidate();
    }
}
