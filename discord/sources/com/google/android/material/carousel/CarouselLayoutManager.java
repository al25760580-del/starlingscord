package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i1;
import com.discord.R;
import com.discord.channel_spine.a;
import ug.b;
import ug.c;
import ug.d;
import ug.e;
import ug.h;

/* JADX INFO: loaded from: classes3.dex */
public class CarouselLayoutManager extends RecyclerView.LayoutManager implements i1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f6317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f6318e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View.OnLayoutChangeListener f6319i;

    public CarouselLayoutManager() {
        h hVar = new h();
        new b();
        this.f6319i = new a(5, this);
        this.f6317d = hVar;
        requestLayout();
        setOrientation(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return !e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollExtent(RecyclerView.State state) {
        getChildCount();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollOffset(RecyclerView.State state) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollRange(RecyclerView.State state) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.i1
    public final PointF computeScrollVectorForPosition(int i7) {
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollExtent(RecyclerView.State state) {
        getChildCount();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollOffset(RecyclerView.State state) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollRange(RecyclerView.State state) {
        return 0;
    }

    public final float d(float f2, float f7) {
        return f() ? f2 - f7 : f2 + f7;
    }

    public final boolean e() {
        return this.f6318e.f21130a == 0;
    }

    public final boolean f() {
        return e() && getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void getDecoratedBoundsWithMargins(View view, Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        rect.centerY();
        if (e()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void measureChildWithMargins(View view, int i7, int i10) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        Context context = recyclerView.getContext();
        h hVar = this.f6317d;
        float dimension = hVar.f21131a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        hVar.f21131a = dimension;
        float dimension2 = hVar.f21132b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        hVar.f21132b = dimension2;
        requestLayout();
        recyclerView.addOnLayoutChangeListener(this.f6319i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        recyclerView.removeOnLayoutChangeListener(this.f6319i);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX WARN: Code duplicated, block: B:24:0x003a  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final View onFocusSearchFailed(View view, int i7, RecyclerView.Recycler recycler, RecyclerView.State state) {
        byte b10;
        if (getChildCount() == 0) {
            return null;
        }
        int i10 = this.f6318e.f21130a;
        if (i7 == 1) {
            b10 = -1;
        } else if (i7 == 2) {
            b10 = 1;
        } else if (i7 != 17) {
            if (i7 != 33) {
                if (i7 != 66) {
                    if (i7 != 130) {
                        kk.b.q(i7, "Unknown focus request:", "CarouselLayoutManager");
                    } else if (i10 == 1) {
                        b10 = 1;
                    }
                    b10 = -2147483648;
                } else if (i10 != 0) {
                    b10 = -2147483648;
                } else if (f()) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
            } else if (i10 == 1) {
                b10 = -1;
            } else {
                b10 = -2147483648;
            }
        } else if (i10 != 0) {
            b10 = -2147483648;
        } else if (f()) {
            b10 = 1;
        } else {
            b10 = -1;
        }
        if (b10 == -2147483648) {
            return null;
        }
        if (b10 == -1) {
            if (getPosition(view) == 0) {
                return null;
            }
            int position = getPosition(getChildAt(0)) - 1;
            if (position < 0 || position >= getItemCount()) {
                return getChildAt(f() ? getChildCount() - 1 : 0);
            }
            this.f6318e.d();
            throw null;
        }
        if (getPosition(view) == getItemCount() - 1) {
            return null;
        }
        int position2 = getPosition(getChildAt(getChildCount() - 1)) + 1;
        if (position2 < 0 || position2 >= getItemCount()) {
            return getChildAt(f() ? 0 : getChildCount() - 1);
        }
        this.f6318e.d();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsAdded(RecyclerView recyclerView, int i7, int i10) {
        super.onItemsAdded(recyclerView, i7, i10);
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsChanged(RecyclerView recyclerView) {
        super.onItemsChanged(recyclerView);
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsRemoved(RecyclerView recyclerView, int i7, int i10) {
        super.onItemsRemoved(recyclerView, i7, i10);
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.b() > 0) {
            if ((e() ? getWidth() : getHeight()) > 0.0f) {
                f();
                measureChildWithMargins(recycler.e(0), 0, 0);
                throw null;
            }
        }
        removeAndRecycleAllViews(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        if (getChildCount() == 0) {
            return;
        }
        getPosition(getChildAt(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z5, boolean z6) {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i7, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!e() || getChildCount() == 0 || i7 == 0) {
            return 0;
        }
        measureChildWithMargins(recycler.e(0), 0, 0);
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i7) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i7, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!canScrollVertically() || getChildCount() == 0 || i7 == 0) {
            return 0;
        }
        measureChildWithMargins(recycler.e(0), 0, 0);
        throw null;
    }

    public final void setOrientation(int i7) {
        e dVar;
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException(kk.b.h(i7, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        e eVar = this.f6318e;
        if (eVar == null || i7 != eVar.f21130a) {
            if (i7 == 0) {
                dVar = new d(this);
            } else {
                if (i7 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                dVar = new c(this);
            }
            this.f6318e = dVar;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i7) {
        ug.a aVar = new ug.a(recyclerView.getContext());
        aVar.setTargetPosition(i7);
        startSmoothScroll(aVar);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i7, int i10) {
        new b();
        this.f6319i = new a(5, this);
        this.f6317d = new h();
        requestLayout();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kg.a.f14436g);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            requestLayout();
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
