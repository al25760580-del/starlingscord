package i0;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l extends b0 {
    @Override // i0.b0
    public final void C() {
        x xVar = this.E.E.f11326m.j;
        Intrinsics.checkNotNull(xVar);
        u uVar = xVar.K.f11340a;
        if (!xVar.E) {
            xVar.s();
        }
        xVar.j();
    }

    @Override // g0.m
    public final int a(int i7) {
        e4.c cVar = this.E.E.f11321f;
        g0.n nVarN = cVar.N();
        u uVar = (u) cVar.f7966e;
        return nVarN.maxIntrinsicHeight(uVar.f11325l.f11288c, uVar.b(), i7);
    }

    @Override // g0.m
    public final int e(int i7) {
        e4.c cVar = this.E.E.f11321f;
        g0.n nVarN = cVar.N();
        u uVar = (u) cVar.f7966e;
        return nVarN.minIntrinsicWidth(uVar.f11325l.f11288c, uVar.b(), i7);
    }

    @Override // g0.m
    public final int f(int i7) {
        e4.c cVar = this.E.E.f11321f;
        g0.n nVarN = cVar.N();
        u uVar = (u) cVar.f7966e;
        return nVarN.maxIntrinsicWidth(uVar.f11325l.f11288c, uVar.b(), i7);
    }

    @Override // g0.m
    public final g0.t h(long j) {
        Unit unit;
        LinkedHashMap linkedHashMap;
        r(j);
        f0 f0Var = this.E;
        v.d dVar = (v.d) f0Var.E.f11319d.f9547e;
        int i7 = dVar.f21324i;
        if (i7 > 0) {
            Object[] objArr = dVar.f21322d;
            int i10 = 0;
            do {
                x xVar = ((u) objArr[i10]).f11326m.j;
                Intrinsics.checkNotNull(xVar);
                xVar.getClass();
                Intrinsics.checkNotNullParameter(s.f11311d, "<set-?>");
                i10++;
            } while (i10 < i7);
        }
        u uVar = f0Var.E;
        g0.o oVarMo42measure3p2s80s = uVar.f11320e.mo42measure3p2s80s(this, uVar.b(), j);
        if (oVarMo42measure3p2s80s != null) {
            com.google.firebase.messaging.p pVar = (com.google.firebase.messaging.p) oVarMo42measure3p2s80s;
            q(ib.a.b(pVar.f6602a, pVar.f6603b));
            unit = Unit.f14616a;
        } else {
            unit = null;
        }
        if (unit == null) {
            q(0L);
        }
        if (!Intrinsics.areEqual(this.H, oVarMo42measure3p2s80s) && oVarMo42measure3p2s80s != null && (((linkedHashMap = this.G) != null && !linkedHashMap.isEmpty()) || !((Map) ((com.google.firebase.messaging.p) oVarMo42measure3p2s80s).f6604c).isEmpty())) {
            Map map = (Map) ((com.google.firebase.messaging.p) oVarMo42measure3p2s80s).f6604c;
            if (!Intrinsics.areEqual(map, this.G)) {
                x xVar2 = f0Var.E.f11326m.j;
                Intrinsics.checkNotNull(xVar2);
                xVar2.F.d();
                LinkedHashMap linkedHashMap2 = this.G;
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    this.G = linkedHashMap2;
                }
                linkedHashMap2.clear();
                linkedHashMap2.putAll(map);
            }
        }
        this.H = oVarMo42measure3p2s80s;
        return this;
    }

    @Override // g0.m
    public final int n(int i7) {
        e4.c cVar = this.E.E.f11321f;
        g0.n nVarN = cVar.N();
        u uVar = (u) cVar.f7966e;
        return nVarN.minIntrinsicHeight(uVar.f11325l.f11288c, uVar.b(), i7);
    }

    @Override // i0.a0
    public final int s(g0.f alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        x xVar = this.E.E.f11326m.j;
        Intrinsics.checkNotNull(xVar);
        v vVar = xVar.F;
        z zVar = xVar.K;
        if (zVar.f11341b == 2) {
            vVar.f11330c = true;
            if (vVar.f11329b) {
                zVar.f11344e = true;
                zVar.f11345f = true;
            }
        } else {
            vVar.f11331d = true;
        }
        l lVar = xVar.b().P;
        if (lVar != null) {
            lVar.f11284y = true;
        }
        xVar.j();
        l lVar2 = xVar.b().P;
        if (lVar2 != null) {
            lVar2.f11284y = false;
        }
        Integer num = (Integer) vVar.f11333f.get(alignmentLine);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.I.put(alignmentLine, Integer.valueOf(iIntValue));
        return iIntValue;
    }
}
