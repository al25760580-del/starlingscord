package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class d1 implements ViewBoundsCheck.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.LayoutManager f2597a;

    public d1(RecyclerView.LayoutManager layoutManager) {
        this.f2597a = layoutManager;
    }

    @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
    public final int a(View view) {
        return this.f2597a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
    }

    @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
    public final int b() {
        return this.f2597a.getPaddingLeft();
    }

    @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
    public final int c() {
        RecyclerView.LayoutManager layoutManager = this.f2597a;
        return layoutManager.getWidth() - layoutManager.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
    public final int d(View view) {
        return this.f2597a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
    }

    @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
    public final View getChildAt(int i7) {
        return this.f2597a.getChildAt(i7);
    }
}
