package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class m1 extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2643a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f2644b;

    public m1(n1 n1Var) {
        this.f2644b = n1Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
        super.onScrollStateChanged(recyclerView, i7);
        if (i7 == 0 && this.f2643a) {
            this.f2643a = false;
            this.f2644b.b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i7, int i10) {
        if (i7 == 0 && i10 == 0) {
            return;
        }
        this.f2643a = true;
    }
}
