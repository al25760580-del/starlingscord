package ip;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.i0;
import kotlin.collections.n0;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements eq.o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f13330f = {kk.b.p(d.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4.i f13331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f13332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f13333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kq.i f13334e;

    public d(e4.i c8, bp.y jPackage, r packageFragment) {
        Intrinsics.checkNotNullParameter(c8, "c");
        Intrinsics.checkNotNullParameter(jPackage, "jPackage");
        Intrinsics.checkNotNullParameter(packageFragment, "packageFragment");
        this.f13331b = c8;
        this.f13332c = packageFragment;
        this.f13333d = new w(c8, jPackage, packageFragment);
        kq.o oVar = ((hp.a) c8.f7980e).f10957a;
        ep.x xVar = new ep.x(7, this);
        kq.l lVar = (kq.l) oVar;
        lVar.getClass();
        this.f13334e = new kq.i(lVar, xVar);
    }

    @Override // eq.o
    public final Collection a(up.e name, dp.c location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        i(name, location);
        eq.o[] oVarArrH = h();
        Collection collectionA = this.f13333d.a(name, location);
        for (eq.o oVar : oVarArrH) {
            collectionA = android.support.v4.media.session.b.d(collectionA, oVar.a(name, location));
        }
        return collectionA == null ? p0.f14661d : collectionA;
    }

    @Override // eq.o
    public final Set b() {
        eq.o[] oVarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (eq.o oVar : oVarArrH) {
            i0.o(linkedHashSet, oVar.b());
        }
        linkedHashSet.addAll(this.f13333d.b());
        return linkedHashSet;
    }

    @Override // eq.o
    public final Collection c(up.e name, dp.a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        i(name, location);
        eq.o[] oVarArrH = h();
        Collection collectionC = this.f13333d.c(name, location);
        for (eq.o oVar : oVarArrH) {
            collectionC = android.support.v4.media.session.b.d(collectionC, oVar.c(name, location));
        }
        return collectionC == null ? p0.f14661d : collectionC;
    }

    @Override // eq.q
    public final Collection d(eq.f kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        eq.o[] oVarArrH = h();
        Collection collectionD = this.f13333d.d(kindFilter, nameFilter);
        for (eq.o oVar : oVarArrH) {
            collectionD = android.support.v4.media.session.b.d(collectionD, oVar.d(kindFilter, nameFilter));
        }
        return collectionD == null ? p0.f14661d : collectionD;
    }

    @Override // eq.o
    public final Set e() {
        eq.o[] oVarArrH = h();
        Intrinsics.checkNotNullParameter(oVarArrH, "<this>");
        HashSet hashSetR = mo.c0.r(oVarArrH.length == 0 ? n0.f14659d : new kotlin.collections.x(0, oVarArrH));
        if (hashSetR == null) {
            return null;
        }
        hashSetR.addAll(this.f13333d.e());
        return hashSetR;
    }

    @Override // eq.o
    public final Set f() {
        eq.o[] oVarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (eq.o oVar : oVarArrH) {
            i0.o(linkedHashSet, oVar.f());
        }
        linkedHashSet.addAll(this.f13333d.f());
        return linkedHashSet;
    }

    @Override // eq.q
    public final vo.i g(up.e name, dp.a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        i(name, location);
        w wVar = this.f13333d;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        vo.i iVar = null;
        vo.f fVarV = wVar.v(name, null);
        if (fVarV != null) {
            return fVarV;
        }
        for (eq.o oVar : h()) {
            vo.i iVarG = oVar.g(name, location);
            if (iVarG != null) {
                if (!(iVarG instanceof vo.j) || !((vo.x) iVarG).y()) {
                    return iVarG;
                }
                if (iVar == null) {
                    iVar = iVarG;
                }
            }
        }
        return iVar;
    }

    public final eq.o[] h() {
        return (eq.o[]) io.sentry.config.a.H(this.f13334e, f13330f[0]);
    }

    public final void i(up.e name, dp.a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        m3.m.R(((hp.a) this.f13331b.f7980e).f10968n, location, this.f13332c, name);
    }

    public final String toString() {
        return "scope for " + this.f13332c;
    }
}
