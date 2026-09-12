package mc;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new jf.b(6);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final UUID f15554e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f15555i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f15556v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final byte[] f15557w;

    public h(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f15554e = uuid;
        this.f15555i = str;
        str2.getClass();
        this.f15556v = str2;
        this.f15557w = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = gc.h.f9669a;
        UUID uuid3 = this.f15554e;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        h hVar = (h) obj;
        return je.e0.a(this.f15555i, hVar.f15555i) && je.e0.a(this.f15556v, hVar.f15556v) && je.e0.a(this.f15554e, hVar.f15554e) && Arrays.equals(this.f15557w, hVar.f15557w);
    }

    public final int hashCode() {
        if (this.f15553d == 0) {
            int iHashCode = this.f15554e.hashCode() * 31;
            String str = this.f15555i;
            this.f15553d = Arrays.hashCode(this.f15557w) + a3.e.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f15556v);
        }
        return this.f15553d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        UUID uuid = this.f15554e;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f15555i);
        parcel.writeString(this.f15556v);
        parcel.writeByteArray(this.f15557w);
    }

    public h(Parcel parcel) {
        this.f15554e = new UUID(parcel.readLong(), parcel.readLong());
        this.f15555i = parcel.readString();
        String string = parcel.readString();
        int i7 = je.e0.f13788a;
        this.f15556v = string;
        this.f15557w = parcel.createByteArray();
    }
}
