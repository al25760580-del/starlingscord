package id;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cd.b {
    public static final Parcelable.Creator<e> CREATOR = new fd.a(22);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f11711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11712e;

    public e(float f2, int i7) {
        this.f11711d = f2;
        this.f11712e = i7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f11711d == eVar.f11711d && this.f11712e == eVar.f11712e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f11711d).hashCode() + 527) * 31) + this.f11712e;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f11711d + ", svcTemporalLayerCount=" + this.f11712e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeFloat(this.f11711d);
        parcel.writeInt(this.f11712e);
    }

    public e(Parcel parcel) {
        this.f11711d = parcel.readFloat();
        this.f11712e = parcel.readInt();
    }
}
