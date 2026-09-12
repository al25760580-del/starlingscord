package sh;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.discord.js_watchdog.SharedPreferencesKey;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends th.o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20032e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ig.g f20033i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ m f20034v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(m mVar, ig.g gVar, int i7, ig.g gVar2) {
        super(gVar);
        this.f20032e = i7;
        this.f20033i = gVar2;
        this.f20034v = mVar;
    }

    @Override // th.o
    public final void a() {
        m mVar = this.f20034v;
        try {
            th.k kVar = mVar.f20099d.f20798m;
            String str = mVar.f20096a;
            int i7 = this.f20032e;
            Bundle bundle = new Bundle();
            bundle.putInt(SharedPreferencesKey.SESSION_ID, i7);
            Bundle bundleH = m.h();
            i iVar = new i(mVar, this.f20033i, 3);
            th.i iVar2 = (th.i) kVar;
            Parcel parcelJ = iVar2.j();
            parcelJ.writeString(str);
            int i10 = th.h.f20776a;
            parcelJ.writeInt(1);
            bundle.writeToParcel(parcelJ, 0);
            parcelJ.writeInt(1);
            bundleH.writeToParcel(parcelJ, 0);
            parcelJ.writeStrongBinder(iVar);
            iVar2.k(9, parcelJ);
        } catch (RemoteException e10) {
            m.f20094g.c(e10, "notifySessionFailed", new Object[0]);
        }
    }
}
