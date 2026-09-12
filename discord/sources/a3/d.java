package a3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class d implements IInterface {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public IBinder f66f;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f66f;
    }

    public final void j(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            parcelObtain.writeStringArray(strArr);
            this.f66f.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
