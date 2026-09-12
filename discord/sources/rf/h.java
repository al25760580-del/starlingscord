package rf;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends bf.a {

    @NotNull
    public static final Parcelable.Creator<h> CREATOR = new b(6);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f19401e;

    public h(String type, Bundle data) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f19400d = type;
        this.f19401e = data;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int iT = ls.d.T(20293, dest);
        ls.d.O(this.f19400d, dest, 1);
        ls.d.K(dest, 2, this.f19401e);
        ls.d.U(iT, dest);
    }
}
