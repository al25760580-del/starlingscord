package re;

import af.w;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import qf.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends bf.a {

    @NonNull
    public static final Parcelable.Creator<f> CREATOR = new s0(24);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PendingIntent f19380d;

    public f(PendingIntent pendingIntent) {
        w.g(pendingIntent);
        this.f19380d = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.N(parcel, 1, this.f19380d, i7);
        ls.d.U(iT, parcel);
    }
}
