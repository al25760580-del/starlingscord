package androidx.recyclerview.widget;

import androidx.core.util.Pools$SimplePool;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class AdapterHelper {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a1 f2434d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pools$SimplePool f2431a = new Pools$SimplePool(30);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2432b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2433c = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2436f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q0 f2435e = new q0(this);

    public AdapterHelper(a1 a1Var) {
        this.f2434d = a1Var;
    }

    public final boolean a(int i7) {
        ArrayList arrayList = this.f2433c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) arrayList.get(i10);
            int i11 = aVar.f2553a;
            if (i11 != 8) {
                if (i11 == 1) {
                    int i12 = aVar.f2554b;
                    int i13 = aVar.f2556d + i12;
                    while (i12 < i13) {
                        if (f(i12, i10 + 1) == i7) {
                            return true;
                        }
                        i12++;
                    }
                } else {
                    continue;
                }
            } else {
                if (f(aVar.f2556d, i10 + 1) == i7) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList = this.f2433c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f2434d.a((a) arrayList.get(i7));
        }
        k(arrayList);
        this.f2436f = 0;
    }

    public final void c() {
        b();
        ArrayList arrayList = this.f2432b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            a aVar = (a) arrayList.get(i7);
            int i10 = aVar.f2553a;
            a1 a1Var = this.f2434d;
            if (i10 == 1) {
                a1Var.a(aVar);
                int i11 = aVar.f2554b;
                int i12 = aVar.f2556d;
                RecyclerView recyclerView = a1Var.f2559a;
                recyclerView.offsetPositionRecordsForInsert(i11, i12);
                recyclerView.mItemsAddedOrRemoved = true;
            } else if (i10 == 2) {
                a1Var.a(aVar);
                int i13 = aVar.f2554b;
                int i14 = aVar.f2556d;
                RecyclerView recyclerView2 = a1Var.f2559a;
                recyclerView2.offsetPositionRecordsForRemove(i13, i14, true);
                recyclerView2.mItemsAddedOrRemoved = true;
                recyclerView2.mState.f2523c += i14;
            } else if (i10 == 4) {
                a1Var.a(aVar);
                int i15 = aVar.f2554b;
                int i16 = aVar.f2556d;
                Object obj = aVar.f2555c;
                RecyclerView recyclerView3 = a1Var.f2559a;
                recyclerView3.viewRangeUpdate(i15, i16, obj);
                recyclerView3.mItemsChanged = true;
            } else if (i10 == 8) {
                a1Var.a(aVar);
                int i17 = aVar.f2554b;
                int i18 = aVar.f2556d;
                RecyclerView recyclerView4 = a1Var.f2559a;
                recyclerView4.offsetPositionRecordsForMove(i17, i18);
                recyclerView4.mItemsAddedOrRemoved = true;
            }
        }
        k(arrayList);
        this.f2436f = 0;
    }

    public final void d(a aVar) {
        int i7;
        Pools$SimplePool pools$SimplePool;
        int i10 = aVar.f2553a;
        if (i10 == 1 || i10 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iL = l(aVar.f2554b, i10);
        int i11 = aVar.f2554b;
        int i12 = aVar.f2553a;
        if (i12 == 2) {
            i7 = 0;
        } else {
            if (i12 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + aVar);
            }
            i7 = 1;
        }
        int i13 = 1;
        int i14 = 1;
        while (true) {
            int i15 = aVar.f2556d;
            pools$SimplePool = this.f2431a;
            if (i13 >= i15) {
                break;
            }
            int iL2 = l((i7 * i13) + aVar.f2554b, aVar.f2553a);
            int i16 = aVar.f2553a;
            if (i16 == 2 ? iL2 != iL : !(i16 == 4 && iL2 == iL + 1)) {
                a aVarH = h(aVar.f2555c, i16, iL, i14);
                e(aVarH, i11);
                aVarH.f2555c = null;
                pools$SimplePool.release(aVarH);
                if (aVar.f2553a == 4) {
                    i11 += i14;
                }
                i14 = 1;
                iL = iL2;
            } else {
                i14++;
            }
            i13++;
        }
        Object obj = aVar.f2555c;
        aVar.f2555c = null;
        pools$SimplePool.release(aVar);
        if (i14 > 0) {
            a aVarH2 = h(obj, aVar.f2553a, iL, i14);
            e(aVarH2, i11);
            aVarH2.f2555c = null;
            pools$SimplePool.release(aVarH2);
        }
    }

    public final void e(a aVar, int i7) {
        a1 a1Var = this.f2434d;
        a1Var.a(aVar);
        int i10 = aVar.f2553a;
        if (i10 == 2) {
            int i11 = aVar.f2556d;
            RecyclerView recyclerView = a1Var.f2559a;
            recyclerView.offsetPositionRecordsForRemove(i7, i11, true);
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f2523c += i11;
            return;
        }
        if (i10 != 4) {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i12 = aVar.f2556d;
        Object obj = aVar.f2555c;
        RecyclerView recyclerView2 = a1Var.f2559a;
        recyclerView2.viewRangeUpdate(i7, i12, obj);
        recyclerView2.mItemsChanged = true;
    }

    public final int f(int i7, int i10) {
        ArrayList arrayList = this.f2433c;
        int size = arrayList.size();
        while (i10 < size) {
            a aVar = (a) arrayList.get(i10);
            int i11 = aVar.f2553a;
            if (i11 == 8) {
                int i12 = aVar.f2554b;
                if (i12 == i7) {
                    i7 = aVar.f2556d;
                } else {
                    if (i12 < i7) {
                        i7--;
                    }
                    if (aVar.f2556d <= i7) {
                        i7++;
                    }
                }
            } else {
                int i13 = aVar.f2554b;
                if (i13 > i7) {
                    continue;
                } else if (i11 == 2) {
                    int i14 = aVar.f2556d;
                    if (i7 < i13 + i14) {
                        return -1;
                    }
                    i7 -= i14;
                } else if (i11 == 1) {
                    i7 += aVar.f2556d;
                }
            }
            i10++;
        }
        return i7;
    }

    public final boolean g() {
        return this.f2432b.size() > 0;
    }

    public final a h(Object obj, int i7, int i10, int i11) {
        a aVar = (a) this.f2431a.acquire();
        if (aVar != null) {
            aVar.f2553a = i7;
            aVar.f2554b = i10;
            aVar.f2556d = i11;
            aVar.f2555c = obj;
            return aVar;
        }
        a aVar2 = new a();
        aVar2.f2553a = i7;
        aVar2.f2554b = i10;
        aVar2.f2556d = i11;
        aVar2.f2555c = obj;
        return aVar2;
    }

    public final void i(a aVar) {
        this.f2433c.add(aVar);
        int i7 = aVar.f2553a;
        a1 a1Var = this.f2434d;
        if (i7 == 1) {
            int i10 = aVar.f2554b;
            int i11 = aVar.f2556d;
            RecyclerView recyclerView = a1Var.f2559a;
            recyclerView.offsetPositionRecordsForInsert(i10, i11);
            recyclerView.mItemsAddedOrRemoved = true;
            return;
        }
        if (i7 == 2) {
            int i12 = aVar.f2554b;
            int i13 = aVar.f2556d;
            RecyclerView recyclerView2 = a1Var.f2559a;
            recyclerView2.offsetPositionRecordsForRemove(i12, i13, false);
            recyclerView2.mItemsAddedOrRemoved = true;
            return;
        }
        if (i7 == 4) {
            int i14 = aVar.f2554b;
            int i15 = aVar.f2556d;
            Object obj = aVar.f2555c;
            RecyclerView recyclerView3 = a1Var.f2559a;
            recyclerView3.viewRangeUpdate(i14, i15, obj);
            recyclerView3.mItemsChanged = true;
            return;
        }
        if (i7 != 8) {
            throw new IllegalArgumentException("Unknown update op type for " + aVar);
        }
        int i16 = aVar.f2554b;
        int i17 = aVar.f2556d;
        RecyclerView recyclerView4 = a1Var.f2559a;
        recyclerView4.offsetPositionRecordsForMove(i16, i17);
        recyclerView4.mItemsAddedOrRemoved = true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0189  */
    /* JADX WARN: Code duplicated, block: B:105:0x018d  */
    /* JADX WARN: Code duplicated, block: B:186:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x006b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:39:0x009a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0123  */
    /* JADX WARN: Code duplicated, block: B:77:0x0125  */
    /* JADX WARN: Code duplicated, block: B:79:0x012b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0136  */
    /* JADX WARN: Code duplicated, block: B:85:0x0141  */
    /* JADX WARN: Code duplicated, block: B:88:0x014c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0152  */
    /* JADX WARN: Code duplicated, block: B:90:0x0154  */
    /* JADX WARN: Code duplicated, block: B:92:0x015a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0165  */
    /* JADX WARN: Code duplicated, block: B:98:0x0170  */
    public final void j() {
        ArrayList arrayList;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        a aVarH;
        int i14;
        int i15;
        int i16;
        a aVarH2;
        boolean z5;
        boolean z6;
        Object obj;
        a aVar;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        q0 q0Var = this.f2435e;
        q0Var.getClass();
        while (true) {
            arrayList = this.f2432b;
            i7 = 1;
            int size = arrayList.size() - 1;
            boolean z7 = false;
            while (true) {
                i10 = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((a) arrayList.get(size)).f2553a != 8) {
                    z7 = true;
                } else if (z7) {
                    break;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i25 = size + 1;
            AdapterHelper adapterHelper = q0Var.f2675a;
            Pools$SimplePool pools$SimplePool = adapterHelper.f2431a;
            a aVar2 = (a) arrayList.get(size);
            a aVar3 = (a) arrayList.get(i25);
            int i26 = aVar3.f2553a;
            if (i26 == 1) {
                int i27 = aVar2.f2556d;
                int i28 = aVar3.f2554b;
                int i29 = i27 < i28 ? -1 : 0;
                int i30 = aVar2.f2554b;
                if (i30 < i28) {
                    i29++;
                }
                if (i28 <= i30) {
                    aVar2.f2554b = i30 + aVar3.f2556d;
                }
                int i31 = aVar3.f2554b;
                if (i31 <= i27) {
                    aVar2.f2556d = i27 + aVar3.f2556d;
                }
                aVar3.f2554b = i31 + i29;
                arrayList.set(size, aVar3);
                arrayList.set(i25, aVar2);
            } else if (i26 == 2) {
                int i32 = aVar2.f2554b;
                int i33 = aVar2.f2556d;
                if (i32 < i33) {
                    z6 = aVar3.f2554b == i32 && aVar3.f2556d == i33 - i32;
                    z5 = false;
                } else if (aVar3.f2554b == i33 + 1 && aVar3.f2556d == i32 - i33) {
                    z6 = true;
                    z5 = true;
                } else {
                    z5 = true;
                    z6 = false;
                }
                int i34 = aVar3.f2554b;
                if (i33 < i34) {
                    aVar3.f2554b = i34 - 1;
                } else {
                    int i35 = aVar3.f2556d;
                    if (i33 < i34 + i35) {
                        aVar3.f2556d = i35 - 1;
                        aVar2.f2553a = 2;
                        aVar2.f2556d = 1;
                        if (aVar3.f2556d == 0) {
                            arrayList.remove(i25);
                            aVar3.f2555c = null;
                            pools$SimplePool.release(aVar3);
                        }
                    }
                }
                int i36 = aVar2.f2554b;
                int i37 = aVar3.f2554b;
                if (i36 <= i37) {
                    aVar3.f2554b = i37 + 1;
                } else {
                    int i38 = i37 + aVar3.f2556d;
                    if (i36 < i38) {
                        obj = null;
                        a aVarH3 = adapterHelper.h(null, 2, i36 + 1, i38 - i36);
                        aVar3.f2556d = aVar2.f2554b - aVar3.f2554b;
                        aVar = aVarH3;
                    }
                    if (z6) {
                        arrayList.set(size, aVar3);
                        arrayList.remove(i25);
                        aVar2.f2555c = obj;
                        pools$SimplePool.release(aVar2);
                    } else {
                        if (z5) {
                            if (aVar != null) {
                                i23 = aVar2.f2554b;
                                if (i23 > aVar.f2554b) {
                                    aVar2.f2554b = i23 - aVar.f2556d;
                                }
                                i24 = aVar2.f2556d;
                                if (i24 > aVar.f2554b) {
                                    aVar2.f2556d = i24 - aVar.f2556d;
                                }
                            }
                            i21 = aVar2.f2554b;
                            if (i21 > aVar3.f2554b) {
                                aVar2.f2554b = i21 - aVar3.f2556d;
                            }
                            i22 = aVar2.f2556d;
                            if (i22 > aVar3.f2554b) {
                                aVar2.f2556d = i22 - aVar3.f2556d;
                            }
                        } else {
                            if (aVar != null) {
                                i19 = aVar2.f2554b;
                                if (i19 >= aVar.f2554b) {
                                    aVar2.f2554b = i19 - aVar.f2556d;
                                }
                                i20 = aVar2.f2556d;
                                if (i20 >= aVar.f2554b) {
                                    aVar2.f2556d = i20 - aVar.f2556d;
                                }
                            }
                            i17 = aVar2.f2554b;
                            if (i17 >= aVar3.f2554b) {
                                aVar2.f2554b = i17 - aVar3.f2556d;
                            }
                            i18 = aVar2.f2556d;
                            if (i18 >= aVar3.f2554b) {
                                aVar2.f2556d = i18 - aVar3.f2556d;
                            }
                        }
                        arrayList.set(size, aVar3);
                        if (aVar2.f2554b != aVar2.f2556d) {
                            arrayList.set(i25, aVar2);
                        } else {
                            arrayList.remove(i25);
                        }
                        if (aVar != null) {
                            arrayList.add(size, aVar);
                        }
                    }
                }
                obj = null;
                aVar = null;
                if (z6) {
                    arrayList.set(size, aVar3);
                    arrayList.remove(i25);
                    aVar2.f2555c = obj;
                    pools$SimplePool.release(aVar2);
                } else {
                    if (z5) {
                        if (aVar != null) {
                            i23 = aVar2.f2554b;
                            if (i23 > aVar.f2554b) {
                                aVar2.f2554b = i23 - aVar.f2556d;
                            }
                            i24 = aVar2.f2556d;
                            if (i24 > aVar.f2554b) {
                                aVar2.f2556d = i24 - aVar.f2556d;
                            }
                        }
                        i21 = aVar2.f2554b;
                        if (i21 > aVar3.f2554b) {
                            aVar2.f2554b = i21 - aVar3.f2556d;
                        }
                        i22 = aVar2.f2556d;
                        if (i22 > aVar3.f2554b) {
                            aVar2.f2556d = i22 - aVar3.f2556d;
                        }
                    } else {
                        if (aVar != null) {
                            i19 = aVar2.f2554b;
                            if (i19 >= aVar.f2554b) {
                                aVar2.f2554b = i19 - aVar.f2556d;
                            }
                            i20 = aVar2.f2556d;
                            if (i20 >= aVar.f2554b) {
                                aVar2.f2556d = i20 - aVar.f2556d;
                            }
                        }
                        i17 = aVar2.f2554b;
                        if (i17 >= aVar3.f2554b) {
                            aVar2.f2554b = i17 - aVar3.f2556d;
                        }
                        i18 = aVar2.f2556d;
                        if (i18 >= aVar3.f2554b) {
                            aVar2.f2556d = i18 - aVar3.f2556d;
                        }
                    }
                    arrayList.set(size, aVar3);
                    if (aVar2.f2554b != aVar2.f2556d) {
                        arrayList.set(i25, aVar2);
                    } else {
                        arrayList.remove(i25);
                    }
                    if (aVar != null) {
                        arrayList.add(size, aVar);
                    }
                }
            } else if (i26 == 4) {
                int i39 = aVar2.f2556d;
                int i40 = aVar3.f2554b;
                if (i39 < i40) {
                    aVar3.f2554b = i40 - 1;
                } else {
                    int i41 = aVar3.f2556d;
                    if (i39 < i40 + i41) {
                        aVar3.f2556d = i41 - 1;
                        aVarH = adapterHelper.h(aVar3.f2555c, 4, aVar2.f2554b, 1);
                    }
                    i14 = aVar2.f2554b;
                    i15 = aVar3.f2554b;
                    if (i14 <= i15) {
                        aVar3.f2554b = i15 + 1;
                    } else {
                        i16 = i15 + aVar3.f2556d;
                        if (i14 < i16) {
                            int i42 = i16 - i14;
                            aVarH2 = adapterHelper.h(aVar3.f2555c, 4, i14 + 1, i42);
                            aVar3.f2556d -= i42;
                        }
                        arrayList.set(i25, aVar2);
                        if (aVar3.f2556d > 0) {
                            arrayList.set(size, aVar3);
                        } else {
                            arrayList.remove(size);
                            aVar3.f2555c = null;
                            pools$SimplePool.release(aVar3);
                        }
                        if (aVarH != null) {
                            arrayList.add(size, aVarH);
                        }
                        if (aVarH2 != null) {
                            arrayList.add(size, aVarH2);
                        }
                    }
                    aVarH2 = null;
                    arrayList.set(i25, aVar2);
                    if (aVar3.f2556d > 0) {
                        arrayList.set(size, aVar3);
                    } else {
                        arrayList.remove(size);
                        aVar3.f2555c = null;
                        pools$SimplePool.release(aVar3);
                    }
                    if (aVarH != null) {
                        arrayList.add(size, aVarH);
                    }
                    if (aVarH2 != null) {
                        arrayList.add(size, aVarH2);
                    }
                }
                aVarH = null;
                i14 = aVar2.f2554b;
                i15 = aVar3.f2554b;
                if (i14 <= i15) {
                    aVar3.f2554b = i15 + 1;
                } else {
                    i16 = i15 + aVar3.f2556d;
                    if (i14 < i16) {
                        int i43 = i16 - i14;
                        aVarH2 = adapterHelper.h(aVar3.f2555c, 4, i14 + 1, i43);
                        aVar3.f2556d -= i43;
                    }
                    arrayList.set(i25, aVar2);
                    if (aVar3.f2556d > 0) {
                        arrayList.set(size, aVar3);
                    } else {
                        arrayList.remove(size);
                        aVar3.f2555c = null;
                        pools$SimplePool.release(aVar3);
                    }
                    if (aVarH != null) {
                        arrayList.add(size, aVarH);
                    }
                    if (aVarH2 != null) {
                        arrayList.add(size, aVarH2);
                    }
                }
                aVarH2 = null;
                arrayList.set(i25, aVar2);
                if (aVar3.f2556d > 0) {
                    arrayList.set(size, aVar3);
                } else {
                    arrayList.remove(size);
                    aVar3.f2555c = null;
                    pools$SimplePool.release(aVar3);
                }
                if (aVarH != null) {
                    arrayList.add(size, aVarH);
                }
                if (aVarH2 != null) {
                    arrayList.add(size, aVarH2);
                }
            }
        }
        int size2 = arrayList.size();
        int i44 = 0;
        while (i44 < size2) {
            a aVarH4 = (a) arrayList.get(i44);
            int i45 = aVarH4.f2553a;
            if (i45 != i7) {
                Pools$SimplePool pools$SimplePool2 = this.f2431a;
                a1 a1Var = this.f2434d;
                if (i45 != 2) {
                    if (i45 == 4) {
                        int i46 = aVarH4.f2554b;
                        int i47 = aVarH4.f2556d + i46;
                        int i48 = i46;
                        int i49 = -1;
                        int i50 = 0;
                        while (i46 < i47) {
                            if (a1Var.b(i46) != null || a(i46)) {
                                if (i49 == 0) {
                                    d(h(aVarH4.f2555c, 4, i48, i50));
                                    i48 = i46;
                                    i50 = 0;
                                }
                                i49 = i7;
                            } else {
                                if (i49 == i7) {
                                    i(h(aVarH4.f2555c, 4, i48, i50));
                                    i48 = i46;
                                    i50 = 0;
                                }
                                i49 = 0;
                            }
                            i50 += i7;
                            i46++;
                        }
                        if (i50 != aVarH4.f2556d) {
                            Object obj2 = aVarH4.f2555c;
                            aVarH4.f2555c = null;
                            pools$SimplePool2.release(aVarH4);
                            aVarH4 = h(obj2, 4, i48, i50);
                        }
                        if (i49 == 0) {
                            d(aVarH4);
                        } else {
                            i(aVarH4);
                        }
                    } else if (i45 == i10) {
                        i(aVarH4);
                    }
                    i11 = i7;
                } else {
                    int i51 = aVarH4.f2554b;
                    int i52 = aVarH4.f2556d + i51;
                    int i53 = i51;
                    int i54 = -1;
                    int i55 = 0;
                    while (i53 < i52) {
                        if (a1Var.b(i53) != null || a(i53)) {
                            i12 = i7;
                            if (i54 == 0) {
                                d(h(null, 2, i51, i55));
                                i13 = i12;
                            } else {
                                i13 = 0;
                            }
                            i54 = i12;
                        } else {
                            i12 = i7;
                            if (i54 == i7) {
                                i(h(null, 2, i51, i55));
                                i13 = i12;
                            } else {
                                i13 = 0;
                            }
                            i54 = 0;
                        }
                        if (i13 != 0) {
                            i53 -= i55;
                            i52 -= i55;
                            i55 = i12;
                        } else {
                            i55++;
                        }
                        i53++;
                        i7 = i12;
                    }
                    i11 = i7;
                    if (i55 != aVarH4.f2556d) {
                        aVarH4.f2555c = null;
                        pools$SimplePool2.release(aVarH4);
                        aVarH4 = h(null, 2, i51, i55);
                    }
                    if (i54 == 0) {
                        d(aVarH4);
                    } else {
                        i(aVarH4);
                    }
                }
            } else {
                i11 = i7;
                i(aVarH4);
            }
            i44++;
            i7 = i11;
            i10 = 8;
        }
        arrayList.clear();
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            a aVar = (a) arrayList.get(i7);
            aVar.f2555c = null;
            this.f2431a.release(aVar);
        }
        arrayList.clear();
    }

    public final int l(int i7, int i10) {
        int i11;
        int i12;
        ArrayList arrayList = this.f2433c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            int i13 = aVar.f2553a;
            if (i13 == 8) {
                int i14 = aVar.f2554b;
                int i15 = aVar.f2556d;
                if (i14 < i15) {
                    i12 = i14;
                    i11 = i15;
                } else {
                    i11 = i14;
                    i12 = i15;
                }
                if (i7 < i12 || i7 > i11) {
                    if (i7 < i14) {
                        if (i10 == 1) {
                            aVar.f2554b = i14 + 1;
                            aVar.f2556d = i15 + 1;
                        } else if (i10 == 2) {
                            aVar.f2554b = i14 - 1;
                            aVar.f2556d = i15 - 1;
                        }
                    }
                } else if (i12 == i14) {
                    if (i10 == 1) {
                        aVar.f2556d = i15 + 1;
                    } else if (i10 == 2) {
                        aVar.f2556d = i15 - 1;
                    }
                    i7++;
                } else {
                    if (i10 == 1) {
                        aVar.f2554b = i14 + 1;
                    } else if (i10 == 2) {
                        aVar.f2554b = i14 - 1;
                    }
                    i7--;
                }
            } else {
                int i16 = aVar.f2554b;
                if (i16 <= i7) {
                    if (i13 == 1) {
                        i7 -= aVar.f2556d;
                    } else if (i13 == 2) {
                        i7 += aVar.f2556d;
                    }
                } else if (i10 == 1) {
                    aVar.f2554b = i16 + 1;
                } else if (i10 == 2) {
                    aVar.f2554b = i16 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            a aVar2 = (a) arrayList.get(size2);
            int i17 = aVar2.f2553a;
            Pools$SimplePool pools$SimplePool = this.f2431a;
            if (i17 == 8) {
                int i18 = aVar2.f2556d;
                if (i18 == aVar2.f2554b || i18 < 0) {
                    arrayList.remove(size2);
                    aVar2.f2555c = null;
                    pools$SimplePool.release(aVar2);
                }
            } else if (aVar2.f2556d <= 0) {
                arrayList.remove(size2);
                aVar2.f2555c = null;
                pools$SimplePool.release(aVar2);
            }
        }
        return i7;
    }
}
