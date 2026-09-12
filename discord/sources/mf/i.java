package mf;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends ci.a {
    public final lf.a A(lf.b bVar, boolean z5, long j) {
        Parcel parcelU = u();
        yf.g.b(parcelU, bVar);
        parcelU.writeString("com.google.android.gms.cronet_dynamite");
        parcelU.writeInt(z5 ? 1 : 0);
        parcelU.writeLong(j);
        Parcel parcelT = t(7, parcelU);
        lf.a aVarZ = lf.b.z(parcelT.readStrongBinder());
        parcelT.recycle();
        return aVarZ;
    }

    public final lf.a B(lf.b bVar, int i7, lf.b bVar2) {
        Parcel parcelU = u();
        yf.g.b(parcelU, bVar);
        parcelU.writeString("com.google.android.gms.cronet_dynamite");
        parcelU.writeInt(i7);
        yf.g.b(parcelU, bVar2);
        Parcel parcelT = t(8, parcelU);
        lf.a aVarZ = lf.b.z(parcelT.readStrongBinder());
        parcelT.recycle();
        return aVarZ;
    }

    public final lf.a y(lf.b bVar, int i7) {
        Parcel parcelU = u();
        yf.g.b(parcelU, bVar);
        parcelU.writeString("com.google.android.gms.cronet_dynamite");
        parcelU.writeInt(i7);
        Parcel parcelT = t(2, parcelU);
        lf.a aVarZ = lf.b.z(parcelT.readStrongBinder());
        parcelT.recycle();
        return aVarZ;
    }

    public final lf.a z(lf.b bVar, int i7) {
        Parcel parcelU = u();
        yf.g.b(parcelU, bVar);
        parcelU.writeString("com.google.android.gms.cronet_dynamite");
        parcelU.writeInt(i7);
        Parcel parcelT = t(4, parcelU);
        lf.a aVarZ = lf.b.z(parcelT.readStrongBinder());
        parcelT.recycle();
        return aVarZ;
    }
}
