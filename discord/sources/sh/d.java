package sh;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.discord.js_watchdog.SharedPreferencesKey;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends th.o {
    public final /* synthetic */ m E;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19998e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f19999i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f20000v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f20001w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f20002x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ig.g f20003y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(m mVar, ig.g gVar, int i7, String str, String str2, int i10, ig.g gVar2, int i11) {
        super(gVar);
        this.f19998e = i11;
        this.f19999i = i7;
        this.f20000v = str;
        this.f20001w = str2;
        this.f20002x = i10;
        this.f20003y = gVar2;
        this.E = mVar;
    }

    @Override // th.o
    public final void a() {
        int i7 = this.f19998e;
        m mVar = this.E;
        int i10 = this.f19999i;
        String str = this.f20000v;
        String str2 = this.f20001w;
        int i11 = this.f20002x;
        ig.g gVar = this.f20003y;
        switch (i7) {
            case 0:
                try {
                    th.k kVar = mVar.f20099d.f20798m;
                    String str3 = mVar.f20096a;
                    Bundle bundle = new Bundle();
                    bundle.putInt(SharedPreferencesKey.SESSION_ID, i10);
                    bundle.putString("module_name", str);
                    bundle.putString("slice_id", str2);
                    bundle.putInt("chunk_number", i11);
                    Bundle bundleH = m.h();
                    i iVar = new i(mVar, gVar, 2);
                    th.i iVar2 = (th.i) kVar;
                    Parcel parcelJ = iVar2.j();
                    parcelJ.writeString(str3);
                    int i12 = th.h.f20776a;
                    parcelJ.writeInt(1);
                    bundle.writeToParcel(parcelJ, 0);
                    parcelJ.writeInt(1);
                    bundleH.writeToParcel(parcelJ, 0);
                    parcelJ.writeStrongBinder(iVar);
                    iVar2.k(6, parcelJ);
                } catch (RemoteException e10) {
                    m.f20094g.c(e10, "notifyChunkTransferred", new Object[0]);
                }
                break;
            default:
                try {
                    th.k kVar2 = mVar.f20099d.f20798m;
                    String str4 = mVar.f20096a;
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(SharedPreferencesKey.SESSION_ID, i10);
                    bundle2.putString("module_name", str);
                    bundle2.putString("slice_id", str2);
                    bundle2.putInt("chunk_number", i11);
                    Bundle bundleH2 = m.h();
                    i iVar3 = new i(mVar, gVar, 1);
                    th.i iVar4 = (th.i) kVar2;
                    Parcel parcelJ2 = iVar4.j();
                    parcelJ2.writeString(str4);
                    int i13 = th.h.f20776a;
                    parcelJ2.writeInt(1);
                    bundle2.writeToParcel(parcelJ2, 0);
                    parcelJ2.writeInt(1);
                    bundleH2.writeToParcel(parcelJ2, 0);
                    parcelJ2.writeStrongBinder(iVar3);
                    iVar4.k(11, parcelJ2);
                } catch (RemoteException e11) {
                    m.f20094g.b("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i11), Integer.valueOf(i10));
                    gVar.c(new RuntimeException(e11));
                    return;
                }
                break;
        }
    }
}
