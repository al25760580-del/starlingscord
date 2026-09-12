package fk;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f9272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f9273e;

    public d(a aVar, n nVar) {
        this.f9272d = aVar;
        this.f9273e = nVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        this.f9272d.invoke(this.f9273e.getDate());
        dialogInterface.dismiss();
    }
}
