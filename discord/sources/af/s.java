package af;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends bf.a {
    public static final Parcelable.Creator<s> CREATOR = new m(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Account f477e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f478i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final GoogleSignInAccount f479v;

    public s(int i7, Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this.f476d = i7;
        this.f477e = account;
        this.f478i = i10;
        this.f479v = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.S(parcel, 1, 4);
        parcel.writeInt(this.f476d);
        ls.d.N(parcel, 2, this.f477e, i7);
        ls.d.S(parcel, 3, 4);
        parcel.writeInt(this.f478i);
        ls.d.N(parcel, 4, this.f479v, i7);
        ls.d.U(iT, parcel);
    }
}
