package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class s1 implements Parcelable {
    public static final Parcelable.Creator<s1> CREATOR = new q1(1);
    public boolean E;
    public boolean F;
    public boolean G;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2683e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2684i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int[] f2685v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2686w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int[] f2687x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f2688y;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f2682d);
        parcel.writeInt(this.f2683e);
        parcel.writeInt(this.f2684i);
        if (this.f2684i > 0) {
            parcel.writeIntArray(this.f2685v);
        }
        parcel.writeInt(this.f2686w);
        if (this.f2686w > 0) {
            parcel.writeIntArray(this.f2687x);
        }
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeInt(this.F ? 1 : 0);
        parcel.writeInt(this.G ? 1 : 0);
        parcel.writeList(this.f2688y);
    }
}
