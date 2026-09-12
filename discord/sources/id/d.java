package id;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements cd.b {
    public static final Parcelable.Creator<d> CREATOR = new fd.a(20);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f11710d;

    public d(ArrayList arrayList) {
        this.f11710d = arrayList;
        boolean z5 = false;
        if (!arrayList.isEmpty()) {
            long j = ((c) arrayList.get(0)).f11708e;
            for (int i7 = 1; i7 < arrayList.size(); i7++) {
                if (((c) arrayList.get(i7)).f11707d < j) {
                    z5 = true;
                    break;
                }
                j = ((c) arrayList.get(i7)).f11708e;
            }
        }
        je.b.g(!z5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f11710d.equals(((d) obj).f11710d);
    }

    public final int hashCode() {
        return this.f11710d.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f11710d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeList(this.f11710d);
    }
}
