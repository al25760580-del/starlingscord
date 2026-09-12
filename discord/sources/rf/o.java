package rf;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends bf.a {

    @NotNull
    public static final Parcelable.Creator<o> CREATOR = new b(14);

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        ls.d.U(ls.d.T(20293, dest), dest);
    }
}
