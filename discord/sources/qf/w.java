package qf;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends bf.a {

    @NonNull
    public static final Parcelable.Creator<w> CREATOR;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0 f18881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ag.y0 f18882e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f18883i;

    static {
        ag.s.i(2, ag.c.f508i, ag.c.f509v);
        CREATOR = new jf.b(23);
    }

    public w(String str, byte[] bArr, ArrayList arrayList) {
        ag.y0 y0Var = ag.y0.f600i;
        ag.y0 y0VarK = ag.y0.k(bArr, bArr.length);
        af.w.g(str);
        try {
            this.f18881d = a0.a(str);
            this.f18882e = y0VarK;
            this.f18883i = arrayList;
        } catch (z e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        List list = wVar.f18883i;
        if (!this.f18881d.equals(wVar.f18881d) || !af.w.j(this.f18882e, wVar.f18882e)) {
            return false;
        }
        List list2 = this.f18883i;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18881d, this.f18882e, this.f18883i});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f18881d);
        String strB = ff.c.b(this.f18882e.m());
        return com.discord.chat.presentation.list.a.k(a3.e.u("PublicKeyCredentialDescriptor{\n type=", strValueOf, ", \n id=", strB, ", \n transports="), String.valueOf(this.f18883i), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        this.f18881d.getClass();
        ls.d.O("public-key", parcel, 2);
        ls.d.L(parcel, 3, this.f18882e.m());
        ls.d.R(parcel, 4, this.f18883i);
        ls.d.U(iT, parcel);
    }
}
