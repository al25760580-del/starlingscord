package af;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f399g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f400h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(f fVar, int i7, IBinder iBinder, Bundle bundle) {
        super(fVar, i7, bundle);
        this.f400h = fVar;
        this.f399g = iBinder;
    }

    @Override // af.u
    public final boolean a() {
        IBinder iBinder = this.f399g;
        try {
            w.g(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            f fVar = this.f400h;
            if (!fVar.p().equals(interfaceDescriptor)) {
                String strP = fVar.p();
                Log.w("GmsClient", com.discord.chat.presentation.list.a.l(new StringBuilder(strP.length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", strP, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface iInterfaceL = fVar.l(iBinder);
            if (iInterfaceL == null || !(fVar.t(2, 4, iInterfaceL) || fVar.t(3, 4, iInterfaceL))) {
                return false;
            }
            fVar.P = null;
            i iVar = fVar.K;
            if (iVar == null) {
                return true;
            }
            ((ye.j) iVar.f446a).onConnected();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // af.u
    public final void b(xe.b bVar) {
        i iVar = this.f400h.L;
        if (iVar != null) {
            ((ye.k) iVar.f446a).j(bVar);
        }
        System.currentTimeMillis();
    }
}
