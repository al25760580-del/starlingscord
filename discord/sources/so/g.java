package so;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lq.d0;
import lq.e1;
import yo.v;
import yo.z;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f20339e;

    public /* synthetic */ g(i iVar, int i7) {
        this.f20338d = i7;
        this.f20339e = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i7 = this.f20338d;
        i iVar = this.f20339e;
        switch (i7) {
            case 0:
                up.e eVar = (up.e) obj;
                z zVarL = iVar.l();
                up.c cVar = p.f20402l;
                eq.k kVar = ((v) zVarL.O(cVar)).E;
                if (kVar == null) {
                    i.a(11);
                    throw null;
                }
                vo.i iVarG = kVar.g(eVar, dp.c.f7693d);
                if (iVarG == null) {
                    throw new AssertionError("Built-in class " + cVar.a(eVar) + " is not found");
                }
                if (iVarG instanceof vo.f) {
                    return (vo.f) iVarG;
                }
                throw new AssertionError("Must be a class descriptor " + eVar + ", but was " + iVarG);
            default:
                vo.z module = (vo.z) obj;
                Intrinsics.checkNotNullParameter(module, "module");
                i iVarF = module.f();
                e1 e1Var = e1.INVARIANT;
                d0 d0VarH = iVarF.h(iVar.v());
                Intrinsics.checkNotNullExpressionValue(d0VarH, "getArrayType(...)");
                return d0VarH;
        }
    }
}
