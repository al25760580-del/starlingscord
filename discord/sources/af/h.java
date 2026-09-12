package af;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends bf.a {

    @NonNull
    public static final Parcelable.Creator<h> CREATOR = new m(1);
    public final int E;
    public final int F;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f437e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f438i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f439v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f440w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f441x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f442y;

    public h(int i7, int i10, int i11, long j, long j5, String str, String str2, int i12, int i13) {
        this.f436d = i7;
        this.f437e = i10;
        this.f438i = i11;
        this.f439v = j;
        this.f440w = j5;
        this.f441x = str;
        this.f442y = str2;
        this.E = i12;
        this.F = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.S(parcel, 1, 4);
        parcel.writeInt(this.f436d);
        ls.d.S(parcel, 2, 4);
        parcel.writeInt(this.f437e);
        ls.d.S(parcel, 3, 4);
        parcel.writeInt(this.f438i);
        ls.d.S(parcel, 4, 8);
        parcel.writeLong(this.f439v);
        ls.d.S(parcel, 5, 8);
        parcel.writeLong(this.f440w);
        ls.d.O(this.f441x, parcel, 6);
        ls.d.O(this.f442y, parcel, 7);
        ls.d.S(parcel, 8, 4);
        parcel.writeInt(this.E);
        ls.d.S(parcel, 9, 4);
        parcel.writeInt(this.F);
        ls.d.U(iT, parcel);
    }
}
