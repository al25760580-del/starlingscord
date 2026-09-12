package qh;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import cg.h;
import ig.g;
import ph.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends bg.a {
    @Override // bg.a
    public final boolean s(int i7, Parcel parcel) {
        if (i7 == 1) {
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) cg.a.a(parcel);
            cg.a.b(parcel);
            ((e) this).z(bundle);
            return true;
        }
        if (i7 != 2) {
            return false;
        }
        Parcelable.Creator creator2 = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) cg.a.a(parcel);
        cg.a.b(parcel);
        e eVar = (e) this;
        h hVar = eVar.j.f18043c;
        g gVar = eVar.f18035h;
        hVar.c(gVar);
        int i10 = bundle2.getInt("error.code");
        eVar.f18034g.a(Integer.valueOf(i10));
        gVar.c(new ph.a(i10, 0));
        return true;
    }
}
