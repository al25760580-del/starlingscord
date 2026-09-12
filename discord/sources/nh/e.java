package nh;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends kh.g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RectF f16842r;

    public e(kh.m mVar, RectF rectF) {
        super(mVar);
        this.f16842r = rectF;
    }

    @Override // kh.g, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        f fVar = new f(this);
        fVar.f16844e0 = this;
        fVar.invalidateSelf();
        return fVar;
    }

    public e(e eVar) {
        super(eVar);
        this.f16842r = eVar.f16842r;
    }
}
