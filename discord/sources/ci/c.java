package ci;

import android.os.RemoteException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3681e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3682i;

    public c(a5.d0 d0Var) {
        this.f3682i = d0Var;
    }

    @Override // ci.c0
    public final void b() {
        switch (this.f3681e) {
            case 0:
                d dVar = (d) ((a5.d0) this.f3682i).f177e;
                dVar.f3686b.b("unlinkToDeath", new Object[0]);
                dVar.f3696n.asBinder().unlinkToDeath(dVar.k, 0);
                dVar.f3696n = null;
                dVar.f3691g = false;
                return;
            default:
                d dVar2 = (d) this.f3682i;
                synchronized (dVar2.f3690f) {
                    try {
                        if (dVar2.f3694l.get() > 0 && dVar2.f3694l.decrementAndGet() > 0) {
                            dVar2.f3686b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        if (dVar2.f3696n != null) {
                            dVar2.f3686b.b("Unbind from service.", new Object[0]);
                            dVar2.f3685a.unbindService(dVar2.f3695m);
                            dVar2.f3691g = false;
                            dVar2.f3696n = null;
                            dVar2.f3695m = null;
                        }
                        HashSet hashSet = dVar2.f3689e;
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ((ig.g) it.next()).c(new RemoteException(String.valueOf(dVar2.f3687c).concat(" : Binder has died.")));
                        }
                        hashSet.clear();
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
        }
    }

    public c(d dVar) {
        Objects.requireNonNull(dVar);
        this.f3682i = dVar;
    }
}
