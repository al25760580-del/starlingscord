package fk;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f9271d;

    public c(a aVar) {
        this.f9271d = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        this.f9271d.invoke(new Object[0]);
        dialogInterface.dismiss();
    }
}
