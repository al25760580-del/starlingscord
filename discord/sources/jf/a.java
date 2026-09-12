package jf;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import ls.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends bf.a {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new b(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13868d;

    public a(int i7) {
        this.f13868d = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int iT = d.T(20293, dest);
        d.S(dest, 1, 4);
        dest.writeInt(this.f13868d);
        d.U(iT, dest);
    }
}
