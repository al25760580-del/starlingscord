package mf;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends ci.a {
    public final lf.a y(lf.b bVar, int i7, lf.b bVar2) {
        Parcel parcelU = u();
        yf.g.b(parcelU, bVar);
        parcelU.writeString("com.google.android.gms.cronet_dynamite");
        parcelU.writeInt(i7);
        yf.g.b(parcelU, bVar2);
        Parcel parcelT = t(2, parcelU);
        lf.a aVarZ = lf.b.z(parcelT.readStrongBinder());
        parcelT.recycle();
        return aVarZ;
    }

    public final lf.a z(lf.b bVar, int i7, lf.b bVar2) {
        Parcel parcelU = u();
        yf.g.b(parcelU, bVar);
        parcelU.writeString("com.google.android.gms.cronet_dynamite");
        parcelU.writeInt(i7);
        yf.g.b(parcelU, bVar2);
        Parcel parcelT = t(3, parcelU);
        lf.a aVarZ = lf.b.z(parcelT.readStrongBinder());
        parcelT.recycle();
        return aVarZ;
    }
}
