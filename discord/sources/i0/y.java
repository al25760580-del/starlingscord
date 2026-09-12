package i0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y extends g0.t implements g0.m, b {
    public Object F;
    public boolean G;
    public final v H;
    public final v.d I;
    public boolean J;
    public float K;
    public final /* synthetic */ z L;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f11338x = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f11339y = m0.d.f15345a;
    public boolean E = true;

    public y(z zVar) {
        this.L = zVar;
        Intrinsics.checkNotNullParameter(this, "alignmentLinesOwner");
        this.H = new v(this, 0);
        this.I = new v.d(new y[16]);
        this.J = true;
    }

    @Override // g0.m
    public final int a(int i7) {
        u();
        return this.L.a().a(i7);
    }

    @Override // i0.b
    public final m b() {
        return this.L.f11340a.f11325l.f11287b;
    }

    @Override // i0.b
    public final v d() {
        return this.H;
    }

    @Override // g0.m
    public final int e(int i7) {
        u();
        return this.L.a().e(i7);
    }

    @Override // g0.m
    public final int f(int i7) {
        u();
        return this.L.a().f(i7);
    }

    @Override // g0.m
    public final g0.t h(long j) {
        z zVar = this.L;
        u uVar = zVar.f11340a;
        s sVar = uVar.j;
        s sVar2 = s.f11311d;
        if (sVar == sVar2) {
            uVar.a();
        }
        if (uVar.f11318c != null) {
            r(j);
            x xVar = zVar.j;
            Intrinsics.checkNotNull(xVar);
            xVar.getClass();
            Intrinsics.checkNotNullParameter(sVar2, "<set-?>");
            xVar.h(j);
        }
        w.d(zVar.f11340a);
        throw null;
    }

    @Override // i0.b
    public final void j() {
        v.d dVar;
        int i7;
        v vVar = this.H;
        vVar.f();
        z zVar = this.L;
        u uVar = zVar.f11340a;
        if (zVar.f11342c && (i7 = (dVar = (v.d) uVar.f11319d.f9547e).f21324i) > 0) {
            Object[] objArr = dVar.f21322d;
            int i10 = 0;
            do {
                ((u) objArr[i10]).f11326m.getClass();
                i10++;
            } while (i10 < i7);
        }
        if (zVar.f11343d || (!b().f11284y && zVar.f11342c)) {
            zVar.f11342c = false;
            zVar.f11341b = 3;
            if (zVar.f11346g) {
                zVar.f11346g = false;
                zVar.b(zVar.f11347h - 1);
            }
            w.d(uVar);
            throw null;
        }
        if (vVar.f11329b) {
            vVar.f();
            if (vVar.f11332e != null) {
                vVar.e();
            }
        }
    }

    @Override // i0.b
    public final boolean l() {
        return this.G;
    }

    @Override // i0.b
    public final void m(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        v.d dVar = (v.d) this.L.f11340a.f11319d.f9547e;
        int i7 = dVar.f21324i;
        if (i7 > 0) {
            Object[] objArr = dVar.f21322d;
            int i10 = 0;
            do {
                block.invoke(((u) objArr[i10]).f11326m.f11348i);
                i10++;
            } while (i10 < i7);
        }
    }

    @Override // g0.m
    public final int n(int i7) {
        u();
        return this.L.a().n(i7);
    }

    @Override // g0.t
    public final void p(long j) {
        z zVar = this.L;
        u uVar = zVar.f11340a;
        long j5 = this.f11339y;
        int i7 = m0.d.f15346b;
        if (j != j5) {
            if (zVar.f11346g) {
                zVar.f11342c = true;
            }
            t();
        }
        if (uVar.f11318c != null) {
            x xVar = zVar.j;
            Intrinsics.checkNotNull(xVar);
            xVar.getClass();
            g0.s.a(xVar, (int) (j >> 32), (int) (4294967295L & j));
        }
        zVar.f11341b = 3;
        this.f11339y = j;
        w.d(uVar);
        throw null;
    }

    public final void s() {
        boolean z5 = this.G;
        this.G = true;
        u uVar = this.L.f11340a;
        z zVar = uVar.f11326m;
        if (!z5) {
            zVar.getClass();
            zVar.getClass();
        }
        c0 c0Var = uVar.f11325l;
        f0 f0Var = c0Var.f11287b.F;
        for (f0 f0Var2 = c0Var.f11288c; !Intrinsics.areEqual(f0Var2, f0Var) && f0Var2 != null; f0Var2 = f0Var2.F) {
            if (f0Var2.N) {
                f0Var2.H();
            }
        }
        v.d dVar = (v.d) uVar.f11319d.f9547e;
        int i7 = dVar.f21324i;
        if (i7 > 0) {
            Object[] objArr = dVar.f21322d;
            int i10 = 0;
            do {
                u uVar2 = (u) objArr[i10];
                if (uVar2.e() != Integer.MAX_VALUE) {
                    uVar2.f11326m.f11348i.s();
                    u.h(uVar2);
                }
                i10++;
            } while (i10 < i7);
        }
    }

    public final void t() {
        v.d dVar;
        int i7;
        z zVar = this.L;
        if (zVar.f11347h <= 0 || (i7 = (dVar = (v.d) zVar.f11340a.f11319d.f9547e).f21324i) <= 0) {
            return;
        }
        Object[] objArr = dVar.f21322d;
        int i10 = 0;
        do {
            z zVar2 = ((u) objArr[i10]).f11326m;
            if (zVar2.f11346g && !zVar2.f11342c) {
                r rVar = u.f11314o;
            }
            zVar2.f11348i.t();
            i10++;
        } while (i10 < i7);
    }

    public final void u() {
        z zVar = this.L;
        u uVar = zVar.f11340a;
        r rVar = u.f11314o;
        uVar.getClass();
        zVar.f11340a.getClass();
    }

    @Override // i0.b
    public final void c() {
    }
}
