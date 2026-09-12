package rf;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends bf.a {

    @NotNull
    public static final Parcelable.Creator<j> CREATOR = new b(8);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f19408d;

    public j(Bundle responseBundle) {
        Intrinsics.checkNotNullParameter(responseBundle, "responseBundle");
        this.f19408d = responseBundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int iT = ls.d.T(20293, dest);
        ls.d.K(dest, 1, this.f19408d);
        ls.d.U(iT, dest);
    }
}
