package c5;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f3500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f3501e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n f3502i;

    public k(n nVar, String str, long j) {
        this.f3502i = nVar;
        this.f3500d = str;
        this.f3501e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.f3502i;
        nVar.mEventLog.a(this.f3501e, this.f3500d);
        nVar.mEventLog.b(nVar.toString());
    }
}
