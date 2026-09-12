package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.discord.R;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f0 f979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f982g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f983h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f984i;

    public g0(f0 f0Var) {
        super(f0Var);
        this.f981f = null;
        this.f982g = null;
        this.f983h = false;
        this.f984i = false;
        this.f979d = f0Var;
    }

    @Override // androidx.appcompat.widget.b0
    public final void a(AttributeSet attributeSet, int i7) {
        super.a(attributeSet, R.attr.seekBarStyle);
        f0 f0Var = this.f979d;
        Context context = f0Var.getContext();
        int[] iArr = h.a.f10259g;
        e4.m mVarE = e4.m.E(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) mVarE.f7994i;
        androidx.core.view.u0.o(f0Var, f0Var.getContext(), iArr, attributeSet, (TypedArray) mVarE.f7994i, R.attr.seekBarStyle, 0);
        Drawable drawableY = mVarE.y(0);
        if (drawableY != null) {
            f0Var.setThumb(drawableY);
        }
        Drawable drawableX = mVarE.x(1);
        Drawable drawable = this.f980e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f980e = drawableX;
        if (drawableX != null) {
            drawableX.setCallback(f0Var);
            drawableX.setLayoutDirection(f0Var.getLayoutDirection());
            if (drawableX.isStateful()) {
                drawableX.setState(f0Var.getDrawableState());
            }
            c();
        }
        f0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.f982g = n1.c(typedArray.getInt(3, -1), this.f982g);
            this.f984i = true;
        }
        if (typedArray.hasValue(2)) {
            this.f981f = mVarE.w(2);
            this.f983h = true;
        }
        mVarE.H();
        c();
    }

    public final void c() {
        Drawable drawable = this.f980e;
        if (drawable != null) {
            if (this.f983h || this.f984i) {
                Drawable drawableMutate = drawable.mutate();
                this.f980e = drawableMutate;
                if (this.f983h) {
                    drawableMutate.setTintList(this.f981f);
                }
                if (this.f984i) {
                    this.f980e.setTintMode(this.f982g);
                }
                if (this.f980e.isStateful()) {
                    this.f980e.setState(this.f979d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.f980e != null) {
            f0 f0Var = this.f979d;
            int max = f0Var.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f980e.getIntrinsicWidth();
                int intrinsicHeight = this.f980e.getIntrinsicHeight();
                int i7 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i10 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f980e.setBounds(-i7, -i10, i7, i10);
                float width = ((f0Var.getWidth() - f0Var.getPaddingLeft()) - f0Var.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(f0Var.getPaddingLeft(), f0Var.getHeight() / 2);
                for (int i11 = 0; i11 <= max; i11++) {
                    this.f980e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
