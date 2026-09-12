package te;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import m3.m;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20737a;

    public /* synthetic */ c(int i7) {
        this.f20737a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f20737a) {
            case 0:
                int iW = m.W(parcel);
                String strQ = null;
                String strQ2 = null;
                String strQ3 = null;
                String strQ4 = null;
                Uri uri = null;
                String strQ5 = null;
                String strQ6 = null;
                ArrayList arrayListT = null;
                String strQ7 = null;
                String strQ8 = null;
                long jN = 0;
                int iL = 0;
                while (parcel.dataPosition() < iW) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 1:
                            iL = m.L(i7, parcel);
                            break;
                        case 2:
                            strQ = m.q(i7, parcel);
                            break;
                        case 3:
                            strQ2 = m.q(i7, parcel);
                            break;
                        case 4:
                            strQ3 = m.q(i7, parcel);
                            break;
                        case 5:
                            strQ4 = m.q(i7, parcel);
                            break;
                        case 6:
                            uri = (Uri) m.p(parcel, i7, Uri.CREATOR);
                            break;
                        case 7:
                            strQ5 = m.q(i7, parcel);
                            break;
                        case '\b':
                            jN = m.N(i7, parcel);
                            break;
                        case '\t':
                            strQ6 = m.q(i7, parcel);
                            break;
                        case '\n':
                            arrayListT = m.t(parcel, i7, Scope.CREATOR);
                            break;
                        case 11:
                            strQ7 = m.q(i7, parcel);
                            break;
                        case '\f':
                            strQ8 = m.q(i7, parcel);
                            break;
                        default:
                            m.S(i7, parcel);
                            break;
                    }
                }
                m.v(iW, parcel);
                return new GoogleSignInAccount(iL, strQ, strQ2, strQ3, strQ4, uri, strQ5, jN, strQ6, arrayListT, strQ7, strQ8);
            case 1:
                int iW2 = m.W(parcel);
                ArrayList arrayListT2 = null;
                ArrayList arrayListT3 = null;
                Account account = null;
                String strQ9 = null;
                String strQ10 = null;
                String strQ11 = null;
                int iL2 = 0;
                boolean zJ = false;
                boolean zJ2 = false;
                boolean zJ3 = false;
                while (parcel.dataPosition() < iW2) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            iL2 = m.L(i10, parcel);
                            break;
                        case 2:
                            arrayListT3 = m.t(parcel, i10, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) m.p(parcel, i10, Account.CREATOR);
                            break;
                        case 4:
                            zJ = m.J(i10, parcel);
                            break;
                        case 5:
                            zJ2 = m.J(i10, parcel);
                            break;
                        case 6:
                            zJ3 = m.J(i10, parcel);
                            break;
                        case 7:
                            strQ9 = m.q(i10, parcel);
                            break;
                        case '\b':
                            strQ10 = m.q(i10, parcel);
                            break;
                        case '\t':
                            arrayListT2 = m.t(parcel, i10, ue.a.CREATOR);
                            break;
                        case '\n':
                            strQ11 = m.q(i10, parcel);
                            break;
                        default:
                            m.S(i10, parcel);
                            break;
                    }
                }
                m.v(iW2, parcel);
                return new GoogleSignInOptions(iL2, arrayListT3, account, zJ, zJ2, zJ3, strQ9, strQ10, GoogleSignInOptions.i(arrayListT2), strQ11);
            default:
                int iW3 = m.W(parcel);
                String strQ12 = "";
                GoogleSignInAccount googleSignInAccount = null;
                String strQ13 = "";
                while (parcel.dataPosition() < iW3) {
                    int i11 = parcel.readInt();
                    char c8 = (char) i11;
                    if (c8 == 4) {
                        strQ12 = m.q(i11, parcel);
                    } else if (c8 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) m.p(parcel, i11, GoogleSignInAccount.CREATOR);
                    } else if (c8 != '\b') {
                        m.S(i11, parcel);
                    } else {
                        strQ13 = m.q(i11, parcel);
                    }
                }
                m.v(iW3, parcel);
                return new SignInAccount(strQ12, googleSignInAccount, strQ13);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.f20737a) {
            case 0:
                return new GoogleSignInAccount[i7];
            case 1:
                return new GoogleSignInOptions[i7];
            default:
                return new SignInAccount[i7];
        }
    }
}
