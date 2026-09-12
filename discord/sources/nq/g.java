package nq;

import eq.o;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.d1;
import kotlin.collections.n0;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vo.p;
import vo.y;

/* JADX INFO: loaded from: classes3.dex */
public class g implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17035b;

    public g(h kind, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        String str = kind.f17042d;
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        this.f17035b = str2;
    }

    @Override // eq.o
    public Set b() {
        return p0.f14661d;
    }

    @Override // eq.q
    public Collection d(eq.f kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return n0.f14659d;
    }

    @Override // eq.o
    public Set e() {
        return p0.f14661d;
    }

    @Override // eq.o
    public Set f() {
        return p0.f14661d;
    }

    @Override // eq.q
    public vo.i g(up.e name, dp.a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        b[] bVarArr = b.f17028d;
        String str = String.format("<Error class: %s>", Arrays.copyOf(new Object[]{name}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        up.e eVarG = up.e.g(str);
        Intrinsics.checkNotNullExpressionValue(eVarG, "special(...)");
        return new a(eVarG);
    }

    @Override // eq.o
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set c(up.e name, dp.c location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        a containingDeclaration = l.f17063c;
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        b[] bVarArr = b.f17028d;
        c cVar = new c(containingDeclaration, null, wo.g.f22379a, up.e.g("<Error function>"), vo.c.f21792d, vo.n0.C);
        n0 n0Var = n0.f14659d;
        cVar.G0(null, null, n0Var, n0Var, n0Var, l.c(k.RETURN_TYPE_FOR_FUNCTION, new String[0]), y.f21854v, p.f21828e);
        return d1.b(cVar);
    }

    @Override // eq.o
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set a(up.e name, dp.c location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return l.f17066f;
    }

    public String toString() {
        return s0.g.g(new StringBuilder("ErrorScope{"), this.f17035b, '}');
    }
}
