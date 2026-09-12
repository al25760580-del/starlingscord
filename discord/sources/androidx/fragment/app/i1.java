package androidx.fragment.app;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i1 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f2163d;

    public i1(View view) {
        this.f2163d = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2 = this.f2163d;
        view2.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
        androidx.core.view.j0.c(view2);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
