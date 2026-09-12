package jd;

import android.os.Parcel;
import android.os.Parcelable;
import je.w;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends b {
    public static final Parcelable.Creator<j> CREATOR = new fd.a(29);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f13753e;

    public j(long j, long j5) {
        this.f13752d = j;
        this.f13753e = j5;
    }

    public static long a(long j, w wVar) {
        long jU = wVar.u();
        if ((128 & jU) != 0) {
            return 8589934591L & ((((jU & 1) << 32) | wVar.v()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // jd.b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb2.append(this.f13752d);
        sb2.append(", playbackPositionUs= ");
        return a3.e.n(sb2, this.f13753e, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f13752d);
        parcel.writeLong(this.f13753e);
    }
}
