package hq;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pp.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f11052e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i0 f11053i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final jq.t f11054v;

    public /* synthetic */ p(t tVar, i0 i0Var, jq.t tVar2, int i7) {
        this.f11051d = i7;
        this.f11052e = tVar;
        this.f11053i = i0Var;
        this.f11054v = tVar2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11051d) {
            case 0:
                t tVar = this.f11052e;
                kq.l lVar = ((j) tVar.f11068a.f3122e).f11019a;
                p pVar = new p(tVar, this.f11053i, this.f11054v, 2);
                lVar.getClass();
                return new kq.h(lVar, pVar);
            case 1:
                t tVar2 = this.f11052e;
                kq.l lVar2 = ((j) tVar2.f11068a.f3122e).f11019a;
                p pVar2 = new p(tVar2, this.f11053i, this.f11054v, 3);
                lVar2.getClass();
                return new kq.h(lVar2, pVar2);
            case 2:
                t tVar3 = this.f11052e;
                a3.r rVarA = tVar3.a((vo.l) tVar3.f11068a.f3124v);
                Intrinsics.checkNotNull(rVarA);
                b bVar = ((j) tVar3.f11068a.f3122e).f11023e;
                lq.z returnType = this.f11054v.getReturnType();
                Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
                return (zp.g) bVar.n(rVarA, this.f11053i, returnType);
            default:
                t tVar4 = this.f11052e;
                a3.r rVarA2 = tVar4.a((vo.l) tVar4.f11068a.f3124v);
                Intrinsics.checkNotNull(rVarA2);
                b bVar2 = ((j) tVar4.f11068a.f3122e).f11023e;
                lq.z returnType2 = this.f11054v.getReturnType();
                Intrinsics.checkNotNullExpressionValue(returnType2, "getReturnType(...)");
                return (zp.g) bVar2.q(rVarA2, this.f11053i, returnType2);
        }
    }
}
