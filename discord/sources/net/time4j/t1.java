package net.time4j;

/* JADX INFO: loaded from: classes3.dex */
public class t1 implements xr.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xr.d f16718e;

    public /* synthetic */ t1(int i7, xr.d dVar) {
        this.f16717d = i7;
        this.f16718e = dVar;
    }

    public static long e(Object obj) {
        return ((Number) Number.class.cast(obj)).longValue();
    }

    public Object a(e1 e1Var) {
        xr.d dVar = this.f16718e;
        if (dVar.i()) {
            return e1Var.f16629d.d(dVar);
        }
        if (dVar.w()) {
            return e1Var.f16630e.d(dVar);
        }
        throw new xr.f("Missing rule for: " + dVar.name());
    }

    @Override // xr.j
    public Object b(xr.e eVar, Object obj, boolean z5) {
        switch (this.f16717d) {
            case 0:
                p1 p1Var = (p1) obj;
                u1 u1Var = (u1) this.f16718e;
                if (p1Var == null) {
                    throw new IllegalArgumentException("Missing weekday.");
                }
                u uVar = x0.J;
                x0 x0Var = (x0) eVar.d(uVar);
                x0Var.getClass();
                ga.k kVar = x0.V;
                long jX = kVar.x(x0Var);
                v1 v1Var = v1.G;
                p1 p1VarD = p1.d(yk.a.m(7, 5 + jX) + 1);
                if (p1Var == p1VarD) {
                    return eVar;
                }
                return eVar.h(uVar, (x0) kVar.y((jX + ((long) p1Var.b(u1Var.this$0))) - ((long) p1VarD.b(u1Var.this$0))));
            default:
                return f((e1) eVar, obj, z5);
        }
    }

    @Override // xr.j
    public final Object c(xr.e eVar) {
        switch (this.f16717d) {
            case 0:
                return ((x0) eVar.d(x0.J)).w();
            default:
                return a((e1) eVar);
        }
    }

    @Override // xr.j
    public final Object d(xr.e eVar) {
        switch (this.f16717d) {
            case 0:
                x0 x0Var = (x0) eVar.d(x0.J);
                p1 p1VarW = x0Var.w();
                u1 u1Var = (u1) this.f16718e;
                return (x0Var.o() + 7) - ((long) p1VarW.b(u1Var.this$0)) > x0.W.c().v() ? p1.f16691w : u1Var.this$0.f16772d.c();
            default:
                e1 e1Var = (e1) eVar;
                xr.d dVar = this.f16718e;
                if (dVar.i()) {
                    return e1Var.f16629d.g(dVar);
                }
                if (dVar.w()) {
                    return dVar.a();
                }
                throw new xr.f("Missing rule for: " + dVar.name());
        }
    }

    public e1 f(e1 e1Var, Object obj, boolean z5) {
        if (obj == null) {
            throw new IllegalArgumentException("Missing element value.");
        }
        Object objA = a(e1Var);
        b1 b1Var = e1Var.f16630e;
        x0 x0Var = e1Var.f16629d;
        if (obj.equals(objA)) {
            return e1Var;
        }
        xr.d dVar = this.f16718e;
        if (z5) {
            return (e1) e1Var.l(yk.a.E(e(obj), e(a(e1Var))), (i0) e1.f16628i.b(dVar));
        }
        if (dVar.i()) {
            return new e1((x0) x0Var.h(dVar, obj), b1Var);
        }
        if (!dVar.w()) {
            throw new xr.f("Missing rule for: " + dVar.name());
        }
        if (Number.class.isAssignableFrom(dVar.getType())) {
            long jE = e(dVar.v());
            long jE2 = e(dVar.a());
            long jE3 = e(obj);
            if (jE > jE3 || jE2 < jE3) {
                throw new IllegalArgumentException("Out of range: " + obj);
            }
        } else if (dVar.equals(b1.L) && obj.equals(b1.K)) {
            throw new IllegalArgumentException("Out of range: " + obj);
        }
        return new e1(x0Var, (b1) b1Var.h(dVar, obj));
    }
}
