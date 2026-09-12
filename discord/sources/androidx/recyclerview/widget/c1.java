package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class c1 implements RecyclerView.ItemAnimator.ItemAnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2589a;

    public c1(RecyclerView recyclerView) {
        this.f2589a = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener
    public final void a(RecyclerView.ViewHolder viewHolder) {
        viewHolder.setIsRecyclable(true);
        if (viewHolder.mShadowedHolder != null && viewHolder.mShadowingHolder == null) {
            viewHolder.mShadowedHolder = null;
        }
        viewHolder.mShadowingHolder = null;
        if (viewHolder.shouldBeKeptAsChild()) {
            return;
        }
        View view = viewHolder.itemView;
        RecyclerView recyclerView = this.f2589a;
        if (recyclerView.removeAnimatingView(view) || !viewHolder.isTmpDetached()) {
            return;
        }
        recyclerView.removeDetachedView(viewHolder.itemView, false);
    }
}
