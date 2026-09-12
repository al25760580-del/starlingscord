package fd;

import a3.e;
import android.os.Parcel;
import android.os.Parcelable;
import gc.u0;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public class c implements cd.b {
    public static final Parcelable.Creator<c> CREATOR = new a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9063e;

    public c(String str, String str2) {
        this.f9062d = str;
        this.f9063e = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // cd.b
    public final void b(u0 u0Var) {
        String str = this.f9062d;
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    b10 = 0;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    b10 = 1;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    b10 = 2;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    b10 = 3;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    b10 = 4;
                }
                break;
        }
        String str2 = this.f9063e;
        switch (b10) {
            case 0:
                u0Var.f9864c = str2;
                break;
            case 1:
                u0Var.f9862a = str2;
                break;
            case 2:
                u0Var.f9868g = str2;
                break;
            case 3:
                u0Var.f9865d = str2;
                break;
            case 4:
                u0Var.f9863b = str2;
                break;
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
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f9062d.equals(cVar.f9062d) && this.f9063e.equals(cVar.f9063e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9063e.hashCode() + e.d(527, 31, this.f9062d);
    }

    public final String toString() {
        return "VC: " + this.f9062d + "=" + this.f9063e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f9062d);
        parcel.writeString(this.f9063e);
    }

    public c(Parcel parcel) {
        String string = parcel.readString();
        int i7 = e0.f13788a;
        this.f9062d = string;
        this.f9063e = parcel.readString();
    }
}
