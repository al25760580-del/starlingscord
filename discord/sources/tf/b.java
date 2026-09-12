package tf;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements d, IInterface {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IBinder f20739f;

    public b(IBinder iBinder) {
        this.f20739f = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f20739f;
    }

    public final Parcel j(int i7, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f20739f.transact(i7, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } catch (Throwable th2) {
            parcel.recycle();
            throw th2;
        }
    }
}
