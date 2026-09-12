package v4;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final io.sentry.internal.debugmeta.c f21484a = io.sentry.internal.debugmeta.c.D0("k");

    public static ArrayList a(w4.a aVar, l4.i iVar, float f2, d0 d0Var, boolean z5) {
        w4.a aVar2;
        l4.i iVar2;
        float f7;
        d0 d0Var2;
        boolean z6;
        ArrayList arrayList = new ArrayList();
        if (aVar.B() == 6) {
            iVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        aVar.f();
        while (aVar.n()) {
            if (aVar.P(f21484a) != 0) {
                aVar.T();
            } else if (aVar.B() == 1) {
                aVar.c();
                if (aVar.B() == 7) {
                    w4.a aVar3 = aVar;
                    l4.i iVar3 = iVar;
                    float f10 = f2;
                    d0 d0Var3 = d0Var;
                    boolean z7 = z5;
                    y4.a aVarB = o.b(aVar3, iVar3, f10, d0Var3, false, z7);
                    aVar2 = aVar3;
                    iVar2 = iVar3;
                    f7 = f10;
                    d0Var2 = d0Var3;
                    z6 = z7;
                    arrayList.add(aVarB);
                } else {
                    aVar2 = aVar;
                    iVar2 = iVar;
                    f7 = f2;
                    d0Var2 = d0Var;
                    z6 = z5;
                    while (aVar2.n()) {
                        arrayList.add(o.b(aVar2, iVar2, f7, d0Var2, true, z6));
                    }
                }
                aVar2.g();
                aVar = aVar2;
                iVar = iVar2;
                f2 = f7;
                d0Var = d0Var2;
                z5 = z6;
            } else {
                w4.a aVar4 = aVar;
                arrayList.add(o.b(aVar4, iVar, f2, d0Var, false, z5));
                aVar = aVar4;
            }
        }
        aVar.i();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i7;
        Object obj;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            i7 = size - 1;
            if (i10 >= i7) {
                break;
            }
            y4.a aVar = (y4.a) arrayList.get(i10);
            i10++;
            y4.a aVar2 = (y4.a) arrayList.get(i10);
            aVar.f23200h = Float.valueOf(aVar2.f23199g);
            if (aVar.f23195c == null && (obj = aVar2.f23194b) != null) {
                aVar.f23195c = obj;
                if (aVar instanceof o4.l) {
                    ((o4.l) aVar).d();
                }
            }
        }
        y4.a aVar3 = (y4.a) arrayList.get(i7);
        if ((aVar3.f23194b == null || aVar3.f23195c == null) && arrayList.size() > 1) {
            arrayList.remove(aVar3);
        }
    }
}
