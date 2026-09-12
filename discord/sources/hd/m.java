package hd;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends j {
    public static final Parcelable.Creator<m> CREATOR = new fd.a(15);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10579e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f10580i;

    public m(byte[] bArr, String str) {
        super("PRIV");
        this.f10579e = str;
        this.f10580i = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (e0.a(this.f10579e, mVar.f10579e) && Arrays.equals(this.f10580i, mVar.f10580i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f10579e;
        return Arrays.hashCode(this.f10580i) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // hd.j
    public final String toString() {
        return this.f10570d + ": owner=" + this.f10579e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10579e);
        parcel.writeByteArray(this.f10580i);
    }

    public m(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i7 = e0.f13788a;
        this.f10579e = string;
        this.f10580i = parcel.createByteArray();
    }
}
