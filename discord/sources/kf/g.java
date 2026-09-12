package kf;

import android.os.Parcel;
import ze.i;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f14429d = new g();

    @Override // ze.i
    public final void accept(Object obj, Object obj2) {
        f fVar = new f((ig.g) obj2);
        a aVar = (a) ((c) ((e) obj).o());
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.deviceperformance.internal.IDevicePerformanceService");
        int i7 = zf.a.f23985a;
        parcelObtain.writeStrongBinder(fVar);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            aVar.f14425f.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }
}
