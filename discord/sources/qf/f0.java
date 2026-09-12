package qf;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public enum f0 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PRESENT("present"),
    /* JADX INFO: Fake field, exist only in values array */
    SUPPORTED("supported"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_SUPPORTED("not-supported");


    @NonNull
    public static final Parcelable.Creator<f0> CREATOR = new s0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18812d;

    f0(String str) {
        this.f18812d = str;
    }

    public static f0 a(String str) throws g0 {
        for (f0 f0Var : values()) {
            if (str.equals(f0Var.f18812d)) {
                return f0Var;
            }
        }
        throw new g0(s0.g.e("TokenBindingStatus ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f18812d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f18812d);
    }
}
