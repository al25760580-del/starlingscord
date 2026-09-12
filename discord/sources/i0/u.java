package i0;

import java.util.List;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class u implements i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final r f11314o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final p f11315p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final q f11316q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u f11318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ga.l f11319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g0.n f11320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e4.c f11321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m0.b f11322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m0.e f11323h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q f11324i;
    public s j;
    public s k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c0 f11325l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z f11326m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public z.f f11327n;

    static {
        Intrinsics.checkNotNullParameter("Undefined intrinsics block and it is required", "error");
        f11314o = new r();
        f11315p = p.f11310d;
        f11316q = new q();
    }

    public u(int i7) {
        boolean z5 = (i7 & 1) == 0;
        k0.f.f14213a.addAndGet(1);
        this.f11317b = z5;
        this.f11319d = new ga.l(new v.d(new u[16]), new a3.q(9, this));
        this.f11320e = f11314o;
        this.f11321f = new e4.c(this);
        this.f11322g = w.f11335a;
        this.f11323h = m0.e.f15347d;
        this.f11324i = f11316q;
        u.e.f20885z.getClass();
        s sVar = s.f11311d;
        this.j = sVar;
        this.k = sVar;
        this.f11325l = new c0(this);
        this.f11326m = new z(this);
        this.f11327n = z.c.f23573a;
    }

    public static void h(u it) {
        String str;
        Intrinsics.checkNotNullParameter(it, "it");
        z zVar = it.f11326m;
        if (t.f11313a[f0.e.b(zVar.f11341b)] == 1) {
            zVar.getClass();
            if (zVar.f11342c) {
                return;
            }
            zVar.getClass();
            return;
        }
        int i7 = zVar.f11341b;
        if (i7 == 1) {
            str = "Measuring";
        } else if (i7 == 2) {
            str = "LookaheadMeasuring";
        } else if (i7 == 3) {
            str = "LayingOut";
        } else if (i7 != 4) {
            str = i7 != 5 ? "null" : "Idle";
        } else {
            str = "LookaheadLayingOut";
        }
        throw new IllegalStateException("Unexpected state ".concat(str));
    }

    public final void a() {
        this.k = this.j;
        s sVar = s.f11311d;
        this.j = sVar;
        v.d dVar = (v.d) this.f11319d.f9547e;
        int i7 = dVar.f21324i;
        if (i7 > 0) {
            Object[] objArr = dVar.f21322d;
            int i10 = 0;
            do {
                u uVar = (u) objArr[i10];
                if (uVar.j != sVar) {
                    uVar.a();
                }
                i10++;
            } while (i10 < i7);
        }
    }

    public final List b() {
        x xVar = this.f11326m.j;
        Intrinsics.checkNotNull(xVar);
        v.d dVar = xVar.G;
        z zVar = xVar.K;
        ((v.d) zVar.f11340a.f11319d.f9547e).c();
        if (!xVar.H) {
            return dVar.c();
        }
        ga.l lVar = zVar.f11340a.f11319d;
        v.d dVar2 = (v.d) lVar.f9547e;
        int i7 = dVar2.f21324i;
        if (i7 > 0) {
            Object[] objArr = dVar2.f21322d;
            int i10 = 0;
            do {
                u uVar = (u) objArr[i10];
                if (dVar.f21324i <= i10) {
                    x xVar2 = uVar.f11326m.j;
                    Intrinsics.checkNotNull(xVar2);
                    dVar.a(xVar2);
                } else {
                    x xVar3 = uVar.f11326m.j;
                    Intrinsics.checkNotNull(xVar3);
                    Object[] objArr2 = dVar.f21322d;
                    Object obj = objArr2[i10];
                    objArr2[i10] = xVar3;
                }
                i10++;
            } while (i10 < i7);
        }
        dVar.f(((v.a) ((v.d) lVar.f9547e).c()).f21316d.f21324i, dVar.f21324i);
        xVar.H = false;
        return dVar.c();
    }

    public final List c() {
        y yVar = this.f11326m.f11348i;
        v.d dVar = yVar.I;
        u uVar = yVar.L.f11340a;
        if (!yVar.J) {
            return dVar.c();
        }
        ga.l lVar = uVar.f11319d;
        v.d dVar2 = (v.d) lVar.f9547e;
        int i7 = dVar2.f21324i;
        if (i7 > 0) {
            Object[] objArr = dVar2.f21322d;
            int i10 = 0;
            do {
                u uVar2 = (u) objArr[i10];
                if (dVar.f21324i <= i10) {
                    dVar.a(uVar2.f11326m.f11348i);
                } else {
                    y yVar2 = uVar2.f11326m.f11348i;
                    Object[] objArr2 = dVar.f21322d;
                    Object obj = objArr2[i10];
                    objArr2[i10] = yVar2;
                }
                i10++;
            } while (i10 < i7);
        }
        dVar.f(((v.a) ((v.d) lVar.f9547e).c()).f21316d.f21324i, dVar.f21324i);
        yVar.J = false;
        return dVar.c();
    }

    public final List d() {
        c0 c0Var = this.f11325l;
        h0 h0Var = c0Var.f11289d;
        v.d dVar = c0Var.f11291f;
        if (dVar == null) {
            return n0.f14659d;
        }
        v.d dVar2 = new v.d(new g0.q[dVar.f21324i]);
        z.e eVar = c0Var.f11290e;
        int i7 = 0;
        while (eVar != null && eVar != h0Var) {
            f0 f0Var = eVar.f23579f;
            if (f0Var == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            c0Var.f11287b.getClass();
            z.e eVar2 = eVar.f23578e;
            if (eVar2 == h0Var) {
                f0 f0Var2 = eVar.f23579f;
                f0 f0Var3 = eVar2.f23579f;
            }
            dVar2.a(new g0.q((z.f) dVar.f21322d[i7], f0Var));
            eVar = eVar.f23578e;
            i7++;
        }
        return dVar2.c();
    }

    public final int e() {
        return this.f11326m.f11348i.f11338x;
    }

    public final void f() {
        u uVar = this.f11318c;
        if (uVar != null && uVar == null) {
            throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadLayout");
        }
    }

    public final void g() {
        f();
        c0 c0Var = this.f11325l;
        f0 f0Var = c0Var.f11288c;
        m mVar = c0Var.f11287b;
        while (f0Var != mVar) {
            Intrinsics.checkNotNull(f0Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            o oVar = (o) f0Var;
            oVar.getClass();
            f0Var = oVar.F;
        }
        mVar.getClass();
    }

    public final void i() {
        v.d dVar = (v.d) this.f11319d.f9547e;
        int i7 = dVar.f21324i;
        if (i7 > 0) {
            Object[] objArr = dVar.f21322d;
            int i10 = 0;
            do {
                u uVar = (u) objArr[i10];
                s sVar = uVar.k;
                uVar.j = sVar;
                if (sVar != s.f11311d) {
                    uVar.i();
                }
                i10++;
            } while (i10 < i7);
        }
    }

    public final String toString() {
        return mo.c0.M(this) + " children: " + ((v.a) ((v.d) this.f11319d.f9547e).c()).f21316d.f21324i + " measurePolicy: " + this.f11320e;
    }
}
