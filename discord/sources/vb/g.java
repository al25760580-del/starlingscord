package vb;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements qi.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f21520a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qi.c f21521b = new qi.c("startMs", s0.g.i(s0.g.h(ti.e.class, new ti.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final qi.c f21522c = new qi.c("endMs", s0.g.i(s0.g.h(ti.e.class, new ti.a(2))));

    @Override // qi.a
    public final void a(Object obj, Object obj2) {
        yb.g gVar = (yb.g) obj;
        qi.e eVar = (qi.e) obj2;
        eVar.a(f21521b, gVar.f23235a);
        eVar.a(f21522c, gVar.f23236b);
    }
}
