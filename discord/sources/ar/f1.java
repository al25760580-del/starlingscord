package ar;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends d1 {
    public final Object E;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i1 f2911w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final g1 f2912x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o f2913y;

    public f1(i1 i1Var, g1 g1Var, o oVar, Object obj) {
        this.f2911w = i1Var;
        this.f2912x = g1Var;
        this.f2913y = oVar;
        this.E = obj;
    }

    @Override // ar.d1
    public final boolean j() {
        return false;
    }

    @Override // ar.d1
    public final void k(Throwable th2) {
        o oVar = this.f2913y;
        o oVarX = i1.X(oVar);
        i1 i1Var = this.f2911w;
        g1 g1Var = this.f2912x;
        Object obj = this.E;
        if (oVarX == null || !i1Var.k0(g1Var, oVarX, obj)) {
            g1Var.f2918d.b(new fr.j(2), 2);
            o oVarX2 = i1.X(oVar);
            if (oVarX2 == null || !i1Var.k0(g1Var, oVarX2, obj)) {
                i1Var.t(i1Var.H(g1Var, obj));
            }
        }
    }
}
