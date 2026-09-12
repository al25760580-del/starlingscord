package s4;

import l4.v;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r4.e f19717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r4.a f19718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f19720e;

    public a(String str, r4.e eVar, r4.a aVar, boolean z5, boolean z6) {
        this.f19716a = str;
        this.f19717b = eVar;
        this.f19718c = aVar;
        this.f19719d = z5;
        this.f19720e = z6;
    }

    @Override // s4.b
    public final n4.c a(v vVar, l4.i iVar, t4.b bVar) {
        return new n4.f(vVar, bVar, this);
    }
}
