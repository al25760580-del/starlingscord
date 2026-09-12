package rf;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends bf.a {

    @NotNull
    public static final Parcelable.Creator<n> CREATOR = new b(13);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PendingIntent f19412d;

    public n(PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        this.f19412d = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int iT = ls.d.T(20293, dest);
        ls.d.N(dest, 1, this.f19412d, i7);
        ls.d.U(iT, dest);
    }
}
