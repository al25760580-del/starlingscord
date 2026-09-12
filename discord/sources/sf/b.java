package sf;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements d, IInterface {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IBinder f19940f;

    public b(IBinder iBinder) {
        this.f19940f = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f19940f;
    }

    public final void j(int i7, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f19940f.transact(i7, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
