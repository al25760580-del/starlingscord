package io.sentry;

import java.util.Enumeration;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends io.sentry.protocol.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final io.sentry.protocol.c f12696i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final io.sentry.protocol.c f12697v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final io.sentry.protocol.c f12698w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final t3 f12699x;

    public h(io.sentry.protocol.c cVar, io.sentry.protocol.c cVar2, io.sentry.protocol.c cVar3, t3 t3Var) {
        this.f12696i = cVar;
        this.f12697v = cVar2;
        this.f12698w = cVar3;
        this.f12699x = t3Var;
    }

    @Override // io.sentry.protocol.c
    public final boolean a(Object obj) {
        throw null;
    }

    @Override // io.sentry.protocol.c
    public final Set b() {
        return z().f12923d.entrySet();
    }

    @Override // io.sentry.protocol.c
    public final Object c(Object obj) {
        Object objC = this.f12698w.c(obj);
        if (objC != null) {
            return objC;
        }
        Object objC2 = this.f12697v.c(obj);
        return objC2 != null ? objC2 : this.f12696i.c(obj);
    }

    @Override // io.sentry.protocol.c
    public final io.sentry.protocol.a d() {
        io.sentry.protocol.a aVarD = this.f12698w.d();
        if (aVarD != null) {
            return aVarD;
        }
        io.sentry.protocol.a aVarD2 = this.f12697v.d();
        return aVarD2 != null ? aVarD2 : this.f12696i.d();
    }

    @Override // io.sentry.protocol.c
    public final io.sentry.protocol.f e() {
        io.sentry.protocol.f fVarE = this.f12698w.e();
        if (fVarE != null) {
            return fVarE;
        }
        io.sentry.protocol.f fVarE2 = this.f12697v.e();
        return fVarE2 != null ? fVarE2 : this.f12696i.e();
    }

    @Override // io.sentry.protocol.c
    public final io.sentry.protocol.h f() {
        io.sentry.protocol.h hVarF = this.f12698w.f();
        if (hVarF != null) {
            return hVarF;
        }
        io.sentry.protocol.h hVarF2 = this.f12697v.f();
        return hVarF2 != null ? hVarF2 : this.f12696i.f();
    }

    @Override // io.sentry.protocol.c
    public final io.sentry.protocol.o g() {
        io.sentry.protocol.o oVarG = this.f12698w.g();
        if (oVarG != null) {
            return oVarG;
        }
        io.sentry.protocol.o oVarG2 = this.f12697v.g();
        return oVarG2 != null ? oVarG2 : this.f12696i.g();
    }

    @Override // io.sentry.protocol.c
    public final io.sentry.protocol.x h() {
        io.sentry.protocol.x xVarH = this.f12698w.h();
        if (xVarH != null) {
            return xVarH;
        }
        io.sentry.protocol.x xVarH2 = this.f12697v.h();
        return xVarH2 != null ? xVarH2 : this.f12696i.h();
    }

    @Override // io.sentry.protocol.c
    public final j6 i() {
        j6 j6VarI = this.f12698w.i();
        if (j6VarI != null) {
            return j6VarI;
        }
        j6 j6VarI2 = this.f12697v.i();
        return j6VarI2 != null ? j6VarI2 : this.f12696i.i();
    }

    @Override // io.sentry.protocol.c
    public final Enumeration j() {
        return z().f12923d.keys();
    }

    @Override // io.sentry.protocol.c
    public final Object k(Object obj, String str) {
        return y().k(obj, str);
    }

    @Override // io.sentry.protocol.c
    public final void l(io.sentry.protocol.c cVar) {
        throw null;
    }

    @Override // io.sentry.protocol.c
    public final Object m(Object obj) {
        return y().m(obj);
    }

    @Override // io.sentry.protocol.c
    public final void n(io.sentry.protocol.a aVar) {
        y().n(aVar);
    }

    @Override // io.sentry.protocol.c
    public final void o(io.sentry.protocol.b bVar) {
        y().o(bVar);
    }

    @Override // io.sentry.protocol.c
    public final void p(io.sentry.protocol.f fVar) {
        y().p(fVar);
    }

    @Override // io.sentry.protocol.c
    public final void q(io.sentry.protocol.h hVar) {
        throw null;
    }

    @Override // io.sentry.protocol.c
    public final void r(io.sentry.protocol.k kVar) {
        y().r(kVar);
    }

    @Override // io.sentry.protocol.c
    public final void s(io.sentry.protocol.o oVar) {
        y().s(oVar);
    }

    @Override // io.sentry.protocol.c, io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        z().serialize(y2Var, iLogger);
    }

    @Override // io.sentry.protocol.c
    public final void t(io.sentry.protocol.r rVar) {
        y().t(rVar);
    }

    @Override // io.sentry.protocol.c
    public final void u(io.sentry.protocol.x xVar) {
        y().u(xVar);
    }

    @Override // io.sentry.protocol.c
    public final void v(io.sentry.protocol.e0 e0Var) {
        y().v(e0Var);
    }

    @Override // io.sentry.protocol.c
    public final void w(j6 j6Var) {
        y().w(j6Var);
    }

    public final io.sentry.protocol.c y() {
        int i7 = g.f12680a[this.f12699x.ordinal()];
        io.sentry.protocol.c cVar = this.f12698w;
        if (i7 == 1) {
            return cVar;
        }
        if (i7 != 2) {
            return i7 != 3 ? cVar : this.f12696i;
        }
        return this.f12697v;
    }

    public final io.sentry.protocol.c z() {
        io.sentry.protocol.c cVar = new io.sentry.protocol.c();
        cVar.l(this.f12696i);
        cVar.l(this.f12697v);
        cVar.l(this.f12698w);
        return cVar;
    }
}
