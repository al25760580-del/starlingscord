package jn;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new jf.b(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f13975e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f13976i;

    public a(String str, float f2, float f7) {
        this.f13974d = str;
        this.f13975e = f2;
        this.f13976i = f7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f13974d);
        parcel.writeFloat(this.f13975e);
        parcel.writeFloat(this.f13976i);
    }

    public a(Parcel parcel) {
        this.f13974d = parcel.readString();
        this.f13975e = parcel.readFloat();
        this.f13976i = parcel.readFloat();
    }
}
