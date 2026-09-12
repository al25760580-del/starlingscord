package xe;

import af.w;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends bf.a {

    @NonNull
    public static final Parcelable.Creator<d> CREATOR = new rf.b(23);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22918e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f22919i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f22920v;

    public d(long j, String str, boolean z5, int i7) {
        this.f22917d = str;
        this.f22918e = i7;
        this.f22919i = j;
        this.f22920v = z5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (w.j(this.f22917d, dVar.f22917d) && h() == dVar.h() && this.f22920v == dVar.f22920v) {
                return true;
            }
        }
        return false;
    }

    public final long h() {
        long j = this.f22919i;
        return j == -1 ? this.f22918e : j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22917d, Long.valueOf(h()), Boolean.valueOf(this.f22920v)});
    }

    public final String toString() {
        e4.e eVar = new e4.e(this);
        eVar.w(this.f22917d, StackTraceHelper.NAME_KEY);
        eVar.w(Long.valueOf(h()), "version");
        eVar.w(Boolean.valueOf(this.f22920v), "is_fully_rolled_out");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.O(this.f22917d, parcel, 1);
        ls.d.S(parcel, 2, 4);
        parcel.writeInt(this.f22918e);
        long jH = h();
        ls.d.S(parcel, 3, 8);
        parcel.writeLong(jH);
        ls.d.S(parcel, 4, 4);
        parcel.writeInt(this.f22920v ? 1 : 0);
        ls.d.U(iT, parcel);
    }

    public d(String str, long j) {
        this(j, str, false, -1);
    }
}
