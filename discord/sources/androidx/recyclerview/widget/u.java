package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f2700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f2701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f2702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f2705g;

    public u(c cVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z5) {
        int i7;
        int i10;
        this.f2699a = arrayList;
        this.f2700b = iArr;
        this.f2701c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f2702d = cVar;
        int oldListSize = cVar.getOldListSize();
        this.f2703e = oldListSize;
        int newListSize = cVar.getNewListSize();
        this.f2704f = newListSize;
        this.f2705g = z5;
        t tVar = arrayList.isEmpty() ? null : (t) arrayList.get(0);
        if (tVar == null || tVar.f2689a != 0 || tVar.f2690b != 0) {
            arrayList.add(0, new t(0, 0, 0));
        }
        arrayList.add(new t(oldListSize, newListSize, 0));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            t tVar2 = (t) it.next();
            for (int i11 = 0; i11 < tVar2.f2691c; i11++) {
                int i12 = tVar2.f2689a + i11;
                int i13 = tVar2.f2690b + i11;
                int i14 = cVar.areContentsTheSame(i12, i13) ? 1 : 2;
                iArr[i12] = (i13 << 4) | i14;
                iArr2[i13] = (i12 << 4) | i14;
            }
        }
        if (this.f2705g) {
            Iterator it2 = arrayList.iterator();
            int i15 = 0;
            while (it2.hasNext()) {
                t tVar3 = (t) it2.next();
                while (true) {
                    i7 = tVar3.f2689a;
                    if (i15 < i7) {
                        if (iArr[i15] == 0) {
                            int size = arrayList.size();
                            int i16 = 0;
                            for (int i17 = 0; i17 < size; i17++) {
                                t tVar4 = (t) arrayList.get(i17);
                                while (true) {
                                    i10 = tVar4.f2690b;
                                    if (i16 < i10) {
                                        if (iArr2[i16] == 0 && cVar.areItemsTheSame(i15, i16)) {
                                            int i18 = cVar.areContentsTheSame(i15, i16) ? 8 : 4;
                                            iArr[i15] = (i16 << 4) | i18;
                                            iArr2[i16] = i18 | (i15 << 4);
                                            break;
                                        }
                                        i16++;
                                    }
                                }
                                i16 = tVar4.f2691c + i10;
                            }
                        }
                        i15++;
                    }
                }
                i15 = tVar3.f2691c + i7;
            }
        }
    }

    public static w b(ArrayDeque arrayDeque, int i7, boolean z5) {
        w wVar;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                wVar = null;
                break;
            }
            wVar = (w) it.next();
            if (wVar.f2714a == i7 && wVar.f2716c == z5) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            w wVar2 = (w) it.next();
            if (z5) {
                wVar2.f2715b--;
            } else {
                wVar2.f2715b++;
            }
        }
        return wVar;
    }

    public final void a(b bVar) {
        int[] iArr;
        c cVar;
        int i7;
        int i10;
        ArrayList arrayList;
        u uVar = this;
        g gVar = new g(bVar);
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList2 = uVar.f2699a;
        boolean z5 = true;
        int size = arrayList2.size() - 1;
        int i11 = uVar.f2703e;
        int i12 = uVar.f2704f;
        int i13 = i11;
        while (size >= 0) {
            t tVar = (t) arrayList2.get(size);
            int i14 = tVar.f2689a;
            int i15 = tVar.f2691c;
            int i16 = i14 + i15;
            int i17 = tVar.f2690b;
            int i18 = i17 + i15;
            while (true) {
                iArr = uVar.f2700b;
                cVar = uVar.f2702d;
                boolean z6 = z5;
                i7 = 0;
                if (i13 <= i16) {
                    break;
                }
                i13--;
                int i19 = iArr[i13];
                if ((i19 & 12) != 0) {
                    arrayList = arrayList2;
                    int i20 = i19 >> 4;
                    w wVarB = b(arrayDeque, i20, false);
                    if (wVarB != null) {
                        int i21 = (i11 - wVarB.f2715b) - 1;
                        gVar.a(i13, i21);
                        if ((i19 & 4) != 0) {
                            gVar.d(i21, z6 ? 1 : 0, cVar.getChangePayload(i13, i20));
                        }
                    } else {
                        arrayDeque.add(new w(i13, (i11 - i13) - (z6 ? 1 : 0), z6));
                    }
                } else {
                    arrayList = arrayList2;
                    gVar.c(i13, z6 ? 1 : 0);
                    i11--;
                }
                arrayList2 = arrayList;
                z5 = true;
            }
            ArrayList arrayList3 = arrayList2;
            while (i12 > i18) {
                i12--;
                int i22 = uVar.f2701c[i12];
                if ((i22 & 12) != 0) {
                    int i23 = i22 >> 4;
                    w wVarB2 = b(arrayDeque, i23, true);
                    if (wVarB2 == null) {
                        arrayDeque.add(new w(i12, i11 - i13, false));
                        i10 = 0;
                    } else {
                        i10 = 0;
                        gVar.a((i11 - wVarB2.f2715b) - 1, i13);
                        if ((i22 & 4) != 0) {
                            gVar.d(i13, 1, cVar.getChangePayload(i23, i12));
                        }
                    }
                } else {
                    i10 = i7;
                    gVar.b(i13, 1);
                    i11++;
                }
                uVar = this;
                i7 = i10;
            }
            int i24 = i17;
            int i25 = i14;
            while (i7 < i15) {
                if ((iArr[i25] & 15) == 2) {
                    gVar.d(i25, 1, cVar.getChangePayload(i25, i24));
                }
                i25++;
                i24++;
                i7++;
            }
            size--;
            uVar = this;
            z5 = true;
            i12 = i17;
            i13 = i14;
            arrayList2 = arrayList3;
        }
        gVar.e();
    }
}
