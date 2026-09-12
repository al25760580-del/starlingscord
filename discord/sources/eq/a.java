package eq;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.i0;
import kotlin.collections.n0;
import kotlin.collections.p0;
import kotlin.collections.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mo.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o[] f8609c;

    public a(String str, o[] oVarArr) {
        this.f8608b = str;
        this.f8609c = oVarArr;
    }

    @Override // eq.o
    public final Collection a(up.e name, dp.c location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        o[] oVarArr = this.f8609c;
        int length = oVarArr.length;
        if (length == 0) {
            return n0.f14659d;
        }
        if (length == 1) {
            return oVarArr[0].a(name, location);
        }
        Collection collectionD = null;
        for (o oVar : oVarArr) {
            collectionD = android.support.v4.media.session.b.d(collectionD, oVar.a(name, location));
        }
        return collectionD == null ? p0.f14661d : collectionD;
    }

    @Override // eq.o
    public final Set b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (o oVar : this.f8609c) {
            i0.o(linkedHashSet, oVar.b());
        }
        return linkedHashSet;
    }

    @Override // eq.o
    public final Collection c(up.e name, dp.a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        o[] oVarArr = this.f8609c;
        int length = oVarArr.length;
        if (length == 0) {
            return n0.f14659d;
        }
        if (length == 1) {
            return oVarArr[0].c(name, location);
        }
        Collection collectionD = null;
        for (o oVar : oVarArr) {
            collectionD = android.support.v4.media.session.b.d(collectionD, oVar.c(name, location));
        }
        return collectionD == null ? p0.f14661d : collectionD;
    }

    @Override // eq.q
    public final Collection d(f kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        o[] oVarArr = this.f8609c;
        int length = oVarArr.length;
        if (length == 0) {
            return n0.f14659d;
        }
        if (length == 1) {
            return oVarArr[0].d(kindFilter, nameFilter);
        }
        Collection collectionD = null;
        for (o oVar : oVarArr) {
            collectionD = android.support.v4.media.session.b.d(collectionD, oVar.d(kindFilter, nameFilter));
        }
        return collectionD == null ? p0.f14661d : collectionD;
    }

    @Override // eq.o
    public final Set e() {
        o[] oVarArr = this.f8609c;
        Intrinsics.checkNotNullParameter(oVarArr, "<this>");
        return c0.r(oVarArr.length == 0 ? n0.f14659d : new x(0, oVarArr));
    }

    @Override // eq.o
    public final Set f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (o oVar : this.f8609c) {
            i0.o(linkedHashSet, oVar.f());
        }
        return linkedHashSet;
    }

    @Override // eq.q
    public final vo.i g(up.e name, dp.a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        vo.i iVar = null;
        for (o oVar : this.f8609c) {
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

    public final String toString() {
        return this.f8608b;
    }
}
