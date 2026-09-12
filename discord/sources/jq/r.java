package jq;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.h0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import vo.q0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r extends eq.p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f14054f = {kk.b.p(r.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0), kk.b.p(r.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bc.k f14055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f14056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kq.i f14057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kq.h f14058e;

    public r(bc.k c8, List functionList, List propertyList, List typeAliasList, Function0 classNames) {
        Intrinsics.checkNotNullParameter(c8, "c");
        Intrinsics.checkNotNullParameter(functionList, "functionList");
        Intrinsics.checkNotNullParameter(propertyList, "propertyList");
        Intrinsics.checkNotNullParameter(typeAliasList, "typeAliasList");
        Intrinsics.checkNotNullParameter(classNames, "classNames");
        this.f14055b = c8;
        ((hq.j) c8.f3122e).f11021c.getClass();
        this.f14056c = new q(this, functionList, propertyList, typeAliasList);
        hq.j jVar = (hq.j) c8.f3122e;
        kq.l lVar = jVar.f11019a;
        eq.j jVar2 = new eq.j(1, classNames);
        lVar.getClass();
        this.f14057d = new kq.i(lVar, jVar2);
        kq.l lVar2 = jVar.f11019a;
        ep.x xVar = new ep.x(9, this);
        lVar2.getClass();
        this.f14058e = new kq.h(lVar2, xVar);
    }

    @Override // eq.p, eq.o
    public Collection a(up.e name, dp.c location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return this.f14056c.b(name, location);
    }

    @Override // eq.p, eq.o
    public final Set b() {
        return (Set) io.sentry.config.a.H(this.f14056c.f14051g, q.j[0]);
    }

    @Override // eq.p, eq.o
    public Collection c(up.e name, dp.a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return this.f14056c.a(name, location);
    }

    @Override // eq.p, eq.o
    public final Set e() {
        KProperty p3 = f14054f[1];
        kq.h hVar = this.f14058e;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(p3, "p");
        return (Set) hVar.invoke();
    }

    @Override // eq.p, eq.o
    public final Set f() {
        return (Set) io.sentry.config.a.H(this.f14056c.f14052h, q.j[1]);
    }

    @Override // eq.p, eq.q
    public vo.i g(up.e name, dp.a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        if (q(name)) {
            return ((hq.j) this.f14055b.f3122e).b(l(name));
        }
        q qVar = this.f14056c;
        if (!qVar.f14047c.keySet().contains(name)) {
            return null;
        }
        qVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        return (q0) qVar.f14050f.invoke(name);
    }

    public abstract void h(ArrayList arrayList, Function1 function1);

    public final List i(eq.f kindFilter, Function1 nameFilter) {
        dp.c location = dp.c.f7696v;
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        Intrinsics.checkNotNullParameter(location, "location");
        ArrayList result = new ArrayList(0);
        if (kindFilter.a(eq.f.f8618f)) {
            h(result, nameFilter);
        }
        q qVar = this.f14056c;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        Intrinsics.checkNotNullParameter(location, "location");
        boolean zA = kindFilter.a(eq.f.j);
        xp.h INSTANCE = xp.h.f23001e;
        if (zA) {
            Set<up.e> set = (Set) io.sentry.config.a.H(qVar.f14052h, q.j[1]);
            ArrayList arrayList = new ArrayList();
            for (up.e eVar : set) {
                if (((Boolean) nameFilter.invoke(eVar)).booleanValue()) {
                    arrayList.addAll(qVar.b(eVar, location));
                }
            }
            Intrinsics.checkNotNullExpressionValue(INSTANCE, "INSTANCE");
            h0.n(arrayList, INSTANCE);
            result.addAll(arrayList);
        }
        if (kindFilter.a(eq.f.f8621i)) {
            Set<up.e> set2 = (Set) io.sentry.config.a.H(qVar.f14051g, q.j[0]);
            ArrayList arrayList2 = new ArrayList();
            for (up.e eVar2 : set2) {
                if (((Boolean) nameFilter.invoke(eVar2)).booleanValue()) {
                    arrayList2.addAll(qVar.a(eVar2, location));
                }
            }
            Intrinsics.checkNotNullExpressionValue(INSTANCE, "INSTANCE");
            h0.n(arrayList2, INSTANCE);
            result.addAll(arrayList2);
        }
        if (kindFilter.a(eq.f.f8622l)) {
            for (up.e eVar3 : m()) {
                if (((Boolean) nameFilter.invoke(eVar3)).booleanValue()) {
                    vq.m.b(result, ((hq.j) this.f14055b.f3122e).b(l(eVar3)));
                }
            }
        }
        if (kindFilter.a(eq.f.f8619g)) {
            for (Object name : qVar.f14047c.keySet()) {
                if (((Boolean) nameFilter.invoke(name)).booleanValue()) {
                    qVar.getClass();
                    Intrinsics.checkNotNullParameter(name, "name");
                    vq.m.b(result, (q0) qVar.f14050f.invoke(name));
                }
            }
        }
        return vq.m.e(result);
    }

    public void j(ArrayList functions, up.e name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(functions, "functions");
    }

    public void k(ArrayList descriptors, up.e name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
    }

    public abstract up.b l(up.e eVar);

    public final Set m() {
        return (Set) io.sentry.config.a.H(this.f14057d, f14054f[0]);
    }

    public abstract Set n();

    public abstract Set o();

    public abstract Set p();

    public boolean q(up.e name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return m().contains(name);
    }

    public boolean r(u function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return true;
    }
}
