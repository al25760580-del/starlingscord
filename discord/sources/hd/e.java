package hd;

import android.os.Parcel;
import android.os.Parcelable;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends j {
    public static final Parcelable.Creator<e> CREATOR = new fd.a(11);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10558e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f10559i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f10560v;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f10558e = str;
        this.f10559i = str2;
        this.f10560v = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (e0.a(this.f10559i, eVar.f10559i) && e0.a(this.f10558e, eVar.f10558e) && e0.a(this.f10560v, eVar.f10560v)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f10558e;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10559i;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f10560v;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // hd.j
    public final String toString() {
        return this.f10570d + ": language=" + this.f10558e + ", description=" + this.f10559i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10570d);
        parcel.writeString(this.f10558e);
        parcel.writeString(this.f10560v);
    }

    public e(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i7 = e0.f13788a;
        this.f10558e = string;
        this.f10559i = parcel.readString();
        this.f10560v = parcel.readString();
    }
}
