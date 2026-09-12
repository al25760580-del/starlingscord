package rf;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends bf.a {

    @NotNull
    public static final Parcelable.Creator<q> CREATOR = new b(16);

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        ls.d.U(ls.d.T(20293, dest), dest);
    }
}
