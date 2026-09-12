package af;

import af.m;
import android.accounts.Account;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import androidx.appcompat.widget.p0;
import androidx.fragment.app.d1;
import androidx.fragment.app.h1;
import androidx.fragment.app.x0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.firebase.messaging.RemoteMessage;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f465a;

    public /* synthetic */ m(int i7) {
        this.f465a = i7;
    }

    public static void a(e eVar, Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        int i10 = eVar.f408d;
        ls.d.S(parcel, 1, 4);
        parcel.writeInt(i10);
        int i11 = eVar.f409e;
        ls.d.S(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = eVar.f410i;
        ls.d.S(parcel, 3, 4);
        parcel.writeInt(i12);
        ls.d.O(eVar.f411v, parcel, 4);
        IBinder iBinder = eVar.f412w;
        if (iBinder != null) {
            int iT2 = ls.d.T(5, parcel);
            parcel.writeStrongBinder(iBinder);
            ls.d.U(iT2, parcel);
        }
        ls.d.Q(parcel, 6, eVar.f413x, i7);
        ls.d.K(parcel, 7, eVar.f414y);
        ls.d.N(parcel, 8, eVar.E, i7);
        ls.d.Q(parcel, 10, eVar.F, i7);
        ls.d.Q(parcel, 11, eVar.G, i7);
        boolean z5 = eVar.H;
        ls.d.S(parcel, 12, 4);
        parcel.writeInt(z5 ? 1 : 0);
        int i13 = eVar.I;
        ls.d.S(parcel, 13, 4);
        parcel.writeInt(i13);
        boolean z6 = eVar.J;
        ls.d.S(parcel, 14, 4);
        parcel.writeInt(z6 ? 1 : 0);
        ls.d.O(eVar.K, parcel, 15);
        ls.d.U(iT, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        Bundle bundle;
        int iL = 0;
        ArrayList arrayListT = null;
        d.b bVar = null;
        Bundle bundleM = null;
        Bundle bundleM2 = null;
        Account account = null;
        switch (this.f465a) {
            case 0:
                int iW = m3.m.W(parcel);
                while (parcel.dataPosition() < iW) {
                    int i7 = parcel.readInt();
                    char c8 = (char) i7;
                    if (c8 == 1) {
                        iL = m3.m.L(i7, parcel);
                    } else if (c8 != 2) {
                        m3.m.S(i7, parcel);
                    } else {
                        arrayListT = m3.m.t(parcel, i7, h.CREATOR);
                    }
                }
                m3.m.v(iW, parcel);
                return new k(iL, arrayListT);
            case 1:
                int iW2 = m3.m.W(parcel);
                int iL2 = -1;
                long jN = 0;
                long jN2 = 0;
                int iL3 = 0;
                int iL4 = 0;
                int iL5 = 0;
                int iL6 = 0;
                String strQ = null;
                String strQ2 = null;
                while (parcel.dataPosition() < iW2) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            iL3 = m3.m.L(i10, parcel);
                            break;
                        case 2:
                            iL4 = m3.m.L(i10, parcel);
                            break;
                        case 3:
                            iL5 = m3.m.L(i10, parcel);
                            break;
                        case 4:
                            jN = m3.m.N(i10, parcel);
                            break;
                        case 5:
                            jN2 = m3.m.N(i10, parcel);
                            break;
                        case 6:
                            strQ = m3.m.q(i10, parcel);
                            break;
                        case 7:
                            strQ2 = m3.m.q(i10, parcel);
                            break;
                        case '\b':
                            iL6 = m3.m.L(i10, parcel);
                            break;
                        case '\t':
                            iL2 = m3.m.L(i10, parcel);
                            break;
                        default:
                            m3.m.S(i10, parcel);
                            break;
                    }
                }
                m3.m.v(iW2, parcel);
                return new h(iL3, iL4, iL5, jN, jN2, strQ, strQ2, iL6, iL2);
            case 2:
                int iW3 = m3.m.W(parcel);
                int iL7 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iW3) {
                    int i11 = parcel.readInt();
                    char c10 = (char) i11;
                    if (c10 == 1) {
                        iL = m3.m.L(i11, parcel);
                    } else if (c10 == 2) {
                        account = (Account) m3.m.p(parcel, i11, Account.CREATOR);
                    } else if (c10 == 3) {
                        iL7 = m3.m.L(i11, parcel);
                    } else if (c10 != 4) {
                        m3.m.S(i11, parcel);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) m3.m.p(parcel, i11, GoogleSignInAccount.CREATOR);
                    }
                }
                m3.m.v(iW3, parcel);
                return new s(iL, account, iL7, googleSignInAccount);
            case 3:
                int iW4 = m3.m.W(parcel);
                int iL8 = 0;
                boolean zJ = false;
                boolean zJ2 = false;
                IBinder iBinder = null;
                xe.b bVar2 = null;
                while (parcel.dataPosition() < iW4) {
                    int i12 = parcel.readInt();
                    char c11 = (char) i12;
                    if (c11 == 1) {
                        iL8 = m3.m.L(i12, parcel);
                    } else if (c11 == 2) {
                        int iP = m3.m.P(i12, parcel);
                        int iDataPosition = parcel.dataPosition();
                        if (iP == 0) {
                            iBinder = null;
                        } else {
                            IBinder strongBinder = parcel.readStrongBinder();
                            parcel.setDataPosition(iDataPosition + iP);
                            iBinder = strongBinder;
                        }
                    } else if (c11 == 3) {
                        bVar2 = (xe.b) m3.m.p(parcel, i12, xe.b.CREATOR);
                    } else if (c11 == 4) {
                        zJ = m3.m.J(i12, parcel);
                    } else if (c11 != 5) {
                        m3.m.S(i12, parcel);
                    } else {
                        zJ2 = m3.m.J(i12, parcel);
                    }
                }
                m3.m.v(iW4, parcel);
                return new t(iL8, iBinder, bVar2, zJ, zJ2);
            case 4:
                int iW5 = m3.m.W(parcel);
                int iL9 = 0;
                int iL10 = 0;
                int iL11 = 0;
                boolean zJ3 = false;
                boolean zJ4 = false;
                while (parcel.dataPosition() < iW5) {
                    int i13 = parcel.readInt();
                    char c12 = (char) i13;
                    if (c12 == 1) {
                        iL9 = m3.m.L(i13, parcel);
                    } else if (c12 == 2) {
                        zJ3 = m3.m.J(i13, parcel);
                    } else if (c12 == 3) {
                        zJ4 = m3.m.J(i13, parcel);
                    } else if (c12 == 4) {
                        iL10 = m3.m.L(i13, parcel);
                    } else if (c12 != 5) {
                        m3.m.S(i13, parcel);
                    } else {
                        iL11 = m3.m.L(i13, parcel);
                    }
                }
                m3.m.v(iW5, parcel);
                return new j(iL9, iL10, iL11, zJ3, zJ4);
            case 5:
                int iW6 = m3.m.W(parcel);
                xe.d[] dVarArr = null;
                d dVar = null;
                while (parcel.dataPosition() < iW6) {
                    int i14 = parcel.readInt();
                    char c13 = (char) i14;
                    if (c13 == 1) {
                        bundleM2 = m3.m.m(i14, parcel);
                    } else if (c13 == 2) {
                        dVarArr = (xe.d[]) m3.m.s(parcel, i14, xe.d.CREATOR);
                    } else if (c13 == 3) {
                        iL = m3.m.L(i14, parcel);
                    } else if (c13 != 4) {
                        m3.m.S(i14, parcel);
                    } else {
                        dVar = (d) m3.m.p(parcel, i14, d.CREATOR);
                    }
                }
                m3.m.v(iW6, parcel);
                e0 e0Var = new e0();
                e0Var.f415d = bundleM2;
                e0Var.f416e = dVarArr;
                e0Var.f417i = iL;
                e0Var.f418v = dVar;
                return e0Var;
            case 6:
                int iW7 = m3.m.W(parcel);
                boolean zJ5 = false;
                boolean zJ6 = false;
                int iL12 = 0;
                j jVar = null;
                int[] iArr = null;
                int[] iArr2 = null;
                while (parcel.dataPosition() < iW7) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            jVar = (j) m3.m.p(parcel, i15, j.CREATOR);
                            break;
                        case 2:
                            zJ5 = m3.m.J(i15, parcel);
                            break;
                        case 3:
                            zJ6 = m3.m.J(i15, parcel);
                            break;
                        case 4:
                            int iP2 = m3.m.P(i15, parcel);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iP2 != 0) {
                                int[] iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition2 + iP2);
                                iArr = iArrCreateIntArray;
                            } else {
                                iArr = null;
                            }
                            break;
                        case 5:
                            iL12 = m3.m.L(i15, parcel);
                            break;
                        case 6:
                            int iP3 = m3.m.P(i15, parcel);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iP3 != 0) {
                                int[] iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition3 + iP3);
                                iArr2 = iArrCreateIntArray2;
                            } else {
                                iArr2 = null;
                            }
                            break;
                        default:
                            m3.m.S(i15, parcel);
                            break;
                    }
                }
                m3.m.v(iW7, parcel);
                return new d(jVar, zJ5, zJ6, iArr, iL12, iArr2);
            case 7:
                int iW8 = m3.m.W(parcel);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr = e.L;
                xe.d[] dVarArr2 = e.M;
                xe.d[] dVarArr3 = dVarArr2;
                int iL13 = 0;
                int iL14 = 0;
                int iL15 = 0;
                boolean zJ7 = false;
                int iL16 = 0;
                boolean zJ8 = false;
                String strQ3 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String strQ4 = null;
                while (parcel.dataPosition() < iW8) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            iL13 = m3.m.L(i16, parcel);
                            break;
                        case 2:
                            iL14 = m3.m.L(i16, parcel);
                            break;
                        case 3:
                            iL15 = m3.m.L(i16, parcel);
                            break;
                        case 4:
                            strQ3 = m3.m.q(i16, parcel);
                            break;
                        case 5:
                            int iP4 = m3.m.P(i16, parcel);
                            int iDataPosition4 = parcel.dataPosition();
                            if (iP4 != 0) {
                                IBinder strongBinder2 = parcel.readStrongBinder();
                                parcel.setDataPosition(iDataPosition4 + iP4);
                                iBinder2 = strongBinder2;
                            } else {
                                iBinder2 = null;
                            }
                            break;
                        case 6:
                            scopeArr = (Scope[]) m3.m.s(parcel, i16, Scope.CREATOR);
                            break;
                        case 7:
                            bundle2 = m3.m.m(i16, parcel);
                            break;
                        case '\b':
                            account2 = (Account) m3.m.p(parcel, i16, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            m3.m.S(i16, parcel);
                            break;
                        case '\n':
                            dVarArr2 = (xe.d[]) m3.m.s(parcel, i16, xe.d.CREATOR);
                            break;
                        case 11:
                            dVarArr3 = (xe.d[]) m3.m.s(parcel, i16, xe.d.CREATOR);
                            break;
                        case '\f':
                            zJ7 = m3.m.J(i16, parcel);
                            break;
                        case '\r':
                            iL16 = m3.m.L(i16, parcel);
                            break;
                        case 14:
                            zJ8 = m3.m.J(i16, parcel);
                            break;
                        case 15:
                            strQ4 = m3.m.q(i16, parcel);
                            break;
                    }
                }
                m3.m.v(iW8, parcel);
                return new e(iL13, iL14, iL15, strQ3, iBinder2, scopeArr, bundle2, account2, dVarArr2, dVarArr3, zJ7, iL16, zJ8, strQ4);
            case 8:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new m(8);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final int f663d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final MediaDescriptionCompat f664e;

                    {
                        this.f663d = parcel.readInt();
                        this.f664e = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f663d + ", mDescription=" + this.f664e + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i17) {
                        parcel2.writeInt(this.f663d);
                        this.f664e.writeToParcel(parcel2, i17);
                    }
                };
            case 9:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String strG = android.support.v4.media.a.g(mediaDescription);
                CharSequence charSequenceI = android.support.v4.media.a.i(mediaDescription);
                CharSequence charSequenceH = android.support.v4.media.a.h(mediaDescription);
                CharSequence charSequenceC = android.support.v4.media.a.c(mediaDescription);
                Bitmap bitmapE = android.support.v4.media.a.e(mediaDescription);
                Uri uriF = android.support.v4.media.a.f(mediaDescription);
                Bundle bundleD = android.support.v4.media.a.d(mediaDescription);
                if (bundleD != null) {
                    bundleD = android.support.v4.media.session.b.x(bundleD);
                }
                Uri uriA = bundleD != null ? (Uri) bundleD.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
                if (uriA == null) {
                    bundle = bundleD;
                } else if (bundleD.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleD.size() == 2) {
                    bundle = null;
                } else {
                    bundleD.remove("android.support.v4.media.description.MEDIA_URI");
                    bundleD.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = bundleD;
                }
                if (uriA == null) {
                    uriA = android.support.v4.media.b.a(mediaDescription);
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strG, charSequenceI, charSequenceH, charSequenceC, bitmapE, uriF, bundle, uriA);
                mediaDescriptionCompat.F = mediaDescription;
                return mediaDescriptionCompat;
            case 10:
                return new MediaMetadataCompat(parcel);
            case 11:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 12:
                androidx.appcompat.widget.m mVar = new androidx.appcompat.widget.m();
                mVar.f1029d = parcel.readInt();
                return mVar;
            case 13:
                p0 p0Var = new p0(parcel);
                p0Var.f1067d = parcel.readByte() != 0;
                return p0Var;
            case 14:
                return new androidx.fragment.app.b(parcel);
            case 15:
                return new androidx.fragment.app.c(parcel);
            case 16:
                x0 x0Var = new x0();
                x0Var.f2270d = parcel.readString();
                x0Var.f2271e = parcel.readInt();
                return x0Var;
            case 17:
                d1 d1Var = new d1();
                d1Var.f2120w = null;
                d1Var.f2121x = new ArrayList();
                d1Var.f2122y = new ArrayList();
                d1Var.f2116d = parcel.createStringArrayList();
                d1Var.f2117e = parcel.createStringArrayList();
                d1Var.f2118i = (androidx.fragment.app.b[]) parcel.createTypedArray(androidx.fragment.app.b.CREATOR);
                d1Var.f2119v = parcel.readInt();
                d1Var.f2120w = parcel.readString();
                d1Var.f2121x = parcel.createStringArrayList();
                d1Var.f2122y = parcel.createTypedArrayList(androidx.fragment.app.c.CREATOR);
                d1Var.E = parcel.createTypedArrayList(x0.CREATOR);
                return d1Var;
            case 18:
                return new h1(parcel);
            case 19:
                return new androidx.swiperefreshlayout.widget.h(parcel);
            case 20:
                return new com.google.android.material.datepicker.b((com.google.android.material.datepicker.q) parcel.readParcelable(com.google.android.material.datepicker.q.class.getClassLoader()), (com.google.android.material.datepicker.q) parcel.readParcelable(com.google.android.material.datepicker.q.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (com.google.android.material.datepicker.q) parcel.readParcelable(com.google.android.material.datepicker.q.class.getClassLoader()), parcel.readInt());
            case 21:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 22:
                return com.google.android.material.datepicker.q.a(parcel.readInt(), parcel.readInt());
            case 23:
                int iW9 = m3.m.W(parcel);
                while (parcel.dataPosition() < iW9) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 2) {
                        m3.m.S(i17, parcel);
                    } else {
                        bundleM = m3.m.m(i17, parcel);
                    }
                }
                m3.m.v(iW9, parcel);
                return new RemoteMessage(bundleM);
            case 24:
                d.d dVar2 = new d.d();
                IBinder strongBinder3 = parcel.readStrongBinder();
                int i18 = d.c.f7513g;
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder3.queryLocalInterface(d.b.f7512e);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d.b)) {
                        d.a aVar = new d.a();
                        aVar.f7511f = strongBinder3;
                        bVar = aVar;
                    } else {
                        bVar = (d.b) iInterfaceQueryLocalInterface;
                    }
                }
                dVar2.f7515d = bVar;
                return dVar2;
            case 25:
                String string = parcel.readString();
                string.getClass();
                return new dd.a(parcel.readInt(), string);
            case 26:
                return new ed.a(parcel);
            case 27:
                eh.j jVar2 = new eh.j();
                jVar2.f8260d = parcel.readInt();
                jVar2.f8261e = (bh.g) parcel.readParcelable(eh.j.class.getClassLoader());
                return jVar2;
            case 28:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new f.a(parcel.readInt(), parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null);
            default:
                Intrinsics.checkNotNullParameter(parcel, "inParcel");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                Intrinsics.checkNotNull(parcelable);
                return new f.h((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f465a) {
            case 0:
                return new k[i7];
            case 1:
                return new h[i7];
            case 2:
                return new s[i7];
            case 3:
                return new t[i7];
            case 4:
                return new j[i7];
            case 5:
                return new e0[i7];
            case 6:
                return new d[i7];
            case 7:
                return new e[i7];
            case 8:
                return new MediaBrowserCompat$MediaItem[i7];
            case 9:
                return new MediaDescriptionCompat[i7];
            case 10:
                return new MediaMetadataCompat[i7];
            case 11:
                return new RatingCompat[i7];
            case 12:
                return new androidx.appcompat.widget.m[i7];
            case 13:
                return new p0[i7];
            case 14:
                return new androidx.fragment.app.b[i7];
            case 15:
                return new androidx.fragment.app.c[i7];
            case 16:
                return new x0[i7];
            case 17:
                return new d1[i7];
            case 18:
                return new h1[i7];
            case 19:
                return new androidx.swiperefreshlayout.widget.h[i7];
            case 20:
                return new com.google.android.material.datepicker.b[i7];
            case 21:
                return new com.google.android.material.datepicker.d[i7];
            case 22:
                return new com.google.android.material.datepicker.q[i7];
            case 23:
                return new RemoteMessage[i7];
            case 24:
                return new d.d[i7];
            case 25:
                return new dd.a[i7];
            case 26:
                return new ed.a[i7];
            case 27:
                return new eh.j[i7];
            case 28:
                return new f.a[i7];
            default:
                return new f.h[i7];
        }
    }
}
