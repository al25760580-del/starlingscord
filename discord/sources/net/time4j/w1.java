package net.time4j;

/* JADX INFO: loaded from: classes3.dex */
public final class w1 implements xr.s {
    @Override // xr.s
    public final Object a(xr.e eVar, long j) {
        if (j == 0) {
            return eVar;
        }
        int iB = yk.a.B(yk.a.A(((Integer) eVar.d(x1.f16790e)).intValue(), j));
        u uVar = x0.J;
        x0 x0Var = (x0) eVar.d(uVar);
        x0Var.getClass();
        v1 v1Var = v1.G;
        int iIntValue = ((Integer) x0Var.d(v1Var.f16776w)).intValue();
        p1 p1VarW = x0Var.w();
        if (iIntValue == 53) {
            iIntValue = ((Integer) x0.A(iB, 26, p1VarW, true).g(v1Var.f16776w)).intValue();
        }
        return eVar.h(uVar, x0.A(iB, iIntValue, p1VarW, true));
    }
}
