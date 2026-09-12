package zh;

import a5.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f23992e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f23993i;

    public /* synthetic */ f(int i7, Object obj) {
        this.f23992e = i7;
        this.f23993i = obj;
    }

    @Override // zh.e
    public final void a() {
        switch (this.f23992e) {
            case 0:
                g gVar = (g) this.f23993i;
                if (gVar.f24005m != null) {
                    gVar.f23996b.a("Unbind from service.", new Object[0]);
                    gVar.f23995a.unbindService(gVar.f24004l);
                    gVar.f24001g = false;
                    gVar.f24005m = null;
                    gVar.f24004l = null;
                }
                gVar.b();
                break;
            default:
                g gVar2 = (g) ((d0) this.f23993i).f177e;
                gVar2.f23996b.a("unlinkToDeath", new Object[0]);
                gVar2.f24005m.asBinder().unlinkToDeath(gVar2.j, 0);
                gVar2.f24005m = null;
                gVar2.f24001g = false;
                break;
        }
    }
}
