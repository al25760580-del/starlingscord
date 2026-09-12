package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class y1 extends ViewGroup {
    public boolean E;
    public int[] F;
    public int[] G;
    public Drawable H;
    public int I;
    public int J;
    public int K;
    public int L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1179e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1180i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1181v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1182w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1183x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f1184y;

    public y1(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f1178d = true;
        this.f1179e = -1;
        this.f1180i = 0;
        this.f1182w = 8388659;
        int[] iArr = h.a.f10264n;
        e4.m mVarE = e4.m.E(context, attributeSet, iArr, i7);
        androidx.core.view.u0.o(this, context, iArr, attributeSet, (TypedArray) mVarE.f7994i, i7, 0);
        TypedArray typedArray = (TypedArray) mVarE.f7994i;
        int i10 = typedArray.getInt(1, -1);
        if (i10 >= 0) {
            setOrientation(i10);
        }
        int i11 = typedArray.getInt(0, -1);
        if (i11 >= 0) {
            setGravity(i11);
        }
        boolean z5 = typedArray.getBoolean(2, true);
        if (!z5) {
            setBaselineAligned(z5);
        }
        this.f1184y = typedArray.getFloat(4, -1.0f);
        this.f1179e = typedArray.getInt(3, -1);
        this.E = typedArray.getBoolean(7, false);
        setDividerDrawable(mVarE.x(5));
        this.K = typedArray.getInt(8, 0);
        this.L = typedArray.getDimensionPixelSize(6, 0);
        mVarE.H();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof x1;
    }

    public final void d(Canvas canvas, int i7) {
        this.H.setBounds(getPaddingLeft() + this.L, i7, (getWidth() - getPaddingRight()) - this.L, this.J + i7);
        this.H.draw(canvas);
    }

    public final void e(Canvas canvas, int i7) {
        this.H.setBounds(i7, getPaddingTop() + this.L, this.I + i7, (getHeight() - getPaddingBottom()) - this.L);
        this.H.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public x1 generateDefaultLayoutParams() {
        int i7 = this.f1181v;
        if (i7 == 0) {
            return new x1(-2, -2);
        }
        if (i7 == 1) {
            return new x1(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public x1 generateLayoutParams(AttributeSet attributeSet) {
        return new x1(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i7;
        if (this.f1179e < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i10 = this.f1179e;
        if (childCount <= i10) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i10);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f1179e == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f1180i;
        if (this.f1181v == 1 && (i7 = this.f1182w & 112) != 48) {
            if (i7 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1183x) / 2;
            } else if (i7 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1183x;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((x1) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1179e;
    }

    public Drawable getDividerDrawable() {
        return this.H;
    }

    public int getDividerPadding() {
        return this.L;
    }

    public int getDividerWidth() {
        return this.I;
    }

    public int getGravity() {
        return this.f1182w;
    }

    public int getOrientation() {
        return this.f1181v;
    }

    public int getShowDividers() {
        return this.K;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1184y;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public x1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof x1) {
            return new x1((x1) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new x1((ViewGroup.MarginLayoutParams) layoutParams) : new x1(layoutParams);
    }

    public final boolean i(int i7) {
        if (i7 == 0) {
            return (this.K & 1) != 0;
        }
        if (i7 == getChildCount()) {
            return (this.K & 4) != 0;
        }
        if ((this.K & 2) != 0) {
            for (int i10 = i7 - 1; i10 >= 0; i10--) {
                if (getChildAt(i10).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i7;
        int bottom;
        if (this.H == null) {
            return;
        }
        int i10 = 0;
        if (this.f1181v == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i10 < virtualChildCount) {
                View childAt = getChildAt(i10);
                if (childAt != null && childAt.getVisibility() != 8 && i(i10)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((x1) childAt.getLayoutParams())).topMargin) - this.J);
                }
                i10++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.J;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((x1) childAt2.getLayoutParams())).bottomMargin;
                }
                d(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z5 = f4.f976a;
        boolean z6 = getLayoutDirection() == 1;
        while (i10 < virtualChildCount2) {
            View childAt3 = getChildAt(i10);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i10)) {
                x1 x1Var = (x1) childAt3.getLayoutParams();
                e(canvas, z6 ? childAt3.getRight() + ((LinearLayout.LayoutParams) x1Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) x1Var).leftMargin) - this.I);
            }
            i10++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                x1 x1Var2 = (x1) childAt4.getLayoutParams();
                if (z6) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) x1Var2).leftMargin;
                    i7 = this.I;
                    right = left - i7;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) x1Var2).rightMargin;
                }
            } else if (z6) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i7 = this.I;
                right = left - i7;
            }
            e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x015a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0163  */
    /* JADX WARN: Code duplicated, block: B:67:0x0167  */
    /* JADX WARN: Code duplicated, block: B:69:0x016b  */
    /* JADX WARN: Code duplicated, block: B:70:0x016f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0177  */
    /* JADX WARN: Code duplicated, block: B:74:0x0183  */
    /* JADX WARN: Code duplicated, block: B:76:0x018a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0191  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a9  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        int paddingLeft;
        int i13;
        int i14;
        int i15;
        int i16;
        int baseline;
        int i17;
        int i18;
        int i19;
        int measuredHeight;
        int i20;
        int paddingTop;
        int i21;
        int i22;
        int i23;
        int i24 = 8;
        char c8 = 2;
        if (this.f1181v == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i25 = i11 - i7;
            int paddingRight = i25 - getPaddingRight();
            int paddingRight2 = (i25 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i26 = this.f1182w;
            int i27 = i26 & 112;
            int i28 = 8388615 & i26;
            if (i27 != 16) {
                paddingTop = i27 != 80 ? getPaddingTop() : ((getPaddingTop() + i12) - i10) - this.f1183x;
            } else {
                paddingTop = getPaddingTop() + (((i12 - i10) - this.f1183x) / 2);
            }
            int i29 = 0;
            while (i29 < virtualChildCount) {
                View childAt = getChildAt(i29);
                if (childAt != null && childAt.getVisibility() != i24) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    x1 x1Var = (x1) childAt.getLayoutParams();
                    int i30 = ((LinearLayout.LayoutParams) x1Var).gravity;
                    if (i30 < 0) {
                        i30 = i28;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i30, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i23 = ((LinearLayout.LayoutParams) x1Var).leftMargin + paddingLeft2;
                        } else {
                            i21 = paddingRight - measuredWidth;
                            i22 = ((LinearLayout.LayoutParams) x1Var).rightMargin;
                        }
                        if (i(i29)) {
                            paddingTop += this.J;
                        }
                        int i31 = paddingTop + ((LinearLayout.LayoutParams) x1Var).topMargin;
                        childAt.layout(i23, i31, measuredWidth + i23, i31 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) x1Var).bottomMargin + i31;
                    } else {
                        i21 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((LinearLayout.LayoutParams) x1Var).leftMargin;
                        i22 = ((LinearLayout.LayoutParams) x1Var).rightMargin;
                    }
                    i23 = i21 - i22;
                    if (i(i29)) {
                        paddingTop += this.J;
                    }
                    int i32 = paddingTop + ((LinearLayout.LayoutParams) x1Var).topMargin;
                    childAt.layout(i23, i32, measuredWidth + i23, i32 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) x1Var).bottomMargin + i32;
                }
                i29++;
                c8 = c8;
                i24 = 8;
            }
            return;
        }
        boolean z6 = f4.f976a;
        boolean z7 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i33 = i12 - i10;
        int paddingBottom = i33 - getPaddingBottom();
        int paddingBottom2 = (i33 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i34 = this.f1182w;
        int i35 = 8388615 & i34;
        int i36 = i34 & 112;
        boolean z10 = this.f1178d;
        int[] iArr = this.F;
        int[] iArr2 = this.G;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i35, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            paddingLeft = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i11) - i7) - this.f1183x;
        } else {
            paddingLeft = getPaddingLeft() + (((i11 - i7) - this.f1183x) / 2);
        }
        if (z7) {
            i14 = virtualChildCount2 - 1;
            i13 = -1;
        } else {
            i13 = 1;
            i14 = 0;
        }
        int i37 = 0;
        while (i37 < virtualChildCount2) {
            int i38 = (i13 * i37) + i14;
            View childAt2 = getChildAt(i38);
            if (childAt2 == null) {
                i15 = i14;
            } else {
                i15 = i14;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    x1 x1Var2 = (x1) childAt2.getLayoutParams();
                    int i39 = paddingLeft;
                    if (z10) {
                        i16 = paddingTop2;
                        baseline = ((LinearLayout.LayoutParams) x1Var2).height != -1 ? childAt2.getBaseline() : -1;
                        i17 = ((LinearLayout.LayoutParams) x1Var2).gravity;
                        if (i17 < 0) {
                            i17 = i36;
                        }
                        i18 = i17 & 112;
                        if (i18 != 16) {
                            if (i18 != 48) {
                                i19 = i16 + ((LinearLayout.LayoutParams) x1Var2).topMargin;
                                if (baseline != -1) {
                                    i19 = (iArr[1] - baseline) + i19;
                                }
                            } else if (i18 != 80) {
                                i19 = i16;
                            } else {
                                i19 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) x1Var2).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                }
                            }
                            if (i(i38)) {
                                i20 = i39 + this.I;
                            } else {
                                i20 = i39;
                            }
                            int i40 = i20 + ((LinearLayout.LayoutParams) x1Var2).leftMargin;
                            childAt2.layout(i40, i19, i40 + measuredWidth2, i19 + measuredHeight3);
                            paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) x1Var2).rightMargin + i40;
                        } else {
                            i19 = ((paddingBottom2 - measuredHeight3) / 2) + i16 + ((LinearLayout.LayoutParams) x1Var2).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) x1Var2).bottomMargin;
                        }
                        i19 -= measuredHeight;
                        if (i(i38)) {
                            i20 = i39 + this.I;
                        } else {
                            i20 = i39;
                        }
                        int i41 = i20 + ((LinearLayout.LayoutParams) x1Var2).leftMargin;
                        childAt2.layout(i41, i19, i41 + measuredWidth2, i19 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) x1Var2).rightMargin + i41;
                    } else {
                        i16 = paddingTop2;
                    }
                    i17 = ((LinearLayout.LayoutParams) x1Var2).gravity;
                    if (i17 < 0) {
                        i17 = i36;
                    }
                    i18 = i17 & 112;
                    if (i18 != 16) {
                        if (i18 != 48) {
                            i19 = i16 + ((LinearLayout.LayoutParams) x1Var2).topMargin;
                            if (baseline != -1) {
                                i19 = (iArr[1] - baseline) + i19;
                            }
                        } else if (i18 != 80) {
                            i19 = i16;
                        } else {
                            i19 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) x1Var2).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (i(i38)) {
                            i20 = i39 + this.I;
                        } else {
                            i20 = i39;
                        }
                        int i42 = i20 + ((LinearLayout.LayoutParams) x1Var2).leftMargin;
                        childAt2.layout(i42, i19, i42 + measuredWidth2, i19 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) x1Var2).rightMargin + i42;
                    } else {
                        i19 = ((paddingBottom2 - measuredHeight3) / 2) + i16 + ((LinearLayout.LayoutParams) x1Var2).topMargin;
                        measuredHeight = ((LinearLayout.LayoutParams) x1Var2).bottomMargin;
                    }
                    i19 -= measuredHeight;
                    if (i(i38)) {
                        i20 = i39 + this.I;
                    } else {
                        i20 = i39;
                    }
                    int i43 = i20 + ((LinearLayout.LayoutParams) x1Var2).leftMargin;
                    childAt2.layout(i43, i19, i43 + measuredWidth2, i19 + measuredHeight3);
                    paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) x1Var2).rightMargin + i43;
                }
                i37++;
                i14 = i15;
                paddingTop2 = i16;
            }
            i16 = paddingTop2;
            i37++;
            i14 = i15;
            paddingTop2 = i16;
        }
    }

    /* JADX WARN: Code duplicated, block: B:228:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:231:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:233:0x0501  */
    /* JADX WARN: Code duplicated, block: B:235:0x0505  */
    /* JADX WARN: Code duplicated, block: B:237:0x0526  */
    /* JADX WARN: Code duplicated, block: B:243:0x0536  */
    /* JADX WARN: Code duplicated, block: B:246:0x053d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:248:0x0540  */
    /* JADX WARN: Code duplicated, block: B:250:0x0547 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:252:0x054a  */
    /* JADX WARN: Code duplicated, block: B:366:0x079c  */
    /* JADX WARN: Code duplicated, block: B:64:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0142  */
    /* JADX WARN: Code duplicated, block: B:68:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x014b  */
    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int iMax;
        int i14;
        int baseline;
        int i15;
        int i16;
        int[] iArr;
        int i17;
        int i18;
        boolean z5;
        boolean z6;
        x1 x1Var;
        View view;
        int i19;
        int[] iArr2;
        int i20;
        int i21;
        boolean z7;
        int i22;
        int measuredHeight;
        boolean z10;
        boolean z11;
        int iMax2;
        int i23;
        int baseline2;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z12;
        int i29;
        int i30;
        int i31;
        View view2;
        boolean z13;
        y1 y1Var = this;
        int i32 = -2;
        int iMax3 = 0;
        int i33 = 1073741824;
        int i34 = 8;
        if (y1Var.f1181v == 1) {
            y1Var.f1183x = 0;
            int virtualChildCount = y1Var.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i7);
            int mode2 = View.MeasureSpec.getMode(i10);
            int i35 = y1Var.f1179e;
            boolean z14 = y1Var.E;
            int i36 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            boolean z15 = false;
            int i37 = 0;
            boolean z16 = false;
            boolean z17 = true;
            float f2 = 0.0f;
            int iMax6 = 0;
            while (i36 < virtualChildCount) {
                int i38 = mode;
                View childAt = y1Var.getChildAt(i36);
                if (childAt == null) {
                    y1Var.f1183x = y1Var.f1183x;
                } else {
                    if (childAt.getVisibility() != i34) {
                        if (y1Var.i(i36)) {
                            y1Var.f1183x += y1Var.J;
                        }
                        x1 x1Var2 = (x1) childAt.getLayoutParams();
                        float f7 = ((LinearLayout.LayoutParams) x1Var2).weight;
                        f2 += f7;
                        if (mode2 == i33 && ((LinearLayout.LayoutParams) x1Var2).height == 0 && f7 > 0.0f) {
                            int i39 = y1Var.f1183x;
                            y1Var.f1183x = Math.max(i39, ((LinearLayout.LayoutParams) x1Var2).topMargin + i39 + ((LinearLayout.LayoutParams) x1Var2).bottomMargin);
                            view2 = childAt;
                            i28 = mode2;
                            i29 = i35;
                            z12 = z14;
                            i30 = i36;
                            z15 = true;
                            i31 = i38;
                        } else {
                            if (((LinearLayout.LayoutParams) x1Var2).height != 0 || f7 <= 0.0f) {
                                i27 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) x1Var2).height = i32;
                                i27 = 0;
                            }
                            i28 = mode2;
                            z12 = z14;
                            i29 = i35;
                            i30 = i36;
                            i31 = i38;
                            y1Var.measureChildWithMargins(childAt, i7, 0, i10, f2 == 0.0f ? y1Var.f1183x : 0);
                            if (i27 != Integer.MIN_VALUE) {
                                ((LinearLayout.LayoutParams) x1Var2).height = i27;
                            }
                            int measuredHeight2 = childAt.getMeasuredHeight();
                            int i40 = y1Var.f1183x;
                            view2 = childAt;
                            y1Var.f1183x = Math.max(i40, i40 + measuredHeight2 + ((LinearLayout.LayoutParams) x1Var2).topMargin + ((LinearLayout.LayoutParams) x1Var2).bottomMargin);
                            if (z12) {
                                iMax6 = Math.max(measuredHeight2, iMax6);
                            }
                        }
                        if (i29 >= 0 && i29 == i30 + 1) {
                            y1Var.f1180i = y1Var.f1183x;
                        }
                        if (i30 < i29 && ((LinearLayout.LayoutParams) x1Var2).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (i31 == 1073741824 || ((LinearLayout.LayoutParams) x1Var2).width != -1) {
                            z13 = false;
                        } else {
                            z13 = true;
                            z16 = true;
                        }
                        int i41 = ((LinearLayout.LayoutParams) x1Var2).leftMargin + ((LinearLayout.LayoutParams) x1Var2).rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i41;
                        iMax3 = Math.max(iMax3, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z18 = z13;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i37, measuredState);
                        if (z17) {
                            i37 = iCombineMeasuredStates;
                            boolean z19 = ((LinearLayout.LayoutParams) x1Var2).width == -1;
                            if (((LinearLayout.LayoutParams) x1Var2).weight > 0.0f) {
                                if (!z18) {
                                    i41 = measuredWidth;
                                }
                                iMax5 = Math.max(iMax5, i41);
                            } else {
                                if (!z18) {
                                    i41 = measuredWidth;
                                }
                                iMax4 = Math.max(iMax4, i41);
                            }
                            z17 = z19;
                        } else {
                            i37 = iCombineMeasuredStates;
                        }
                        if (((LinearLayout.LayoutParams) x1Var2).weight > 0.0f) {
                            if (!z18) {
                                i41 = measuredWidth;
                            }
                            iMax5 = Math.max(iMax5, i41);
                        } else {
                            if (!z18) {
                                i41 = measuredWidth;
                            }
                            iMax4 = Math.max(iMax4, i41);
                        }
                        z17 = z19;
                    }
                    i36 = i30 + 1;
                    i35 = i29;
                    mode = i31;
                    z14 = z12;
                    mode2 = i28;
                    i32 = -2;
                    i33 = 1073741824;
                    i34 = 8;
                }
                i28 = mode2;
                i29 = i35;
                z12 = z14;
                i30 = i36;
                i31 = i38;
                i36 = i30 + 1;
                i35 = i29;
                mode = i31;
                z14 = z12;
                mode2 = i28;
                i32 = -2;
                i33 = 1073741824;
                i34 = 8;
            }
            int i42 = mode;
            int i43 = mode2;
            boolean z20 = z14;
            int i44 = i37;
            int i45 = i10;
            if (y1Var.f1183x > 0 && y1Var.i(virtualChildCount)) {
                y1Var.f1183x += y1Var.J;
            }
            if (z20 && (i43 == Integer.MIN_VALUE || i43 == 0)) {
                y1Var.f1183x = 0;
                for (int i46 = 0; i46 < virtualChildCount; i46++) {
                    View childAt2 = y1Var.getChildAt(i46);
                    if (childAt2 == null) {
                        y1Var.f1183x = y1Var.f1183x;
                    } else if (childAt2.getVisibility() != 8) {
                        x1 x1Var3 = (x1) childAt2.getLayoutParams();
                        int i47 = y1Var.f1183x;
                        y1Var.f1183x = Math.max(i47, i47 + iMax6 + ((LinearLayout.LayoutParams) x1Var3).topMargin + ((LinearLayout.LayoutParams) x1Var3).bottomMargin);
                    }
                }
            }
            int paddingBottom = y1Var.getPaddingBottom() + y1Var.getPaddingTop() + y1Var.f1183x;
            y1Var.f1183x = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, y1Var.getSuggestedMinimumHeight()), i45, 0);
            int i48 = (iResolveSizeAndState & 16777215) - y1Var.f1183x;
            if (z15 || (i48 != 0 && f2 > 0.0f)) {
                float f10 = y1Var.f1184y;
                if (f10 > 0.0f) {
                    f2 = f10;
                }
                y1Var.f1183x = 0;
                int iCombineMeasuredStates2 = i44;
                int i49 = 0;
                while (i49 < virtualChildCount) {
                    View childAt3 = y1Var.getChildAt(i49);
                    if (childAt3.getVisibility() == 8) {
                        i49 = i49;
                    } else {
                        x1 x1Var4 = (x1) childAt3.getLayoutParams();
                        float f11 = ((LinearLayout.LayoutParams) x1Var4).weight;
                        if (f11 > 0.0f) {
                            int i50 = (int) ((i48 * f11) / f2);
                            f2 -= f11;
                            i48 -= i50;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, y1Var.getPaddingRight() + y1Var.getPaddingLeft() + ((LinearLayout.LayoutParams) x1Var4).leftMargin + ((LinearLayout.LayoutParams) x1Var4).rightMargin, ((LinearLayout.LayoutParams) x1Var4).width);
                            if (((LinearLayout.LayoutParams) x1Var4).height == 0) {
                                i26 = 1073741824;
                                if (i43 == 1073741824) {
                                    if (i50 <= 0) {
                                        i50 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i50, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                            } else {
                                i26 = 1073741824;
                            }
                            int measuredHeight3 = childAt3.getMeasuredHeight() + i50;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i26));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                        }
                        int i51 = ((LinearLayout.LayoutParams) x1Var4).leftMargin + ((LinearLayout.LayoutParams) x1Var4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i51;
                        iMax3 = Math.max(iMax3, measuredWidth2);
                        if (i42 != 1073741824) {
                            i25 = -1;
                            if (((LinearLayout.LayoutParams) x1Var4).width == -1) {
                                measuredWidth2 = i51;
                            }
                        } else {
                            i25 = -1;
                        }
                        iMax4 = Math.max(iMax4, measuredWidth2);
                        boolean z21 = z17 && ((LinearLayout.LayoutParams) x1Var4).width == i25;
                        int i52 = y1Var.f1183x;
                        y1Var.f1183x = Math.max(i52, childAt3.getMeasuredHeight() + i52 + ((LinearLayout.LayoutParams) x1Var4).topMargin + ((LinearLayout.LayoutParams) x1Var4).bottomMargin);
                        z17 = z21;
                    }
                    i49++;
                }
                y1Var.f1183x = y1Var.getPaddingBottom() + y1Var.getPaddingTop() + y1Var.f1183x;
                i44 = iCombineMeasuredStates2;
            } else {
                iMax4 = Math.max(iMax4, iMax5);
                if (z20 && i43 != 1073741824) {
                    for (int i53 = 0; i53 < virtualChildCount; i53++) {
                        View childAt4 = y1Var.getChildAt(i53);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((x1) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        }
                    }
                }
            }
            if (z17 || i42 == 1073741824) {
                iMax4 = iMax3;
            }
            y1Var.setMeasuredDimension(View.resolveSizeAndState(Math.max(y1Var.getPaddingRight() + y1Var.getPaddingLeft() + iMax4, y1Var.getSuggestedMinimumWidth()), i7, i44), iResolveSizeAndState);
            if (z16) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(y1Var.getMeasuredWidth(), 1073741824);
                int i54 = 0;
                while (i54 < virtualChildCount) {
                    View childAt5 = y1Var.getChildAt(i54);
                    if (childAt5.getVisibility() != 8) {
                        x1 x1Var5 = (x1) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) x1Var5).width == -1) {
                            int i55 = ((LinearLayout.LayoutParams) x1Var5).height;
                            ((LinearLayout.LayoutParams) x1Var5).height = childAt5.getMeasuredHeight();
                            y1Var.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i45, 0);
                            ((LinearLayout.LayoutParams) x1Var5).height = i55;
                        }
                    }
                    i54++;
                    i45 = i10;
                }
                return;
            }
            return;
        }
        int i56 = i7;
        y1Var.f1183x = 0;
        int virtualChildCount2 = y1Var.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i56);
        int mode4 = View.MeasureSpec.getMode(i10);
        if (y1Var.F == null || y1Var.G == null) {
            y1Var.F = new int[4];
            y1Var.G = new int[4];
        }
        int[] iArr3 = y1Var.F;
        int[] iArr4 = y1Var.G;
        iArr3[3] = -1;
        char c8 = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z22 = y1Var.f1178d;
        boolean z23 = y1Var.E;
        boolean z24 = mode3 == 1073741824;
        float f12 = 0.0f;
        boolean z25 = true;
        int i57 = 0;
        int i58 = 0;
        int i59 = 0;
        int iMax7 = 0;
        int iMax8 = 0;
        int iCombineMeasuredStates3 = 0;
        boolean z26 = false;
        boolean z27 = false;
        while (i57 < virtualChildCount2) {
            char c10 = c8;
            View childAt6 = y1Var.getChildAt(i57);
            if (childAt6 == null) {
                y1Var.f1183x = y1Var.f1183x;
                i18 = i57;
                i23 = i59;
                iArr2 = iArr3;
                iArr = iArr4;
                z5 = z22;
                z6 = z23;
            } else {
                int i60 = i58;
                if (childAt6.getVisibility() == 8) {
                    i56 = i7;
                    i18 = i57;
                    i23 = i59;
                    iArr = iArr4;
                    z5 = z22;
                    z6 = z23;
                    i58 = i60;
                    iArr2 = iArr3;
                } else {
                    if (y1Var.i(i57)) {
                        y1Var.f1183x += y1Var.I;
                    }
                    x1 x1Var6 = (x1) childAt6.getLayoutParams();
                    float f13 = ((LinearLayout.LayoutParams) x1Var6).weight;
                    f12 += f13;
                    int i61 = i57;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) x1Var6).width == 0 && f13 > 0.0f) {
                        if (z24) {
                            y1Var.f1183x = ((LinearLayout.LayoutParams) x1Var6).leftMargin + ((LinearLayout.LayoutParams) x1Var6).rightMargin + y1Var.f1183x;
                        } else {
                            int i62 = y1Var.f1183x;
                            y1Var.f1183x = Math.max(i62, ((LinearLayout.LayoutParams) x1Var6).leftMargin + i62 + ((LinearLayout.LayoutParams) x1Var6).rightMargin);
                        }
                        if (z22) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            view = childAt6;
                            z5 = z22;
                            z6 = z23;
                            i19 = i60;
                            i18 = i61;
                            x1Var = x1Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i56 = i7;
                            i20 = i59;
                            i17 = iMax7;
                        } else {
                            view = childAt6;
                            z5 = z22;
                            z6 = z23;
                            z27 = true;
                            i19 = i60;
                            i18 = i61;
                            i21 = 1073741824;
                            x1Var = x1Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i56 = i7;
                            i20 = i59;
                            i17 = iMax7;
                        }
                        if (mode4 == i21 && ((LinearLayout.LayoutParams) x1Var).height == -1) {
                            z7 = true;
                            z26 = true;
                        } else {
                            z7 = false;
                        }
                        i22 = ((LinearLayout.LayoutParams) x1Var).topMargin + ((LinearLayout.LayoutParams) x1Var).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i22;
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                        if (z5) {
                            baseline2 = view.getBaseline();
                            z10 = z7;
                            if (baseline2 != -1) {
                                i24 = ((LinearLayout.LayoutParams) x1Var).gravity;
                                if (i24 < 0) {
                                    i24 = y1Var.f1182w;
                                }
                                int i63 = (((i24 & 112) >> 4) & (-2)) >> 1;
                                iArr2[i63] = Math.max(iArr2[i63], baseline2);
                                iArr[i63] = Math.max(iArr[i63], measuredHeight - baseline2);
                            }
                        } else {
                            z10 = z7;
                        }
                        int iMax9 = Math.max(i19, measuredHeight);
                        if (z25 || ((LinearLayout.LayoutParams) x1Var).height != -1) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (((LinearLayout.LayoutParams) x1Var).weight > 0.0f) {
                            if (!z10) {
                                i22 = measuredHeight;
                            }
                            iMax7 = Math.max(i17, i22);
                            iMax2 = i20;
                        } else {
                            if (!z10) {
                                i22 = measuredHeight;
                            }
                            iMax2 = Math.max(i20, i22);
                            iMax7 = i17;
                        }
                        int i64 = iMax2;
                        i58 = iMax9;
                        i23 = i64;
                        z25 = z11;
                    } else {
                        if (((LinearLayout.LayoutParams) x1Var6).width != 0 || f13 <= 0.0f) {
                            i16 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) x1Var6).width = -2;
                            i16 = 0;
                        }
                        iArr = iArr4;
                        i17 = iMax7;
                        i18 = i61;
                        z5 = z22;
                        z6 = z23;
                        int i65 = i16;
                        x1Var = x1Var6;
                        view = childAt6;
                        i19 = i60;
                        i56 = i7;
                        iArr2 = iArr3;
                        i20 = i59;
                        y1Var.measureChildWithMargins(view, i56, f12 == 0.0f ? y1Var.f1183x : 0, i10, 0);
                        if (i65 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) x1Var).width = i65;
                        }
                        int measuredWidth3 = view.getMeasuredWidth();
                        if (z24) {
                            y1Var.f1183x = ((LinearLayout.LayoutParams) x1Var).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) x1Var).rightMargin + y1Var.f1183x;
                        } else {
                            int i66 = y1Var.f1183x;
                            y1Var.f1183x = Math.max(i66, i66 + measuredWidth3 + ((LinearLayout.LayoutParams) x1Var).leftMargin + ((LinearLayout.LayoutParams) x1Var).rightMargin);
                        }
                        if (z6) {
                            iMax8 = Math.max(measuredWidth3, iMax8);
                        }
                    }
                    i21 = 1073741824;
                    if (mode4 == i21) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    i22 = ((LinearLayout.LayoutParams) x1Var).topMargin + ((LinearLayout.LayoutParams) x1Var).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i22;
                    iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                    if (z5) {
                        baseline2 = view.getBaseline();
                        z10 = z7;
                        if (baseline2 != -1) {
                            i24 = ((LinearLayout.LayoutParams) x1Var).gravity;
                            if (i24 < 0) {
                                i24 = y1Var.f1182w;
                            }
                            int i67 = (((i24 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i67] = Math.max(iArr2[i67], baseline2);
                            iArr[i67] = Math.max(iArr[i67], measuredHeight - baseline2);
                        }
                    } else {
                        z10 = z7;
                    }
                    int iMax10 = Math.max(i19, measuredHeight);
                    if (z25) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (((LinearLayout.LayoutParams) x1Var).weight > 0.0f) {
                        if (!z10) {
                            i22 = measuredHeight;
                        }
                        iMax7 = Math.max(i17, i22);
                        iMax2 = i20;
                    } else {
                        if (!z10) {
                            i22 = measuredHeight;
                        }
                        iMax2 = Math.max(i20, i22);
                        iMax7 = i17;
                    }
                    int i68 = iMax2;
                    i58 = iMax10;
                    i23 = i68;
                    z25 = z11;
                }
            }
            i59 = i23;
            i57 = i18 + 1;
            c8 = c10;
            iArr3 = iArr2;
            iArr4 = iArr;
            z22 = z5;
            z23 = z6;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c11 = c8;
        boolean z28 = z22;
        boolean z29 = z23;
        int i69 = i58;
        int i70 = i59;
        int i71 = iMax7;
        if (y1Var.f1183x > 0 && y1Var.i(virtualChildCount2)) {
            y1Var.f1183x += y1Var.I;
        }
        int i72 = iArr5[1];
        int iMax11 = (i72 == -1 && iArr5[0] == -1 && iArr5[c11] == -1 && iArr5[3] == -1) ? i69 : Math.max(i69, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c11]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i72, iArr5[c11]))));
        if (z29 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            y1Var.f1183x = 0;
            for (int i73 = 0; i73 < virtualChildCount2; i73++) {
                View childAt7 = y1Var.getChildAt(i73);
                if (childAt7 == null) {
                    y1Var.f1183x = y1Var.f1183x;
                } else if (childAt7.getVisibility() != 8) {
                    x1 x1Var7 = (x1) childAt7.getLayoutParams();
                    if (z24) {
                        y1Var.f1183x = ((LinearLayout.LayoutParams) x1Var7).leftMargin + iMax8 + ((LinearLayout.LayoutParams) x1Var7).rightMargin + y1Var.f1183x;
                    } else {
                        int i74 = y1Var.f1183x;
                        y1Var.f1183x = Math.max(i74, i74 + iMax8 + ((LinearLayout.LayoutParams) x1Var7).leftMargin + ((LinearLayout.LayoutParams) x1Var7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = y1Var.getPaddingRight() + y1Var.getPaddingLeft() + y1Var.f1183x;
        y1Var.f1183x = paddingRight;
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, y1Var.getSuggestedMinimumWidth()), i56, 0);
        int i75 = (iResolveSizeAndState2 & 16777215) - y1Var.f1183x;
        if (z27 || (i75 != 0 && f12 > 0.0f)) {
            float f14 = y1Var.f1184y;
            if (f14 > 0.0f) {
                f12 = f14;
            }
            iArr5[3] = -1;
            iArr5[c11] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c11] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            y1Var.f1183x = 0;
            iMax11 = -1;
            int i76 = 0;
            while (i76 < virtualChildCount2) {
                View childAt8 = y1Var.getChildAt(i76);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    iResolveSizeAndState2 = iResolveSizeAndState2;
                } else {
                    x1 x1Var8 = (x1) childAt8.getLayoutParams();
                    float f15 = ((LinearLayout.LayoutParams) x1Var8).weight;
                    if (f15 > 0.0f) {
                        int i77 = (int) ((i75 * f15) / f12);
                        f12 -= f15;
                        i75 -= i77;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, y1Var.getPaddingBottom() + y1Var.getPaddingTop() + ((LinearLayout.LayoutParams) x1Var8).topMargin + ((LinearLayout.LayoutParams) x1Var8).bottomMargin, ((LinearLayout.LayoutParams) x1Var8).height);
                        if (((LinearLayout.LayoutParams) x1Var8).width == 0) {
                            i15 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i77 <= 0) {
                                    i77 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i77, 1073741824), childMeasureSpec2);
                            }
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                        } else {
                            i15 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i77;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i15), childMeasureSpec2);
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                    }
                    if (z24) {
                        y1Var.f1183x = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) x1Var8).leftMargin + ((LinearLayout.LayoutParams) x1Var8).rightMargin + y1Var.f1183x;
                    } else {
                        int i78 = y1Var.f1183x;
                        y1Var.f1183x = Math.max(i78, childAt8.getMeasuredWidth() + i78 + ((LinearLayout.LayoutParams) x1Var8).leftMargin + ((LinearLayout.LayoutParams) x1Var8).rightMargin);
                    }
                    boolean z30 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) x1Var8).height == -1;
                    int i79 = ((LinearLayout.LayoutParams) x1Var8).topMargin + ((LinearLayout.LayoutParams) x1Var8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i79;
                    iMax11 = Math.max(iMax11, measuredHeight4);
                    if (!z30) {
                        i79 = measuredHeight4;
                    }
                    int iMax12 = Math.max(i70, i79);
                    if (z25) {
                        i14 = -1;
                        boolean z31 = ((LinearLayout.LayoutParams) x1Var8).height == -1;
                        if (!z28 && (baseline = childAt8.getBaseline()) != i14) {
                            int i80 = ((LinearLayout.LayoutParams) x1Var8).gravity;
                            if (i80 < 0) {
                                i80 = y1Var.f1182w;
                            }
                            int i81 = (((i80 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i81] = Math.max(iArr5[i81], baseline);
                            iArr6[i81] = Math.max(iArr6[i81], measuredHeight4 - baseline);
                        }
                        z25 = z31;
                        i70 = iMax12;
                    } else {
                        i14 = -1;
                    }
                    if (!z28) {
                    }
                    z25 = z31;
                    i70 = iMax12;
                }
                i76++;
                iResolveSizeAndState2 = iResolveSizeAndState2;
            }
            i11 = iResolveSizeAndState2;
            i12 = -16777216;
            y1Var.f1183x = y1Var.getPaddingRight() + y1Var.getPaddingLeft() + y1Var.f1183x;
            int i82 = iArr5[1];
            if (i82 == -1 && iArr5[0] == -1 && iArr5[c11] == -1 && iArr5[3] == -1) {
                i13 = 0;
            } else {
                i13 = 0;
                iMax11 = Math.max(iMax11, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c11]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i82, iArr5[c11]))));
            }
            iMax = i70;
        } else {
            iMax = Math.max(i70, i71);
            if (z29 && mode3 != 1073741824) {
                for (int i83 = 0; i83 < virtualChildCount2; i83++) {
                    View childAt9 = y1Var.getChildAt(i83);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((x1) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax8, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i11 = iResolveSizeAndState2;
            i12 = -16777216;
            i13 = 0;
        }
        if (!z25 && mode4 != 1073741824) {
            iMax11 = iMax;
        }
        y1Var.setMeasuredDimension(i11 | (iCombineMeasuredStates3 & i12), View.resolveSizeAndState(Math.max(y1Var.getPaddingBottom() + y1Var.getPaddingTop() + iMax11, y1Var.getSuggestedMinimumHeight()), i10, iCombineMeasuredStates3 << 16));
        if (z26) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(y1Var.getMeasuredHeight(), 1073741824);
            int i84 = i13;
            while (i84 < virtualChildCount2) {
                View childAt10 = y1Var.getChildAt(i84);
                if (childAt10.getVisibility() != 8) {
                    x1 x1Var9 = (x1) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) x1Var9).height == -1) {
                        int i85 = ((LinearLayout.LayoutParams) x1Var9).width;
                        ((LinearLayout.LayoutParams) x1Var9).width = childAt10.getMeasuredWidth();
                        y1Var.measureChildWithMargins(childAt10, i56, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) x1Var9).width = i85;
                    }
                }
                i84++;
                y1Var = this;
                i56 = i7;
            }
        }
    }

    public void setBaselineAligned(boolean z5) {
        this.f1178d = z5;
    }

    public void setBaselineAlignedChildIndex(int i7) {
        if (i7 >= 0 && i7 < getChildCount()) {
            this.f1179e = i7;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.H) {
            return;
        }
        this.H = drawable;
        if (drawable != null) {
            this.I = drawable.getIntrinsicWidth();
            this.J = drawable.getIntrinsicHeight();
        } else {
            this.I = 0;
            this.J = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i7) {
        this.L = i7;
    }

    public void setGravity(int i7) {
        if (this.f1182w != i7) {
            if ((8388615 & i7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            this.f1182w = i7;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i7) {
        int i10 = i7 & 8388615;
        int i11 = this.f1182w;
        if ((8388615 & i11) != i10) {
            this.f1182w = i10 | ((-8388616) & i11);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z5) {
        this.E = z5;
    }

    public void setOrientation(int i7) {
        if (this.f1181v != i7) {
            this.f1181v = i7;
            requestLayout();
        }
    }

    public void setShowDividers(int i7) {
        if (i7 != this.K) {
            requestLayout();
        }
        this.K = i7;
    }

    public void setVerticalGravity(int i7) {
        int i10 = i7 & 112;
        int i11 = this.f1182w;
        if ((i11 & 112) != i10) {
            this.f1182w = i10 | (i11 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f1184y = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
