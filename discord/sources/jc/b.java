package jc;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements cd.b {
    public static final Parcelable.Creator<b> CREATOR = new fd.a(24);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f13722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f13723e;

    public b(float f2, float f7) {
        je.b.f("Invalid latitude or longitude", f2 >= -90.0f && f2 <= 90.0f && f7 >= -180.0f && f7 <= 180.0f);
        this.f13722d = f2;
        this.f13723e = f7;
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
            if (this.f13722d == bVar.f13722d && this.f13723e == bVar.f13723e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f13723e).hashCode() + ((Float.valueOf(this.f13722d).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f13722d + ", longitude=" + this.f13723e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeFloat(this.f13722d);
        parcel.writeFloat(this.f13723e);
    }

    public b(Parcel parcel) {
        this.f13722d = parcel.readFloat();
        this.f13723e = parcel.readFloat();
    }
}
