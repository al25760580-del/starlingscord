package ag;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class s1 implements IInterface {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IBinder f577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f578g;

    public s1(IBinder iBinder, String str) {
        this.f577f = iBinder;
        this.f578g = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f577f;
    }

    public final void j(int i7, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f577f.transact(i7, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
