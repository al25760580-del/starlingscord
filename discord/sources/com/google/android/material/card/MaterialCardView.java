package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import bh.p;
import kh.g;
import kh.i;
import kh.l;
import kh.m;
import kh.w;
import mf.f;
import oh.a;
import tg.c;
import y0.b;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialCardView extends CardView implements Checkable, w {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int[] f6310w = {R.attr.state_checkable};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f6311x = {R.attr.state_checked};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f6312y = {com.discord.R.attr.state_dragged};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f6313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6314e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f6315i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6316v;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.discord.R.attr.materialCardViewStyle, com.discord.R.style.Widget_MaterialComponents_CardView), attributeSet, com.discord.R.attr.materialCardViewStyle);
        this.f6315i = false;
        this.f6316v = false;
        this.f6314e = true;
        TypedArray typedArrayF = p.f(getContext(), attributeSet, kg.a.f14448u, com.discord.R.attr.materialCardViewStyle, com.discord.R.style.Widget_MaterialComponents_CardView, new int[0]);
        c cVar = new c(this, attributeSet);
        this.f6313d = cVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        i iVar = cVar.f20745c;
        iVar.q(cardBackgroundColor);
        cVar.f20744b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        cVar.l();
        MaterialCardView materialCardView = cVar.f20743a;
        ColorStateList colorStateListT = com.facebook.imagepipeline.nativecode.c.t(materialCardView.getContext(), typedArrayF, 11);
        cVar.f20754n = colorStateListT;
        if (colorStateListT == null) {
            cVar.f20754n = ColorStateList.valueOf(-1);
        }
        cVar.f20750h = typedArrayF.getDimensionPixelSize(12, 0);
        boolean z5 = typedArrayF.getBoolean(0, false);
        cVar.f20759s = z5;
        materialCardView.setLongClickable(z5);
        cVar.f20752l = com.facebook.imagepipeline.nativecode.c.t(materialCardView.getContext(), typedArrayF, 6);
        cVar.g(com.facebook.imagepipeline.nativecode.c.w(materialCardView.getContext(), typedArrayF, 2));
        cVar.f20748f = typedArrayF.getDimensionPixelSize(5, 0);
        cVar.f20747e = typedArrayF.getDimensionPixelSize(4, 0);
        cVar.f20749g = typedArrayF.getInteger(3, 8388661);
        ColorStateList colorStateListT2 = com.facebook.imagepipeline.nativecode.c.t(materialCardView.getContext(), typedArrayF, 7);
        cVar.k = colorStateListT2;
        if (colorStateListT2 == null) {
            cVar.k = ColorStateList.valueOf(io.sentry.config.a.w(com.discord.R.attr.colorControlHighlight, materialCardView));
        }
        ColorStateList colorStateListT3 = com.facebook.imagepipeline.nativecode.c.t(materialCardView.getContext(), typedArrayF, 1);
        colorStateListT3 = colorStateListT3 == null ? ColorStateList.valueOf(0) : colorStateListT3;
        i iVar2 = cVar.f20746d;
        iVar2.q(colorStateListT3);
        RippleDrawable rippleDrawable = cVar.f20755o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(cVar.k);
        }
        iVar.p(materialCardView.getCardElevation());
        float f2 = cVar.f20750h;
        ColorStateList colorStateList = cVar.f20754n;
        iVar2.f14483e.k = f2;
        iVar2.invalidateSelf();
        g gVar = iVar2.f14483e;
        if (gVar.f14467e != colorStateList) {
            gVar.f14467e = colorStateList;
            iVar2.onStateChange(iVar2.getState());
        }
        materialCardView.setBackgroundInternal(cVar.d(iVar));
        Drawable drawableC = cVar.j() ? cVar.c() : iVar2;
        cVar.f20751i = drawableC;
        materialCardView.setForeground(cVar.d(drawableC));
        typedArrayF.recycle();
    }

    @NonNull
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f6313d.f20745c.getBounds());
        return rectF;
    }

    public final void a() {
        c cVar;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (cVar = this.f6313d).f20755o) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i7 = bounds.bottom;
        cVar.f20755o.setBounds(bounds.left, bounds.top, bounds.right, i7 - 1);
        cVar.f20755o.setBounds(bounds.left, bounds.top, bounds.right, i7);
    }

    public final void b(int i7, int i10, int i11, int i12) {
        super.setContentPadding(i7, i10, i11, i12);
    }

    @Override // androidx.cardview.widget.CardView
    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return this.f6313d.f20745c.f14483e.f14466d;
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
        return this.f6313d.f20746d.f14483e.f14466d;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f6313d.j;
    }

    public int getCheckedIconGravity() {
        return this.f6313d.f20749g;
    }

    public int getCheckedIconMargin() {
        return this.f6313d.f20747e;
    }

    public int getCheckedIconSize() {
        return this.f6313d.f20748f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f6313d.f20752l;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f6313d.f20744b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f6313d.f20744b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f6313d.f20744b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f6313d.f20744b.top;
    }

    public float getProgress() {
        return this.f6313d.f20745c.f14483e.j;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f6313d.f20745c.k();
    }

    public ColorStateList getRippleColor() {
        return this.f6313d.k;
    }

    @NonNull
    public m getShapeAppearanceModel() {
        return this.f6313d.f20753m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f6313d.f20754n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f6313d.f20754n;
    }

    public int getStrokeWidth() {
        return this.f6313d.f20750h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f6315i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c cVar = this.f6313d;
        cVar.k();
        com.facebook.imagepipeline.nativecode.c.J(this, cVar.f20745c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + 3);
        c cVar = this.f6313d;
        if (cVar != null && cVar.f20759s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f6310w);
        }
        if (this.f6315i) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f6311x);
        }
        if (this.f6316v) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f6312y);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.f6315i);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        c cVar = this.f6313d;
        accessibilityNodeInfo.setCheckable(cVar != null && cVar.f20759s);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f6315i);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f6313d.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f6314e) {
            c cVar = this.f6313d;
            if (!cVar.f20758r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                cVar.f20758r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i7) {
        this.f6313d.f20745c.q(ColorStateList.valueOf(i7));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f2) {
        super.setCardElevation(f2);
        c cVar = this.f6313d;
        cVar.f20745c.p(cVar.f20743a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        i iVar = this.f6313d.f20746d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        iVar.q(colorStateList);
    }

    public void setCheckable(boolean z5) {
        this.f6313d.f20759s = z5;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z5) {
        if (this.f6315i != z5) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f6313d.g(drawable);
    }

    public void setCheckedIconGravity(int i7) {
        c cVar = this.f6313d;
        if (cVar.f20749g != i7) {
            cVar.f20749g = i7;
            MaterialCardView materialCardView = cVar.f20743a;
            cVar.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i7) {
        this.f6313d.f20747e = i7;
    }

    public void setCheckedIconMarginResource(int i7) {
        if (i7 != -1) {
            this.f6313d.f20747e = getResources().getDimensionPixelSize(i7);
        }
    }

    public void setCheckedIconResource(int i7) {
        this.f6313d.g(f.u(getContext(), i7));
    }

    public void setCheckedIconSize(int i7) {
        this.f6313d.f20748f = i7;
    }

    public void setCheckedIconSizeResource(int i7) {
        if (i7 != 0) {
            this.f6313d.f20748f = getResources().getDimensionPixelSize(i7);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        c cVar = this.f6313d;
        cVar.f20752l = colorStateList;
        Drawable drawable = cVar.j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z5) {
        super.setClickable(z5);
        c cVar = this.f6313d;
        if (cVar != null) {
            cVar.k();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public final void setContentPadding(int i7, int i10, int i11, int i12) {
        c cVar = this.f6313d;
        cVar.f20744b.set(i7, i10, i11, i12);
        cVar.l();
    }

    public void setDragged(boolean z5) {
        if (this.f6316v != z5) {
            this.f6316v = z5;
            refreshDrawableState();
            a();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f2) {
        super.setMaxCardElevation(f2);
        this.f6313d.m();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z5) {
        super.setPreventCornerOverlap(z5);
        c cVar = this.f6313d;
        cVar.m();
        cVar.l();
    }

    public void setProgress(float f2) {
        c cVar = this.f6313d;
        cVar.f20745c.r(f2);
        i iVar = cVar.f20746d;
        if (iVar != null) {
            iVar.r(f2);
        }
        i iVar2 = cVar.f20757q;
        if (iVar2 != null) {
            iVar2.r(f2);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f2) {
        super.setRadius(f2);
        c cVar = this.f6313d;
        l lVarG = cVar.f20753m.g();
        lVarG.b(f2);
        cVar.h(lVarG.a());
        cVar.f20751i.invalidateSelf();
        if (cVar.i() || (cVar.f20743a.getPreventCornerOverlap() && !cVar.f20745c.n())) {
            cVar.l();
        }
        if (cVar.i()) {
            cVar.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        c cVar = this.f6313d;
        cVar.k = colorStateList;
        RippleDrawable rippleDrawable = cVar.f20755o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i7) {
        ColorStateList colorStateListC = b.c(getContext(), i7);
        c cVar = this.f6313d;
        cVar.k = colorStateListC;
        RippleDrawable rippleDrawable = cVar.f20755o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListC);
        }
    }

    @Override // kh.w
    public void setShapeAppearanceModel(@NonNull m mVar) {
        setClipToOutline(mVar.f(getBoundsAsRectF()));
        this.f6313d.h(mVar);
    }

    public void setStrokeColor(int i7) {
        setStrokeColor(ColorStateList.valueOf(i7));
    }

    public void setStrokeWidth(int i7) {
        c cVar = this.f6313d;
        if (i7 != cVar.f20750h) {
            cVar.f20750h = i7;
            i iVar = cVar.f20746d;
            ColorStateList colorStateList = cVar.f20754n;
            iVar.f14483e.k = i7;
            iVar.invalidateSelf();
            g gVar = iVar.f14483e;
            if (gVar.f14467e != colorStateList) {
                gVar.f14467e = colorStateList;
                iVar.onStateChange(iVar.getState());
            }
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z5) {
        super.setUseCompatPadding(z5);
        c cVar = this.f6313d;
        cVar.m();
        cVar.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        c cVar = this.f6313d;
        if (cVar != null && cVar.f20759s && isEnabled()) {
            this.f6315i = !this.f6315i;
            refreshDrawableState();
            a();
            cVar.f(this.f6315i, true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        c cVar = this.f6313d;
        if (cVar.f20754n != colorStateList) {
            cVar.f20754n = colorStateList;
            i iVar = cVar.f20746d;
            iVar.f14483e.k = cVar.f20750h;
            iVar.invalidateSelf();
            g gVar = iVar.f14483e;
            if (gVar.f14467e != colorStateList) {
                gVar.f14467e = colorStateList;
                iVar.onStateChange(iVar.getState());
            }
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f6313d.f20745c.q(colorStateList);
    }

    public void setOnCheckedChangeListener(tg.a aVar) {
    }
}
