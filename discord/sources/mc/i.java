package mc;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements Comparator, Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new jf.b(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h[] f15558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15559e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f15560i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f15561v;

    public i(String str, ArrayList arrayList) {
        this(str, false, (h[]) arrayList.toArray(new h[0]));
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        h hVar = (h) obj;
        h hVar2 = (h) obj2;
        UUID uuid = gc.h.f9669a;
        if (uuid.equals(hVar.f15554e)) {
            return uuid.equals(hVar2.f15554e) ? 0 : 1;
        }
        return hVar.f15554e.compareTo(hVar2.f15554e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (je.e0.a(this.f15560i, iVar.f15560i) && Arrays.equals(this.f15558d, iVar.f15558d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f15559e == 0) {
            String str = this.f15560i;
            this.f15559e = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f15558d);
        }
        return this.f15559e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f15560i);
        parcel.writeTypedArray(this.f15558d, 0);
    }

    public final i x(String str) {
        return je.e0.a(this.f15560i, str) ? this : new i(str, false, this.f15558d);
    }

    public i(h... hVarArr) {
        this(null, true, hVarArr);
    }

    public i(String str, boolean z5, h... hVarArr) {
        this.f15560i = str;
        hVarArr = z5 ? (h[]) hVarArr.clone() : hVarArr;
        this.f15558d = hVarArr;
        this.f15561v = hVarArr.length;
        Arrays.sort(hVarArr, this);
    }

    public i(Parcel parcel) {
        this.f15560i = parcel.readString();
        h[] hVarArr = (h[]) parcel.createTypedArray(h.CREATOR);
        int i7 = je.e0.f13788a;
        this.f15558d = hVarArr;
        this.f15561v = hVarArr.length;
    }
}
