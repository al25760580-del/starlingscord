package rf;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends bf.a {

    @NotNull
    public static final Parcelable.Creator<d> CREATOR = new b(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19390d;

    public d(boolean z5) {
        this.f19390d = z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int iT = ls.d.T(20293, dest);
        ls.d.S(dest, 1, 4);
        dest.writeInt(this.f19390d ? 1 : 0);
        ls.d.U(iT, dest);
    }
}
