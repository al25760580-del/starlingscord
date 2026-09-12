package jc;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements cd.b {
    public static final Parcelable.Creator<a> CREATOR = new fd.a(23);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13721d;

    public a(long j) {
        this.f13721d = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f13721d == ((a) obj).f13721d;
        }
        return false;
    }

    public final int hashCode() {
        return sa.a.r(this.f13721d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Creation time: ");
        long j = this.f13721d;
        sb2.append(j == -2082844800000L ? "unset" : Long.valueOf(j));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f13721d);
    }

    public a(Parcel parcel) {
        this.f13721d = parcel.readLong();
    }
}
