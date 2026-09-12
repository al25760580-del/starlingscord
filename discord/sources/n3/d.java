package n3;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f16301a;

    public d(Drawable.ConstantState constantState) {
        this.f16301a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f16301a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f16301a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        f fVar = new f(null, 0);
        Drawable drawableNewDrawable = this.f16301a.newDrawable();
        fVar.f16307d = drawableNewDrawable;
        drawableNewDrawable.setCallback(fVar.f16306x);
        return fVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        f fVar = new f(null, 0);
        Drawable drawableNewDrawable = this.f16301a.newDrawable(resources);
        fVar.f16307d = drawableNewDrawable;
        drawableNewDrawable.setCallback(fVar.f16306x);
        return fVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        f fVar = new f(null, 0);
        Drawable drawableNewDrawable = this.f16301a.newDrawable(resources, theme);
        fVar.f16307d = drawableNewDrawable;
        drawableNewDrawable.setCallback(fVar.f16306x);
        return fVar;
    }
}
