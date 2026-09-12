package jf;

import ag.y0;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.view.ViewGroup;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import java.util.ArrayList;
import java.util.Locale;
import l4.e;
import m3.m;
import mc.h;
import mc.i;
import ne.g;
import qf.a0;
import qf.b0;
import qf.c;
import qf.d0;
import qf.e0;
import qf.f;
import qf.h0;
import qf.j;
import qf.l;
import qf.m0;
import qf.n0;
import qf.o0;
import qf.p0;
import qf.q0;
import qf.s;
import qf.t;
import qf.u;
import qf.v;
import qf.w;
import qf.x;
import qf.y;
import qf.z;
import qf.z0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13869a;

    public /* synthetic */ b(int i7) {
        this.f13869a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f13869a) {
            case 0:
                int iW = m.W(parcel);
                int iL = 0;
                while (parcel.dataPosition() < iW) {
                    int i7 = parcel.readInt();
                    if (((char) i7) != 1) {
                        m.S(i7, parcel);
                    } else {
                        iL = m.L(i7, parcel);
                    }
                }
                m.v(iW, parcel);
                return new a(iL);
            case 1:
                return new jn.a(parcel);
            case 2:
                return new kd.a(parcel);
            case 3:
                e eVar = new e(parcel);
                eVar.f14832d = parcel.readString();
                eVar.f14834i = parcel.readFloat();
                eVar.f14835v = parcel.readInt() == 1;
                eVar.f14836w = parcel.readString();
                eVar.f14837x = parcel.readInt();
                eVar.f14838y = parcel.readInt();
                return eVar;
            case 4:
                return new ld.b(parcel);
            case 5:
                return new i(parcel);
            case 6:
                return new h(parcel);
            case 7:
                ne.e eVar2 = new ne.e(-2, -2);
                eVar2.f16572w = 0.0f;
                eVar2.f16573x = 1.0f;
                eVar2.f16574y = -1;
                eVar2.E = -1.0f;
                eVar2.H = 16777215;
                eVar2.I = 16777215;
                eVar2.f16572w = parcel.readFloat();
                eVar2.f16573x = parcel.readFloat();
                eVar2.f16574y = parcel.readInt();
                eVar2.E = parcel.readFloat();
                eVar2.F = parcel.readInt();
                eVar2.G = parcel.readInt();
                eVar2.H = parcel.readInt();
                eVar2.I = parcel.readInt();
                eVar2.J = parcel.readByte() != 0;
                ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) eVar2).leftMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) eVar2).rightMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) eVar2).topMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) eVar2).height = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) eVar2).width = parcel.readInt();
                return eVar2;
            case 8:
                g gVar = new g();
                gVar.f16584d = parcel.readInt();
                gVar.f16585e = parcel.readInt();
                return gVar;
            case 9:
                ng.b bVar = new ng.b();
                bVar.F = 255;
                bVar.H = -2;
                bVar.I = -2;
                bVar.J = -2;
                bVar.Q = Boolean.TRUE;
                bVar.f16813d = parcel.readInt();
                bVar.f16814e = (Integer) parcel.readSerializable();
                bVar.f16815i = (Integer) parcel.readSerializable();
                bVar.f16816v = (Integer) parcel.readSerializable();
                bVar.f16817w = (Integer) parcel.readSerializable();
                bVar.f16818x = (Integer) parcel.readSerializable();
                bVar.f16819y = (Integer) parcel.readSerializable();
                bVar.E = (Integer) parcel.readSerializable();
                bVar.F = parcel.readInt();
                bVar.G = parcel.readString();
                bVar.H = parcel.readInt();
                bVar.I = parcel.readInt();
                bVar.J = parcel.readInt();
                bVar.L = parcel.readString();
                bVar.M = parcel.readString();
                bVar.N = parcel.readInt();
                bVar.P = (Integer) parcel.readSerializable();
                bVar.R = (Integer) parcel.readSerializable();
                bVar.S = (Integer) parcel.readSerializable();
                bVar.T = (Integer) parcel.readSerializable();
                bVar.U = (Integer) parcel.readSerializable();
                bVar.V = (Integer) parcel.readSerializable();
                bVar.W = (Integer) parcel.readSerializable();
                bVar.Z = (Integer) parcel.readSerializable();
                bVar.X = (Integer) parcel.readSerializable();
                bVar.Y = (Integer) parcel.readSerializable();
                bVar.Q = (Boolean) parcel.readSerializable();
                bVar.K = (Locale) parcel.readSerializable();
                bVar.a0 = (Boolean) parcel.readSerializable();
                bVar.f16812b0 = (Integer) parcel.readSerializable();
                return bVar;
            case 10:
                return new ParcelImpl(parcel);
            case 11:
                try {
                    return Transport.a(parcel.readString());
                } catch (of.a e10) {
                    throw new RuntimeException(e10);
                }
            case 12:
                try {
                    return c.a(parcel.readString());
                } catch (qf.b e11) {
                    throw new RuntimeException(e11);
                }
            case 13:
                int iW2 = m.W(parcel);
                boolean zJ = false;
                while (parcel.dataPosition() < iW2) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        m.S(i10, parcel);
                    } else {
                        zJ = m.J(i10, parcel);
                    }
                }
                m.v(iW2, parcel);
                return new z0(zJ);
            case 14:
                int iW3 = m.W(parcel);
                long jN = 0;
                while (parcel.dataPosition() < iW3) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        m.S(i11, parcel);
                    } else {
                        jN = m.N(i11, parcel);
                    }
                }
                m.v(iW3, parcel);
                return new m0(jN);
            case 15:
                int iW4 = m.W(parcel);
                boolean zJ2 = false;
                while (parcel.dataPosition() < iW4) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 1) {
                        m.S(i12, parcel);
                    } else {
                        zJ2 = m.J(i12, parcel);
                    }
                }
                m.v(iW4, parcel);
                return new n0(zJ2);
            case 16:
                int iW5 = m.W(parcel);
                boolean zJ3 = false;
                while (parcel.dataPosition() < iW5) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 1) {
                        m.S(i13, parcel);
                    } else {
                        zJ3 = m.J(i13, parcel);
                    }
                }
                m.v(iW5, parcel);
                return new s(zJ3);
            case 17:
                int iW6 = m.W(parcel);
                String strQ = null;
                while (parcel.dataPosition() < iW6) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 1) {
                        m.S(i14, parcel);
                    } else {
                        strQ = m.q(i14, parcel);
                    }
                }
                m.v(iW6, parcel);
                return new o0(strQ);
            case 18:
                int iW7 = m.W(parcel);
                int iL2 = 0;
                byte[] bArrN = null;
                byte[] bArrN2 = null;
                byte[] bArrN3 = null;
                while (parcel.dataPosition() < iW7) {
                    int i15 = parcel.readInt();
                    char c8 = (char) i15;
                    if (c8 == 1) {
                        bArrN = m.n(i15, parcel);
                    } else if (c8 == 2) {
                        bArrN2 = m.n(i15, parcel);
                    } else if (c8 == 3) {
                        bArrN3 = m.n(i15, parcel);
                    } else if (c8 != 4) {
                        m.S(i15, parcel);
                    } else {
                        iL2 = m.L(i15, parcel);
                    }
                }
                m.v(iW7, parcel);
                return new p0(bArrN == null ? null : y0.k(bArrN, bArrN.length), bArrN2 == null ? null : y0.k(bArrN2, bArrN2.length), bArrN3 != null ? y0.k(bArrN3, bArrN3.length) : null, iL2);
            case 19:
                int iW8 = m.W(parcel);
                boolean zJ4 = false;
                while (parcel.dataPosition() < iW8) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        m.S(i16, parcel);
                    } else {
                        zJ4 = m.J(i16, parcel);
                    }
                }
                m.v(iW8, parcel);
                return new t(zJ4);
            case 20:
                int iW9 = m.W(parcel);
                while (true) {
                    byte[][] bArr = null;
                    while (true) {
                        if (parcel.dataPosition() >= iW9) {
                            m.v(iW9, parcel);
                            return new q0(bArr);
                        }
                        int i17 = parcel.readInt();
                        if (((char) i17) != 1) {
                            m.S(i17, parcel);
                        } else {
                            int iP = m.P(i17, parcel);
                            int iDataPosition = parcel.dataPosition();
                            if (iP == 0) {
                            }
                            int i18 = parcel.readInt();
                            byte[][] bArr2 = new byte[i18][];
                            for (int i19 = 0; i19 < i18; i19++) {
                                bArr2[i19] = parcel.createByteArray();
                            }
                            parcel.setDataPosition(iDataPosition + iP);
                            bArr = bArr2;
                        }
                        break;
                    }
                }
                break;
            case 21:
                int iW10 = m.W(parcel);
                y yVar = null;
                b0 b0Var = null;
                byte[] bArrN4 = null;
                ArrayList arrayListT = null;
                Double dValueOf = null;
                ArrayList arrayListT2 = null;
                l lVar = null;
                Integer numM = null;
                h0 h0Var = null;
                String strQ2 = null;
                AuthenticationExtensions authenticationExtensions = null;
                String strQ3 = null;
                ResultReceiver resultReceiver = null;
                ArrayList arrayListR = null;
                while (parcel.dataPosition() < iW10) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 2:
                            yVar = (y) m.p(parcel, i20, y.CREATOR);
                            break;
                        case 3:
                            b0Var = (b0) m.p(parcel, i20, b0.CREATOR);
                            break;
                        case 4:
                            bArrN4 = m.n(i20, parcel);
                            break;
                        case 5:
                            arrayListT = m.t(parcel, i20, x.CREATOR);
                            break;
                        case 6:
                            int iP2 = m.P(i20, parcel);
                            if (iP2 == 0) {
                                dValueOf = null;
                            } else {
                                m.Y(parcel, iP2, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                            }
                            break;
                        case 7:
                            arrayListT2 = m.t(parcel, i20, w.CREATOR);
                            break;
                        case '\b':
                            lVar = (l) m.p(parcel, i20, l.CREATOR);
                            break;
                        case '\t':
                            numM = m.M(i20, parcel);
                            break;
                        case '\n':
                            h0Var = (h0) m.p(parcel, i20, h0.CREATOR);
                            break;
                        case 11:
                            strQ2 = m.q(i20, parcel);
                            break;
                        case '\f':
                            authenticationExtensions = (AuthenticationExtensions) m.p(parcel, i20, AuthenticationExtensions.CREATOR);
                            break;
                        case '\r':
                            strQ3 = m.q(i20, parcel);
                            break;
                        case 14:
                            resultReceiver = (ResultReceiver) m.p(parcel, i20, ResultReceiver.CREATOR);
                            break;
                        case 15:
                            arrayListR = m.r(i20, parcel);
                            break;
                        default:
                            m.S(i20, parcel);
                            break;
                    }
                }
                m.v(iW10, parcel);
                return new v(yVar, b0Var, bArrN4, arrayListT, dValueOf, arrayListT2, lVar, numM, h0Var, strQ2, authenticationExtensions, strQ3, resultReceiver, arrayListR);
            case 22:
                int iW11 = m.W(parcel);
                String strQ4 = null;
                String strQ5 = null;
                byte[] bArrN5 = null;
                qf.i iVar = null;
                qf.h hVar = null;
                j jVar = null;
                f fVar = null;
                String strQ6 = null;
                while (parcel.dataPosition() < iW11) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 1:
                            strQ4 = m.q(i21, parcel);
                            break;
                        case 2:
                            strQ5 = m.q(i21, parcel);
                            break;
                        case 3:
                            bArrN5 = m.n(i21, parcel);
                            break;
                        case 4:
                            iVar = (qf.i) m.p(parcel, i21, qf.i.CREATOR);
                            break;
                        case 5:
                            hVar = (qf.h) m.p(parcel, i21, qf.h.CREATOR);
                            break;
                        case 6:
                            jVar = (j) m.p(parcel, i21, j.CREATOR);
                            break;
                        case 7:
                            fVar = (f) m.p(parcel, i21, f.CREATOR);
                            break;
                        case '\b':
                            strQ6 = m.q(i21, parcel);
                            break;
                        case '\t':
                            m.q(i21, parcel);
                            break;
                        default:
                            m.S(i21, parcel);
                            break;
                    }
                }
                m.v(iW11, parcel);
                return new u(strQ4, strQ5, bArrN5, iVar, hVar, jVar, fVar, strQ6);
            case 23:
                int iW12 = m.W(parcel);
                String strQ7 = null;
                byte[] bArrN6 = null;
                ArrayList arrayListT3 = null;
                while (parcel.dataPosition() < iW12) {
                    int i22 = parcel.readInt();
                    char c10 = (char) i22;
                    if (c10 == 2) {
                        strQ7 = m.q(i22, parcel);
                    } else if (c10 == 3) {
                        bArrN6 = m.n(i22, parcel);
                    } else if (c10 != 4) {
                        m.S(i22, parcel);
                    } else {
                        arrayListT3 = m.t(parcel, i22, Transport.CREATOR);
                    }
                }
                m.v(iW12, parcel);
                return new w(strQ7, bArrN6, arrayListT3);
            case 24:
                int iW13 = m.W(parcel);
                String strQ8 = null;
                Integer numM2 = null;
                while (parcel.dataPosition() < iW13) {
                    int i23 = parcel.readInt();
                    char c11 = (char) i23;
                    if (c11 == 2) {
                        strQ8 = m.q(i23, parcel);
                    } else if (c11 != 3) {
                        m.S(i23, parcel);
                    } else {
                        numM2 = m.M(i23, parcel);
                    }
                }
                m.v(iW13, parcel);
                return new x(strQ8, numM2.intValue());
            case 25:
                int iW14 = m.W(parcel);
                byte[] bArrN7 = null;
                Double dValueOf2 = null;
                String strQ9 = null;
                ArrayList arrayListT4 = null;
                Integer numM3 = null;
                h0 h0Var2 = null;
                String strQ10 = null;
                AuthenticationExtensions authenticationExtensions2 = null;
                Long lValueOf = null;
                String strQ11 = null;
                ResultReceiver resultReceiver2 = null;
                while (parcel.dataPosition() < iW14) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 2:
                            bArrN7 = m.n(i24, parcel);
                            break;
                        case 3:
                            int iP3 = m.P(i24, parcel);
                            if (iP3 == 0) {
                                dValueOf2 = null;
                            } else {
                                m.Y(parcel, iP3, 8);
                                dValueOf2 = Double.valueOf(parcel.readDouble());
                            }
                            break;
                        case 4:
                            strQ9 = m.q(i24, parcel);
                            break;
                        case 5:
                            arrayListT4 = m.t(parcel, i24, w.CREATOR);
                            break;
                        case 6:
                            numM3 = m.M(i24, parcel);
                            break;
                        case 7:
                            h0Var2 = (h0) m.p(parcel, i24, h0.CREATOR);
                            break;
                        case '\b':
                            strQ10 = m.q(i24, parcel);
                            break;
                        case '\t':
                            authenticationExtensions2 = (AuthenticationExtensions) m.p(parcel, i24, AuthenticationExtensions.CREATOR);
                            break;
                        case '\n':
                            int iP4 = m.P(i24, parcel);
                            if (iP4 == 0) {
                                lValueOf = null;
                            } else {
                                m.Y(parcel, iP4, 8);
                                lValueOf = Long.valueOf(parcel.readLong());
                            }
                            break;
                        case 11:
                            strQ11 = m.q(i24, parcel);
                            break;
                        case '\f':
                            resultReceiver2 = (ResultReceiver) m.p(parcel, i24, ResultReceiver.CREATOR);
                            break;
                        default:
                            m.S(i24, parcel);
                            break;
                    }
                }
                m.v(iW14, parcel);
                return new PublicKeyCredentialRequestOptions(bArrN7, dValueOf2, strQ9, arrayListT4, numM3, h0Var2, strQ10, authenticationExtensions2, lValueOf, strQ11, resultReceiver2);
            case 26:
                int iW15 = m.W(parcel);
                String strQ12 = null;
                String strQ13 = null;
                String strQ14 = null;
                while (parcel.dataPosition() < iW15) {
                    int i25 = parcel.readInt();
                    char c12 = (char) i25;
                    if (c12 == 2) {
                        strQ12 = m.q(i25, parcel);
                    } else if (c12 == 3) {
                        strQ13 = m.q(i25, parcel);
                    } else if (c12 != 4) {
                        m.S(i25, parcel);
                    } else {
                        strQ14 = m.q(i25, parcel);
                    }
                }
                m.v(iW15, parcel);
                return new y(strQ12, strQ13, strQ14);
            case 27:
                try {
                    return a0.a(parcel.readString());
                } catch (z e12) {
                    throw new RuntimeException(e12);
                }
            case 28:
                int iW16 = m.W(parcel);
                byte[] bArrN8 = null;
                String strQ15 = null;
                String strQ16 = null;
                String strQ17 = null;
                while (parcel.dataPosition() < iW16) {
                    int i26 = parcel.readInt();
                    char c13 = (char) i26;
                    if (c13 == 2) {
                        bArrN8 = m.n(i26, parcel);
                    } else if (c13 == 3) {
                        strQ15 = m.q(i26, parcel);
                    } else if (c13 == 4) {
                        strQ16 = m.q(i26, parcel);
                    } else if (c13 != 5) {
                        m.S(i26, parcel);
                    } else {
                        strQ17 = m.q(i26, parcel);
                    }
                }
                m.v(iW16, parcel);
                return new b0(strQ15, strQ16, strQ17, bArrN8);
            default:
                String string = parcel.readString();
                if (string == null) {
                    string = "";
                }
                try {
                    return e0.a(string);
                } catch (d0 e13) {
                    throw new RuntimeException(e13);
                }
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f13869a) {
            case 0:
                return new a[i7];
            case 1:
                return new jn.a[i7];
            case 2:
                return new kd.a[i7];
            case 3:
                return new e[i7];
            case 4:
                return new ld.b[i7];
            case 5:
                return new i[i7];
            case 6:
                return new h[i7];
            case 7:
                return new ne.e[i7];
            case 8:
                return new g[i7];
            case 9:
                return new ng.b[i7];
            case 10:
                return new ParcelImpl[i7];
            case 11:
                return new Transport[i7];
            case 12:
                return new c[i7];
            case 13:
                return new z0[i7];
            case 14:
                return new m0[i7];
            case 15:
                return new n0[i7];
            case 16:
                return new s[i7];
            case 17:
                return new o0[i7];
            case 18:
                return new p0[i7];
            case 19:
                return new t[i7];
            case 20:
                return new q0[i7];
            case 21:
                return new v[i7];
            case 22:
                return new u[i7];
            case 23:
                return new w[i7];
            case 24:
                return new x[i7];
            case 25:
                return new PublicKeyCredentialRequestOptions[i7];
            case 26:
                return new y[i7];
            case 27:
                return new a0[i7];
            case 28:
                return new b0[i7];
            default:
                return new e0[i7];
        }
    }
}
