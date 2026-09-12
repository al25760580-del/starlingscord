package androidx.appcompat.widget;

import android.widget.AbsListView;

/* JADX INFO: loaded from: classes.dex */
public final class e2 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g2 f932a;

    public e2(g2 g2Var) {
        this.f932a = g2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i7, int i10, int i11) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i7) {
        g2 g2Var = this.f932a;
        c2 c2Var = g2Var.O;
        a0 a0Var = g2Var.W;
        if (i7 != 1 || a0Var.getInputMethodMode() == 2 || a0Var.getContentView() == null) {
            return;
        }
        g2Var.S.removeCallbacks(c2Var);
        c2Var.run();
    }
}
