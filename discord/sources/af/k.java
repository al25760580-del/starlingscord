package af;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends bf.a {

    @NonNull
    public static final Parcelable.Creator<k> CREATOR = new m(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f462e;

    public k(int i7, List list) {
        this.f461d = i7;
        this.f462e = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.S(parcel, 1, 4);
        parcel.writeInt(this.f461d);
        ls.d.R(parcel, 2, this.f462e);
        ls.d.U(iT, parcel);
    }
}
