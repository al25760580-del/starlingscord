package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i1;
import androidx.recyclerview.widget.m0;
import androidx.recyclerview.widget.r0;
import androidx.recyclerview.widget.s0;
import java.util.ArrayList;
import java.util.List;
import ne.d;
import ne.e;
import ne.f;
import ne.g;

/* JADX INFO: loaded from: classes3.dex */
public class FlexboxLayoutManager extends RecyclerView.LayoutManager implements ne.a, i1 {
    public static final Rect V = new Rect();
    public RecyclerView.Recycler F;
    public RecyclerView.State G;
    public f H;
    public final d I;
    public OrientationHelper J;
    public OrientationHelper K;
    public g L;
    public int M;
    public int N;
    public int O;
    public int P;
    public final SparseArray Q;
    public final Context R;
    public View S;
    public int T;
    public final FlexboxHelper.FlexLinesResult U;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5884e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5885i;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5887w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5888x;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f5886v = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f5889y = new ArrayList();
    public final FlexboxHelper E = new FlexboxHelper(this);

    public FlexboxLayoutManager(Context context) {
        d dVar = new d(this);
        this.I = dVar;
        this.M = -1;
        this.N = Integer.MIN_VALUE;
        this.O = Integer.MIN_VALUE;
        this.P = Integer.MIN_VALUE;
        this.Q = new SparseArray();
        this.T = -1;
        this.U = new FlexboxHelper.FlexLinesResult();
        u(0);
        v(1);
        if (this.f5885i != 4) {
            removeAllViews();
            this.f5889y.clear();
            d.b(dVar);
            dVar.f16567d = 0;
            this.f5885i = 4;
            requestLayout();
        }
        this.R = context;
    }

