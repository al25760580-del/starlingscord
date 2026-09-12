package hq;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import pp.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f11059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11060e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i0 f11061i;

    public r(t tVar, boolean z5, i0 i0Var) {
        this.f11059d = tVar;
        this.f11060e = z5;
        this.f11061i = i0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List listI0;
        t tVar = this.f11059d;
        bc.k kVar = tVar.f11068a;
        vo.l lVar = (vo.l) kVar.f3124v;
        j jVar = (j) kVar.f3122e;
        a3.r rVarA = tVar.a(lVar);
        if (rVarA != null) {
            boolean z5 = this.f11060e;
            i0 i0Var = this.f11061i;
            listI0 = z5 ? CollectionsKt.i0(jVar.f11023e.s(rVarA, i0Var)) : CollectionsKt.i0(jVar.f11023e.t(rVarA, i0Var));
        } else {
            listI0 = null;
        }
        return listI0 == null ? n0.f14659d : listI0;
    }
}
