package qf;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends k {

    @NonNull
    public static final Parcelable.Creator<j> CREATOR = new s0(15);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f18826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18827e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f18828i;

    public j(int i7, int i10, String str) {
        try {
            this.f18826d = q.a(i7);
            this.f18827e = str;
            this.f18828i = i10;
        } catch (p e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return af.w.j(this.f18826d, jVar.f18826d) && af.w.j(this.f18827e, jVar.f18827e) && af.w.j(Integer.valueOf(this.f18828i), Integer.valueOf(jVar.f18828i));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18826d, this.f18827e, Integer.valueOf(this.f18828i)});
    }

    public final String toString() {
        e4.m mVar = new e4.m(getClass().getSimpleName(), 5);
        String strValueOf = String.valueOf(this.f18826d.f18855d);
        ag.e eVar = new ag.e(4);
        ((e4.m) mVar.f7995v).f7995v = eVar;
        mVar.f7995v = eVar;
        eVar.f7994i = strValueOf;
        eVar.f7993e = "errorCode";
        String str = this.f18827e;
        if (str != null) {
            mVar.O("errorMessage", str);
        }
        return mVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        int i10 = this.f18826d.f18855d;
        ls.d.S(parcel, 2, 4);
        parcel.writeInt(i10);
        ls.d.O(this.f18827e, parcel, 3);
        ls.d.S(parcel, 4, 4);
        parcel.writeInt(this.f18828i);
        ls.d.U(iT, parcel);
    }
}
