package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ExecutorService f2563b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f2562a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f2564c = new s(0);

    public static u a(c cVar, boolean z5) {
        int[] iArr;
        int[] iArr2;
        int i7;
        y yVar;
        int i10;
        x xVar;
        t tVar;
        int i11;
        y yVar2;
        y yVar3;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int oldListSize = cVar.getOldListSize();
        int newListSize = cVar.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        x xVar2 = new x();
        int i19 = 0;
        xVar2.f2718a = 0;
        xVar2.f2719b = oldListSize;
        xVar2.f2720c = 0;
        xVar2.f2721d = newListSize;
        arrayList2.add(xVar2);
        int i20 = oldListSize + newListSize;
        int i21 = 1;
        int i22 = (((i20 + 1) / 2) * 2) + 1;
        int[] iArr3 = new int[i22];
        int i23 = i22 / 2;
        int[] iArr4 = new int[i22];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            x xVar3 = (x) arrayList2.remove(arrayList2.size() - i21);
            if (xVar3.b() >= i21 && xVar3.a() >= i21) {
                int iA = ((xVar3.a() + xVar3.b()) + i21) / 2;
                int i24 = i21 + i23;
                iArr3[i24] = xVar3.f2718a;
                iArr4[i24] = xVar3.f2719b;
                int i25 = i19;
                while (true) {
                    if (i25 >= iA) {
                        iArr = iArr4;
                        iArr2 = iArr3;
                        i7 = i23;
                        yVar = null;
                        break;
                    }
                    int i26 = Math.abs(xVar3.b() - xVar3.a()) % 2 == i21 ? i21 : i19;
                    int iB = xVar3.b() - xVar3.a();
                    int i27 = -i25;
                    int i28 = i27;
                    while (true) {
                        if (i28 > i25) {
                            iArr = iArr4;
                            iArr2 = iArr3;
                            i11 = i19;
                            i7 = i23;
                            yVar2 = null;
                            break;
                        }
                        if (i28 == i27 || (i28 != i25 && iArr3[i28 + 1 + i23] > iArr3[(i28 - 1) + i23])) {
                            i16 = iArr3[i28 + 1 + i23];
                            i17 = i16;
                        } else {
                            i16 = iArr3[(i28 - 1) + i23];
                            i17 = i16 + 1;
                        }
                        iArr = iArr4;
                        int i29 = ((i17 - xVar3.f2718a) + xVar3.f2720c) - i28;
                        if (i25 != 0 && i17 == i16) {
                            i29--;
                        }
                        iArr2 = iArr3;
                        int i30 = i17;
                        int i31 = i29;
                        i7 = i23;
                        while (i30 < xVar3.f2719b && i31 < xVar3.f2721d && cVar.areItemsTheSame(i30, i31)) {
                            i30++;
                            i31++;
                        }
                        iArr2[i28 + i7] = i30;
                        if (i26 != 0) {
                            int i32 = iB - i28;
                            i18 = i28;
                            if (i32 >= i27 + 1 && i32 <= i25 - 1 && iArr[i32 + i7] <= i30) {
                                yVar2 = new y();
                                yVar2.f2723a = i16;
                                yVar2.f2724b = i29;
                                yVar2.f2725c = i30;
                                yVar2.f2726d = i31;
                                i11 = 0;
                                yVar2.f2727e = false;
                                break;
                            }
                        } else {
                            i18 = i28;
                        }
                        i28 = i18 + 2;
                        i19 = 0;
                        iArr4 = iArr;
                        iArr3 = iArr2;
                        i23 = i7;
                    }
                    if (yVar2 != null) {
                        yVar = yVar2;
                        break;
                    }
                    int i33 = (xVar3.b() - xVar3.a()) % 2 == 0 ? 1 : i11;
                    int iB2 = xVar3.b() - xVar3.a();
                    int i34 = i27;
                    while (true) {
                        if (i34 > i25) {
                            yVar3 = null;
                            break;
                        }
                        if (i34 == i27 || (i34 != i25 && iArr[i34 + 1 + i7] < iArr[(i34 - 1) + i7])) {
                            i12 = iArr[i34 + 1 + i7];
                            i13 = i12;
                        } else {
                            i12 = iArr[(i34 - 1) + i7];
                            i13 = i12 - 1;
                        }
                        int i35 = xVar3.f2721d - ((xVar3.f2719b - i13) - i34);
                        int i36 = (i25 == 0 || i13 != i12) ? i35 : i35 + 1;
                        while (true) {
                            if (i13 > xVar3.f2718a && i35 > xVar3.f2720c) {
                                i14 = i33;
                                if (!cVar.areItemsTheSame(i13 - 1, i35 - 1)) {
                                    break;
                                }
                                i13--;
                                i35--;
                                i33 = i14;
                            } else {
                                i14 = i33;
                                break;
                            }
                        }
                        iArr[i34 + i7] = i13;
                        if (i14 != 0 && (i15 = iB2 - i34) >= i27 && i15 <= i25 && iArr2[i15 + i7] >= i13) {
                            yVar3 = new y();
                            yVar3.f2723a = i13;
                            yVar3.f2724b = i35;
                            yVar3.f2725c = i12;
                            yVar3.f2726d = i36;
                            yVar3.f2727e = true;
                            break;
                        }
                        i34 += 2;
                        i33 = i14;
                    }
                    if (yVar3 != null) {
                        yVar = yVar3;
                        break;
                    }
                    i25++;
                    iArr4 = iArr;
                    iArr3 = iArr2;
                    i23 = i7;
                    i21 = 1;
                    i19 = 0;
                }
            } else {
                iArr = iArr4;
                iArr2 = iArr3;
                i7 = i23;
                yVar = null;
                break;
            }
            if (yVar != null) {
                if (yVar.a() > 0) {
                    int i37 = yVar.f2726d;
                    int i38 = yVar.f2724b;
                    int i39 = i37 - i38;
                    int i40 = yVar.f2725c;
                    int i41 = yVar.f2723a;
                    int i42 = i40 - i41;
                    if (i39 == i42) {
                        tVar = new t(i41, i38, i42);
                    } else if (yVar.f2727e) {
                        tVar = new t(i41, i38, yVar.a());
                    } else {
                        tVar = i39 > i42 ? new t(i41, i38 + 1, yVar.a()) : new t(i41 + 1, i38, yVar.a());
                    }
                    arrayList.add(tVar);
                }
                if (arrayList3.isEmpty()) {
                    xVar = new x();
                    i10 = 1;
                } else {
                    i10 = 1;
                    xVar = (x) arrayList3.remove(arrayList3.size() - 1);
                }
                xVar.f2718a = xVar3.f2718a;
                xVar.f2720c = xVar3.f2720c;
                xVar.f2719b = yVar.f2723a;
                xVar.f2721d = yVar.f2724b;
                arrayList2.add(xVar);
                xVar3.f2719b = xVar3.f2719b;
                xVar3.f2721d = xVar3.f2721d;
                xVar3.f2718a = yVar.f2725c;
                xVar3.f2720c = yVar.f2726d;
                arrayList2.add(xVar3);
            } else {
                i10 = 1;
                arrayList3.add(xVar3);
            }
            iArr4 = iArr;
            i21 = i10;
            iArr3 = iArr2;
            i23 = i7;
            i19 = 0;
        }
        int[] iArr5 = iArr4;
        Collections.sort(arrayList, f2564c);
        return new u(cVar, arrayList, iArr3, iArr5, z5);
    }

    public abstract boolean areContentsTheSame(int i7, int i10);

    public abstract boolean areItemsTheSame(int i7, int i10);

    public abstract Object getChangePayload(int i7, int i10);

    public abstract int getNewListSize();

    public abstract int getOldListSize();
}
