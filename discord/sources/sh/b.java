package sh;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends th.o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f19980e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ HashMap f19981i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ig.g f19982v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f19983w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(m mVar, ig.g gVar, ArrayList arrayList, HashMap map, ig.g gVar2) {
        super(gVar);
        this.f19980e = arrayList;
        this.f19981i = map;
        this.f19982v = gVar2;
        this.f19983w = mVar;
    }

    @Override // th.o
    public final void a() {
        ig.g gVar = this.f19982v;
        m mVar = this.f19983w;
        ArrayList arrayList = this.f19980e;
        ArrayList arrayListL = m.l(arrayList);
        try {
            th.k kVar = mVar.f20099d.f20798m;
            String str = mVar.f20096a;
            Bundle bundleK = m.k(this.f19981i);
            l lVar = new l(mVar, gVar, mVar.f20097b, mVar.f20098c);
            th.i iVar = (th.i) kVar;
            Parcel parcelJ = iVar.j();
            parcelJ.writeString(str);
            parcelJ.writeTypedList(arrayListL);
            int i7 = th.h.f20776a;
            parcelJ.writeInt(1);
            bundleK.writeToParcel(parcelJ, 0);
            parcelJ.writeStrongBinder(lVar);
            iVar.k(2, parcelJ);
        } catch (RemoteException e10) {
            m.f20094g.c(e10, "startDownload(%s)", arrayList);
            gVar.c(new RuntimeException(e10));
        }
    }
}
