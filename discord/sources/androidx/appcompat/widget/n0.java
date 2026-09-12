package androidx.appcompat.widget;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0 f1043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o0 f1044e;

    public n0(o0 o0Var, i0 i0Var) {
        this.f1044e = o0Var;
        this.f1043d = i0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f1044e.f1058d0.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f1043d);
        }
    }
}
