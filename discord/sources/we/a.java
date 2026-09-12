package we;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends bf.a {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new b(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Intent f22193d;

    public a(Intent intent) {
        this.f22193d = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.N(parcel, 1, this.f22193d, i7);
        ls.d.U(iT, parcel);
    }
}
