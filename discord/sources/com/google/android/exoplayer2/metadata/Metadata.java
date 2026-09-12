package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import cd.a;
import cd.b;
import java.util.Arrays;
import java.util.List;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b[] f5693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5694e;

    public Metadata(b... bVarArr) {
        this(-9223372036854775807L, bVarArr);
    }

    public final Metadata a(b... bVarArr) {
        if (bVarArr.length == 0) {
            return this;
        }
        int i7 = e0.f13788a;
        b[] bVarArr2 = this.f5693d;
        Object[] objArrCopyOf = Arrays.copyOf(bVarArr2, bVarArr2.length + bVarArr.length);
        System.arraycopy(bVarArr, 0, objArrCopyOf, bVarArr2.length, bVarArr.length);
        return new Metadata(this.f5694e, (b[]) objArrCopyOf);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Metadata.class == obj.getClass()) {
            Metadata metadata = (Metadata) obj;
            if (Arrays.equals(this.f5693d, metadata.f5693d) && this.f5694e == metadata.f5694e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return sa.a.r(this.f5694e) + (Arrays.hashCode(this.f5693d) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.f5693d));
        long j = this.f5694e;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        b[] bVarArr = this.f5693d;
        parcel.writeInt(bVarArr.length);
        for (b bVar : bVarArr) {
            parcel.writeParcelable(bVar, 0);
        }
        parcel.writeLong(this.f5694e);
    }

    public Metadata(long j, b... bVarArr) {
        this.f5694e = j;
        this.f5693d = bVarArr;
    }

    public Metadata(List list) {
        this((b[]) list.toArray(new b[0]));
    }

    public Metadata(Parcel parcel) {
        this.f5693d = new b[parcel.readInt()];
        int i7 = 0;
        while (true) {
            b[] bVarArr = this.f5693d;
            if (i7 < bVarArr.length) {
                bVarArr[i7] = (b) parcel.readParcelable(b.class.getClassLoader());
                i7++;
            } else {
                this.f5694e = parcel.readLong();
                return;
            }
        }
    }
}
