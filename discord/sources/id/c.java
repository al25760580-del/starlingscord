package id;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new fd.a(21);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11708e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f11709i;

    public c(int i7, long j, long j5) {
        je.b.g(j < j5);
        this.f11707d = j;
        this.f11708e = j5;
        this.f11709i = i7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f11707d == cVar.f11707d && this.f11708e == cVar.f11708e && this.f11709i == cVar.f11709i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11707d), Long.valueOf(this.f11708e), Integer.valueOf(this.f11709i)});
    }

    public final String toString() {
        int i7 = e0.f13788a;
        Locale locale = Locale.US;
        StringBuilder sbM = kk.b.m(this.f11707d, "Segment: startTimeMs=", ", endTimeMs=");
        sbM.append(this.f11708e);
        sbM.append(", speedDivisor=");
        sbM.append(this.f11709i);
        return sbM.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f11707d);
        parcel.writeLong(this.f11708e);
        parcel.writeInt(this.f11709i);
    }
}
