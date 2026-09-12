package ne;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new jf.b(8);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16585e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SavedState{mAnchorPosition=");
        sb2.append(this.f16584d);
        sb2.append(", mAnchorOffset=");
        return com.discord.chat.presentation.list.a.j(sb2, this.f16585e, '}');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f16584d);
        parcel.writeInt(this.f16585e);
    }
}
