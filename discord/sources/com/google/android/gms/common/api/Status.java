package com.google.android.gms.common.api;

import af.w;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bf.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import e4.e;
import java.util.Arrays;
import ls.d;
import xe.b;
import ye.n;
import ye.q;

/* JADX INFO: loaded from: classes3.dex */
public final class Status extends a implements n, ReflectedParcelable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5937e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PendingIntent f5938i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b f5939v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Status f5933w = new Status(0, null, null, null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Status f5934x = new Status(14, null, null, null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Status f5935y = new Status(8, null, null, null);
    public static final Status E = new Status(15, null, null, null);
    public static final Status F = new Status(16, null, null, null);

    @NonNull
    public static final Parcelable.Creator<Status> CREATOR = new q(3);

    public Status(int i7, String str, PendingIntent pendingIntent, b bVar) {
        this.f5936d = i7;
        this.f5937e = str;
        this.f5938i = pendingIntent;
        this.f5939v = bVar;
    }

    @Override // ye.n
    public final Status a() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f5936d == status.f5936d && w.j(this.f5937e, status.f5937e) && w.j(this.f5938i, status.f5938i) && w.j(this.f5939v, status.f5939v);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5936d), this.f5937e, this.f5938i, this.f5939v});
    }

    public final String toString() {
        e eVar = new e(this);
        String string = this.f5937e;
        if (string == null) {
            int i7 = this.f5936d;
            switch (i7) {
                case -1:
                    string = "SUCCESS_CACHE";
                    break;
                case 0:
                    string = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 21);
                    sb2.append("unknown status code: ");
                    sb2.append(i7);
                    string = sb2.toString();
                    break;
                case 2:
                    string = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    string = "SERVICE_DISABLED";
                    break;
                case 4:
                    string = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    string = "INVALID_ACCOUNT";
                    break;
                case 6:
                    string = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    string = "NETWORK_ERROR";
                    break;
                case 8:
                    string = "INTERNAL_ERROR";
                    break;
                case 10:
                    string = "DEVELOPER_ERROR";
                    break;
                case 13:
                    string = "ERROR";
                    break;
                case 14:
                    string = "INTERRUPTED";
                    break;
                case 15:
                    string = "TIMEOUT";
                    break;
                case 16:
                    string = "CANCELED";
                    break;
                case 17:
                    string = "API_NOT_CONNECTED";
                    break;
                case 18:
                    string = "DEAD_CLIENT";
                    break;
                case 19:
                    string = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    string = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    string = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    string = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        eVar.w(string, "statusCode");
        eVar.w(this.f5938i, "resolution");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = d.T(20293, parcel);
        d.S(parcel, 1, 4);
        parcel.writeInt(this.f5936d);
        d.O(this.f5937e, parcel, 2);
        d.N(parcel, 3, this.f5938i, i7);
        d.N(parcel, 4, this.f5939v, i7);
        d.U(iT, parcel);
    }
}
