package qf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends bf.a {
    public static final Parcelable.Creator<p0> CREATOR = new jf.b(18);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ag.y0 f18845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ag.y0 f18846e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ag.y0 f18847i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f18848v;

    public p0(ag.y0 y0Var, ag.y0 y0Var2, ag.y0 y0Var3, int i7) {
        this.f18845d = y0Var;
        this.f18846e = y0Var2;
        this.f18847i = y0Var3;
        this.f18848v = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return af.w.j(this.f18845d, p0Var.f18845d) && af.w.j(this.f18846e, p0Var.f18846e) && af.w.j(this.f18847i, p0Var.f18847i) && this.f18848v == p0Var.f18848v;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18845d, this.f18846e, this.f18847i, Integer.valueOf(this.f18848v)});
    }

    public final String toString() {
        ag.y0 y0Var = this.f18845d;
        String strB = ff.c.b(y0Var == null ? null : y0Var.m());
        ag.y0 y0Var2 = this.f18846e;
        String strB2 = ff.c.b(y0Var2 == null ? null : y0Var2.m());
        ag.y0 y0Var3 = this.f18847i;
        String strB3 = ff.c.b(y0Var3 != null ? y0Var3.m() : null);
        StringBuilder sbU = a3.e.u("HmacSecretExtension{coseKeyAgreement=", strB, ", saltEnc=", strB2, ", saltAuth=");
        sbU.append(strB3);
        sbU.append(", getPinUvAuthProtocol=");
        return kk.b.l(sbU, this.f18848v, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ag.y0 y0Var = this.f18845d;
        ls.d.L(parcel, 1, y0Var == null ? null : y0Var.m());
        ag.y0 y0Var2 = this.f18846e;
        ls.d.L(parcel, 2, y0Var2 == null ? null : y0Var2.m());
        ag.y0 y0Var3 = this.f18847i;
        ls.d.L(parcel, 3, y0Var3 != null ? y0Var3.m() : null);
        ls.d.S(parcel, 4, 4);
        parcel.writeInt(this.f18848v);
        ls.d.U(iT, parcel);
    }
}
