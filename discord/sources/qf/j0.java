package qf;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public enum j0 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_REQUIRED("required"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_PREFERRED("preferred"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_DISCOURAGED("discouraged");


    @NonNull
    public static final Parcelable.Creator<j0> CREATOR = new s0(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18830d;

    j0(String str) {
        this.f18830d = str;
    }

    public static j0 a(String str) throws t0 {
        for (j0 j0Var : values()) {
            if (str.equals(j0Var.f18830d)) {
                return j0Var;
            }
        }
        throw new t0(s0.g.e("User verification requirement ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f18830d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f18830d);
    }
}
