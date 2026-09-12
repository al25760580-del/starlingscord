package cg;

import a5.d0;
import android.os.RemoteException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3657e = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3658i;

    public f(d0 d0Var) {
        this.f3658i = d0Var;
    }

    @Override // cg.c
    public final void b() {
        switch (this.f3657e) {
            case 0:
                h hVar = (h) this.f3658i;
                synchronized (hVar.f3667f) {
                    try {
                        if (hVar.k.get() > 0 && hVar.k.decrementAndGet() > 0) {
                            hVar.f3663b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        if (hVar.f3672m != null) {
                            hVar.f3663b.c("Unbind from service.", new Object[0]);
                            hVar.f3662a.unbindService(hVar.f3671l);
                            hVar.f3668g = false;
                            hVar.f3672m = null;
                            hVar.f3671l = null;
                        }
                        HashSet hashSet = hVar.f3666e;
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ((ig.g) it.next()).c(new RemoteException(String.valueOf(hVar.f3664c).concat(" : Binder has died.")));
                        }
                        hashSet.clear();
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            default:
                h hVar2 = (h) ((d0) this.f3658i).f177e;
                hVar2.f3663b.c("unlinkToDeath", new Object[0]);
                hVar2.f3672m.asBinder().unlinkToDeath(hVar2.j, 0);
                hVar2.f3672m = null;
                hVar2.f3668g = false;
                return;
        }
    }

    public f(h hVar) {
        Objects.requireNonNull(hVar);
        this.f3658i = hVar;
    }
}
