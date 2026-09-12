package rf;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends bf.a {

    @NotNull
    public static final Parcelable.Creator<m> CREATOR = new b(12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PendingIntent f19411d;

    public m(PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        this.f19411d = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int iT = ls.d.T(20293, dest);
        ls.d.N(dest, 1, this.f19411d, i7);
        ls.d.U(iT, dest);
    }
}
