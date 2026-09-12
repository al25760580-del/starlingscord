package qf;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends bf.a {

    @NonNull
    public static final Parcelable.Creator<y> CREATOR = new jf.b(26);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18892e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f18893i;

    public y(String str, String str2, String str3) {
        af.w.g(str);
        this.f18891d = str;
        af.w.g(str2);
        this.f18892e = str2;
        this.f18893i = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return af.w.j(this.f18891d, yVar.f18891d) && af.w.j(this.f18892e, yVar.f18892e) && af.w.j(this.f18893i, yVar.f18893i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18891d, this.f18892e, this.f18893i});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f18891d);
        sb2.append("', \n name='");
        sb2.append(this.f18892e);
        sb2.append("', \n icon='");
        return com.discord.chat.presentation.list.a.k(sb2, this.f18893i, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.O(this.f18891d, parcel, 2);
        ls.d.O(this.f18892e, parcel, 3);
        ls.d.O(this.f18893i, parcel, 4);
        ls.d.U(iT, parcel);
    }
}
