package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import bh.p;
import com.discord.R;
import com.facebook.imagepipeline.nativecode.c;
import kh.i;
import oh.a;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialDivider extends View {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f6396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6397e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6398i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6399v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f6400w;

    public MaterialDivider(@NonNull Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.f6396d = new i();
        TypedArray typedArrayF = p.f(context2, attributeSet, kg.a.f14450w, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.f6397e = typedArrayF.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f6399v = typedArrayF.getDimensionPixelOffset(2, 0);
        this.f6400w = typedArrayF.getDimensionPixelOffset(1, 0);
        setDividerColor(c.t(context2, typedArrayF, 0).getDefaultColor());
        typedArrayF.recycle();
    }

    public int getDividerColor() {
        return this.f6398i;
    }

    public int getDividerInsetEnd() {
        return this.f6400w;
    }

    public int getDividerInsetStart() {
        return this.f6399v;
    }

    public int getDividerThickness() {
        return this.f6397e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i7;
        super.onDraw(canvas);
        boolean z5 = getLayoutDirection() == 1;
        int i10 = z5 ? this.f6400w : this.f6399v;
        if (z5) {
            width = getWidth();
            i7 = this.f6399v;
        } else {
            width = getWidth();
            i7 = this.f6400w;
        }
        int i11 = width - i7;
        int bottom = getBottom() - getTop();
        i iVar = this.f6396d;
        iVar.setBounds(i10, 0, i11, bottom);
        iVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int mode = View.MeasureSpec.getMode(i10);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i11 = this.f6397e;
            if (i11 > 0 && measuredHeight != i11) {
                measuredHeight = i11;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i7) {
        if (this.f6398i != i7) {
            this.f6398i = i7;
            this.f6396d.q(ColorStateList.valueOf(i7));
            invalidate();
        }
    }

    public void setDividerColorResource(int i7) {
        setDividerColor(getContext().getColor(i7));
    }

    public void setDividerInsetEnd(int i7) {
        this.f6400w = i7;
    }

    public void setDividerInsetEndResource(int i7) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i7));
    }

    public void setDividerInsetStart(int i7) {
        this.f6399v = i7;
    }

    public void setDividerInsetStartResource(int i7) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i7));
    }

    public void setDividerThickness(int i7) {
        if (this.f6397e != i7) {
            this.f6397e = i7;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i7) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i7));
    }
}
