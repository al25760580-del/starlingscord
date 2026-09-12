package re;

import af.w;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Objects;
import qf.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends bf.a {

    @NonNull
    public static final Parcelable.Creator<c> CREATOR = new s0(27);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f19370e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f19371i;

    public c(boolean z5, byte[] bArr, String str) {
        if (z5) {
            w.g(bArr);
            w.g(str);
        }
        this.f19369d = z5;
        this.f19370e = bArr;
        this.f19371i = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f19369d == cVar.f19369d && Arrays.equals(this.f19370e, cVar.f19370e) && Objects.equals(this.f19371i, cVar.f19371i);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f19370e) + (Objects.hash(Boolean.valueOf(this.f19369d), this.f19371i) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.S(parcel, 1, 4);
        parcel.writeInt(this.f19369d ? 1 : 0);
        ls.d.L(parcel, 2, this.f19370e);
        ls.d.O(this.f19371i, parcel, 3);
        ls.d.U(iT, parcel);
    }
}
