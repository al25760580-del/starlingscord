package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.LayoutManager implements i0, i1 {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final AnchorInfo mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final LayoutChunkResult mLayoutChunkResult;
    private LayoutState mLayoutState;
    int mOrientation;
    OrientationHelper mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    public static class AnchorInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public OrientationHelper f2466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2467b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2468c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f2469d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f2470e;

        public AnchorInfo() {
            d();
        }

        public final void a() {
            this.f2468c = this.f2469d ? this.f2466a.g() : this.f2466a.k();
        }

        public final void b(int i7, View view) {
            if (this.f2469d) {
                this.f2468c = this.f2466a.m() + this.f2466a.b(view);
            } else {
                this.f2468c = this.f2466a.e(view);
            }
            this.f2467b = i7;
        }

        public final void c(int i7, View view) {
            int iM = this.f2466a.m();
            if (iM >= 0) {
                b(i7, view);
                return;
            }
            this.f2467b = i7;
            if (!this.f2469d) {
                int iE = this.f2466a.e(view);
                int iK = iE - this.f2466a.k();
                this.f2468c = iE;
                if (iK > 0) {
                    int iG = (this.f2466a.g() - Math.min(0, (this.f2466a.g() - iM) - this.f2466a.b(view))) - (this.f2466a.c(view) + iE);
                    if (iG < 0) {
                        this.f2468c -= Math.min(iK, -iG);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG2 = (this.f2466a.g() - iM) - this.f2466a.b(view);
            this.f2468c = this.f2466a.g() - iG2;
            if (iG2 > 0) {
                int iC = this.f2468c - this.f2466a.c(view);
                int iK2 = this.f2466a.k();
                int iMin = iC - (Math.min(this.f2466a.e(view) - iK2, 0) + iK2);
                if (iMin < 0) {
                    this.f2468c = Math.min(iG2, -iMin) + this.f2468c;
                }
            }
        }

        public final void d() {
            this.f2467b = -1;
            this.f2468c = Integer.MIN_VALUE;
            this.f2469d = false;
            this.f2470e = false;
        }

        public final String toString() {
            return "AnchorInfo{mPosition=" + this.f2467b + ", mCoordinate=" + this.f2468c + ", mLayoutFromEnd=" + this.f2469d + ", mValid=" + this.f2470e + '}';
        }
    }

    public static class LayoutChunkResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2473c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f2474d;
    }

    public static class LayoutState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2477c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2478d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2479e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2480f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f2481g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f2482h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f2483i;
        public int j;
        public List k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f2484l;

        public final void a(View view) {
            int layoutPosition;
            int size = this.k.size();
            View view2 = null;
            int i7 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < size; i10++) {
                View view3 = ((RecyclerView.ViewHolder) this.k.get(i10)).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.f2499d.isRemoved() && (layoutPosition = (layoutParams.f2499d.getLayoutPosition() - this.f2478d) * this.f2479e) >= 0 && layoutPosition < i7) {
                    view2 = view3;
                    if (layoutPosition == 0) {
                        break;
                    } else {
                        i7 = layoutPosition;
                    }
                }
            }
            if (view2 == null) {
                this.f2478d = -1;
            } else {
                this.f2478d = ((RecyclerView.LayoutParams) view2.getLayoutParams()).f2499d.getLayoutPosition();
            }
        }

        public final View b(RecyclerView.Recycler recycler) {
            List list = this.k;
            if (list == null) {
                View viewE = recycler.e(this.f2478d);
                this.f2478d += this.f2479e;
                return viewE;
            }
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view = ((RecyclerView.ViewHolder) this.k.get(i7)).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!layoutParams.f2499d.isRemoved() && this.f2478d == layoutParams.f2499d.getLayoutPosition()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new l0();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2485d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2486e;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f2487i;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f2485d);
            parcel.writeInt(this.f2486e);
            parcel.writeInt(this.f2487i ? 1 : 0);
        }
    }

    public LinearLayoutManager() {
        this(1, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(@NonNull RecyclerView.State state, @NonNull int[] iArr) {
        int i7;
        int extraLayoutSpace = getExtraLayoutSpace(state);
        if (this.mLayoutState.f2480f == -1) {
            i7 = 0;
        } else {
            i7 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void collectAdjacentPrefetchPositions(int i7, int i10, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        if (this.mOrientation != 0) {
            i7 = i10;
        }
        if (getChildCount() == 0 || i7 == 0) {
            return;
        }
        ensureLayoutState();
        o(i7 > 0 ? 1 : -1, Math.abs(i7), true, state);
        collectPrefetchPositionsForLayoutState(state, this.mLayoutState, layoutPrefetchRegistry);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void collectInitialPrefetchPositions(int i7, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        boolean z5;
        int i10;
        SavedState savedState = this.mPendingSavedState;
        if (savedState == null || (i10 = savedState.f2485d) < 0) {
            n();
            z5 = this.mShouldReverseLayout;
            i10 = this.mPendingScrollPosition;
            if (i10 == -1) {
                i10 = z5 ? i7 - 1 : 0;
            }
        } else {
            z5 = savedState.f2487i;
        }
        int i11 = z5 ? -1 : 1;
        for (int i12 = 0; i12 < this.mInitialPrefetchItemCount && i10 >= 0 && i10 < i7; i12++) {
            layoutPrefetchRegistry.a(i10, 0);
            i10 += i11;
        }
    }

    public void collectPrefetchPositionsForLayoutState(RecyclerView.State state, LayoutState layoutState, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i7 = layoutState.f2478d;
        if (i7 < 0 || i7 >= state.b()) {
            return;
        }
        layoutPrefetchRegistry.a(i7, Math.max(0, layoutState.f2481g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return d(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return e(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return f(state);
    }

    @Override // androidx.recyclerview.widget.i1
    @SuppressLint({"UnknownNullness"})
    public PointF computeScrollVectorForPosition(int i7) {
        if (getChildCount() == 0) {
            return null;
        }
        int i10 = (i7 < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i10, 0.0f) : new PointF(0.0f, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return d(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return e(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return f(state);
    }

    public int convertFocusDirectionToLayoutDirection(int i7) {
        if (i7 == 1) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
        }
        if (i7 == 2) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1;
        }
        if (i7 == 17) {
            return this.mOrientation == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i7 == 33) {
            return this.mOrientation == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i7 != 66) {
            return (i7 == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.mOrientation == 0 ? 1 : Integer.MIN_VALUE;
    }

    public LayoutState createLayoutState() {
        LayoutState layoutState = new LayoutState();
        layoutState.f2475a = true;
        layoutState.f2482h = 0;
        layoutState.f2483i = 0;
        layoutState.k = null;
        return layoutState;
    }

    public final int d(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return k1.a(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public final int e(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return k1.b(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public final int f(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return k1.c(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public int fill(RecyclerView.Recycler recycler, LayoutState layoutState, RecyclerView.State state, boolean z5) {
        int i7;
        int i10 = layoutState.f2477c;
        int i11 = layoutState.f2481g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                layoutState.f2481g = i11 + i10;
            }
            l(recycler, layoutState);
        }
        int i12 = layoutState.f2477c + layoutState.f2482h;
        LayoutChunkResult layoutChunkResult = this.mLayoutChunkResult;
        while (true) {
            if ((!layoutState.f2484l && i12 <= 0) || (i7 = layoutState.f2478d) < 0 || i7 >= state.b()) {
                break;
            }
            layoutChunkResult.f2471a = 0;
            layoutChunkResult.f2472b = false;
            layoutChunkResult.f2473c = false;
            layoutChunkResult.f2474d = false;
            layoutChunk(recycler, state, layoutState, layoutChunkResult);
            if (!layoutChunkResult.f2472b) {
                int i13 = layoutState.f2476b;
                int i14 = layoutChunkResult.f2471a;
                layoutState.f2476b = (layoutState.f2480f * i14) + i13;
                if (!layoutChunkResult.f2473c || layoutState.k != null || !state.f2527g) {
                    layoutState.f2477c -= i14;
                    i12 -= i14;
                }
                int i15 = layoutState.f2481g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    layoutState.f2481g = i16;
                    int i17 = layoutState.f2477c;
                    if (i17 < 0) {
                        layoutState.f2481g = i16 + i17;
                    }
                    l(recycler, layoutState);
                }
                if (z5 && layoutChunkResult.f2474d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - layoutState.f2477c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z5, boolean z6) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z5, z6) : findOneVisibleChild(getChildCount() - 1, -1, z5, z6);
    }

    public View findFirstVisibleChildClosestToStart(boolean z5, boolean z6) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z5, z6) : findOneVisibleChild(0, getChildCount(), z5, z6);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i7, int i10) {
        int i11;
        int i12;
        ensureLayoutState();
        if (i10 <= i7 && i10 >= i7) {
            return getChildAt(i7);
        }
        if (this.mOrientationHelper.e(getChildAt(i7)) < this.mOrientationHelper.k()) {
            i11 = 16644;
            i12 = 16388;
        } else {
            i11 = 4161;
            i12 = 4097;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i7, i10, i11, i12) : this.mVerticalBoundCheck.a(i7, i10, i11, i12);
    }

    public View findOneVisibleChild(int i7, int i10, boolean z5, boolean z6) {
        ensureLayoutState();
        int i11 = z5 ? 24579 : 320;
        int i12 = z6 ? 320 : 0;
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i7, i10, i11, i12) : this.mVerticalBoundCheck.a(i7, i10, i11, i12);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    public View findReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z5, boolean z6) {
        int i7;
        int childCount;
        int i10;
        ensureLayoutState();
        int childCount2 = getChildCount();
        if (z6) {
            childCount = getChildCount() - 1;
            i7 = -1;
            i10 = -1;
        } else {
            i7 = childCount2;
            childCount = 0;
            i10 = 1;
        }
        int iB = state.b();
        int iK = this.mOrientationHelper.k();
        int iG = this.mOrientationHelper.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (childCount != i7) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            int iE = this.mOrientationHelper.e(childAt);
            int iB2 = this.mOrientationHelper.b(childAt);
            if (position >= 0 && position < iB) {
                if (!((RecyclerView.LayoutParams) childAt.getLayoutParams()).f2499d.isRemoved()) {
                    boolean z7 = iB2 <= iK && iE < iK;
                    boolean z10 = iE >= iG && iB2 > iG;
                    if (!z7 && !z10) {
                        return childAt;
                    }
                    if (z5) {
                        if (z10) {
                            view2 = childAt;
                        } else if (view == null) {
                            view = childAt;
                        }
                    } else if (z7) {
                        view2 = childAt;
                    } else if (view == null) {
                        view = childAt;
                    }
                } else if (view3 == null) {
                    view3 = childAt;
                }
            }
            childCount += i10;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public View findViewByPosition(int i7) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i7 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i7) {
                return childAt;
            }
        }
        return super.findViewByPosition(i7);
    }

    public final int g(int i7, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z5) {
        int iG;
        int iG2 = this.mOrientationHelper.g() - i7;
        if (iG2 <= 0) {
            return 0;
        }
        int i10 = -scrollBy(-iG2, recycler, state);
        int i11 = i7 + i10;
        if (!z5 || (iG = this.mOrientationHelper.g() - i11) <= 0) {
            return i10;
        }
        this.mOrientationHelper.p(iG);
        return iG + i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(RecyclerView.State state) {
        if (state.f2521a != -1) {
            return this.mOrientationHelper.l();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    public final int h(int i7, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z5) {
        int iK;
        int iK2 = i7 - this.mOrientationHelper.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i10 = -scrollBy(iK2, recycler, state);
        int i11 = i7 + i10;
        if (!z5 || (iK = i11 - this.mOrientationHelper.k()) <= 0) {
            return i10;
        }
        this.mOrientationHelper.p(-iK);
        return i10 - iK;
    }

    public final View i() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isLayoutReversed() {
        return this.mReverseLayout;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public final View j() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    public final void k() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.e(childAt));
        }
        Log.d(TAG, "==============");
    }

    public final void l(RecyclerView.Recycler recycler, LayoutState layoutState) {
        if (!layoutState.f2475a || layoutState.f2484l) {
            return;
        }
        int i7 = layoutState.f2481g;
        int i10 = layoutState.f2483i;
        if (layoutState.f2480f == -1) {
            int childCount = getChildCount();
            if (i7 < 0) {
                return;
            }
            int iF = (this.mOrientationHelper.f() - i7) + i10;
            if (this.mShouldReverseLayout) {
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if (this.mOrientationHelper.e(childAt) < iF || this.mOrientationHelper.o(childAt) < iF) {
                        m(recycler, 0, i11);
                        return;
                    }
                }
                return;
            }
            int i12 = childCount - 1;
            for (int i13 = i12; i13 >= 0; i13--) {
                View childAt2 = getChildAt(i13);
                if (this.mOrientationHelper.e(childAt2) < iF || this.mOrientationHelper.o(childAt2) < iF) {
                    m(recycler, i12, i13);
                    return;
                }
            }
            return;
        }
        if (i7 < 0) {
            return;
        }
        int i14 = i7 - i10;
        int childCount2 = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt3 = getChildAt(i15);
                if (this.mOrientationHelper.b(childAt3) > i14 || this.mOrientationHelper.n(childAt3) > i14) {
                    m(recycler, 0, i15);
                    return;
                }
            }
            return;
        }
        int i16 = childCount2 - 1;
        for (int i17 = i16; i17 >= 0; i17--) {
            View childAt4 = getChildAt(i17);
            if (this.mOrientationHelper.b(childAt4) > i14 || this.mOrientationHelper.n(childAt4) > i14) {
                m(recycler, i16, i17);
                return;
            }
        }
    }

    public void layoutChunk(RecyclerView.Recycler recycler, RecyclerView.State state, LayoutState layoutState, LayoutChunkResult layoutChunkResult) {
        int iD;
        int i7;
        int i10;
        int i11;
        int paddingLeft;
        int iD2;
        int i12;
        int i13;
        View viewB = layoutState.b(recycler);
        if (viewB == null) {
            layoutChunkResult.f2472b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewB.getLayoutParams();
        if (layoutState.k == null) {
            if (this.mShouldReverseLayout == (layoutState.f2480f == -1)) {
                addView(viewB);
            } else {
                addView(viewB, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (layoutState.f2480f == -1)) {
                addDisappearingView(viewB);
            } else {
                addDisappearingView(viewB, 0);
            }
        }
        measureChildWithMargins(viewB, 0, 0);
        layoutChunkResult.f2471a = this.mOrientationHelper.c(viewB);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iD2 = getWidth() - getPaddingRight();
                paddingLeft = iD2 - this.mOrientationHelper.d(viewB);
            } else {
                paddingLeft = getPaddingLeft();
                iD2 = this.mOrientationHelper.d(viewB) + paddingLeft;
            }
            if (layoutState.f2480f == -1) {
                i13 = layoutState.f2476b;
                i12 = i13 - layoutChunkResult.f2471a;
            } else {
                i12 = layoutState.f2476b;
                i13 = layoutChunkResult.f2471a + i12;
            }
            int i14 = paddingLeft;
            i11 = i12;
            i10 = i14;
            iD = i13;
            i7 = iD2;
        } else {
            int paddingTop = getPaddingTop();
            iD = this.mOrientationHelper.d(viewB) + paddingTop;
            if (layoutState.f2480f == -1) {
                int i15 = layoutState.f2476b;
                i10 = i15 - layoutChunkResult.f2471a;
                i7 = i15;
            } else {
                int i16 = layoutState.f2476b;
                i7 = layoutChunkResult.f2471a + i16;
                i10 = i16;
            }
            i11 = paddingTop;
        }
        layoutDecoratedWithMargins(viewB, i10, i11, i7, iD);
        if (layoutParams.f2499d.isRemoved() || layoutParams.f2499d.isUpdated()) {
            layoutChunkResult.f2473c = true;
        }
        layoutChunkResult.f2474d = viewB.hasFocusable();
    }

    public final void m(RecyclerView.Recycler recycler, int i7, int i10) {
        if (i7 == i10) {
            return;
        }
        if (i10 <= i7) {
            while (i7 > i10) {
                removeAndRecycleViewAt(i7, recycler);
                i7--;
            }
        } else {
            for (int i11 = i10 - 1; i11 >= i7; i11--) {
                removeAndRecycleViewAt(i11, recycler);
            }
        }
    }

    public final void n() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    public final void o(int i7, int i10, boolean z5, RecyclerView.State state) {
        int iK;
        this.mLayoutState.f2484l = resolveIsInfinite();
        this.mLayoutState.f2480f = i7;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(state, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z6 = i7 == 1;
        LayoutState layoutState = this.mLayoutState;
        int i11 = z6 ? iMax2 : iMax;
        layoutState.f2482h = i11;
        if (!z6) {
            iMax = iMax2;
        }
        layoutState.f2483i = iMax;
        if (z6) {
            layoutState.f2482h = this.mOrientationHelper.h() + i11;
            View viewI = i();
            LayoutState layoutState2 = this.mLayoutState;
            layoutState2.f2479e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(viewI);
            LayoutState layoutState3 = this.mLayoutState;
            layoutState2.f2478d = position + layoutState3.f2479e;
            layoutState3.f2476b = this.mOrientationHelper.b(viewI);
            iK = this.mOrientationHelper.b(viewI) - this.mOrientationHelper.g();
        } else {
            View viewJ = j();
            LayoutState layoutState4 = this.mLayoutState;
            layoutState4.f2482h = this.mOrientationHelper.k() + layoutState4.f2482h;
            LayoutState layoutState5 = this.mLayoutState;
            layoutState5.f2479e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(viewJ);
            LayoutState layoutState6 = this.mLayoutState;
            layoutState5.f2478d = position2 + layoutState6.f2479e;
            layoutState6.f2476b = this.mOrientationHelper.e(viewJ);
            iK = (-this.mOrientationHelper.e(viewJ)) + this.mOrientationHelper.k();
        }
        LayoutState layoutState7 = this.mLayoutState;
        layoutState7.f2477c = i10;
        if (z5) {
            layoutState7.f2477c = i10 - iK;
        }
        layoutState7.f2481g = iK;
    }

    public void onAnchorReady(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorInfo, int i7) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(recycler);
            recycler.b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public View onFocusSearchFailed(View view, int i7, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int iConvertFocusDirectionToLayoutDirection;
        View viewFindOnePartiallyOrCompletelyInvisibleChild;
        n();
        if (getChildCount() != 0 && (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i7)) != Integer.MIN_VALUE) {
            ensureLayoutState();
            o(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.l() * MAX_SCROLL_FACTOR), false, state);
            LayoutState layoutState = this.mLayoutState;
            layoutState.f2481g = Integer.MIN_VALUE;
            layoutState.f2475a = false;
            fill(recycler, layoutState, state, true);
            if (iConvertFocusDirectionToLayoutDirection == -1) {
                viewFindOnePartiallyOrCompletelyInvisibleChild = this.mShouldReverseLayout ? findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1) : findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
            } else {
                viewFindOnePartiallyOrCompletelyInvisibleChild = this.mShouldReverseLayout ? findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount()) : findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
            }
            View viewJ = iConvertFocusDirectionToLayoutDirection == -1 ? j() : i();
            if (!viewJ.hasFocusable()) {
                return viewFindOnePartiallyOrCompletelyInvisibleChild;
            }
            if (viewFindOnePartiallyOrCompletelyInvisibleChild != null) {
                return viewJ;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfo(@NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(recycler, state, accessibilityNodeInfoCompat);
        RecyclerView.Adapter adapter = this.mRecyclerView.mAdapter;
        if (adapter == null || adapter.getItemCount() <= 0) {
            return;
        }
        accessibilityNodeInfoCompat.b(androidx.core.view.accessibility.a.f1623n);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ee A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:114:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:119:0x0205  */
    /* JADX WARN: Code duplicated, block: B:83:0x0175  */
    /* JADX WARN: Code duplicated, block: B:85:0x017b  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c0  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int iB;
        View focusedChild;
        boolean z5;
        boolean z6;
        View viewFindReferenceChild;
        int iE;
        int iB2;
        int iK;
        int iG;
        boolean z7;
        boolean z10;
        RecyclerView.LayoutParams layoutParams;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int iG2;
        int i14;
        View viewFindViewByPosition;
        int iE2;
        int iG3;
        int i15;
        int i16 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && state.b() == 0) {
            removeAndRecycleAllViews(recycler);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && (i15 = savedState.f2485d) >= 0) {
            this.mPendingScrollPosition = i15;
        }
        ensureLayoutState();
        this.mLayoutState.f2475a = false;
        n();
        View focusedChild2 = getFocusedChild();
        AnchorInfo anchorInfo = this.mAnchorInfo;
        if (!anchorInfo.f2470e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            anchorInfo.d();
            AnchorInfo anchorInfo2 = this.mAnchorInfo;
            anchorInfo2.f2469d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            if (state.f2527g || (i7 = this.mPendingScrollPosition) == -1) {
                if (getChildCount() != 0) {
                    focusedChild = getFocusedChild();
                    if (focusedChild != null) {
                        layoutParams = (RecyclerView.LayoutParams) focusedChild.getLayoutParams();
                        if (!layoutParams.f2499d.isRemoved() || layoutParams.f2499d.getLayoutPosition() < 0 || layoutParams.f2499d.getLayoutPosition() >= state.b()) {
                            z5 = this.mLastStackFromEnd;
                            z6 = this.mStackFromEnd;
                            if (z5 == z6 || (viewFindReferenceChild = findReferenceChild(recycler, state, anchorInfo2.f2469d, z6)) == null) {
                                anchorInfo2.a();
                                if (this.mStackFromEnd) {
                                    iB = state.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                anchorInfo2.f2467b = iB;
                            } else {
                                anchorInfo2.b(getPosition(viewFindReferenceChild), viewFindReferenceChild);
                                if (!state.f2527g && supportsPredictiveItemAnimations()) {
                                    iE = this.mOrientationHelper.e(viewFindReferenceChild);
                                    iB2 = this.mOrientationHelper.b(viewFindReferenceChild);
                                    iK = this.mOrientationHelper.k();
                                    iG = this.mOrientationHelper.g();
                                    if (iB2 <= iK || iE >= iK) {
                                        z7 = false;
                                    } else {
                                        z7 = true;
                                    }
                                    if (iE >= iG || iB2 <= iG) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    if (z7 || z10) {
                                        if (anchorInfo2.f2469d) {
                                            iK = iG;
                                        }
                                        anchorInfo2.f2468c = iK;
                                    }
                                }
                            }
                        } else {
                            anchorInfo2.c(getPosition(focusedChild), focusedChild);
                        }
                    } else {
                        z5 = this.mLastStackFromEnd;
                        z6 = this.mStackFromEnd;
                        if (z5 == z6) {
                            anchorInfo2.a();
                            if (this.mStackFromEnd) {
                                iB = state.b() - 1;
                            } else {
                                iB = 0;
                            }
                            anchorInfo2.f2467b = iB;
                        } else {
                            anchorInfo2.b(getPosition(viewFindReferenceChild), viewFindReferenceChild);
                            if (!state.f2527g) {
                                iE = this.mOrientationHelper.e(viewFindReferenceChild);
                                iB2 = this.mOrientationHelper.b(viewFindReferenceChild);
                                iK = this.mOrientationHelper.k();
                                iG = this.mOrientationHelper.g();
                                if (iB2 <= iK) {
                                    z7 = false;
                                } else {
                                    z7 = false;
                                }
                                if (iE >= iG) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                if (z7) {
                                    if (anchorInfo2.f2469d) {
                                        iK = iG;
                                    }
                                    anchorInfo2.f2468c = iK;
                                } else {
                                    if (anchorInfo2.f2469d) {
                                        iK = iG;
                                    }
                                    anchorInfo2.f2468c = iK;
                                }
                            }
                        }
                    }
                } else {
                    anchorInfo2.a();
                    if (this.mStackFromEnd) {
                        iB = state.b() - 1;
                    } else {
                        iB = 0;
                    }
                    anchorInfo2.f2467b = iB;
                }
            } else if (i7 < 0 || i7 >= state.b()) {
                this.mPendingScrollPosition = -1;
                this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
                if (getChildCount() != 0) {
                    focusedChild = getFocusedChild();
                    if (focusedChild != null) {
                        layoutParams = (RecyclerView.LayoutParams) focusedChild.getLayoutParams();
                        if (layoutParams.f2499d.isRemoved()) {
                            z5 = this.mLastStackFromEnd;
                            z6 = this.mStackFromEnd;
                            if (z5 == z6) {
                                anchorInfo2.a();
                                if (this.mStackFromEnd) {
                                    iB = state.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                anchorInfo2.f2467b = iB;
                            } else {
                                anchorInfo2.b(getPosition(viewFindReferenceChild), viewFindReferenceChild);
                                if (!state.f2527g) {
                                    iE = this.mOrientationHelper.e(viewFindReferenceChild);
                                    iB2 = this.mOrientationHelper.b(viewFindReferenceChild);
                                    iK = this.mOrientationHelper.k();
                                    iG = this.mOrientationHelper.g();
                                    if (iB2 <= iK) {
                                        z7 = false;
                                    } else {
                                        z7 = false;
                                    }
                                    if (iE >= iG) {
                                        z10 = false;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z7) {
                                        if (anchorInfo2.f2469d) {
                                            iK = iG;
                                        }
                                        anchorInfo2.f2468c = iK;
                                    } else {
                                        if (anchorInfo2.f2469d) {
                                            iK = iG;
                                        }
                                        anchorInfo2.f2468c = iK;
                                    }
                                }
                            }
                        } else {
                            z5 = this.mLastStackFromEnd;
                            z6 = this.mStackFromEnd;
                            if (z5 == z6) {
                                anchorInfo2.a();
                                if (this.mStackFromEnd) {
                                    iB = state.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                anchorInfo2.f2467b = iB;
                            } else {
                                anchorInfo2.b(getPosition(viewFindReferenceChild), viewFindReferenceChild);
                                if (!state.f2527g) {
                                    iE = this.mOrientationHelper.e(viewFindReferenceChild);
                                    iB2 = this.mOrientationHelper.b(viewFindReferenceChild);
                                    iK = this.mOrientationHelper.k();
                                    iG = this.mOrientationHelper.g();
                                    if (iB2 <= iK) {
                                        z7 = false;
                                    } else {
                                        z7 = false;
                                    }
                                    if (iE >= iG) {
                                        z10 = false;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z7) {
                                        if (anchorInfo2.f2469d) {
                                            iK = iG;
                                        }
                                        anchorInfo2.f2468c = iK;
                                    } else {
                                        if (anchorInfo2.f2469d) {
                                            iK = iG;
                                        }
                                        anchorInfo2.f2468c = iK;
                                    }
                                }
                            }
                        }
                    } else {
                        z5 = this.mLastStackFromEnd;
                        z6 = this.mStackFromEnd;
                        if (z5 == z6) {
                            anchorInfo2.a();
                            if (this.mStackFromEnd) {
                                iB = state.b() - 1;
                            } else {
                                iB = 0;
                            }
                            anchorInfo2.f2467b = iB;
                        } else {
                            anchorInfo2.b(getPosition(viewFindReferenceChild), viewFindReferenceChild);
                            if (!state.f2527g) {
                                iE = this.mOrientationHelper.e(viewFindReferenceChild);
                                iB2 = this.mOrientationHelper.b(viewFindReferenceChild);
                                iK = this.mOrientationHelper.k();
                                iG = this.mOrientationHelper.g();
                                if (iB2 <= iK) {
                                    z7 = false;
                                } else {
                                    z7 = false;
                                }
                                if (iE >= iG) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                if (z7) {
                                    if (anchorInfo2.f2469d) {
                                        iK = iG;
                                    }
                                    anchorInfo2.f2468c = iK;
                                } else {
                                    if (anchorInfo2.f2469d) {
                                        iK = iG;
                                    }
                                    anchorInfo2.f2468c = iK;
                                }
                            }
                        }
                    }
                } else {
                    anchorInfo2.a();
                    if (this.mStackFromEnd) {
                        iB = state.b() - 1;
                    } else {
                        iB = 0;
                    }
                    anchorInfo2.f2467b = iB;
                }
            } else {
                int i17 = this.mPendingScrollPosition;
                anchorInfo2.f2467b = i17;
                SavedState savedState2 = this.mPendingSavedState;
                if (savedState2 != null && savedState2.f2485d >= 0) {
                    boolean z11 = savedState2.f2487i;
                    anchorInfo2.f2469d = z11;
                    if (z11) {
                        anchorInfo2.f2468c = this.mOrientationHelper.g() - this.mPendingSavedState.f2486e;
                    } else {
                        anchorInfo2.f2468c = this.mOrientationHelper.k() + this.mPendingSavedState.f2486e;
                    }
                } else if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                    View viewFindViewByPosition2 = findViewByPosition(i17);
                    if (viewFindViewByPosition2 == null) {
                        if (getChildCount() > 0) {
                            anchorInfo2.f2469d = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                        }
                        anchorInfo2.a();
                    } else if (this.mOrientationHelper.c(viewFindViewByPosition2) > this.mOrientationHelper.l()) {
                        anchorInfo2.a();
                    } else if (this.mOrientationHelper.e(viewFindViewByPosition2) - this.mOrientationHelper.k() < 0) {
                        anchorInfo2.f2468c = this.mOrientationHelper.k();
                        anchorInfo2.f2469d = false;
                    } else if (this.mOrientationHelper.g() - this.mOrientationHelper.b(viewFindViewByPosition2) < 0) {
                        anchorInfo2.f2468c = this.mOrientationHelper.g();
                        anchorInfo2.f2469d = true;
                    } else {
                        anchorInfo2.f2468c = anchorInfo2.f2469d ? this.mOrientationHelper.m() + this.mOrientationHelper.b(viewFindViewByPosition2) : this.mOrientationHelper.e(viewFindViewByPosition2);
                    }
                } else {
                    boolean z12 = this.mShouldReverseLayout;
                    anchorInfo2.f2469d = z12;
                    if (z12) {
                        anchorInfo2.f2468c = this.mOrientationHelper.g() - this.mPendingScrollPositionOffset;
                    } else {
                        anchorInfo2.f2468c = this.mOrientationHelper.k() + this.mPendingScrollPositionOffset;
                    }
                }
            }
            this.mAnchorInfo.f2470e = true;
        } else if (focusedChild2 != null && (this.mOrientationHelper.e(focusedChild2) >= this.mOrientationHelper.g() || this.mOrientationHelper.b(focusedChild2) <= this.mOrientationHelper.k())) {
            this.mAnchorInfo.c(getPosition(focusedChild2), focusedChild2);
        }
        LayoutState layoutState = this.mLayoutState;
        layoutState.f2480f = layoutState.j >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(state, iArr);
        int iK2 = this.mOrientationHelper.k() + Math.max(0, this.mReusableIntPair[0]);
        int iH = this.mOrientationHelper.h() + Math.max(0, this.mReusableIntPair[1]);
        if (state.f2527g && (i14 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i14)) != null) {
            if (this.mShouldReverseLayout) {
                iG3 = this.mOrientationHelper.g() - this.mOrientationHelper.b(viewFindViewByPosition);
                iE2 = this.mPendingScrollPositionOffset;
            } else {
                iE2 = this.mOrientationHelper.e(viewFindViewByPosition) - this.mOrientationHelper.k();
                iG3 = this.mPendingScrollPositionOffset;
            }
            int i18 = iG3 - iE2;
            if (i18 > 0) {
                iK2 += i18;
            } else {
                iH -= i18;
            }
        }
        AnchorInfo anchorInfo3 = this.mAnchorInfo;
        if (!anchorInfo3.f2469d ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i16 = 1;
        }
        onAnchorReady(recycler, state, anchorInfo3, i16);
        detachAndScrapAttachedViews(recycler);
        this.mLayoutState.f2484l = resolveIsInfinite();
        this.mLayoutState.getClass();
        this.mLayoutState.f2483i = 0;
        AnchorInfo anchorInfo4 = this.mAnchorInfo;
        if (anchorInfo4.f2469d) {
            q(anchorInfo4.f2467b, anchorInfo4.f2468c);
            LayoutState layoutState2 = this.mLayoutState;
            layoutState2.f2482h = iK2;
            fill(recycler, layoutState2, state, false);
            LayoutState layoutState3 = this.mLayoutState;
            i11 = layoutState3.f2476b;
            int i19 = layoutState3.f2478d;
            int i20 = layoutState3.f2477c;
            if (i20 > 0) {
                iH += i20;
            }
            AnchorInfo anchorInfo5 = this.mAnchorInfo;
            p(anchorInfo5.f2467b, anchorInfo5.f2468c);
            LayoutState layoutState4 = this.mLayoutState;
            layoutState4.f2482h = iH;
            layoutState4.f2478d += layoutState4.f2479e;
            fill(recycler, layoutState4, state, false);
            LayoutState layoutState5 = this.mLayoutState;
            i10 = layoutState5.f2476b;
            int i21 = layoutState5.f2477c;
            if (i21 > 0) {
                q(i19, i11);
                LayoutState layoutState6 = this.mLayoutState;
                layoutState6.f2482h = i21;
                fill(recycler, layoutState6, state, false);
                i11 = this.mLayoutState.f2476b;
            }
        } else {
            p(anchorInfo4.f2467b, anchorInfo4.f2468c);
            LayoutState layoutState7 = this.mLayoutState;
            layoutState7.f2482h = iH;
            fill(recycler, layoutState7, state, false);
            LayoutState layoutState8 = this.mLayoutState;
            i10 = layoutState8.f2476b;
            int i22 = layoutState8.f2478d;
            int i23 = layoutState8.f2477c;
            if (i23 > 0) {
                iK2 += i23;
            }
            AnchorInfo anchorInfo6 = this.mAnchorInfo;
            q(anchorInfo6.f2467b, anchorInfo6.f2468c);
            LayoutState layoutState9 = this.mLayoutState;
            layoutState9.f2482h = iK2;
            layoutState9.f2478d += layoutState9.f2479e;
            fill(recycler, layoutState9, state, false);
            LayoutState layoutState10 = this.mLayoutState;
            int i24 = layoutState10.f2476b;
            int i25 = layoutState10.f2477c;
            if (i25 > 0) {
                p(i22, i10);
                LayoutState layoutState11 = this.mLayoutState;
                layoutState11.f2482h = i25;
                fill(recycler, layoutState11, state, false);
                i10 = this.mLayoutState.f2476b;
            }
            i11 = i24;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int iG4 = g(i10, recycler, state, true);
                i12 = i11 + iG4;
                i13 = i10 + iG4;
                iG2 = h(i12, recycler, state, false);
            } else {
                int iH2 = h(i11, recycler, state, true);
                i12 = i11 + iH2;
                i13 = i10 + iH2;
                iG2 = g(i13, recycler, state, false);
            }
            i11 = i12 + iG2;
            i10 = i13 + iG2;
        }
        if (state.k && getChildCount() != 0 && !state.f2527g && supportsPredictiveItemAnimations()) {
            List list = recycler.f2506d;
            int size = list.size();
            int position = getPosition(getChildAt(0));
            int iC = 0;
            int iC2 = 0;
            for (int i26 = 0; i26 < size; i26++) {
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) list.get(i26);
                if (!viewHolder.isRemoved()) {
                    if ((viewHolder.getLayoutPosition() < position) != this.mShouldReverseLayout) {
                        iC += this.mOrientationHelper.c(viewHolder.itemView);
                    } else {
                        iC2 += this.mOrientationHelper.c(viewHolder.itemView);
                    }
                }
            }
            this.mLayoutState.k = list;
            if (iC > 0) {
                q(getPosition(j()), i11);
                LayoutState layoutState12 = this.mLayoutState;
                layoutState12.f2482h = iC;
                layoutState12.f2477c = 0;
                layoutState12.a(null);
                fill(recycler, this.mLayoutState, state, false);
            }
            if (iC2 > 0) {
                p(getPosition(i()), i10);
                LayoutState layoutState13 = this.mLayoutState;
                layoutState13.f2482h = iC2;
                layoutState13.f2477c = 0;
                layoutState13.a(null);
                fill(recycler, this.mLayoutState, state, false);
            }
            this.mLayoutState.k = null;
        }
        if (state.f2527g) {
            this.mAnchorInfo.d();
        } else {
            OrientationHelper orientationHelper = this.mOrientationHelper;
            orientationHelper.f2489b = orientationHelper.l();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.mPendingSavedState = savedState;
            if (this.mPendingScrollPosition != -1) {
                savedState.f2485d = -1;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public Parcelable onSaveInstanceState() {
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f2485d = savedState.f2485d;
            savedState2.f2486e = savedState.f2486e;
            savedState2.f2487i = savedState.f2487i;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (getChildCount() <= 0) {
            savedState3.f2485d = -1;
            return savedState3;
        }
        ensureLayoutState();
        boolean z5 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
        savedState3.f2487i = z5;
        if (z5) {
            View viewI = i();
            savedState3.f2486e = this.mOrientationHelper.g() - this.mOrientationHelper.b(viewI);
            savedState3.f2485d = getPosition(viewI);
            return savedState3;
        }
        View viewJ = j();
        savedState3.f2485d = getPosition(viewJ);
        savedState3.f2486e = this.mOrientationHelper.e(viewJ) - this.mOrientationHelper.k();
        return savedState3;
    }

    public final void p(int i7, int i10) {
        this.mLayoutState.f2477c = this.mOrientationHelper.g() - i10;
        LayoutState layoutState = this.mLayoutState;
        layoutState.f2479e = this.mShouldReverseLayout ? -1 : 1;
        layoutState.f2478d = i7;
        layoutState.f2480f = 1;
        layoutState.f2476b = i10;
        layoutState.f2481g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean performAccessibilityAction(int i7, Bundle bundle) {
        int iMin;
        if (super.performAccessibilityAction(i7, bundle)) {
            return true;
        }
        if (i7 == 16908343 && bundle != null) {
            if (this.mOrientation == 1) {
                int i10 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i10 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.mRecyclerView;
                iMin = Math.min(i10, getRowCountForAccessibility(recyclerView.mRecycler, recyclerView.mState) - 1);
            } else {
                int i11 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i11 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.mRecyclerView;
                iMin = Math.min(i11, getColumnCountForAccessibility(recyclerView2.mRecycler, recyclerView2.mState) - 1);
            }
            if (iMin >= 0) {
                scrollToPositionWithOffset(iMin, 0);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.i0
    public void prepareForDrop(@NonNull View view, @NonNull View view2, int i7, int i10) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        n();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        byte b10 = position < position2 ? (byte) 1 : (byte) -1;
        if (this.mShouldReverseLayout) {
            if (b10 == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.g() - (this.mOrientationHelper.c(view) + this.mOrientationHelper.e(view2)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.g() - this.mOrientationHelper.b(view2));
                return;
            }
        }
        if (b10 == -1) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.e(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.b(view2) - this.mOrientationHelper.c(view));
        }
    }

    public final void q(int i7, int i10) {
        this.mLayoutState.f2477c = i10 - this.mOrientationHelper.k();
        LayoutState layoutState = this.mLayoutState;
        layoutState.f2478d = i7;
        layoutState.f2479e = this.mShouldReverseLayout ? 1 : -1;
        layoutState.f2480f = -1;
        layoutState.f2476b = i10;
        layoutState.f2481g = Integer.MIN_VALUE;
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.i() == 0 && this.mOrientationHelper.f() == 0;
    }

    public int scrollBy(int i7, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i7 == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f2475a = true;
        int i10 = i7 > 0 ? 1 : -1;
        int iAbs = Math.abs(i7);
        o(i10, iAbs, true, state);
        LayoutState layoutState = this.mLayoutState;
        int iFill = fill(recycler, layoutState, state, false) + layoutState.f2481g;
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i7 = i10 * iFill;
        }
        this.mOrientationHelper.p(-i7);
        this.mLayoutState.j = i7;
        return i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int scrollHorizontallyBy(int i7, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i7, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i7) {
        this.mPendingScrollPosition = i7;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.f2485d = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i7, int i10) {
        this.mPendingScrollPosition = i7;
        this.mPendingScrollPositionOffset = i10;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.f2485d = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int scrollVerticallyBy(int i7, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i7, recycler, state);
    }

    public void setInitialPrefetchItemCount(int i7) {
        this.mInitialPrefetchItemCount = i7;
    }

    public void setOrientation(int i7) {
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException(kk.b.h(i7, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        if (i7 != this.mOrientation || this.mOrientationHelper == null) {
            OrientationHelper orientationHelperA = OrientationHelper.a(this, i7);
            this.mOrientationHelper = orientationHelperA;
            this.mAnchorInfo.f2466a = orientationHelperA;
            this.mOrientation = i7;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z5) {
        this.mRecycleChildrenOnDetach = z5;
    }

    public void setReverseLayout(boolean z5) {
        assertNotInLayoutOrScroll(null);
        if (z5 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z5;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z5) {
        this.mSmoothScrollbarEnabled = z5;
    }

    public void setStackFromEnd(boolean z5) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z5) {
            return;
        }
        this.mStackFromEnd = z5;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i7) {
        m0 m0Var = new m0(recyclerView.getContext());
        m0Var.setTargetPosition(i7);
        startSmoothScroll(m0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int iE = this.mOrientationHelper.e(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i7 = 1; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                int position2 = getPosition(childAt);
                int iE2 = this.mOrientationHelper.e(childAt);
                if (position2 < position) {
                    k();
                    StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                    sb2.append(iE2 < iE);
                    throw new RuntimeException(sb2.toString());
                }
                if (iE2 > iE) {
                    k();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i10 = 1; i10 < getChildCount(); i10++) {
            View childAt2 = getChildAt(i10);
            int position3 = getPosition(childAt2);
            int iE3 = this.mOrientationHelper.e(childAt2);
            if (position3 < position) {
                k();
                StringBuilder sb3 = new StringBuilder("detected invalid position. loc invalid? ");
                sb3.append(iE3 < iE);
                throw new RuntimeException(sb3.toString());
            }
            if (iE3 < iE) {
                k();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    public LinearLayoutManager(int i7, boolean z5) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new AnchorInfo();
        this.mLayoutChunkResult = new LayoutChunkResult();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i7);
        setReverseLayout(z5);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i7, int i10) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new AnchorInfo();
        this.mLayoutChunkResult = new LayoutChunkResult();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i7, i10);
        setOrientation(properties.f2495a);
        setReverseLayout(properties.f2497c);
        setStackFromEnd(properties.f2498d);
    }
}
