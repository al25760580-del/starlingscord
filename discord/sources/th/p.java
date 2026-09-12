package th;

import a5.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20785e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f20786i;

    public /* synthetic */ p(int i7, Object obj) {
        this.f20785e = i7;
        this.f20786i = obj;
    }

    @Override // th.o
    public final void a() {
        switch (this.f20785e) {
            case 0:
                synchronized (((q) this.f20786i).f20793f) {
                    try {
                        if (((q) this.f20786i).k.get() > 0 && ((q) this.f20786i).k.decrementAndGet() > 0) {
                            ((q) this.f20786i).f20789b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        q qVar = (q) this.f20786i;
                        if (qVar.f20798m != null) {
                            qVar.f20789b.d("Unbind from service.", new Object[0]);
                            q qVar2 = (q) this.f20786i;
                            qVar2.f20788a.unbindService(qVar2.f20797l);
                            q qVar3 = (q) this.f20786i;
                            qVar3.f20794g = false;
                            qVar3.f20798m = null;
                            qVar3.f20797l = null;
                        }
                        ((q) this.f20786i).e();
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            default:
                q qVar4 = (q) ((d0) this.f20786i).f177e;
                qVar4.f20789b.d("unlinkToDeath", new Object[0]);
                qVar4.f20798m.asBinder().unlinkToDeath(qVar4.j, 0);
                qVar4.f20798m = null;
                qVar4.f20794g = false;
                return;
        }
    }
}
