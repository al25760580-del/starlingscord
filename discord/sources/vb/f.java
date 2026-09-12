package vb;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements qi.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f21517a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qi.c f21518b = new qi.c("currentCacheSizeBytes", s0.g.i(s0.g.h(ti.e.class, new ti.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final qi.c f21519c = new qi.c("maxCacheSizeBytes", s0.g.i(s0.g.h(ti.e.class, new ti.a(2))));

    @Override // qi.a
    public final void a(Object obj, Object obj2) {
        yb.f fVar = (yb.f) obj;
        qi.e eVar = (qi.e) obj2;
        eVar.a(f21518b, fVar.f23233a);
        eVar.a(f21519c, fVar.f23234b);
    }
}
