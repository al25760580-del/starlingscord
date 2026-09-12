package jd;

import android.os.Parcel;
import android.os.Parcelable;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new fd.a(25);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f13725e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f13726i;

    public a(long j, long j5, byte[] bArr) {
        this.f13724d = j5;
        this.f13725e = j;
        this.f13726i = bArr;
    }

    @Override // jd.b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb2.append(this.f13724d);
        sb2.append(", identifier= ");
        return a3.e.n(sb2, this.f13725e, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f13724d);
        parcel.writeLong(this.f13725e);
        parcel.writeByteArray(this.f13726i);
    }

    public a(Parcel parcel) {
        this.f13724d = parcel.readLong();
        this.f13725e = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i7 = e0.f13788a;
        this.f13726i = bArrCreateByteArray;
    }
}
