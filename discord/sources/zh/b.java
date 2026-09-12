package zh;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements d, IInterface {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IBinder f23989f;

    public b(IBinder iBinder) {
        this.f23989f = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f23989f;
    }

    @Override // zh.d
    public final void l(String str, Bundle bundle, yh.e eVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        parcelObtain.writeString(str);
        int i7 = a.f23988a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(eVar);
        try {
            this.f23989f.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
