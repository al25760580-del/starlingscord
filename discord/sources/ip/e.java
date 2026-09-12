package ip;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f13339e;

    public /* synthetic */ e(f fVar, int i7) {
        this.f13338d = i7;
        this.f13339e = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IllegalAccessException, InvocationTargetException {
        switch (this.f13338d) {
            case 0:
                return bp.c.a(gn.h.B(gn.h.z(this.f13339e.f13345b.f3344a))).a();
            case 1:
                f fVar = this.f13339e;
                up.c topLevelFqName = fVar.a();
                bp.d dVar = fVar.f13345b;
                e4.i iVar = fVar.f13344a;
                if (topLevelFqName == null) {
                    return nq.l.c(nq.k.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, dVar.toString());
                }
                hp.a aVar = (hp.a) iVar.f7980e;
                vo.z zVar = aVar.f10969o;
                vo.f fVarC = uo.e.c(topLevelFqName, zVar.f());
                if (fVarC == null) {
                    bp.o javaClass = new bp.o(gn.h.B(gn.h.z(dVar.f3344a)));
                    u4.b bVar = aVar.k;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(javaClass, "javaClass");
                    u4.c cVar = (u4.c) bVar.f20945e;
                    if (cVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("resolver");
                        cVar = null;
                    }
                    fVarC = cVar.y(javaClass);
                    if (fVarC == null) {
                        Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
                        fVarC = mo.c0.q(zVar, new up.b(topLevelFqName.b(), topLevelFqName.f21262a.f()), aVar.f10960d.c().f11028l);
                    }
                }
                return fVarC.j();
            default:
                f fVar2 = this.f13339e;
                ArrayList<lp.a> arrayListB = fVar2.f13345b.b();
                ArrayList arrayList = new ArrayList();
                for (lp.a aVar2 : arrayListB) {
                    up.e eVar = ((bp.e) aVar2).f3349a;
                    if (eVar == null) {
                        eVar = ep.a0.f8489b;
                    }
                    zp.g gVarC = fVar2.c(aVar2);
                    Pair pair = gVarC != null ? new Pair(eVar, gVarC) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return w0.l(arrayList);
        }
    }
}
