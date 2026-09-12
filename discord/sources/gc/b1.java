package gc;

import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b1 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e4.c f9572e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Pair f9573i;

    public /* synthetic */ b1(e4.c cVar, Pair pair, int i7) {
        this.f9571d = i7;
        this.f9572e = cVar;
        this.f9573i = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9571d) {
            case 0:
                hc.a aVar = (hc.a) ((g1) this.f9572e.f7967i).f9667i;
                Pair pair = this.f9573i;
                ((hc.u) aVar).b(((Integer) pair.first).intValue(), (md.s) pair.second);
                break;
            case 1:
                hc.a aVar2 = (hc.a) ((g1) this.f9572e.f7967i).f9667i;
                Pair pair2 = this.f9573i;
                ((hc.u) aVar2).u(((Integer) pair2.first).intValue(), (md.s) pair2.second);
                break;
            default:
                hc.a aVar3 = (hc.a) ((g1) this.f9572e.f7967i).f9667i;
                Pair pair3 = this.f9573i;
                ((hc.u) aVar3).t(((Integer) pair3.first).intValue(), (md.s) pair3.second);
                break;
        }
    }
}
