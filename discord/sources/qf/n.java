package qf;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<n> CREATOR = new s0(17);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Enum f18840d;

    /* JADX WARN: Multi-variable type inference failed */
    public n(a aVar) {
        this.f18840d = (Enum) aVar;
    }

    public static n a(int i7) throws m {
        a aVar;
        if (i7 != -262) {
            for (c0 c0Var : c0.values()) {
                if (c0Var.f18798d == i7) {
                    aVar = c0Var;
                }
            }
            for (o oVar : o.values()) {
                if (oVar.f18843d == i7) {
                    aVar = oVar;
                }
            }
            throw new m(s0.g.d(i7, "Algorithm with COSE value ", " not supported"));
        }
        aVar = c0.RS1;
        return new n(aVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Enum, qf.a] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Enum, qf.a] */
    public final boolean equals(Object obj) {
        return (obj instanceof n) && this.f18840d.a() == ((n) obj).f18840d.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18840d});
    }

    public final String toString() {
        return s0.g.e("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.f18840d), "}");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Enum, qf.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f18840d.a());
    }
}
