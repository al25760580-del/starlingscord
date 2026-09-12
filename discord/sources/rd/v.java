package rd;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new u(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19344e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f19345i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f19346v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f19347w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f19348x;

    public v(int i7, int i10, String str, String str2, String str3, String str4) {
        this.f19343d = i7;
        this.f19344e = i10;
        this.f19345i = str;
        this.f19346v = str2;
        this.f19347w = str3;
        this.f19348x = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            if (this.f19343d == vVar.f19343d && this.f19344e == vVar.f19344e && TextUtils.equals(this.f19345i, vVar.f19345i) && TextUtils.equals(this.f19346v, vVar.f19346v) && TextUtils.equals(this.f19347w, vVar.f19347w) && TextUtils.equals(this.f19348x, vVar.f19348x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = ((this.f19343d * 31) + this.f19344e) * 31;
        String str = this.f19345i;
        int iHashCode = (i7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19346v;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f19347w;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f19348x;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f19343d);
        parcel.writeInt(this.f19344e);
        parcel.writeString(this.f19345i);
        parcel.writeString(this.f19346v);
        parcel.writeString(this.f19347w);
        parcel.writeString(this.f19348x);
    }

    public v(Parcel parcel) {
        this.f19343d = parcel.readInt();
        this.f19344e = parcel.readInt();
        this.f19345i = parcel.readString();
        this.f19346v = parcel.readString();
        this.f19347w = parcel.readString();
        this.f19348x = parcel.readString();
    }
}
