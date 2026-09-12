package s4;

import l4.v;

/* JADX INFO: loaded from: classes.dex */
public final class i implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19757a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r4.b f19759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r4.e f19761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f19762f;

    public i(String str, r4.b bVar, r4.b bVar2, r4.d dVar, boolean z5) {
        this.f19758b = str;
        this.f19759c = bVar;
        this.f19761e = bVar2;
        this.f19762f = dVar;
        this.f19760d = z5;
    }

    @Override // s4.b
    public final n4.c a(v vVar, l4.i iVar, t4.b bVar) {
        switch (this.f19757a) {
            case 0:
                return new n4.o(vVar, bVar, this);
            default:
                return new n4.p(vVar, bVar, this);
        }
    }

    public String toString() {
        switch (this.f19757a) {
            case 0:
                return "RectangleShape{position=" + this.f19761e + ", size=" + ((r4.e) this.f19762f) + '}';
            default:
                return super.toString();
        }
    }

    public i(String str, r4.e eVar, r4.a aVar, r4.b bVar, boolean z5) {
        this.f19758b = str;
        this.f19761e = eVar;
        this.f19762f = aVar;
        this.f19759c = bVar;
        this.f19760d = z5;
    }
}
