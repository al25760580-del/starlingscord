package hd;

import android.os.Parcel;
import android.os.Parcelable;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends j {
    public static final Parcelable.Creator<o> CREATOR = new fd.a(17);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10584e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f10585i;

    public o(String str, String str2, String str3) {
        super(str);
        this.f10584e = str2;
        this.f10585i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f10570d.equals(oVar.f10570d) && e0.a(this.f10584e, oVar.f10584e) && e0.a(this.f10585i, oVar.f10585i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iD = a3.e.d(527, 31, this.f10570d);
        String str = this.f10584e;
        int iHashCode = (iD + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10585i;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // hd.j
    public final String toString() {
        return this.f10570d + ": url=" + this.f10585i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10570d);
        parcel.writeString(this.f10584e);
        parcel.writeString(this.f10585i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o(Parcel parcel) {
        String string = parcel.readString();
        int i7 = e0.f13788a;
        super(string);
        this.f10584e = parcel.readString();
        this.f10585i = parcel.readString();
    }
}
