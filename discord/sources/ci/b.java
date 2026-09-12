package ci;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3677e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3678i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3679v;

    public b(a5.d0 d0Var, IBinder iBinder) {
        this.f3678i = iBinder;
        this.f3679v = d0Var;
    }

    @Override // ci.c0
    public final void b() {
        switch (this.f3677e) {
            case 0:
                d dVar = (d) ((a5.d0) this.f3679v).f177e;
                e0 e0Var = dVar.f3693i;
                ArrayList arrayList = dVar.f3688d;
                dVar.f3696n = (IInterface) e0Var.h((IBinder) this.f3678i);
                b0 b0Var = dVar.f3686b;
                b0Var.b("linkToDeath", new Object[0]);
                try {
                    dVar.f3696n.asBinder().linkToDeath(dVar.k, 0);
                } catch (RemoteException e10) {
                    b0Var.a(e10, "linkToDeath failed", new Object[0]);
                }
                dVar.f3691g = false;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                arrayList.clear();
                break;
            default:
                ((com.google.android.play.core.integrity.c) this.f3679v).f6512c.d(Integer.valueOf(f.a((Context) this.f3678i)));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.google.android.play.core.integrity.c cVar, ig.g gVar, Context context) {
        super(gVar);
        this.f3678i = context;
        this.f3679v = cVar;
    }
}
