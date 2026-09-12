package com.google.android.material.appbar;

import ag.t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.e1;
import bh.p;
import com.discord.R;
import com.facebook.imagepipeline.nativecode.c;
import java.util.ArrayList;
import java.util.Collections;
import kh.i;
import oh.a;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f6240z0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Integer f6241u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f6242v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f6243w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ImageView.ScaleType f6244x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public Boolean f6245y0;

    public MaterialToolbar(@NonNull Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayF = p.f(context2, attributeSet, kg.a.C, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayF.hasValue(2)) {
            setNavigationIconTint(typedArrayF.getColor(2, -1));
        }
        this.f6242v0 = typedArrayF.getBoolean(4, false);
        this.f6243w0 = typedArrayF.getBoolean(3, false);
        int i7 = typedArrayF.getInt(1, -1);
        if (i7 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f6240z0;
            if (i7 < scaleTypeArr.length) {
                this.f6244x0 = scaleTypeArr[i7];
            }
        }
        if (typedArrayF.hasValue(0)) {
            this.f6245y0 = Boolean.valueOf(typedArrayF.getBoolean(0, false));
        }
        typedArrayF.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : e1.b(background);
        if (colorStateListValueOf != null) {
            i iVar = new i();
            iVar.q(colorStateListValueOf);
            iVar.m(context2);
            iVar.p(getElevation());
            setBackground(iVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f6244x0;
    }

    public Integer getNavigationIconTint() {
        return this.f6241u0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof i) {
            c.J(this, (i) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z5, i7, i10, i11, i12);
        t tVar = p.f3296c;
        ImageView imageView2 = null;
        if (this.f6242v0 || this.f6243w0) {
            ArrayList arrayListE = p.e(this, getTitle());
            TextView textView = arrayListE.isEmpty() ? null : (TextView) Collections.min(arrayListE, tVar);
            ArrayList arrayListE2 = p.e(this, getSubtitle());
            TextView textView2 = arrayListE2.isEmpty() ? null : (TextView) Collections.max(arrayListE2, tVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i13 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i14 = 0; i14 < getChildCount(); i14++) {
                    View childAt = getChildAt(i14);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i13 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i13 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f6242v0 && textView != null) {
                    w(textView, pair);
                }
                if (this.f6243w0 && textView2 != null) {
                    w(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            for (int i15 = 0; i15 < getChildCount(); i15++) {
                View childAt2 = getChildAt(i15);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f6245y0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f6244x0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        Drawable background = getBackground();
        if (background instanceof i) {
            ((i) background).p(f2);
        }
    }

    public void setLogoAdjustViewBounds(boolean z5) {
        Boolean bool = this.f6245y0;
        if (bool == null || bool.booleanValue() != z5) {
            this.f6245y0 = Boolean.valueOf(z5);
            requestLayout();
        }
    }

    public void setLogoScaleType(@NonNull ImageView.ScaleType scaleType) {
        if (this.f6244x0 != scaleType) {
            this.f6244x0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f6241u0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f6241u0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i7) {
        this.f6241u0 = Integer.valueOf(i7);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z5) {
        if (this.f6243w0 != z5) {
            this.f6243w0 = z5;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z5) {
        if (this.f6242v0 != z5) {
            this.f6242v0 = z5;
            requestLayout();
        }
    }

    public final void w(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i7 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i10 = measuredWidth2 + i7;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i7, 0), Math.max(i10 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i7 += iMax;
            i10 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i10 - i7, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i7, textView.getTop(), i10, textView.getBottom());
    }
}
