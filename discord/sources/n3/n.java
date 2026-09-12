package n3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class n extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f16344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f16345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f16346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bitmap f16348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f16349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f16350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16351i;
    public boolean j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint f16352l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f16343a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new p(this);
    }
}
