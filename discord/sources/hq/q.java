package hq;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f11056e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final vp.a f11057i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a f11058v;

    public /* synthetic */ q(t tVar, vp.a aVar, a aVar2, int i7) {
        this.f11055d = i7;
        this.f11056e = tVar;
        this.f11057i = aVar;
        this.f11058v = aVar2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11055d) {
            case 0:
                t tVar = this.f11056e;
                bc.k kVar = tVar.f11068a;
                a3.r rVarA = tVar.a((vo.l) kVar.f3124v);
                List listI0 = rVarA != null ? CollectionsKt.i0(((j) kVar.f3122e).f11023e.e(rVarA, this.f11057i, this.f11058v)) : null;
                return listI0 == null ? n0.f14659d : listI0;
            default:
                t tVar2 = this.f11056e;
                bc.k kVar2 = tVar2.f11068a;
                a3.r rVarA2 = tVar2.a((vo.l) kVar2.f3124v);
                List listH = rVarA2 != null ? ((j) kVar2.f3122e).f11023e.h(rVarA2, this.f11057i, this.f11058v) : null;
                return listH == null ? n0.f14659d : listH;
        }
    }
}
