package xe;

import af.w;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends bf.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22910e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PendingIntent f22911i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f22912v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Integer f22913w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f22908x = new b(0, null, null);

    @NonNull
    public static final Parcelable.Creator<b> CREATOR = new rf.b(22);

    public b(int i7, int i10, PendingIntent pendingIntent, String str, Integer num) {
        this.f22909d = i7;
        this.f22910e = i10;
        this.f22911i = pendingIntent;
        this.f22912v = str;
        this.f22913w = num;
    }

    public static String h(int i7) {
        if (i7 == 99) {
            return "UNFINISHED";
        }
        if (i7 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i7) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i7) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 20);
                        sb2.append("UNKNOWN_ERROR_CODE(");
                        sb2.append(i7);
                        sb2.append(")");
                        return sb2.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f22910e == bVar.f22910e && w.j(this.f22911i, bVar.f22911i) && w.j(this.f22912v, bVar.f22912v) && w.j(this.f22913w, bVar.f22913w);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f22910e), this.f22911i, this.f22912v, this.f22913w});
    }

    public final String toString() {
        e4.e eVar = new e4.e(this);
        eVar.w(h(this.f22910e), "statusCode");
        eVar.w(this.f22911i, "resolution");
        eVar.w(this.f22912v, "message");
        eVar.w(this.f22913w, "clientMethodKey");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.S(parcel, 1, 4);
        parcel.writeInt(this.f22909d);
        ls.d.S(parcel, 2, 4);
        parcel.writeInt(this.f22910e);
        ls.d.N(parcel, 3, this.f22911i, i7);
        ls.d.O(this.f22912v, parcel, 4);
        ls.d.M(parcel, 5, this.f22913w);
        ls.d.U(iT, parcel);
    }

    public b(int i7, PendingIntent pendingIntent, String str) {
        this(1, i7, pendingIntent, str, null);
    }
}
