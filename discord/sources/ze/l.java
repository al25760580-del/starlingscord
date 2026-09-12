package ze;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f23944a;

    public l(e eVar) {
        this.f23944a = eVar;
    }

    @Override // ze.b
    public final void a(boolean z5) {
        eg.a aVar = this.f23944a.K;
        aVar.sendMessage(aVar.obtainMessage(1, Boolean.valueOf(z5)));
    }
}
