package qf;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends bf.a {

    @NonNull
    public static final Parcelable.Creator<l> CREATOR = new s0(16);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f18832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f18833e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j0 f18834i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final e0 f18835v;

    public l(String str, Boolean bool, String str2, String str3) {
        c cVarA;
        e0 e0VarA = null;
        if (str == null) {
            cVarA = null;
        } else {
            try {
                cVarA = c.a(str);
            } catch (b | d0 | t0 e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        this.f18832d = cVarA;
        this.f18833e = bool;
        this.f18834i = str2 == null ? null : j0.a(str2);
        if (str3 != null) {
            e0VarA = e0.a(str3);
        }
        this.f18835v = e0VarA;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return af.w.j(this.f18832d, lVar.f18832d) && af.w.j(this.f18833e, lVar.f18833e) && af.w.j(this.f18834i, lVar.f18834i) && af.w.j(h(), lVar.h());
    }

    public final e0 h() {
        e0 e0Var = this.f18835v;
        if (e0Var != null) {
            return e0Var;
        }
        Boolean bool = this.f18833e;
        return (bool == null || !bool.booleanValue()) ? e0.RESIDENT_KEY_DISCOURAGED : e0.RESIDENT_KEY_REQUIRED;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18832d, this.f18833e, this.f18834i, h()});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f18832d);
        String strValueOf2 = String.valueOf(this.f18834i);
        String strValueOf3 = String.valueOf(this.f18835v);
        StringBuilder sbN = com.discord.chat.presentation.list.a.n("AuthenticatorSelectionCriteria{\n attachment=", strValueOf, ", \n requireResidentKey=");
        sbN.append(this.f18833e);
        sbN.append(", \n requireUserVerification=");
        sbN.append(strValueOf2);
        sbN.append(", \n residentKeyRequirement=");
        return com.discord.chat.presentation.list.a.k(sbN, strValueOf3, "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        c cVar = this.f18832d;
        ls.d.O(cVar == null ? null : cVar.f18795d, parcel, 2);
        Boolean bool = this.f18833e;
        if (bool != null) {
            ls.d.S(parcel, 3, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        j0 j0Var = this.f18834i;
        ls.d.O(j0Var != null ? j0Var.f18830d : null, parcel, 4);
        ls.d.O(h().f18805d, parcel, 5);
        ls.d.U(iT, parcel);
    }
}
