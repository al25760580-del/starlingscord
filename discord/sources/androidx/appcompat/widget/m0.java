package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1031e;

    public /* synthetic */ m0(int i7, Object obj) {
        this.f1030d = i7;
        this.f1031e = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j) {
        Object item;
        switch (this.f1030d) {
            case 0:
                o0 o0Var = (o0) this.f1031e;
                r0 r0Var = o0Var.f1058d0;
                r0Var.setSelection(i7);
                if (r0Var.getOnItemClickListener() != null) {
                    r0Var.performItemClick(view, i7, o0Var.a0.getItemId(i7));
                }
                o0Var.dismiss();
                break;
            case 1:
                ((com.swmansion.rnscreens.c) this.f1031e).n(i7);
                break;
            default:
                nh.t tVar = (nh.t) this.f1031e;
                g2 g2Var = tVar.f16906w;
                if (i7 < 0) {
                    item = !g2Var.W.isShowing() ? null : g2Var.f990i.getSelectedItem();
                } else {
                    item = tVar.getAdapter().getItem(i7);
                }
                tVar.setText(tVar.convertSelectionToString(item), false);
                AdapterView.OnItemClickListener onItemClickListener = tVar.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i7 < 0) {
                        view = !g2Var.W.isShowing() ? null : g2Var.f990i.getSelectedView();
                        i7 = !g2Var.W.isShowing() ? -1 : g2Var.f990i.getSelectedItemPosition();
                        j = !g2Var.W.isShowing() ? Long.MIN_VALUE : g2Var.f990i.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(g2Var.f990i, view, i7, j);
                }
                g2Var.dismiss();
                break;
        }
    }
}
