package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new af.m(14);
    public final int E;
    public final CharSequence F;
    public final int G;
    public final CharSequence H;
    public final ArrayList I;
    public final ArrayList J;
    public final boolean K;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f2093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f2094e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f2095i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int[] f2096v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f2097w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f2098x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f2099y;

    public b(a aVar) {
        int size = aVar.f2065a.size();
        this.f2093d = new int[size * 6];
        if (!aVar.f2071g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f2094e = new ArrayList(size);
        this.f2095i = new int[size];
        this.f2096v = new int[size];
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            l1 l1Var = (l1) aVar.f2065a.get(i10);
            int i11 = i7 + 1;
            this.f2093d[i7] = l1Var.f2184a;
            ArrayList arrayList = this.f2094e;
            Fragment fragment = l1Var.f2185b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f2093d;
            iArr[i11] = l1Var.f2186c ? 1 : 0;
            iArr[i7 + 2] = l1Var.f2187d;
            iArr[i7 + 3] = l1Var.f2188e;
            int i12 = i7 + 5;
            iArr[i7 + 4] = l1Var.f2189f;
            i7 += 6;
            iArr[i12] = l1Var.f2190g;
            this.f2095i[i10] = l1Var.f2191h.ordinal();
            this.f2096v[i10] = l1Var.f2192i.ordinal();
        }
        this.f2097w = aVar.f2070f;
        this.f2098x = aVar.f2073i;
        this.f2099y = aVar.f2087t;
        this.E = aVar.j;
        this.F = aVar.k;
        this.G = aVar.f2074l;
        this.H = aVar.f2075m;
        this.I = aVar.f2076n;
        this.J = aVar.f2077o;
        this.K = aVar.f2078p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeIntArray(this.f2093d);
        parcel.writeStringList(this.f2094e);
        parcel.writeIntArray(this.f2095i);
        parcel.writeIntArray(this.f2096v);
        parcel.writeInt(this.f2097w);
        parcel.writeString(this.f2098x);
        parcel.writeInt(this.f2099y);
        parcel.writeInt(this.E);
        TextUtils.writeToParcel(this.F, parcel, 0);
        parcel.writeInt(this.G);
        TextUtils.writeToParcel(this.H, parcel, 0);
        parcel.writeStringList(this.I);
        parcel.writeStringList(this.J);
        parcel.writeInt(this.K ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f2093d = parcel.createIntArray();
        this.f2094e = parcel.createStringArrayList();
        this.f2095i = parcel.createIntArray();
        this.f2096v = parcel.createIntArray();
        this.f2097w = parcel.readInt();
        this.f2098x = parcel.readString();
        this.f2099y = parcel.readInt();
        this.E = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.F = (CharSequence) creator.createFromParcel(parcel);
        this.G = parcel.readInt();
        this.H = (CharSequence) creator.createFromParcel(parcel);
        this.I = parcel.createStringArrayList();
        this.J = parcel.createStringArrayList();
        this.K = parcel.readInt() != 0;
    }
}
