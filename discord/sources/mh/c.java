package mh;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bh.p;
import com.discord.R;
import kh.i;
import kh.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends FrameLayout {
    public static final b F = new b();
    public PorterDuff.Mode E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f15787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15788e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f15789i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f15790v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f15791w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f15792x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ColorStateList f15793y;

    public c(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(oh.a.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, kg.a.J);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.f15788e = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f15787d = m.c(context2, attributeSet, 0, 0).a();
        }
        this.f15789i = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(com.facebook.imagepipeline.nativecode.c.t(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(p.h(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f15790v = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f15791w = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f15792x = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(F);
        setFocusable(true);
        if (getBackground() == null) {
            int iN = io.sentry.config.a.N(io.sentry.config.a.w(R.attr.colorSurface, this), io.sentry.config.a.w(R.attr.colorOnSurface, this), getBackgroundOverlayColorAlpha());
            m mVar = this.f15787d;
            if (mVar != null) {
                int i7 = d.f15794a;
                i iVar = new i(mVar);
                iVar.q(ColorStateList.valueOf(iN));
                drawable = iVar;
            } else {
                Resources resources = getResources();
                int i10 = d.f15794a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iN);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.f15793y;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
            setBackground(drawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f15790v;
    }

    public int getAnimationMode() {
        return this.f15788e;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f15789i;
    }

    public int getMaxInlineActionWidth() {
        return this.f15792x;
    }

    public int getMaxWidth() {
        return this.f15791w;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        super.onLayout(z5, i7, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int i11 = this.f15791w;
        if (i11 <= 0 || getMeasuredWidth() <= i11) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), i10);
    }

    public void setAnimationMode(int i7) {
        this.f15788e = i7;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f15793y != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f15793y);
            drawable.setTintMode(this.E);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f15793y = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.E);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.E = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : F);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(d dVar) {
    }
}
