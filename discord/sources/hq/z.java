package hq;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pp.s0;
import vo.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c0 f11082e;

    public /* synthetic */ z(c0 c0Var, int i7) {
        this.f11081d = i7;
        this.f11082e = c0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f11081d) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                bc.k kVar = this.f11082e.f11001a;
                rp.f fVar = (rp.f) kVar.f3123i;
                j jVar = (j) kVar.f3122e;
                up.b bVarS = mo.c0.s(fVar, iIntValue);
                return bVarS.f21260c ? jVar.b(bVarS) : mo.c0.p(jVar.f11020b, bVarS);
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                bc.k kVar2 = this.f11082e.f11001a;
                up.b classId = mo.c0.s((rp.f) kVar2.f3123i, iIntValue2);
                if (!classId.f21260c) {
                    vo.z zVar = ((j) kVar2.f3122e).f11020b;
                    Intrinsics.checkNotNullParameter(zVar, "<this>");
                    Intrinsics.checkNotNullParameter(classId, "classId");
                    vo.i iVarP = mo.c0.p(zVar, classId);
                    if (iVarP instanceof q0) {
                        return (q0) iVarP;
                    }
                }
                return null;
            default:
                s0 it = (s0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return ls.d.t(it, (pf.b) this.f11082e.f11001a.f3125w);
        }
    }
}
