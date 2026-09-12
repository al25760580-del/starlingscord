package rd;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements cd.b {
    public static final Parcelable.Creator<w> CREATOR = new u(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19350e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f19351i;

    public w(String str, String str2, List list) {
        this.f19349d = str;
        this.f19350e = str2;
        this.f19351i = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (TextUtils.equals(this.f19349d, wVar.f19349d) && TextUtils.equals(this.f19350e, wVar.f19350e) && this.f19351i.equals(wVar.f19351i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f19349d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f19350e;
        return this.f19351i.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.f19349d;
        sb2.append(str != null ? com.discord.chat.presentation.list.a.k(com.discord.chat.presentation.list.a.n(" [", str, ", "), this.f19350e, "]") : "");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f19349d);
        parcel.writeString(this.f19350e);
        List list = this.f19351i;
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeParcelable((Parcelable) list.get(i10), 0);
        }
    }

    public w(Parcel parcel) {
        this.f19349d = parcel.readString();
        this.f19350e = parcel.readString();
        int i7 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i7);
        for (int i10 = 0; i10 < i7; i10++) {
            arrayList.add((v) parcel.readParcelable(v.class.getClassLoader()));
        }
        this.f19351i = Collections.unmodifiableList(arrayList);
    }
}
