package hd;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends j {
    public static final Parcelable.Creator<c> CREATOR = new fd.a(9);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10547e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f10548i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f10549v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f10550w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f10551x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j[] f10552y;

    public c(String str, int i7, int i10, long j, long j5, j[] jVarArr) {
        super("CHAP");
        this.f10547e = str;
        this.f10548i = i7;
        this.f10549v = i10;
        this.f10550w = j;
        this.f10551x = j5;
        this.f10552y = jVarArr;
    }

    @Override // hd.j, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f10548i == cVar.f10548i && this.f10549v == cVar.f10549v && this.f10550w == cVar.f10550w && this.f10551x == cVar.f10551x && e0.a(this.f10547e, cVar.f10547e) && Arrays.equals(this.f10552y, cVar.f10552y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = (((((((527 + this.f10548i) * 31) + this.f10549v) * 31) + ((int) this.f10550w)) * 31) + ((int) this.f10551x)) * 31;
        String str = this.f10547e;
        return i7 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10547e);
        parcel.writeInt(this.f10548i);
        parcel.writeInt(this.f10549v);
        parcel.writeLong(this.f10550w);
        parcel.writeLong(this.f10551x);
        j[] jVarArr = this.f10552y;
        parcel.writeInt(jVarArr.length);
        for (j jVar : jVarArr) {
            parcel.writeParcelable(jVar, 0);
        }
    }

    public c(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i7 = e0.f13788a;
        this.f10547e = string;
        this.f10548i = parcel.readInt();
        this.f10549v = parcel.readInt();
        this.f10550w = parcel.readLong();
        this.f10551x = parcel.readLong();
        int i10 = parcel.readInt();
        this.f10552y = new j[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f10552y[i11] = (j) parcel.readParcelable(j.class.getClassLoader());
        }
    }
}
