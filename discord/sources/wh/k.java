package wh;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import ci.u;
import ci.w;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends o {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f22288i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ig.g f22289v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.google.android.play.core.integrity.c f22290w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.google.android.play.core.integrity.c cVar, ig.g gVar, long j, ig.g gVar2) {
        super(cVar, gVar);
        this.f22288i = j;
        this.f22289v = gVar2;
        Objects.requireNonNull(cVar);
        this.f22290w = cVar;
    }

    @Override // ci.c0
    public final void b() {
        ig.g gVar = this.f22289v;
        long j = this.f22288i;
        com.google.android.play.core.integrity.c cVar = this.f22290w;
        if (com.google.android.play.core.integrity.c.d(cVar)) {
            a(new b(-2, null));
            return;
        }
        if (com.google.android.play.core.integrity.c.c(cVar)) {
            a(new b(-14, null));
            return;
        }
        try {
            w wVar = (w) cVar.f6514e.f3696n;
            Bundle bundleB = com.google.android.play.core.integrity.c.b(cVar, j);
            n nVar = new n(cVar, gVar);
            u uVar = (u) wVar;
            uVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(uVar.f3676h);
            int i7 = ci.s.f3722a;
            parcelObtain.writeInt(1);
            bundleB.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(nVar);
            uVar.k(2, parcelObtain);
        } catch (RemoteException e10) {
            cVar.f6510a.a(e10, "warmUpIntegrityToken(%s)", Long.valueOf(j));
            gVar.c(new b(-100, e10));
        }
    }
}
