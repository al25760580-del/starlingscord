package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class x0 implements ViewInfoStore.ProcessCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2722a;

    public x0(RecyclerView recyclerView) {
        this.f2722a = recyclerView;
    }

    @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
    public final void a(RecyclerView.ViewHolder viewHolder) {
        RecyclerView recyclerView = this.f2722a;
        recyclerView.mLayout.removeAndRecycleView(viewHolder.itemView, recyclerView.mRecycler);
    }

    @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
    public final void b(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        this.f2722a.animateAppearance(viewHolder, itemHolderInfo, itemHolderInfo2);
    }

    @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
    public final void c(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        RecyclerView recyclerView = this.f2722a;
        recyclerView.mRecycler.n(viewHolder);
        recyclerView.animateDisappearance(viewHolder, itemHolderInfo, itemHolderInfo2);
    }

    @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
    public final void d(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        viewHolder.setIsRecyclable(false);
        RecyclerView recyclerView = this.f2722a;
        if (recyclerView.mDataSetHasChangedAfterLayout) {
            if (recyclerView.mItemAnimator.animateChange(viewHolder, viewHolder, itemHolderInfo, itemHolderInfo2)) {
                recyclerView.postAnimationRunner();
            }
        } else if (recyclerView.mItemAnimator.animatePersistence(viewHolder, itemHolderInfo, itemHolderInfo2)) {
            recyclerView.postAnimationRunner();
        }
    }
}
