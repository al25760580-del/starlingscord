package android.support.v4.media.session;

import a3.e;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a(4);
    public final long E;
    public final ArrayList F;
    public final long G;
    public final Bundle H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f686e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f687i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f688v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f689w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f690x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CharSequence f691y;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new c();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f692d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final CharSequence f693e;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f694i;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final Bundle f695v;

        public CustomAction(Parcel parcel) {
            this.f692d = parcel.readString();
            this.f693e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f694i = parcel.readInt();
            this.f695v = parcel.readBundle(b.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f693e) + ", mIcon=" + this.f694i + ", mExtras=" + this.f695v;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.f692d);
            TextUtils.writeToParcel(this.f693e, parcel, i7);
            parcel.writeInt(this.f694i);
            parcel.writeBundle(this.f695v);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f685d = parcel.readInt();
        this.f686e = parcel.readLong();
        this.f688v = parcel.readFloat();
        this.E = parcel.readLong();
        this.f687i = parcel.readLong();
        this.f689w = parcel.readLong();
        this.f691y = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.F = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.G = parcel.readLong();
        this.H = parcel.readBundle(b.class.getClassLoader());
        this.f690x = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f685d);
        sb2.append(", position=");
        sb2.append(this.f686e);
        sb2.append(", buffered position=");
        sb2.append(this.f687i);
        sb2.append(", speed=");
        sb2.append(this.f688v);
        sb2.append(", updated=");
        sb2.append(this.E);
        sb2.append(", actions=");
        sb2.append(this.f689w);
        sb2.append(", error code=");
        sb2.append(this.f690x);
        sb2.append(", error message=");
        sb2.append(this.f691y);
        sb2.append(", custom actions=");
        sb2.append(this.F);
        sb2.append(", active item id=");
        return e.n(sb2, this.G, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f685d);
        parcel.writeLong(this.f686e);
        parcel.writeFloat(this.f688v);
        parcel.writeLong(this.E);
        parcel.writeLong(this.f687i);
        parcel.writeLong(this.f689w);
        TextUtils.writeToParcel(this.f691y, parcel, i7);
        parcel.writeTypedList(this.F);
        parcel.writeLong(this.G);
        parcel.writeBundle(this.H);
        parcel.writeInt(this.f690x);
    }
}
