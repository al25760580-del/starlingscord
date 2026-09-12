package android.support.v4.media;

import af.m;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new m(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f674e;

    public RatingCompat(int i7, float f2) {
        this.f673d = i7;
        this.f674e = f2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f673d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.f673d);
        sb2.append(" rating=");
        float f2 = this.f674e;
        sb2.append(f2 < 0.0f ? "unrated" : String.valueOf(f2));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f673d);
        parcel.writeFloat(this.f674e);
    }
}
