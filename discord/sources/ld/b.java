package ld;

import android.os.Parcel;
import android.os.Parcelable;
import gc.g;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Comparable, Parcelable, g {
    public static final Parcelable.Creator<b> CREATOR = new jf.b(4);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f15015v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f15016w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f15017x;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15019e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f15020i;

    static {
        int i7 = e0.f13788a;
        f15015v = Integer.toString(0, 36);
        f15016w = Integer.toString(1, 36);
        f15017x = Integer.toString(2, 36);
    }

    public b(int i7, int i10, int i11) {
        this.f15018d = i7;
        this.f15019e = i10;
        this.f15020i = i11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        int i7 = this.f15018d - bVar.f15018d;
        if (i7 != 0) {
            return i7;
        }
        int i10 = this.f15019e - bVar.f15019e;
        return i10 == 0 ? this.f15020i - bVar.f15020i : i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f15018d == bVar.f15018d && this.f15019e == bVar.f15019e && this.f15020i == bVar.f15020i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f15018d * 31) + this.f15019e) * 31) + this.f15020i;
    }

    public final String toString() {
        return this.f15018d + "." + this.f15019e + "." + this.f15020i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f15018d);
        parcel.writeInt(this.f15019e);
        parcel.writeInt(this.f15020i);
    }

    public b(Parcel parcel) {
        this.f15018d = parcel.readInt();
        this.f15019e = parcel.readInt();
        this.f15020i = parcel.readInt();
    }
}
