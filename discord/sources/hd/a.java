package hd;

import android.os.Parcel;
import android.os.Parcelable;
import gc.u0;
import java.util.Arrays;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends j {
    public static final Parcelable.Creator<a> CREATOR = new fd.a(7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10542e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f10543i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f10544v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final byte[] f10545w;

    public a(String str, String str2, int i7, byte[] bArr) {
        super("APIC");
        this.f10542e = str;
        this.f10543i = str2;
        this.f10544v = i7;
        this.f10545w = bArr;
    }

    @Override // cd.b
    public final void b(u0 u0Var) {
        u0Var.a(this.f10545w, this.f10544v);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f10544v == aVar.f10544v && e0.a(this.f10542e, aVar.f10542e) && e0.a(this.f10543i, aVar.f10543i) && Arrays.equals(this.f10545w, aVar.f10545w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = (527 + this.f10544v) * 31;
        String str = this.f10542e;
        int iHashCode = (i7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10543i;
        return Arrays.hashCode(this.f10545w) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // hd.j
    public final String toString() {
        return this.f10570d + ": mimeType=" + this.f10542e + ", description=" + this.f10543i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10542e);
        parcel.writeString(this.f10543i);
        parcel.writeInt(this.f10544v);
        parcel.writeByteArray(this.f10545w);
    }

    public a(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i7 = e0.f13788a;
        this.f10542e = string;
        this.f10543i = parcel.readString();
        this.f10544v = parcel.readInt();
        this.f10545w = parcel.createByteArray();
    }
}