    public static boolean b(int i7, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (i11 > 0 && i7 != i11) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i7;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i7;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        if (this.f5884e == 0) {
            return isMainAxisDirectionHorizontal();
        }
        if (!isMainAxisDirectionHorizontal()) {
            return true;
        }
        int width = getWidth();
        View view = this.S;
        return width > (view != null ? view.getWidth() : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        if (this.f5884e == 0) {
            return !isMainAxisDirectionHorizontal();
        }
        if (!isMainAxisDirectionHorizontal()) {
            int height = getHeight();
            View view = this.S;
            if (height <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollExtent(RecyclerView.State state) {
        return d(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollOffset(RecyclerView.State state) {
        return e(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollRange(RecyclerView.State state) {
        return f(state);
    }

    @Override // androidx.recyclerview.widget.i1
    public final PointF computeScrollVectorForPosition(int i7) {
        View childAt;
        if (getChildCount() == 0 || (childAt = getChildAt(0)) == null) {
            return null;
        }
        int i10 = i7 < getPosition(childAt) ? -1 : 1;
        return isMainAxisDirectionHorizontal() ? new PointF(0.0f, i10) : new PointF(i10, 0.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollExtent(RecyclerView.State state) {
        return d(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollOffset(RecyclerView.State state) {
        return e(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollRange(RecyclerView.State state) {
        return f(state);
    }

    public final int d(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iB = state.b();
        g();
        View viewI = i(iB);
        View viewK = k(iB);
        if (state.b() == 0 || viewI == null || viewK == null) {
            return 0;
        }
        return Math.min(this.J.l(), this.J.b(viewK) - this.J.e(viewI));
    }

    public final int e(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iB = state.b();
        View viewI = i(iB);
        View viewK = k(iB);
        if (state.b() == 0 || viewI == null || viewK == null) {
            return 0;
        }
        int position = getPosition(viewI);
        int position2 = getPosition(viewK);
        int iAbs = Math.abs(this.J.b(viewK) - this.J.e(viewI));
        int[] iArr = this.E.f5871c;
        int i7 = iArr[position];
        if (i7 == 0 || i7 == -1) {
            return 0;
        }
        return Math.round((i7 * (iAbs / ((iArr[position2] - i7) + 1))) + (this.J.k() - this.J.e(viewI)));
    }

    public final int f(RecyclerView.State state) {
        if (getChildCount() != 0) {
            int iB = state.b();
            View viewI = i(iB);
            View viewK = k(iB);
            if (state.b() != 0 && viewI != null && viewK != null) {
                View viewM = m(0, getChildCount());
                int position = viewM == null ? -1 : getPosition(viewM);
                View viewM2 = m(getChildCount() - 1, -1);
                return (int) ((Math.abs(this.J.b(viewK) - this.J.e(viewI)) / (((viewM2 != null ? getPosition(viewM2) : -1) - position) + 1)) * state.b());
            }
        }
        return 0;
    }

    public final void g() {
        if (this.J != null) {
            return;
        }
        if (isMainAxisDirectionHorizontal()) {
            if (this.f5884e == 0) {
                this.J = new r0(this);
                this.K = new s0(this);
                return;
            } else {
                this.J = new s0(this);
                this.K = new r0(this);
                return;
            }
        }
        if (this.f5884e == 0) {
            this.J = new s0(this);
            this.K = new r0(this);
        } else {
            this.J = new r0(this);
            this.K = new s0(this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new e(-2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        e eVar = new e(context, attributeSet);
        eVar.f16572w = 0.0f;
        eVar.f16573x = 1.0f;
        eVar.f16574y = -1;
        eVar.E = -1.0f;
        eVar.H = 16777215;
        eVar.I = 16777215;
        return eVar;
    }

    @Override // ne.a
    public final int getAlignContent() {
        return 5;
    }

    @Override // ne.a
    public final int getAlignItems() {
        return this.f5885i;
    }

    @Override // ne.a
    public final int getChildHeightMeasureSpec(int i7, int i10, int i11) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), i10, i11, canScrollVertically());
    }

    @Override // ne.a
    public final int getChildWidthMeasureSpec(int i7, int i10, int i11) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), i10, i11, canScrollHorizontally());
    }

    @Override // ne.a
    public final int getDecorationLengthCrossAxis(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (isMainAxisDirectionHorizontal()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return rightDecorationWidth + leftDecorationWidth;
    }

    @Override // ne.a
    public final int getDecorationLengthMainAxis(View view, int i7, int i10) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (isMainAxisDirectionHorizontal()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return bottomDecorationHeight + topDecorationHeight;
    }

    @Override // ne.a
    public final int getFlexDirection() {
        return this.f5883d;
    }

    @Override // ne.a
    public final View getFlexItemAt(int i7) {
        View view = (View) this.Q.get(i7);
        return view != null ? view : this.F.e(i7);
    }

    @Override // ne.a
    public final int getFlexItemCount() {
        return this.G.b();
    }

    @Override // ne.a
    public final List getFlexLinesInternal() {
        return this.f5889y;
    }

    @Override // ne.a
    public final int getFlexWrap() {
        return this.f5884e;
    }

    @Override // ne.a
    public final int getLargestMainSize() {
        if (this.f5889y.size() == 0) {
            return 0;
        }
        int size = this.f5889y.size();
        int iMax = Integer.MIN_VALUE;
        for (int i7 = 0; i7 < size; i7++) {
            iMax = Math.max(iMax, ((FlexLine) this.f5889y.get(i7)).f5857e);
        }
        return iMax;
    }

    @Override // ne.a
    public final int getMaxLine() {
        return this.f5886v;
    }

    @Override // ne.a
    public final View getReorderedFlexItemAt(int i7) {
        return getFlexItemAt(i7);
    }

    @Override // ne.a
    public final int getSumOfCrossSize() {
        int size = this.f5889y.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i7 += ((FlexLine) this.f5889y.get(i10)).f5859g;
        }
        return i7;
    }

    public final int h(RecyclerView.Recycler recycler, RecyclerView.State state, f fVar) {
        int i7;
        boolean z5;
        int i10;
        int i11;
        boolean z6;
        Rect rect;
        int i12;
        int i13;
        int i14;
        float topDecorationHeight;
        Rect rect2;
        int i15 = fVar.f16580f;
        if (i15 != Integer.MIN_VALUE) {
            int i16 = fVar.f16575a;
            if (i16 < 0) {
                fVar.f16580f = i15 + i16;
            }
            s(recycler, fVar);
        }
        int i17 = fVar.f16575a;
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int i18 = i17;
        int i19 = 0;
        while (true) {
            if (i18 <= 0 && !this.H.f16576b) {
                break;
            }
            List list = this.f5889y;
            int i20 = fVar.f16578d;
            if (i20 < 0 || i20 >= state.b() || (i7 = fVar.f16577c) < 0 || i7 >= list.size()) {
                break;
            }
            FlexLine flexLine = (FlexLine) this.f5889y.get(fVar.f16577c);
            fVar.f16578d = flexLine.f5865o;
            boolean zIsMainAxisDirectionHorizontal2 = isMainAxisDirectionHorizontal();
            d dVar = this.I;
            Rect rect3 = V;
            FlexboxHelper flexboxHelper = this.E;
            if (zIsMainAxisDirectionHorizontal2) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int width = getWidth();
                int i21 = fVar.f16579e;
                if (fVar.f16582h == -1) {
                    i21 -= flexLine.f5859g;
                }
                int i22 = fVar.f16578d;
                float f2 = dVar.f16567d;
                float f7 = paddingLeft - f2;
                float leftDecorationWidth = (width - paddingRight) - f2;
                float fMax = Math.max(0.0f, 0.0f);
                int i23 = flexLine.f5860h;
                int i24 = i21;
                int i25 = i22;
                int i26 = 0;
                while (i25 < i22 + i23) {
                    int i27 = i22;
                    View flexItemAt = getFlexItemAt(i25);
                    if (flexItemAt == null) {
                        i26 = i26;
                        i23 = i23;
                        i25 = i25;
                        rect2 = rect3;
                    } else {
                        if (fVar.f16582h == 1) {
                            calculateItemDecorationsForChild(flexItemAt, rect3);
                            addView(flexItemAt);
                        } else {
                            calculateItemDecorationsForChild(flexItemAt, rect3);
                            addView(flexItemAt, i26);
                            i26++;
                        }
                        long j = flexboxHelper.f5872d[i25];
                        int i28 = (int) j;
                        int i29 = (int) (j >> 32);
                        e eVar = (e) flexItemAt.getLayoutParams();
                        if (w(flexItemAt, i28, i29, eVar)) {
                            flexItemAt.measure(i28, i29);
                        }
                        float leftDecorationWidth2 = f7 + getLeftDecorationWidth(flexItemAt) + ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                        float rightDecorationWidth = leftDecorationWidth - (getRightDecorationWidth(flexItemAt) + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                        int topDecorationHeight2 = getTopDecorationHeight(flexItemAt) + i24;
                        if (this.f5887w) {
                            rect2 = rect3;
                            this.E.o(flexItemAt, flexLine, Math.round(rightDecorationWidth) - flexItemAt.getMeasuredWidth(), topDecorationHeight2, Math.round(rightDecorationWidth), flexItemAt.getMeasuredHeight() + topDecorationHeight2);
                        } else {
                            rect2 = rect3;
                            this.E.o(flexItemAt, flexLine, Math.round(leftDecorationWidth2), topDecorationHeight2, flexItemAt.getMeasuredWidth() + Math.round(leftDecorationWidth2), flexItemAt.getMeasuredHeight() + topDecorationHeight2);
                        }
                        float rightDecorationWidth2 = getRightDecorationWidth(flexItemAt) + flexItemAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).rightMargin + fMax + leftDecorationWidth2;
                        leftDecorationWidth = rightDecorationWidth - ((getLeftDecorationWidth(flexItemAt) + (flexItemAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin)) + fMax);
                        f7 = rightDecorationWidth2;
                    }
                    i25++;
                    i22 = i27;
                    flexboxHelper = flexboxHelper;
                    zIsMainAxisDirectionHorizontal = zIsMainAxisDirectionHorizontal;
                    i26 = i26;
                    i23 = i23;
                    rect3 = rect2;
                }
                z5 = zIsMainAxisDirectionHorizontal;
                fVar.f16577c += this.H.f16582h;
                i11 = flexLine.f5859g;
            } else {
                z5 = zIsMainAxisDirectionHorizontal;
                Rect rect4 = rect3;
                boolean z7 = true;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i30 = fVar.f16579e;
                if (fVar.f16582h == -1) {
                    int i31 = flexLine.f5859g;
                    i10 = i30 + i31;
                    i30 -= i31;
                } else {
                    i10 = i30;
                }
                int i32 = fVar.f16578d;
                float f10 = height - paddingBottom;
                float f11 = dVar.f16567d;
                float f12 = paddingTop - f11;
                float f13 = f10 - f11;
                float fMax2 = Math.max(0.0f, 0.0f);
                int i33 = flexLine.f5860h;
                int i34 = i32;
                int i35 = 0;
                while (i34 < i32 + i33) {
                    int i36 = i32;
                    View flexItemAt2 = getFlexItemAt(i34);
                    if (flexItemAt2 == null) {
                        i12 = i33;
                        i13 = i36;
                        topDecorationHeight = f13;
                        z6 = z7;
                        rect = rect4;
                        i14 = i34;
                    } else {
                        float f14 = f12;
                        long j5 = flexboxHelper.f5872d[i34];
                        float f15 = f13;
                        int i37 = (int) j5;
                        int i38 = (int) (j5 >> 32);
                        e eVar2 = (e) flexItemAt2.getLayoutParams();
                        if (w(flexItemAt2, i37, i38, eVar2)) {
                            flexItemAt2.measure(i37, i38);
                        }
                        float topDecorationHeight3 = f14 + getTopDecorationHeight(flexItemAt2) + ((ViewGroup.MarginLayoutParams) eVar2).topMargin;
                        float bottomDecorationHeight = f15 - (getBottomDecorationHeight(flexItemAt2) + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
                        z6 = true;
                        if (fVar.f16582h == 1) {
                            rect = rect4;
                            calculateItemDecorationsForChild(flexItemAt2, rect);
                            addView(flexItemAt2);
                        } else {
                            rect = rect4;
                            calculateItemDecorationsForChild(flexItemAt2, rect);
                            addView(flexItemAt2, i35);
                            i35++;
                        }
                        int i39 = i35;
                        int leftDecorationWidth3 = getLeftDecorationWidth(flexItemAt2) + i30;
                        int rightDecorationWidth3 = i10 - getRightDecorationWidth(flexItemAt2);
                        int i40 = i34;
                        boolean z10 = this.f5887w;
                        if (!z10) {
                            i12 = i33;
                            i13 = i36;
                            i14 = i40;
                            if (this.f5888x) {
                                this.E.p(flexItemAt2, flexLine, z10, leftDecorationWidth3, Math.round(bottomDecorationHeight) - flexItemAt2.getMeasuredHeight(), flexItemAt2.getMeasuredWidth() + leftDecorationWidth3, Math.round(bottomDecorationHeight));
                            } else {
                                this.E.p(flexItemAt2, flexLine, z10, leftDecorationWidth3, Math.round(topDecorationHeight3), flexItemAt2.getMeasuredWidth() + leftDecorationWidth3, flexItemAt2.getMeasuredHeight() + Math.round(topDecorationHeight3));
                            }
                        } else if (this.f5888x) {
                            i14 = i40;
                            i12 = i33;
                            i13 = i36;
                            this.E.p(flexItemAt2, flexLine, z10, rightDecorationWidth3 - flexItemAt2.getMeasuredWidth(), Math.round(bottomDecorationHeight) - flexItemAt2.getMeasuredHeight(), rightDecorationWidth3, Math.round(bottomDecorationHeight));
                        } else {
                            i12 = i33;
                            i13 = i36;
                            i14 = i40;
                            this.E.p(flexItemAt2, flexLine, z10, rightDecorationWidth3 - flexItemAt2.getMeasuredWidth(), Math.round(topDecorationHeight3), rightDecorationWidth3, flexItemAt2.getMeasuredHeight() + Math.round(topDecorationHeight3));
                        }
                        float bottomDecorationHeight2 = getBottomDecorationHeight(flexItemAt2) + flexItemAt2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + fMax2 + topDecorationHeight3;
                        topDecorationHeight = bottomDecorationHeight - ((getTopDecorationHeight(flexItemAt2) + (flexItemAt2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin)) + fMax2);
                        f12 = bottomDecorationHeight2;
                        i35 = i39;
                    }
                    i34 = i14 + 1;
                    rect4 = rect;
                    z7 = z6;
                    f13 = topDecorationHeight;
                    i32 = i13;
                    i33 = i12;
                }
                fVar.f16577c += this.H.f16582h;
                i11 = flexLine.f5859g;
            }
            i19 += i11;
            if (z5 || !this.f5887w) {
                fVar.f16579e += flexLine.f5859g * fVar.f16582h;
            } else {
                fVar.f16579e -= flexLine.f5859g * fVar.f16582h;
            }
            i18 -= flexLine.f5859g;
            i17 = i17;
            zIsMainAxisDirectionHorizontal = z5;
        }
        int i41 = i17;
        int i42 = fVar.f16575a - i19;
        fVar.f16575a = i42;
        int i43 = fVar.f16580f;
        if (i43 != Integer.MIN_VALUE) {
            int i44 = i43 + i19;
            fVar.f16580f = i44;
            if (i42 < 0) {
                fVar.f16580f = i44 + i42;
            }
            s(recycler, fVar);
        }
        return i41 - fVar.f16575a;
    }

    public final View i(int i7) {
        View viewN = n(0, getChildCount(), i7);
        if (viewN == null) {
            return null;
        }
        int i10 = this.E.f5871c[getPosition(viewN)];
        if (i10 == -1) {
            return null;
        }
        return j(viewN, (FlexLine) this.f5889y.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // ne.a
    public final boolean isMainAxisDirectionHorizontal() {
        int i7 = this.f5883d;
        return i7 == 0 || i7 == 1;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    public final View j(View view, FlexLine flexLine) {
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int i7 = flexLine.f5860h;
        for (int i10 = 1; i10 < i7; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.f5887w || zIsMainAxisDirectionHorizontal) {
                    if (this.J.e(view) > this.J.e(childAt)) {
                        view = childAt;
                    }
                } else if (this.J.b(view) < this.J.b(childAt)) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final View k(int i7) {
        View viewN = n(getChildCount() - 1, -1, i7);
        if (viewN == null) {
            return null;
        }
        return l(viewN, (FlexLine) this.f5889y.get(this.E.f5871c[getPosition(viewN)]));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    public final View l(View view, FlexLine flexLine) {
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int childCount = (getChildCount() - flexLine.f5860h) - 1;
        for (int childCount2 = getChildCount() - 2; childCount2 > childCount; childCount2--) {
            View childAt = getChildAt(childCount2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.f5887w || zIsMainAxisDirectionHorizontal) {
                    if (this.J.b(view) < this.J.b(childAt)) {
                        view = childAt;
                    }
                } else if (this.J.e(view) > this.J.e(childAt)) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final View m(int i7, int i10) {
        int i11 = i10 > i7 ? 1 : -1;
        while (i7 != i10) {
            View childAt = getChildAt(i7);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int decoratedLeft = getDecoratedLeft(childAt) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).leftMargin;
            int decoratedTop = getDecoratedTop(childAt) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).topMargin;
            int decoratedRight = getDecoratedRight(childAt) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).rightMargin;
            int decoratedBottom = getDecoratedBottom(childAt) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
            boolean z5 = decoratedLeft >= width || decoratedRight >= paddingLeft;
            boolean z6 = decoratedTop >= height || decoratedBottom >= paddingTop;
            if (z5 && z6) {
                return childAt;
            }
            i7 += i11;
        }
        return null;
    }

    public final View n(int i7, int i10, int i11) {
        int position;
        g();
        if (this.H == null) {
            f fVar = new f();
            fVar.f16582h = 1;
            this.H = fVar;
        }
        int iK = this.J.k();
        int iG = this.J.g();
        int i12 = i10 <= i7 ? -1 : 1;
        View view = null;
        View view2 = null;
        while (i7 != i10) {
            View childAt = getChildAt(i7);
            if (childAt != null && (position = getPosition(childAt)) >= 0 && position < i11) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).f2499d.isRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.J.e(childAt) >= iK && this.J.b(childAt) <= iG) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i7 += i12;
        }
        return view != null ? view : view2;
    }

    public final int o(int i7, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z5) {
        int iQ;
        int iG;
        if (isMainAxisDirectionHorizontal() || !this.f5887w) {
            int iG2 = this.J.g() - i7;
            if (iG2 <= 0) {
                return 0;
            }
            iQ = -q(-iG2, recycler, state);
        } else {
            int iK = i7 - this.J.k();
            if (iK <= 0) {
                return 0;
            }
            iQ = q(iK, recycler, state);
        }
        int i10 = i7 + iQ;
        if (!z5 || (iG = this.J.g() - i10) <= 0) {
            return iQ;
        }
        this.J.p(iG);
        return iG + iQ;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.S = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsAdded(RecyclerView recyclerView, int i7, int i10) {
        super.onItemsAdded(recyclerView, i7, i10);
        x(i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsMoved(RecyclerView recyclerView, int i7, int i10, int i11) {
        super.onItemsMoved(recyclerView, i7, i10, i11);
        x(Math.min(i7, i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsRemoved(RecyclerView recyclerView, int i7, int i10) {
        super.onItemsRemoved(recyclerView, i7, i10);
        x(i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsUpdated(RecyclerView recyclerView, int i7, int i10, Object obj) {
        super.onItemsUpdated(recyclerView, i7, i10, obj);
        x(i7);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0192  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:113:0x01af  */
    /* JADX WARN: Code duplicated, block: B:114:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:119:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:130:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:131:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:135:0x0213  */
    /* JADX WARN: Code duplicated, block: B:139:0x0219  */
    /* JADX WARN: Code duplicated, block: B:142:0x0226  */
    /* JADX WARN: Code duplicated, block: B:153:0x025c  */
    /* JADX WARN: Code duplicated, block: B:154:0x0263  */
    /* JADX WARN: Code duplicated, block: B:156:0x026c  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:79:0x0106  */
    /* JADX WARN: Code duplicated, block: B:80:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x011a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0126  */
    /* JADX WARN: Code duplicated, block: B:85:0x0135  */
    /* JADX WARN: Code duplicated, block: B:86:0x0141  */
    /* JADX WARN: Code duplicated, block: B:88:0x0145  */
    /* JADX WARN: Code duplicated, block: B:89:0x0153  */
    /* JADX WARN: Code duplicated, block: B:91:0x015d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0171  */
    /* JADX WARN: Code duplicated, block: B:98:0x0173  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        View viewI;
        FlexboxLayoutManager flexboxLayoutManager;
        OrientationHelper orientationHelper;
        int position;
        int i7;
        int size;
        int i10;
        int iK;
        int i11;
        View viewFindViewByPosition;
        View childAt;
        boolean z5;
        int iE;
        boolean z6;
        int i12;
        boolean z7;
        int i13;
        int i14;
        int i15;
        this.F = recycler;
        this.G = state;
        int iB = state.b();
        if (iB == 0 && state.f2527g) {
            return;
        }
        int layoutDirection = getLayoutDirection();
        int i16 = this.f5883d;
        if (i16 == 0) {
            this.f5887w = layoutDirection == 1;
            this.f5888x = this.f5884e == 2;
        } else if (i16 == 1) {
            this.f5887w = layoutDirection != 1;
            this.f5888x = this.f5884e == 2;
        } else if (i16 == 2) {
            boolean z10 = layoutDirection == 1;
            this.f5887w = z10;
            if (this.f5884e == 2) {
                this.f5887w = !z10;
            }
            this.f5888x = false;
        } else if (i16 != 3) {
            this.f5887w = false;
            this.f5888x = false;
        } else {
            boolean z11 = layoutDirection == 1;
            this.f5887w = z11;
            if (this.f5884e == 2) {
                this.f5887w = !z11;
            }
            this.f5888x = true;
        }
        g();
        if (this.H == null) {
            f fVar = new f();
            fVar.f16582h = 1;
            this.H = fVar;
        }
        FlexboxHelper flexboxHelper = this.E;
        flexboxHelper.j(iB);
        flexboxHelper.k(iB);
        flexboxHelper.i(iB);
        this.H.f16583i = false;
        g gVar = this.L;
        if (gVar != null && (i15 = gVar.f16584d) >= 0 && i15 < iB) {
            this.M = i15;
        }
        d dVar = this.I;
        if (!dVar.f16569f || this.M != -1 || gVar != null) {
            d.b(dVar);
            g gVar2 = this.L;
            if (state.f2527g || (i11 = this.M) == -1) {
                if (getChildCount() != 0) {
                    if (dVar.f16568e) {
                        viewI = k(state.b());
                    } else {
                        viewI = i(state.b());
                    }
                    if (viewI != null) {
                        flexboxLayoutManager = dVar.f16571h;
                        if (flexboxLayoutManager.f5884e == 0) {
                            orientationHelper = flexboxLayoutManager.K;
                        } else {
                            orientationHelper = flexboxLayoutManager.J;
                        }
                        if (flexboxLayoutManager.isMainAxisDirectionHorizontal() && flexboxLayoutManager.f5887w) {
                            if (dVar.f16568e) {
                                dVar.f16566c = orientationHelper.m() + orientationHelper.e(viewI);
                            } else {
                                dVar.f16566c = orientationHelper.b(viewI);
                            }
                        } else if (dVar.f16568e) {
                            dVar.f16566c = orientationHelper.m() + orientationHelper.b(viewI);
                        } else {
                            dVar.f16566c = orientationHelper.e(viewI);
                        }
                        position = flexboxLayoutManager.getPosition(viewI);
                        dVar.f16564a = position;
                        dVar.f16570g = false;
                        int[] iArr = flexboxLayoutManager.E.f5871c;
                        if (position == -1) {
                            position = 0;
                        }
                        i7 = iArr[position];
                        if (i7 == -1) {
                            i7 = 0;
                        }
                        dVar.f16565b = i7;
                        size = flexboxLayoutManager.f5889y.size();
                        i10 = dVar.f16565b;
                        if (size > i10) {
                            dVar.f16564a = ((FlexLine) flexboxLayoutManager.f5889y.get(i10)).f5865o;
                        }
                        if (!state.f2527g && supportsPredictiveItemAnimations() && (this.J.e(viewI) >= this.J.g() || this.J.b(viewI) < this.J.k())) {
                            if (dVar.f16568e) {
                                iK = this.J.g();
                            } else {
                                iK = this.J.k();
                            }
                            dVar.f16566c = iK;
                        }
                    } else {
                        d.a(dVar);
                        dVar.f16564a = 0;
                        dVar.f16565b = 0;
                    }
                } else {
                    d.a(dVar);
                    dVar.f16564a = 0;
                    dVar.f16565b = 0;
                }
            } else if (i11 < 0 || i11 >= state.b()) {
                this.M = -1;
                this.N = Integer.MIN_VALUE;
                if (getChildCount() != 0) {
                    if (dVar.f16568e) {
                        viewI = k(state.b());
                    } else {
                        viewI = i(state.b());
                    }
                    if (viewI != null) {
                        flexboxLayoutManager = dVar.f16571h;
                        if (flexboxLayoutManager.f5884e == 0) {
                            orientationHelper = flexboxLayoutManager.K;
                        } else {
                            orientationHelper = flexboxLayoutManager.J;
                        }
                        if (flexboxLayoutManager.isMainAxisDirectionHorizontal()) {
                            if (dVar.f16568e) {
                                dVar.f16566c = orientationHelper.m() + orientationHelper.b(viewI);
                            } else {
                                dVar.f16566c = orientationHelper.e(viewI);
                            }
                        } else if (dVar.f16568e) {
                            dVar.f16566c = orientationHelper.m() + orientationHelper.b(viewI);
                        } else {
                            dVar.f16566c = orientationHelper.e(viewI);
                        }
                        position = flexboxLayoutManager.getPosition(viewI);
                        dVar.f16564a = position;
                        dVar.f16570g = false;
                        int[] iArr2 = flexboxLayoutManager.E.f5871c;
                        if (position == -1) {
                            position = 0;
                        }
                        i7 = iArr2[position];
                        if (i7 == -1) {
                            i7 = 0;
                        }
                        dVar.f16565b = i7;
                        size = flexboxLayoutManager.f5889y.size();
                        i10 = dVar.f16565b;
                        if (size > i10) {
                            dVar.f16564a = ((FlexLine) flexboxLayoutManager.f5889y.get(i10)).f5865o;
                        }
                        if (!state.f2527g) {
                            if (dVar.f16568e) {
                                iK = this.J.g();
                            } else {
                                iK = this.J.k();
                            }
                            dVar.f16566c = iK;
                        }
                    } else {
                        d.a(dVar);
                        dVar.f16564a = 0;
                        dVar.f16565b = 0;
                    }
                } else {
                    d.a(dVar);
                    dVar.f16564a = 0;
                    dVar.f16565b = 0;
                }
            } else {
                int i17 = this.M;
                dVar.f16564a = i17;
                dVar.f16565b = flexboxHelper.f5871c[i17];
                g gVar3 = this.L;
                if (gVar3 != null) {
                    int iB2 = state.b();
                    int i18 = gVar3.f16584d;
                    if (i18 >= 0 && i18 < iB2) {
                        dVar.f16566c = this.J.k() + gVar2.f16585e;
                        dVar.f16570g = true;
                        dVar.f16565b = -1;
                    } else if (this.N == Integer.MIN_VALUE) {
                        viewFindViewByPosition = findViewByPosition(this.M);
                        if (viewFindViewByPosition != null) {
                            if (getChildCount() > 0 && (childAt = getChildAt(0)) != null) {
                                if (this.M < getPosition(childAt)) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                dVar.f16568e = z5;
                            }
                            d.a(dVar);
                        } else if (this.J.c(viewFindViewByPosition) > this.J.l()) {
                            d.a(dVar);
                        } else if (this.J.e(viewFindViewByPosition) - this.J.k() < 0) {
                            dVar.f16566c = this.J.k();
                            dVar.f16568e = false;
                        } else if (this.J.g() - this.J.b(viewFindViewByPosition) < 0) {
                            dVar.f16566c = this.J.g();
                            dVar.f16568e = true;
                        } else {
                            if (dVar.f16568e) {
                                iE = this.J.m() + this.J.b(viewFindViewByPosition);
                            } else {
                                iE = this.J.e(viewFindViewByPosition);
                            }
                            dVar.f16566c = iE;
                        }
                    } else if (isMainAxisDirectionHorizontal() && this.f5887w) {
                        dVar.f16566c = this.N - this.J.h();
                    } else {
                        dVar.f16566c = this.J.k() + this.N;
                    }
                } else if (this.N == Integer.MIN_VALUE) {
                    viewFindViewByPosition = findViewByPosition(this.M);
                    if (viewFindViewByPosition != null) {
                        if (getChildCount() > 0) {
                            if (this.M < getPosition(childAt)) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            dVar.f16568e = z5;
                        }
                        d.a(dVar);
                    } else if (this.J.c(viewFindViewByPosition) > this.J.l()) {
                        d.a(dVar);
                    } else if (this.J.e(viewFindViewByPosition) - this.J.k() < 0) {
                        dVar.f16566c = this.J.k();
                        dVar.f16568e = false;
                    } else if (this.J.g() - this.J.b(viewFindViewByPosition) < 0) {
                        dVar.f16566c = this.J.g();
                        dVar.f16568e = true;
                    } else {
                        if (dVar.f16568e) {
                            iE = this.J.m() + this.J.b(viewFindViewByPosition);
                        } else {
                            iE = this.J.e(viewFindViewByPosition);
                        }
                        dVar.f16566c = iE;
                    }
                } else if (isMainAxisDirectionHorizontal()) {
                    dVar.f16566c = this.J.k() + this.N;
                } else {
                    dVar.f16566c = this.J.k() + this.N;
                }
            }
            dVar.f16569f = true;
        }
        detachAndScrapAttachedViews(recycler);
        if (dVar.f16568e) {
            z(dVar, false, true);
        } else {
            y(dVar, false, true);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        int width = getWidth();
        int height = getHeight();
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        Context context = this.R;
        if (zIsMainAxisDirectionHorizontal) {
            int i19 = this.O;
            z6 = (i19 == Integer.MIN_VALUE || i19 == width) ? false : true;
            f fVar2 = this.H;
            i12 = fVar2.f16576b ? context.getResources().getDisplayMetrics().heightPixels : fVar2.f16575a;
        } else {
            int i20 = this.P;
            z6 = (i20 == Integer.MIN_VALUE || i20 == height) ? false : true;
            f fVar3 = this.H;
            i12 = fVar3.f16576b ? context.getResources().getDisplayMetrics().widthPixels : fVar3.f16575a;
        }
        int i21 = i12;
        this.O = width;
        this.P = height;
        int i22 = this.T;
        FlexboxHelper.FlexLinesResult flexLinesResult = this.U;
        if (i22 != -1 || (this.M == -1 && !z6)) {
            int iMin = i22 != -1 ? Math.min(i22, dVar.f16564a) : dVar.f16564a;
            flexLinesResult.f5874a = null;
            flexLinesResult.f5875b = 0;
            if (isMainAxisDirectionHorizontal()) {
                if (this.f5889y.size() > 0) {
                    flexboxHelper.d(iMin, this.f5889y);
                    this.E.b(this.U, iMakeMeasureSpec, iMakeMeasureSpec2, i21, iMin, dVar.f16564a, this.f5889y);
                } else {
                    flexboxHelper.i(iB);
                    this.E.b(this.U, iMakeMeasureSpec, iMakeMeasureSpec2, i21, 0, -1, this.f5889y);
                }
            } else if (this.f5889y.size() > 0) {
                flexboxHelper.d(iMin, this.f5889y);
                int i23 = iMin;
                this.E.b(this.U, iMakeMeasureSpec2, iMakeMeasureSpec, i21, i23, dVar.f16564a, this.f5889y);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
                iMin = i23;
            } else {
                flexboxHelper.i(iB);
                this.E.b(this.U, iMakeMeasureSpec2, iMakeMeasureSpec, i21, 0, -1, this.f5889y);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
            }
            this.f5889y = flexLinesResult.f5874a;
            flexboxHelper.h(iMakeMeasureSpec, iMakeMeasureSpec2, iMin);
            flexboxHelper.u(iMin);
        } else if (!dVar.f16568e) {
            this.f5889y.clear();
            flexLinesResult.f5874a = null;
            flexLinesResult.f5875b = 0;
            if (isMainAxisDirectionHorizontal()) {
                this.E.b(this.U, iMakeMeasureSpec, iMakeMeasureSpec2, i21, 0, dVar.f16564a, this.f5889y);
            } else {
                this.E.b(this.U, iMakeMeasureSpec2, iMakeMeasureSpec, i21, 0, dVar.f16564a, this.f5889y);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
            }
            this.f5889y = flexLinesResult.f5874a;
            flexboxHelper.h(iMakeMeasureSpec, iMakeMeasureSpec2, 0);
            flexboxHelper.u(0);
            int i24 = flexboxHelper.f5871c[dVar.f16564a];
            dVar.f16565b = i24;
            this.H.f16577c = i24;
        }
        h(recycler, state, this.H);
        if (dVar.f16568e) {
            i14 = this.H.f16579e;
            z7 = true;
            y(dVar, true, false);
            h(recycler, state, this.H);
            i13 = this.H.f16579e;
        } else {
            z7 = true;
            i13 = this.H.f16579e;
            z(dVar, true, false);
            h(recycler, state, this.H);
            i14 = this.H.f16579e;
        }
        if (getChildCount() > 0) {
            if (dVar.f16568e) {
                p(o(i13, recycler, state, z7) + i14, recycler, state, false);
            } else {
                o(p(i14, recycler, state, z7) + i13, recycler, state, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.L = null;
        this.M = -1;
        this.N = Integer.MIN_VALUE;
        this.T = -1;
        d.b(this.I);
        this.Q.clear();
    }

    @Override // ne.a
    public final void onNewFlexItemAdded(View view, int i7, int i10, FlexLine flexLine) {
        calculateItemDecorationsForChild(view, V);
        if (isMainAxisDirectionHorizontal()) {
            int rightDecorationWidth = getRightDecorationWidth(view) + getLeftDecorationWidth(view);
            flexLine.f5857e += rightDecorationWidth;
            flexLine.f5858f += rightDecorationWidth;
            return;
        }
        int bottomDecorationHeight = getBottomDecorationHeight(view) + getTopDecorationHeight(view);
        flexLine.f5857e += bottomDecorationHeight;
        flexLine.f5858f += bottomDecorationHeight;
    }

    @Override // ne.a
    public final void onNewFlexLineAdded(FlexLine flexLine) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof g) {
            this.L = (g) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final Parcelable onSaveInstanceState() {
        g gVar = this.L;
        if (gVar != null) {
            g gVar2 = new g();
            gVar2.f16584d = gVar.f16584d;
            gVar2.f16585e = gVar.f16585e;
            return gVar2;
        }
        g gVar3 = new g();
        if (getChildCount() <= 0) {
            gVar3.f16584d = -1;
            return gVar3;
        }
        View childAt = getChildAt(0);
        gVar3.f16584d = getPosition(childAt);
        gVar3.f16585e = this.J.e(childAt) - this.J.k();
        return gVar3;
    }

    public final int p(int i7, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z5) {
        int iQ;
        int iK;
        if (isMainAxisDirectionHorizontal() || !this.f5887w) {
            int iK2 = i7 - this.J.k();
            if (iK2 <= 0) {
                return 0;
            }
            iQ = -q(iK2, recycler, state);
        } else {
            int iG = this.J.g() - i7;
            if (iG <= 0) {
                return 0;
            }
            iQ = q(-iG, recycler, state);
        }
        int i10 = i7 + iQ;
        if (!z5 || (iK = i10 - this.J.k()) <= 0) {
            return iQ;
        }
        this.J.p(-iK);
        return iQ - iK;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01f5  */
    public final int q(int i7, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i10;
        if (getChildCount() != 0 && i7 != 0) {
            g();
            this.H.f16583i = true;
            boolean z5 = !isMainAxisDirectionHorizontal() && this.f5887w;
            int i11 = (!z5 ? i7 > 0 : i7 < 0) ? -1 : 1;
            int iAbs = Math.abs(i7);
            this.H.f16582h = i11;
            boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
            boolean z6 = !zIsMainAxisDirectionHorizontal && this.f5887w;
            FlexboxHelper flexboxHelper = this.E;
            if (i11 == 1) {
                View childAt = getChildAt(getChildCount() - 1);
                if (childAt != null) {
                    this.H.f16579e = this.J.b(childAt);
                    int position = getPosition(childAt);
                    View viewL = l(childAt, (FlexLine) this.f5889y.get(flexboxHelper.f5871c[position]));
                    f fVar = this.H;
                    fVar.getClass();
                    int i12 = position + 1;
                    fVar.f16578d = i12;
                    int[] iArr = flexboxHelper.f5871c;
                    if (iArr.length <= i12) {
                        fVar.f16577c = -1;
                    } else {
                        fVar.f16577c = iArr[i12];
                    }
                    if (z6) {
                        fVar.f16579e = this.J.e(viewL);
                        this.H.f16580f = this.J.k() + (-this.J.e(viewL));
                        f fVar2 = this.H;
                        fVar2.f16580f = Math.max(fVar2.f16580f, 0);
                    } else {
                        fVar.f16579e = this.J.b(viewL);
                        this.H.f16580f = this.J.b(viewL) - this.J.g();
                    }
                    int i13 = this.H.f16577c;
                    if ((i13 == -1 || i13 > this.f5889y.size() - 1) && this.H.f16578d <= this.G.b()) {
                        f fVar3 = this.H;
                        int i14 = iAbs - fVar3.f16580f;
                        FlexboxHelper.FlexLinesResult flexLinesResult = this.U;
                        flexLinesResult.f5874a = null;
                        flexLinesResult.f5875b = 0;
                        if (i14 > 0) {
                            if (zIsMainAxisDirectionHorizontal) {
                                this.E.b(flexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i14, fVar3.f16578d, -1, this.f5889y);
                            } else {
                                this.E.b(flexLinesResult, iMakeMeasureSpec2, iMakeMeasureSpec, i14, fVar3.f16578d, -1, this.f5889y);
                                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                                iMakeMeasureSpec = iMakeMeasureSpec;
                            }
                            flexboxHelper.h(iMakeMeasureSpec, iMakeMeasureSpec2, this.H.f16578d);
                            flexboxHelper.u(this.H.f16578d);
                        }
                    }
                    f fVar4 = this.H;
                    fVar4.f16575a = iAbs - fVar4.f16580f;
                }
            } else {
                View childAt2 = getChildAt(0);
                if (childAt2 != null) {
                    this.H.f16579e = this.J.e(childAt2);
                    int position2 = getPosition(childAt2);
                    View viewJ = j(childAt2, (FlexLine) this.f5889y.get(flexboxHelper.f5871c[position2]));
                    f fVar5 = this.H;
                    fVar5.getClass();
                    int i15 = flexboxHelper.f5871c[position2];
                    if (i15 == -1) {
                        i15 = 0;
                    }
                    if (i15 > 0) {
                        this.H.f16578d = position2 - ((FlexLine) this.f5889y.get(i15 - 1)).f5860h;
                    } else {
                        fVar5.f16578d = -1;
                    }
                    f fVar6 = this.H;
                    fVar6.f16577c = i15 > 0 ? i15 - 1 : 0;
                    if (z6) {
                        fVar6.f16579e = this.J.b(viewJ);
                        this.H.f16580f = this.J.b(viewJ) - this.J.g();
                        f fVar7 = this.H;
                        fVar7.f16580f = Math.max(fVar7.f16580f, 0);
                    } else {
                        fVar6.f16579e = this.J.e(viewJ);
                        this.H.f16580f = this.J.k() + (-this.J.e(viewJ));
                    }
                    f fVar8 = this.H;
                    fVar8.f16575a = iAbs - fVar8.f16580f;
                }
            }
            f fVar9 = this.H;
            int iH = h(recycler, state, fVar9) + fVar9.f16580f;
            if (iH >= 0) {
                if (z5) {
                    if (iAbs > iH) {
                        i10 = (-i11) * iH;
                    } else {
                        i10 = i7;
                    }
                } else if (iAbs > iH) {
                    i10 = i11 * iH;
                } else {
                    i10 = i7;
                }
                this.J.p(-i10);
                this.H.f16581g = i10;
                return i10;
            }
        }
        return 0;
    }

    public final int r(int i7) {
        if (getChildCount() == 0 || i7 == 0) {
            return 0;
        }
        g();
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        View view = this.S;
        int width = zIsMainAxisDirectionHorizontal ? view.getWidth() : view.getHeight();
        int width2 = zIsMainAxisDirectionHorizontal ? getWidth() : getHeight();
        int layoutDirection = getLayoutDirection();
        d dVar = this.I;
        if (layoutDirection == 1) {
            int iAbs = Math.abs(i7);
            if (i7 < 0) {
                return -Math.min((width2 + dVar.f16567d) - width, iAbs);
            }
            int i10 = dVar.f16567d;
            if (i10 + i7 > 0) {
                return -i10;
            }
        } else {
            if (i7 > 0) {
                return Math.min((width2 - dVar.f16567d) - width, i7);
            }
            int i11 = dVar.f16567d;
            if (i11 + i7 < 0) {
                return -i11;
            }
        }
        return i7;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:78:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0103 A[SYNTHETIC] */
    public final void s(RecyclerView.Recycler recycler, f fVar) {
        int childCount;
        int i7;
        int childCount2;
        int i10;
        View childAt;
        int i11;
        if (fVar.f16583i) {
            int i12 = fVar.f16582h;
            FlexboxHelper flexboxHelper = this.E;
            int i13 = -1;
            if (i12 == -1) {
                if (fVar.f16580f < 0 || (childCount2 = getChildCount()) == 0 || (childAt = getChildAt((i10 = childCount2 - 1))) == null || (i11 = flexboxHelper.f5871c[getPosition(childAt)]) == -1) {
                    return;
                }
                FlexLine flexLine = (FlexLine) this.f5889y.get(i11);
                for (int i14 = i10; i14 >= 0; i14--) {
                    View childAt2 = getChildAt(i14);
                    if (childAt2 != null) {
                        int i15 = fVar.f16580f;
                        if (!isMainAxisDirectionHorizontal() && this.f5887w) {
                            if (this.J.b(childAt2) > i15) {
                                break;
                            }
                            if (flexLine.f5865o != getPosition(childAt2)) {
                                continue;
                            } else if (i11 <= 0) {
                                childCount2 = i14;
                                break;
                            } else {
                                i11 += fVar.f16582h;
                                flexLine = (FlexLine) this.f5889y.get(i11);
                                childCount2 = i14;
                            }
                        } else {
                            if (this.J.e(childAt2) < this.J.f() - i15) {
                                break;
                            }
                            if (flexLine.f5865o != getPosition(childAt2)) {
                                continue;
                            } else if (i11 <= 0) {
                                childCount2 = i14;
                                break;
                            } else {
                                i11 += fVar.f16582h;
                                flexLine = (FlexLine) this.f5889y.get(i11);
                                childCount2 = i14;
                            }
                        }
                    }
                }
                while (i10 >= childCount2) {
                    removeAndRecycleViewAt(i10, recycler);
                    i10--;
                }
                return;
            }
            if (fVar.f16580f >= 0 && (childCount = getChildCount()) != 0) {
                View childAt3 = getChildAt(0);
                if (childAt3 == null || (i7 = flexboxHelper.f5871c[getPosition(childAt3)]) == -1) {
                    return;
                }
                FlexLine flexLine2 = (FlexLine) this.f5889y.get(i7);
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt4 = getChildAt(i16);
                    if (childAt4 != null) {
                        int i17 = fVar.f16580f;
                        if (!isMainAxisDirectionHorizontal() && this.f5887w) {
                            if (this.J.f() - this.J.e(childAt4) > i17) {
                                break;
                            }
                            if (flexLine2.f5866p != getPosition(childAt4)) {
                                continue;
                            } else if (i7 >= this.f5889y.size() - 1) {
                                i13 = i16;
                                break;
                            } else {
                                i7 += fVar.f16582h;
                                flexLine2 = (FlexLine) this.f5889y.get(i7);
                                i13 = i16;
                            }
                        } else {
                            if (this.J.b(childAt4) > i17) {
                                break;
                            }
                            if (flexLine2.f5866p != getPosition(childAt4)) {
                                continue;
                            } else if (i7 >= this.f5889y.size() - 1) {
                                i13 = i16;
                                break;
                            } else {
                                i7 += fVar.f16582h;
                                flexLine2 = (FlexLine) this.f5889y.get(i7);
                                i13 = i16;
                            }
                        }
                    }
                }
                while (i13 >= 0) {
                    removeAndRecycleViewAt(i13, recycler);
                    i13--;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i7, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!isMainAxisDirectionHorizontal() || this.f5884e == 0) {
            int iQ = q(i7, recycler, state);
            this.Q.clear();
            return iQ;
        }
        int iR = r(i7);
        this.I.f16567d += iR;
        this.K.p(-iR);
        return iR;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i7) {
        this.M = i7;
        this.N = Integer.MIN_VALUE;
        g gVar = this.L;
        if (gVar != null) {
            gVar.f16584d = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i7, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (isMainAxisDirectionHorizontal() || (this.f5884e == 0 && !isMainAxisDirectionHorizontal())) {
            int iQ = q(i7, recycler, state);
            this.Q.clear();
            return iQ;
        }
        int iR = r(i7);
        this.I.f16567d += iR;
        this.K.p(-iR);
        return iR;
    }

    @Override // ne.a
    public final void setFlexLines(List list) {
        this.f5889y = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i7) {
        m0 m0Var = new m0(recyclerView.getContext());
        m0Var.setTargetPosition(i7);
        startSmoothScroll(m0Var);
    }

    public final void t() {
        int heightMode = isMainAxisDirectionHorizontal() ? getHeightMode() : getWidthMode();
        this.H.f16576b = heightMode == 0 || heightMode == Integer.MIN_VALUE;
    }

    public final void u(int i7) {
        if (this.f5883d != i7) {
            removeAllViews();
            this.f5883d = i7;
            this.J = null;
            this.K = null;
            this.f5889y.clear();
            d dVar = this.I;
            d.b(dVar);
            dVar.f16567d = 0;
            requestLayout();
        }
    }

    @Override // ne.a
    public final void updateViewCache(int i7, View view) {
        this.Q.put(i7, view);
    }

    public final void v(int i7) {
        int i10 = this.f5884e;
        if (i10 != 1) {
            if (i10 == 0) {
                removeAllViews();
                this.f5889y.clear();
                d dVar = this.I;
                d.b(dVar);
                dVar.f16567d = 0;
            }
            this.f5884e = 1;
            this.J = null;
            this.K = null;
            requestLayout();
        }
    }

    public final boolean w(View view, int i7, int i10, e eVar) {
        return (!view.isLayoutRequested() && isMeasurementCacheEnabled() && b(view.getWidth(), i7, ((ViewGroup.MarginLayoutParams) eVar).width) && b(view.getHeight(), i10, ((ViewGroup.MarginLayoutParams) eVar).height)) ? false : true;
    }

    public final void x(int i7) {
        View viewM = m(getChildCount() - 1, -1);
        if (i7 >= (viewM != null ? getPosition(viewM) : -1)) {
            return;
        }
        int childCount = getChildCount();
        FlexboxHelper flexboxHelper = this.E;
        flexboxHelper.j(childCount);
        flexboxHelper.k(childCount);
        flexboxHelper.i(childCount);
        if (i7 >= flexboxHelper.f5871c.length) {
            return;
        }
        this.T = i7;
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        this.M = getPosition(childAt);
        if (isMainAxisDirectionHorizontal() || !this.f5887w) {
            this.N = this.J.e(childAt) - this.J.k();
        } else {
            this.N = this.J.h() + this.J.b(childAt);
        }
    }

    public final void y(d dVar, boolean z5, boolean z6) {
        int i7;
        if (z6) {
            t();
        } else {
            this.H.f16576b = false;
        }
        if (isMainAxisDirectionHorizontal() || !this.f5887w) {
            this.H.f16575a = this.J.g() - dVar.f16566c;
        } else {
            this.H.f16575a = dVar.f16566c - getPaddingRight();
        }
        f fVar = this.H;
        fVar.f16578d = dVar.f16564a;
        fVar.f16582h = 1;
        fVar.f16579e = dVar.f16566c;
        fVar.f16580f = Integer.MIN_VALUE;
        fVar.f16577c = dVar.f16565b;
        if (!z5 || this.f5889y.size() <= 1 || (i7 = dVar.f16565b) < 0 || i7 >= this.f5889y.size() - 1) {
            return;
        }
        FlexLine flexLine = (FlexLine) this.f5889y.get(dVar.f16565b);
        f fVar2 = this.H;
        fVar2.f16577c++;
        fVar2.f16578d += flexLine.f5860h;
    }

    public final void z(d dVar, boolean z5, boolean z6) {
        if (z6) {
            t();
        } else {
            this.H.f16576b = false;
        }
        if (isMainAxisDirectionHorizontal() || !this.f5887w) {
            this.H.f16575a = dVar.f16566c - this.J.k();
        } else {
            this.H.f16575a = (this.S.getWidth() - dVar.f16566c) - this.J.k();
        }
        f fVar = this.H;
        fVar.f16578d = dVar.f16564a;
        fVar.f16582h = -1;
        fVar.f16579e = dVar.f16566c;
        fVar.f16580f = Integer.MIN_VALUE;
        int i7 = dVar.f16565b;
        fVar.f16577c = i7;
        if (!z5 || i7 <= 0) {
            return;
        }
        int size = this.f5889y.size();
        int i10 = dVar.f16565b;
        if (size > i10) {
            FlexLine flexLine = (FlexLine) this.f5889y.get(i10);
            f fVar2 = this.H;
            fVar2.f16577c--;
            fVar2.f16578d -= flexLine.f5860h;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsUpdated(RecyclerView recyclerView, int i7, int i10) {
        super.onItemsUpdated(recyclerView, i7, i10);
        x(i7);
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i7, int i10) {
        d dVar = new d(this);
        this.I = dVar;
        this.M = -1;
        this.N = Integer.MIN_VALUE;
        this.O = Integer.MIN_VALUE;
        this.P = Integer.MIN_VALUE;
        this.Q = new SparseArray();
        this.T = -1;
        this.U = new FlexboxHelper.FlexLinesResult();
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i7, i10);
        int i11 = properties.f2495a;
        if (i11 != 0) {
            if (i11 == 1) {
                if (properties.f2497c) {
                    u(3);
                } else {
                    u(2);
                }
            }
        } else if (properties.f2497c) {
            u(1);
        } else {
            u(0);
        }
        v(1);
        if (this.f5885i != 4) {
            removeAllViews();
            this.f5889y.clear();
            d.b(dVar);
            dVar.f16567d = 0;
            this.f5885i = 4;
            requestLayout();
        }
        this.R = context;
    }
}
