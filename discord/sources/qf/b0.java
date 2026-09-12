package qf;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends bf.a {

    @NonNull
    public static final Parcelable.Creator<b0> CREATOR = new jf.b(28);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ag.y0 f18790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18791e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f18792i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f18793v;

    public b0(String str, String str2, String str3, byte[] bArr) {
        af.w.g(bArr);
        this.f18790d = ag.y0.k(bArr, bArr.length);
        af.w.g(str);
        this.f18791e = str;
        this.f18792i = str2;
        af.w.g(str3);
        this.f18793v = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return af.w.j(this.f18790d, b0Var.f18790d) && af.w.j(this.f18791e, b0Var.f18791e) && af.w.j(this.f18792i, b0Var.f18792i) && af.w.j(this.f18793v, b0Var.f18793v);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18790d, this.f18791e, this.f18792i, this.f18793v});
    }

    public final String toString() {
        StringBuilder sbN = com.discord.chat.presentation.list.a.n("PublicKeyCredentialUserEntity{\n id=", ff.c.b(this.f18790d.m()), ", \n name='");
        sbN.append(this.f18791e);
        sbN.append("', \n icon='");
        sbN.append(this.f18792i);
        sbN.append("', \n displayName='");
        return com.discord.chat.presentation.list.a.k(sbN, this.f18793v, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.L(parcel, 2, this.f18790d.m());
        ls.d.O(this.f18791e, parcel, 3);
        ls.d.O(this.f18792i, parcel, 4);
        ls.d.O(this.f18793v, parcel, 5);
        ls.d.U(iT, parcel);
    }
}
