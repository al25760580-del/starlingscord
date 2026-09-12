package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class e1 implements ViewBoundsCheck.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.LayoutManager f2599a;

    public e1(RecyclerView.LayoutManager layoutManager) {
        this.f2599a = layoutManager;
    }

    @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
    public final int a(View view) {
        return this.f2599a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
    }

    @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
    public final int b() {
        return this.f2599a.getPaddingTop();
    }

    @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
    public final int c() {
        RecyclerView.LayoutManager layoutManager = this.f2599a;
        return layoutManager.getHeight() - layoutManager.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
    public final int d(View view) {
        return this.f2599a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
    public final View getChildAt(int i7) {
        return this.f2599a.getChildAt(i7);
    }
}
