package net.time4j;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes3.dex */
public final class d1 extends t1 {
    @Override // net.time4j.t1, xr.j
    public final /* bridge */ /* synthetic */ Object b(xr.e eVar, Object obj, boolean z5) {
        return g((e1) eVar, (BigDecimal) obj);
    }

    @Override // net.time4j.t1
    public final /* bridge */ /* synthetic */ e1 f(e1 e1Var, Object obj, boolean z5) {
        return g(e1Var, (BigDecimal) obj);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public final e1 g(e1 e1Var, BigDecimal bigDecimal) {
        boolean z5;
        if (bigDecimal == null) {
            z5 = false;
        } else {
            xr.d dVar = this.f16718e;
            BigDecimal bigDecimal2 = (BigDecimal) dVar.v();
            BigDecimal bigDecimal3 = (BigDecimal) dVar.a();
            if (bigDecimal2.compareTo(bigDecimal) > 0 || bigDecimal.compareTo(bigDecimal3) > 0) {
                z5 = false;
            } else {
                z5 = true;
            }
        }
        if (z5) {
            return new e1(e1Var.f16629d, (b1) e1Var.f16630e.h(this.f16718e, bigDecimal));
        }
        throw new IllegalArgumentException("Out of range: " + bigDecimal);
    }
}
