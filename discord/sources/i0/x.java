package i0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x extends g0.t implements g0.m, b {
    public boolean E;
    public final v F;
    public final v.d G;
    public boolean H;
    public boolean I;
    public Object J;
    public final /* synthetic */ z K;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public m0.a f11336x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f11337y = m0.d.f15345a;

    public x(z zVar) {
        this.K = zVar;
        Intrinsics.checkNotNullParameter(this, "alignmentLinesOwner");
        this.F = new v(this, 1);
        this.G = new v.d(new x[16]);
        this.H = true;
        this.I = true;
        this.J = zVar.f11348i.F;
    }

    @Override // g0.m
    public final int a(int i7) {
        u();
        b0 b0VarD = this.K.a().D();
        Intrinsics.checkNotNull(b0VarD);
        return b0VarD.a(i7);
    }

    @Override // i0.b
    public final m b() {
        return this.K.f11340a.f11325l.f11287b;
    }

    @Override // i0.b
    public final void c() {
        u uVar = this.K.f11340a;
    }

    @Override // i0.b
    public final v d() {
        return this.F;
    }

    @Override // g0.m
    public final int e(int i7) {
        u();
        b0 b0VarD = this.K.a().D();
        Intrinsics.checkNotNull(b0VarD);
        return b0VarD.e(i7);
    }

    @Override // g0.m
    public final int f(int i7) {
        u();
        b0 b0VarD = this.K.a().D();
        Intrinsics.checkNotNull(b0VarD);
        return b0VarD.f(i7);
    }

    @Override // g0.m
    public final g0.t h(long j) {
        z zVar = this.K;
        u uVar = zVar.f11340a;
        if (uVar.j == s.f11311d) {
            uVar.a();
        }
        u uVar2 = zVar.f11340a;
        uVar2.f11326m.getClass();
        m0.a aVar = this.f11336x;
        if (aVar != null && aVar.f15344a == j) {
            uVar2.i();
            return this;
        }
        this.f11336x = new m0.a(j);
        this.F.f11330c = false;
        m(d.f11295i);
        if (zVar.a().D() == null) {
            throw new IllegalStateException("Lookahead result from lookaheadRemeasure cannot be null");
        }
        zVar.f11341b = 2;
        w.d(uVar2);
        throw null;
    }

    @Override // i0.b
    public final void j() {
        v.d dVar;
        int i7;
        v vVar = this.F;
        vVar.f();
        z zVar = this.K;
        boolean z5 = zVar.f11344e;
        u uVar = zVar.f11340a;
        if (z5 && (i7 = (dVar = (v.d) uVar.f11319d.f9547e).f21324i) > 0) {
            Object[] objArr = dVar.f21322d;
            int i10 = 0;
            do {
                ((u) objArr[i10]).f11326m.getClass();
                i10++;
            } while (i10 < i7);
        }
        l lVar = b().P;
        Intrinsics.checkNotNull(lVar);
        if (zVar.f11345f || (!lVar.f11284y && zVar.f11344e)) {
            zVar.f11344e = false;
            zVar.f11341b = 4;
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
        return this.E;
    }

    @Override // i0.b
    public final void m(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        v.d dVar = (v.d) this.K.f11340a.f11319d.f9547e;
        int i7 = dVar.f21324i;
        if (i7 > 0) {
            Object[] objArr = dVar.f21322d;
            int i10 = 0;
            do {
                x xVar = ((u) objArr[i10]).f11326m.j;
                Intrinsics.checkNotNull(xVar);
                block.invoke(xVar);
                i10++;
            } while (i10 < i7);
        }
    }

    @Override // g0.m
    public final int n(int i7) {
        u();
        b0 b0VarD = this.K.a().D();
        Intrinsics.checkNotNull(b0VarD);
        return b0VarD.n(i7);
    }

    @Override // g0.t
    public final void p(long j) {
        z zVar = this.K;
        zVar.f11341b = 4;
        int i7 = m0.d.f15346b;
        if (j != this.f11337y) {
            if (zVar.f11346g) {
                zVar.f11344e = true;
            }
            t();
        }
        w.d(zVar.f11340a);
        throw null;
    }

    public final void s() {
        boolean z5 = this.E;
        this.E = true;
        z zVar = this.K;
        if (!z5) {
            zVar.getClass();
        }
        v.d dVar = (v.d) zVar.f11340a.f11319d.f9547e;
        int i7 = dVar.f21324i;
        if (i7 > 0) {
            Object[] objArr = dVar.f21322d;
            int i10 = 0;
            do {
                u uVar = (u) objArr[i10];
                if (uVar.e() != Integer.MAX_VALUE) {
                    x xVar = uVar.f11326m.j;
                    Intrinsics.checkNotNull(xVar);
                    xVar.s();
                    u.h(uVar);
                }
                i10++;
            } while (i10 < i7);
        }
    }

    public final void t() {
        v.d dVar;
        int i7;
        z zVar = this.K;
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
            x xVar = zVar2.j;
            if (xVar != null) {
                xVar.t();
            }
            i10++;
        } while (i10 < i7);
    }

    public final void u() {
        if (this.K.f11340a.f11318c == null) {
            throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadLayout");
        }
    }
}
