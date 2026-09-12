package ci;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ig.g f3697e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c0 f3698i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d f3699v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(d dVar, ig.g gVar, ig.g gVar2, c0 c0Var) {
        super(gVar);
        this.f3697e = gVar2;
        this.f3698i = c0Var;
        this.f3699v = dVar;
    }

    @Override // ci.c0
    public final void b() {
        d dVar = this.f3699v;
        synchronized (dVar.f3690f) {
            try {
                ig.g gVar = this.f3697e;
                dVar.f3689e.add(gVar);
                gVar.f11763a.addOnCompleteListener(new e4.r(4, dVar, gVar));
                if (dVar.f3694l.getAndIncrement() > 0) {
                    dVar.f3686b.b("Already connected to the service.", new Object[0]);
                }
                d.b(dVar, this.f3698i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
