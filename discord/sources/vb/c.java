package vb;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements qi.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f21510a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qi.c f21511b = new qi.c("eventsDroppedCount", s0.g.i(s0.g.h(ti.e.class, new ti.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final qi.c f21512c = new qi.c("reason", s0.g.i(s0.g.h(ti.e.class, new ti.a(3))));

    @Override // qi.a
    public final void a(Object obj, Object obj2) {
        yb.d dVar = (yb.d) obj;
        qi.e eVar = (qi.e) obj2;
        eVar.a(f21511b, dVar.f23228a);
        eVar.e(f21512c, dVar.f23229b);
    }
}
