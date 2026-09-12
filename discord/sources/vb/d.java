package vb;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements qi.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f21513a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qi.c f21514b = new qi.c("logSource", s0.g.i(s0.g.h(ti.e.class, new ti.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final qi.c f21515c = new qi.c("logEventDropped", s0.g.i(s0.g.h(ti.e.class, new ti.a(2))));

    @Override // qi.a
    public final void a(Object obj, Object obj2) {
        yb.e eVar = (yb.e) obj;
        qi.e eVar2 = (qi.e) obj2;
        eVar2.e(f21514b, eVar.f23231a);
        eVar2.e(f21515c, eVar.f23232b);
    }
}
