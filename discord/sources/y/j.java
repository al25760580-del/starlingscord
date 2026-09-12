package y;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class j extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f23123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f23124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function1 f23125f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c cVar, Function1 function1, boolean z5) {
        Function1 function1C;
        super(0L, e.f23106w);
        n8.f fVar = f.f23111a;
        this.f23123d = cVar;
        this.f23124e = z5;
        this.f23125f = f.c(function1, (cVar == null || (function1C = cVar.c()) == null) ? f.f23118h.f23093d : function1C, false);
        x.c.a();
    }

    @Override // y.c
    public final void a() {
        c cVar;
        if (!this.f23124e || (cVar = this.f23123d) == null) {
            return;
        }
        cVar.a();
    }

    @Override // y.c
    public final e b() {
        return j().b();
    }

    @Override // y.c
    public final Function1 c() {
        return this.f23125f;
    }

    @Override // y.c
    public final boolean d() {
        return j().d();
    }

    @Override // y.c
    public final long e() {
        return j().e();
    }

    @Override // y.c
    public final Function1 g() {
        return null;
    }

    @Override // y.c
    public final void h(g gVar) {
        j().h(gVar);
    }

    public final c j() {
        c cVar = this.f23123d;
        return cVar == null ? f.f23118h : cVar;
    }
}
