package uf;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.discord.chat.presentation.message.view.MediaImageViewKt;
import ze.m;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends af.f {
    public final Bundle V;

    public c(Context context, Looper looper, af.c cVar, m mVar, m mVar2) {
        super(context, looper, MediaImageViewKt.OBSCURED_IMAGE_MIN_HEIGHT, cVar, mVar, mVar2, 0);
        this.V = new Bundle();
    }

    @Override // af.f, ye.c
    public final int g() {
        return 17895000;
    }

    @Override // af.f
    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof i ? (i) iInterfaceQueryLocalInterface : new i(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService", 3);
    }

    @Override // af.f
    public final xe.d[] m() {
        return d.f21123b;
    }

    @Override // af.f
    public final Bundle n() {
        return this.V;
    }

    @Override // af.f
    public final String p() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // af.f
    public final String q() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override // af.f
    public final boolean r() {
        return true;
    }

    @Override // af.f
    public final boolean s() {
        return true;
    }
}
