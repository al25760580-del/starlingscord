package fk;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f9270d;

    public b(a aVar) {
        this.f9270d = aVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f9270d.invoke(new Object[0]);
    }
}
