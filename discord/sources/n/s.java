package n;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class s implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f16201d;

    public s(t tVar) {
        this.f16201d = tVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f16201d.c();
    }
}
