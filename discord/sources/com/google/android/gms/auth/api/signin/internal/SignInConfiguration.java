package com.google.android.gms.auth.api.signin.internal;

import af.w;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bf.a;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import ls.d;
import rf.b;

/* JADX INFO: loaded from: classes3.dex */
public final class SignInConfiguration extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new b(20);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final GoogleSignInOptions f5913e;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        w.d(str);
        this.f5912d = str;
        this.f5913e = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        GoogleSignInOptions googleSignInOptions = signInConfiguration.f5913e;
        if (this.f5912d.equals(signInConfiguration.f5912d)) {
            GoogleSignInOptions googleSignInOptions2 = this.f5913e;
            if (googleSignInOptions2 == null) {
                if (googleSignInOptions == null) {
                    return true;
                }
            } else if (googleSignInOptions2.equals(googleSignInOptions)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = 1 * 31;
        String str = this.f5912d;
        int iHashCode = (i7 + (str == null ? 0 : str.hashCode())) * 31;
        GoogleSignInOptions googleSignInOptions = this.f5913e;
        return iHashCode + (googleSignInOptions != null ? googleSignInOptions.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = d.T(20293, parcel);
        d.O(this.f5912d, parcel, 2);
        d.N(parcel, 5, this.f5913e, i7);
        d.U(iT, parcel);
    }
}
