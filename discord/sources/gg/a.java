package gg;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import ye.j;
import ye.k;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends af.f implements ye.c {
    public final boolean V;
    public final af.c W;
    public final Bundle X;
    public final Integer Y;

    public a(Context context, Looper looper, af.c cVar, Bundle bundle, j jVar, k kVar) {
        super(context, looper, 44, cVar, jVar, kVar, 0);
        this.V = true;
        this.W = cVar;
        this.X = bundle;
        this.Y = (Integer) cVar.f398x;
    }

    @Override // af.f, ye.c
    public final int g() {
        return 12451000;
    }

    @Override // af.f, ye.c
    public final boolean k() {
        return this.V;
    }

    @Override // af.f
    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new d(iBinder, "com.google.android.gms.signin.internal.ISignInService", 4);
    }

    @Override // af.f
    public final Bundle n() {
        af.c cVar = this.W;
        boolean zEquals = this.f421i.getPackageName().equals((String) cVar.f395i);
        Bundle bundle = this.X;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) cVar.f395i);
        }
        return bundle;
    }

    @Override // af.f
    public final String p() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // af.f
    public final String q() {
        return "com.google.android.gms.signin.service.START";
    }
}
