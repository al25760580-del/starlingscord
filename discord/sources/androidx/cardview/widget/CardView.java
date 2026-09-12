package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = {R.attr.colorBackground};
    private static final CardViewImpl IMPL = new b();
    private final CardViewDelegate mCardViewDelegate;
    private boolean mCompatPadding;
    final Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    final Rect mShadowBounds;
    int mUserSetMinHeight;
    int mUserSetMinWidth;

    public CardView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.discord.R.attr.cardViewStyle);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return IMPL.g(this.mCardViewDelegate);
    }

    public float getCardElevation() {
        return IMPL.b(this.mCardViewDelegate);
    }

    public int getContentPaddingBottom() {
        return this.mContentPadding.bottom;
    }

    public int getContentPaddingLeft() {
        return this.mContentPadding.left;
    }

    public int getContentPaddingRight() {
        return this.mContentPadding.right;
    }

    public int getContentPaddingTop() {
        return this.mContentPadding.top;
    }

    public float getMaxCardElevation() {
        return IMPL.f(this.mCardViewDelegate);
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public float getRadius() {
        return IMPL.c(this.mCardViewDelegate);
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        CardViewImpl cardViewImpl = IMPL;
        if (cardViewImpl instanceof b) {
            super.onMeasure(i7, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i7);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i7 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(cardViewImpl.j(this.mCardViewDelegate)), View.MeasureSpec.getSize(i7)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i10);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(cardViewImpl.i(this.mCardViewDelegate)), View.MeasureSpec.getSize(i10)), mode2);
        }
        super.onMeasure(i7, i10);
    }

    public void setCardBackgroundColor(int i7) {
        IMPL.m(this.mCardViewDelegate, ColorStateList.valueOf(i7));
    }

    public void setCardElevation(float f2) {
        IMPL.e(this.mCardViewDelegate, f2);
    }

    public void setContentPadding(int i7, int i10, int i11, int i12) {
        this.mContentPadding.set(i7, i10, i11, i12);
        IMPL.h(this.mCardViewDelegate);
    }

    public void setMaxCardElevation(float f2) {
        IMPL.n(this.mCardViewDelegate, f2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i7) {
        this.mUserSetMinHeight = i7;
        super.setMinimumHeight(i7);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i7) {
        this.mUserSetMinWidth = i7;
        super.setMinimumWidth(i7);
    }

    @Override // android.view.View
    public void setPadding(int i7, int i10, int i11, int i12) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i7, int i10, int i11, int i12) {
    }

    public void setPreventCornerOverlap(boolean z5) {
        if (z5 != this.mPreventCornerOverlap) {
            this.mPreventCornerOverlap = z5;
            IMPL.l(this.mCardViewDelegate);
        }
    }

    public void setRadius(float f2) {
        IMPL.a(this.mCardViewDelegate, f2);
    }

    public void setUseCompatPadding(boolean z5) {
        if (this.mCompatPadding != z5) {
            this.mCompatPadding = z5;
            IMPL.d(this.mCardViewDelegate);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i7) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i7);
        Rect rect = new Rect();
        this.mContentPadding = rect;
        this.mShadowBounds = new Rect();
        a aVar = new a(this);
        this.mCardViewDelegate = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.a.f19123a, i7, com.discord.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.discord.R.color.cardview_light_background) : getResources().getColor(com.discord.R.color.cardview_dark_background));
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.mCompatPadding = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.mPreventCornerOverlap = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        float f2 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.mUserSetMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.mUserSetMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        IMPL.k(aVar, context, colorStateList, dimension, dimension2, f2);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        IMPL.m(this.mCardViewDelegate, colorStateList);
    }
}
