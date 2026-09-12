package eh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new af.m(27);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public bh.g f8261e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f8260d);
        parcel.writeParcelable(this.f8261e, 0);
    }
}
