package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2730a;

    public z0(RecyclerView recyclerView) {
        this.f2730a = recyclerView;
    }

    public final void a(int i7) {
        RecyclerView recyclerView = this.f2730a;
        View childAt = recyclerView.getChildAt(i7);
        if (childAt != null) {
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i7);
    }
}
