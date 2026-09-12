package y;

import kotlin.jvm.functions.Function1;
import s.o;

/* JADX INFO: loaded from: classes.dex */
public final class i extends b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f23121i;
    public final boolean j;
    public final Function1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Function1 f23122l;

    /* JADX WARN: Illegal instructions before constructor call */
    public i(b bVar, Function1 function1, boolean z5, boolean z6) {
        Function1 function1G;
        Function1 function1C;
        n8.f fVar = f.f23111a;
        super(0L, f.c(function1, (bVar == null || (function1C = bVar.c()) == null) ? f.f23118h.f23093d : function1C, z5), (bVar == null || (function1G = bVar.g()) == null) ? f.f23118h.f23094e : function1G);
        this.f23121i = bVar;
        this.j = z6;
        this.k = this.f23093d;
        this.f23122l = this.f23094e;
        x.c.a();
    }

    @Override // y.c
    public final void a() {
        b bVar;
        if (!this.j || (bVar = this.f23121i) == null) {
            return;
        }
        bVar.a();
    }

    @Override // y.c
    public final e b() {
        return m().b();
    }

    @Override // y.b, y.c
    public final Function1 c() {
        return this.k;
    }

    @Override // y.b, y.c
    public final boolean d() {
        return m().d();
    }

    @Override // y.c
    public final long e() {
        return m().e();
    }

    @Override // y.b, y.c
    public final int f() {
        return m().f();
    }

    @Override // y.b, y.c
    public final Function1 g() {
        return this.f23122l;
    }

    @Override // y.b, y.c
    public final void h(g gVar) {
        m().h(gVar);
    }

    @Override // y.b, y.c
    public final void i(int i7) {
        m().i(i7);
    }

    @Override // y.b
    public final o j() {
        return m().j();
    }

    @Override // y.b
    /* JADX INFO: renamed from: k */
    public final Function1 c() {
        return this.k;
    }

    @Override // y.b
    public final void l(o oVar) {
        throw new UnsupportedOperationException();
    }

    public final b m() {
        b bVar = this.f23121i;
        return bVar == null ? f.f23118h : bVar;
    }
}
