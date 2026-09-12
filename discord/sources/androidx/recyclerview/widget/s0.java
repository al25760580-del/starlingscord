package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends OrientationHelper {
    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int b(View view) {
        return this.f2488a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int c(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return this.f2488a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int d(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return this.f2488a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int e(View view) {
        return this.f2488a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int f() {
        return this.f2488a.getHeight();
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int g() {
        RecyclerView.LayoutManager layoutManager = this.f2488a;
        return layoutManager.getHeight() - layoutManager.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int h() {
        return this.f2488a.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int i() {
        return this.f2488a.getHeightMode();
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int j() {
        return this.f2488a.getWidthMode();
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int k() {
        return this.f2488a.getPaddingTop();
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int l() {
        RecyclerView.LayoutManager layoutManager = this.f2488a;
        return (layoutManager.getHeight() - layoutManager.getPaddingTop()) - layoutManager.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int n(View view) {
        RecyclerView.LayoutManager layoutManager = this.f2488a;
        Rect rect = this.f2490c;
        layoutManager.getTransformedBoundingBox(view, true, rect);
        return rect.bottom;
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int o(View view) {
        RecyclerView.LayoutManager layoutManager = this.f2488a;
        Rect rect = this.f2490c;
        layoutManager.getTransformedBoundingBox(view, true, rect);
        return rect.top;
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final void p(int i7) {
        this.f2488a.offsetChildrenVertical(i7);
    }
}
