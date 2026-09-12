package qf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 extends bf.a {
    public static final Parcelable.Creator<x0> CREATOR = new s0(19);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f18890d;

    public x0(ArrayList arrayList) {
        af.w.g(arrayList);
        this.f18890d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x0)) {
            return false;
        }
        List list = ((x0) obj).f18890d;
        List list2 = this.f18890d;
        return list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f18890d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.R(parcel, 1, this.f18890d);
        ls.d.U(iT, parcel);
    }
}
