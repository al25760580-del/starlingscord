package uo;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements vq.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f21209d = new e();

    public static vo.f a(vo.f readOnly) {
        Intrinsics.checkNotNullParameter(readOnly, "readOnly");
        up.d dVarG = xp.e.g(readOnly);
        String str = d.f21197a;
        up.c cVar = (up.c) d.k.get(dVarG);
        if (cVar != null) {
            vo.f fVarJ = bq.e.e(readOnly).j(cVar);
            Intrinsics.checkNotNullExpressionValue(fVarJ, "getBuiltInClassByFqName(...)");
            return fVarJ;
        }
        throw new IllegalArgumentException("Given class " + readOnly + " is not a read-only collection");
    }

    public static vo.f c(up.c fqName, so.i builtIns) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        String str = d.f21197a;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        up.b bVar = (up.b) d.f21204h.get(fqName.f21262a);
        if (bVar != null) {
            return builtIns.j(bVar.a());
        }
        return null;
    }

    @Override // vq.b
    public Iterable b(Object obj) {
        KProperty[] kPropertyArr = o.f21235h;
        return ((vo.d) obj).a().h();
    }
}
