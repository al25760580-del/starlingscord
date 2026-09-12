package id;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements cd.b {
    public static final Parcelable.Creator<a> CREATOR = new fd.a(18);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f11699e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f11700i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f11701v;

    public a(String str, byte[] bArr, int i7, int i10) {
        this.f11698d = str;
        this.f11699e = bArr;
        this.f11700i = i7;
        this.f11701v = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f11698d.equals(aVar.f11698d) && Arrays.equals(this.f11699e, aVar.f11699e) && this.f11700i == aVar.f11700i && this.f11701v == aVar.f11701v) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f11699e) + a3.e.d(527, 31, this.f11698d)) * 31) + this.f11700i) * 31) + this.f11701v;
    }

    public final String toString() {
        String strN;
        byte[] bArr = this.f11699e;
        int i7 = this.f11701v;
        if (i7 != 1) {
            if (i7 == 23) {
                int i10 = e0.f13788a;
                je.b.g(bArr.length == 4);
                strN = String.valueOf(Float.intBitsToFloat((bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8)));
            } else if (i7 != 67) {
                int i11 = e0.f13788a;
                StringBuilder sb2 = new StringBuilder(bArr.length * 2);
                for (int i12 = 0; i12 < bArr.length; i12++) {
                    sb2.append(Character.forDigit((bArr[i12] >> 4) & 15, 16));
                    sb2.append(Character.forDigit(bArr[i12] & 15, 16));
                }
                strN = sb2.toString();
            } else {
                int i13 = e0.f13788a;
                je.b.g(bArr.length == 4);
                strN = String.valueOf(bArr[3] | (bArr[0] << 24) | (bArr[1] << 16) | (bArr[2] << 8));
            }
        } else {
            strN = e0.n(bArr);
        }
        return a3.e.o(new StringBuilder("mdta: key="), this.f11698d, ", value=", strN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f11698d);
        parcel.writeByteArray(this.f11699e);
        parcel.writeInt(this.f11700i);
        parcel.writeInt(this.f11701v);
    }

    public a(Parcel parcel) {
        String string = parcel.readString();
        int i7 = e0.f13788a;
        this.f11698d = string;
        this.f11699e = parcel.createByteArray();
        this.f11700i = parcel.readInt();
        this.f11701v = parcel.readInt();
    }
}
