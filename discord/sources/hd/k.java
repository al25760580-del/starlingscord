package hd;

import android.os.Parcel;
import android.os.Parcelable;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends j {
    public static final Parcelable.Creator<k> CREATOR = new fd.a(13);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10571e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f10572i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f10573v;

    public k(String str, String str2, String str3) {
        super("----");
        this.f10571e = str;
        this.f10572i = str2;
        this.f10573v = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (e0.a(this.f10572i, kVar.f10572i) && e0.a(this.f10571e, kVar.f10571e) && e0.a(this.f10573v, kVar.f10573v)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f10571e;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10572i;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f10573v;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // hd.j
    public final String toString() {
        return this.f10570d + ": domain=" + this.f10571e + ", description=" + this.f10572i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10570d);
        parcel.writeString(this.f10571e);
        parcel.writeString(this.f10573v);
    }

    public k(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i7 = e0.f13788a;
        this.f10571e = string;
        this.f10572i = parcel.readString();
        this.f10573v = parcel.readString();
    }
}
