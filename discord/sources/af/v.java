package af;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements IInterface {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IBinder f491f;

    public v(IBinder iBinder) {
        this.f491f = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f491f;
    }

    public final void j(a0 a0Var, e eVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(a0Var);
            parcelObtain.writeInt(1);
            m.a(eVar, parcelObtain, 0);
            this.f491f.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
