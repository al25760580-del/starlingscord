package gc;

import android.util.Pair;
import com.google.android.exoplayer2.source.MediaLoadData;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c1 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e4.c f9583e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Pair f9584i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MediaLoadData f9585v;

    public /* synthetic */ c1(e4.c cVar, Pair pair, MediaLoadData mediaLoadData, int i7) {
        this.f9582d = i7;
        this.f9583e = cVar;
        this.f9584i = pair;
        this.f9585v = mediaLoadData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9582d) {
            case 0:
                hc.a aVar = (hc.a) ((g1) this.f9583e.f7967i).f9667i;
                Pair pair = this.f9584i;
                ((hc.u) aVar).j(((Integer) pair.first).intValue(), (md.s) pair.second, this.f9585v);
                break;
            default:
                hc.a aVar2 = (hc.a) ((g1) this.f9583e.f7967i).f9667i;
                Pair pair2 = this.f9584i;
                int iIntValue = ((Integer) pair2.first).intValue();
                md.s sVar = (md.s) pair2.second;
                sVar.getClass();
                ((hc.u) aVar2).x(iIntValue, sVar, this.f9585v);
                break;
        }
    }
}
