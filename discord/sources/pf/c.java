package pf;

import ag.o;
import ag.r1;
import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import ig.g;
import ls.l;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends Binder implements r1, IInterface {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f18029g;

    public c(g gVar, int i7) {
        this.f18028f = i7;
        this.f18029g = gVar;
        attachInterface(this, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        if (i7 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i7, parcel, parcel2, i10)) {
            return true;
        }
        if (i7 != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i11 = o.f552a;
        Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        PendingIntent pendingIntent = (PendingIntent) (parcel.readInt() != 0 ? (Parcelable) PendingIntent.CREATOR.createFromParcel(parcel) : null);
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(kk.b.h(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        p(statusCreateFromParcel, pendingIntent);
        return true;
    }

    @Override // ag.r1
    public final void p(Status status, PendingIntent pendingIntent) {
        switch (this.f18028f) {
            case 0:
                l.z(status, pendingIntent, this.f18029g);
                break;
            default:
                l.z(status, pendingIntent, this.f18029g);
                break;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
