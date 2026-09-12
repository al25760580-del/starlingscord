package qf;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public enum e0 implements Parcelable {
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");


    @NonNull
    public static final Parcelable.Creator<e0> CREATOR = new jf.b(29);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18805d;

    e0(String str) {
        this.f18805d = str;
    }

    public static e0 a(String str) {
        for (e0 e0Var : values()) {
            if (str.equals(e0Var.f18805d)) {
                return e0Var;
            }
        }
        throw new d0(s0.g.e("Resident key requirement ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f18805d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f18805d);
    }
}
