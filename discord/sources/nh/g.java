package nh;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends kh.i {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final /* synthetic */ int f16843f0 = 0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public e f16844e0;

    @Override // kh.i, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f16844e0 = new e(this.f16844e0);
        return this;
    }

    public final void y(float f2, float f7, float f10, float f11) {
        RectF rectF = this.f16844e0.f16842r;
        if (f2 == rectF.left && f7 == rectF.top && f10 == rectF.right && f11 == rectF.bottom) {
            return;
        }
        rectF.set(f2, f7, f10, f11);
        invalidateSelf();
    }
}
