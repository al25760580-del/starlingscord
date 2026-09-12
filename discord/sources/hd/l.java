package hd;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends j {
    public static final Parcelable.Creator<l> CREATOR = new fd.a(14);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10574e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f10575i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f10576v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int[] f10577w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f10578x;

    public l(int i7, int i10, int[] iArr, int[] iArr2, int i11) {
        super("MLLT");
        this.f10574e = i7;
        this.f10575i = i10;
        this.f10576v = i11;
        this.f10577w = iArr;
        this.f10578x = iArr2;
    }

    @Override // hd.j, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f10574e == lVar.f10574e && this.f10575i == lVar.f10575i && this.f10576v == lVar.f10576v && Arrays.equals(this.f10577w, lVar.f10577w) && Arrays.equals(this.f10578x, lVar.f10578x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10578x) + ((Arrays.hashCode(this.f10577w) + ((((((527 + this.f10574e) * 31) + this.f10575i) * 31) + this.f10576v) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f10574e);
        parcel.writeInt(this.f10575i);
        parcel.writeInt(this.f10576v);
        parcel.writeIntArray(this.f10577w);
        parcel.writeIntArray(this.f10578x);
    }

    public l(Parcel parcel) {
        super("MLLT");
        this.f10574e = parcel.readInt();
        this.f10575i = parcel.readInt();
        this.f10576v = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i7 = e0.f13788a;
        this.f10577w = iArrCreateIntArray;
        this.f10578x = parcel.createIntArray();
    }
}
