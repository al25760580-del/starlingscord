package com.google.android.gms.auth.api.signin;

import af.w;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bf.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import ls.d;
import te.c;

/* JADX INFO: loaded from: classes3.dex */
public class SignInAccount extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInAccount> CREATOR = new c(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final GoogleSignInAccount f5910e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f5911i;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f5910e = googleSignInAccount;
        w.e(str, "8.3 and 8.4 SDKs require non-null email");
        this.f5909d = str;
        w.e(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.f5911i = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = d.T(20293, parcel);
        d.O(this.f5909d, parcel, 4);
        d.N(parcel, 7, this.f5910e, i7);
        d.O(this.f5911i, parcel, 8);
        d.U(iT, parcel);
    }
}
