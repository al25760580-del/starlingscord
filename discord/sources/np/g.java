package np;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pp.e0;
import vo.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements jq.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cq.b f17002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final cq.b f17003e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ap.b f17004i;

    public g(ap.b kotlinClass, e0 packageProto, tp.f nameResolver, jq.k abiStability) {
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        Intrinsics.checkNotNullParameter(packageProto, "packageProto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(abiStability, "abiStability");
        cq.b className = new cq.b(cq.b.e(bp.c.a(kotlinClass.f2856a)));
        Intrinsics.checkNotNullExpressionValue(className, "byClassId(...)");
        gs.o oVar = kotlinClass.f2857b;
        cq.b bVarC = null;
        String str = ((op.a) oVar.f10247c) != op.a.MULTIFILE_CLASS_PART ? null : (String) oVar.f10252h;
        if (str != null && str.length() > 0) {
            bVarC = cq.b.c(str);
        }
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(packageProto, "packageProto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(abiStability, "abiStability");
        this.f17002d = className;
        this.f17003e = bVarC;
        this.f17004i = kotlinClass;
        vp.m packageModuleName = sp.k.f20493m;
        Intrinsics.checkNotNullExpressionValue(packageModuleName, "packageModuleName");
        Integer num = (Integer) m3.m.B(packageProto, packageModuleName);
        if (num != null) {
            nameResolver.getString(num.intValue());
        }
    }

    @Override // vo.n0
    public final void a() {
        o0 NO_SOURCE_FILE = o0.f21821e;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
    }

    public final up.b b() {
        up.c cVar;
        cq.b bVar = this.f17002d;
        String str = bVar.f7331a;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            cVar = up.c.f21261c;
            if (cVar == null) {
                cq.b.a(9);
                throw null;
            }
        } else {
            cVar = new up.c(str.substring(0, iLastIndexOf).replace('/', '.'));
        }
        Intrinsics.checkNotNullExpressionValue(cVar, "getPackageFqName(...)");
        String strD = bVar.d();
        Intrinsics.checkNotNullExpressionValue(strD, "getInternalName(...)");
        up.e eVarE = up.e.e(StringsKt.W('/', strD, strD));
        Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
        return new up.b(cVar, eVarE);
    }

    @Override // jq.l
    public final String d() {
        return s0.g.g(new StringBuilder("Class '"), b().a().f21262a.f21265a, '\'');
    }

    public final String toString() {
        return g.class.getSimpleName() + ": " + this.f17002d;
    }
}
