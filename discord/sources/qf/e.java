package qf;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.facebook.react.uimanager.ViewProps;

/* JADX INFO: loaded from: classes3.dex */
public enum e implements Parcelable {
    NONE(ViewProps.NONE),
    /* JADX INFO: Fake field, exist only in values array */
    INDIRECT("indirect"),
    /* JADX INFO: Fake field, exist only in values array */
    DIRECT("direct");


    @NonNull
    public static final Parcelable.Creator<e> CREATOR = new s0(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18801d;

    e(String str) {
        this.f18801d = str;
    }

    public static e a(String str) throws d {
        for (e eVar : values()) {
            if (str.equals(eVar.f18801d)) {
                return eVar;
            }
        }
        throw new d(s0.g.e("Attestation conveyance preference ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f18801d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f18801d);
    }
}
