package qf;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends bf.a {

    @NonNull
    public static final Parcelable.Creator<r> CREATOR = new s0(22);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18858d;

    public r(String str) {
        af.w.g(str);
        this.f18858d = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f18858d.equals(((r) obj).f18858d);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18858d});
    }

    public final String toString() {
        return com.discord.chat.presentation.list.a.k(new StringBuilder("FidoAppIdExtension{appid='"), this.f18858d, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.O(this.f18858d, parcel, 2);
        ls.d.U(iT, parcel);
    }
}
