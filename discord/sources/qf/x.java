package qf;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends bf.a {

    @NonNull
    public static final Parcelable.Creator<x> CREATOR = new jf.b(24);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0 f18888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f18889e;

    public x(String str, int i7) {
        af.w.g(str);
        try {
            this.f18888d = a0.a(str);
            try {
                this.f18889e = n.a(i7);
            } catch (m e10) {
                throw new IllegalArgumentException(e10);
            }
        } catch (z e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f18888d.equals(xVar.f18888d) && this.f18889e.equals(xVar.f18889e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18888d, this.f18889e});
    }

    public final String toString() {
        return s0.g.f("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f18888d), ", \n algorithm=", String.valueOf(this.f18889e), "\n }");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Enum, qf.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        this.f18888d.getClass();
        ls.d.O("public-key", parcel, 2);
        ls.d.M(parcel, 3, Integer.valueOf(this.f18889e.f18840d.a()));
        ls.d.U(iT, parcel);
    }
}
