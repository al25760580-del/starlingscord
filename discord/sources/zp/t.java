package zp;

import kotlin.jvm.internal.Intrinsics;
import lq.d0;
import lq.d1;
import lq.e1;
import lq.i0;
import lq.l0;
import mo.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends g {
    public t(f value) {
        Intrinsics.checkNotNullParameter(value, "value");
        r value2 = new r(value);
        Intrinsics.checkNotNullParameter(value2, "value");
        super(value2);
    }

    @Override // zp.g
    public final lq.z a(vo.z module) {
        lq.z zVarC;
        Intrinsics.checkNotNullParameter(module, "module");
        l0.f15225e.getClass();
        l0 l0Var = l0.f15226i;
        so.i iVarF = module.f();
        iVarF.getClass();
        vo.f fVarJ = iVarF.j(so.o.Q.g());
        Intrinsics.checkNotNullExpressionValue(fVarJ, "getKClass(...)");
        Intrinsics.checkNotNullParameter(module, "module");
        Object obj = this.f24066a;
        s sVar = (s) obj;
        if (sVar instanceof q) {
            zVarC = ((q) obj).f24074a;
        } else {
            if (!(sVar instanceof r)) {
                throw new rn.n();
            }
            f fVar = ((r) obj).f24075a;
            up.b bVar = fVar.f24064a;
            int i7 = fVar.f24065b;
            vo.f fVarO = c0.o(module, bVar);
            if (fVarO == null) {
                zVarC = nq.l.c(nq.k.UNRESOLVED_KCLASS_CONSTANT_VALUE, bVar.toString(), String.valueOf(i7));
            } else {
                d0 d0VarJ = fVarO.j();
                Intrinsics.checkNotNullExpressionValue(d0VarJ, "getDefaultType(...)");
                d1 d1VarG = c9.a.G(d0VarJ);
                for (int i10 = 0; i10 < i7; i10++) {
                    so.i iVarF2 = module.f();
                    e1 e1Var = e1.INVARIANT;
                    d1VarG = iVarF2.h(d1VarG);
                    Intrinsics.checkNotNullExpressionValue(d1VarG, "getArrayType(...)");
                }
                zVarC = d1VarG;
            }
        }
        return lq.c.s(l0Var, fVarJ, kotlin.collections.c0.c(new i0(zVarC)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(up.b classId, int i7) {
        this(new f(classId, i7));
        Intrinsics.checkNotNullParameter(classId, "classId");
    }
}
