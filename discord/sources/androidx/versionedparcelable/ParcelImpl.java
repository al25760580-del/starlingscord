package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import jf.b;
import o3.c;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new b(10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f2805d;

    public ParcelImpl(Parcel parcel) {
        this.f2805d = new o3.b(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        new o3.b(parcel).l(this.f2805d);
    }
}
