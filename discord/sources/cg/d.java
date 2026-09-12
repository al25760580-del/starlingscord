package cg;

import a5.n;
import android.os.IBinder;
import android.os.RemoteException;
import ci.b0;
import ci.c0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import th.o;
import th.q;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3652b;

    public /* synthetic */ d(int i7, Object obj) {
        this.f3651a = i7;
        this.f3652b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        switch (this.f3651a) {
            case 0:
                h hVar = (h) this.f3652b;
                b bVar = hVar.f3663b;
                bVar.c("reportBinderDeath", new Object[0]);
                if (hVar.f3670i.get() != null) {
                    throw new ClassCastException();
                }
                bVar.c("%s : Binder has died.", hVar.f3664c);
                ArrayList arrayList = hVar.f3665d;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).a(new RemoteException(String.valueOf(hVar.f3664c).concat(" : Binder has died.")));
                }
                arrayList.clear();
                synchronized (hVar.f3667f) {
                    HashSet hashSet = hVar.f3666e;
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        ((ig.g) it2.next()).c(new RemoteException(String.valueOf(hVar.f3664c).concat(" : Binder has died.")));
                    }
                    hashSet.clear();
                    break;
                }
                return;
            case 1:
                ci.d dVar = (ci.d) this.f3652b;
                b0 b0Var = dVar.f3686b;
                b0Var.b("reportBinderDeath", new Object[0]);
                if (dVar.j.get() != null) {
                    throw new ClassCastException();
                }
                b0Var.b("%s : Binder has died.", dVar.f3687c);
                ArrayList arrayList2 = dVar.f3688d;
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ((c0) it3.next()).a(new RemoteException(String.valueOf(dVar.f3687c).concat(" : Binder has died.")));
                }
                arrayList2.clear();
                synchronized (dVar.f3690f) {
                    HashSet hashSet2 = dVar.f3689e;
                    Iterator it4 = hashSet2.iterator();
                    while (it4.hasNext()) {
                        ((ig.g) it4.next()).c(new RemoteException(String.valueOf(dVar.f3687c).concat(" : Binder has died.")));
                    }
                    hashSet2.clear();
                    break;
                }
                return;
            case 2:
                q qVar = (q) this.f3652b;
                qVar.f20789b.d("reportBinderDeath", new Object[0]);
                if (qVar.f20796i.get() != null) {
                    throw new ClassCastException();
                }
                qVar.f20789b.d("%s : Binder has died.", qVar.f20790c);
                for (o oVar : qVar.f20791d) {
                    RemoteException remoteException = new RemoteException(String.valueOf(qVar.f20790c).concat(" : Binder has died."));
                    ig.g gVar = oVar.f20784d;
                    if (gVar != null) {
                        gVar.c(remoteException);
                    }
                }
                qVar.f20791d.clear();
                synchronized (qVar.f20793f) {
                    qVar.e();
                    break;
                }
                return;
            default:
                zh.g gVar2 = (zh.g) this.f3652b;
                String str = gVar2.f23997c;
                n nVar = gVar2.f23996b;
                nVar.a("reportBinderDeath", new Object[0]);
                if (gVar2.f24003i.get() != null) {
                    throw new ClassCastException();
                }
                nVar.a("%s : Binder has died.", str);
                ArrayList<zh.e> arrayList3 = gVar2.f23998d;
                for (zh.e eVar : arrayList3) {
                    RemoteException remoteException2 = new RemoteException(String.valueOf(str).concat(" : Binder has died."));
                    ig.g gVar3 = eVar.f23991d;
                    if (gVar3 != null) {
                        gVar3.c(remoteException2);
                    }
                }
                arrayList3.clear();
                gVar2.b();
                return;
        }
    }
}
