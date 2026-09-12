package wh;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import ci.u;
import ci.w;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends o {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s f22291i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f22292v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f22293w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ig.g f22294x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.google.android.play.core.integrity.c f22295y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.google.android.play.core.integrity.c cVar, ig.g gVar, s sVar, long j, long j5, ig.g gVar2) {
        super(cVar, gVar);
        this.f22291i = sVar;
        this.f22292v = j;
        this.f22293w = j5;
        this.f22294x = gVar2;
        Objects.requireNonNull(cVar);
        this.f22295y = cVar;
    }

    @Override // ci.c0
    public final void b() {
        s sVar = this.f22291i;
        ig.g gVar = this.f22294x;
        com.google.android.play.core.integrity.c cVar = this.f22295y;
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
            Bundle bundleA = com.google.android.play.core.integrity.c.a(cVar, sVar, this.f22292v, this.f22293w);
            com.google.android.play.core.integrity.b bVar = new com.google.android.play.core.integrity.b(cVar, gVar);
            u uVar = (u) wVar;
            uVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(uVar.f3676h);
            int i7 = ci.s.f3722a;
            parcelObtain.writeInt(1);
            bundleA.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(bVar);
            uVar.k(3, parcelObtain);
        } catch (RemoteException e10) {
            cVar.f6510a.a(e10, "requestExpressIntegrityToken(%s, %s, %s)", sVar.f22304a, sVar.f22305b, Long.valueOf(this.f22292v));
            gVar.c(new b(-100, e10));
        }
    }
}
