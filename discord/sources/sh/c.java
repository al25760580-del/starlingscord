package sh;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends th.o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19991e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ig.g f19992i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f19993v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f19994w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(m mVar, ig.g gVar, Object obj, ig.g gVar2, int i7) {
        super(gVar);
        this.f19991e = i7;
        this.f19994w = obj;
        this.f19992i = gVar2;
        this.f19993v = mVar;
    }

    @Override // th.o
    public final void a() {
        int i7 = 0;
        switch (this.f19991e) {
            case 0:
                m mVar = (m) this.f19993v;
                List list = (List) this.f19994w;
                ArrayList arrayListL = m.l(list);
                try {
                    th.k kVar = mVar.f20099d.f20798m;
                    String str = mVar.f20096a;
                    Bundle bundleH = m.h();
                    i iVar = new i(mVar, this.f19992i, 0);
                    th.i iVar2 = (th.i) kVar;
                    Parcel parcelJ = iVar2.j();
                    parcelJ.writeString(str);
                    parcelJ.writeTypedList(arrayListL);
                    int i10 = th.h.f20776a;
                    parcelJ.writeInt(1);
                    bundleH.writeToParcel(parcelJ, 0);
                    parcelJ.writeStrongBinder(iVar);
                    iVar2.k(14, parcelJ);
                    return;
                } catch (RemoteException e10) {
                    m.f20094g.c(e10, "cancelDownloads(%s)", list);
                    return;
                }
            case 1:
                ig.g gVar = this.f19992i;
                m mVar2 = (m) this.f19993v;
                try {
                    th.k kVar2 = mVar2.f20099d.f20798m;
                    String str2 = mVar2.f20096a;
                    Bundle bundleK = m.k((HashMap) this.f19994w);
                    j jVar = new j(mVar2, gVar, i7);
                    th.i iVar3 = (th.i) kVar2;
                    Parcel parcelJ2 = iVar3.j();
                    parcelJ2.writeString(str2);
                    int i11 = th.h.f20776a;
                    parcelJ2.writeInt(1);
                    bundleK.writeToParcel(parcelJ2, 0);
                    parcelJ2.writeStrongBinder(jVar);
                    iVar3.k(5, parcelJ2);
                    return;
                } catch (RemoteException e11) {
                    m.f20094g.c(e11, "syncPacks", new Object[0]);
                    gVar.c(new RuntimeException(e11));
                    return;
                }
            default:
                synchronized (((th.q) this.f19993v).f20793f) {
                    try {
                        th.q qVar = (th.q) this.f19993v;
                        ig.g gVar2 = this.f19992i;
                        qVar.f20792e.add(gVar2);
                        gVar2.f11763a.addOnCompleteListener(new e4.l(20, qVar, gVar2));
                        if (((th.q) this.f19993v).k.getAndIncrement() > 0) {
                            ((th.q) this.f19993v).f20789b.d("Already connected to the service.", new Object[0]);
                        }
                        th.q.b((th.q) this.f19993v, (th.o) this.f19994w);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(th.q qVar, ig.g gVar, ig.g gVar2, th.o oVar) {
        super(gVar);
        this.f19991e = 2;
        this.f19992i = gVar2;
        this.f19994w = oVar;
        this.f19993v = qVar;
    }
}
