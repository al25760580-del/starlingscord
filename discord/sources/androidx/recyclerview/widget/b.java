package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView.Adapter f2560a;

    public b(RecyclerView.Adapter adapter) {
        this.f2560a = adapter;
    }

    @Override // androidx.recyclerview.widget.p0
    public final void a(int i7, int i10) {
        this.f2560a.notifyItemMoved(i7, i10);
    }

    @Override // androidx.recyclerview.widget.p0
    public final void b(int i7, int i10) {
        this.f2560a.notifyItemRangeInserted(i7, i10);
    }

    @Override // androidx.recyclerview.widget.p0
    public final void c(int i7, int i10) {
        this.f2560a.notifyItemRangeRemoved(i7, i10);
    }

    @Override // androidx.recyclerview.widget.p0
    public final void d(int i7, int i10, Object obj) {
        this.f2560a.notifyItemRangeChanged(i7, i10, obj);
    }
}
