package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.u0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import ne.b;
import ne.c;
import ne.h;

/* JADX INFO: loaded from: classes3.dex */
public class FlexboxLayout extends ViewGroup implements ne.a {
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    private int mAlignContent;
    private int mAlignItems;
    private Drawable mDividerDrawableHorizontal;
    private Drawable mDividerDrawableVertical;
    private int mDividerHorizontalHeight;
    private int mDividerVerticalWidth;
    private int mFlexDirection;
    private List<FlexLine> mFlexLines;
    private FlexboxHelper.FlexLinesResult mFlexLinesResult;
    private int mFlexWrap;
    private FlexboxHelper mFlexboxHelper;
    private int mJustifyContent;
    private int mMaxLine;
    private SparseIntArray mOrderCache;
    private int[] mReorderedIndices;
    private int mShowDividerHorizontal;
    private int mShowDividerVertical;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements b {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();
        public int E;
        public int F;
        public boolean G;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f5876d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f5877e;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f5878i;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f5879v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public float f5880w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f5881x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f5882y;

        public LayoutParams(int i7, int i10) {
            super(new ViewGroup.LayoutParams(i7, i10));
            this.f5876d = 1;
            this.f5877e = 0.0f;
            this.f5878i = 1.0f;
            this.f5879v = -1;
            this.f5880w = -1.0f;
            this.f5881x = -1;
            this.f5882y = -1;
            this.E = 16777215;
            this.F = 16777215;
        }

        @Override // ne.b
        public final int c() {
            return this.f5879v;
        }

        @Override // ne.b
        public final float d() {
            return this.f5878i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // ne.b
        public final int f() {
            return this.f5881x;
        }

        @Override // ne.b
        public final void g(int i7) {
            this.f5881x = i7;
        }

        @Override // ne.b
        public final int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // ne.b
        public final int getOrder() {
            return this.f5876d;
        }

        @Override // ne.b
        public final int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // ne.b
        public final int j() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // ne.b
        public final int k() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // ne.b
        public final int l() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // ne.b
        public final void m(int i7) {
            this.f5882y = i7;
        }

        @Override // ne.b
        public final float n() {
            return this.f5877e;
        }

        @Override // ne.b
        public final float o() {
            return this.f5880w;
        }

        @Override // ne.b
        public final int p() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // ne.b
        public final int q() {
            return this.f5882y;
        }

        @Override // ne.b
        public final boolean r() {
            return this.G;
        }

        @Override // ne.b
        public final int s() {
            return this.F;
        }

        @Override // ne.b
        public final int u() {
            return this.E;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f5876d);
            parcel.writeFloat(this.f5877e);
            parcel.writeFloat(this.f5878i);
            parcel.writeInt(this.f5879v);
            parcel.writeFloat(this.f5880w);
            parcel.writeInt(this.f5881x);
            parcel.writeInt(this.f5882y);
            parcel.writeInt(this.E);
            parcel.writeInt(this.F);
            parcel.writeByte(this.G ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.mMaxLine = -1;
        this.mFlexboxHelper = new FlexboxHelper(this);
        this.mFlexLines = new ArrayList();
        this.mFlexLinesResult = new FlexboxHelper.FlexLinesResult();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f16586a, 0, 0);
        this.mFlexDirection = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.mFlexWrap = typedArrayObtainStyledAttributes.getInt(6, 0);
        this.mJustifyContent = typedArrayObtainStyledAttributes.getInt(7, 0);
        this.mAlignItems = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.mAlignContent = typedArrayObtainStyledAttributes.getInt(0, 0);
        this.mMaxLine = typedArrayObtainStyledAttributes.getInt(8, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i7 = typedArrayObtainStyledAttributes.getInt(9, 0);
        if (i7 != 0) {
            this.mShowDividerVertical = i7;
            this.mShowDividerHorizontal = i7;
        }
        int i10 = typedArrayObtainStyledAttributes.getInt(11, 0);
        if (i10 != 0) {
            this.mShowDividerVertical = i10;
        }
        int i11 = typedArrayObtainStyledAttributes.getInt(10, 0);
        if (i11 != 0) {
            this.mShowDividerHorizontal = i11;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(Canvas canvas, boolean z5, boolean z6) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.mFlexLines.size();
        for (int i7 = 0; i7 < size; i7++) {
            FlexLine flexLine = this.mFlexLines.get(i7);
            for (int i10 = 0; i10 < flexLine.f5860h; i10++) {
                int i11 = flexLine.f5865o + i10;
                View reorderedChildAt = getReorderedChildAt(i11);
                if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                    if (e(i11, i10)) {
                        d(canvas, z5 ? reorderedChildAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (reorderedChildAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.mDividerVerticalWidth, flexLine.f5854b, flexLine.f5859g);
                    }
                    if (i10 == flexLine.f5860h - 1 && (this.mShowDividerVertical & 4) > 0) {
                        d(canvas, z5 ? (reorderedChildAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.mDividerVerticalWidth : reorderedChildAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, flexLine.f5854b, flexLine.f5859g);
                    }
                }
            }
            if (f(i7)) {
                c(canvas, paddingLeft, z6 ? flexLine.f5856d : flexLine.f5854b - this.mDividerHorizontalHeight, iMax);
            }
            if (g(i7) && (this.mShowDividerHorizontal & 4) > 0) {
                c(canvas, paddingLeft, z6 ? flexLine.f5854b - this.mDividerHorizontalHeight : flexLine.f5856d, iMax);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (this.mOrderCache == null) {
            this.mOrderCache = new SparseIntArray(getChildCount());
        }
        FlexboxHelper flexboxHelper = this.mFlexboxHelper;
        SparseIntArray sparseIntArray = this.mOrderCache;
        ne.a aVar = flexboxHelper.f5869a;
        int flexItemCount = aVar.getFlexItemCount();
        ArrayList arrayListF = flexboxHelper.f(flexItemCount);
        c cVar = new c();
        if (view == null || !(layoutParams instanceof b)) {
            cVar.f16563e = 1;
        } else {
            cVar.f16563e = ((b) layoutParams).getOrder();
        }
        if (i7 == -1 || i7 == flexItemCount || i7 >= aVar.getFlexItemCount()) {
            cVar.f16562d = flexItemCount;
        } else {
            cVar.f16562d = i7;
            for (int i10 = i7; i10 < flexItemCount; i10++) {
                ((c) arrayListF.get(i10)).f16562d++;
            }
        }
        arrayListF.add(cVar);
        this.mReorderedIndices = FlexboxHelper.r(flexItemCount + 1, arrayListF, sparseIntArray);
        super.addView(view, i7, layoutParams);
    }

    public final void b(Canvas canvas, boolean z5, boolean z6) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.mFlexLines.size();
        for (int i7 = 0; i7 < size; i7++) {
            FlexLine flexLine = this.mFlexLines.get(i7);
            for (int i10 = 0; i10 < flexLine.f5860h; i10++) {
                int i11 = flexLine.f5865o + i10;
                View reorderedChildAt = getReorderedChildAt(i11);
                if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                    if (e(i11, i10)) {
                        c(canvas, flexLine.f5853a, z6 ? reorderedChildAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (reorderedChildAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.mDividerHorizontalHeight, flexLine.f5859g);
                    }
                    if (i10 == flexLine.f5860h - 1 && (this.mShowDividerHorizontal & 4) > 0) {
                        c(canvas, flexLine.f5853a, z6 ? (reorderedChildAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.mDividerHorizontalHeight : reorderedChildAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, flexLine.f5859g);
                    }
                }
            }
            if (f(i7)) {
                d(canvas, z5 ? flexLine.f5855c : flexLine.f5853a - this.mDividerVerticalWidth, paddingTop, iMax);
            }
            if (g(i7) && (this.mShowDividerVertical & 4) > 0) {
                d(canvas, z5 ? flexLine.f5853a - this.mDividerVerticalWidth : flexLine.f5855c, paddingTop, iMax);
            }
        }
    }

    public final void c(Canvas canvas, int i7, int i10, int i11) {
        Drawable drawable = this.mDividerDrawableHorizontal;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i7, i10, i11 + i7, this.mDividerHorizontalHeight + i10);
        this.mDividerDrawableHorizontal.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void d(Canvas canvas, int i7, int i10, int i11) {
        Drawable drawable = this.mDividerDrawableVertical;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i7, i10, this.mDividerVerticalWidth + i7, i11 + i10);
        this.mDividerDrawableVertical.draw(canvas);
    }

    public final boolean e(int i7, int i10) {
        for (int i11 = 1; i11 <= i10; i11++) {
            View reorderedChildAt = getReorderedChildAt(i7 - i11);
            if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                if (isMainAxisDirectionHorizontal()) {
                    return (this.mShowDividerVertical & 2) != 0;
                }
                return (this.mShowDividerHorizontal & 2) != 0;
            }
        }
        if (isMainAxisDirectionHorizontal()) {
            return (this.mShowDividerVertical & 1) != 0;
        }
        return (this.mShowDividerHorizontal & 1) != 0;
    }

    public final boolean f(int i7) {
        if (i7 >= 0 && i7 < this.mFlexLines.size()) {
            for (int i10 = 0; i10 < i7; i10++) {
                if (this.mFlexLines.get(i10).a() > 0) {
                    if (isMainAxisDirectionHorizontal()) {
                        return (this.mShowDividerHorizontal & 2) != 0;
                    }
                    return (this.mShowDividerVertical & 2) != 0;
                }
            }
            if (isMainAxisDirectionHorizontal()) {
                return (this.mShowDividerHorizontal & 1) != 0;
            }
            if ((this.mShowDividerVertical & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean g(int i7) {
        if (i7 >= 0 && i7 < this.mFlexLines.size()) {
            for (int i10 = i7 + 1; i10 < this.mFlexLines.size(); i10++) {
                if (this.mFlexLines.get(i10).a() > 0) {
                    return false;
                }
            }
            if (isMainAxisDirectionHorizontal()) {
                return (this.mShowDividerHorizontal & 4) != 0;
            }
            if ((this.mShowDividerVertical & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // ne.a
    public int getAlignContent() {
        return this.mAlignContent;
    }

    @Override // ne.a
    public int getAlignItems() {
        return this.mAlignItems;
    }

    @Override // ne.a
    public int getChildHeightMeasureSpec(int i7, int i10, int i11) {
        return ViewGroup.getChildMeasureSpec(i7, i10, i11);
    }

    @Override // ne.a
    public int getChildWidthMeasureSpec(int i7, int i10, int i11) {
        return ViewGroup.getChildMeasureSpec(i7, i10, i11);
    }

    @Override // ne.a
    public int getDecorationLengthCrossAxis(View view) {
        return 0;
    }

    @Override // ne.a
    public int getDecorationLengthMainAxis(View view, int i7, int i10) {
        int i11;
        int i12;
        if (isMainAxisDirectionHorizontal()) {
            i11 = e(i7, i10) ? this.mDividerVerticalWidth : 0;
            if ((this.mShowDividerVertical & 4) <= 0) {
                return i11;
            }
            i12 = this.mDividerVerticalWidth;
        } else {
            i11 = e(i7, i10) ? this.mDividerHorizontalHeight : 0;
            if ((this.mShowDividerHorizontal & 4) <= 0) {
                return i11;
            }
            i12 = this.mDividerHorizontalHeight;
        }
        return i11 + i12;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.mDividerDrawableHorizontal;
    }

    public Drawable getDividerDrawableVertical() {
        return this.mDividerDrawableVertical;
    }

    @Override // ne.a
    public int getFlexDirection() {
        return this.mFlexDirection;
    }

    @Override // ne.a
    public View getFlexItemAt(int i7) {
        return getChildAt(i7);
    }

    @Override // ne.a
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<FlexLine> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.mFlexLines.size());
        for (FlexLine flexLine : this.mFlexLines) {
            if (flexLine.a() != 0) {
                arrayList.add(flexLine);
            }
        }
        return arrayList;
    }

    @Override // ne.a
    public List<FlexLine> getFlexLinesInternal() {
        return this.mFlexLines;
    }

    @Override // ne.a
    public int getFlexWrap() {
        return this.mFlexWrap;
    }

    public int getJustifyContent() {
        return this.mJustifyContent;
    }

    @Override // ne.a
    public int getLargestMainSize() {
        Iterator<FlexLine> it = this.mFlexLines.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().f5857e);
        }
        return iMax;
    }

    @Override // ne.a
    public int getMaxLine() {
        return this.mMaxLine;
    }

    public View getReorderedChildAt(int i7) {
        if (i7 < 0) {
            return null;
        }
        int[] iArr = this.mReorderedIndices;
        if (i7 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i7]);
    }

    @Override // ne.a
    public View getReorderedFlexItemAt(int i7) {
        return getReorderedChildAt(i7);
    }

    public int getShowDividerHorizontal() {
        return this.mShowDividerHorizontal;
    }

    public int getShowDividerVertical() {
        return this.mShowDividerVertical;
    }

    @Override // ne.a
    public int getSumOfCrossSize() {
        int size = this.mFlexLines.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            FlexLine flexLine = this.mFlexLines.get(i10);
            if (f(i10)) {
                i7 += isMainAxisDirectionHorizontal() ? this.mDividerHorizontalHeight : this.mDividerVerticalWidth;
            }
            if (g(i10)) {
                i7 += isMainAxisDirectionHorizontal() ? this.mDividerHorizontalHeight : this.mDividerVerticalWidth;
            }
            i7 += flexLine.f5859g;
        }
        return i7;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:49:0x0108  */
    /* JADX WARN: Code duplicated, block: B:51:0x0112  */
    /* JADX WARN: Code duplicated, block: B:57:0x0126  */
    /* JADX WARN: Code duplicated, block: B:60:0x012c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x012e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0156  */
    /* JADX WARN: Code duplicated, block: B:64:0x017a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0188  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f2  */
    public final void h(int i7, int i10, int i11, int i12, boolean z5) {
        float measuredWidth;
        float f2;
        float f7;
        float fMax;
        int i13;
        int i14;
        View reorderedChildAt;
        boolean z6;
        int i15;
        int i16;
        float f10;
        float f11;
        int i17;
        float f12;
        int i18;
        View view;
        FlexLine flexLine;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i19 = i11 - i7;
        int paddingBottom = (i12 - i10) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.mFlexLines.size();
        for (int i20 = 0; i20 < size; i20++) {
            FlexLine flexLine2 = this.mFlexLines.get(i20);
            if (f(i20)) {
                int i21 = this.mDividerHorizontalHeight;
                paddingBottom -= i21;
                paddingTop += i21;
            }
            int i22 = paddingBottom;
            int i23 = this.mJustifyContent;
            char c8 = 4;
            int i24 = 2;
            boolean z7 = true;
            if (i23 == 0) {
                measuredWidth = paddingLeft;
                f2 = i19 - paddingRight;
            } else if (i23 != 1) {
                if (i23 == 2) {
                    int i25 = flexLine2.f5857e;
                    measuredWidth = paddingLeft + ((i19 - i25) / 2.0f);
                    f2 = (i19 - paddingRight) - ((i19 - i25) / 2.0f);
                } else if (i23 == 3) {
                    measuredWidth = paddingLeft;
                    int iA = flexLine2.a();
                    f7 = (i19 - flexLine2.f5857e) / (iA != 1 ? iA - 1 : 1.0f);
                    f2 = i19 - paddingRight;
                } else if (i23 == 4) {
                    int iA2 = flexLine2.a();
                    float f13 = iA2 != 0 ? (i19 - flexLine2.f5857e) / iA2 : 0.0f;
                    float f14 = f13 / 2.0f;
                    measuredWidth = paddingLeft + f14;
                    float f15 = (i19 - paddingRight) - f14;
                    f7 = f13;
                    f2 = f15;
                } else {
                    if (i23 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.mJustifyContent);
                    }
                    int iA3 = flexLine2.a();
                    f7 = iA3 != 0 ? (i19 - flexLine2.f5857e) / (iA3 + 1) : 0.0f;
                    measuredWidth = paddingLeft + f7;
                    f2 = (i19 - paddingRight) - f7;
                }
                fMax = Math.max(f7, 0.0f);
                i13 = 0;
                while (i13 < flexLine2.f5860h) {
                    i14 = flexLine2.f5865o + i13;
                    reorderedChildAt = getReorderedChildAt(i14);
                    char c10 = c8;
                    if (reorderedChildAt != null) {
                        z6 = z7;
                        if (reorderedChildAt.getVisibility() == 8) {
                            z6 = z6;
                        } else {
                            LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                            f10 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                            f11 = f2 - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            if (e(i14, i13)) {
                                int i26 = this.mDividerVerticalWidth;
                                float f16 = i26;
                                f10 += f16;
                                f11 -= f16;
                                i17 = i26;
                            } else {
                                i17 = 0;
                            }
                            f12 = f11;
                            if (i13 == flexLine2.f5860h - 1 || (this.mShowDividerVertical & 4) <= 0) {
                                i18 = 0;
                            } else {
                                i18 = this.mDividerVerticalWidth;
                            }
                            if (this.mFlexWrap == i24) {
                                if (z5) {
                                    i16 = i24;
                                    view = reorderedChildAt;
                                    this.mFlexboxHelper.o(view, flexLine2, Math.round(f12) - reorderedChildAt.getMeasuredWidth(), i22 - reorderedChildAt.getMeasuredHeight(), Math.round(f12), i22);
                                } else {
                                    view = reorderedChildAt;
                                    i16 = i24;
                                    this.mFlexboxHelper.o(view, flexLine2, Math.round(f10), i22 - view.getMeasuredHeight(), view.getMeasuredWidth() + Math.round(f10), i22);
                                }
                                i15 = i22;
                            } else {
                                i13 = i13;
                                view = reorderedChildAt;
                                z6 = z6;
                                i16 = i24;
                                i15 = i22;
                                if (z5) {
                                    this.mFlexboxHelper.o(view, flexLine2, Math.round(f12) - view.getMeasuredWidth(), paddingTop, Math.round(f12), view.getMeasuredHeight() + paddingTop);
                                } else {
                                    int i27 = paddingTop;
                                    this.mFlexboxHelper.o(view, flexLine2, Math.round(f10), i27, view.getMeasuredWidth() + Math.round(f10), view.getMeasuredHeight() + i27);
                                    paddingTop = i27;
                                }
                            }
                            measuredWidth = f10 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            float measuredWidth2 = f12 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
                            if (z5) {
                                flexLine = flexLine2;
                                flexLine.b(view, i18, 0, i17, 0);
                            } else {
                                flexLine = flexLine2;
                                flexLine.b(view, i17, 0, i18, 0);
                            }
                            flexLine2 = flexLine;
                            f2 = measuredWidth2;
                        }
                        i13++;
                        c8 = c10;
                        i24 = i16;
                        z7 = z6;
                        i22 = i15;
                    } else {
                        z6 = z7;
                    }
                    i16 = i24;
                    i13 = i13;
                    i15 = i22;
                    i13++;
                    c8 = c10;
                    i24 = i16;
                    z7 = z6;
                    i22 = i15;
                }
                int i28 = flexLine2.f5859g;
                paddingTop += i28;
                paddingBottom = i22 - i28;
            } else {
                int i29 = flexLine2.f5857e;
                f2 = i29 - paddingLeft;
                measuredWidth = (i19 - i29) + paddingRight;
            }
            f7 = 0.0f;
            fMax = Math.max(f7, 0.0f);
            i13 = 0;
            while (i13 < flexLine2.f5860h) {
                i14 = flexLine2.f5865o + i13;
                reorderedChildAt = getReorderedChildAt(i14);
                char c11 = c8;
                if (reorderedChildAt != null) {
                    z6 = z7;
                    if (reorderedChildAt.getVisibility() == 8) {
                        z6 = z6;
                    } else {
                        LayoutParams layoutParams2 = (LayoutParams) reorderedChildAt.getLayoutParams();
                        f10 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                        f11 = f2 - ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        if (e(i14, i13)) {
                            int i210 = this.mDividerVerticalWidth;
                            float f17 = i210;
                            f10 += f17;
                            f11 -= f17;
                            i17 = i210;
                        } else {
                            i17 = 0;
                        }
                        f12 = f11;
                        if (i13 == flexLine2.f5860h - 1) {
                            i18 = 0;
                        } else {
                            i18 = 0;
                        }
                        if (this.mFlexWrap == i24) {
                            if (z5) {
                                i16 = i24;
                                view = reorderedChildAt;
                                this.mFlexboxHelper.o(view, flexLine2, Math.round(f12) - reorderedChildAt.getMeasuredWidth(), i22 - reorderedChildAt.getMeasuredHeight(), Math.round(f12), i22);
                            } else {
                                view = reorderedChildAt;
                                i16 = i24;
                                this.mFlexboxHelper.o(view, flexLine2, Math.round(f10), i22 - view.getMeasuredHeight(), view.getMeasuredWidth() + Math.round(f10), i22);
                            }
                            i15 = i22;
                        } else {
                            i13 = i13;
                            view = reorderedChildAt;
                            z6 = z6;
                            i16 = i24;
                            i15 = i22;
                            if (z5) {
                                this.mFlexboxHelper.o(view, flexLine2, Math.round(f12) - view.getMeasuredWidth(), paddingTop, Math.round(f12), view.getMeasuredHeight() + paddingTop);
                            } else {
                                int i211 = paddingTop;
                                this.mFlexboxHelper.o(view, flexLine2, Math.round(f10), i211, view.getMeasuredWidth() + Math.round(f10), view.getMeasuredHeight() + i211);
                                paddingTop = i211;
                            }
                        }
                        measuredWidth = f10 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        float measuredWidth3 = f12 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
                        if (z5) {
                            flexLine = flexLine2;
                            flexLine.b(view, i18, 0, i17, 0);
                        } else {
                            flexLine = flexLine2;
                            flexLine.b(view, i17, 0, i18, 0);
                        }
                        flexLine2 = flexLine;
                        f2 = measuredWidth3;
                    }
                    i13++;
                    c8 = c11;
                    i24 = i16;
                    z7 = z6;
                    i22 = i15;
                } else {
                    z6 = z7;
                }
                i16 = i24;
                i13 = i13;
                i15 = i22;
                i13++;
                c8 = c11;
                i24 = i16;
                z7 = z6;
                i22 = i15;
            }
            int i212 = flexLine2.f5859g;
            paddingTop += i212;
            paddingBottom = i22 - i212;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00da  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:48:0x0100  */
    /* JADX WARN: Code duplicated, block: B:50:0x0108  */
    /* JADX WARN: Code duplicated, block: B:56:0x011a  */
    /* JADX WARN: Code duplicated, block: B:58:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0120  */
    /* JADX WARN: Code duplicated, block: B:61:0x0144  */
    /* JADX WARN: Code duplicated, block: B:62:0x0163  */
    /* JADX WARN: Code duplicated, block: B:64:0x016b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0187  */
    /* JADX WARN: Code duplicated, block: B:68:0x01be  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d6  */
    public final void i(int i7, int i10, int i11, int i12, boolean z5, boolean z6) {
        float measuredHeight;
        float f2;
        float f7;
        float fMax;
        int i13;
        int i14;
        int i15;
        View reorderedChildAt;
        char c8;
        int i16;
        int i17;
        float f10;
        float f11;
        int i18;
        float f12;
        int i19;
        FlexLine flexLine;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i20 = i12 - i10;
        int i21 = (i11 - i7) - paddingRight;
        int size = this.mFlexLines.size();
        for (int i22 = 0; i22 < size; i22++) {
            FlexLine flexLine2 = this.mFlexLines.get(i22);
            if (f(i22)) {
                int i23 = this.mDividerVerticalWidth;
                paddingLeft += i23;
                i21 -= i23;
            }
            int i24 = i21;
            int i25 = this.mJustifyContent;
            char c10 = 4;
            int i26 = 1;
            if (i25 == 0) {
                measuredHeight = paddingTop;
                f2 = i20 - paddingBottom;
            } else if (i25 != 1) {
                if (i25 == 2) {
                    float f13 = (i20 - flexLine2.f5857e) / 2.0f;
                    measuredHeight = paddingTop + f13;
                    f2 = (i20 - paddingBottom) - f13;
                } else if (i25 == 3) {
                    measuredHeight = paddingTop;
                    int iA = flexLine2.a();
                    f7 = (i20 - flexLine2.f5857e) / (iA != 1 ? iA - 1 : 1.0f);
                    f2 = i20 - paddingBottom;
                } else if (i25 == 4) {
                    int iA2 = flexLine2.a();
                    f7 = iA2 != 0 ? (i20 - flexLine2.f5857e) / iA2 : 0.0f;
                    float f14 = f7 / 2.0f;
                    measuredHeight = paddingTop + f14;
                    f2 = (i20 - paddingBottom) - f14;
                } else {
                    if (i25 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.mJustifyContent);
                    }
                    int iA3 = flexLine2.a();
                    f7 = iA3 != 0 ? (i20 - flexLine2.f5857e) / (iA3 + 1) : 0.0f;
                    measuredHeight = paddingTop + f7;
                    f2 = (i20 - paddingBottom) - f7;
                }
                fMax = Math.max(f7, 0.0f);
                i13 = 0;
                while (i13 < flexLine2.f5860h) {
                    i14 = flexLine2.f5865o + i13;
                    i15 = i26;
                    reorderedChildAt = getReorderedChildAt(i14);
                    if (reorderedChildAt != null) {
                        c8 = c10;
                        if (reorderedChildAt.getVisibility() == 8) {
                            LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                            f10 = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                            f11 = f2 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (e(i14, i13)) {
                                i18 = this.mDividerHorizontalHeight;
                                float f15 = i18;
                                f10 += f15;
                                f11 -= f15;
                            } else {
                                i18 = 0;
                            }
                            f12 = f11;
                            if (i13 == flexLine2.f5860h - i15 || (this.mShowDividerHorizontal & 4) <= 0) {
                                i19 = 0;
                            } else {
                                i19 = this.mDividerHorizontalHeight;
                            }
                            if (z5) {
                                if (z6) {
                                    i17 = i13;
                                    this.mFlexboxHelper.p(reorderedChildAt, flexLine2, true, i24 - reorderedChildAt.getMeasuredWidth(), Math.round(f12) - reorderedChildAt.getMeasuredHeight(), i24, Math.round(f12));
                                } else {
                                    i17 = i13;
                                    this.mFlexboxHelper.p(reorderedChildAt, flexLine2, true, i24 - reorderedChildAt.getMeasuredWidth(), Math.round(f10), i24, reorderedChildAt.getMeasuredHeight() + Math.round(f10));
                                }
                                i16 = i24;
                            } else {
                                i17 = i13;
                                i15 = i15;
                                i16 = i24;
                                if (z6) {
                                    this.mFlexboxHelper.p(reorderedChildAt, flexLine2, false, paddingLeft, Math.round(f12) - reorderedChildAt.getMeasuredHeight(), reorderedChildAt.getMeasuredWidth() + paddingLeft, Math.round(f12));
                                } else {
                                    int i27 = paddingLeft;
                                    this.mFlexboxHelper.p(reorderedChildAt, flexLine2, false, i27, Math.round(f10), reorderedChildAt.getMeasuredWidth() + i27, reorderedChildAt.getMeasuredHeight() + Math.round(f10));
                                    paddingLeft = i27;
                                }
                            }
                            measuredHeight = f10 + reorderedChildAt.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            float measuredHeight2 = f12 - ((reorderedChildAt.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                            if (z6) {
                                flexLine = flexLine2;
                                flexLine.b(reorderedChildAt, 0, i19, 0, i18);
                            } else {
                                flexLine = flexLine2;
                                flexLine.b(reorderedChildAt, 0, i18, 0, i19);
                            }
                            flexLine2 = flexLine;
                            f2 = measuredHeight2;
                        }
                        i13 = i17 + 1;
                        c10 = c8;
                        i26 = i15;
                        i24 = i16;
                    } else {
                        c8 = c10;
                    }
                    i17 = i13;
                    i15 = i15;
                    i16 = i24;
                    i13 = i17 + 1;
                    c10 = c8;
                    i26 = i15;
                    i24 = i16;
                }
                int i28 = flexLine2.f5859g;
                paddingLeft += i28;
                i21 = i24 - i28;
            } else {
                int i29 = flexLine2.f5857e;
                f2 = i29 - paddingTop;
                measuredHeight = (i20 - i29) + paddingBottom;
            }
            f7 = 0.0f;
            fMax = Math.max(f7, 0.0f);
            i13 = 0;
            while (i13 < flexLine2.f5860h) {
                i14 = flexLine2.f5865o + i13;
                i15 = i26;
                reorderedChildAt = getReorderedChildAt(i14);
                if (reorderedChildAt != null) {
                    c8 = c10;
                    if (reorderedChildAt.getVisibility() == 8) {
                        LayoutParams layoutParams2 = (LayoutParams) reorderedChildAt.getLayoutParams();
                        f10 = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                        f11 = f2 - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        if (e(i14, i13)) {
                            i18 = this.mDividerHorizontalHeight;
                            float f16 = i18;
                            f10 += f16;
                            f11 -= f16;
                        } else {
                            i18 = 0;
                        }
                        f12 = f11;
                        if (i13 == flexLine2.f5860h - i15) {
                            i19 = 0;
                        } else {
                            i19 = 0;
                        }
                        if (z5) {
                            if (z6) {
                                i17 = i13;
                                this.mFlexboxHelper.p(reorderedChildAt, flexLine2, true, i24 - reorderedChildAt.getMeasuredWidth(), Math.round(f12) - reorderedChildAt.getMeasuredHeight(), i24, Math.round(f12));
                            } else {
                                i17 = i13;
                                this.mFlexboxHelper.p(reorderedChildAt, flexLine2, true, i24 - reorderedChildAt.getMeasuredWidth(), Math.round(f10), i24, reorderedChildAt.getMeasuredHeight() + Math.round(f10));
                            }
                            i16 = i24;
                        } else {
                            i17 = i13;
                            i15 = i15;
                            i16 = i24;
                            if (z6) {
                                this.mFlexboxHelper.p(reorderedChildAt, flexLine2, false, paddingLeft, Math.round(f12) - reorderedChildAt.getMeasuredHeight(), reorderedChildAt.getMeasuredWidth() + paddingLeft, Math.round(f12));
                            } else {
                                int i210 = paddingLeft;
                                this.mFlexboxHelper.p(reorderedChildAt, flexLine2, false, i210, Math.round(f10), reorderedChildAt.getMeasuredWidth() + i210, reorderedChildAt.getMeasuredHeight() + Math.round(f10));
                                paddingLeft = i210;
                            }
                        }
                        measuredHeight = f10 + reorderedChildAt.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        float measuredHeight3 = f12 - ((reorderedChildAt.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin);
                        if (z6) {
                            flexLine = flexLine2;
                            flexLine.b(reorderedChildAt, 0, i19, 0, i18);
                        } else {
                            flexLine = flexLine2;
                            flexLine.b(reorderedChildAt, 0, i18, 0, i19);
                        }
                        flexLine2 = flexLine;
                        f2 = measuredHeight3;
                    }
                    i13 = i17 + 1;
                    c10 = c8;
                    i26 = i15;
                    i24 = i16;
                } else {
                    c8 = c10;
                }
                i17 = i13;
                i15 = i15;
                i16 = i24;
                i13 = i17 + 1;
                c10 = c8;
                i26 = i15;
                i24 = i16;
            }
            int i211 = flexLine2.f5859g;
            paddingLeft += i211;
            i21 = i24 - i211;
        }
    }

    @Override // ne.a
    public boolean isMainAxisDirectionHorizontal() {
        int i7 = this.mFlexDirection;
        return i7 == 0 || i7 == 1;
    }

    public final void j(int i7, int i10, int i11, int i12) {
        int paddingBottom;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (i7 == 0 || i7 == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        } else {
            if (i7 != 2 && i7 != 3) {
                throw new IllegalArgumentException(kk.b.h(i7, "Invalid flex direction: "));
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i12 = View.combineMeasuredStates(i12, PointerEventHelper.X_FLAG_SUPPORTS_HOVER);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i10, i12);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i10, i12);
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException(kk.b.h(mode, "Unknown width mode is set: "));
            }
            if (size < largestMainSize) {
                i12 = View.combineMeasuredStates(i12, PointerEventHelper.X_FLAG_SUPPORTS_HOVER);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i10, i12);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i12 = View.combineMeasuredStates(i12, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            } else {
                size2 = paddingBottom;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i11, i12);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i11, i12);
        } else {
            if (mode2 != 1073741824) {
                throw new IllegalStateException(kk.b.h(mode2, "Unknown height mode is set: "));
            }
            if (size2 < paddingBottom) {
                i12 = View.combineMeasuredStates(i12, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i11, i12);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mDividerDrawableVertical == null && this.mDividerDrawableHorizontal == null) {
            return;
        }
        if (this.mShowDividerHorizontal == 0 && this.mShowDividerVertical == 0) {
            return;
        }
        WeakHashMap weakHashMap = u0.f1729a;
        int layoutDirection = getLayoutDirection();
        int i7 = this.mFlexDirection;
        if (i7 == 0) {
            a(canvas, layoutDirection == 1, this.mFlexWrap == 2);
            return;
        }
        if (i7 == 1) {
            a(canvas, layoutDirection != 1, this.mFlexWrap == 2);
            return;
        }
        if (i7 == 2) {
            boolean z5 = layoutDirection == 1;
            if (this.mFlexWrap == 2) {
                z5 = !z5;
            }
            b(canvas, z5, false);
            return;
        }
        if (i7 != 3) {
            return;
        }
        boolean z6 = layoutDirection == 1;
        if (this.mFlexWrap == 2) {
            z6 = !z6;
        }
        b(canvas, z6, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        WeakHashMap weakHashMap = u0.f1729a;
        int layoutDirection = getLayoutDirection();
        int i13 = this.mFlexDirection;
        if (i13 == 0) {
            h(i7, i10, i11, i12, layoutDirection == 1);
            return;
        }
        if (i13 == 1) {
            h(i7, i10, i11, i12, layoutDirection != 1);
            return;
        }
        if (i13 == 2) {
            boolean z6 = false;
            if (layoutDirection == 1) {
                z6 = true;
            }
            if (this.mFlexWrap == 2) {
                z6 = !z6;
            }
            i(i7, i10, i11, i12, z6, false);
            return;
        }
        if (i13 != 3) {
            throw new IllegalStateException("Invalid flex direction is set: " + this.mFlexDirection);
        }
        boolean z7 = layoutDirection == 1;
        if (this.mFlexWrap == 2) {
            z7 = !z7;
        }
        i(i7, i10, i11, i12, z7, true);
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        if (this.mOrderCache == null) {
            this.mOrderCache = new SparseIntArray(getChildCount());
        }
        FlexboxHelper flexboxHelper = this.mFlexboxHelper;
        SparseIntArray sparseIntArray = this.mOrderCache;
        ne.a aVar = flexboxHelper.f5869a;
        int flexItemCount = aVar.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            FlexboxHelper flexboxHelper2 = this.mFlexboxHelper;
            SparseIntArray sparseIntArray2 = this.mOrderCache;
            int flexItemCount2 = flexboxHelper2.f5869a.getFlexItemCount();
            this.mReorderedIndices = FlexboxHelper.r(flexItemCount2, flexboxHelper2.f(flexItemCount2), sparseIntArray2);
            break;
        }
        for (int i11 = 0; i11 < flexItemCount; i11++) {
            View flexItemAt = aVar.getFlexItemAt(i11);
            if (flexItemAt != null && ((b) flexItemAt.getLayoutParams()).getOrder() != sparseIntArray.get(i11)) {
                FlexboxHelper flexboxHelper3 = this.mFlexboxHelper;
                SparseIntArray sparseIntArray3 = this.mOrderCache;
                int flexItemCount3 = flexboxHelper3.f5869a.getFlexItemCount();
                this.mReorderedIndices = FlexboxHelper.r(flexItemCount3, flexboxHelper3.f(flexItemCount3), sparseIntArray3);
                break;
            }
        }
        int i12 = this.mFlexDirection;
        if (i12 != 0 && i12 != 1) {
            if (i12 != 2 && i12 != 3) {
                throw new IllegalStateException("Invalid value for the flex direction is set: " + this.mFlexDirection);
            }
            this.mFlexLines.clear();
            FlexboxHelper.FlexLinesResult flexLinesResult = this.mFlexLinesResult;
            flexLinesResult.f5874a = null;
            flexLinesResult.f5875b = 0;
            this.mFlexboxHelper.b(flexLinesResult, i10, i7, Integer.MAX_VALUE, 0, -1, null);
            this.mFlexLines = this.mFlexLinesResult.f5874a;
            this.mFlexboxHelper.h(i7, i10, 0);
            this.mFlexboxHelper.g(i7, i10, getPaddingRight() + getPaddingLeft());
            this.mFlexboxHelper.u(0);
            j(this.mFlexDirection, i7, i10, this.mFlexLinesResult.f5875b);
            return;
        }
        this.mFlexLines.clear();
        FlexboxHelper.FlexLinesResult flexLinesResult2 = this.mFlexLinesResult;
        flexLinesResult2.f5874a = null;
        flexLinesResult2.f5875b = 0;
        this.mFlexboxHelper.b(flexLinesResult2, i7, i10, Integer.MAX_VALUE, 0, -1, null);
        this.mFlexLines = this.mFlexLinesResult.f5874a;
        this.mFlexboxHelper.h(i7, i10, 0);
        if (this.mAlignItems == 3) {
            for (FlexLine flexLine : this.mFlexLines) {
                int iMax = Integer.MIN_VALUE;
                for (int i13 = 0; i13 < flexLine.f5860h; i13++) {
                    View reorderedChildAt = getReorderedChildAt(flexLine.f5865o + i13);
                    if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                        iMax = this.mFlexWrap != 2 ? Math.max(iMax, reorderedChildAt.getMeasuredHeight() + Math.max(flexLine.f5862l - reorderedChildAt.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(iMax, reorderedChildAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max(reorderedChildAt.getBaseline() + (flexLine.f5862l - reorderedChildAt.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                    }
                }
                flexLine.f5859g = iMax;
            }
        }
        this.mFlexboxHelper.g(i7, i10, getPaddingBottom() + getPaddingTop());
        this.mFlexboxHelper.u(0);
        j(this.mFlexDirection, i7, i10, this.mFlexLinesResult.f5875b);
    }

    @Override // ne.a
    public void onNewFlexItemAdded(View view, int i7, int i10, FlexLine flexLine) {
        if (e(i7, i10)) {
            if (isMainAxisDirectionHorizontal()) {
                int i11 = flexLine.f5857e;
                int i12 = this.mDividerVerticalWidth;
                flexLine.f5857e = i11 + i12;
                flexLine.f5858f += i12;
                return;
            }
            int i13 = flexLine.f5857e;
            int i14 = this.mDividerHorizontalHeight;
            flexLine.f5857e = i13 + i14;
            flexLine.f5858f += i14;
        }
    }

    @Override // ne.a
    public void onNewFlexLineAdded(FlexLine flexLine) {
        if (isMainAxisDirectionHorizontal()) {
            if ((this.mShowDividerVertical & 4) > 0) {
                int i7 = flexLine.f5857e;
                int i10 = this.mDividerVerticalWidth;
                flexLine.f5857e = i7 + i10;
                flexLine.f5858f += i10;
                return;
            }
            return;
        }
        if ((this.mShowDividerHorizontal & 4) > 0) {
            int i11 = flexLine.f5857e;
            int i12 = this.mDividerHorizontalHeight;
            flexLine.f5857e = i11 + i12;
            flexLine.f5858f += i12;
        }
    }

    public void setAlignContent(int i7) {
        if (this.mAlignContent != i7) {
            this.mAlignContent = i7;
            requestLayout();
        }
    }

    public void setAlignItems(int i7) {
        if (this.mAlignItems != i7) {
            this.mAlignItems = i7;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.mDividerDrawableHorizontal) {
            return;
        }
        this.mDividerDrawableHorizontal = drawable;
        if (drawable != null) {
            this.mDividerHorizontalHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerHorizontalHeight = 0;
        }
        if (this.mDividerDrawableHorizontal == null && this.mDividerDrawableVertical == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.mDividerDrawableVertical) {
            return;
        }
        this.mDividerDrawableVertical = drawable;
        if (drawable != null) {
            this.mDividerVerticalWidth = drawable.getIntrinsicWidth();
        } else {
            this.mDividerVerticalWidth = 0;
        }
        if (this.mDividerDrawableHorizontal == null && this.mDividerDrawableVertical == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setFlexDirection(int i7) {
        if (this.mFlexDirection != i7) {
            this.mFlexDirection = i7;
            requestLayout();
        }
    }

    @Override // ne.a
    public void setFlexLines(List<FlexLine> list) {
        this.mFlexLines = list;
    }

    public void setFlexWrap(int i7) {
        if (this.mFlexWrap != i7) {
            this.mFlexWrap = i7;
            requestLayout();
        }
    }

    public void setJustifyContent(int i7) {
        if (this.mJustifyContent != i7) {
            this.mJustifyContent = i7;
            requestLayout();
        }
    }

    public void setMaxLine(int i7) {
        if (this.mMaxLine != i7) {
            this.mMaxLine = i7;
            requestLayout();
        }
    }

    public void setShowDivider(int i7) {
        setShowDividerVertical(i7);
        setShowDividerHorizontal(i7);
    }

    public void setShowDividerHorizontal(int i7) {
        if (i7 != this.mShowDividerHorizontal) {
            this.mShowDividerHorizontal = i7;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i7) {
        if (i7 != this.mShowDividerVertical) {
            this.mShowDividerVertical = i7;
            requestLayout();
        }
    }

    @Override // ne.a
    public void updateViewCache(int i7, View view) {
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.f5876d = 1;
        layoutParams.f5877e = 0.0f;
        layoutParams.f5878i = 1.0f;
        layoutParams.f5879v = -1;
        layoutParams.f5880w = -1.0f;
        layoutParams.f5881x = -1;
        layoutParams.f5882y = -1;
        layoutParams.E = 16777215;
        layoutParams.F = 16777215;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f16587b);
        layoutParams.f5876d = typedArrayObtainStyledAttributes.getInt(8, 1);
        layoutParams.f5877e = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
        layoutParams.f5878i = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        layoutParams.f5879v = typedArrayObtainStyledAttributes.getInt(0, -1);
        layoutParams.f5880w = typedArrayObtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
        layoutParams.f5881x = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        layoutParams.f5882y = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, -1);
        layoutParams.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 16777215);
        layoutParams.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 16777215);
        layoutParams.G = typedArrayObtainStyledAttributes.getBoolean(9, false);
        typedArrayObtainStyledAttributes.recycle();
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            LayoutParams layoutParams3 = new LayoutParams(layoutParams2);
            layoutParams3.f5876d = 1;
            layoutParams3.f5877e = 0.0f;
            layoutParams3.f5878i = 1.0f;
            layoutParams3.f5879v = -1;
            layoutParams3.f5880w = -1.0f;
            layoutParams3.f5881x = -1;
            layoutParams3.f5882y = -1;
            layoutParams3.E = 16777215;
            layoutParams3.F = 16777215;
            layoutParams3.f5876d = layoutParams2.f5876d;
            layoutParams3.f5877e = layoutParams2.f5877e;
            layoutParams3.f5878i = layoutParams2.f5878i;
            layoutParams3.f5879v = layoutParams2.f5879v;
            layoutParams3.f5880w = layoutParams2.f5880w;
            layoutParams3.f5881x = layoutParams2.f5881x;
            layoutParams3.f5882y = layoutParams2.f5882y;
            layoutParams3.E = layoutParams2.E;
            layoutParams3.F = layoutParams2.F;
            layoutParams3.G = layoutParams2.G;
            return layoutParams3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams4 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams4.f5876d = 1;
            layoutParams4.f5877e = 0.0f;
            layoutParams4.f5878i = 1.0f;
            layoutParams4.f5879v = -1;
            layoutParams4.f5880w = -1.0f;
            layoutParams4.f5881x = -1;
            layoutParams4.f5882y = -1;
            layoutParams4.E = 16777215;
            layoutParams4.F = 16777215;
            return layoutParams4;
        }
        LayoutParams layoutParams5 = new LayoutParams(layoutParams);
        layoutParams5.f5876d = 1;
        layoutParams5.f5877e = 0.0f;
        layoutParams5.f5878i = 1.0f;
        layoutParams5.f5879v = -1;
        layoutParams5.f5880w = -1.0f;
        layoutParams5.f5881x = -1;
        layoutParams5.f5882y = -1;
        layoutParams5.E = 16777215;
        layoutParams5.F = 16777215;
        return layoutParams5;
    }
}
