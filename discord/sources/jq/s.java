package jq;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pp.f1;
import pp.y0;
import vo.e0;
import yo.b0;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e0 f14059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f14060h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final up.c f14061i;

    public s(e0 packageDescriptor, pp.e0 proto, rp.f nameResolver, rp.a metadataVersion, np.g gVar, hq.j components, String debugName, Function0 classNames) {
        Intrinsics.checkNotNullParameter(packageDescriptor, "packageDescriptor");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(debugName, "debugName");
        Intrinsics.checkNotNullParameter(classNames, "classNames");
        y0 y0Var = proto.f18264y;
        Intrinsics.checkNotNullExpressionValue(y0Var, "getTypeTable(...)");
        pf.b bVar = new pf.b(y0Var);
        rp.g gVar2 = rp.g.f19539b;
        f1 f1Var = proto.E;
        Intrinsics.checkNotNullExpressionValue(f1Var, "getVersionRequirementTable(...)");
        bc.k kVarA = components.a(packageDescriptor, nameResolver, bVar, ls.l.n(f1Var), metadataVersion, gVar);
        List list = proto.f18261v;
        Intrinsics.checkNotNullExpressionValue(list, "getFunctionList(...)");
        List list2 = proto.f18262w;
        Intrinsics.checkNotNullExpressionValue(list2, "getPropertyList(...)");
        List list3 = proto.f18263x;
        Intrinsics.checkNotNullExpressionValue(list3, "getTypeAliasList(...)");
        super(kVarA, list, list2, list3, classNames);
        this.f14059g = packageDescriptor;
        this.f14060h = debugName;
        this.f14061i = ((b0) packageDescriptor).f23420x;
    }

    @Override // eq.p, eq.q
    public final Collection d(eq.f kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        dp.c cVar = dp.c.f7693d;
        List listI = i(kindFilter, nameFilter);
        Iterable iterable = ((hq.j) this.f14055b.f3122e).k;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            i0.o(arrayList, ((xo.c) it.next()).b(this.f14061i));
        }
        return CollectionsKt.V(listI, arrayList);
    }

    @Override // jq.r, eq.p, eq.q
    public final vo.i g(up.e name, dp.a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        m3.m.R(((hq.j) this.f14055b.f3122e).f11027i, location, this.f14059g, name);
        return super.g(name, location);
    }

    @Override // jq.r
    public final void h(ArrayList result, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
    }

    @Override // jq.r
    public final up.b l(up.e name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new up.b(this.f14061i, name);
    }

    @Override // jq.r
    public final Set n() {
        return p0.f14661d;
    }

    @Override // jq.r
    public final Set o() {
        return p0.f14661d;
    }

    @Override // jq.r
    public final Set p() {
        return p0.f14661d;
    }

    @Override // jq.r
    public final boolean q(up.e name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (super.q(name)) {
            return true;
        }
        Iterable iterable = ((hq.j) this.f14055b.f3122e).k;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((xo.c) it.next()).c(this.f14061i, name)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.f14060h;
    }
}
