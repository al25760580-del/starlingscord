package net.time4j;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 implements xr.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f16619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f16620b;

    public c1(m mVar) {
        this.f16619a = mVar;
        this.f16620b = null;
    }

    @Override // xr.s
    public final Object a(xr.e eVar, long j) {
        v vVar;
        x0 x0Var;
        b1 b1Var;
        e1 e1Var = (e1) eVar;
        m mVar = this.f16619a;
        if (mVar != null) {
            x0Var = (x0) e1Var.f16629d.l(j, mVar);
            b1Var = e1Var.f16630e;
        } else {
            b1 b1Var2 = e1Var.f16630e;
            if (j == 0) {
                if (b1Var2.f16608d < 24) {
                    vVar = new v(0L, b1Var2);
                }
                x0 x0Var2 = (x0) e1Var.f16629d.l(vVar.a(), m.E);
                b1 b1VarB = vVar.b();
                x0Var = x0Var2;
                b1Var = b1VarB;
            } else {
                b1Var2.getClass();
            }
            vVar = (v) q0.b(v.class, this.f16620b, b1Var2, j);
            x0 x0Var3 = (x0) e1Var.f16629d.l(vVar.a(), m.E);
            b1 b1VarB2 = vVar.b();
            x0Var = x0Var3;
            b1Var = b1VarB2;
        }
        return new e1(x0Var, b1Var);
    }

    public c1(t tVar) {
        this.f16619a = null;
        this.f16620b = tVar;
    }
}
