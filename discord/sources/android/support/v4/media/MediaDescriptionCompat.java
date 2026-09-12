package android.support.v4.media;

import af.m;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new m(9);
    public final Uri E;
    public MediaDescription F;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f666e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f667i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CharSequence f668v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Bitmap f669w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Uri f670x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Bundle f671y;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f665d = str;
        this.f666e = charSequence;
        this.f667i = charSequence2;
        this.f668v = charSequence3;
        this.f669w = bitmap;
        this.f670x = uri;
        this.f671y = bundle;
        this.E = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f666e) + ", " + ((Object) this.f667i) + ", " + ((Object) this.f668v);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        MediaDescription mediaDescriptionA = this.F;
        if (mediaDescriptionA == null) {
            MediaDescription.Builder builderB = a.b();
            a.n(builderB, this.f665d);
            a.p(builderB, this.f666e);
            a.o(builderB, this.f667i);
            a.j(builderB, this.f668v);
            a.l(builderB, this.f669w);
            a.m(builderB, this.f670x);
            a.k(builderB, this.f671y);
            b.b(builderB, this.E);
            mediaDescriptionA = a.a(builderB);
            this.F = mediaDescriptionA;
        }
        mediaDescriptionA.writeToParcel(parcel, i7);
    }
}
