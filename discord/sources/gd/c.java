package gd;

import a3.e;
import android.os.Parcel;
import android.os.Parcelable;
import gc.u0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements cd.b {
    public static final Parcelable.Creator<c> CREATOR = new fd.a(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f9961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9962e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f9963i;

    public c(String str, String str2, byte[] bArr) {
        this.f9961d = bArr;
        this.f9962e = str;
        this.f9963i = str2;
    }

    @Override // cd.b
    public final void b(u0 u0Var) {
        String str = this.f9962e;
        if (str != null) {
            u0Var.f9862a = str;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f9961d, ((c) obj).f9961d);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9961d);
    }

    public final String toString() {
        return kk.b.l(e.u("ICY: title=\"", this.f9962e, "\", url=\"", this.f9963i, "\", rawMetadata.length=\""), this.f9961d.length, "\"");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeByteArray(this.f9961d);
        parcel.writeString(this.f9962e);
        parcel.writeString(this.f9963i);
    }

    public c(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        bArrCreateByteArray.getClass();
        this.f9961d = bArrCreateByteArray;
        this.f9962e = parcel.readString();
        this.f9963i = parcel.readString();
    }
}
