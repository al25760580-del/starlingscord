package fd;

import a3.e;
import android.os.Parcel;
import android.os.Parcelable;
import di.d;
import gc.u0;
import java.util.Arrays;
import je.e0;
import je.w;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements cd.b {
    public static final Parcelable.Creator<b> CREATOR = new a(0);
    public final byte[] E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9056e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f9057i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f9058v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f9059w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f9060x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f9061y;

    public b(int i7, String str, String str2, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.f9055d = i7;
        this.f9056e = str;
        this.f9057i = str2;
        this.f9058v = i10;
        this.f9059w = i11;
        this.f9060x = i12;
        this.f9061y = i13;
        this.E = bArr;
    }

    public static b a(w wVar) {
        int iG = wVar.g();
        String strS = wVar.s(wVar.g(), d.f7629a);
        String strS2 = wVar.s(wVar.g(), d.f7631c);
        int iG2 = wVar.g();
        int iG3 = wVar.g();
        int iG4 = wVar.g();
        int iG5 = wVar.g();
        int iG6 = wVar.g();
        byte[] bArr = new byte[iG6];
        wVar.e(bArr, 0, iG6);
        return new b(iG, strS, strS2, iG2, iG3, iG4, iG5, bArr);
    }

    @Override // cd.b
    public final void b(u0 u0Var) {
        u0Var.a(this.E, this.f9055d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f9055d == bVar.f9055d && this.f9056e.equals(bVar.f9056e) && this.f9057i.equals(bVar.f9057i) && this.f9058v == bVar.f9058v && this.f9059w == bVar.f9059w && this.f9060x == bVar.f9060x && this.f9061y == bVar.f9061y && Arrays.equals(this.E, bVar.E)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.E) + ((((((((e.d(e.d((527 + this.f9055d) * 31, 31, this.f9056e), 31, this.f9057i) + this.f9058v) * 31) + this.f9059w) * 31) + this.f9060x) * 31) + this.f9061y) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f9056e + ", description=" + this.f9057i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f9055d);
        parcel.writeString(this.f9056e);
        parcel.writeString(this.f9057i);
        parcel.writeInt(this.f9058v);
        parcel.writeInt(this.f9059w);
        parcel.writeInt(this.f9060x);
        parcel.writeInt(this.f9061y);
        parcel.writeByteArray(this.E);
    }

    public b(Parcel parcel) {
        this.f9055d = parcel.readInt();
        String string = parcel.readString();
        int i7 = e0.f13788a;
        this.f9056e = string;
        this.f9057i = parcel.readString();
        this.f9058v = parcel.readInt();
        this.f9059w = parcel.readInt();
        this.f9060x = parcel.readInt();
        this.f9061y = parcel.readInt();
        this.E = parcel.createByteArray();
    }
}
