package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.u0;
import com.discord.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class ClockFaceView extends h implements f {
    public final SparseArray E;
    public final c F;
    public final int[] G;
    public final float[] H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final String[] M;
    public float N;
    public final ColorStateList O;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ClockHandView f6477v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Rect f6478w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final RectF f6479x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Rect f6480y;

    public ClockFaceView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6478w = new Rect();
        this.f6479x = new RectF();
        this.f6480y = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.E = sparseArray;
        this.H = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kg.a.j, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListT = com.facebook.imagepipeline.nativecode.c.t(context, typedArrayObtainStyledAttributes, 1);
        this.O = colorStateListT;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f6477v = clockHandView;
        this.I = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListT.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListT.getDefaultColor());
        this.G = new int[]{colorForState, colorForState, colorStateListT.getDefaultColor()};
        clockHandView.f6483i.add(this);
        int defaultColor = y0.b.c(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListT2 = com.facebook.imagepipeline.nativecode.c.t(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListT2 != null ? colorStateListT2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(false);
        typedArrayObtainStyledAttributes.recycle();
        this.F = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.M = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z5 = false;
        for (int i7 = 0; i7 < Math.max(this.M.length, size); i7++) {
            TextView textView = (TextView) sparseArray.get(i7);
            if (i7 >= this.M.length) {
                removeView(textView);
                sparseArray.remove(i7);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i7, textView);
                    addView(textView);
                }
                textView.setText(this.M[i7]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i7));
                int i10 = (i7 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i10));
                z5 = i10 > 1 ? true : z5;
                u0.p(textView, this.F);
                textView.setTextColor(this.O);
            }
        }
        ClockHandView clockHandView2 = this.f6477v;
        if (clockHandView2.f6482e && !z5) {
            clockHandView2.J = 1;
        }
        clockHandView2.f6482e = z5;
        clockHandView2.invalidate();
        this.J = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.K = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.L = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.h
    public final void c() {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.c(this);
        HashMap map = new HashMap();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i10 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i10 == null) {
                    i10 = 1;
                }
                if (!map.containsKey(i10)) {
                    map.put(i10, new ArrayList());
                }
                ((List) map.get(i10)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f6496e * 0.66f) : this.f6496e;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id2 = ((View) it.next()).getId();
                Integer numValueOf = Integer.valueOf(id2);
                HashMap map2 = constraintSet.f1340c;
                if (!map2.containsKey(numValueOf)) {
                    map2.put(Integer.valueOf(id2), new androidx.constraintlayout.widget.g());
                }
                androidx.constraintlayout.widget.h hVar = ((androidx.constraintlayout.widget.g) map2.get(Integer.valueOf(id2))).f1379d;
                hVar.f1417y = R.id.circle_center;
                hVar.f1418z = iRound;
                hVar.A = size;
                size += 360.0f / list.size();
            }
        }
        constraintSet.a(this);
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.E;
            if (i11 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i11)).setVisibility(0);
            i11++;
        }
    }

    public final void d() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.f6477v.f6487y;
        float f2 = Float.MAX_VALUE;
        TextView textView = null;
        int i7 = 0;
        while (true) {
            sparseArray = this.E;
            int size = sparseArray.size();
            rect = this.f6478w;
            rectF = this.f6479x;
            if (i7 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i7);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f2) {
                    textView = textView2;
                    f2 = fHeight;
                }
            }
            i7++;
        }
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            TextView textView3 = (TextView) sparseArray.get(i10);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                Rect rect2 = this.f6480y;
                textView3.getLineBounds(0, rect2);
                rectF.inset(rect2.left, rect2.top);
                textView3.getPaint().setShader(RectF.intersects(rectF2, rectF) ? new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.G, this.H, Shader.TileMode.CLAMP) : null);
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
        accessibilityNodeInfoCompat.f1613a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.M.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        super.onLayout(z5, i7, i10, i11, i12);
        d();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.L / Math.max(Math.max(this.J / displayMetrics.heightPixels, this.K / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
