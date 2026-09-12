package hp;

import bp.y;
import e4.i;
import ip.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.c0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kq.l;
import rn.g;
import vo.h0;
import vq.m;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f10985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kq.e f10986b;

    public d(a components) {
        Intrinsics.checkNotNullParameter(components, "components");
        this.f10985a = new i(components, b.f10980e, new g());
        l lVar = (l) components.f10957a;
        lVar.getClass();
        this.f10986b = new kq.e(lVar, new ConcurrentHashMap(3, 1.0f, 2), new kq.f(), 0);
    }

    @Override // vo.h0
    public final boolean a(up.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        ((a) this.f10985a.f7980e).f10958b.getClass();
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return false;
    }

    @Override // vo.h0
    public final void b(up.c fqName, ArrayList packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        m.b(packageFragments, d(fqName));
    }

    @Override // vo.h0
    public final List c(up.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return c0.c(d(fqName));
    }

    public final r d(up.c fqName) throws Throwable {
        ((a) this.f10985a.f7980e).f10958b.getClass();
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        fp.b bVar = new fp.b(3, this, new y(fqName));
        kq.e eVar = this.f10986b;
        eVar.getClass();
        Object objInvoke = eVar.invoke(new kq.g(fqName, bVar));
        if (objInvoke != null) {
            return (r) objInvoke;
        }
        kq.e.a(3);
        throw null;
    }

    @Override // vo.h0
    public final Collection k(up.c fqName, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        List list = (List) d(fqName).I.invoke();
        return list == null ? n0.f14659d : list;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((a) this.f10985a.f7980e).f10969o;
    }
}
