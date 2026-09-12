package xc;

import android.util.Pair;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import ei.r0;
import gc.g0;
import gc.h1;
import ic.o0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import je.e0;
import je.v;
import je.w;
import md.j0;
import mo.c0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f22754a;

    static {
        int i7 = e0.f13788a;
        f22754a = "OpusHead".getBytes(di.d.f7631c);
    }

    public static j0 a(int i7, w wVar) {
        wVar.F(i7 + 12);
        wVar.G(1);
        b(wVar);
        wVar.G(2);
        int iU = wVar.u();
        if ((iU & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            wVar.G(2);
        }
        if ((iU & 64) != 0) {
            wVar.G(wVar.u());
        }
        if ((iU & 32) != 0) {
            wVar.G(2);
        }
        wVar.G(1);
        b(wVar);
        String strE = je.o.e(wVar.u());
        if ("audio/mpeg".equals(strE) || "audio/vnd.dts".equals(strE) || "audio/vnd.dts.hd".equals(strE)) {
            return new j0(strE, null, -1L, -1L);
        }
        wVar.G(4);
        long jV = wVar.v();
        long jV2 = wVar.v();
        wVar.G(1);
        int iB = b(wVar);
        long j = jV2;
        byte[] bArr = new byte[iB];
        wVar.e(bArr, 0, iB);
        if (j <= 0) {
            j = -1;
        }
        return new j0(strE, bArr, j, jV > 0 ? jV : -1L);
    }

    public static int b(w wVar) {
        int iU = wVar.u();
        int i7 = iU & 127;
        while ((iU & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            iU = wVar.u();
            i7 = (i7 << 7) | (iU & 127);
        }
        return i7;
    }

    public static androidx.recyclerview.widget.h c(w wVar) {
        long jV;
        wVar.F(8);
        if (lc.a.d(wVar.g()) == 0) {
            jV = wVar.v();
            wVar.G(4);
        } else {
            long jO = wVar.o();
            wVar.G(8);
            jV = jO;
        }
        return new androidx.recyclerview.widget.h(new Metadata(new jc.a((jV - ((long) 2082844800)) * 1000)), wVar.v(), 9);
    }

    public static Pair d(w wVar, int i7, int i10) throws h1 {
        p pVar;
        Pair pairCreate;
        int i11;
        int i12;
        int i13 = wVar.f13861b;
        while (i13 - i7 < i10) {
            wVar.F(i13);
            int iG = wVar.g();
            yk.a.c("childAtomSize must be positive", iG > 0);
            if (wVar.g() == 1936289382) {
                int i14 = i13 + 8;
                int i15 = 0;
                int i16 = -1;
                Integer numValueOf = null;
                String strS = null;
                while (i14 - i13 < iG) {
                    wVar.F(i14);
                    int iG2 = wVar.g();
                    int iG3 = wVar.g();
                    if (iG3 == 1718775137) {
                        numValueOf = Integer.valueOf(wVar.g());
                    } else if (iG3 == 1935894637) {
                        wVar.G(4);
                        strS = wVar.s(4, di.d.f7631c);
                    } else if (iG3 == 1935894633) {
                        i16 = i14;
                        i15 = iG2;
                    }
                    i14 += iG2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strS) || "cbc1".equals(strS) || "cens".equals(strS) || "cbcs".equals(strS)) {
                    yk.a.c("frma atom is mandatory", numValueOf != null);
                    yk.a.c("schi atom is mandatory", i16 != -1);
                    int i17 = i16 + 8;
                    while (true) {
                        if (i17 - i16 >= i15) {
                            pVar = null;
                            break;
                        }
                        wVar.F(i17);
                        int iG4 = wVar.g();
                        if (wVar.g() == 1952804451) {
                            int iD = lc.a.d(wVar.g());
                            wVar.G(1);
                            if (iD == 0) {
                                wVar.G(1);
                                i12 = 0;
                                i11 = 0;
                            } else {
                                int iU = wVar.u();
                                i11 = iU & 15;
                                i12 = (iU & 240) >> 4;
                            }
                            boolean z5 = wVar.u() == 1;
                            int iU2 = wVar.u();
                            byte[] bArr2 = new byte[16];
                            wVar.e(bArr2, 0, 16);
                            if (z5 && iU2 == 0) {
                                int iU3 = wVar.u();
                                byte[] bArr3 = new byte[iU3];
                                wVar.e(bArr3, 0, iU3);
                                bArr = bArr3;
                            }
                            pVar = new p(z5, strS, iU2, bArr2, i12, i11, bArr);
                            break;
                        }
                        i17 += iG4;
                    }
                    yk.a.c("tenc atom is mandatory", pVar != null);
                    int i18 = e0.f13788a;
                    pairCreate = Pair.create(numValueOf, pVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i13 += iG;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:107:0x02f7 A[DONT_INVERT, LOOP:12: B:107:0x02f7->B:111:0x0302, LOOP_START, PHI: r16
      0x02f7: PHI (r16v4 int) = (r16v2 int), (r16v5 int) binds: [B:106:0x02f5, B:111:0x0302] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:108:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:111:0x0302 A[LOOP:12: B:107:0x02f7->B:111:0x0302, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x0308 A[EDGE_INSN: B:112:0x0308->B:113:0x030a BREAK  A[LOOP:12: B:107:0x02f7->B:111:0x0302]] */
    /* JADX WARN: Code duplicated, block: B:114:0x030c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:121:0x031e  */
    /* JADX WARN: Code duplicated, block: B:123:0x034c  */
    /* JADX WARN: Code duplicated, block: B:124:0x034f  */
    /* JADX WARN: Code duplicated, block: B:129:0x036d  */
    /* JADX WARN: Code duplicated, block: B:131:0x037d  */
    /* JADX WARN: Code duplicated, block: B:133:0x038e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0448  */
    /* JADX WARN: Code duplicated, block: B:164:0x044a  */
    /* JADX WARN: Code duplicated, block: B:167:0x0454  */
    /* JADX WARN: Code duplicated, block: B:169:0x045a  */
    /* JADX WARN: Code duplicated, block: B:172:0x0464 A[LOOP:4: B:170:0x0461->B:172:0x0464, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:175:0x048b  */
    /* JADX WARN: Code duplicated, block: B:178:0x0490  */
    /* JADX WARN: Code duplicated, block: B:179:0x0492  */
    /* JADX WARN: Code duplicated, block: B:183:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:185:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:193:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:194:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:196:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:200:0x050b  */
    /* JADX WARN: Code duplicated, block: B:201:0x050d  */
    /* JADX WARN: Code duplicated, block: B:204:0x0513  */
    /* JADX WARN: Code duplicated, block: B:205:0x0516  */
    /* JADX WARN: Code duplicated, block: B:207:0x0519  */
    /* JADX WARN: Code duplicated, block: B:208:0x051c  */
    /* JADX WARN: Code duplicated, block: B:210:0x0520  */
    /* JADX WARN: Code duplicated, block: B:211:0x0523  */
    /* JADX WARN: Code duplicated, block: B:213:0x0527  */
    /* JADX WARN: Code duplicated, block: B:214:0x052a  */
    /* JADX WARN: Code duplicated, block: B:218:0x0535  */
    /* JADX WARN: Code duplicated, block: B:220:0x0541  */
    /* JADX WARN: Code duplicated, block: B:221:0x0553  */
    /* JADX WARN: Code duplicated, block: B:224:0x055d  */
    /* JADX WARN: Code duplicated, block: B:226:0x0582  */
    /* JADX WARN: Code duplicated, block: B:227:0x0585  */
    /* JADX WARN: Code duplicated, block: B:230:0x058b  */
    /* JADX WARN: Code duplicated, block: B:257:0x02e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x025c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x02d5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x0258 A[EDGE_INSN: B:263:0x0258->B:77:0x0258 BREAK  A[LOOP:10: B:73:0x0241->B:76:0x0249], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x02ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0211  */
    /* JADX WARN: Code duplicated, block: B:72:0x023b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0243  */
    /* JADX WARN: Code duplicated, block: B:76:0x0249 A[LOOP:10: B:73:0x0241->B:76:0x0249, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x027a  */
    /* JADX WARN: Code duplicated, block: B:82:0x027e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0282 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x029d  */
    /* JADX WARN: Code duplicated, block: B:92:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:93:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:96:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:98:0x02b7  */
    public static r e(o oVar, a aVar, pc.q qVar) throws h1 {
        d dVar;
        boolean z5;
        int iX;
        int iX2;
        int i7;
        int iX3;
        int iA;
        long j;
        int i10;
        w wVar;
        long[] jArr;
        long[] jArr2;
        d dVar2;
        long j5;
        long[] jArr3;
        int[] iArr;
        long[] jArr4;
        int[] iArr2;
        int iG;
        int iX4;
        int i11;
        int i12;
        int i13;
        long j7;
        long j10;
        int i14;
        w wVar2;
        int i15;
        int iX5;
        int iG2;
        int i16;
        long[] jArr5;
        long[] jArr6;
        int[] iArrCopyOf;
        int i17;
        int[] iArrCopyOf2;
        long j11;
        int i18;
        o oVar2;
        int i19;
        String str;
        int[] iArr3;
        long[] jArr7;
        int i20;
        int[] iArr4;
        long j12;
        int i21;
        boolean zA;
        int i22;
        int iC;
        int i23;
        int iX6;
        long jP;
        long[] jArr8;
        int i24;
        long j13;
        long[] jArr9;
        int[] iArr5;
        int i25;
        long[] jArr10;
        int i26;
        int i27;
        boolean z6;
        int[] iArr6;
        int[] iArr7;
        int i28;
        boolean z7;
        int i29;
        int i30;
        int[] iArr8;
        int i31;
        boolean z10;
        boolean z11;
        long[] jArr11;
        int[] iArr9;
        int i32;
        int[] iArr10;
        long[] jArr12;
        int i33;
        int i34;
        long j14;
        long j15;
        boolean z12;
        int i35;
        int i36;
        int[] iArr11;
        long jP2;
        boolean z13;
        long j16;
        int i37;
        boolean z14;
        long j17;
        int i38;
        int i39;
        int i40;
        int i41;
        boolean z15;
        long j18;
        int i42;
        Format format = oVar.f22835f;
        b bVarG = aVar.g(1937011578);
        if (bVarG != null) {
            a5.g gVar = new a5.g();
            w wVar3 = bVarG.f22744i;
            gVar.f186i = wVar3;
            wVar3.F(12);
            int iX7 = wVar3.x();
            if ("audio/raw".equals(format.I)) {
                int iX8 = e0.x(format.X, format.V);
                if (iX7 == 0 || iX7 % iX8 != 0) {
                    je.b.N("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iX8 + ", stsz sample size: " + iX7);
                    iX7 = iX8;
                }
            }
            if (iX7 == 0) {
                iX7 = -1;
            }
            gVar.f184d = iX7;
            gVar.f185e = wVar3.x();
            dVar = gVar;
        } else {
            b bVarG2 = aVar.g(1937013298);
            if (bVarG2 == null) {
                throw h1.a("Track has no sample table size information", null);
            }
            ad.e eVar = new ad.e();
            w wVar4 = bVarG2.f22744i;
            eVar.f346w = wVar4;
            wVar4.F(12);
            eVar.f343e = wVar4.x() & 255;
            eVar.f342d = wVar4.x();
            dVar = eVar;
        }
        int iB = dVar.b();
        if (iB == 0) {
            return new r(oVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        b bVarG3 = aVar.g(1937007471);
        if (bVarG3 == null) {
            bVarG3 = aVar.g(1668232756);
            bVarG3.getClass();
            z5 = true;
        } else {
            z5 = false;
        }
        w wVar5 = bVarG3.f22744i;
        b bVarG4 = aVar.g(1937011555);
        bVarG4.getClass();
        w wVar6 = bVarG4.f22744i;
        b bVarG5 = aVar.g(1937011827);
        bVarG5.getClass();
        w wVar7 = bVarG5.f22744i;
        b bVarG6 = aVar.g(1937011571);
        w wVar8 = bVarG6 != null ? bVarG6.f22744i : null;
        b bVarG7 = aVar.g(1668576371);
        w wVar9 = bVarG7 != null ? bVarG7.f22744i : null;
        c cVar = new c(wVar6, wVar5, z5);
        wVar7.F(12);
        int iX9 = wVar7.x() - 1;
        int iX10 = wVar7.x();
        int iX11 = wVar7.x();
        if (wVar9 != null) {
            wVar9.F(12);
            iX = wVar9.x();
        } else {
            iX = 0;
        }
        if (wVar8 != null) {
            wVar8.F(12);
            iX2 = wVar8.x();
            if (iX2 > 0) {
                iX3 = wVar8.x() - 1;
                i7 = 0;
            } else {
                i7 = 0;
                wVar8 = null;
            }
            iA = dVar.a();
            j = oVar.f22832c;
            i10 = oVar.f22831b;
            wVar = wVar9;
            jArr = oVar.f22838i;
            jArr2 = oVar.f22837h;
            dVar2 = dVar;
            String str2 = format.I;
            j5 = 0;
            if (iA == -1 && (("audio/raw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/g711-alaw".equals(str2)) && iX9 == 0 && iX == 0 && iX2 == 0)) {
                int i43 = cVar.f22745a;
                long[] jArr13 = new long[i43];
                int[] iArr12 = new int[i43];
                while (cVar.a()) {
                    int i44 = cVar.f22746b;
                    long[] jArr14 = jArr13;
                    jArr14[i44] = cVar.f22748d;
                    iArr12[i44] = cVar.f22747c;
                    jArr13 = jArr14;
                    iA = iA;
                }
                int i45 = iA;
                long[] jArr15 = jArr13;
                long j19 = iX11;
                int i46 = 8192 / i45;
                int i47 = i7;
                int iF = i47;
                while (i47 < i43) {
                    iF += e0.f(iArr12[i47], i46);
                    i47++;
                    j19 = j19;
                }
                long j20 = j19;
                long[] jArr16 = new long[iF];
                int[] iArr13 = new int[iF];
                jArr6 = new long[iF];
                iArr4 = new int[iF];
                int i48 = i7;
                int i49 = i48;
                i20 = i49;
                int i50 = i20;
                while (i48 < i43) {
                    int i51 = iArr12[i48];
                    long j21 = jArr15[i48];
                    int i52 = i50;
                    int i53 = i43;
                    int i54 = i20;
                    int i55 = i52;
                    int i56 = i48;
                    int i57 = i51;
                    while (i57 > 0) {
                        int iMin = Math.min(i46, i57);
                        jArr16[i55] = j21;
                        int i58 = i57;
                        int i59 = i45 * iMin;
                        iArr13[i55] = i59;
                        int iMax = Math.max(i54, i59);
                        jArr6[i55] = ((long) i49) * j20;
                        iArr4[i55] = 1;
                        j21 += (long) iArr13[i55];
                        i49 += iMin;
                        i57 = i58 - iMin;
                        i55++;
                        i54 = iMax;
                    }
                    i48 = i56 + 1;
                    int i60 = i55;
                    i20 = i54;
                    i43 = i53;
                    i50 = i60;
                }
                oVar2 = oVar;
                j11 = j20 * ((long) i49);
                jArr7 = jArr16;
                iArr3 = iArr13;
            } else {
                jArr3 = new long[iB];
                iArr = new int[iB];
                jArr4 = new long[iB];
                iArr2 = new int[iB];
                iG = iX11;
                iX4 = iX3;
                i11 = i7;
                i12 = i11;
                i13 = i12;
                j7 = 0;
                j10 = 0;
                i14 = iX9;
                wVar2 = wVar8;
                i15 = i13;
                iX5 = iX10;
                iG2 = i15;
                while (true) {
                    if (i15 >= iB) {
                        int[] iArr14 = iArr;
                        i16 = iG2;
                        jArr5 = jArr3;
                        jArr6 = jArr4;
                        iArrCopyOf = iArr2;
                        i17 = i12;
                        iArrCopyOf2 = iArr14;
                        break;
                    }
                    j12 = j10;
                    i21 = i12;
                    zA = true;
                    while (i21 == 0) {
                        zA = cVar.a();
                        if (!zA) {
                            break;
                        }
                        j12 = cVar.f22748d;
                        i21 = cVar.f22747c;
                        iG2 = iG2;
                    }
                    i22 = iG2;
                    if (!zA) {
                        je.b.N("AtomParsers", "Unexpected end of chunk data");
                        long[] jArrCopyOf = Arrays.copyOf(jArr3, i15);
                        iArrCopyOf2 = Arrays.copyOf(iArr, i15);
                        long[] jArrCopyOf2 = Arrays.copyOf(jArr4, i15);
                        iArrCopyOf = Arrays.copyOf(iArr2, i15);
                        jArr5 = jArrCopyOf;
                        jArr6 = jArrCopyOf2;
                        iB = i15;
                        i17 = i21;
                        i16 = i22;
                        break;
                    }
                    iG2 = i22;
                    if (wVar != null) {
                        iX6 = i13;
                        while (iX6 == 0 && iX > 0) {
                            iX6 = wVar.x();
                            iG2 = wVar.g();
                            iX--;
                        }
                        i13 = iX6 - 1;
                    }
                    jArr3[i15] = j12;
                    iC = dVar2.c();
                    iArr[i15] = iC;
                    if (iC > i11) {
                        i11 = iC;
                    }
                    long[] jArr17 = jArr3;
                    int[] iArr15 = iArr;
                    jArr4[i15] = j7 + ((long) iG2);
                    if (wVar2 == null) {
                        i23 = 1;
                    } else {
                        i23 = i7;
                    }
                    iArr2[i15] = i23;
                    if (i15 == iX4) {
                        iArr2[i15] = 1;
                        iX2--;
                        if (iX2 > 0) {
                            wVar2.getClass();
                            iX4 = wVar2.x() - 1;
                        }
                    }
                    j7 += (long) iG;
                    iX5--;
                    if (iX5 != 0 && i14 > 0) {
                        i14--;
                        iX5 = wVar7.x();
                        iG = wVar7.g();
                    }
                    long j22 = j12 + ((long) iArr15[i15]);
                    i12 = i21 - 1;
                    i15++;
                    j10 = j22;
                    iArr = iArr15;
                    jArr3 = jArr17;
                }
                j11 = j7 + ((long) i16);
                if (wVar == null) {
                    i18 = 1;
                    break;
                }
                while (true) {
                    if (iX <= 0) {
                        i18 = 1;
                        break;
                    }
                    if (wVar.x() != 0) {
                        i18 = i7;
                        break;
                    }
                    wVar.g();
                    iX--;
                }
                if (iX2 != 0 && iX5 == 0 && i17 == 0 && i14 == 0 && i13 == 0 && i18 != 0) {
                    oVar2 = oVar;
                } else {
                    StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                    oVar2 = oVar;
                    i19 = i18;
                    a3.e.z(sb2, oVar2.f22830a, ": remainingSynchronizationSamples ", iX2, ", remainingSamplesAtTimestampDelta ");
                    a3.e.z(sb2, iX5, ", remainingSamplesInChunk ", i17, ", remainingTimestampDeltaChanges ");
                    sb2.append(i14);
                    sb2.append(", remainingSamplesAtTimestampOffset ");
                    sb2.append(i13);
                    if (i19 == 0) {
                        str = ", ctts invalid";
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    je.b.N("AtomParsers", sb2.toString());
                }
                iArr3 = iArrCopyOf2;
                jArr7 = jArr5;
                i20 = i11;
                iArr4 = iArrCopyOf;
            }
            jP = e0.P(j11, 1000000L, oVar2.f22832c);
            if (jArr2 == 0) {
                e0.Q(jArr6, j);
                return new r(oVar2, jArr7, iArr3, i20, jArr6, iArr4, jP);
            }
            jArr8 = jArr7;
            i24 = iB;
            j13 = j11;
            jArr9 = jArr6;
            iArr5 = iArr4;
            i25 = i20;
            jArr10 = jArr2;
            if (jArr10.length == 1) {
                i26 = i10;
                if (i26 == 1 || jArr9.length < 2) {
                    j13 = j13;
                } else {
                    jArr.getClass();
                    long j23 = jArr[i7];
                    iArr3 = iArr3;
                    long jP3 = e0.P(jArr10[i7], oVar2.f22832c, oVar2.f22833d) + j23;
                    int length = jArr9.length - 1;
                    int i61 = i7;
                    int i62 = e0.i(4, i61, length);
                    int i63 = e0.i(jArr9.length - 4, i61, length);
                    long j24 = jArr9[i61];
                    if (j24 <= j23 && j23 < jArr9[i62] && jArr9[i63] < jP3 && jP3 <= j13) {
                        long jP4 = e0.P(j23 - j24, format.W, oVar2.f22832c);
                        long jP5 = e0.P(j13 - jP3, format.W, oVar2.f22832c);
                        if (!(jP4 == 0 && jP5 == 0) && jP4 <= 2147483647L && jP5 <= 2147483647L) {
                            qVar.f17920a = (int) jP4;
                            qVar.f17921b = (int) jP5;
                            e0.Q(jArr9, j);
                            return new r(oVar2, jArr8, iArr3, i25, jArr9, iArr5, e0.P(jArr10[0], 1000000L, oVar2.f22833d));
                        }
                        iArr5 = iArr5;
                    }
                    i25 = i25;
                }
            } else {
                j13 = j13;
                i26 = i10;
            }
            i27 = 1;
            if (jArr10.length == 1) {
                if (jArr10[0] == 0) {
                    jArr.getClass();
                    j18 = jArr[0];
                    for (i42 = 0; i42 < jArr9.length; i42++) {
                        jArr9[i42] = e0.P(jArr9[i42] - j18, 1000000L, oVar2.f22832c);
                    }
                    return new r(oVar2, jArr8, iArr3, i25, jArr9, iArr5, e0.P(j13 - j18, 1000000L, oVar2.f22832c));
                }
                i27 = 1;
            }
            if (i26 == i27) {
                z6 = true;
            } else {
                z6 = false;
            }
            iArr6 = new int[jArr10.length];
            iArr7 = new int[jArr10.length];
            jArr.getClass();
            i28 = 0;
            z7 = false;
            i29 = 0;
            i30 = 0;
            while (i28 < jArr10.length) {
                i37 = i28;
                z14 = z7;
                j17 = jArr[i37];
                if (j17 != -1) {
                    long jP6 = e0.P(jArr10[i37], oVar2.f22832c, oVar2.f22833d);
                    i38 = i37;
                    i39 = 1;
                    iArr6[i38] = e0.e(jArr9, j17, true);
                    iArr7[i38] = e0.b(jArr9, j17 + jP6, z6);
                    while (true) {
                        i40 = iArr6[i38];
                        i41 = iArr7[i38];
                        if (i40 >= i41 || (iArr5[i40] & i39) != 0) {
                            break;
                        }
                        iArr6[i38] = i40 + 1;
                        i39 = 1;
                    }
                    int i64 = (i41 - i40) + i29;
                    if (i30 != i40) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    i29 = i64;
                    z7 = z14 | z15;
                    i30 = i41;
                } else {
                    i38 = i37;
                    z7 = z14;
                }
                i28 = i38 + 1;
                i25 = i25;
                iArr3 = iArr3;
            }
            iArr8 = iArr3;
            i31 = i25;
            boolean z16 = z7;
            if (i29 != i24) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = z16 | z10;
            if (z11) {
                jArr11 = new long[i29];
            } else {
                jArr11 = jArr8;
            }
            if (z11) {
                iArr9 = new int[i29];
            } else {
                iArr9 = iArr8;
            }
            if (z11) {
                i32 = 0;
            } else {
                i32 = i31;
            }
            if (z11) {
                iArr10 = new int[i29];
            } else {
                iArr10 = iArr5;
            }
            jArr12 = new long[i29];
            i33 = 0;
            i34 = 0;
            j14 = 0;
            while (i33 < jArr10.length) {
                j15 = jArr[i33];
                z12 = z11;
                i35 = iArr6[i33];
                long[] jArr18 = jArr10;
                i36 = iArr7[i33];
                if (z12) {
                    int i65 = i36 - i35;
                    System.arraycopy(jArr8, i35, jArr11, i34, i65);
                    iArr11 = iArr8;
                    System.arraycopy(iArr11, i35, iArr9, i34, i65);
                    System.arraycopy(iArr5, i35, iArr10, i34, i65);
                } else {
                    iArr11 = iArr8;
                }
                int i66 = i32;
                while (i35 < i36) {
                    int i67 = i36;
                    int[] iArr16 = iArr11;
                    long jP7 = e0.P(j14, 1000000L, oVar2.f22833d);
                    jP2 = e0.P(jArr9[i35] - j15, 1000000L, oVar2.f22832c);
                    int i68 = i35;
                    if (i26 != 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    j16 = j5;
                    if (z13) {
                        jP2 = Math.max(j16, jP2);
                    }
                    jArr12[i34] = jP7 + jP2;
                    if (!z12 && iArr9[i34] > i66) {
                        i66 = iArr16[i68];
                    }
                    i34++;
                    j5 = j16;
                    i35 = i68 + 1;
                    iArr11 = iArr16;
                    oVar2 = oVar;
                    i36 = i67;
                }
                iArr8 = iArr11;
                j14 += jArr18[i33];
                i33++;
                i32 = i66;
                jArr9 = jArr9;
                jArr11 = jArr11;
                jArr10 = jArr18;
                oVar2 = oVar;
                z11 = z12;
            }
            return new r(oVar, jArr11, iArr9, i32, jArr12, iArr10, e0.P(j14, 1000000L, oVar.f22833d));
        }
        iX2 = 0;
        i7 = 0;
        iX3 = -1;
        iA = dVar.a();
        j = oVar.f22832c;
        i10 = oVar.f22831b;
        wVar = wVar9;
        jArr = oVar.f22838i;
        jArr2 = oVar.f22837h;
        dVar2 = dVar;
        String str3 = format.I;
        j5 = 0;
        if (iA == -1) {
            jArr3 = new long[iB];
            iArr = new int[iB];
            jArr4 = new long[iB];
            iArr2 = new int[iB];
            iG = iX11;
            iX4 = iX3;
            i11 = i7;
            i12 = i11;
            i13 = i12;
            j7 = 0;
            j10 = 0;
            i14 = iX9;
            wVar2 = wVar8;
            i15 = i13;
            iX5 = iX10;
            iG2 = i15;
            while (true) {
                if (i15 >= iB) {
                    int[] iArr17 = iArr;
                    i16 = iG2;
                    jArr5 = jArr3;
                    jArr6 = jArr4;
                    iArrCopyOf = iArr2;
                    i17 = i12;
                    iArrCopyOf2 = iArr17;
                    break;
                }
                j12 = j10;
                i21 = i12;
                zA = true;
                while (i21 == 0) {
                    zA = cVar.a();
                    if (!zA) {
                        break;
                        break;
                    }
                    j12 = cVar.f22748d;
                    i21 = cVar.f22747c;
                    iG2 = iG2;
                }
                i22 = iG2;
                if (!zA) {
                    je.b.N("AtomParsers", "Unexpected end of chunk data");
                    long[] jArrCopyOf3 = Arrays.copyOf(jArr3, i15);
                    iArrCopyOf2 = Arrays.copyOf(iArr, i15);
                    long[] jArrCopyOf4 = Arrays.copyOf(jArr4, i15);
                    iArrCopyOf = Arrays.copyOf(iArr2, i15);
                    jArr5 = jArrCopyOf3;
                    jArr6 = jArrCopyOf4;
                    iB = i15;
                    i17 = i21;
                    i16 = i22;
                    break;
                }
                iG2 = i22;
                if (wVar != null) {
                    iX6 = i13;
                    while (iX6 == 0) {
                        iX6 = wVar.x();
                        iG2 = wVar.g();
                        iX--;
                    }
                    i13 = iX6 - 1;
                }
                jArr3[i15] = j12;
                iC = dVar2.c();
                iArr[i15] = iC;
                if (iC > i11) {
                    i11 = iC;
                }
                long[] jArr19 = jArr3;
                int[] iArr18 = iArr;
                jArr4[i15] = j7 + ((long) iG2);
                if (wVar2 == null) {
                    i23 = 1;
                } else {
                    i23 = i7;
                }
                iArr2[i15] = i23;
                if (i15 == iX4) {
                    iArr2[i15] = 1;
                    iX2--;
                    if (iX2 > 0) {
                        wVar2.getClass();
                        iX4 = wVar2.x() - 1;
                    }
                }
                j7 += (long) iG;
                iX5--;
                if (iX5 != 0) {
                }
                long j25 = j12 + ((long) iArr18[i15]);
                i12 = i21 - 1;
                i15++;
                j10 = j25;
                iArr = iArr18;
                jArr3 = jArr19;
            }
            j11 = j7 + ((long) i16);
            if (wVar == null) {
                i18 = 1;
                break;
            }
            while (true) {
                if (iX <= 0) {
                    i18 = 1;
                    break;
                }
                if (wVar.x() != 0) {
                    i18 = i7;
                    break;
                }
                wVar.g();
                iX--;
            }
            if (iX2 != 0) {
                StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                oVar2 = oVar;
                i19 = i18;
                a3.e.z(sb3, oVar2.f22830a, ": remainingSynchronizationSamples ", iX2, ", remainingSamplesAtTimestampDelta ");
                a3.e.z(sb3, iX5, ", remainingSamplesInChunk ", i17, ", remainingTimestampDeltaChanges ");
                sb3.append(i14);
                sb3.append(", remainingSamplesAtTimestampOffset ");
                sb3.append(i13);
                if (i19 == 0) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb3.append(str);
                je.b.N("AtomParsers", sb3.toString());
            } else {
                StringBuilder sb4 = new StringBuilder("Inconsistent stbl box for track ");
                oVar2 = oVar;
                i19 = i18;
                a3.e.z(sb4, oVar2.f22830a, ": remainingSynchronizationSamples ", iX2, ", remainingSamplesAtTimestampDelta ");
                a3.e.z(sb4, iX5, ", remainingSamplesInChunk ", i17, ", remainingTimestampDeltaChanges ");
                sb4.append(i14);
                sb4.append(", remainingSamplesAtTimestampOffset ");
                sb4.append(i13);
                if (i19 == 0) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb4.append(str);
                je.b.N("AtomParsers", sb4.toString());
            }
            iArr3 = iArrCopyOf2;
            jArr7 = jArr5;
            i20 = i11;
            iArr4 = iArrCopyOf;
        } else {
            jArr3 = new long[iB];
            iArr = new int[iB];
            jArr4 = new long[iB];
            iArr2 = new int[iB];
            iG = iX11;
            iX4 = iX3;
            i11 = i7;
            i12 = i11;
            i13 = i12;
            j7 = 0;
            j10 = 0;
            i14 = iX9;
            wVar2 = wVar8;
            i15 = i13;
            iX5 = iX10;
            iG2 = i15;
            while (true) {
                if (i15 >= iB) {
                    int[] iArr19 = iArr;
                    i16 = iG2;
                    jArr5 = jArr3;
                    jArr6 = jArr4;
                    iArrCopyOf = iArr2;
                    i17 = i12;
                    iArrCopyOf2 = iArr19;
                    break;
                }
                j12 = j10;
                i21 = i12;
                zA = true;
                while (i21 == 0) {
                    zA = cVar.a();
                    if (!zA) {
                        break;
                        break;
                    }
                    j12 = cVar.f22748d;
                    i21 = cVar.f22747c;
                    iG2 = iG2;
                }
                i22 = iG2;
                if (!zA) {
                    je.b.N("AtomParsers", "Unexpected end of chunk data");
                    long[] jArrCopyOf5 = Arrays.copyOf(jArr3, i15);
                    iArrCopyOf2 = Arrays.copyOf(iArr, i15);
                    long[] jArrCopyOf6 = Arrays.copyOf(jArr4, i15);
                    iArrCopyOf = Arrays.copyOf(iArr2, i15);
                    jArr5 = jArrCopyOf5;
                    jArr6 = jArrCopyOf6;
                    iB = i15;
                    i17 = i21;
                    i16 = i22;
                    break;
                }
                iG2 = i22;
                if (wVar != null) {
                    iX6 = i13;
                    while (iX6 == 0) {
                        iX6 = wVar.x();
                        iG2 = wVar.g();
                        iX--;
                    }
                    i13 = iX6 - 1;
                }
                jArr3[i15] = j12;
                iC = dVar2.c();
                iArr[i15] = iC;
                if (iC > i11) {
                    i11 = iC;
                }
                long[] jArr110 = jArr3;
                int[] iArr110 = iArr;
                jArr4[i15] = j7 + ((long) iG2);
                if (wVar2 == null) {
                    i23 = 1;
                } else {
                    i23 = i7;
                }
                iArr2[i15] = i23;
                if (i15 == iX4) {
                    iArr2[i15] = 1;
                    iX2--;
                    if (iX2 > 0) {
                        wVar2.getClass();
                        iX4 = wVar2.x() - 1;
                    }
                }
                j7 += (long) iG;
                iX5--;
                if (iX5 != 0) {
                }
                long j26 = j12 + ((long) iArr110[i15]);
                i12 = i21 - 1;
                i15++;
                j10 = j26;
                iArr = iArr110;
                jArr3 = jArr110;
            }
            j11 = j7 + ((long) i16);
            if (wVar == null) {
                i18 = 1;
                break;
            }
            while (true) {
                if (iX <= 0) {
                    i18 = 1;
                    break;
                }
                if (wVar.x() != 0) {
                    i18 = i7;
                    break;
                }
                wVar.g();
                iX--;
            }
            if (iX2 != 0) {
                StringBuilder sb5 = new StringBuilder("Inconsistent stbl box for track ");
                oVar2 = oVar;
                i19 = i18;
                a3.e.z(sb5, oVar2.f22830a, ": remainingSynchronizationSamples ", iX2, ", remainingSamplesAtTimestampDelta ");
                a3.e.z(sb5, iX5, ", remainingSamplesInChunk ", i17, ", remainingTimestampDeltaChanges ");
                sb5.append(i14);
                sb5.append(", remainingSamplesAtTimestampOffset ");
                sb5.append(i13);
                if (i19 == 0) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb5.append(str);
                je.b.N("AtomParsers", sb5.toString());
            } else {
                StringBuilder sb6 = new StringBuilder("Inconsistent stbl box for track ");
                oVar2 = oVar;
                i19 = i18;
                a3.e.z(sb6, oVar2.f22830a, ": remainingSynchronizationSamples ", iX2, ", remainingSamplesAtTimestampDelta ");
                a3.e.z(sb6, iX5, ", remainingSamplesInChunk ", i17, ", remainingTimestampDeltaChanges ");
                sb6.append(i14);
                sb6.append(", remainingSamplesAtTimestampOffset ");
                sb6.append(i13);
                if (i19 == 0) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb6.append(str);
                je.b.N("AtomParsers", sb6.toString());
            }
            iArr3 = iArrCopyOf2;
            jArr7 = jArr5;
            i20 = i11;
            iArr4 = iArrCopyOf;
        }
        jP = e0.P(j11, 1000000L, oVar2.f22832c);
        if (jArr2 == 0) {
            e0.Q(jArr6, j);
            return new r(oVar2, jArr7, iArr3, i20, jArr6, iArr4, jP);
        }
        jArr8 = jArr7;
        i24 = iB;
        j13 = j11;
        jArr9 = jArr6;
        iArr5 = iArr4;
        i25 = i20;
        jArr10 = jArr2;
        if (jArr10.length == 1) {
            i26 = i10;
            if (i26 == 1) {
                j13 = j13;
            } else {
                j13 = j13;
            }
        } else {
            j13 = j13;
            i26 = i10;
        }
        i27 = 1;
        if (jArr10.length == 1) {
            if (jArr10[0] == 0) {
                jArr.getClass();
                j18 = jArr[0];
                while (i42 < jArr9.length) {
                    jArr9[i42] = e0.P(jArr9[i42] - j18, 1000000L, oVar2.f22832c);
                }
                return new r(oVar2, jArr8, iArr3, i25, jArr9, iArr5, e0.P(j13 - j18, 1000000L, oVar2.f22832c));
            }
            i27 = 1;
        }
        if (i26 == i27) {
            z6 = true;
        } else {
            z6 = false;
        }
        iArr6 = new int[jArr10.length];
        iArr7 = new int[jArr10.length];
        jArr.getClass();
        i28 = 0;
        z7 = false;
        i29 = 0;
        i30 = 0;
        while (i28 < jArr10.length) {
            i37 = i28;
            z14 = z7;
            j17 = jArr[i37];
            if (j17 != -1) {
                long jP8 = e0.P(jArr10[i37], oVar2.f22832c, oVar2.f22833d);
                i38 = i37;
                i39 = 1;
                iArr6[i38] = e0.e(jArr9, j17, true);
                iArr7[i38] = e0.b(jArr9, j17 + jP8, z6);
                while (true) {
                    i40 = iArr6[i38];
                    i41 = iArr7[i38];
                    if (i40 >= i41) {
                        break;
                    }
                    break;
                    break;
                    iArr6[i38] = i40 + 1;
                    i39 = 1;
                }
                int i69 = (i41 - i40) + i29;
                if (i30 != i40) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                i29 = i69;
                z7 = z14 | z15;
                i30 = i41;
            } else {
                i38 = i37;
                z7 = z14;
            }
            i28 = i38 + 1;
            i25 = i25;
            iArr3 = iArr3;
        }
        iArr8 = iArr3;
        i31 = i25;
        boolean z17 = z7;
        if (i29 != i24) {
            z10 = true;
        } else {
            z10 = false;
        }
        z11 = z17 | z10;
        if (z11) {
            jArr11 = new long[i29];
        } else {
            jArr11 = jArr8;
        }
        if (z11) {
            iArr9 = new int[i29];
        } else {
            iArr9 = iArr8;
        }
        if (z11) {
            i32 = 0;
        } else {
            i32 = i31;
        }
        if (z11) {
            iArr10 = new int[i29];
        } else {
            iArr10 = iArr5;
        }
        jArr12 = new long[i29];
        i33 = 0;
        i34 = 0;
        j14 = 0;
        while (i33 < jArr10.length) {
            j15 = jArr[i33];
            z12 = z11;
            i35 = iArr6[i33];
            long[] jArr111 = jArr10;
            i36 = iArr7[i33];
            if (z12) {
                int i610 = i36 - i35;
                System.arraycopy(jArr8, i35, jArr11, i34, i610);
                iArr11 = iArr8;
                System.arraycopy(iArr11, i35, iArr9, i34, i610);
                System.arraycopy(iArr5, i35, iArr10, i34, i610);
            } else {
                iArr11 = iArr8;
            }
            int i611 = i32;
            while (i35 < i36) {
                int i612 = i36;
                int[] iArr111 = iArr11;
                long jP9 = e0.P(j14, 1000000L, oVar2.f22833d);
                jP2 = e0.P(jArr9[i35] - j15, 1000000L, oVar2.f22832c);
                int i613 = i35;
                if (i26 != 1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                j16 = j5;
                if (z13) {
                    jP2 = Math.max(j16, jP2);
                }
                jArr12[i34] = jP9 + jP2;
                if (!z12) {
                }
                i34++;
                j5 = j16;
                i35 = i613 + 1;
                iArr11 = iArr111;
                oVar2 = oVar;
                i36 = i612;
            }
            iArr8 = iArr11;
            j14 += jArr111[i33];
            i33++;
            i32 = i611;
            jArr9 = jArr9;
            jArr11 = jArr11;
            jArr10 = jArr111;
            oVar2 = oVar;
            z11 = z12;
        }
        return new r(oVar, jArr11, iArr9, i32, jArr12, iArr10, e0.P(j14, 1000000L, oVar.f22833d));
    }

    /* JADX WARN: Code duplicated, block: B:132:0x025c  */
    /* JADX WARN: Code duplicated, block: B:326:0x05af  */
    /* JADX WARN: Code duplicated, block: B:328:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:329:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:332:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:333:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:335:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:341:0x0613  */
    /* JADX WARN: Code duplicated, block: B:343:0x0642  */
    /* JADX WARN: Code duplicated, block: B:345:0x0648  */
    /* JADX WARN: Code duplicated, block: B:348:0x0689  */
    /* JADX WARN: Code duplicated, block: B:350:0x0692  */
    /* JADX WARN: Code duplicated, block: B:352:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:355:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:357:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:361:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:363:0x0701  */
    /* JADX WARN: Code duplicated, block: B:364:0x0704  */
    /* JADX WARN: Code duplicated, block: B:366:0x072c  */
    /* JADX WARN: Code duplicated, block: B:368:0x0735  */
    /* JADX WARN: Code duplicated, block: B:370:0x074e  */
    /* JADX WARN: Code duplicated, block: B:371:0x0752  */
    /* JADX WARN: Code duplicated, block: B:374:0x0776  */
    /* JADX WARN: Code duplicated, block: B:376:0x077d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:377:0x077f  */
    /* JADX WARN: Code duplicated, block: B:382:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:386:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:399:0x087b  */
    /* JADX WARN: Code duplicated, block: B:401:0x0890  */
    /* JADX WARN: Code duplicated, block: B:403:0x0897  */
    /* JADX WARN: Code duplicated, block: B:405:0x089b  */
    /* JADX WARN: Code duplicated, block: B:407:0x089e  */
    /* JADX WARN: Code duplicated, block: B:411:0x08a9  */
    /* JADX WARN: Code duplicated, block: B:413:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:415:0x08b6  */
    /* JADX WARN: Code duplicated, block: B:419:0x08c5 A[LOOP:4: B:409:0x08a3->B:419:0x08c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:422:0x08d5  */
    /* JADX WARN: Code duplicated, block: B:424:0x08e4  */
    /* JADX WARN: Code duplicated, block: B:426:0x08ec  */
    /* JADX WARN: Code duplicated, block: B:427:0x0900  */
    /* JADX WARN: Code duplicated, block: B:429:0x090a  */
    /* JADX WARN: Code duplicated, block: B:431:0x090e  */
    /* JADX WARN: Code duplicated, block: B:439:0x0952  */
    /* JADX WARN: Code duplicated, block: B:444:0x0993  */
    /* JADX WARN: Code duplicated, block: B:446:0x099d  */
    /* JADX WARN: Code duplicated, block: B:448:0x09a7  */
    /* JADX WARN: Code duplicated, block: B:449:0x09ab  */
    /* JADX WARN: Code duplicated, block: B:451:0x09be  */
    /* JADX WARN: Code duplicated, block: B:453:0x09c5  */
    /* JADX WARN: Code duplicated, block: B:456:0x09d3  */
    /* JADX WARN: Code duplicated, block: B:457:0x09d6  */
    /* JADX WARN: Code duplicated, block: B:459:0x09db  */
    /* JADX WARN: Code duplicated, block: B:460:0x09dd  */
    /* JADX WARN: Code duplicated, block: B:464:0x09ff  */
    /* JADX WARN: Code duplicated, block: B:466:0x0a0e  */
    /* JADX WARN: Code duplicated, block: B:470:0x0a25  */
    /* JADX WARN: Code duplicated, block: B:471:0x0a27  */
    /* JADX WARN: Code duplicated, block: B:474:0x0a36 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:475:0x0a38  */
    /* JADX WARN: Code duplicated, block: B:477:0x0a3b  */
    /* JADX WARN: Code duplicated, block: B:480:0x0a4f  */
    /* JADX WARN: Code duplicated, block: B:483:0x0a71  */
    /* JADX WARN: Code duplicated, block: B:485:0x0a76 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:486:0x0a78  */
    /* JADX WARN: Code duplicated, block: B:488:0x0a7b  */
    /* JADX WARN: Code duplicated, block: B:491:0x0a8f  */
    /* JADX WARN: Code duplicated, block: B:493:0x0a9c  */
    /* JADX WARN: Code duplicated, block: B:495:0x0aa1  */
    /* JADX WARN: Code duplicated, block: B:497:0x0aa6  */
    /* JADX WARN: Code duplicated, block: B:611:0x0d12  */
    /* JADX WARN: Code duplicated, block: B:615:0x0d2b  */
    /* JADX WARN: Code duplicated, block: B:616:0x0d2f  */
    /* JADX WARN: Code duplicated, block: B:618:0x0d63 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:621:0x0d69  */
    /* JADX WARN: Code duplicated, block: B:623:0x0d6d  */
    /* JADX WARN: Code duplicated, block: B:624:0x0d72  */
    /* JADX WARN: Code duplicated, block: B:627:0x0d7a  */
    /* JADX WARN: Code duplicated, block: B:633:0x0dc9  */
    /* JADX WARN: Code duplicated, block: B:635:0x0dd4  */
    /* JADX WARN: Code duplicated, block: B:637:0x0ddd  */
    /* JADX WARN: Code duplicated, block: B:638:0x0ddf  */
    /* JADX WARN: Code duplicated, block: B:640:0x0df9  */
    /* JADX WARN: Code duplicated, block: B:642:0x0dfc  */
    /* JADX WARN: Code duplicated, block: B:643:0x0e01  */
    /* JADX WARN: Code duplicated, block: B:646:0x0e09  */
    /* JADX WARN: Code duplicated, block: B:647:0x0e0e  */
    /* JADX WARN: Code duplicated, block: B:650:0x0e1b A[LOOP:7: B:639:0x0df7->B:650:0x0e1b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:655:0x0e30  */
    /* JADX WARN: Code duplicated, block: B:656:0x0e3d  */
    /* JADX WARN: Code duplicated, block: B:659:0x0e45  */
    /* JADX WARN: Code duplicated, block: B:660:0x0e49  */
    /* JADX WARN: Code duplicated, block: B:663:0x0e6c  */
    /* JADX WARN: Code duplicated, block: B:664:0x0e71  */
    /* JADX WARN: Code duplicated, block: B:671:0x0ea5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:673:0x078c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:0x0e22 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:0x0895 A[EDGE_INSN: B:688:0x0895->B:402:0x0895 BREAK  A[LOOP:4: B:409:0x08a3->B:419:0x08c5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:0x08cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:0x0d25 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0130  */
    /* JADX WARN: Code duplicated, block: B:76:0x0135  */
    /* JADX WARN: Code duplicated, block: B:77:0x0138  */
    /* JADX WARN: Code duplicated, block: B:80:0x0146  */
    /* JADX WARN: Code duplicated, block: B:82:0x014c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0182  */
    /* JADX WARN: Code duplicated, block: B:86:0x0185  */
    /* JADX WARN: Code duplicated, block: B:89:0x0190  */
    /* JADX WARN: Code duplicated, block: B:90:0x0192  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:97:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ff  */
    public static ArrayList f(a aVar, pc.q qVar, long j, mc.i iVar, boolean z5, boolean z6, di.e eVar) throws h1 {
        int i7;
        long jP;
        long jV;
        int i10;
        int i11;
        long j5;
        long j7;
        long j10;
        int iD;
        int i12;
        int i13;
        Pair pairCreate;
        b bVarG;
        w wVar;
        String str;
        int iG;
        p[] pVarArr;
        long j11;
        int i14;
        Format format;
        int i15;
        int i16;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i17;
        int i18;
        a aVar2;
        Pair pair;
        int i19;
        p[] pVarArr2;
        long[] jArr;
        long[] jArr2;
        o oVar;
        a aVarE;
        b bVarG2;
        w wVar2;
        int iD2;
        int iX;
        long[] jArr3;
        long[] jArr4;
        int i20;
        Pair pairCreate2;
        long jV2;
        long jG;
        int i21;
        int iG2;
        boolean z7;
        int i22;
        int iG3;
        int i23;
        String str2;
        int i24;
        int i25;
        int iZ;
        int iZ2;
        int i26;
        int i27;
        int i28;
        mc.i iVarX;
        String str3;
        int i29;
        int i30;
        mc.i iVar2;
        String str4;
        float fX;
        int i31;
        List listR;
        int iB;
        int iC;
        String str5;
        byte[] bArr;
        ByteBuffer byteBufferOrder;
        j0 j0Var;
        int i32;
        boolean z10;
        int i33;
        int i34;
        int i35;
        int i36;
        float f2;
        byte[] bArr2;
        int i37;
        g0 g0Var;
        int i38;
        byte[] bArrArray;
        int i39;
        int iG4;
        boolean z11;
        int iG5;
        int i40;
        int i41;
        int i42;
        int i43;
        float f7;
        byte[] bArr3;
        a5.o oVarG;
        byte[] bArrCopyOfRange;
        boolean z12;
        ke.e eVarA;
        int i44;
        String str6;
        int i45;
        int i46;
        int i47;
        String str7;
        boolean z13;
        ke.a aVarA;
        Pair pairD;
        int i48;
        int i49;
        int iG6;
        int iRound;
        int i50;
        int i51;
        mc.i iVar3;
        String str8;
        String str9;
        int i52;
        String str10;
        int i53;
        int iIntValue;
        int i54;
        List list;
        String str11;
        j0 j0Var2;
        List list2;
        int i55;
        String str12;
        g0 g0Var2;
        int iG7;
        boolean z14;
        int iG8;
        List listR2;
        int i56;
        int i57;
        int i58;
        boolean z15;
        String str13;
        int iG9;
        boolean z16;
        j0 j0VarA;
        byte[] bArr4;
        List listR3;
        int i59;
        v vVar;
        int i60;
        int i61;
        int i62;
        String str14;
        v vVar2;
        int i63;
        int i64;
        long j12;
        r0 r0VarR;
        o oVar2;
        ArrayList arrayList3;
        a aVar3 = aVar;
        ArrayList arrayList4 = aVar3.f22743w;
        ArrayList arrayList5 = new ArrayList();
        int i65 = 0;
        while (i65 < arrayList4.size()) {
            a aVar4 = (a) arrayList4.get(i65);
            if (aVar4.f14999e != 1953653099) {
                arrayList = arrayList4;
                arrayList3 = arrayList5;
                i18 = i65;
            } else {
                b bVarG3 = aVar3.g(1836476516);
                bVarG3.getClass();
                a aVarE2 = aVar4.e(1835297121);
                aVarE2.getClass();
                b bVarG4 = aVarE2.g(1751411826);
                bVarG4.getClass();
                w wVar3 = bVarG4.f22744i;
                wVar3.F(16);
                int iG10 = wVar3.g();
                if (iG10 == 1936684398) {
                    i7 = 1;
                } else if (iG10 == 1986618469) {
                    i7 = 2;
                } else if (iG10 == 1952807028 || iG10 == 1935832172 || iG10 == 1937072756 || iG10 == 1668047728) {
                    i7 = 3;
                } else {
                    i7 = iG10 == 1835365473 ? 5 : -1;
                }
                if (i7 == -1) {
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    i18 = i65;
                } else {
                    b bVarG5 = aVar4.g(1953196132);
                    bVarG5.getClass();
                    w wVar4 = bVarG5.f22744i;
                    wVar4.F(8);
                    int iD3 = lc.a.d(wVar4.g());
                    wVar4.G(iD3 == 0 ? 8 : 16);
                    int iG11 = wVar4.g();
                    wVar4.G(4);
                    int i66 = wVar4.f13861b;
                    int i67 = iD3 == 0 ? 4 : 8;
                    int i68 = 0;
                    while (true) {
                        jP = -9223372036854775807L;
                        if (i68 >= i67) {
                            wVar4.G(i67);
                        } else {
                            if (wVar4.f13860a[i66 + i68] != -1) {
                                jV = iD3 == 0 ? wVar4.v() : wVar4.y();
                                if (jV != 0) {
                                    break;
                                }
                                break;
                            }
                            i68++;
                        }
                        jV = -9223372036854775807L;
                        break;
                    }
                    wVar4.G(16);
                    int iG12 = wVar4.g();
                    int iG13 = wVar4.g();
                    wVar4.G(4);
                    int iG14 = wVar4.g();
                    int iG15 = wVar4.g();
                    if (iG12 == 0 && iG13 == 65536) {
                        i10 = -65536;
                        if (iG14 == -65536 && iG15 == 0) {
                            i11 = 90;
                        }
                        if (j == -9223372036854775807L) {
                            j5 = jV;
                        } else {
                            j5 = j;
                        }
                        j7 = c(bVarG3.f22744i).f2614e;
                        if (j5 == -9223372036854775807L) {
                            j10 = j7;
                        } else {
                            j10 = j7;
                            jP = e0.P(j5, 1000000L, j10);
                        }
                        a aVarE3 = aVarE2.e(1835626086);
                        aVarE3.getClass();
                        a aVarE4 = aVarE3.e(1937007212);
                        aVarE4.getClass();
                        b bVarG6 = aVarE2.g(1835296868);
                        bVarG6.getClass();
                        w wVar5 = bVarG6.f22744i;
                        wVar5.F(8);
                        iD = lc.a.d(wVar5.g());
                        if (iD == 0) {
                            i12 = 8;
                        } else {
                            i12 = 16;
                        }
                        wVar5.G(i12);
                        long jV3 = wVar5.v();
                        if (iD == 0) {
                            i13 = 4;
                        } else {
                            i13 = 8;
                        }
                        wVar5.G(i13);
                        int iZ3 = wVar5.z();
                        pairCreate = Pair.create(Long.valueOf(jV3), "" + ((char) (((iZ3 >> 10) & 31) + 96)) + ((char) (((iZ3 >> 5) & 31) + 96)) + ((char) ((iZ3 & 31) + 96)));
                        bVarG = aVarE4.g(1937011556);
                        if (bVarG != null) {
                            throw h1.a("Malformed sample table (stbl) missing sample description (stsd)", null);
                        }
                        wVar = bVarG.f22744i;
                        str = (String) pairCreate.second;
                        wVar.F(12);
                        iG = wVar.g();
                        pVarArr = new p[iG];
                        j11 = jP;
                        i14 = 0;
                        format = null;
                        i15 = 0;
                        i16 = 0;
                        while (i14 < iG) {
                            i21 = wVar.f13861b;
                            iG2 = wVar.g();
                            ArrayList arrayList6 = arrayList4;
                            if (iG2 > 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            i22 = iG11;
                            String str15 = "childAtomSize must be positive";
                            yk.a.c("childAtomSize must be positive", z7);
                            iG3 = wVar.g();
                            int i69 = i65;
                            if (iG3 != 1635148593 || iG3 == 1635148595 || iG3 == 1701733238 || iG3 == 1831958048 || iG3 == 1836070006 || iG3 == 1752589105 || iG3 == 1751479857 || iG3 == 1932670515 || iG3 == 1211250227 || iG3 == 1987063864 || iG3 == 1987063865 || iG3 == 1635135537 || iG3 == 1685479798 || iG3 == 1685479729 || iG3 == 1685481573 || iG3 == 1685481521) {
                                i23 = i11;
                                arrayList5 = arrayList5;
                                str2 = "childAtomSize must be positive";
                                aVar4 = aVar4;
                                pairCreate = pairCreate;
                                i24 = i7;
                                iG = iG;
                                pVarArr = pVarArr;
                                i25 = i14;
                                wVar.F(i21 + 16);
                                wVar.G(16);
                                iZ = wVar.z();
                                iZ2 = wVar.z();
                                wVar.G(50);
                                i26 = wVar.f13861b;
                                if (iG3 == 1701733238) {
                                    i27 = i21;
                                    i28 = iG2;
                                    pairD = d(wVar, i27, i28);
                                    if (pairD != null) {
                                        iG3 = ((Integer) pairD.first).intValue();
                                        if (iVar == null) {
                                            iVarX = null;
                                        } else {
                                            iVarX = iVar.x(((p) pairD.second).f22840b);
                                        }
                                        pVarArr[i25] = (p) pairD.second;
                                    } else {
                                        iVarX = iVar;
                                    }
                                    wVar.F(i26);
                                } else {
                                    i27 = i21;
                                    i28 = iG2;
                                    iVarX = iVar;
                                }
                                if (iG3 == 1831958048) {
                                    str3 = "video/mpeg";
                                } else if (iG3 == 1211250227) {
                                    str3 = "video/3gpp";
                                } else {
                                    str3 = null;
                                }
                                i29 = i26;
                                i30 = i27;
                                str = str;
                                iVar2 = iVarX;
                                str4 = str3;
                                fX = 1.0f;
                                i31 = i16;
                                listR = null;
                                iB = -1;
                                iC = -1;
                                str5 = null;
                                bArr = null;
                                byteBufferOrder = null;
                                j0Var = null;
                                i32 = -1;
                                z10 = false;
                                i33 = -1;
                                while (true) {
                                    if (i29 - i30 >= i28) {
                                        listR = listR;
                                        break;
                                    }
                                    wVar.F(i29);
                                    i39 = wVar.f13861b;
                                    int i70 = i29;
                                    iG4 = wVar.g();
                                    listR = listR;
                                    if (iG4 != 0 && wVar.f13861b - i30 == i28) {
                                        break;
                                    }
                                    if (iG4 > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    yk.a.c(str2, z11);
                                    iG5 = wVar.g();
                                    String str16 = str2;
                                    if (iG5 == 1635148611) {
                                        if (str4 == null) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        yk.a.c(null, z13);
                                        wVar.F(i39 + 8);
                                        aVarA = ke.a.a(wVar);
                                        listR = aVarA.f14316a;
                                        i44 = aVarA.f14317b;
                                        if (!z10) {
                                            fX = aVarA.f14323h;
                                        }
                                        str6 = aVarA.f14324i;
                                        i45 = aVarA.f14320e;
                                        i46 = aVarA.f14321f;
                                        i47 = aVarA.f14322g;
                                        str7 = "video/avc";
                                    } else {
                                        if (iG5 == 1752589123) {
                                            if (str4 == null) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            yk.a.c(null, z12);
                                            wVar.F(i39 + 8);
                                            eVarA = ke.e.a(wVar);
                                            listR = eVarA.f14345a;
                                            i44 = eVarA.f14346b;
                                            if (!z10) {
                                                fX = eVarA.f14350f;
                                            }
                                            str6 = eVarA.f14351g;
                                            i45 = eVarA.f14347c;
                                            i46 = eVarA.f14348d;
                                            i47 = eVarA.f14349e;
                                            str7 = "video/hevc";
                                        } else {
                                            if (iG5 != 1685480259 || iG5 == 1685485123) {
                                                i40 = iZ;
                                                i41 = iG3;
                                                i42 = iZ2;
                                                i43 = i28;
                                                f7 = fX;
                                                bArr3 = bArr;
                                                i33 = i33;
                                                oVarG = a5.o.g(wVar);
                                                if (oVarG != null) {
                                                    str5 = oVarG.f236a;
                                                    str4 = "video/dolby-vision";
                                                }
                                            } else if (iG5 == 1987076931) {
                                                yk.a.c(null, str4 == null);
                                                String str17 = iG3 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                wVar.F(i39 + 12);
                                                wVar.G(2);
                                                boolean z17 = (wVar.u() & 1) != 0;
                                                int iU = wVar.u();
                                                int iU2 = wVar.u();
                                                iB = ke.b.b(iU);
                                                int i71 = z17 ? 1 : 2;
                                                iC = ke.b.c(iU2);
                                                i40 = iZ;
                                                i41 = iG3;
                                                i42 = iZ2;
                                                i32 = i71;
                                                i43 = i28;
                                                str4 = str17;
                                                listR = listR;
                                            } else {
                                                if (iG5 == 1635135811) {
                                                    yk.a.c(null, str4 == null);
                                                    str4 = "video/av01";
                                                } else if (iG5 == 1668050025) {
                                                    if (byteBufferOrder == null) {
                                                        byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                    }
                                                    ByteBuffer byteBuffer = byteBufferOrder;
                                                    byteBuffer.position(21);
                                                    byteBuffer.putShort(wVar.r());
                                                    byteBuffer.putShort(wVar.r());
                                                    byteBufferOrder = byteBuffer;
                                                } else {
                                                    if (iG5 == 1835295606) {
                                                        if (byteBufferOrder == null) {
                                                            byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                        }
                                                        ByteBuffer byteBuffer2 = byteBufferOrder;
                                                        short sR = wVar.r();
                                                        short sR2 = wVar.r();
                                                        i41 = iG3;
                                                        short sR3 = wVar.r();
                                                        i43 = i28;
                                                        short sR4 = wVar.r();
                                                        i33 = i33;
                                                        short sR5 = wVar.r();
                                                        bArr3 = bArr;
                                                        short sR6 = wVar.r();
                                                        f7 = fX;
                                                        short sR7 = wVar.r();
                                                        i42 = iZ2;
                                                        short sR8 = wVar.r();
                                                        long jV4 = wVar.v();
                                                        long jV5 = wVar.v();
                                                        i40 = iZ;
                                                        byteBuffer2.position(1);
                                                        byteBuffer2.putShort(sR5);
                                                        byteBuffer2.putShort(sR6);
                                                        byteBuffer2.putShort(sR);
                                                        byteBuffer2.putShort(sR2);
                                                        byteBuffer2.putShort(sR3);
                                                        byteBuffer2.putShort(sR4);
                                                        byteBuffer2.putShort(sR7);
                                                        byteBuffer2.putShort(sR8);
                                                        byteBuffer2.putShort((short) (jV4 / 10000));
                                                        byteBuffer2.putShort((short) (jV5 / 10000));
                                                        byteBufferOrder = byteBuffer2;
                                                    } else {
                                                        i40 = iZ;
                                                        i41 = iG3;
                                                        i42 = iZ2;
                                                        i43 = i28;
                                                        f7 = fX;
                                                        bArr3 = bArr;
                                                        i33 = i33;
                                                        if (iG5 == 1681012275) {
                                                            yk.a.c(null, str4 == null);
                                                            str4 = "video/3gpp";
                                                        } else {
                                                            if (iG5 == 1702061171) {
                                                                yk.a.c(null, str4 == null);
                                                                j0 j0VarA2 = a(i39, wVar);
                                                                String str18 = (String) j0VarA2.f15638i;
                                                                byte[] bArr5 = (byte[]) j0VarA2.f15639v;
                                                                listR = bArr5 != null ? ei.e0.r(bArr5) : listR;
                                                                j0Var = j0VarA2;
                                                                str4 = str18;
                                                                bArr = bArr3;
                                                            } else if (iG5 == 1885434736) {
                                                                wVar.F(i39 + 8);
                                                                fX = wVar.x() / wVar.x();
                                                                listR = listR;
                                                                i33 = i33;
                                                                bArr = bArr3;
                                                                z10 = true;
                                                            } else if (iG5 == 1937126244) {
                                                                int i72 = i39 + 8;
                                                                while (true) {
                                                                    if (i72 - i39 >= iG4) {
                                                                        bArrCopyOfRange = null;
                                                                        break;
                                                                    }
                                                                    wVar.F(i72);
                                                                    int iG16 = wVar.g();
                                                                    if (wVar.g() == 1886547818) {
                                                                        bArrCopyOfRange = Arrays.copyOfRange(wVar.f13860a, i72, iG16 + i72);
                                                                        break;
                                                                    }
                                                                    i72 += iG16;
                                                                }
                                                                bArr = bArrCopyOfRange;
                                                                listR = listR;
                                                            } else if (iG5 == 1936995172) {
                                                                int iU3 = wVar.u();
                                                                wVar.G(3);
                                                                if (iU3 == 0) {
                                                                    int iU4 = wVar.u();
                                                                    if (iU4 == 0) {
                                                                        i33 = 0;
                                                                    } else if (iU4 == 1) {
                                                                        i33 = 1;
                                                                    } else if (iU4 == 2) {
                                                                        i33 = 2;
                                                                    } else if (iU4 == 3) {
                                                                        i33 = 3;
                                                                    }
                                                                }
                                                            } else if (iG5 == 1668246642 && iB == -1 && iC == -1) {
                                                                int iG17 = wVar.g();
                                                                if (iG17 == 1852009592 || iG17 == 1852009571) {
                                                                    int iZ4 = wVar.z();
                                                                    int iZ5 = wVar.z();
                                                                    wVar.G(2);
                                                                    boolean z18 = iG4 == 19 && (wVar.u() & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0;
                                                                    int iB2 = ke.b.b(iZ4);
                                                                    int i73 = z18 ? 1 : 2;
                                                                    iB = iB2;
                                                                    iC = ke.b.c(iZ5);
                                                                    i32 = i73;
                                                                } else {
                                                                    je.b.N("AtomParsers", "Unsupported color type: " + lc.a.b(iG17));
                                                                }
                                                            }
                                                            fX = f7;
                                                        }
                                                    }
                                                    i33 = i33;
                                                    bArr = bArr3;
                                                    fX = f7;
                                                }
                                                i40 = iZ;
                                                i41 = iG3;
                                                i42 = iZ2;
                                                i43 = i28;
                                            }
                                            listR = listR;
                                            i33 = i33;
                                            bArr = bArr3;
                                            fX = f7;
                                        }
                                        i29 = i70 + iG4;
                                        str2 = str16;
                                        iG3 = i41;
                                        i28 = i43;
                                        iZ2 = i42;
                                        iZ = i40;
                                    }
                                    i40 = iZ;
                                    i41 = iG3;
                                    i42 = iZ2;
                                    i31 = i44;
                                    i43 = i28;
                                    i32 = i46;
                                    str4 = str7;
                                    str5 = str6;
                                    iB = i45;
                                    iC = i47;
                                    i29 = i70 + iG4;
                                    str2 = str16;
                                    iG3 = i41;
                                    i28 = i43;
                                    iZ2 = i42;
                                    iZ = i40;
                                }
                                i34 = iZ;
                                i35 = iZ2;
                                i36 = i28;
                                f2 = fX;
                                bArr2 = bArr;
                                i37 = i33;
                                if (str4 == null) {
                                    i11 = i23;
                                } else {
                                    g0Var = new g0();
                                    g0Var.f9635a = Integer.toString(i22);
                                    g0Var.k = str4;
                                    g0Var.f9642h = str5;
                                    g0Var.f9648p = i34;
                                    g0Var.f9649q = i35;
                                    g0Var.f9652t = f2;
                                    i11 = i23;
                                    g0Var.f9651s = i11;
                                    g0Var.f9653u = bArr2;
                                    g0Var.f9654v = i37;
                                    g0Var.f9645m = listR;
                                    g0Var.f9646n = iVar2;
                                    i38 = i32;
                                    if (iB == -1 || i38 != -1 || iC != -1 || byteBufferOrder != null) {
                                        if (byteBufferOrder != null) {
                                            bArrArray = byteBufferOrder.array();
                                        } else {
                                            bArrArray = null;
                                        }
                                        g0Var.f9655w = new ke.b(iB, i38, iC, bArrArray);
                                    }
                                    if (j0Var != null) {
                                        j0 j0Var3 = j0Var;
                                        g0Var.f9640f = c0.G(j0Var3.f15636d);
                                        g0Var.f9641g = c0.G(j0Var3.f15637e);
                                    }
                                    format = new Format(g0Var);
                                }
                                i16 = i31;
                            } else {
                                i24 = i7;
                                if (iG3 == 1836069985 || iG3 == 1701733217 || iG3 == 1633889587 || iG3 == 1700998451 || iG3 == 1633889588 || iG3 == 1835823201 || iG3 == 1685353315 || iG3 == 1685353317 || iG3 == 1685353320 || iG3 == 1685353324 || iG3 == 1685353336 || iG3 == 1935764850 || iG3 == 1935767394 || iG3 == 1819304813 || iG3 == 1936684916 || iG3 == 1953984371 || iG3 == 778924082 || iG3 == 778924083 || iG3 == 1835557169 || iG3 == 1835560241 || iG3 == 1634492771 || iG3 == 1634492791 || iG3 == 1970037111 || iG3 == 1332770163 || iG3 == 1716281667) {
                                    iG = iG;
                                    pVarArr = pVarArr;
                                    int[] iArr = ic.a.f11476f;
                                    int[] iArr2 = ic.a.f11474d;
                                    wVar.F(i21 + 16);
                                    if (z6) {
                                        int iZ6 = wVar.z();
                                        wVar.G(6);
                                        i48 = iZ6;
                                    } else {
                                        wVar.G(8);
                                        i48 = 0;
                                    }
                                    if (i48 == 0 || i48 == 1) {
                                        int iZ7 = wVar.z();
                                        wVar.G(6);
                                        byte[] bArr6 = wVar.f13860a;
                                        i49 = iZ7;
                                        int i74 = wVar.f13861b;
                                        int i75 = i74 + 1;
                                        wVar.f13861b = i75;
                                        int i76 = (bArr6[i74] & 255) << 8;
                                        wVar.f13861b = i74 + 2;
                                        int i77 = i76 | (bArr6[i75] & 255);
                                        wVar.f13861b = i74 + 4;
                                        wVar.F(i74);
                                        iG6 = wVar.g();
                                        if (i48 == 1) {
                                            wVar.G(16);
                                        }
                                        iRound = i77;
                                    } else {
                                        if (i48 == 2) {
                                            wVar.G(16);
                                            iRound = (int) Math.round(Double.longBitsToDouble(wVar.o()));
                                            int iX2 = wVar.x();
                                            wVar.G(20);
                                            i49 = iX2;
                                            iG6 = 0;
                                        } else {
                                            i51 = i11;
                                            arrayList5 = arrayList5;
                                            aVar4 = aVar4;
                                            pairCreate = pairCreate;
                                            i25 = i14;
                                            i30 = i21;
                                            i50 = iG2;
                                        }
                                        str = str;
                                        i11 = i51;
                                        i36 = i50;
                                    }
                                    int i78 = wVar.f13861b;
                                    int i79 = iRound;
                                    if (iG3 == 1701733217) {
                                        Pair pairD2 = d(wVar, i21, iG2);
                                        if (pairD2 != null) {
                                            int iIntValue2 = ((Integer) pairD2.first).intValue();
                                            mc.i iVarX2 = iVar == null ? null : iVar.x(((p) pairD2.second).f22840b);
                                            pVarArr[i14] = (p) pairD2.second;
                                            iVar3 = iVarX2;
                                            iG3 = iIntValue2;
                                        } else {
                                            iVar3 = iVar;
                                        }
                                        wVar.F(i78);
                                    } else {
                                        iVar3 = iVar;
                                    }
                                    String str19 = "audio/ac3";
                                    i25 = i14;
                                    if (iG3 == 1633889587) {
                                        str9 = "audio/ac3";
                                    } else if (iG3 == 1700998451) {
                                        str9 = "audio/eac3";
                                    } else if (iG3 == 1633889588) {
                                        str9 = "audio/ac4";
                                    } else {
                                        if (iG3 == 1685353315) {
                                            str8 = "audio/vnd.dts";
                                        } else if (iG3 == 1685353320 || iG3 == 1685353324) {
                                            str8 = "audio/vnd.dts.hd";
                                        } else if (iG3 == 1685353317) {
                                            str8 = "audio/vnd.dts.hd;profile=lbr";
                                        } else if (iG3 == 1685353336) {
                                            str8 = "audio/vnd.dts.uhd;profile=p2";
                                        } else if (iG3 == 1935764850) {
                                            str8 = "audio/3gpp";
                                        } else if (iG3 == 1935767394) {
                                            str8 = "audio/amr-wb";
                                        } else {
                                            str9 = "audio/raw";
                                            if (iG3 == 1819304813 || iG3 == 1936684916) {
                                                i52 = 2;
                                            } else if (iG3 == 1953984371) {
                                                i52 = 268435456;
                                            } else if (iG3 == 778924082 || iG3 == 778924083) {
                                                str8 = "audio/mpeg";
                                            } else if (iG3 == 1835557169) {
                                                str8 = "audio/mha1";
                                            } else if (iG3 == 1835560241) {
                                                str8 = "audio/mhm1";
                                            } else if (iG3 == 1634492771) {
                                                str8 = "audio/alac";
                                            } else if (iG3 == 1634492791) {
                                                str8 = "audio/g711-alaw";
                                            } else if (iG3 == 1970037111) {
                                                str8 = "audio/g711-mlaw";
                                            } else if (iG3 == 1332770163) {
                                                str8 = "audio/opus";
                                            } else if (iG3 == 1716281667) {
                                                str8 = "audio/flac";
                                            } else if (iG3 == 1835823201) {
                                                str8 = "audio/true-hd";
                                            } else {
                                                i52 = -1;
                                                str9 = null;
                                            }
                                            i51 = i11;
                                            arrayList5 = arrayList5;
                                            aVar4 = aVar4;
                                            pairCreate = pairCreate;
                                            i30 = i21;
                                            str10 = str9;
                                            i53 = i78;
                                            iIntValue = i49;
                                            i54 = i79;
                                            list = null;
                                            str11 = null;
                                            j0Var2 = null;
                                            while (i53 - i30 < iG2) {
                                                wVar.F(i53);
                                                iG7 = wVar.g();
                                                int i80 = iG2;
                                                if (iG7 > 0) {
                                                    z14 = true;
                                                } else {
                                                    z14 = false;
                                                }
                                                yk.a.c(str15, z14);
                                                iG8 = wVar.g();
                                                listR2 = list;
                                                if (iG8 == 1835557187) {
                                                    int i81 = iG7 - 13;
                                                    byte[] bArr7 = new byte[i81];
                                                    i56 = i52;
                                                    wVar.F(i53 + 13);
                                                    wVar.e(bArr7, 0, i81);
                                                    listR2 = ei.e0.r(bArr7);
                                                    str13 = str15;
                                                    str19 = str19;
                                                    iG7 = iG7;
                                                } else {
                                                    i56 = i52;
                                                    if (iG8 == 1702061171) {
                                                        i57 = 1702061171;
                                                    } else if (z6 || iG8 != 2002876005) {
                                                        if (iG8 == 1684103987) {
                                                            wVar.F(i53 + 8);
                                                            String string = Integer.toString(i22);
                                                            vVar2 = new v();
                                                            vVar2.n(wVar);
                                                            int i82 = iArr2[vVar2.i(2)];
                                                            str11 = str11;
                                                            vVar2.s(8);
                                                            i63 = iArr[vVar2.i(3)];
                                                            if (vVar2.i(1) != 0) {
                                                                i64 = i63 + 1;
                                                            } else {
                                                                i64 = i63;
                                                            }
                                                            str13 = str15;
                                                            int i83 = ic.a.f11477g[vVar2.i(5)] * 1000;
                                                            vVar2.c();
                                                            wVar.F(vVar2.f());
                                                            g0 g0Var3 = new g0();
                                                            g0Var3.f9635a = string;
                                                            g0Var3.k = str19;
                                                            g0Var3.f9656x = i64;
                                                            g0Var3.f9657y = i82;
                                                            g0Var3.f9646n = iVar3;
                                                            g0Var3.f9637c = str;
                                                            g0Var3.f9640f = i83;
                                                            g0Var3.f9641g = i83;
                                                            format = new Format(g0Var3);
                                                        } else {
                                                            str13 = str15;
                                                            str11 = str11;
                                                            if (iG8 == 1684366131) {
                                                                wVar.F(i53 + 8);
                                                                String string2 = Integer.toString(i22);
                                                                vVar = new v();
                                                                vVar.n(wVar);
                                                                int i84 = vVar.i(13) * 1000;
                                                                vVar.s(3);
                                                                int i85 = iArr2[vVar.i(2)];
                                                                vVar.s(10);
                                                                i60 = iArr[vVar.i(3)];
                                                                if (vVar.i(1) != 0) {
                                                                    i60++;
                                                                }
                                                                vVar.s(3);
                                                                i61 = vVar.i(4);
                                                                vVar.s(1);
                                                                i62 = i60;
                                                                if (i61 > 0) {
                                                                    vVar.s(6);
                                                                    if (vVar.i(1) != 0) {
                                                                        i62 += 2;
                                                                    }
                                                                    vVar.s(1);
                                                                    i60 = i62;
                                                                }
                                                                if (vVar.b() > 7) {
                                                                    vVar.s(7);
                                                                    if (vVar.i(1) != 0) {
                                                                        str14 = "audio/eac3-joc";
                                                                    } else {
                                                                        str14 = "audio/eac3";
                                                                    }
                                                                } else {
                                                                    str14 = "audio/eac3";
                                                                }
                                                                vVar.c();
                                                                wVar.F(vVar.f());
                                                                g0 g0Var4 = new g0();
                                                                g0Var4.f9635a = string2;
                                                                g0Var4.k = str14;
                                                                g0Var4.f9656x = i60;
                                                                g0Var4.f9657y = i85;
                                                                g0Var4.f9646n = iVar3;
                                                                g0Var4.f9637c = str;
                                                                g0Var4.f9641g = i84;
                                                                format = new Format(g0Var4);
                                                            } else {
                                                                iG7 = iG7;
                                                                str19 = str19;
                                                                if (iG8 == 1684103988) {
                                                                    wVar.F(i53 + 8);
                                                                    String string3 = Integer.toString(i22);
                                                                    wVar.G(1);
                                                                    if (((wVar.u() & 32) >> 5) == 1) {
                                                                        i59 = 48000;
                                                                    } else {
                                                                        i59 = 44100;
                                                                    }
                                                                    g0 g0Var5 = new g0();
                                                                    g0Var5.f9635a = string3;
                                                                    g0Var5.k = "audio/ac4";
                                                                    g0Var5.f9656x = 2;
                                                                    g0Var5.f9657y = i59;
                                                                    g0Var5.f9646n = iVar3;
                                                                    g0Var5.f9637c = str;
                                                                    format = new Format(g0Var5);
                                                                } else if (iG8 == 1684892784) {
                                                                    if (iG8 != 1684305011 || iG8 == 1969517683) {
                                                                        g0 g0Var6 = new g0();
                                                                        g0Var6.f9635a = Integer.toString(i22);
                                                                        g0Var6.k = str10;
                                                                        g0Var6.f9656x = iIntValue;
                                                                        g0Var6.f9657y = i54;
                                                                        g0Var6.f9646n = iVar3;
                                                                        g0Var6.f9637c = str;
                                                                        format = new Format(g0Var6);
                                                                    } else {
                                                                        if (iG8 == 1682927731) {
                                                                            int i86 = iG7 - 8;
                                                                            byte[] bArr8 = f22754a;
                                                                            byte[] bArrCopyOf = Arrays.copyOf(bArr8, bArr8.length + i86);
                                                                            wVar.F(i53 + 8);
                                                                            wVar.e(bArrCopyOf, bArr8.length, i86);
                                                                            listR3 = ic.a.b(bArrCopyOf);
                                                                        } else if (iG8 == 1684425825) {
                                                                            byte[] bArr9 = new byte[iG7 - 8];
                                                                            bArr9[0] = 102;
                                                                            bArr9[1] = 76;
                                                                            bArr9[2] = 97;
                                                                            bArr9[3] = 67;
                                                                            wVar.F(i53 + 12);
                                                                            wVar.e(bArr9, 4, iG7 - 12);
                                                                            listR3 = ei.e0.r(bArr9);
                                                                        } else if (iG8 == 1634492771) {
                                                                            int i87 = iG7 - 12;
                                                                            byte[] bArr10 = new byte[i87];
                                                                            wVar.F(i53 + 12);
                                                                            wVar.e(bArr10, 0, i87);
                                                                            w wVar6 = new w(bArr10);
                                                                            wVar6.F(9);
                                                                            int iU5 = wVar6.u();
                                                                            wVar6.F(20);
                                                                            Pair pairCreate3 = Pair.create(Integer.valueOf(wVar6.x()), Integer.valueOf(iU5));
                                                                            int iIntValue3 = ((Integer) pairCreate3.first).intValue();
                                                                            iIntValue = ((Integer) pairCreate3.second).intValue();
                                                                            listR2 = ei.e0.r(bArr10);
                                                                            i54 = iIntValue3;
                                                                        }
                                                                        listR2 = listR3;
                                                                    }
                                                                    str11 = str11;
                                                                    str13 = str13;
                                                                    iG7 = iG7;
                                                                } else {
                                                                    if (iG6 > 0) {
                                                                        throw h1.a("Invalid sample rate for Dolby TrueHD MLP stream: " + iG6, null);
                                                                    }
                                                                    i54 = iG6;
                                                                    iIntValue = 2;
                                                                }
                                                                str11 = str11;
                                                                str13 = str13;
                                                                iG7 = iG7;
                                                            }
                                                        }
                                                        str11 = str11;
                                                        str13 = str13;
                                                        iG7 = iG7;
                                                    } else {
                                                        i57 = 1702061171;
                                                    }
                                                    if (iG8 == i57) {
                                                        i58 = wVar.f13861b;
                                                        if (i58 >= i53) {
                                                            z15 = true;
                                                        } else {
                                                            z15 = false;
                                                        }
                                                        yk.a.c(null, z15);
                                                        while (true) {
                                                            iG7 = iG7;
                                                            if (i58 - i53 < iG7) {
                                                                str13 = str15;
                                                                i58 = -1;
                                                                break;
                                                            }
                                                            wVar.F(i58);
                                                            iG9 = wVar.g();
                                                            if (iG9 > 0) {
                                                                z16 = true;
                                                            } else {
                                                                z16 = false;
                                                            }
                                                            str13 = str15;
                                                            yk.a.c(str13, z16);
                                                            if (wVar.g() == 1702061171) {
                                                                break;
                                                            }
                                                            i58 += iG9;
                                                            str15 = str13;
                                                            iG7 = iG7;
                                                        }
                                                    } else {
                                                        i58 = i53;
                                                        str13 = str15;
                                                        iG7 = iG7;
                                                    }
                                                    if (i58 != -1) {
                                                        j0VarA = a(i58, wVar);
                                                        str10 = (String) j0VarA.f15638i;
                                                        bArr4 = (byte[]) j0VarA.f15639v;
                                                        if (bArr4 != null) {
                                                            if ("audio/mp4a-latm".equals(str10)) {
                                                                o0 o0VarI = ic.a.i(new v(bArr4, bArr4.length), false);
                                                                i54 = o0VarI.f11592a;
                                                                iIntValue = o0VarI.f11593b;
                                                                str11 = (String) o0VarI.f11594c;
                                                            } else {
                                                                str11 = str11;
                                                            }
                                                            listR2 = ei.e0.r(bArr4);
                                                        }
                                                        j0Var2 = j0VarA;
                                                    } else {
                                                        j0VarA = j0Var2;
                                                    }
                                                    str11 = str11;
                                                    j0Var2 = j0VarA;
                                                }
                                                i53 += iG7;
                                                str15 = str13;
                                                list = listR2;
                                                i52 = i56;
                                                iG2 = i80;
                                                str19 = str19;
                                            }
                                            list2 = list;
                                            i55 = i52;
                                            str12 = str11;
                                            i50 = iG2;
                                            if (format == null && str10 != null) {
                                                g0Var2 = new g0();
                                                g0Var2.f9635a = Integer.toString(i22);
                                                g0Var2.k = str10;
                                                g0Var2.f9642h = str12;
                                                g0Var2.f9656x = iIntValue;
                                                g0Var2.f9657y = i54;
                                                g0Var2.f9658z = i55;
                                                g0Var2.f9645m = list2;
                                                g0Var2.f9646n = iVar3;
                                                g0Var2.f9637c = str;
                                                if (j0Var2 != null) {
                                                    j0 j0Var4 = j0Var2;
                                                    g0Var2.f9640f = c0.G(j0Var4.f15636d);
                                                    g0Var2.f9641g = c0.G(j0Var4.f15637e);
                                                }
                                                format = new Format(g0Var2);
                                            }
                                            str = str;
                                            i11 = i51;
                                            i36 = i50;
                                        }
                                        str9 = str8;
                                    }
                                    i52 = -1;
                                    i51 = i11;
                                    arrayList5 = arrayList5;
                                    aVar4 = aVar4;
                                    pairCreate = pairCreate;
                                    i30 = i21;
                                    str10 = str9;
                                    i53 = i78;
                                    iIntValue = i49;
                                    i54 = i79;
                                    list = null;
                                    str11 = null;
                                    j0Var2 = null;
                                    while (i53 - i30 < iG2) {
                                        wVar.F(i53);
                                        iG7 = wVar.g();
                                        int i88 = iG2;
                                        if (iG7 > 0) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        yk.a.c(str15, z14);
                                        iG8 = wVar.g();
                                        listR2 = list;
                                        if (iG8 == 1835557187) {
                                            int i89 = iG7 - 13;
                                            byte[] bArr11 = new byte[i89];
                                            i56 = i52;
                                            wVar.F(i53 + 13);
                                            wVar.e(bArr11, 0, i89);
                                            listR2 = ei.e0.r(bArr11);
                                            str13 = str15;
                                            str19 = str19;
                                            iG7 = iG7;
                                        } else {
                                            i56 = i52;
                                            if (iG8 == 1702061171) {
                                                if (z6) {
                                                }
                                                if (iG8 == 1684103987) {
                                                    wVar.F(i53 + 8);
                                                    String string4 = Integer.toString(i22);
                                                    vVar2 = new v();
                                                    vVar2.n(wVar);
                                                    int i810 = iArr2[vVar2.i(2)];
                                                    str11 = str11;
                                                    vVar2.s(8);
                                                    i63 = iArr[vVar2.i(3)];
                                                    if (vVar2.i(1) != 0) {
                                                        i64 = i63 + 1;
                                                    } else {
                                                        i64 = i63;
                                                    }
                                                    str13 = str15;
                                                    int i811 = ic.a.f11477g[vVar2.i(5)] * 1000;
                                                    vVar2.c();
                                                    wVar.F(vVar2.f());
                                                    g0 g0Var7 = new g0();
                                                    g0Var7.f9635a = string4;
                                                    g0Var7.k = str19;
                                                    g0Var7.f9656x = i64;
                                                    g0Var7.f9657y = i810;
                                                    g0Var7.f9646n = iVar3;
                                                    g0Var7.f9637c = str;
                                                    g0Var7.f9640f = i811;
                                                    g0Var7.f9641g = i811;
                                                    format = new Format(g0Var7);
                                                } else {
                                                    str13 = str15;
                                                    str11 = str11;
                                                    if (iG8 == 1684366131) {
                                                        wVar.F(i53 + 8);
                                                        String string5 = Integer.toString(i22);
                                                        vVar = new v();
                                                        vVar.n(wVar);
                                                        int i812 = vVar.i(13) * 1000;
                                                        vVar.s(3);
                                                        int i813 = iArr2[vVar.i(2)];
                                                        vVar.s(10);
                                                        i60 = iArr[vVar.i(3)];
                                                        if (vVar.i(1) != 0) {
                                                            i60++;
                                                        }
                                                        vVar.s(3);
                                                        i61 = vVar.i(4);
                                                        vVar.s(1);
                                                        i62 = i60;
                                                        if (i61 > 0) {
                                                            vVar.s(6);
                                                            if (vVar.i(1) != 0) {
                                                                i62 += 2;
                                                            }
                                                            vVar.s(1);
                                                            i60 = i62;
                                                        }
                                                        if (vVar.b() > 7) {
                                                            vVar.s(7);
                                                            if (vVar.i(1) != 0) {
                                                                str14 = "audio/eac3-joc";
                                                            } else {
                                                                str14 = "audio/eac3";
                                                            }
                                                        } else {
                                                            str14 = "audio/eac3";
                                                        }
                                                        vVar.c();
                                                        wVar.F(vVar.f());
                                                        g0 g0Var8 = new g0();
                                                        g0Var8.f9635a = string5;
                                                        g0Var8.k = str14;
                                                        g0Var8.f9656x = i60;
                                                        g0Var8.f9657y = i813;
                                                        g0Var8.f9646n = iVar3;
                                                        g0Var8.f9637c = str;
                                                        g0Var8.f9641g = i812;
                                                        format = new Format(g0Var8);
                                                    } else {
                                                        iG7 = iG7;
                                                        str19 = str19;
                                                        if (iG8 == 1684103988) {
                                                            wVar.F(i53 + 8);
                                                            String string6 = Integer.toString(i22);
                                                            wVar.G(1);
                                                            if (((wVar.u() & 32) >> 5) == 1) {
                                                                i59 = 48000;
                                                            } else {
                                                                i59 = 44100;
                                                            }
                                                            g0 g0Var9 = new g0();
                                                            g0Var9.f9635a = string6;
                                                            g0Var9.k = "audio/ac4";
                                                            g0Var9.f9656x = 2;
                                                            g0Var9.f9657y = i59;
                                                            g0Var9.f9646n = iVar3;
                                                            g0Var9.f9637c = str;
                                                            format = new Format(g0Var9);
                                                        } else if (iG8 == 1684892784) {
                                                            if (iG8 != 1684305011) {
                                                                g0 g0Var10 = new g0();
                                                                g0Var10.f9635a = Integer.toString(i22);
                                                                g0Var10.k = str10;
                                                                g0Var10.f9656x = iIntValue;
                                                                g0Var10.f9657y = i54;
                                                                g0Var10.f9646n = iVar3;
                                                                g0Var10.f9637c = str;
                                                                format = new Format(g0Var10);
                                                            } else {
                                                                g0 g0Var11 = new g0();
                                                                g0Var11.f9635a = Integer.toString(i22);
                                                                g0Var11.k = str10;
                                                                g0Var11.f9656x = iIntValue;
                                                                g0Var11.f9657y = i54;
                                                                g0Var11.f9646n = iVar3;
                                                                g0Var11.f9637c = str;
                                                                format = new Format(g0Var11);
                                                            }
                                                            str11 = str11;
                                                            str13 = str13;
                                                            iG7 = iG7;
                                                        } else {
                                                            if (iG6 > 0) {
                                                                throw h1.a("Invalid sample rate for Dolby TrueHD MLP stream: " + iG6, null);
                                                            }
                                                            i54 = iG6;
                                                            iIntValue = 2;
                                                        }
                                                        str11 = str11;
                                                        str13 = str13;
                                                        iG7 = iG7;
                                                    }
                                                }
                                                str11 = str11;
                                                str13 = str13;
                                                iG7 = iG7;
                                            } else {
                                                i57 = 1702061171;
                                            }
                                            if (iG8 == i57) {
                                                i58 = wVar.f13861b;
                                                if (i58 >= i53) {
                                                    z15 = true;
                                                } else {
                                                    z15 = false;
                                                }
                                                yk.a.c(null, z15);
                                                while (true) {
                                                    iG7 = iG7;
                                                    if (i58 - i53 < iG7) {
                                                        str13 = str15;
                                                        i58 = -1;
                                                        break;
                                                    }
                                                    wVar.F(i58);
                                                    iG9 = wVar.g();
                                                    if (iG9 > 0) {
                                                        z16 = true;
                                                    } else {
                                                        z16 = false;
                                                    }
                                                    str13 = str15;
                                                    yk.a.c(str13, z16);
                                                    if (wVar.g() == 1702061171) {
                                                        break;
                                                        break;
                                                    }
                                                    i58 += iG9;
                                                    str15 = str13;
                                                    iG7 = iG7;
                                                }
                                            } else {
                                                i58 = i53;
                                                str13 = str15;
                                                iG7 = iG7;
                                            }
                                            if (i58 != -1) {
                                                j0VarA = a(i58, wVar);
                                                str10 = (String) j0VarA.f15638i;
                                                bArr4 = (byte[]) j0VarA.f15639v;
                                                if (bArr4 != null) {
                                                    if ("audio/mp4a-latm".equals(str10)) {
                                                        o0 o0VarI2 = ic.a.i(new v(bArr4, bArr4.length), false);
                                                        i54 = o0VarI2.f11592a;
                                                        iIntValue = o0VarI2.f11593b;
                                                        str11 = (String) o0VarI2.f11594c;
                                                    } else {
                                                        str11 = str11;
                                                    }
                                                    listR2 = ei.e0.r(bArr4);
                                                }
                                                j0Var2 = j0VarA;
                                            } else {
                                                j0VarA = j0Var2;
                                            }
                                            str11 = str11;
                                            j0Var2 = j0VarA;
                                        }
                                        i53 += iG7;
                                        str15 = str13;
                                        list = listR2;
                                        i52 = i56;
                                        iG2 = i88;
                                        str19 = str19;
                                    }
                                    list2 = list;
                                    i55 = i52;
                                    str12 = str11;
                                    i50 = iG2;
                                    if (format == null) {
                                        g0Var2 = new g0();
                                        g0Var2.f9635a = Integer.toString(i22);
                                        g0Var2.k = str10;
                                        g0Var2.f9642h = str12;
                                        g0Var2.f9656x = iIntValue;
                                        g0Var2.f9657y = i54;
                                        g0Var2.f9658z = i55;
                                        g0Var2.f9645m = list2;
                                        g0Var2.f9646n = iVar3;
                                        g0Var2.f9637c = str;
                                        if (j0Var2 != null) {
                                            j0 j0Var5 = j0Var2;
                                            g0Var2.f9640f = c0.G(j0Var5.f15636d);
                                            g0Var2.f9641g = c0.G(j0Var5.f15637e);
                                        }
                                        format = new Format(g0Var2);
                                    }
                                    str = str;
                                    i11 = i51;
                                    i36 = i50;
                                } else {
                                    if (iG3 == 1414810956 || iG3 == 1954034535 || iG3 == 2004251764 || iG3 == 1937010800 || iG3 == 1664495672) {
                                        wVar.F(i21 + 16);
                                        String str20 = "application/ttml+xml";
                                        if (iG3 == 1414810956) {
                                            j12 = Long.MAX_VALUE;
                                            r0VarR = null;
                                        } else if (iG3 == 1954034535) {
                                            int i90 = iG2 - 16;
                                            byte[] bArr12 = new byte[i90];
                                            wVar.e(bArr12, 0, i90);
                                            r0VarR = ei.e0.r(bArr12);
                                            str20 = "application/x-quicktime-tx3g";
                                            j12 = Long.MAX_VALUE;
                                        } else if (iG3 == 2004251764) {
                                            str20 = "application/x-mp4-vtt";
                                            j12 = Long.MAX_VALUE;
                                            r0VarR = null;
                                        } else if (iG3 == 1937010800) {
                                            r0VarR = null;
                                            j12 = 0;
                                        } else {
                                            if (iG3 != 1664495672) {
                                                throw new IllegalStateException();
                                            }
                                            str20 = "application/x-mp4-cea-608";
                                            j12 = Long.MAX_VALUE;
                                            r0VarR = null;
                                            i15 = 1;
                                        }
                                        g0 g0Var12 = new g0();
                                        g0Var12.f9635a = Integer.toString(i22);
                                        g0Var12.k = str20;
                                        g0Var12.f9637c = str;
                                        g0Var12.f9647o = j12;
                                        g0Var12.f9645m = r0VarR;
                                        i11 = i11;
                                        format = new Format(g0Var12);
                                        arrayList5 = arrayList5;
                                    } else {
                                        if (iG3 == 1835365492) {
                                            wVar.F(i21 + 16);
                                            if (iG3 == 1835365492) {
                                                wVar.p();
                                                String strP = wVar.p();
                                                if (strP != null) {
                                                    g0 g0Var13 = new g0();
                                                    g0Var13.f9635a = Integer.toString(i22);
                                                    g0Var13.k = strP;
                                                    format = new Format(g0Var13);
                                                }
                                            }
                                        } else {
                                            if (iG3 == 1667329389) {
                                                g0 g0Var14 = new g0();
                                                g0Var14.f9635a = Integer.toString(i22);
                                                g0Var14.k = "application/x-camera-motion";
                                                format = new Format(g0Var14);
                                            }
                                            iG = iG;
                                        }
                                        iG = iG;
                                    }
                                    i25 = i14;
                                    i30 = i21;
                                    i36 = iG2;
                                }
                            }
                            wVar.F(i30 + i36);
                            i14 = i25 + 1;
                            i11 = i11;
                            arrayList4 = arrayList6;
                            iG11 = i22;
                            i65 = i69;
                            iG = iG;
                            str = str;
                            arrayList5 = arrayList5;
                            pairCreate = pairCreate;
                            aVar4 = aVar4;
                            i7 = i24;
                            pVarArr = pVarArr;
                            iVar = iVar;
                        }
                        arrayList = arrayList4;
                        arrayList2 = arrayList5;
                        i17 = iG11;
                        i18 = i65;
                        aVar2 = aVar4;
                        pair = pairCreate;
                        i19 = i7;
                        pVarArr2 = pVarArr;
                        if (z5) {
                            aVar4 = aVar2;
                        } else {
                            aVar4 = aVar2;
                            aVarE = aVar4.e(1701082227);
                            if (aVarE == null) {
                                bVarG2 = aVarE.g(1701606260);
                                if (bVarG2 == null) {
                                    pairCreate2 = null;
                                } else {
                                    wVar2 = bVarG2.f22744i;
                                    wVar2.F(8);
                                    iD2 = lc.a.d(wVar2.g());
                                    iX = wVar2.x();
                                    jArr3 = new long[iX];
                                    jArr4 = new long[iX];
                                    for (i20 = 0; i20 < iX; i20++) {
                                        if (iD2 == 1) {
                                            jV2 = wVar2.y();
                                        } else {
                                            jV2 = wVar2.v();
                                        }
                                        jArr3[i20] = jV2;
                                        if (iD2 == 1) {
                                            jG = wVar2.o();
                                        } else {
                                            jG = wVar2.g();
                                        }
                                        jArr4[i20] = jG;
                                        if (wVar2.r() == 1) {
                                            throw new IllegalArgumentException("Unsupported media rate.");
                                        }
                                        wVar2.G(2);
                                    }
                                    pairCreate2 = Pair.create(jArr3, jArr4);
                                }
                                if (pairCreate2 != null) {
                                    jArr = (long[]) pairCreate2.first;
                                    jArr2 = (long[]) pairCreate2.second;
                                }
                            }
                            if (format == null) {
                                eVar = eVar;
                                oVar = new o(i17, i19, ((Long) pair.first).longValue(), j10, j11, format, i15, pVarArr2, i16, jArr, jArr2);
                            }
                            oVar2 = (o) eVar.apply(oVar);
                            if (oVar2 == null) {
                                arrayList3 = arrayList2;
                            } else {
                                a aVarE5 = aVar4.e(1835297121);
                                aVarE5.getClass();
                                a aVarE6 = aVarE5.e(1835626086);
                                aVarE6.getClass();
                                a aVarE7 = aVarE6.e(1937007212);
                                aVarE7.getClass();
                                r rVarE = e(oVar2, aVarE7, qVar);
                                arrayList3 = arrayList2;
                                arrayList3.add(rVarE);
                            }
                        }
                        jArr = null;
                        jArr2 = null;
                        if (format == null) {
                            eVar = eVar;
                            oVar = new o(i17, i19, ((Long) pair.first).longValue(), j10, j11, format, i15, pVarArr2, i16, jArr, jArr2);
                        }
                        oVar2 = (o) eVar.apply(oVar);
                        if (oVar2 == null) {
                            arrayList3 = arrayList2;
                        } else {
                            a aVarE8 = aVar4.e(1835297121);
                            aVarE8.getClass();
                            a aVarE9 = aVarE8.e(1835626086);
                            aVarE9.getClass();
                            a aVarE10 = aVarE9.e(1937007212);
                            aVarE10.getClass();
                            r rVarE2 = e(oVar2, aVarE10, qVar);
                            arrayList3 = arrayList2;
                            arrayList3.add(rVarE2);
                        }
                    } else {
                        i10 = -65536;
                    }
                    if (iG12 == 0 && iG13 == i10) {
                        if (iG14 == 65536 && iG15 == 0) {
                            i11 = 270;
                        } else {
                            i10 = -65536;
                            if (iG12 != i10) {
                                i11 = 0;
                            } else {
                                i11 = 0;
                            }
                        }
                    } else if (iG12 != i10 && iG13 == 0 && iG14 == 0 && iG15 == i10) {
                        i11 = 180;
                    } else {
                        i11 = 0;
                    }
                    if (j == -9223372036854775807L) {
                        j5 = jV;
                    } else {
                        j5 = j;
                    }
                    j7 = c(bVarG3.f22744i).f2614e;
                    if (j5 == -9223372036854775807L) {
                        j10 = j7;
                    } else {
                        j10 = j7;
                        jP = e0.P(j5, 1000000L, j10);
                    }
                    a aVarE11 = aVarE2.e(1835626086);
                    aVarE11.getClass();
                    a aVarE12 = aVarE11.e(1937007212);
                    aVarE12.getClass();
                    b bVarG7 = aVarE2.g(1835296868);
                    bVarG7.getClass();
                    w wVar7 = bVarG7.f22744i;
                    wVar7.F(8);
                    iD = lc.a.d(wVar7.g());
                    if (iD == 0) {
                        i12 = 8;
                    } else {
                        i12 = 16;
                    }
                    wVar7.G(i12);
                    long jV6 = wVar7.v();
                    if (iD == 0) {
                        i13 = 4;
                    } else {
                        i13 = 8;
                    }
                    wVar7.G(i13);
                    int iZ8 = wVar7.z();
                    pairCreate = Pair.create(Long.valueOf(jV6), "" + ((char) (((iZ8 >> 10) & 31) + 96)) + ((char) (((iZ8 >> 5) & 31) + 96)) + ((char) ((iZ8 & 31) + 96)));
                    bVarG = aVarE12.g(1937011556);
                    if (bVarG != null) {
                        throw h1.a("Malformed sample table (stbl) missing sample description (stsd)", null);
                    }
                    wVar = bVarG.f22744i;
                    str = (String) pairCreate.second;
                    wVar.F(12);
                    iG = wVar.g();
                    pVarArr = new p[iG];
                    j11 = jP;
                    i14 = 0;
                    format = null;
                    i15 = 0;
                    i16 = 0;
                    while (i14 < iG) {
                        i21 = wVar.f13861b;
                        iG2 = wVar.g();
                        ArrayList arrayList7 = arrayList4;
                        if (iG2 > 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        i22 = iG11;
                        String str110 = "childAtomSize must be positive";
                        yk.a.c("childAtomSize must be positive", z7);
                        iG3 = wVar.g();
                        int i610 = i65;
                        if (iG3 != 1635148593) {
                            i23 = i11;
                            arrayList5 = arrayList5;
                            str2 = "childAtomSize must be positive";
                            aVar4 = aVar4;
                            pairCreate = pairCreate;
                            i24 = i7;
                            iG = iG;
                            pVarArr = pVarArr;
                            i25 = i14;
                            wVar.F(i21 + 16);
                            wVar.G(16);
                            iZ = wVar.z();
                            iZ2 = wVar.z();
                            wVar.G(50);
                            i26 = wVar.f13861b;
                            if (iG3 == 1701733238) {
                                i27 = i21;
                                i28 = iG2;
                                pairD = d(wVar, i27, i28);
                                if (pairD != null) {
                                    iG3 = ((Integer) pairD.first).intValue();
                                    if (iVar == null) {
                                        iVarX = null;
                                    } else {
                                        iVarX = iVar.x(((p) pairD.second).f22840b);
                                    }
                                    pVarArr[i25] = (p) pairD.second;
                                } else {
                                    iVarX = iVar;
                                }
                                wVar.F(i26);
                            } else {
                                i27 = i21;
                                i28 = iG2;
                                iVarX = iVar;
                            }
                            if (iG3 == 1831958048) {
                                str3 = "video/mpeg";
                            } else if (iG3 == 1211250227) {
                                str3 = "video/3gpp";
                            } else {
                                str3 = null;
                            }
                            i29 = i26;
                            i30 = i27;
                            str = str;
                            iVar2 = iVarX;
                            str4 = str3;
                            fX = 1.0f;
                            i31 = i16;
                            listR = null;
                            iB = -1;
                            iC = -1;
                            str5 = null;
                            bArr = null;
                            byteBufferOrder = null;
                            j0Var = null;
                            i32 = -1;
                            z10 = false;
                            i33 = -1;
                            while (true) {
                                if (i29 - i30 >= i28) {
                                    listR = listR;
                                    break;
                                }
                                wVar.F(i29);
                                i39 = wVar.f13861b;
                                int i710 = i29;
                                iG4 = wVar.g();
                                listR = listR;
                                if (iG4 != 0) {
                                }
                                if (iG4 > 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                yk.a.c(str2, z11);
                                iG5 = wVar.g();
                                String str111 = str2;
                                if (iG5 == 1635148611) {
                                    if (str4 == null) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    yk.a.c(null, z13);
                                    wVar.F(i39 + 8);
                                    aVarA = ke.a.a(wVar);
                                    listR = aVarA.f14316a;
                                    i44 = aVarA.f14317b;
                                    if (!z10) {
                                        fX = aVarA.f14323h;
                                    }
                                    str6 = aVarA.f14324i;
                                    i45 = aVarA.f14320e;
                                    i46 = aVarA.f14321f;
                                    i47 = aVarA.f14322g;
                                    str7 = "video/avc";
                                } else {
                                    if (iG5 == 1752589123) {
                                        if (str4 == null) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        yk.a.c(null, z12);
                                        wVar.F(i39 + 8);
                                        eVarA = ke.e.a(wVar);
                                        listR = eVarA.f14345a;
                                        i44 = eVarA.f14346b;
                                        if (!z10) {
                                            fX = eVarA.f14350f;
                                        }
                                        str6 = eVarA.f14351g;
                                        i45 = eVarA.f14347c;
                                        i46 = eVarA.f14348d;
                                        i47 = eVarA.f14349e;
                                        str7 = "video/hevc";
                                    } else if (iG5 != 1685480259) {
                                        i40 = iZ;
                                        i41 = iG3;
                                        i42 = iZ2;
                                        i43 = i28;
                                        f7 = fX;
                                        bArr3 = bArr;
                                        i33 = i33;
                                        oVarG = a5.o.g(wVar);
                                        if (oVarG != null) {
                                            str5 = oVarG.f236a;
                                            str4 = "video/dolby-vision";
                                        }
                                        listR = listR;
                                        i33 = i33;
                                        bArr = bArr3;
                                        fX = f7;
                                    } else {
                                        i40 = iZ;
                                        i41 = iG3;
                                        i42 = iZ2;
                                        i43 = i28;
                                        f7 = fX;
                                        bArr3 = bArr;
                                        i33 = i33;
                                        oVarG = a5.o.g(wVar);
                                        if (oVarG != null) {
                                            str5 = oVarG.f236a;
                                            str4 = "video/dolby-vision";
                                        }
                                        listR = listR;
                                        i33 = i33;
                                        bArr = bArr3;
                                        fX = f7;
                                    }
                                    i29 = i710 + iG4;
                                    str2 = str111;
                                    iG3 = i41;
                                    i28 = i43;
                                    iZ2 = i42;
                                    iZ = i40;
                                }
                                i40 = iZ;
                                i41 = iG3;
                                i42 = iZ2;
                                i31 = i44;
                                i43 = i28;
                                i32 = i46;
                                str4 = str7;
                                str5 = str6;
                                iB = i45;
                                iC = i47;
                                i29 = i710 + iG4;
                                str2 = str111;
                                iG3 = i41;
                                i28 = i43;
                                iZ2 = i42;
                                iZ = i40;
                            }
                            i34 = iZ;
                            i35 = iZ2;
                            i36 = i28;
                            f2 = fX;
                            bArr2 = bArr;
                            i37 = i33;
                            if (str4 == null) {
                                i11 = i23;
                            } else {
                                g0Var = new g0();
                                g0Var.f9635a = Integer.toString(i22);
                                g0Var.k = str4;
                                g0Var.f9642h = str5;
                                g0Var.f9648p = i34;
                                g0Var.f9649q = i35;
                                g0Var.f9652t = f2;
                                i11 = i23;
                                g0Var.f9651s = i11;
                                g0Var.f9653u = bArr2;
                                g0Var.f9654v = i37;
                                g0Var.f9645m = listR;
                                g0Var.f9646n = iVar2;
                                i38 = i32;
                                if (iB == -1) {
                                    if (byteBufferOrder != null) {
                                        bArrArray = byteBufferOrder.array();
                                    } else {
                                        bArrArray = null;
                                    }
                                    g0Var.f9655w = new ke.b(iB, i38, iC, bArrArray);
                                } else {
                                    if (byteBufferOrder != null) {
                                        bArrArray = byteBufferOrder.array();
                                    } else {
                                        bArrArray = null;
                                    }
                                    g0Var.f9655w = new ke.b(iB, i38, iC, bArrArray);
                                }
                                if (j0Var != null) {
                                    j0 j0Var6 = j0Var;
                                    g0Var.f9640f = c0.G(j0Var6.f15636d);
                                    g0Var.f9641g = c0.G(j0Var6.f15637e);
                                }
                                format = new Format(g0Var);
                            }
                            i16 = i31;
                        } else {
                            i23 = i11;
                            arrayList5 = arrayList5;
                            str2 = "childAtomSize must be positive";
                            aVar4 = aVar4;
                            pairCreate = pairCreate;
                            i24 = i7;
                            iG = iG;
                            pVarArr = pVarArr;
                            i25 = i14;
                            wVar.F(i21 + 16);
                            wVar.G(16);
                            iZ = wVar.z();
                            iZ2 = wVar.z();
                            wVar.G(50);
                            i26 = wVar.f13861b;
                            if (iG3 == 1701733238) {
                                i27 = i21;
                                i28 = iG2;
                                pairD = d(wVar, i27, i28);
                                if (pairD != null) {
                                    iG3 = ((Integer) pairD.first).intValue();
                                    if (iVar == null) {
                                        iVarX = null;
                                    } else {
                                        iVarX = iVar.x(((p) pairD.second).f22840b);
                                    }
                                    pVarArr[i25] = (p) pairD.second;
                                } else {
                                    iVarX = iVar;
                                }
                                wVar.F(i26);
                            } else {
                                i27 = i21;
                                i28 = iG2;
                                iVarX = iVar;
                            }
                            if (iG3 == 1831958048) {
                                str3 = "video/mpeg";
                            } else if (iG3 == 1211250227) {
                                str3 = "video/3gpp";
                            } else {
                                str3 = null;
                            }
                            i29 = i26;
                            i30 = i27;
                            str = str;
                            iVar2 = iVarX;
                            str4 = str3;
                            fX = 1.0f;
                            i31 = i16;
                            listR = null;
                            iB = -1;
                            iC = -1;
                            str5 = null;
                            bArr = null;
                            byteBufferOrder = null;
                            j0Var = null;
                            i32 = -1;
                            z10 = false;
                            i33 = -1;
                            while (true) {
                                if (i29 - i30 >= i28) {
                                    listR = listR;
                                    break;
                                }
                                wVar.F(i29);
                                i39 = wVar.f13861b;
                                int i711 = i29;
                                iG4 = wVar.g();
                                listR = listR;
                                if (iG4 != 0) {
                                }
                                if (iG4 > 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                yk.a.c(str2, z11);
                                iG5 = wVar.g();
                                String str112 = str2;
                                if (iG5 == 1635148611) {
                                    if (str4 == null) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    yk.a.c(null, z13);
                                    wVar.F(i39 + 8);
                                    aVarA = ke.a.a(wVar);
                                    listR = aVarA.f14316a;
                                    i44 = aVarA.f14317b;
                                    if (!z10) {
                                        fX = aVarA.f14323h;
                                    }
                                    str6 = aVarA.f14324i;
                                    i45 = aVarA.f14320e;
                                    i46 = aVarA.f14321f;
                                    i47 = aVarA.f14322g;
                                    str7 = "video/avc";
                                } else {
                                    if (iG5 == 1752589123) {
                                        if (str4 == null) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        yk.a.c(null, z12);
                                        wVar.F(i39 + 8);
                                        eVarA = ke.e.a(wVar);
                                        listR = eVarA.f14345a;
                                        i44 = eVarA.f14346b;
                                        if (!z10) {
                                            fX = eVarA.f14350f;
                                        }
                                        str6 = eVarA.f14351g;
                                        i45 = eVarA.f14347c;
                                        i46 = eVarA.f14348d;
                                        i47 = eVarA.f14349e;
                                        str7 = "video/hevc";
                                    } else if (iG5 != 1685480259) {
                                        i40 = iZ;
                                        i41 = iG3;
                                        i42 = iZ2;
                                        i43 = i28;
                                        f7 = fX;
                                        bArr3 = bArr;
                                        i33 = i33;
                                        oVarG = a5.o.g(wVar);
                                        if (oVarG != null) {
                                            str5 = oVarG.f236a;
                                            str4 = "video/dolby-vision";
                                        }
                                        listR = listR;
                                        i33 = i33;
                                        bArr = bArr3;
                                        fX = f7;
                                    } else {
                                        i40 = iZ;
                                        i41 = iG3;
                                        i42 = iZ2;
                                        i43 = i28;
                                        f7 = fX;
                                        bArr3 = bArr;
                                        i33 = i33;
                                        oVarG = a5.o.g(wVar);
                                        if (oVarG != null) {
                                            str5 = oVarG.f236a;
                                            str4 = "video/dolby-vision";
                                        }
                                        listR = listR;
                                        i33 = i33;
                                        bArr = bArr3;
                                        fX = f7;
                                    }
                                    i29 = i711 + iG4;
                                    str2 = str112;
                                    iG3 = i41;
                                    i28 = i43;
                                    iZ2 = i42;
                                    iZ = i40;
                                }
                                i40 = iZ;
                                i41 = iG3;
                                i42 = iZ2;
                                i31 = i44;
                                i43 = i28;
                                i32 = i46;
                                str4 = str7;
                                str5 = str6;
                                iB = i45;
                                iC = i47;
                                i29 = i711 + iG4;
                                str2 = str112;
                                iG3 = i41;
                                i28 = i43;
                                iZ2 = i42;
                                iZ = i40;
                            }
                            i34 = iZ;
                            i35 = iZ2;
                            i36 = i28;
                            f2 = fX;
                            bArr2 = bArr;
                            i37 = i33;
                            if (str4 == null) {
                                i11 = i23;
                            } else {
                                g0Var = new g0();
                                g0Var.f9635a = Integer.toString(i22);
                                g0Var.k = str4;
                                g0Var.f9642h = str5;
                                g0Var.f9648p = i34;
                                g0Var.f9649q = i35;
                                g0Var.f9652t = f2;
                                i11 = i23;
                                g0Var.f9651s = i11;
                                g0Var.f9653u = bArr2;
                                g0Var.f9654v = i37;
                                g0Var.f9645m = listR;
                                g0Var.f9646n = iVar2;
                                i38 = i32;
                                if (iB == -1) {
                                    if (byteBufferOrder != null) {
                                        bArrArray = byteBufferOrder.array();
                                    } else {
                                        bArrArray = null;
                                    }
                                    g0Var.f9655w = new ke.b(iB, i38, iC, bArrArray);
                                } else {
                                    if (byteBufferOrder != null) {
                                        bArrArray = byteBufferOrder.array();
                                    } else {
                                        bArrArray = null;
                                    }
                                    g0Var.f9655w = new ke.b(iB, i38, iC, bArrArray);
                                }
                                if (j0Var != null) {
                                    j0 j0Var7 = j0Var;
                                    g0Var.f9640f = c0.G(j0Var7.f15636d);
                                    g0Var.f9641g = c0.G(j0Var7.f15637e);
                                }
                                format = new Format(g0Var);
                            }
                            i16 = i31;
                        }
                        wVar.F(i30 + i36);
                        i14 = i25 + 1;
                        i11 = i11;
                        arrayList4 = arrayList7;
                        iG11 = i22;
                        i65 = i610;
                        iG = iG;
                        str = str;
                        arrayList5 = arrayList5;
                        pairCreate = pairCreate;
                        aVar4 = aVar4;
                        i7 = i24;
                        pVarArr = pVarArr;
                        iVar = iVar;
                    }
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    i17 = iG11;
                    i18 = i65;
                    aVar2 = aVar4;
                    pair = pairCreate;
                    i19 = i7;
                    pVarArr2 = pVarArr;
                    if (z5) {
                        aVar4 = aVar2;
                        aVarE = aVar4.e(1701082227);
                        if (aVarE == null) {
                            bVarG2 = aVarE.g(1701606260);
                            if (bVarG2 == null) {
                                pairCreate2 = null;
                            } else {
                                wVar2 = bVarG2.f22744i;
                                wVar2.F(8);
                                iD2 = lc.a.d(wVar2.g());
                                iX = wVar2.x();
                                jArr3 = new long[iX];
                                jArr4 = new long[iX];
                                while (i20 < iX) {
                                    if (iD2 == 1) {
                                        jV2 = wVar2.y();
                                    } else {
                                        jV2 = wVar2.v();
                                    }
                                    jArr3[i20] = jV2;
                                    if (iD2 == 1) {
                                        jG = wVar2.o();
                                    } else {
                                        jG = wVar2.g();
                                    }
                                    jArr4[i20] = jG;
                                    if (wVar2.r() == 1) {
                                        throw new IllegalArgumentException("Unsupported media rate.");
                                    }
                                    wVar2.G(2);
                                }
                                pairCreate2 = Pair.create(jArr3, jArr4);
                            }
                            if (pairCreate2 != null) {
                                jArr = (long[]) pairCreate2.first;
                                jArr2 = (long[]) pairCreate2.second;
                            }
                        }
                        if (format == null) {
                            eVar = eVar;
                            oVar = new o(i17, i19, ((Long) pair.first).longValue(), j10, j11, format, i15, pVarArr2, i16, jArr, jArr2);
                        }
                        oVar2 = (o) eVar.apply(oVar);
                        if (oVar2 == null) {
                            arrayList3 = arrayList2;
                        } else {
                            a aVarE13 = aVar4.e(1835297121);
                            aVarE13.getClass();
                            a aVarE14 = aVarE13.e(1835626086);
                            aVarE14.getClass();
                            a aVarE15 = aVarE14.e(1937007212);
                            aVarE15.getClass();
                            r rVarE3 = e(oVar2, aVarE15, qVar);
                            arrayList3 = arrayList2;
                            arrayList3.add(rVarE3);
                        }
                    } else {
                        aVar4 = aVar2;
                    }
                    jArr = null;
                    jArr2 = null;
                    if (format == null) {
                        eVar = eVar;
                        oVar = new o(i17, i19, ((Long) pair.first).longValue(), j10, j11, format, i15, pVarArr2, i16, jArr, jArr2);
                    }
                    oVar2 = (o) eVar.apply(oVar);
                    if (oVar2 == null) {
                        arrayList3 = arrayList2;
                    } else {
                        a aVarE16 = aVar4.e(1835297121);
                        aVarE16.getClass();
                        a aVarE17 = aVarE16.e(1835626086);
                        aVarE17.getClass();
                        a aVarE18 = aVarE17.e(1937007212);
                        aVarE18.getClass();
                        r rVarE4 = e(oVar2, aVarE18, qVar);
                        arrayList3 = arrayList2;
                        arrayList3.add(rVarE4);
                    }
                }
                oVar = null;
                oVar2 = (o) eVar.apply(oVar);
                if (oVar2 == null) {
                    arrayList3 = arrayList2;
                } else {
                    a aVarE19 = aVar4.e(1835297121);
                    aVarE19.getClass();
                    a aVarE110 = aVarE19.e(1835626086);
                    aVarE110.getClass();
                    a aVarE111 = aVarE110.e(1937007212);
                    aVarE111.getClass();
                    r rVarE5 = e(oVar2, aVarE111, qVar);
                    arrayList3 = arrayList2;
                    arrayList3.add(rVarE5);
                }
            }
            i65 = i18 + 1;
            aVar3 = aVar;
            arrayList5 = arrayList3;
            arrayList4 = arrayList;
        }
        return arrayList5;
    }
}
