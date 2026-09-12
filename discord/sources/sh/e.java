package sh;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.discord.js_watchdog.SharedPreferencesKey;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends th.o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20018e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f20019i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ig.g f20020v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f20021w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m f20022x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m mVar, ig.g gVar, int i7, String str, ig.g gVar2, int i10) {
        super(gVar);
        this.f20018e = i7;
        this.f20019i = str;
        this.f20020v = gVar2;
        this.f20021w = i10;
        this.f20022x = mVar;
    }

    @Override // th.o
    public final void a() {
        m mVar = this.f20022x;
        try {
            th.k kVar = mVar.f20099d.f20798m;
            String str = mVar.f20096a;
            int i7 = this.f20018e;
            String str2 = this.f20019i;
            Bundle bundle = new Bundle();
            bundle.putInt(SharedPreferencesKey.SESSION_ID, i7);
            bundle.putString("module_name", str2);
            Bundle bundleH = m.h();
            k kVar2 = new k(mVar, this.f20020v, this.f20018e, this.f20019i, this.f20021w);
            th.i iVar = (th.i) kVar;
            Parcel parcelJ = iVar.j();
            parcelJ.writeString(str);
            int i10 = th.h.f20776a;
            parcelJ.writeInt(1);
            bundle.writeToParcel(parcelJ, 0);
            parcelJ.writeInt(1);
            bundleH.writeToParcel(parcelJ, 0);
            parcelJ.writeStrongBinder(kVar2);
            iVar.k(7, parcelJ);
        } catch (RemoteException e10) {
            m.f20094g.c(e10, "notifyModuleCompleted", new Object[0]);
        }
    }
}
