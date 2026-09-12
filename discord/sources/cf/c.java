package cf;

import af.f;
import af.l;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import xe.d;
import ze.m;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends f {
    public final l V;

    public c(Context context, Looper looper, af.c cVar, l lVar, m mVar, m mVar2) {
        super(context, looper, 270, cVar, mVar, mVar2, 0);
        this.V = lVar;
    }

    @Override // af.f, ye.c
    public final int g() {
        return 203400000;
    }

    @Override // af.f
    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 4);
    }

    @Override // af.f
    public final d[] m() {
        return wf.b.f22225b;
    }

    @Override // af.f
    public final Bundle n() {
        l lVar = this.V;
        lVar.getClass();
        Bundle bundle = new Bundle();
        String str = lVar.f464d;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // af.f
    public final String p() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // af.f
    public final String q() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // af.f
    public final boolean r() {
        return true;
    }
}
