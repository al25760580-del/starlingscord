package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class x0 implements Parcelable {
    public static final Parcelable.Creator<x0> CREATOR = new af.m(16);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f2270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2271e;

    public x0(String str, int i7) {
        this.f2270d = str;
        this.f2271e = i7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f2270d);
        parcel.writeInt(this.f2271e);
    }
}
