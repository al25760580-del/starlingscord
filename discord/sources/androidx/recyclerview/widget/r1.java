package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class r1 implements Parcelable {
    public static final Parcelable.Creator<r1> CREATOR = new q1(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2678e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f2679i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2680v;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f2677d + ", mGapDir=" + this.f2678e + ", mHasUnwantedGapAfter=" + this.f2680v + ", mGapPerSpan=" + Arrays.toString(this.f2679i) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f2677d);
        parcel.writeInt(this.f2678e);
        parcel.writeInt(this.f2680v ? 1 : 0);
        int[] iArr = this.f2679i;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f2679i);
        }
    }
}
