package re;

import af.w;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import qf.s0;
import qf.u;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends bf.a {

    @NonNull
    public static final Parcelable.Creator<g> CREATOR = new s0(29);
    public final String E;
    public final u F;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19382e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f19383i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f19384v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Uri f19385w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f19386x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f19387y;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        w.g(str);
        this.f19381d = str;
        this.f19382e = str2;
        this.f19383i = str3;
        this.f19384v = str4;
        this.f19385w = uri;
        this.f19386x = str5;
        this.f19387y = str6;
        this.E = str7;
        this.F = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return w.j(this.f19381d, gVar.f19381d) && w.j(this.f19382e, gVar.f19382e) && w.j(this.f19383i, gVar.f19383i) && w.j(this.f19384v, gVar.f19384v) && w.j(this.f19385w, gVar.f19385w) && w.j(this.f19386x, gVar.f19386x) && w.j(this.f19387y, gVar.f19387y) && w.j(this.E, gVar.E) && w.j(this.F, gVar.F);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19381d, this.f19382e, this.f19383i, this.f19384v, this.f19385w, this.f19386x, this.f19387y, this.E, this.F});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.O(this.f19381d, parcel, 1);
        ls.d.O(this.f19382e, parcel, 2);
        ls.d.O(this.f19383i, parcel, 3);
        ls.d.O(this.f19384v, parcel, 4);
        ls.d.N(parcel, 5, this.f19385w, i7);
        ls.d.O(this.f19386x, parcel, 6);
        ls.d.O(this.f19387y, parcel, 7);
        ls.d.O(this.E, parcel, 8);
        ls.d.N(parcel, 9, this.F, i7);
        ls.d.U(iT, parcel);
    }
}
