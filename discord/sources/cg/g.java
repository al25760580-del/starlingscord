package cg;

import a5.d0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ IBinder f3659e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d0 f3660i;

    public g(d0 d0Var, IBinder iBinder) {
        this.f3659e = iBinder;
        this.f3660i = d0Var;
    }

    @Override // cg.c
    public final void b() {
        qh.d bVar;
        int i7 = qh.c.f18898g;
        IBinder iBinder = this.f3659e;
        if (iBinder == null) {
            bVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.agesignals.protocol.IAgeSignalsService");
            bVar = iInterfaceQueryLocalInterface instanceof qh.d ? (qh.d) iInterfaceQueryLocalInterface : new qh.b(iBinder);
        }
        h hVar = (h) this.f3660i.f177e;
        hVar.f3672m = bVar;
        ArrayList arrayList = hVar.f3665d;
        b bVar2 = hVar.f3663b;
        bVar2.c("linkToDeath", new Object[0]);
        try {
            hVar.f3672m.asBinder().linkToDeath(hVar.j, 0);
        } catch (RemoteException e10) {
            bVar2.b(e10, "linkToDeath failed", new Object[0]);
        }
        hVar.f3668g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        arrayList.clear();
    }
}
