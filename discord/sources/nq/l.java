package nq;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.collections.d1;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import lq.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f17061a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f17062b = e.f17030d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f17063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f17064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f17065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set f17066f;

    static {
        b[] bVarArr = b.f17028d;
        String str = String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        up.e eVarG = up.e.g(str);
        Intrinsics.checkNotNullExpressionValue(eVarG, "special(...)");
        f17063c = new a(eVarG);
        f17064d = c(k.CYCLIC_SUPERTYPES, new String[0]);
        f17065e = c(k.ERROR_PROPERTY_TYPE, new String[0]);
        f17066f = d1.b(new f());
    }

    public static final g a(h kind, boolean z5, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        if (!z5) {
            return new g(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
        }
        String[] formatParams2 = (String[]) Arrays.copyOf(formatParams, formatParams.length);
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams2, "formatParams");
        return new m(kind, (String[]) Arrays.copyOf(formatParams2, formatParams2.length));
    }

    public static final g b(h kind, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        return a(kind, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final i c(k kind, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        n0 arguments = n0.f14659d;
        String[] formatParams2 = (String[]) Arrays.copyOf(formatParams, formatParams.length);
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(formatParams2, "formatParams");
        return e(kind, arguments, d(kind, (String[]) Arrays.copyOf(formatParams2, formatParams2.length)), (String[]) Arrays.copyOf(formatParams2, formatParams2.length));
    }

    public static j d(k kind, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        return new j(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static i e(k kind, List arguments, q0 typeConstructor, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        return new i(typeConstructor, b(h.ERROR_TYPE_SCOPE, typeConstructor.toString()), kind, arguments, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final boolean f(vo.l lVar) {
        if (lVar != null) {
            return (lVar instanceof a) || (lVar.g() instanceof a) || lVar == f17062b;
        }
        return false;
    }
}
