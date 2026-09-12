package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class w0 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2717d;

    public w0(RecyclerView recyclerView) {
        this.f2717d = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.f2717d;
        RecyclerView.ItemAnimator itemAnimator = recyclerView.mItemAnimator;
        if (itemAnimator != null) {
            itemAnimator.runPendingAnimations();
        }
        recyclerView.mPostedAnimatorRunner = false;
    }
}
