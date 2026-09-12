package gd;

import a3.e;
import android.os.Parcel;
import android.os.Parcelable;
import gc.u0;
import java.util.List;
import java.util.Map;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements cd.b {
    public static final Parcelable.Creator<b> CREATOR = new fd.a(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9956e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f9957i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f9958v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f9959w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f9960x;

    public b(String str, String str2, String str3, int i7, int i10, boolean z5) {
        je.b.g(i10 == -1 || i10 > 0);
        this.f9955d = i7;
        this.f9956e = str;
        this.f9957i = str2;
        this.f9958v = str3;
        this.f9959w = z5;
        this.f9960x = i10;
    }

    public static b a(Map map) {
        boolean z5;
        int i7;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i10;
        List list = (List) map.get("icy-br");
        boolean z6 = true;
        int i11 = -1;
        if (list != null) {
            String str4 = (String) list.get(0);
            try {
                i10 = Integer.parseInt(str4) * 1000;
                if (i10 > 0) {
                    z5 = true;
                } else {
                    try {
                        je.b.N("IcyHeaders", "Invalid bitrate: " + str4);
                        z5 = false;
                        i10 = -1;
                    } catch (NumberFormatException unused) {
                        e.y("Invalid bitrate header: ", str4, "IcyHeaders");
                        z5 = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i10 = -1;
            }
            i7 = i10;
        } else {
            z5 = false;
            i7 = -1;
        }
        List list2 = (List) map.get("icy-genre");
        if (list2 != null) {
            str = (String) list2.get(0);
            z5 = true;
        } else {
            str = null;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str2 = (String) list3.get(0);
            z5 = true;
        } else {
            str2 = null;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str3 = (String) list4.get(0);
            z5 = true;
        } else {
            str3 = null;
        }
        List list5 = (List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals("1");
            z5 = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            String str5 = (String) list6.get(0);
            try {
                int i12 = Integer.parseInt(str5);
                if (i12 > 0) {
                    i11 = i12;
                } else {
                    try {
                        je.b.N("IcyHeaders", "Invalid metadata interval: " + str5);
                        z6 = z5;
                    } catch (NumberFormatException unused3) {
                        i11 = i12;
                        e.y("Invalid metadata interval: ", str5, "IcyHeaders");
                    }
                }
                z5 = z6;
            } catch (NumberFormatException unused4) {
            }
        }
        int i13 = i11;
        if (z5) {
            return new b(str, str2, str3, i7, i13, zEquals);
        }
        return null;
    }

    @Override // cd.b
    public final void b(u0 u0Var) {
        String str = this.f9957i;
        if (str != null) {
            u0Var.E = str;
        }
        String str2 = this.f9956e;
        if (str2 != null) {
            u0Var.C = str2;
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
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f9955d == bVar.f9955d && e0.a(this.f9956e, bVar.f9956e) && e0.a(this.f9957i, bVar.f9957i) && e0.a(this.f9958v, bVar.f9958v) && this.f9959w == bVar.f9959w && this.f9960x == bVar.f9960x) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = (527 + this.f9955d) * 31;
        String str = this.f9956e;
        int iHashCode = (i7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9957i;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9958v;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f9959w ? 1 : 0)) * 31) + this.f9960x;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f9957i + "\", genre=\"" + this.f9956e + "\", bitrate=" + this.f9955d + ", metadataInterval=" + this.f9960x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f9955d);
        parcel.writeString(this.f9956e);
        parcel.writeString(this.f9957i);
        parcel.writeString(this.f9958v);
        int i10 = e0.f13788a;
        parcel.writeInt(this.f9959w ? 1 : 0);
        parcel.writeInt(this.f9960x);
    }

    public b(Parcel parcel) {
        this.f9955d = parcel.readInt();
        this.f9956e = parcel.readString();
        this.f9957i = parcel.readString();
        this.f9958v = parcel.readString();
        int i7 = e0.f13788a;
        this.f9959w = parcel.readInt() != 0;
        this.f9960x = parcel.readInt();
    }
}
