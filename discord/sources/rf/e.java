package rf;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends bf.a {

    @NotNull
    public static final Parcelable.Creator<e> CREATOR = new b(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19391d;

    public e(boolean z5) {
        this.f19391d = z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int iT = ls.d.T(20293, dest);
        ls.d.S(dest, 1, 4);
        dest.writeInt(this.f19391d ? 1 : 0);
        ls.d.U(iT, dest);
    }
}
