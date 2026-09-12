package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends k {
    @Override // com.facebook.drawee.drawable.k, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        sa.a.w();
        if (!this.f4677e && !this.f4678i && this.f4679v <= 0.0f) {
            super.draw(canvas);
            sa.a.w();
            return;
        }
        i();
        h();
        canvas.clipPath(this.f4680w);
        super.draw(canvas);
        sa.a.w();
    }
}
