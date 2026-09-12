package re;

import af.w;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import qf.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends bf.a {

    @NonNull
    public static final Parcelable.Creator<e> CREATOR = new s0(23);
    public final boolean E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f19373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f19374e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f19375i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f19376v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f19377w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c f19378x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b f19379y;

    public e(d dVar, a aVar, String str, boolean z5, int i7, c cVar, b bVar, boolean z6) {
        w.g(dVar);
        this.f19373d = dVar;
        w.g(aVar);
        this.f19374e = aVar;
        this.f19375i = str;
        this.f19376v = z5;
        this.f19377w = i7;
        this.f19378x = cVar == null ? new c(false, null, null) : cVar;
        this.f19379y = bVar == null ? new b(false, null) : bVar;
        this.E = z6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return w.j(this.f19373d, eVar.f19373d) && w.j(this.f19374e, eVar.f19374e) && w.j(this.f19378x, eVar.f19378x) && w.j(this.f19379y, eVar.f19379y) && w.j(this.f19375i, eVar.f19375i) && this.f19376v == eVar.f19376v && this.f19377w == eVar.f19377w && this.E == eVar.E;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19373d, this.f19374e, this.f19378x, this.f19379y, this.f19375i, Boolean.valueOf(this.f19376v), Integer.valueOf(this.f19377w), Boolean.valueOf(this.E)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.N(parcel, 1, this.f19373d, i7);
        ls.d.N(parcel, 2, this.f19374e, i7);
        ls.d.O(this.f19375i, parcel, 3);
        ls.d.S(parcel, 4, 4);
        parcel.writeInt(this.f19376v ? 1 : 0);
        ls.d.S(parcel, 5, 4);
        parcel.writeInt(this.f19377w);
        ls.d.N(parcel, 6, this.f19378x, i7);
        ls.d.N(parcel, 7, this.f19379y, i7);
        ls.d.S(parcel, 8, 4);
        parcel.writeInt(this.E ? 1 : 0);
        ls.d.U(iT, parcel);
    }
}
