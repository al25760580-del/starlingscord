package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class e extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.s1 f2598d;

    public e(androidx.fragment.app.s1 s1Var) {
        this.f2598d = s1Var;
    }

    @Override // androidx.recyclerview.widget.c
    public final boolean areContentsTheSame(int i7, int i10) {
        androidx.fragment.app.s1 s1Var = this.f2598d;
        Object obj = s1Var.f2247i.get(i7);
        Object obj2 = s1Var.f2248v.get(i10);
        if (obj != null && obj2 != null) {
            return ((v) ((AsyncListDiffer) s1Var.f2250x).f2439b.f2591b).areContentsTheSame(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    @Override // androidx.recyclerview.widget.c
    public final boolean areItemsTheSame(int i7, int i10) {
        androidx.fragment.app.s1 s1Var = this.f2598d;
        Object obj = s1Var.f2247i.get(i7);
        Object obj2 = s1Var.f2248v.get(i10);
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        return ((v) ((AsyncListDiffer) s1Var.f2250x).f2439b.f2591b).areItemsTheSame(obj, obj2);
    }

    @Override // androidx.recyclerview.widget.c
    public final Object getChangePayload(int i7, int i10) {
        androidx.fragment.app.s1 s1Var = this.f2598d;
        Object obj = s1Var.f2247i.get(i7);
        Object obj2 = s1Var.f2248v.get(i10);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
        return ((v) ((AsyncListDiffer) s1Var.f2250x).f2439b.f2591b).getChangePayload(obj, obj2);
    }

    @Override // androidx.recyclerview.widget.c
    public final int getNewListSize() {
        return this.f2598d.f2248v.size();
    }

    @Override // androidx.recyclerview.widget.c
    public final int getOldListSize() {
        return this.f2598d.f2247i.size();
    }
}
