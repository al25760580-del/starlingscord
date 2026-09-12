package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f681e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f682i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f683v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f684w;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f680d);
        parcel.writeInt(this.f682i);
        parcel.writeInt(this.f683v);
        parcel.writeInt(this.f684w);
        parcel.writeInt(this.f681e);
    }
}
