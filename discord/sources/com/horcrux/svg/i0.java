package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends RenderableView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Path f6731d;

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final Path getPath(Canvas canvas, Paint paint) {
        return this.f6731d;
    }
}
