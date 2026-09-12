package id;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements cd.b {
    public static final Parcelable.Creator<b> CREATOR = new fd.a(19);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11703e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f11704i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f11705v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f11706w;

    public b(long j, long j5, long j7, long j10, long j11) {
        this.f11702d = j;
        this.f11703e = j5;
        this.f11704i = j7;
        this.f11705v = j10;
        this.f11706w = j11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f11702d == bVar.f11702d && this.f11703e == bVar.f11703e && this.f11704i == bVar.f11704i && this.f11705v == bVar.f11705v && this.f11706w == bVar.f11706w) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return sa.a.r(this.f11706w) + ((sa.a.r(this.f11705v) + ((sa.a.r(this.f11704i) + ((sa.a.r(this.f11703e) + ((sa.a.r(this.f11702d) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f11702d + ", photoSize=" + this.f11703e + ", photoPresentationTimestampUs=" + this.f11704i + ", videoStartPosition=" + this.f11705v + ", videoSize=" + this.f11706w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f11702d);
        parcel.writeLong(this.f11703e);
        parcel.writeLong(this.f11704i);
        parcel.writeLong(this.f11705v);
        parcel.writeLong(this.f11706w);
    }

    public b(Parcel parcel) {
        this.f11702d = parcel.readLong();
        this.f11703e = parcel.readLong();
        this.f11704i = parcel.readLong();
        this.f11705v = parcel.readLong();
        this.f11706w = parcel.readLong();
    }
}
