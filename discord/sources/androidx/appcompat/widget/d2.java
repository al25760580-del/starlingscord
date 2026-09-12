package androidx.appcompat.widget;

import android.database.DataSetObserver;

/* JADX INFO: loaded from: classes.dex */
public final class d2 extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f930b;

    public /* synthetic */ d2(int i7, Object obj) {
        this.f929a = i7;
        this.f930b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f929a) {
            case 0:
                g2 g2Var = (g2) this.f930b;
                if (g2Var.W.isShowing()) {
                    g2Var.show();
                }
                break;
            default:
                h3 h3Var = (h3) this.f930b;
                h3Var.f3047d = true;
                h3Var.notifyDataSetChanged();
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f929a) {
            case 0:
                ((g2) this.f930b).dismiss();
                break;
            default:
                h3 h3Var = (h3) this.f930b;
                h3Var.f3047d = false;
                h3Var.notifyDataSetInvalidated();
                break;
        }
    }
}
