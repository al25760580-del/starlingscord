package ed;

import af.m;
import android.os.Parcel;
import android.os.Parcelable;
import cd.b;
import com.google.android.exoplayer2.Format;
import gc.g0;
import java.util.Arrays;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements b {
    public static final Parcelable.Creator<a> CREATOR;
    public static final Format E;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Format f8130y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f8132e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f8133i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f8134v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final byte[] f8135w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8136x;

    static {
        g0 g0Var = new g0();
        g0Var.k = "application/id3";
        f8130y = new Format(g0Var);
        g0 g0Var2 = new g0();
        g0Var2.k = "application/x-scte35";
        E = new Format(g0Var2);
        CREATOR = new m(26);
    }

    public a(String str, String str2, long j, long j5, byte[] bArr) {
        this.f8131d = str;
        this.f8132e = str2;
        this.f8133i = j;
        this.f8134v = j5;
        this.f8135w = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // cd.b
    public final Format e() {
        String str = this.f8131d;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return E;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f8130y;
            default:
                return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f8133i == aVar.f8133i && this.f8134v == aVar.f8134v && e0.a(this.f8131d, aVar.f8131d) && e0.a(this.f8132e, aVar.f8132e) && Arrays.equals(this.f8135w, aVar.f8135w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f8136x == 0) {
            String str = this.f8131d;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f8132e;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.f8133i;
            int i7 = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j5 = this.f8134v;
            this.f8136x = Arrays.hashCode(this.f8135w) + ((i7 + ((int) (j5 ^ (j5 >>> 32)))) * 31);
        }
        return this.f8136x;
    }

    @Override // cd.b
    public final byte[] t() {
        if (e() != null) {
            return this.f8135w;
        }
        return null;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f8131d + ", id=" + this.f8134v + ", durationMs=" + this.f8133i + ", value=" + this.f8132e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f8131d);
        parcel.writeString(this.f8132e);
        parcel.writeLong(this.f8133i);
        parcel.writeLong(this.f8134v);
        parcel.writeByteArray(this.f8135w);
    }

    public a(Parcel parcel) {
        String string = parcel.readString();
        int i7 = e0.f13788a;
        this.f8131d = string;
        this.f8132e = parcel.readString();
        this.f8133i = parcel.readLong();
        this.f8134v = parcel.readLong();
        this.f8135w = parcel.createByteArray();
    }
}
