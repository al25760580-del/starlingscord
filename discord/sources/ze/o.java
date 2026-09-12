package ze;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends ye.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ye.i f23958b;

    public o(ye.i iVar) {
        this.f23958b = iVar;
    }

    public final ue.g a(ue.g gVar) {
        gVar.zak();
        ye.i iVar = this.f23958b;
        e eVar = iVar.j;
        eVar.getClass();
        u uVar = new u(new w(gVar), eVar.F.get(), iVar);
        eg.a aVar = eVar.K;
        aVar.sendMessage(aVar.obtainMessage(4, uVar));
        return gVar;
    }
}
