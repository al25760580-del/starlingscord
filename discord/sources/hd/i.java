package hd;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.exoplayer2.metadata.Metadata;
import com.reactnativecommunity.clipboard.ClipboardModule;
import ei.c0;
import ei.p;
import ei.r0;
import ei.y;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import je.e0;
import je.v;
import je.w;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends com.facebook.imagepipeline.nativecode.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final gb.a f10568g = new gb.a(28);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f10569f;

    public i(g gVar) {
        this.f10569f = gVar;
    }

    public static a F(w wVar, int i7, int i10) {
        int iS;
        String strConcat;
        int iU = wVar.u();
        Charset charsetP = P(iU);
        int i11 = i7 - 1;
        byte[] bArr = new byte[i11];
        wVar.e(bArr, 0, i11);
        if (i10 == 2) {
            strConcat = "image/" + m3.m.T(new String(bArr, 0, 3, di.d.f7630b));
            if (ClipboardModule.MIMETYPE_JPG.equals(strConcat)) {
                strConcat = ClipboardModule.MIMETYPE_JPEG;
            }
            iS = 2;
        } else {
            iS = S(bArr, 0);
            String strT = m3.m.T(new String(bArr, 0, iS, di.d.f7630b));
            strConcat = strT.indexOf(47) == -1 ? "image/".concat(strT) : strT;
        }
        int i12 = bArr[iS + 1] & 255;
        int i13 = iS + 2;
        int iR = R(bArr, i13, iU);
        String str = new String(bArr, i13, iR - i13, charsetP);
        int iO = O(iU) + iR;
        return new a(strConcat, str, i12, i11 <= iO ? e0.f13793f : Arrays.copyOfRange(bArr, iO, i11));
    }

    public static c G(w wVar, int i7, int i10, boolean z5, int i11, g gVar) throws Throwable {
        int i12 = wVar.f13861b;
        int iS = S(wVar.f13860a, i12);
        String str = new String(wVar.f13860a, i12, iS - i12, di.d.f7630b);
        wVar.F(iS + 1);
        int iG = wVar.g();
        int iG2 = wVar.g();
        long jV = wVar.v();
        if (jV == 4294967295L) {
            jV = -1;
        }
        long jV2 = wVar.v();
        long j = jV2 == 4294967295L ? -1L : jV2;
        ArrayList arrayList = new ArrayList();
        int i13 = i12 + i7;
        while (wVar.f13861b < i13) {
            j jVarJ = J(i10, wVar, z5, i11, gVar);
            if (jVarJ != null) {
                arrayList.add(jVarJ);
            }
        }
        return new c(str, iG, iG2, jV, j, (j[]) arrayList.toArray(new j[0]));
    }

    public static d H(w wVar, int i7, int i10, boolean z5, int i11, g gVar) throws Throwable {
        int i12 = wVar.f13861b;
        int iS = S(wVar.f13860a, i12);
        String str = new String(wVar.f13860a, i12, iS - i12, di.d.f7630b);
        wVar.F(iS + 1);
        int iU = wVar.u();
        boolean z6 = (iU & 2) != 0;
        boolean z7 = (iU & 1) != 0;
        int iU2 = wVar.u();
        String[] strArr = new String[iU2];
        for (int i13 = 0; i13 < iU2; i13++) {
            int i14 = wVar.f13861b;
            int iS2 = S(wVar.f13860a, i14);
            strArr[i13] = new String(wVar.f13860a, i14, iS2 - i14, di.d.f7630b);
            wVar.F(iS2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i15 = i12 + i7;
        while (wVar.f13861b < i15) {
            j jVarJ = J(i10, wVar, z5, i11, gVar);
            if (jVarJ != null) {
                arrayList.add(jVarJ);
            }
        }
        return new d(str, z6, z7, strArr, (j[]) arrayList.toArray(new j[0]));
    }

    public static e I(int i7, w wVar) {
        if (i7 < 4) {
            return null;
        }
        int iU = wVar.u();
        Charset charsetP = P(iU);
        byte[] bArr = new byte[3];
        wVar.e(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i10 = i7 - 4;
        byte[] bArr2 = new byte[i10];
        wVar.e(bArr2, 0, i10);
        int iR = R(bArr2, 0, iU);
        String str2 = new String(bArr2, 0, iR, charsetP);
        int iO = O(iU) + iR;
        return new e(str, str2, M(bArr2, iO, R(bArr2, iO, iU), charsetP));
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0232  */
    /* JADX WARN: Code duplicated, block: B:163:0x0268  */
    /* JADX WARN: Code duplicated, block: B:165:0x026f  */
    /* JADX WARN: Code duplicated, block: B:173:0x0288  */
    /* JADX WARN: Code duplicated, block: B:175:0x028e  */
    /* JADX WARN: Code duplicated, block: B:181:0x029d A[Catch: all -> 0x0286, TryCatch #2 {all -> 0x0286, blocks: (B:183:0x02ae, B:170:0x0281, B:180:0x0298, B:181:0x029d), top: B:190:0x0111 }] */
    /* JADX WARN: Code duplicated, block: B:183:0x02ae A[Catch: all -> 0x0286, TRY_LEAVE, TryCatch #2 {all -> 0x0286, blocks: (B:183:0x02ae, B:170:0x0281, B:180:0x0298, B:181:0x029d), top: B:190:0x0111 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:183:0x02ae, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [int] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r1v10, types: [je.w] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [je.w] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static j J(int i7, w wVar, boolean z5, int i10, g gVar) throws Throwable {
        int iX;
        ?? r5;
        boolean z6;
        boolean z7;
        boolean z10;
        boolean z11;
        boolean z12;
        ?? r6;
        int i11;
        int i12;
        ?? r10;
        int i13;
        w wVar2;
        ?? r11;
        int i14 = i7;
        int iU = wVar.u();
        int iU2 = wVar.u();
        int iU3 = wVar.u();
        int iU4 = i14 >= 3 ? wVar.u() : 0;
        if (i14 == 4) {
            iX = wVar.x();
            if (!z5) {
                iX = (((iX >> 24) & 255) << 21) | (iX & 255) | (((iX >> 8) & 255) << 7) | (((iX >> 16) & 255) << 14);
            }
        } else {
            iX = i14 == 3 ? wVar.x() : wVar.w();
        }
        int iT = iX;
        int iZ = i14 >= 3 ? wVar.z() : 0;
        j bVar = null;
        if (iU == 0 && iU2 == 0 && iU3 == 0 && iU4 == 0 && iT == 0 && iZ == 0) {
            wVar.F(wVar.f13862c);
            return null;
        }
        int i15 = wVar.f13861b + iT;
        if (i15 > wVar.f13862c) {
            je.b.N("Id3Decoder", "Frame size exceeds remaining tag data");
            wVar.F(wVar.f13862c);
            return null;
        }
        if (gVar != null) {
            r5 = iU2;
            if (!gVar.c(i14, iU, iU2, iU3, iU4)) {
                i14 = i14;
                wVar.F(i15);
                return null;
            }
        } else {
            r5 = iU2;
        }
        i14 = i14;
        if (i14 == 3) {
            boolean z13 = (iZ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0;
            z12 = false;
            z11 = (iZ & 64) != 0;
            z10 = (iZ & 32) != 0;
            z7 = z13;
            z6 = z13;
        } else if (i14 == 4) {
            boolean z14 = (iZ & 64) != 0;
            boolean z15 = (iZ & 8) != 0;
            boolean z16 = (iZ & 4) != 0;
            boolean z17 = (iZ & 2) != 0;
            boolean z18 = z15;
            z10 = z14;
            z6 = z18;
            z7 = (iZ & 1) != 0;
            z11 = z16;
            z12 = z17;
        } else {
            z6 = false;
            z7 = false;
            z10 = false;
            z11 = false;
            z12 = false;
        }
        if (z6 || z11) {
            je.b.N("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            wVar.F(i15);
            return null;
        }
        if (z10) {
            iT--;
            wVar.G(1);
        }
        if (z7) {
            iT -= 4;
            wVar.G(4);
        }
        if (z12) {
            iT = T(iT, wVar);
        }
        try {
            try {
                if (iU == 84 && r5 == 88 && iU3 == 88 && (i14 == 2 || iU4 == 88)) {
                    if (iT >= 1) {
                        int iU5 = wVar.u();
                        int i16 = iT - 1;
                        byte[] bArr = new byte[i16];
                        wVar.e(bArr, 0, i16);
                        int iR = R(bArr, 0, iU5);
                        bVar = new n("TXXX", new String(bArr, 0, iR, P(iU5)), N(bArr, iU5, O(iU5) + iR));
                    }
                } else if (iU == 84) {
                    String strQ = Q(i14, iU, r5, iU3, iU4);
                    if (iT >= 1) {
                        int iU6 = wVar.u();
                        int i17 = iT - 1;
                        byte[] bArr2 = new byte[i17];
                        wVar.e(bArr2, 0, i17);
                        bVar = new n(strQ, null, N(bArr2, iU6, 0));
                    }
                } else if (iU == 87 && r5 == 88 && iU3 == 88 && (i14 == 2 || iU4 == 88)) {
                    if (iT >= 1) {
                        int iU7 = wVar.u();
                        int i18 = iT - 1;
                        byte[] bArr3 = new byte[i18];
                        wVar.e(bArr3, 0, i18);
                        int iR2 = R(bArr3, 0, iU7);
                        String str = new String(bArr3, 0, iR2, P(iU7));
                        int iO = O(iU7) + iR2;
                        bVar = new o("WXXX", str, M(bArr3, iO, S(bArr3, iO), di.d.f7630b));
                    }
                } else if (iU == 87) {
                    String strQ2 = Q(i14, iU, r5, iU3, iU4);
                    byte[] bArr4 = new byte[iT];
                    wVar.e(bArr4, 0, iT);
                    bVar = new o(strQ2, null, new String(bArr4, 0, S(bArr4, 0), di.d.f7630b));
                } else if (iU == 80 && r5 == 82 && iU3 == 73 && iU4 == 86) {
                    byte[] bArr5 = new byte[iT];
                    wVar.e(bArr5, 0, iT);
                    int iS = S(bArr5, 0);
                    String str2 = new String(bArr5, 0, iS, di.d.f7630b);
                    int i19 = iS + 1;
                    bVar = new m(iT <= i19 ? e0.f13793f : Arrays.copyOfRange(bArr5, i19, iT), str2);
                } else {
                    if (iU != 71 || r5 != 69 || iU3 != 79 || (iU4 != 66 && i14 != 2)) {
                        if (i14 == 2) {
                            if (iU == 80 && r5 == 73 && iU3 == 67) {
                                bVar = F(wVar, iT, i14);
                            } else if (iU != 67 && r5 == 79 && iU3 == 77 && (iU4 == 77 || i14 == 2)) {
                                bVar = I(iT, wVar);
                            } else if (iU != 67 && r5 == 72 && iU3 == 65 && iU4 == 80) {
                                int i20 = iT;
                                i11 = iU3;
                                i12 = i20;
                                r11 = r5;
                                i13 = iU4;
                                try {
                                    bVar = G(wVar, i12, i14, z5, i10, gVar);
                                    i14 = i7;
                                    r5 = wVar;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r6 = wVar;
                                    r6.F(i15);
                                    throw th;
                                }
                            } else {
                                int i21 = iT;
                                i11 = iU3;
                                i12 = i21;
                                r10 = r5;
                                i13 = iU4;
                                if (iU != 67 && r10 == 84 && i11 == 79 && i13 == 67) {
                                    i14 = i7;
                                    w wVar3 = wVar;
                                    bVar = H(wVar3, i12, i14, z5, i10, gVar);
                                    r5 = wVar3;
                                    r11 = r10;
                                } else {
                                    i14 = i7;
                                    wVar2 = wVar;
                                    if (iU != 77 && r10 == 76 && i11 == 76 && i13 == 84) {
                                        bVar = L(i12, wVar2);
                                    } else {
                                        String strQ3 = Q(i14, iU, r10 == true ? 1 : 0, i11, i13);
                                        byte[] bArr6 = new byte[i12];
                                        wVar2.e(bArr6, 0, i12);
                                        bVar = new b(bArr6, strQ3);
                                        r5 = wVar2;
                                        r11 = r10;
                                    }
                                }
                            }
                        } else if (iU == 65 && r5 == 80 && iU3 == 73 && iU4 == 67) {
                            bVar = F(wVar, iT, i14);
                        } else {
                            if (iU != 67) {
                            }
                            if (iU != 67) {
                                int i22 = iT;
                                i11 = iU3;
                                i12 = i22;
                                r10 = r5;
                                i13 = iU4;
                                if (iU != 67) {
                                    i14 = i7;
                                    wVar2 = wVar;
                                    if (iU != 77) {
                                        String strQ4 = Q(i14, iU, r10 == true ? 1 : 0, i11, i13);
                                        byte[] bArr7 = new byte[i12];
                                        wVar2.e(bArr7, 0, i12);
                                        bVar = new b(bArr7, strQ4);
                                        r5 = wVar2;
                                        r11 = r10;
                                    } else {
                                        String strQ5 = Q(i14, iU, r10 == true ? 1 : 0, i11, i13);
                                        byte[] bArr8 = new byte[i12];
                                        wVar2.e(bArr8, 0, i12);
                                        bVar = new b(bArr8, strQ5);
                                        r5 = wVar2;
                                        r11 = r10;
                                    }
                                } else {
                                    i14 = i7;
                                    wVar2 = wVar;
                                    if (iU != 77) {
                                        String strQ6 = Q(i14, iU, r10 == true ? 1 : 0, i11, i13);
                                        byte[] bArr9 = new byte[i12];
                                        wVar2.e(bArr9, 0, i12);
                                        bVar = new b(bArr9, strQ6);
                                        r5 = wVar2;
                                        r11 = r10;
                                    } else {
                                        String strQ7 = Q(i14, iU, r10 == true ? 1 : 0, i11, i13);
                                        byte[] bArr10 = new byte[i12];
                                        wVar2.e(bArr10, 0, i12);
                                        bVar = new b(bArr10, strQ7);
                                        r5 = wVar2;
                                        r11 = r10;
                                    }
                                }
                            } else {
                                int i23 = iT;
                                i11 = iU3;
                                i12 = i23;
                                r10 = r5;
                                i13 = iU4;
                                if (iU != 67) {
                                    i14 = i7;
                                    wVar2 = wVar;
                                    if (iU != 77) {
                                        String strQ8 = Q(i14, iU, r10 == true ? 1 : 0, i11, i13);
                                        byte[] bArr11 = new byte[i12];
                                        wVar2.e(bArr11, 0, i12);
                                        bVar = new b(bArr11, strQ8);
                                        r5 = wVar2;
                                        r11 = r10;
                                    } else {
                                        String strQ9 = Q(i14, iU, r10 == true ? 1 : 0, i11, i13);
                                        byte[] bArr12 = new byte[i12];
                                        wVar2.e(bArr12, 0, i12);
                                        bVar = new b(bArr12, strQ9);
                                        r5 = wVar2;
                                        r11 = r10;
                                    }
                                } else {
                                    i14 = i7;
                                    wVar2 = wVar;
                                    if (iU != 77) {
                                        String strQ10 = Q(i14, iU, r10 == true ? 1 : 0, i11, i13);
                                        byte[] bArr13 = new byte[i12];
                                        wVar2.e(bArr13, 0, i12);
                                        bVar = new b(bArr13, strQ10);
                                        r5 = wVar2;
                                        r11 = r10;
                                    } else {
                                        String strQ11 = Q(i14, iU, r10 == true ? 1 : 0, i11, i13);
                                        byte[] bArr14 = new byte[i12];
                                        wVar2.e(bArr14, 0, i12);
                                        bVar = new b(bArr14, strQ11);
                                        r5 = wVar2;
                                        r11 = r10;
                                    }
                                }
                            }
                        }
                        if (bVar == null) {
                            r5 = wVar2;
                            r11 = r10;
                            je.b.N("Id3Decoder", "Failed to decode frame: id=" + Q(i14, iU, r11, i11, i13) + ", frameSize=" + i12);
                        }
                        r5 = wVar2;
                        r11 = r10;
                        r5.F(i15);
                        return bVar;
                    }
                    bVar = K(iT, wVar);
                }
                int i24 = iT;
                i11 = iU3;
                i12 = i24;
                r11 = r5;
                i13 = iU4;
                r5 = wVar;
                if (bVar == null) {
                    r5 = wVar2;
                    r11 = r10;
                    je.b.N("Id3Decoder", "Failed to decode frame: id=" + Q(i14, iU, r11, i11, i13) + ", frameSize=" + i12);
                }
                r5 = wVar2;
                r11 = r10;
                r5.F(i15);
                return bVar;
            } catch (Throwable th3) {
                th = th3;
                r6 = wVar;
            }
        } catch (Throwable th4) {
            th = th4;
            r6 = r5;
        }
    }

    public static f K(int i7, w wVar) {
        int iU = wVar.u();
        Charset charsetP = P(iU);
        int i10 = i7 - 1;
        byte[] bArr = new byte[i10];
        wVar.e(bArr, 0, i10);
        int iS = S(bArr, 0);
        String str = new String(bArr, 0, iS, di.d.f7630b);
        int i11 = iS + 1;
        int iR = R(bArr, i11, iU);
        String strM = M(bArr, i11, iR, charsetP);
        int iO = O(iU) + iR;
        int iR2 = R(bArr, iO, iU);
        String strM2 = M(bArr, iO, iR2, charsetP);
        int iO2 = O(iU) + iR2;
        return new f(str, strM, strM2, i10 <= iO2 ? e0.f13793f : Arrays.copyOfRange(bArr, iO2, i10));
    }

    public static l L(int i7, w wVar) {
        int iZ = wVar.z();
        int iW = wVar.w();
        int iW2 = wVar.w();
        int iU = wVar.u();
        int iU2 = wVar.u();
        v vVar = new v();
        vVar.n(wVar);
        int i10 = ((i7 - 10) * 8) / (iU + iU2);
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = vVar.i(iU);
            int i13 = vVar.i(iU2);
            iArr[i11] = i12;
            iArr2[i11] = i13;
        }
        return new l(iZ, iW, iArr, iArr2, iW2);
    }

    public static String M(byte[] bArr, int i7, int i10, Charset charset) {
        return (i10 <= i7 || i10 > bArr.length) ? "" : new String(bArr, i7, i10 - i7, charset);
    }

    public static r0 N(byte[] bArr, int i7, int i10) {
        Object[] objArrCopyOf;
        if (i10 >= bArr.length) {
            return ei.e0.r("");
        }
        c0 c0Var = ei.e0.f8303e;
        p.c(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int iR = R(bArr, i10, i7);
        int i11 = 0;
        boolean z5 = false;
        while (i10 < iR) {
            String str = new String(bArr, i10, iR - i10, P(i7));
            int i12 = i11 + 1;
            if (objArr.length < i12) {
                objArrCopyOf = Arrays.copyOf(objArr, y.d(objArr.length, i12));
            } else {
                if (z5) {
                    objArrCopyOf = (Object[]) objArr.clone();
                }
                objArr[i11] = str;
                int iO = iR + O(i7);
                i11++;
                i10 = iO;
                iR = R(bArr, iO, i7);
            }
            objArr = objArrCopyOf;
            z5 = false;
            objArr[i11] = str;
            int iO2 = iR + O(i7);
            i11++;
            i10 = iO2;
            iR = R(bArr, iO2, i7);
        }
        r0 r0VarJ = ei.e0.j(i11, objArr);
        return r0VarJ.isEmpty() ? ei.e0.r("") : r0VarJ;
    }

    public static int O(int i7) {
        return (i7 == 0 || i7 == 3) ? 1 : 2;
    }

    public static Charset P(int i7) {
        if (i7 == 1) {
            return di.d.f7634f;
        }
        if (i7 != 2) {
            return i7 != 3 ? di.d.f7630b : di.d.f7631c;
        }
        return di.d.f7632d;
    }

    public static String Q(int i7, int i10, int i11, int i12, int i13) {
        return i7 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static int R(byte[] bArr, int i7, int i10) {
        int iS = S(bArr, i7);
        if (i10 == 0 || i10 == 3) {
            return iS;
        }
        while (iS < bArr.length - 1) {
            if ((iS - i7) % 2 == 0 && bArr[iS + 1] == 0) {
                return iS;
            }
            iS = S(bArr, iS + 1);
        }
        return bArr.length;
    }

    public static int S(byte[] bArr, int i7) {
        while (i7 < bArr.length) {
            if (bArr[i7] == 0) {
                return i7;
            }
            i7++;
        }
        return bArr.length;
    }

    public static int T(int i7, w wVar) {
        byte[] bArr = wVar.f13860a;
        int i10 = wVar.f13861b;
        int i11 = i10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= i10 + i7) {
                return i7;
            }
            if ((bArr[i11] & 255) == 255 && bArr[i12] == 0) {
                System.arraycopy(bArr, i11 + 2, bArr, i12, (i7 - (i11 - i10)) - 2);
                i7--;
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007a A[PHI: r3
      0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean U(w wVar, int i7, int i10, boolean z5) {
        int iW;
        long jW;
        int iZ;
        int i11;
        int i12 = wVar.f13861b;
        while (true) {
            try {
                boolean z6 = true;
                if (wVar.a() < i10) {
                    wVar.F(i12);
                    return true;
                }
                if (i7 >= 3) {
                    iW = wVar.g();
                    jW = wVar.v();
                    iZ = wVar.z();
                } else {
                    iW = wVar.w();
                    jW = wVar.w();
                    iZ = 0;
                }
                if (iW == 0 && jW == 0 && iZ == 0) {
                    wVar.F(i12);
                    return true;
                }
                if (i7 == 4 && !z5) {
                    if ((8421504 & jW) != 0) {
                        wVar.F(i12);
                        return false;
                    }
                    jW = (((jW >> 24) & 255) << 21) | (jW & 255) | (((jW >> 8) & 255) << 7) | (((jW >> 16) & 255) << 14);
                }
                if (i7 == 4) {
                    i11 = (iZ & 64) != 0 ? 1 : 0;
                    if ((iZ & 1) == 0) {
                        z6 = false;
                    }
                } else if (i7 == 3) {
                    i11 = (iZ & 32) != 0 ? 1 : 0;
                    if ((iZ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
                        z6 = false;
                    }
                } else {
                    i11 = 0;
                    z6 = false;
                }
                if (z6) {
                    i11 += 4;
                }
                if (jW < i11) {
                    wVar.F(i12);
                    return false;
                }
                if (wVar.a() < jW) {
                    wVar.F(i12);
                    return false;
                }
                wVar.G((int) jW);
            } catch (Throwable th2) {
                wVar.F(i12);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c7 A[SYNTHETIC] */
    public final Metadata E(byte[] bArr, int i7) {
        boolean z5;
        h hVar;
        int i10;
        int i11;
        int iT;
        j jVarJ;
        ArrayList arrayList = new ArrayList();
        w wVar = new w(bArr, i7);
        boolean z6 = false;
        if (wVar.a() < 10) {
            je.b.N("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iW = wVar.w();
            if (iW == 4801587) {
                int iU = wVar.u();
                wVar.G(1);
                int iU2 = wVar.u();
                int iT2 = wVar.t();
                if (iU != 2) {
                    if (iU == 3) {
                        if ((iU2 & 64) != 0) {
                            int iG = wVar.g();
                            wVar.G(iG);
                            iT2 -= iG + 4;
                        }
                    } else if (iU == 4) {
                        if ((iU2 & 64) != 0) {
                            int iT3 = wVar.t();
                            wVar.G(iT3 - 4);
                            iT2 -= iT3;
                        }
                        if ((iU2 & 16) != 0) {
                            iT2 -= 10;
                        }
                    } else {
                        com.discord.chat.presentation.list.a.q(iU, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                    }
                    if (iU < 4) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    hVar = new h(iU, iT2, z5);
                } else if ((iU2 & 64) != 0) {
                    je.b.N("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iU < 4 || (iU2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    hVar = new h(iU, iT2, z5);
                }
                if (hVar == null) {
                    return null;
                }
                i10 = hVar.f10565a;
                int i12 = wVar.f13861b;
                i11 = i10 == 2 ? 6 : 10;
                iT = hVar.f10567c;
                if (hVar.f10566b) {
                    iT = T(iT, wVar);
                }
                wVar.E(i12 + iT);
                if (!U(wVar, i10, i11, false)) {
                    if (i10 == 4 || !U(wVar, 4, i11, true)) {
                        com.discord.chat.presentation.list.a.q(i10, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                        return null;
                    }
                    z6 = true;
                }
                while (wVar.a() >= i11) {
                    jVarJ = J(i10, wVar, z6, i11, this.f10569f);
                    if (jVarJ != null) {
                        arrayList.add(jVarJ);
                    }
                }
                return new Metadata(arrayList);
            }
            je.b.N("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iW))));
        }
        hVar = null;
        if (hVar == null) {
            return null;
        }
        i10 = hVar.f10565a;
        int i13 = wVar.f13861b;
        if (i10 == 2) {
        }
        iT = hVar.f10567c;
        if (hVar.f10566b) {
            iT = T(iT, wVar);
        }
        wVar.E(i13 + iT);
        if (!U(wVar, i10, i11, false)) {
            if (i10 == 4) {
            }
            com.discord.chat.presentation.list.a.q(i10, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
            return null;
        }
        while (wVar.a() >= i11) {
            jVarJ = J(i10, wVar, z6, i11, this.f10569f);
            if (jVarJ != null) {
                arrayList.add(jVarJ);
            }
        }
        return new Metadata(arrayList);
    }

    @Override // com.facebook.imagepipeline.nativecode.b
    public final Metadata j(cd.d dVar, ByteBuffer byteBuffer) {
        return E(byteBuffer.array(), byteBuffer.limit());
    }
}
