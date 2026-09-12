package ye;

import af.w;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends bf.a {

    @NonNull
    public static final Parcelable.Creator<f> CREATOR = q.f23313b;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final f f23290v;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f23291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f23292e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f23293i;

    static {
        f fVar = new f(null, false);
        fVar.f23293i = false;
        f23290v = fVar;
    }

    public f(g gVar, boolean z5) {
        this.f23291d = gVar;
        this.f23292e = z5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return w.j(this.f23291d, fVar.f23291d) && this.f23293i == fVar.f23293i && this.f23292e == fVar.f23292e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23291d, Boolean.valueOf(this.f23293i), Boolean.valueOf(this.f23292e)});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f23291d);
        return a3.e.o(new StringBuilder(strValueOf.length() + 31), "ApiMetadata(complianceOptions=", strValueOf, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        if (this.f23293i) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int iT = ls.d.T(20293, parcel);
        ls.d.N(parcel, 1, this.f23291d, i7);
        ls.d.S(parcel, 2, 4);
        parcel.writeInt(this.f23292e ? 1 : 0);
        ls.d.U(iT, parcel);
    }
}
