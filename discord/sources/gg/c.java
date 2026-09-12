package gg;

import android.os.Parcel;
import hi.o;
import ze.v;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends bg.a {
    @Override // bg.a
    public final boolean w(int i7, Parcel parcel, Parcel parcel2) {
        switch (i7) {
            case 3:
                wf.a.b(parcel);
                break;
            case 4:
                wf.a.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                wf.a.b(parcel);
                break;
            case 7:
                wf.a.b(parcel);
                break;
            case 8:
                f fVar = (f) wf.a.a(parcel, f.CREATOR);
                wf.a.b(parcel);
                v vVar = (v) this;
                vVar.f23975h.post(new o(vVar, fVar, 26, false));
                break;
            case 9:
                wf.a.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
