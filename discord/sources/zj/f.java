package zj;

import ij.m;
import java.util.Arrays;
import w3.q;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u4.c f24032a = new u4.c(3);

    public static b a(d dVar) {
        int[] iArr;
        int i7;
        m mVar;
        m mVar2;
        m mVar3;
        m mVar4;
        if (dVar == null) {
            return null;
        }
        boolean z5 = dVar.f24030v;
        b bVar = (b) dVar.f8034e;
        ae.b[] bVarArr = (ae.b[]) dVar.f8035i;
        ae.b bVarC0 = dVar.c0();
        int iMax = -1;
        if (bVarC0 == null) {
            iArr = null;
        } else {
            int i10 = bVarC0.f365f;
            int iK = dVar.K((int) (z5 ? bVar.f24020c : bVar.f24022e).f11824b);
            int i11 = -1;
            int iMax2 = 1;
            int i12 = 0;
            for (int iK2 = dVar.K((int) (z5 ? bVar.f24019b : bVar.f24021d).f11824b); iK2 < iK; iK2++) {
                ae.b bVar2 = bVarArr[iK2];
                if (bVar2 != null) {
                    bVar2.d();
                    int i13 = bVar2.f365f;
                    int i14 = i13 - i11;
                    if (i14 == 0) {
                        i12++;
                    } else if (i14 == 1) {
                        iMax2 = Math.max(iMax2, i12);
                        i11 = bVar2.f365f;
                        i12 = 1;
                    } else if (i13 >= i10) {
                        bVarArr[iK2] = null;
                    } else {
                        i12 = 1;
                        i11 = i13;
                    }
                }
            }
            iArr = new int[i10];
            for (ae.b bVar3 : bVarArr) {
                if (bVar3 != null && (i7 = bVar3.f365f) < i10) {
                    iArr[i7] = iArr[i7] + 1;
                }
            }
        }
        if (iArr == null) {
            return null;
        }
        for (int i15 : iArr) {
            iMax = Math.max(iMax, i15);
        }
        int i16 = 0;
        for (int i17 : iArr) {
            i16 += iMax - i17;
            if (i17 > 0) {
                break;
            }
        }
        for (int i18 = 0; i16 > 0 && bVarArr[i18] == null; i18++) {
            i16--;
        }
        int i19 = 0;
        for (int length = iArr.length - 1; length >= 0; length--) {
            int i20 = iArr[length];
            i19 += iMax - i20;
            if (i20 > 0) {
                break;
            }
        }
        for (int length2 = bVarArr.length - 1; i19 > 0 && bVarArr[length2] == null; length2--) {
            i19--;
        }
        m mVar5 = bVar.f24019b;
        m mVar6 = bVar.f24020c;
        m mVar7 = bVar.f24021d;
        m mVar8 = bVar.f24022e;
        if (i16 > 0) {
            m mVar9 = z5 ? mVar5 : mVar7;
            int i21 = ((int) mVar9.f11824b) - i16;
            m mVar10 = new m(mVar9.f11823a, i21 >= 0 ? i21 : 0);
            if (z5) {
                mVar2 = mVar7;
                mVar = mVar10;
            } else {
                mVar = mVar5;
                mVar2 = mVar10;
            }
        } else {
            mVar = mVar5;
            mVar2 = mVar7;
        }
        if (i19 > 0) {
            m mVar11 = z5 ? mVar6 : mVar8;
            int i22 = ((int) mVar11.f11824b) + i19;
            int i23 = bVar.f24018a.f15840e;
            if (i22 >= i23) {
                i22 = i23 - 1;
            }
            m mVar12 = new m(mVar11.f11823a, i22);
            if (z5) {
                mVar3 = mVar12;
            } else {
                mVar3 = mVar6;
                mVar4 = mVar12;
            }
            return new b(bVar.f24018a, mVar, mVar3, mVar2, mVar4);
        }
        mVar3 = mVar6;
        mVar4 = mVar8;
        return new b(bVar.f24018a, mVar, mVar3, mVar2, mVar4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:206:0x0407  */
    /* JADX WARN: Code duplicated, block: B:212:0x0425  */
    /* JADX WARN: Code duplicated, block: B:215:0x042d  */
    /* JADX WARN: Code duplicated, block: B:221:0x0440  */
    /* JADX WARN: Code duplicated, block: B:223:0x0449 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:224:0x044b  */
    /* JADX WARN: Code duplicated, block: B:225:0x044e  */
    /* JADX WARN: Code duplicated, block: B:227:0x0452 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:230:0x0457 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:235:0x0474  */
    /* JADX WARN: Code duplicated, block: B:238:0x047c  */
    /* JADX WARN: Code duplicated, block: B:261:0x04e5 A[LOOP:23: B:260:0x04e3->B:261:0x04e5, LOOP_END] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1058)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public static gc.s0 b(int[] r25, int r26, int[] r27) throws ij.b, ij.d {
        /*
            Method dump skipped, instruction units count: 1468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zj.f.b(int[], int, int[]):gc.s0");
    }

    /* JADX WARN: Code duplicated, block: B:116:0x002d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0032 A[EDGE_INSN: B:120:0x0032->B:19:0x0032 BREAK  A[LOOP:1: B:9:0x0018->B:18:0x0030], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0060 A[EDGE_INSN: B:123:0x0060->B:34:0x0060 BREAK  A[LOOP:2: B:25:0x0045->B:126:0x0045], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x001f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    /* JADX WARN: Code duplicated, block: B:18:0x0030 A[LOOP:1: B:9:0x0018->B:18:0x0030, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    public static ae.b c(mj.b bVar, int i7, int i10, boolean z5, int i11, int i12, int i13, int i14) {
        int i15;
        ae.b bVar2;
        ae.b bVar3;
        int i16 = i7;
        int i17 = z5 ? -1 : 1;
        boolean z6 = z5;
        int i18 = i11;
        loop0: for (int i19 = 0; i19 < 2; i19++) {
            while (true) {
                if (!z6) {
                    if (i18 >= i10) {
                        break;
                    }
                    if (z6 == bVar.b(i18, i12)) {
                        break;
                        break;
                    }
                    if (Math.abs(i11 - i18) > 2) {
                        i18 = i11;
                        break loop0;
                    }
                    i18 += i17;
                } else {
                    if (i18 < i16) {
                        break;
                    }
                    if (z6 == bVar.b(i18, i12)) {
                        break;
                    }
                    if (Math.abs(i11 - i18) > 2) {
                        i18 = i11;
                        break loop0;
                    }
                    i18 += i17;
                }
            }
            i17 = -i17;
            z6 = !z6;
        }
        int[] iArr = new int[8];
        int i20 = z5 ? 1 : -1;
        boolean z7 = z5;
        int i21 = 0;
        int i22 = i18;
        while (true) {
            if (!z5) {
                if (i22 < i16) {
                    break;
                }
                if (i21 < 8) {
                    break;
                    break;
                }
                if (bVar.b(i22, i12) == z7) {
                    iArr[i21] = iArr[i21] + 1;
                    i22 += i20;
                } else {
                    i21++;
                    z7 = !z7;
                }
            } else {
                if (i22 >= i10) {
                    break;
                }
                if (i21 < 8) {
                    break;
                }
                if (bVar.b(i22, i12) == z7) {
                    iArr[i21] = iArr[i21] + 1;
                    i22 += i20;
                } else {
                    i21++;
                    z7 = !z7;
                }
            }
        }
        if (i21 != 8) {
            if (z5) {
                i16 = i10;
            }
            if (i22 != i16 || i21 != 7) {
                iArr = null;
            }
        }
        if (iArr != null) {
            int iA = q.A(iArr);
            if (z5) {
                i15 = i18 + iA;
            } else {
                for (int i23 = 0; i23 < iArr.length / 2; i23++) {
                    int i24 = iArr[i23];
                    iArr[i23] = iArr[(iArr.length - 1) - i23];
                    iArr[(iArr.length - 1) - i23] = i24;
                }
                int i25 = i18;
                i18 -= iA;
                i15 = i25;
            }
            if (i13 - 2 <= iA && iA <= i14 + 2) {
                float[][] fArr = e.f24031a;
                float fA = q.A(iArr);
                int[] iArr2 = new int[8];
                int i26 = 0;
                int i27 = 0;
                for (int i28 = 0; i28 < 17; i28++) {
                    float f2 = ((i28 * fA) / 17.0f) + (fA / 34.0f);
                    int i29 = iArr[i27] + i26;
                    if (i29 <= f2) {
                        i27++;
                        i26 = i29;
                    }
                    iArr2[i27] = iArr2[i27] + 1;
                }
                long j = 0;
                for (int i30 = 0; i30 < 8; i30++) {
                    for (int i31 = 0; i31 < iArr2[i30]; i31++) {
                        j = (j << 1) | ((long) (i30 % 2 == 0 ? 1 : 0));
                    }
                }
                int i32 = (int) j;
                int i33 = 262143;
                int[] iArr3 = yj.a.f23377b;
                int iBinarySearch = Arrays.binarySearch(iArr3, i32 & 262143);
                int[] iArr4 = yj.a.f23378c;
                if ((iBinarySearch < 0 ? -1 : (iArr4[iBinarySearch] - 1) % 929) == -1) {
                    i32 = -1;
                }
                if (i32 == -1) {
                    int iA2 = q.A(iArr);
                    float[] fArr2 = new float[8];
                    if (iA2 > 1) {
                        for (int i34 = 0; i34 < 8; i34++) {
                            fArr2[i34] = iArr[i34] / iA2;
                        }
                    }
                    float f7 = Float.MAX_VALUE;
                    i32 = -1;
                    int i35 = 0;
                    while (true) {
                        float[][] fArr3 = e.f24031a;
                        if (i35 >= fArr3.length) {
                            break;
                        }
                        float[] fArr4 = fArr3[i35];
                        float f10 = 0.0f;
                        int i36 = i33;
                        for (int i37 = 0; i37 < 8; i37++) {
                            float f11 = fArr4[i37] - fArr2[i37];
                            f10 = (f11 * f11) + f10;
                            if (f10 >= f7) {
                                break;
                            }
                        }
                        if (f10 < f7) {
                            i32 = iArr3[i35];
                            f7 = f10;
                        }
                        i35++;
                        i33 = i36;
                    }
                }
                int iBinarySearch2 = Arrays.binarySearch(iArr3, i32 & i33);
                int i38 = iBinarySearch2 < 0 ? -1 : (iArr4[iBinarySearch2] - 1) % 929;
                if (i38 == -1) {
                    return null;
                }
                int[] iArr5 = new int[8];
                int i39 = 0;
                int i40 = 7;
                while (true) {
                    int i41 = i32 & 1;
                    if (i41 != i39) {
                        i40--;
                        if (i40 < 0) {
                            return new ae.b(i18, i15, ((((iArr5[0] - iArr5[2]) + iArr5[4]) - iArr5[6]) + 9) % 9, i38, 3, (byte) 0);
                        }
                        bVar3 = bVar2;
                        i39 = i41;
                    } else {
                        bVar3 = bVar2;
                    }
                    iArr5[i40] = iArr5[i40] + 1;
                    i32 >>= 1;
                    bVar2 = bVar3;
                    i38 = i38;
                }
            }
        }
        return null;
    }

    public static d d(mj.b bVar, b bVar2, m mVar, boolean z5, int i7, int i10) {
        d dVar = new d(bVar2, z5);
        int i11 = 0;
        while (i11 < 2) {
            int i12 = i11 == 0 ? 1 : -1;
            int i13 = (int) mVar.f11823a;
            int i14 = (int) mVar.f11824b;
            while (i14 <= bVar2.f24026i && i14 >= bVar2.f24025h) {
                ae.b bVarC = c(bVar, 0, bVar.f15839d, z5, i13, i14, i7, i10);
                if (bVarC != null) {
                    ((ae.b[]) dVar.f8035i)[dVar.K(i14)] = bVarC;
                    i13 = z5 ? bVarC.f361b : bVarC.f362c;
                }
                i14 += i12;
                z5 = z5;
            }
            i11++;
        }
        return dVar;
    }
}
