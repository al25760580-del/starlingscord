package rf;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends bf.a {

    @NotNull
    public static final Parcelable.Creator<f> CREATOR = new b(4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PendingIntent f19392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f19393e;

    public f(PendingIntent pendingIntent, h hVar) {
        this.f19392d = pendingIntent;
        this.f19393e = hVar;
        if (pendingIntent == null && hVar == null) {
            throw new IllegalArgumentException("pendingIntent or createCredentialResponse must be specified.");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int iT = ls.d.T(20293, dest);
        ls.d.N(dest, 1, this.f19392d, i7);
        ls.d.N(dest, 2, this.f19393e, i7);
        ls.d.U(iT, dest);
    }
}
