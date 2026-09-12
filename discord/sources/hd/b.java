package hd;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends j {
    public static final Parcelable.Creator<b> CREATOR = new fd.a(8);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f10546e;

    public b(byte[] bArr, String str) {
        super(str);
        this.f10546e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f10570d.equals(bVar.f10570d) && Arrays.equals(this.f10546e, bVar.f10546e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10546e) + a3.e.d(527, 31, this.f10570d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10570d);
        parcel.writeByteArray(this.f10546e);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(Parcel parcel) {
        String string = parcel.readString();
        int i7 = e0.f13788a;
        super(string);
        this.f10546e = parcel.createByteArray();
    }
}
