package re;

import af.w;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import qf.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends bf.a {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new s0(25);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19361e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f19362i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f19363v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f19364w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f19365x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f19366y;

    public a(boolean z5, String str, String str2, boolean z6, String str3, ArrayList arrayList, boolean z7) {
        boolean z10 = true;
        if (z6 && z7) {
            z10 = false;
        }
        w.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z10);
        this.f19360d = z5;
        if (z5) {
            w.h(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f19361e = str;
        this.f19362i = str2;
        this.f19363v = z6;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f19365x = arrayList2;
        this.f19364w = str3;
        this.f19366y = z7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f19360d == aVar.f19360d && w.j(this.f19361e, aVar.f19361e) && w.j(this.f19362i, aVar.f19362i) && this.f19363v == aVar.f19363v && w.j(this.f19364w, aVar.f19364w) && w.j(this.f19365x, aVar.f19365x) && this.f19366y == aVar.f19366y;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f19360d), this.f19361e, this.f19362i, Boolean.valueOf(this.f19363v), this.f19364w, this.f19365x, Boolean.valueOf(this.f19366y)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.S(parcel, 1, 4);
        parcel.writeInt(this.f19360d ? 1 : 0);
        ls.d.O(this.f19361e, parcel, 2);
        ls.d.O(this.f19362i, parcel, 3);
        ls.d.S(parcel, 4, 4);
        parcel.writeInt(this.f19363v ? 1 : 0);
        ls.d.O(this.f19364w, parcel, 5);
        ls.d.P(parcel, 6, this.f19365x);
        ls.d.S(parcel, 7, 4);
        parcel.writeInt(this.f19366y ? 1 : 0);
        ls.d.U(iT, parcel);
    }
}
