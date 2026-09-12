package to;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import lq.i0;
import lq.l0;
import so.p;
import vo.o0;
import vo.r0;
import vo.z;
import yo.b0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends lq.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f20854c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(cVar.f20855w);
        this.f20854c = cVar;
    }

    @Override // lq.i
    public final Collection b() {
        List<up.b> listG;
        Iterable iterableC;
        c cVar = this.f20854c;
        int i7 = cVar.E;
        k kVar = cVar.f20857y;
        g gVar = g.f20860c;
        if (Intrinsics.areEqual(kVar, gVar)) {
            listG = c0.c(c.I);
        } else if (Intrinsics.areEqual(kVar, h.f20861c)) {
            listG = d0.g(c.J, new up.b(p.f20402l, gVar.a(i7)));
        } else {
            j jVar = j.f20863c;
            if (Intrinsics.areEqual(kVar, jVar)) {
                listG = c0.c(c.I);
            } else {
                if (!Intrinsics.areEqual(kVar, i.f20862c)) {
                    int i10 = wq.a.f22476a;
                    Intrinsics.checkNotNullParameter("should not be called", "message");
                    throw new IllegalStateException("should not be called");
                }
                listG = d0.g(c.J, new up.b(p.f20398f, jVar.a(i7)));
            }
        }
        z zVarG = ((b0) cVar.f20856x).g();
        ArrayList arrayList = new ArrayList(e0.l(listG, 10));
        for (up.b bVar : listG) {
            vo.f fVarO = mo.c0.o(zVarG, bVar);
            if (fVarO == null) {
                throw new IllegalStateException(("Built-in class " + bVar + " not found").toString());
            }
            List list = cVar.H;
            int size = fVarO.n().getParameters().size();
            Intrinsics.checkNotNullParameter(list, "<this>");
            if (size < 0) {
                throw new IllegalArgumentException(s0.g.d(size, "Requested element count ", " is less than zero.").toString());
            }
            if (size == 0) {
                iterableC = n0.f14659d;
            } else {
                int size2 = list.size();
                if (size >= size2) {
                    iterableC = CollectionsKt.i0(list);
                } else if (size == 1) {
                    iterableC = c0.c(CollectionsKt.Q(list));
                } else {
                    ArrayList arrayList2 = new ArrayList(size);
                    if (list instanceof RandomAccess) {
                        for (int i11 = size2 - size; i11 < size2; i11++) {
                            arrayList2.add(list.get(i11));
                        }
                    } else {
                        ListIterator listIterator = list.listIterator(size2 - size);
                        while (listIterator.hasNext()) {
                            arrayList2.add(listIterator.next());
                        }
                    }
                    iterableC = arrayList2;
                }
            }
            ArrayList arrayList3 = new ArrayList(e0.l(iterableC, 10));
            Iterator it = iterableC.iterator();
            while (it.hasNext()) {
                arrayList3.add(new i0(((r0) it.next()).j()));
            }
            l0.f15225e.getClass();
            arrayList.add(lq.c.s(l0.f15226i, fVarO, arrayList3));
        }
        return CollectionsKt.i0(arrayList);
    }

    @Override // lq.i
    public final o0 e() {
        return o0.f21822i;
    }

    @Override // lq.b, lq.q0
    public final vo.i g() {
        return this.f20854c;
    }

    @Override // lq.q0
    public final List getParameters() {
        return this.f20854c.H;
    }

    @Override // lq.q0
    public final boolean i() {
        return true;
    }

    @Override // lq.b
    /* JADX INFO: renamed from: o */
    public final vo.f g() {
        return this.f20854c;
    }

    public final String toString() {
        return this.f20854c.toString();
    }
}
