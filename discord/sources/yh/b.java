package yh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new rf.b(24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        c cVar = (c) this;
        parcel.writeParcelable(cVar.f23339d, 0);
        parcel.writeInt(cVar.f23340e ? 1 : 0);
    }
}
