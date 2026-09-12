package i;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f11142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f11143e;

    public a(b bVar, d dVar) {
        this.f11143e = bVar;
        this.f11142d = dVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j) {
        b bVar = this.f11143e;
        DialogInterface.OnClickListener onClickListener = bVar.f11161p;
        d dVar = this.f11142d;
        onClickListener.onClick(dVar.f11174b, i7);
        if (bVar.f11163r) {
            return;
        }
        dVar.f11174b.dismiss();
    }
}
