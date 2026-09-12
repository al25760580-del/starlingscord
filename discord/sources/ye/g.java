package ye;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends bf.a {

    @NonNull
    public static final Parcelable.Creator<g> CREATOR = new q(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23295e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f23296i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f23297v;

    public g(int i7, int i10, int i11, boolean z5) {
        this.f23294d = i7;
        this.f23295e = i10;
        this.f23296i = i11;
        this.f23297v = z5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f23294d == gVar.f23294d && this.f23295e == gVar.f23295e && this.f23296i == gVar.f23296i && this.f23297v == gVar.f23297v;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f23294d), Integer.valueOf(this.f23295e), Integer.valueOf(this.f23296i), Boolean.valueOf(this.f23297v)});
    }

    public final String toString() {
        int i7 = this.f23294d;
        int length = String.valueOf(i7).length();
        int i10 = this.f23295e;
        int length2 = String.valueOf(i10).length();
        int i11 = this.f23296i;
        int length3 = String.valueOf(i11).length();
        boolean z5 = this.f23297v;
        StringBuilder sb2 = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z5).length() + 1);
        sb2.append("ComplianceOptions{callerProductId=");
        sb2.append(i7);
        sb2.append(", dataOwnerProductId=");
        sb2.append(i10);
        sb2.append(", processingReason=");
        sb2.append(i11);
        sb2.append(", isUserData=");
        sb2.append(z5);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.S(parcel, 1, 4);
        parcel.writeInt(this.f23294d);
        ls.d.S(parcel, 2, 4);
        parcel.writeInt(this.f23295e);
        ls.d.S(parcel, 3, 4);
        parcel.writeInt(this.f23296i);
        ls.d.S(parcel, 4, 4);
        parcel.writeInt(this.f23297v ? 1 : 0);
        ls.d.U(iT, parcel);
    }
}
