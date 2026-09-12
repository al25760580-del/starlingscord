package rf;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19389a;

    public /* synthetic */ b(int i7) {
        this.f19389a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f19389a) {
            case 0:
                int iW = m3.m.W(parcel);
                boolean zJ = false;
                while (parcel.dataPosition() < iW) {
                    int i7 = parcel.readInt();
                    if (((char) i7) != 1) {
                        m3.m.S(i7, parcel);
                    } else {
                        zJ = m3.m.J(i7, parcel);
                    }
                }
                m3.m.v(iW, parcel);
                return new a(zJ);
            case 1:
                int iW2 = m3.m.W(parcel);
                while (parcel.dataPosition() < iW2) {
                    m3.m.S(parcel.readInt(), parcel);
                }
                m3.m.v(iW2, parcel);
                return new c();
            case 2:
                int iW3 = m3.m.W(parcel);
                boolean zJ2 = false;
                while (parcel.dataPosition() < iW3) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        m3.m.S(i10, parcel);
                    } else {
                        zJ2 = m3.m.J(i10, parcel);
                    }
                }
                m3.m.v(iW3, parcel);
                return new d(zJ2);
            case 3:
                int iW4 = m3.m.W(parcel);
                boolean zJ3 = false;
                while (parcel.dataPosition() < iW4) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        m3.m.S(i11, parcel);
                    } else {
                        zJ3 = m3.m.J(i11, parcel);
                    }
                }
                m3.m.v(iW4, parcel);
                return new e(zJ3);
            case 4:
                int iW5 = m3.m.W(parcel);
                PendingIntent pendingIntent = null;
                h hVar = null;
                while (parcel.dataPosition() < iW5) {
                    int i12 = parcel.readInt();
                    char c8 = (char) i12;
                    if (c8 == 1) {
                        pendingIntent = (PendingIntent) m3.m.p(parcel, i12, PendingIntent.CREATOR);
                    } else if (c8 != 2) {
                        m3.m.S(i12, parcel);
                    } else {
                        hVar = (h) m3.m.p(parcel, i12, h.CREATOR);
                    }
                }
                m3.m.v(iW5, parcel);
                return new f(pendingIntent, hVar);
            case 5:
                int iW6 = m3.m.W(parcel);
                String strQ = null;
                Bundle bundleM = null;
                Bundle bundleM2 = null;
                String strQ2 = null;
                String strQ3 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < iW6) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            strQ = m3.m.q(i13, parcel);
                            break;
                        case 2:
                            bundleM = m3.m.m(i13, parcel);
                            break;
                        case 3:
                            bundleM2 = m3.m.m(i13, parcel);
                            break;
                        case 4:
                            strQ2 = m3.m.q(i13, parcel);
                            break;
                        case 5:
                            strQ3 = m3.m.q(i13, parcel);
                            break;
                        case 6:
                            resultReceiver = (ResultReceiver) m3.m.p(parcel, i13, ResultReceiver.CREATOR);
                            break;
                        default:
                            m3.m.S(i13, parcel);
                            break;
                    }
                }
                m3.m.v(iW6, parcel);
                return new g(strQ, bundleM, bundleM2, strQ2, strQ3, resultReceiver);
            case 6:
                int iW7 = m3.m.W(parcel);
                String strQ4 = null;
                Bundle bundleM3 = null;
                while (parcel.dataPosition() < iW7) {
                    int i14 = parcel.readInt();
                    char c10 = (char) i14;
                    if (c10 == 1) {
                        strQ4 = m3.m.q(i14, parcel);
                    } else if (c10 != 2) {
                        m3.m.S(i14, parcel);
                    } else {
                        bundleM3 = m3.m.m(i14, parcel);
                    }
                }
                m3.m.v(iW7, parcel);
                return new h(strQ4, bundleM3);
            case 7:
                int iW8 = m3.m.W(parcel);
                String strQ5 = "";
                String strQ6 = strQ5;
                String strQ7 = strQ6;
                Bundle bundleM4 = null;
                Bundle bundleM5 = null;
                String strQ8 = null;
                while (parcel.dataPosition() < iW8) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            strQ5 = m3.m.q(i15, parcel);
                            break;
                        case 2:
                            bundleM4 = m3.m.m(i15, parcel);
                            break;
                        case 3:
                            bundleM5 = m3.m.m(i15, parcel);
                            break;
                        case 4:
                            strQ8 = m3.m.q(i15, parcel);
                            break;
                        case 5:
                            strQ6 = m3.m.q(i15, parcel);
                            break;
                        case 6:
                            strQ7 = m3.m.q(i15, parcel);
                            break;
                        default:
                            m3.m.S(i15, parcel);
                            break;
                    }
                }
                m3.m.v(iW8, parcel);
                return new i(strQ5, bundleM4, bundleM5, strQ8, strQ6, strQ7);
            case 8:
                int iW9 = m3.m.W(parcel);
                Bundle bundleM6 = null;
                while (parcel.dataPosition() < iW9) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        m3.m.S(i16, parcel);
                    } else {
                        bundleM6 = m3.m.m(i16, parcel);
                    }
                }
                m3.m.v(iW9, parcel);
                return new j(bundleM6);
            case 9:
                int iW10 = m3.m.W(parcel);
                Bundle bundleM7 = null;
                while (parcel.dataPosition() < iW10) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 1) {
                        m3.m.S(i17, parcel);
                    } else {
                        bundleM7 = m3.m.m(i17, parcel);
                    }
                }
                m3.m.v(iW10, parcel);
                return new k(bundleM7);
            case 10:
                int iW11 = m3.m.W(parcel);
                ArrayList arrayListT = null;
                Bundle bundleM8 = null;
                String strQ9 = null;
                ResultReceiver resultReceiver2 = null;
                while (parcel.dataPosition() < iW11) {
                    int i18 = parcel.readInt();
                    char c11 = (char) i18;
                    if (c11 == 1) {
                        arrayListT = m3.m.t(parcel, i18, i.CREATOR);
                    } else if (c11 == 2) {
                        bundleM8 = m3.m.m(i18, parcel);
                    } else if (c11 == 3) {
                        strQ9 = m3.m.q(i18, parcel);
                    } else if (c11 != 4) {
                        m3.m.S(i18, parcel);
                    } else {
                        resultReceiver2 = (ResultReceiver) m3.m.p(parcel, i18, ResultReceiver.CREATOR);
                    }
                }
                m3.m.v(iW11, parcel);
                return new GetCredentialRequest(arrayListT, bundleM8, strQ9, resultReceiver2);
            case 11:
                int iW12 = m3.m.W(parcel);
                Bundle bundleM9 = null;
                while (parcel.dataPosition() < iW12) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 1) {
                        m3.m.S(i19, parcel);
                    } else {
                        bundleM9 = m3.m.m(i19, parcel);
                    }
                }
                m3.m.v(iW12, parcel);
                return new l(bundleM9);
            case 12:
                int iW13 = m3.m.W(parcel);
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < iW13) {
                    int i20 = parcel.readInt();
                    if (((char) i20) != 1) {
                        m3.m.S(i20, parcel);
                    } else {
                        pendingIntent2 = (PendingIntent) m3.m.p(parcel, i20, PendingIntent.CREATOR);
                    }
                }
                m3.m.v(iW13, parcel);
                return new m(pendingIntent2);
            case 13:
                int iW14 = m3.m.W(parcel);
                PendingIntent pendingIntent3 = null;
                while (parcel.dataPosition() < iW14) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 1) {
                        m3.m.S(i21, parcel);
                    } else {
                        pendingIntent3 = (PendingIntent) m3.m.p(parcel, i21, PendingIntent.CREATOR);
                    }
                }
                m3.m.v(iW14, parcel);
                return new n(pendingIntent3);
            case 14:
                int iW15 = m3.m.W(parcel);
                while (parcel.dataPosition() < iW15) {
                    m3.m.S(parcel.readInt(), parcel);
                }
                m3.m.v(iW15, parcel);
                return new o();
            case 15:
                int iW16 = m3.m.W(parcel);
                while (parcel.dataPosition() < iW16) {
                    m3.m.S(parcel.readInt(), parcel);
                }
                m3.m.v(iW16, parcel);
                return new p();
            case 16:
                int iW17 = m3.m.W(parcel);
                while (parcel.dataPosition() < iW17) {
                    m3.m.S(parcel.readInt(), parcel);
                }
                m3.m.v(iW17, parcel);
                return new q();
            case 17:
                int iW18 = m3.m.W(parcel);
                String strQ10 = null;
                String strQ11 = null;
                Bundle bundleM10 = null;
                while (parcel.dataPosition() < iW18) {
                    int i22 = parcel.readInt();
                    char c12 = (char) i22;
                    if (c12 == 1) {
                        strQ10 = m3.m.q(i22, parcel);
                    } else if (c12 == 2) {
                        strQ11 = m3.m.q(i22, parcel);
                    } else if (c12 != 3) {
                        m3.m.S(i22, parcel);
                    } else {
                        bundleM10 = m3.m.m(i22, parcel);
                    }
                }
                m3.m.v(iW18, parcel);
                return new r(strQ10, strQ11, bundleM10);
            case 18:
                int iW19 = m3.m.W(parcel);
                while (parcel.dataPosition() < iW19) {
                    m3.m.S(parcel.readInt(), parcel);
                }
                m3.m.v(iW19, parcel);
                return new s();
            case 19:
                int iW20 = m3.m.W(parcel);
                Bundle bundleM11 = null;
                int iL = 0;
                int iL2 = 0;
                while (parcel.dataPosition() < iW20) {
                    int i23 = parcel.readInt();
                    char c13 = (char) i23;
                    if (c13 == 1) {
                        iL = m3.m.L(i23, parcel);
                    } else if (c13 == 2) {
                        iL2 = m3.m.L(i23, parcel);
                    } else if (c13 != 3) {
                        m3.m.S(i23, parcel);
                    } else {
                        bundleM11 = m3.m.m(i23, parcel);
                    }
                }
                m3.m.v(iW20, parcel);
                return new ue.a(iL, iL2, bundleM11);
            case 20:
                int iW21 = m3.m.W(parcel);
                String strQ12 = null;
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iW21) {
                    int i24 = parcel.readInt();
                    char c14 = (char) i24;
                    if (c14 == 2) {
                        strQ12 = m3.m.q(i24, parcel);
                    } else if (c14 != 5) {
                        m3.m.S(i24, parcel);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) m3.m.p(parcel, i24, GoogleSignInOptions.CREATOR);
                    }
                }
                m3.m.v(iW21, parcel);
                return new SignInConfiguration(strQ12, googleSignInOptions);
            case 21:
                vg.a aVar = new vg.a(parcel);
                aVar.f21666d = ((Integer) parcel.readValue(vg.a.class.getClassLoader())).intValue();
                return aVar;
            case 22:
                int iW22 = m3.m.W(parcel);
                PendingIntent pendingIntent4 = null;
                String strQ13 = null;
                Integer numM = null;
                int iL3 = 0;
                int iL4 = 0;
                while (parcel.dataPosition() < iW22) {
                    int i25 = parcel.readInt();
                    char c15 = (char) i25;
                    if (c15 == 1) {
                        iL3 = m3.m.L(i25, parcel);
                    } else if (c15 == 2) {
                        iL4 = m3.m.L(i25, parcel);
                    } else if (c15 == 3) {
                        pendingIntent4 = (PendingIntent) m3.m.p(parcel, i25, PendingIntent.CREATOR);
                    } else if (c15 == 4) {
                        strQ13 = m3.m.q(i25, parcel);
                    } else if (c15 != 5) {
                        m3.m.S(i25, parcel);
                    } else {
                        numM = m3.m.M(i25, parcel);
                    }
                }
                m3.m.v(iW22, parcel);
                return new xe.b(iL3, iL4, pendingIntent4, strQ13, numM);
            case 23:
                int iW23 = m3.m.W(parcel);
                boolean zJ4 = false;
                int iL5 = 0;
                long jN = -1;
                String strQ14 = null;
                while (parcel.dataPosition() < iW23) {
                    int i26 = parcel.readInt();
                    char c16 = (char) i26;
                    if (c16 == 1) {
                        strQ14 = m3.m.q(i26, parcel);
                    } else if (c16 == 2) {
                        iL5 = m3.m.L(i26, parcel);
                    } else if (c16 == 3) {
                        jN = m3.m.N(i26, parcel);
                    } else if (c16 != 4) {
                        m3.m.S(i26, parcel);
                    } else {
                        zJ4 = m3.m.J(i26, parcel);
                    }
                }
                m3.m.v(iW23, parcel);
                return new xe.d(jN, strQ14, zJ4, iL5);
            default:
                return new yh.c((PendingIntent) parcel.readParcelable(yh.b.class.getClassLoader()), parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f19389a) {
            case 0:
                return new a[i7];
            case 1:
                return new c[i7];
            case 2:
                return new d[i7];
            case 3:
                return new e[i7];
            case 4:
                return new f[i7];
            case 5:
                return new g[i7];
            case 6:
                return new h[i7];
            case 7:
                return new i[i7];
            case 8:
                return new j[i7];
            case 9:
                return new k[i7];
            case 10:
                return new GetCredentialRequest[i7];
            case 11:
                return new l[i7];
            case 12:
                return new m[i7];
            case 13:
                return new n[i7];
            case 14:
                return new o[i7];
            case 15:
                return new p[i7];
            case 16:
                return new q[i7];
            case 17:
                return new r[i7];
            case 18:
                return new s[i7];
            case 19:
                return new ue.a[i7];
            case 20:
                return new SignInConfiguration[i7];
            case 21:
                return new vg.a[i7];
            case 22:
                return new xe.b[i7];
            case 23:
                return new xe.d[i7];
            default:
                return new yh.b[i7];
        }
    }
}
