package sh;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends th.o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20038e = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f20039i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f20040v;

    public g(a5.d0 d0Var, IBinder iBinder) {
        this.f20039i = iBinder;
        this.f20040v = d0Var;
    }

    @Override // th.o
    public final void a() {
        th.k iVar;
        int i7 = this.f20038e;
        Object obj = this.f20039i;
        Object obj2 = this.f20040v;
        switch (i7) {
            case 0:
                m mVar = (m) obj2;
                try {
                    th.k kVar = mVar.f20100e.f20798m;
                    String str = mVar.f20096a;
                    Bundle bundleH = m.h();
                    j jVar = new j(mVar, (ig.g) obj, 1);
                    th.i iVar2 = (th.i) kVar;
                    Parcel parcelJ = iVar2.j();
                    parcelJ.writeString(str);
                    int i10 = th.h.f20776a;
                    parcelJ.writeInt(1);
                    bundleH.writeToParcel(parcelJ, 0);
                    parcelJ.writeStrongBinder(jVar);
                    iVar2.k(10, parcelJ);
                } catch (RemoteException e10) {
                    m.f20094g.c(e10, "keepAlive", new Object[0]);
                    return;
                }
                break;
            default:
                th.q qVar = (th.q) ((a5.d0) obj2).f177e;
                IBinder iBinder = (IBinder) obj;
                int i11 = th.j.f20777g;
                if (iBinder == null) {
                    iVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
                    iVar = iInterfaceQueryLocalInterface instanceof th.k ? (th.k) iInterfaceQueryLocalInterface : new th.i(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService", 2);
                }
                qVar.f20798m = iVar;
                a5.o oVar = qVar.f20789b;
                oVar.d("linkToDeath", new Object[0]);
                try {
                    qVar.f20798m.asBinder().linkToDeath(qVar.j, 0);
                } catch (RemoteException e11) {
                    oVar.c(e11, "linkToDeath failed", new Object[0]);
                }
                qVar.f20794g = false;
                Iterator it = qVar.f20791d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                qVar.f20791d.clear();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, ig.g gVar, ig.g gVar2) {
        super(gVar);
        this.f20039i = gVar2;
        this.f20040v = mVar;
    }
}
