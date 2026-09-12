package rf;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends bf.a {

    @NotNull
    public static final Parcelable.Creator<r> CREATOR = new b(17);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19414e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bundle f19415i;

    public r(String type, String str, Bundle requestData) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        this.f19413d = type;
        this.f19414e = str;
        this.f19415i = requestData;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int iT = ls.d.T(20293, dest);
        ls.d.O(this.f19413d, dest, 1);
        ls.d.O(this.f19414e, dest, 2);
        ls.d.K(dest, 3, this.f19415i);
        ls.d.U(iT, dest);
    }
}
