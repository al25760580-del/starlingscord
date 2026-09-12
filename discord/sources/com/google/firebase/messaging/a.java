package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements qi.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6542a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qi.c f6543b = new qi.c("projectNumber", s0.g.i(s0.g.h(ti.e.class, new ti.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final qi.c f6544c = new qi.c("messageId", s0.g.i(s0.g.h(ti.e.class, new ti.a(2))));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final qi.c f6545d = new qi.c("instanceId", s0.g.i(s0.g.h(ti.e.class, new ti.a(3))));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final qi.c f6546e = new qi.c("messageType", s0.g.i(s0.g.h(ti.e.class, new ti.a(4))));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final qi.c f6547f = new qi.c("sdkPlatform", s0.g.i(s0.g.h(ti.e.class, new ti.a(5))));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final qi.c f6548g = new qi.c("packageName", s0.g.i(s0.g.h(ti.e.class, new ti.a(6))));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final qi.c f6549h = new qi.c("collapseKey", s0.g.i(s0.g.h(ti.e.class, new ti.a(7))));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final qi.c f6550i = new qi.c("priority", s0.g.i(s0.g.h(ti.e.class, new ti.a(8))));
    public static final qi.c j = new qi.c("ttl", s0.g.i(s0.g.h(ti.e.class, new ti.a(9))));
    public static final qi.c k = new qi.c("topic", s0.g.i(s0.g.h(ti.e.class, new ti.a(10))));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final qi.c f6551l = new qi.c("bulkId", s0.g.i(s0.g.h(ti.e.class, new ti.a(11))));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final qi.c f6552m = new qi.c("event", s0.g.i(s0.g.h(ti.e.class, new ti.a(12))));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final qi.c f6553n = new qi.c("analyticsLabel", s0.g.i(s0.g.h(ti.e.class, new ti.a(13))));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final qi.c f6554o = new qi.c("campaignId", s0.g.i(s0.g.h(ti.e.class, new ti.a(14))));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final qi.c f6555p = new qi.c("composerLabel", s0.g.i(s0.g.h(ti.e.class, new ti.a(15))));

    @Override // qi.a
    public final void a(Object obj, Object obj2) {
        ej.d dVar = (ej.d) obj;
        qi.e eVar = (qi.e) obj2;
        eVar.a(f6543b, dVar.f8429a);
        eVar.e(f6544c, dVar.f8430b);
        eVar.e(f6545d, dVar.f8431c);
        eVar.e(f6546e, dVar.f8432d);
        eVar.e(f6547f, ej.c.ANDROID);
        eVar.e(f6548g, dVar.f8433e);
        eVar.e(f6549h, dVar.f8434f);
        eVar.b(f6550i, 0);
        eVar.b(j, dVar.f8435g);
        eVar.e(k, dVar.f8436h);
        eVar.a(f6551l, 0L);
        eVar.e(f6552m, ej.a.MESSAGE_DELIVERED);
        eVar.e(f6553n, dVar.f8437i);
        eVar.a(f6554o, 0L);
        eVar.e(f6555p, dVar.j);
    }
}
