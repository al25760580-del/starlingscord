package qf;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public enum c implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PLATFORM("platform"),
    /* JADX INFO: Fake field, exist only in values array */
    CROSS_PLATFORM("cross-platform");


    @NonNull
    public static final Parcelable.Creator<c> CREATOR = new jf.b(12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18795d;

    c(String str) {
        this.f18795d = str;
    }

    public static c a(String str) {
        for (c cVar : values()) {
            if (str.equals(cVar.f18795d)) {
                return cVar;
            }
        }
        throw new b(s0.g.e("Attachment ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f18795d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f18795d);
    }
}
