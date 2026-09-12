package ip;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.m0;
import kotlin.collections.n0;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends f0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final bp.y f13389n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r f13390o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kq.h f13391p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kq.j f13392q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(e4.i c8, bp.y jPackage, r ownerDescriptor) {
        super(c8);
        Intrinsics.checkNotNullParameter(c8, "c");
        Intrinsics.checkNotNullParameter(jPackage, "jPackage");
        Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
        this.f13389n = jPackage;
        this.f13390o = ownerDescriptor;
        kq.o oVar = ((hp.a) c8.f7980e).f10957a;
        fp.b bVar = new fp.b(5, c8, this);
        kq.l lVar = (kq.l) oVar;
        lVar.getClass();
        this.f13391p = new kq.h(lVar, bVar);
        this.f13392q = ((kq.l) oVar).d(new m(2, this, c8));
    }

    @Override // ip.b0, eq.p, eq.o
    public final Collection a(up.e name, dp.c location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return n0.f14659d;
    }

    @Override // ip.b0, eq.p, eq.q
    public final Collection d(eq.f kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        if (!kindFilter.a(eq.f.f8622l | eq.f.f8617e)) {
            return n0.f14659d;
        }
        Iterable iterable = (Iterable) this.f13322d.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            vo.l lVar = (vo.l) obj;
            if (lVar instanceof vo.f) {
                up.e name = ((vo.f) lVar).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (((Boolean) nameFilter.invoke(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // eq.p, eq.q
    public final vo.i g(up.e name, dp.a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return v(name, null);
    }

    @Override // ip.b0
    public final Set h(eq.f kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        if (!kindFilter.a(eq.f.f8617e)) {
            return p0.f14661d;
        }
        Set set = (Set) this.f13391p.invoke();
        if (set != null) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(up.e.e((String) it.next()));
            }
            return hashSet;
        }
        if (nameFilter == null) {
            nameFilter = vq.c.f21938d;
        }
        this.f13389n.getClass();
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        n0 n0Var = n0.f14659d;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        n0Var.getClass();
        m0.f14658d.getClass();
        return linkedHashSet;
    }

    @Override // ip.b0
    public final Set i(eq.f kindFilter, eq.l lVar) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return p0.f14661d;
    }

    @Override // ip.b0
    public final c k() {
        return b.f13318a;
    }

    @Override // ip.b0
    public final void m(LinkedHashSet result, up.e name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @Override // ip.b0
    public final Set o(eq.f kindFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return p0.f14661d;
    }

    @Override // ip.b0
    public final vo.l q() {
        return this.f13390o;
    }

    public final vo.f v(up.e name, bp.o oVar) {
        up.e eVar = up.g.f21273a;
        Intrinsics.checkNotNullParameter(name, "name");
        String strB = name.b();
        Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
        if (strB.length() <= 0 || name.f21270e) {
            return null;
        }
        Set set = (Set) this.f13391p.invoke();
        if (oVar == null && set != null && !set.contains(name.b())) {
            return null;
        }
        return (vo.f) this.f13392q.invoke(new s(name, oVar));
    }
}
