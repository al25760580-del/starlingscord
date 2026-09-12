package ep;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import yo.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements xp.f {
    @Override // xp.f
    public final int a() {
        return 2;
    }

    @Override // xp.f
    public final int b(vo.b superDescriptor, vo.b subDescriptor, vo.f fVar) {
        Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
        Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
        if (!(subDescriptor instanceof gp.e)) {
            return 3;
        }
        gp.e eVar = (gp.e) subDescriptor;
        List typeParameters = eVar.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        if (!typeParameters.isEmpty()) {
            return 3;
        }
        xp.k kVarI = xp.l.i(superDescriptor, subDescriptor);
        if ((kVarI != null ? kVarI.b() : null) != null) {
            return 3;
        }
        List listL = eVar.L();
        Intrinsics.checkNotNullExpressionValue(listL, "getValueParameters(...)");
        xq.s sVarN = xq.r.n(CollectionsKt.C(listL), d.f8526w);
        lq.z zVar = eVar.E;
        Intrinsics.checkNotNull(zVar);
        xq.h hVarP = xq.r.p(sVarN, zVar);
        yo.t tVar = eVar.G;
        List elements = kotlin.collections.d0.h(tVar != null ? tVar.getType() : null);
        Intrinsics.checkNotNullParameter(hVarP, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Sequence[] elements2 = {hVarP, CollectionsKt.C(elements)};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        Sequence sequenceO = kotlin.collections.y.o(elements2);
        Intrinsics.checkNotNullParameter(sequenceO, "<this>");
        xq.d dVar = new xq.d(xq.n.b(sequenceO, new n6.e(18)));
        while (dVar.hasNext()) {
            lq.z zVar2 = (lq.z) dVar.next();
            if (!zVar2.l0().isEmpty() && !(zVar2.w0() instanceof jp.i)) {
                return 3;
            }
        }
        vo.b bVarBuild = (vo.b) superDescriptor.b(new jp.g().c());
        if (bVarBuild == null) {
            return 3;
        }
        if (bVarBuild instanceof k0) {
            k0 k0Var = (k0) bVarBuild;
            List typeParameters2 = k0Var.getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters2, "getTypeParameters(...)");
            if (!typeParameters2.isEmpty()) {
                bVarBuild = k0Var.m0().b(n0.f14659d).build();
                Intrinsics.checkNotNull(bVarBuild);
            }
        }
        xp.j jVarB = xp.l.f23012c.n(bVarBuild, subDescriptor, false).b();
        Intrinsics.checkNotNullExpressionValue(jVarB, "getResult(...)");
        return h.f8550a[jVarB.ordinal()] == 1 ? 1 : 3;
    }
}
