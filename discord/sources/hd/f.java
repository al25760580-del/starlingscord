package hd;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends j {
    public static final Parcelable.Creator<f> CREATOR = new fd.a(12);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10561e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f10562i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f10563v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final byte[] f10564w;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f10561e = str;
        this.f10562i = str2;
        this.f10563v = str3;
        this.f10564w = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (e0.a(this.f10561e, fVar.f10561e) && e0.a(this.f10562i, fVar.f10562i) && e0.a(this.f10563v, fVar.f10563v) && Arrays.equals(this.f10564w, fVar.f10564w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f10561e;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10562i;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f10563v;
        return Arrays.hashCode(this.f10564w) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // hd.j
    public final String toString() {
        return this.f10570d + ": mimeType=" + this.f10561e + ", filename=" + this.f10562i + ", description=" + this.f10563v;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10561e);
        parcel.writeString(this.f10562i);
        parcel.writeString(this.f10563v);
        parcel.writeByteArray(this.f10564w);
    }

    public f(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i7 = e0.f13788a;
        this.f10561e = string;
        this.f10562i = parcel.readString();
        this.f10563v = parcel.readString();
        this.f10564w = parcel.createByteArray();
    }
}
