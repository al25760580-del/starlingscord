package nh;

import android.graphics.Canvas;
import android.graphics.Region;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends g {
    @Override // kh.i
    public final void g(Canvas canvas) {
        if (this.f16844e0.f16842r.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f16844e0.f16842r);
        } else {
            canvas.clipRect(this.f16844e0.f16842r, Region.Op.DIFFERENCE);
        }
        super.g(canvas);
        canvas.restore();
    }
}
