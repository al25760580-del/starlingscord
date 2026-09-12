package qf;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends bf.a {

    @NonNull
    public static final Parcelable.Creator<h0> CREATOR = new s0(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f0 f18819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18820e;

    static {
        new h0("supported", null);
        new h0("not-supported", null);
    }

    public h0(String str, String str2) {
        af.w.g(str);
        try {
            this.f18819d = f0.a(str);
            this.f18820e = str2;
        } catch (g0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return ag.c.h(this.f18819d, h0Var.f18819d) && ag.c.h(this.f18820e, h0Var.f18820e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18819d, this.f18820e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.O(this.f18819d.f18812d, parcel, 2);
        ls.d.O(this.f18820e, parcel, 3);
        ls.d.U(iT, parcel);
    }
}
