package yh;

import a5.d0;
import a5.n;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.datastore.preferences.protobuf.d1;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends zh.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f23341e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f23342i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f23343v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, ig.g gVar, Object obj2, int i7) {
        super(gVar);
        this.f23341e = i7;
        this.f23343v = obj;
        this.f23342i = obj2;
    }

    @Override // zh.e
    public final void a() {
        zh.d bVar;
        int i7 = this.f23341e;
        Object obj = this.f23342i;
        Object obj2 = this.f23343v;
        switch (i7) {
            case 0:
                ig.g gVar = (ig.g) obj;
                f fVar = (f) obj2;
                try {
                    fVar.f23348a.f24005m.l(fVar.f23349b, g.a(), new e(fVar, gVar));
                } catch (RemoteException e10) {
                    n nVar = f.f23347c;
                    Object[] objArr = {fVar.f23349b};
                    nVar.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", n.b(nVar.f232a, "error requesting in-app review for %s", objArr), e10);
                    }
                    gVar.c(new RuntimeException(e10));
                    return;
                }
                break;
            case 1:
                zh.g gVar2 = (zh.g) obj2;
                d dVar = (d) obj;
                zh.d dVar2 = gVar2.f24005m;
                n nVar2 = gVar2.f23996b;
                ArrayList<zh.e> arrayList = gVar2.f23998d;
                if (dVar2 == null && !gVar2.f24001g) {
                    nVar2.a("Initiate binding to the service.", new Object[0]);
                    arrayList.add(dVar);
                    d0 d0Var = new d0(4, gVar2);
                    gVar2.f24004l = d0Var;
                    gVar2.f24001g = true;
                    if (!gVar2.f23995a.bindService(gVar2.f24002h, d0Var, 1)) {
                        nVar2.a("Failed to bind to the service.", new Object[0]);
                        gVar2.f24001g = false;
                        for (zh.e eVar : arrayList) {
                            d1 d1Var = new d1("Failed to bind to the service.");
                            ig.g gVar3 = eVar.f23991d;
                            if (gVar3 != null) {
                                gVar3.c(d1Var);
                            }
                        }
                        arrayList.clear();
                    }
                } else if (gVar2.f24001g) {
                    nVar2.a("Waiting to bind to the service.", new Object[0]);
                    arrayList.add(dVar);
                } else {
                    dVar.run();
                }
                break;
            default:
                zh.g gVar4 = (zh.g) ((d0) obj2).f177e;
                IBinder iBinder = (IBinder) obj;
                int i10 = zh.c.f23990g;
                if (iBinder == null) {
                    bVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    bVar = iInterfaceQueryLocalInterface instanceof zh.d ? (zh.d) iInterfaceQueryLocalInterface : new zh.b(iBinder);
                }
                gVar4.f24005m = bVar;
                gVar4.f23996b.a("linkToDeath", new Object[0]);
                try {
                    gVar4.f24005m.asBinder().linkToDeath(gVar4.j, 0);
                } catch (RemoteException e11) {
                    n nVar3 = gVar4.f23996b;
                    Object[] objArr2 = new Object[0];
                    nVar3.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", n.b(nVar3.f232a, "linkToDeath failed", objArr2), e11);
                    }
                }
                gVar4.f24001g = false;
                Iterator it = gVar4.f23998d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                gVar4.f23998d.clear();
                break;
        }
    }

    public d(d0 d0Var, IBinder iBinder) {
        this.f23341e = 2;
        this.f23343v = d0Var;
        this.f23342i = iBinder;
    }
}
