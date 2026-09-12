package qf;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18861a;

    public /* synthetic */ s0(int i7) {
        this.f18861a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f18861a) {
            case 0:
                int iW = m3.m.W(parcel);
                String strQ = null;
                while (parcel.dataPosition() < iW) {
                    int i7 = parcel.readInt();
                    if (((char) i7) != 1) {
                        m3.m.S(i7, parcel);
                    } else {
                        strQ = m3.m.q(i7, parcel);
                    }
                }
                m3.m.v(iW, parcel);
                return new r0(strQ);
            case 1:
                try {
                    return f0.a(parcel.readString());
                } catch (g0 e10) {
                    throw new RuntimeException(e10);
                }
            case 2:
                try {
                    return e.a(parcel.readString());
                } catch (d e11) {
                    throw new RuntimeException(e11);
                }
            case 3:
                int iW2 = m3.m.W(parcel);
                String strQ2 = null;
                String strQ3 = null;
                while (parcel.dataPosition() < iW2) {
                    int i10 = parcel.readInt();
                    char c8 = (char) i10;
                    if (c8 == 2) {
                        strQ2 = m3.m.q(i10, parcel);
                    } else if (c8 != 3) {
                        m3.m.S(i10, parcel);
                    } else {
                        strQ3 = m3.m.q(i10, parcel);
                    }
                }
                m3.m.v(iW2, parcel);
                return new h0(strQ2, strQ3);
            case 4:
                int iW3 = m3.m.W(parcel);
                boolean zJ = false;
                while (parcel.dataPosition() < iW3) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        m3.m.S(i11, parcel);
                    } else {
                        zJ = m3.m.J(i11, parcel);
                    }
                }
                m3.m.v(iW3, parcel);
                return new i0(zJ);
            case 5:
                try {
                    return j0.a(parcel.readString());
                } catch (t0 e12) {
                    throw new RuntimeException(e12);
                }
            case 6:
                int iW4 = m3.m.W(parcel);
                ArrayList arrayListT = null;
                while (parcel.dataPosition() < iW4) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 1) {
                        m3.m.S(i12, parcel);
                    } else {
                        arrayListT = m3.m.t(parcel, i12, l0.CREATOR);
                    }
                }
                m3.m.v(iW4, parcel);
                return new k0(arrayListT);
            case 7:
                int iW5 = m3.m.W(parcel);
                int iL = 0;
                short s2 = 0;
                short s5 = 0;
                while (parcel.dataPosition() < iW5) {
                    int i13 = parcel.readInt();
                    char c10 = (char) i13;
                    if (c10 == 1) {
                        iL = m3.m.L(i13, parcel);
                    } else if (c10 == 2) {
                        m3.m.X(parcel, i13, 4);
                        s2 = (short) parcel.readInt();
                    } else if (c10 != 3) {
                        m3.m.S(i13, parcel);
                    } else {
                        m3.m.X(parcel, i13, 4);
                        s5 = (short) parcel.readInt();
                    }
                }
                m3.m.v(iW5, parcel);
                return new l0(s2, s5, iL);
            case 8:
                int iW6 = m3.m.W(parcel);
                k0 k0Var = null;
                u0 u0Var = null;
                g gVar = null;
                v0 v0Var = null;
                String strQ4 = null;
                while (parcel.dataPosition() < iW6) {
                    int i14 = parcel.readInt();
                    char c11 = (char) i14;
                    if (c11 == 1) {
                        k0Var = (k0) m3.m.p(parcel, i14, k0.CREATOR);
                    } else if (c11 == 2) {
                        u0Var = (u0) m3.m.p(parcel, i14, u0.CREATOR);
                    } else if (c11 == 3) {
                        gVar = (g) m3.m.p(parcel, i14, g.CREATOR);
                    } else if (c11 == 4) {
                        v0Var = (v0) m3.m.p(parcel, i14, v0.CREATOR);
                    } else if (c11 != 5) {
                        m3.m.S(i14, parcel);
                    } else {
                        strQ4 = m3.m.q(i14, parcel);
                    }
                }
                m3.m.v(iW6, parcel);
                return new f(k0Var, u0Var, gVar, v0Var, strQ4);
            case 9:
                int iW7 = m3.m.W(parcel);
                r rVar = null;
                x0 x0Var = null;
                i0 i0Var = null;
                z0 z0Var = null;
                m0 m0Var = null;
                n0 n0Var = null;
                y0 y0Var = null;
                o0 o0Var = null;
                s sVar = null;
                q0 q0Var = null;
                r0 r0Var = null;
                p0 p0Var = null;
                t tVar = null;
                while (parcel.dataPosition() < iW7) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 2:
                            rVar = (r) m3.m.p(parcel, i15, r.CREATOR);
                            break;
                        case 3:
                            x0Var = (x0) m3.m.p(parcel, i15, x0.CREATOR);
                            break;
                        case 4:
                            i0Var = (i0) m3.m.p(parcel, i15, i0.CREATOR);
                            break;
                        case 5:
                            z0Var = (z0) m3.m.p(parcel, i15, z0.CREATOR);
                            break;
                        case 6:
                            m0Var = (m0) m3.m.p(parcel, i15, m0.CREATOR);
                            break;
                        case 7:
                            n0Var = (n0) m3.m.p(parcel, i15, n0.CREATOR);
                            break;
                        case '\b':
                            y0Var = (y0) m3.m.p(parcel, i15, y0.CREATOR);
                            break;
                        case '\t':
                            o0Var = (o0) m3.m.p(parcel, i15, o0.CREATOR);
                            break;
                        case '\n':
                            sVar = (s) m3.m.p(parcel, i15, s.CREATOR);
                            break;
                        case 11:
                            q0Var = (q0) m3.m.p(parcel, i15, q0.CREATOR);
                            break;
                        case '\f':
                            r0Var = (r0) m3.m.p(parcel, i15, r0.CREATOR);
                            break;
                        case '\r':
                            p0Var = (p0) m3.m.p(parcel, i15, p0.CREATOR);
                            break;
                        case 14:
                            tVar = (t) m3.m.p(parcel, i15, t.CREATOR);
                            break;
                        default:
                            m3.m.S(i15, parcel);
                            break;
                    }
                }
                m3.m.v(iW7, parcel);
                return new AuthenticationExtensions(rVar, x0Var, i0Var, z0Var, m0Var, n0Var, y0Var, o0Var, sVar, q0Var, r0Var, p0Var, tVar);
            case 10:
                int iW8 = m3.m.W(parcel);
                boolean zJ2 = false;
                while (parcel.dataPosition() < iW8) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        m3.m.S(i16, parcel);
                    } else {
                        zJ2 = m3.m.J(i16, parcel);
                    }
                }
                m3.m.v(iW8, parcel);
                return new g(zJ2);
            case 11:
                int iW9 = m3.m.W(parcel);
                byte[] bArrN = null;
                byte[] bArrN2 = null;
                while (parcel.dataPosition() < iW9) {
                    int i17 = parcel.readInt();
                    char c12 = (char) i17;
                    if (c12 == 1) {
                        bArrN = m3.m.n(i17, parcel);
                    } else if (c12 != 2) {
                        m3.m.S(i17, parcel);
                    } else {
                        bArrN2 = m3.m.n(i17, parcel);
                    }
                }
                m3.m.v(iW9, parcel);
                return new u0(bArrN == null ? null : ag.y0.k(bArrN, bArrN.length), bArrN2 != null ? ag.y0.k(bArrN2, bArrN2.length) : null);
            case 12:
                int iW10 = m3.m.W(parcel);
                boolean zJ3 = false;
                byte[] bArrN3 = null;
                while (parcel.dataPosition() < iW10) {
                    int i18 = parcel.readInt();
                    char c13 = (char) i18;
                    if (c13 == 1) {
                        zJ3 = m3.m.J(i18, parcel);
                    } else if (c13 != 2) {
                        m3.m.S(i18, parcel);
                    } else {
                        bArrN3 = m3.m.n(i18, parcel);
                    }
                }
                m3.m.v(iW10, parcel);
                return new v0(zJ3, bArrN3 != null ? ag.y0.k(bArrN3, bArrN3.length) : null);
            case 13:
                int iW11 = m3.m.W(parcel);
                byte[] bArrN4 = null;
                byte[] bArrN5 = null;
                byte[] bArrN6 = null;
                byte[] bArrN7 = null;
                byte[] bArrN8 = null;
                while (parcel.dataPosition() < iW11) {
                    int i19 = parcel.readInt();
                    char c14 = (char) i19;
                    if (c14 == 2) {
                        bArrN4 = m3.m.n(i19, parcel);
                    } else if (c14 == 3) {
                        bArrN5 = m3.m.n(i19, parcel);
                    } else if (c14 == 4) {
                        bArrN6 = m3.m.n(i19, parcel);
                    } else if (c14 == 5) {
                        bArrN7 = m3.m.n(i19, parcel);
                    } else if (c14 != 6) {
                        m3.m.S(i19, parcel);
                    } else {
                        bArrN8 = m3.m.n(i19, parcel);
                    }
                }
                m3.m.v(iW11, parcel);
                return new h(bArrN4, bArrN5, bArrN6, bArrN7, bArrN8);
            case 14:
                int iW12 = m3.m.W(parcel);
                byte[] bArrN9 = null;
                byte[] bArrN10 = null;
                byte[] bArrN11 = null;
                String[] strArr = null;
                while (parcel.dataPosition() < iW12) {
                    int i20 = parcel.readInt();
                    char c15 = (char) i20;
                    if (c15 == 2) {
                        bArrN9 = m3.m.n(i20, parcel);
                    } else if (c15 == 3) {
                        bArrN10 = m3.m.n(i20, parcel);
                    } else if (c15 == 4) {
                        bArrN11 = m3.m.n(i20, parcel);
                    } else if (c15 != 5) {
                        m3.m.S(i20, parcel);
                    } else {
                        int iP = m3.m.P(i20, parcel);
                        int iDataPosition = parcel.dataPosition();
                        if (iP == 0) {
                            strArr = null;
                        } else {
                            String[] strArrCreateStringArray = parcel.createStringArray();
                            parcel.setDataPosition(iDataPosition + iP);
                            strArr = strArrCreateStringArray;
                        }
                    }
                }
                m3.m.v(iW12, parcel);
                return new i(bArrN9, bArrN10, bArrN11, strArr);
            case 15:
                int iW13 = m3.m.W(parcel);
                int iL2 = 0;
                String strQ5 = null;
                int iL3 = 0;
                while (parcel.dataPosition() < iW13) {
                    int i21 = parcel.readInt();
                    char c16 = (char) i21;
                    if (c16 == 2) {
                        iL2 = m3.m.L(i21, parcel);
                    } else if (c16 == 3) {
                        strQ5 = m3.m.q(i21, parcel);
                    } else if (c16 != 4) {
                        m3.m.S(i21, parcel);
                    } else {
                        iL3 = m3.m.L(i21, parcel);
                    }
                }
                m3.m.v(iW13, parcel);
                return new j(iL2, iL3, strQ5);
            case 16:
                int iW14 = m3.m.W(parcel);
                String strQ6 = null;
                Boolean boolValueOf = null;
                String strQ7 = null;
                String strQ8 = null;
                while (parcel.dataPosition() < iW14) {
                    int i22 = parcel.readInt();
                    char c17 = (char) i22;
                    if (c17 == 2) {
                        strQ6 = m3.m.q(i22, parcel);
                    } else if (c17 == 3) {
                        int iP2 = m3.m.P(i22, parcel);
                        if (iP2 == 0) {
                            boolValueOf = null;
                        } else {
                            m3.m.Y(parcel, iP2, 4);
                            boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                        }
                    } else if (c17 == 4) {
                        strQ7 = m3.m.q(i22, parcel);
                    } else if (c17 != 5) {
                        m3.m.S(i22, parcel);
                    } else {
                        strQ8 = m3.m.q(i22, parcel);
                    }
                }
                m3.m.v(iW14, parcel);
                return new l(strQ6, boolValueOf, strQ7, strQ8);
            case 17:
                try {
                    return n.a(Integer.valueOf(parcel.readInt()).intValue());
                } catch (m e13) {
                    throw new RuntimeException(e13);
                }
            case 18:
                int iW15 = m3.m.W(parcel);
                byte[] bArrN12 = null;
                byte[] bArrN13 = null;
                byte[] bArrN14 = null;
                long jN = 0;
                while (parcel.dataPosition() < iW15) {
                    int i23 = parcel.readInt();
                    char c18 = (char) i23;
                    if (c18 == 1) {
                        jN = m3.m.N(i23, parcel);
                    } else if (c18 == 2) {
                        bArrN12 = m3.m.n(i23, parcel);
                    } else if (c18 == 3) {
                        bArrN13 = m3.m.n(i23, parcel);
                    } else if (c18 != 4) {
                        m3.m.S(i23, parcel);
                    } else {
                        bArrN14 = m3.m.n(i23, parcel);
                    }
                }
                m3.m.v(iW15, parcel);
                return new w0(jN, bArrN12, bArrN13, bArrN14);
            case 19:
                int iW16 = m3.m.W(parcel);
                ArrayList arrayListT2 = null;
                while (parcel.dataPosition() < iW16) {
                    int i24 = parcel.readInt();
                    if (((char) i24) != 1) {
                        m3.m.S(i24, parcel);
                    } else {
                        arrayListT2 = m3.m.t(parcel, i24, w0.CREATOR);
                    }
                }
                m3.m.v(iW16, parcel);
                return new x0(arrayListT2);
            case 20:
                int iW17 = m3.m.W(parcel);
                while (parcel.dataPosition() < iW17) {
                    int i25 = parcel.readInt();
                    if (((char) i25) != 1) {
                        m3.m.S(i25, parcel);
                    } else {
                        m3.m.J(i25, parcel);
                    }
                }
                m3.m.v(iW17, parcel);
                return new y0();
            case 21:
                try {
                    return q.a(parcel.readInt());
                } catch (p e14) {
                    throw new IllegalArgumentException(e14);
                }
            case 22:
                int iW18 = m3.m.W(parcel);
                String strQ9 = null;
                while (parcel.dataPosition() < iW18) {
                    int i26 = parcel.readInt();
                    if (((char) i26) != 2) {
                        m3.m.S(i26, parcel);
                    } else {
                        strQ9 = m3.m.q(i26, parcel);
                    }
                }
                m3.m.v(iW18, parcel);
                return new r(strQ9);
            case 23:
                int iW19 = m3.m.W(parcel);
                boolean zJ4 = false;
                int iL4 = 0;
                boolean zJ5 = false;
                re.d dVar = null;
                re.a aVar = null;
                String strQ10 = null;
                re.c cVar = null;
                re.b bVar = null;
                while (parcel.dataPosition() < iW19) {
                    int i27 = parcel.readInt();
                    switch ((char) i27) {
                        case 1:
                            dVar = (re.d) m3.m.p(parcel, i27, re.d.CREATOR);
                            break;
                        case 2:
                            aVar = (re.a) m3.m.p(parcel, i27, re.a.CREATOR);
                            break;
                        case 3:
                            strQ10 = m3.m.q(i27, parcel);
                            break;
                        case 4:
                            zJ4 = m3.m.J(i27, parcel);
                            break;
                        case 5:
                            iL4 = m3.m.L(i27, parcel);
                            break;
                        case 6:
                            cVar = (re.c) m3.m.p(parcel, i27, re.c.CREATOR);
                            break;
                        case 7:
                            bVar = (re.b) m3.m.p(parcel, i27, re.b.CREATOR);
                            break;
                        case '\b':
                            zJ5 = m3.m.J(i27, parcel);
                            break;
                        default:
                            m3.m.S(i27, parcel);
                            break;
                    }
                }
                m3.m.v(iW19, parcel);
                return new re.e(dVar, aVar, strQ10, zJ4, iL4, cVar, bVar, zJ5);
            case 24:
                int iW20 = m3.m.W(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iW20) {
                    int i28 = parcel.readInt();
                    if (((char) i28) != 1) {
                        m3.m.S(i28, parcel);
                    } else {
                        pendingIntent = (PendingIntent) m3.m.p(parcel, i28, PendingIntent.CREATOR);
                    }
                }
                m3.m.v(iW20, parcel);
                return new re.f(pendingIntent);
            case 25:
                int iW21 = m3.m.W(parcel);
                boolean zJ6 = false;
                boolean zJ7 = false;
                boolean zJ8 = false;
                String strQ11 = null;
                String strQ12 = null;
                String strQ13 = null;
                ArrayList arrayListR = null;
                while (parcel.dataPosition() < iW21) {
                    int i29 = parcel.readInt();
                    switch ((char) i29) {
                        case 1:
                            zJ6 = m3.m.J(i29, parcel);
                            break;
                        case 2:
                            strQ11 = m3.m.q(i29, parcel);
                            break;
                        case 3:
                            strQ12 = m3.m.q(i29, parcel);
                            break;
                        case 4:
                            zJ7 = m3.m.J(i29, parcel);
                            break;
                        case 5:
                            strQ13 = m3.m.q(i29, parcel);
                            break;
                        case 6:
                            arrayListR = m3.m.r(i29, parcel);
                            break;
                        case 7:
                            zJ8 = m3.m.J(i29, parcel);
                            break;
                        default:
                            m3.m.S(i29, parcel);
                            break;
                    }
                }
                m3.m.v(iW21, parcel);
                return new re.a(zJ6, strQ11, strQ12, zJ7, strQ13, arrayListR, zJ8);
            case 26:
                int iW22 = m3.m.W(parcel);
                String strQ14 = null;
                boolean zJ9 = false;
                while (parcel.dataPosition() < iW22) {
                    int i30 = parcel.readInt();
                    char c19 = (char) i30;
                    if (c19 == 1) {
                        zJ9 = m3.m.J(i30, parcel);
                    } else if (c19 != 2) {
                        m3.m.S(i30, parcel);
                    } else {
                        strQ14 = m3.m.q(i30, parcel);
                    }
                }
                m3.m.v(iW22, parcel);
                return new re.b(zJ9, strQ14);
            case 27:
                int iW23 = m3.m.W(parcel);
                byte[] bArrN15 = null;
                boolean zJ10 = false;
                String strQ15 = null;
                while (parcel.dataPosition() < iW23) {
                    int i31 = parcel.readInt();
                    char c20 = (char) i31;
                    if (c20 == 1) {
                        zJ10 = m3.m.J(i31, parcel);
                    } else if (c20 == 2) {
                        bArrN15 = m3.m.n(i31, parcel);
                    } else if (c20 != 3) {
                        m3.m.S(i31, parcel);
                    } else {
                        strQ15 = m3.m.q(i31, parcel);
                    }
                }
                m3.m.v(iW23, parcel);
                return new re.c(zJ10, bArrN15, strQ15);
            case 28:
                int iW24 = m3.m.W(parcel);
                boolean zJ11 = false;
                while (parcel.dataPosition() < iW24) {
                    int i32 = parcel.readInt();
                    if (((char) i32) != 1) {
                        m3.m.S(i32, parcel);
                    } else {
                        zJ11 = m3.m.J(i32, parcel);
                    }
                }
                m3.m.v(iW24, parcel);
                return new re.d(zJ11);
            default:
                int iW25 = m3.m.W(parcel);
                String strQ16 = null;
                String strQ17 = null;
                String strQ18 = null;
                String strQ19 = null;
                Uri uri = null;
                String strQ20 = null;
                String strQ21 = null;
                String strQ22 = null;
                u uVar = null;
                while (parcel.dataPosition() < iW25) {
                    int i33 = parcel.readInt();
                    switch ((char) i33) {
                        case 1:
                            strQ16 = m3.m.q(i33, parcel);
                            break;
                        case 2:
                            strQ17 = m3.m.q(i33, parcel);
                            break;
                        case 3:
                            strQ18 = m3.m.q(i33, parcel);
                            break;
                        case 4:
                            strQ19 = m3.m.q(i33, parcel);
                            break;
                        case 5:
                            uri = (Uri) m3.m.p(parcel, i33, Uri.CREATOR);
                            break;
                        case 6:
                            strQ20 = m3.m.q(i33, parcel);
                            break;
                        case 7:
                            strQ21 = m3.m.q(i33, parcel);
                            break;
                        case '\b':
                            strQ22 = m3.m.q(i33, parcel);
                            break;
                        case '\t':
                            uVar = (u) m3.m.p(parcel, i33, u.CREATOR);
                            break;
                        default:
                            m3.m.S(i33, parcel);
                            break;
                    }
                }
                m3.m.v(iW25, parcel);
                return new re.g(strQ16, strQ17, strQ18, strQ19, uri, strQ20, strQ21, strQ22, uVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.f18861a) {
            case 0:
                return new r0[i7];
            case 1:
                return new f0[i7];
            case 2:
                return new e[i7];
            case 3:
                return new h0[i7];
            case 4:
                return new i0[i7];
            case 5:
                return new j0[i7];
            case 6:
                return new k0[i7];
            case 7:
                return new l0[i7];
            case 8:
                return new f[i7];
            case 9:
                return new AuthenticationExtensions[i7];
            case 10:
                return new g[i7];
            case 11:
                return new u0[i7];
            case 12:
                return new v0[i7];
            case 13:
                return new h[i7];
            case 14:
                return new i[i7];
            case 15:
                return new j[i7];
            case 16:
                return new l[i7];
            case 17:
                return new n[i7];
            case 18:
                return new w0[i7];
            case 19:
                return new x0[i7];
            case 20:
                return new y0[i7];
            case 21:
                return new q[i7];
            case 22:
                return new r[i7];
            case 23:
                return new re.e[i7];
            case 24:
                return new re.f[i7];
            case 25:
                return new re.a[i7];
            case 26:
                return new re.b[i7];
            case 27:
                return new re.c[i7];
            case 28:
                return new re.d[i7];
            default:
                return new re.g[i7];
        }
    }
}
