package cg;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import e4.l;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3653e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ig.g f3654i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3655v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f3656w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, ig.g gVar, ig.g gVar2, Object obj2, int i7) {
        super(gVar);
        this.f3653e = i7;
        this.f3654i = gVar2;
        this.f3655v = obj2;
        this.f3656w = obj;
    }

    @Override // cg.c
    public void a(Exception exc) {
        switch (this.f3653e) {
            case 1:
                if (!(exc instanceof i)) {
                    super.a(exc);
                } else {
                    super.a(new ph.a(-5, 0));
                }
                break;
            case 2:
                if (!(exc instanceof i)) {
                    super.a(exc);
                } else {
                    super.a(new ph.a(-5, 0));
                }
                break;
            default:
                super.a(exc);
                break;
        }
    }

    @Override // cg.c
    public final void b() {
        switch (this.f3653e) {
            case 0:
                h hVar = (h) this.f3656w;
                synchronized (hVar.f3667f) {
                    try {
                        ig.g gVar = this.f3654i;
                        hVar.f3666e.add(gVar);
                        gVar.f11763a.addOnCompleteListener(new l(3, hVar, gVar));
                        if (hVar.k.getAndIncrement() > 0) {
                            hVar.f3663b.c("Already connected to the service.", new Object[0]);
                        }
                        h.b(hVar, (c) this.f3655v);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            case 1:
                ig.g gVar2 = this.f3654i;
                try {
                    ph.g gVar3 = (ph.g) this.f3656w;
                    qh.d dVar = gVar3.f18043c.f3672m;
                    String packageName = gVar3.f18042b.getPackageName();
                    Bundle bundle = new Bundle();
                    bundle.putInt("playcore.version.code", 4);
                    ph.f fVar = new ph.f(gVar3, gVar2);
                    qh.b bVar = (qh.b) dVar;
                    bVar.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.play.agesignals.protocol.IAgeSignalsService");
                    parcelObtain.writeString(packageName);
                    int i7 = a.f3648a;
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeStrongBinder(fVar);
                    try {
                        bVar.f18897f.transact(1, parcelObtain, null, 1);
                        return;
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (RemoteException e10) {
                    ph.g.f18040d.b(e10, "checkAgeSignals(%s)", (kh.f) this.f3655v);
                    gVar2.c(new ph.a(-100, 0));
                    return;
                }
            default:
                ig.g gVar4 = this.f3654i;
                try {
                    ph.g gVar5 = (ph.g) this.f3656w;
                    qh.d dVar2 = gVar5.f18043c.f3672m;
                    String packageName2 = gVar5.f18042b.getPackageName();
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("playcore.version.code", 4);
                    ph.e eVar = new ph.e(gVar5, gVar4, ((ph.h) this.f3655v).f18044a);
                    qh.b bVar2 = (qh.b) dVar2;
                    bVar2.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.play.agesignals.protocol.IAgeSignalsService");
                    parcelObtain2.writeString(packageName2);
                    int i10 = a.f3648a;
                    parcelObtain2.writeInt(1);
                    bundle2.writeToParcel(parcelObtain2, 0);
                    parcelObtain2.writeStrongBinder(eVar);
                    try {
                        bVar2.f18897f.transact(2, parcelObtain2, null, 1);
                        return;
                    } finally {
                        parcelObtain2.recycle();
                    }
                } catch (RemoteException e11) {
                    ph.g.f18040d.b(e11, "requestAgeSignalsAccess failed.", new Object[0]);
                    gVar4.c(new ph.a(-100, 0));
                    return;
                }
        }
    }
}
