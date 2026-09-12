package rf;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends bf.a {

    @NotNull
    public static final Parcelable.Creator<l> CREATOR = new b(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f19410d;

    public l(Bundle responseBundle) {
        Intrinsics.checkNotNullParameter(responseBundle, "responseBundle");
        this.f19410d = responseBundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int iT = ls.d.T(20293, dest);
        ls.d.K(dest, 1, this.f19410d);
        ls.d.U(iT, dest);
    }
}
