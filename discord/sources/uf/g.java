package uf;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import ze.m;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends af.f {
    public final qe.b V;

    public g(Context context, Looper looper, af.c cVar, qe.b bVar, m mVar, m mVar2) {
        super(context, looper, 68, cVar, mVar, mVar2, 0);
        bVar = bVar == null ? qe.b.f18786i : bVar;
        e4.c cVar2 = new e4.c(17, false);
        cVar2.f7966e = Boolean.FALSE;
        qe.b bVar2 = qe.b.f18786i;
        bVar.getClass();
        cVar2.f7966e = Boolean.valueOf(bVar.f18787d);
        cVar2.f7967i = bVar.f18788e;
        cVar2.f7967i = e.a();
        this.V = new qe.b(cVar2);
    }

    @Override // af.f, ye.c
    public final int g() {
        return 12800000;
    }

    @Override // af.f
    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new h(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 3);
    }

    @Override // af.f
    public final Bundle n() {
        qe.b bVar = this.V;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", bVar.f18787d);
        bundle.putString("log_session_id", bVar.f18788e);
        return bundle;
    }

    @Override // af.f
    public final String p() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // af.f
    public final String q() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
