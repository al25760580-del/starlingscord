package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h1 extends xn.g implements Function2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f14645e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Iterator f14646i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14647v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14648w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f14649x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Iterator f14650y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(Iterator it, Continuation continuation) {
        super(2, continuation);
        this.f14650y = it;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        h1 h1Var = new h1(this.f14650y, continuation);
        h1Var.f14649x = obj;
        return h1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h1) create((xq.k) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        xq.k kVar;
        ArrayList arrayList;
        Iterator it;
        int i7;
        c1 c1Var;
        xq.k kVar2;
        Object[] array;
        wn.a aVar = wn.a.f22354d;
        int i10 = this.f14648w;
        if (i10 != 0) {
            if (i10 == 1) {
                i7 = this.f14647v;
                it = this.f14646i;
                kVar = (xq.k) this.f14649x;
                ib.a.L(obj);
                arrayList = new ArrayList(2);
            } else if (i10 == 2) {
                ib.a.L(obj);
            } else {
                if (i10 == 3) {
                    Iterator it2 = this.f14646i;
                    c1 c1Var2 = (c1) this.f14645e;
                    xq.k kVar3 = (xq.k) this.f14649x;
                    ib.a.L(obj);
                    c1Var2.b();
                    while (true) {
                        int i11 = c1Var2.f14634i;
                        Object[] objArr = c1Var2.f14633e;
                        if (!it2.hasNext()) {
                            c1Var = c1Var2;
                            kVar2 = kVar3;
                            break;
                        }
                        Object next = it2.next();
                        if (c1Var2.a() == i11) {
                            throw new IllegalStateException("ring buffer is full");
                        }
                        int i12 = c1Var2.f14635v;
                        int i13 = c1Var2.f14636w;
                        objArr[(i12 + i13) % i11] = next;
                        c1Var2.f14636w = i13 + 1;
                        if (c1Var2.a() == i11) {
                            if (c1Var2.f14636w >= 2) {
                                ArrayList arrayList2 = new ArrayList(c1Var2);
                                this.f14649x = kVar3;
                                this.f14645e = c1Var2;
                                this.f14646i = it2;
                                this.f14648w = 3;
                                kVar3.a(arrayList2, this);
                                wn.a aVar2 = wn.a.f22354d;
                                return aVar;
                            }
                            int i14 = i11 + (i11 >> 1) + 1;
                            if (i14 > 2) {
                                i14 = 2;
                            }
                            if (c1Var2.f14635v == 0) {
                                array = Arrays.copyOf(objArr, i14);
                                Intrinsics.checkNotNullExpressionValue(array, "copyOf(...)");
                            } else {
                                array = c1Var2.toArray(new Object[i14]);
                            }
                            c1Var2 = new c1(c1Var2.f14636w, array);
                        }
                    }
                } else if (i10 != 4) {
                    if (i10 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                } else {
                    c1Var = (c1) this.f14645e;
                    kVar2 = (xq.k) this.f14649x;
                    ib.a.L(obj);
                    c1Var.b();
                }
                if (c1Var.f14636w > 2) {
                    ArrayList arrayList3 = new ArrayList(c1Var);
                    this.f14649x = kVar2;
                    this.f14645e = c1Var;
                    this.f14646i = null;
                    this.f14648w = 4;
                    kVar2.a(arrayList3, this);
                    wn.a aVar3 = wn.a.f22354d;
                    return aVar;
                }
                if (!c1Var.isEmpty()) {
                    this.f14649x = null;
                    this.f14645e = null;
                    this.f14646i = null;
                    this.f14648w = 5;
                    kVar2.a(c1Var, this);
                    wn.a aVar4 = wn.a.f22354d;
                    return aVar;
                }
            }
            return Unit.f14616a;
        }
        ib.a.L(obj);
        kVar = (xq.k) this.f14649x;
        arrayList = new ArrayList(2);
        it = this.f14650y;
        i7 = 0;
        xq.k kVar4 = kVar;
        Iterator it3 = it;
        int i15 = i7;
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (i7 > 0) {
                i7--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 2) {
                    this.f14649x = kVar4;
                    this.f14645e = arrayList;
                    this.f14646i = it3;
                    this.f14647v = i15;
                    this.f14648w = 1;
                    kVar4.a(arrayList, this);
                    wn.a aVar5 = wn.a.f22354d;
                    return aVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f14649x = null;
            this.f14645e = null;
            this.f14646i = null;
            this.f14648w = 2;
            kVar4.a(arrayList, this);
            wn.a aVar6 = wn.a.f22354d;
            return aVar;
        }
        return Unit.f14616a;
    }
}
