package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d1 implements Parcelable {
    public static final Parcelable.Creator<d1> CREATOR = new af.m(17);
    public ArrayList E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f2116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f2117e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b[] f2118i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2119v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f2120w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList f2121x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f2122y;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeStringList(this.f2116d);
        parcel.writeStringList(this.f2117e);
        parcel.writeTypedArray(this.f2118i, i7);
        parcel.writeInt(this.f2119v);
        parcel.writeString(this.f2120w);
        parcel.writeStringList(this.f2121x);
        parcel.writeTypedList(this.f2122y);
        parcel.writeTypedList(this.E);
    }
}
