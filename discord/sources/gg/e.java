package gg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
import ye.n;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends bf.a implements n {
    public static final Parcelable.Creator<e> CREATOR = new fd.a(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f10036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10037e;

    public e(String str, ArrayList arrayList) {
        this.f10036d = arrayList;
        this.f10037e = str;
    }

    @Override // ye.n
    public final Status a() {
        return this.f10037e != null ? Status.f5933w : Status.F;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.P(parcel, 1, this.f10036d);
        ls.d.O(this.f10037e, parcel, 2);
        ls.d.U(iT, parcel);
    }
}
