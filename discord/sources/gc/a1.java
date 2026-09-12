package gc;

import android.util.Pair;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a1 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e4.c f9557e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Pair f9558i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ LoadEventInfo f9559v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MediaLoadData f9560w;

    public /* synthetic */ a1(e4.c cVar, Pair pair, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i7) {
        this.f9556d = i7;
        this.f9557e = cVar;
        this.f9558i = pair;
        this.f9559v = loadEventInfo;
        this.f9560w = mediaLoadData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9556d) {
            case 0:
                hc.a aVar = (hc.a) ((g1) this.f9557e.f7967i).f9667i;
                Pair pair = this.f9558i;
                ((hc.u) aVar).n(((Integer) pair.first).intValue(), (md.s) pair.second, this.f9559v, this.f9560w);
                break;
            case 1:
                hc.a aVar2 = (hc.a) ((g1) this.f9557e.f7967i).f9667i;
                Pair pair2 = this.f9558i;
                ((hc.u) aVar2).w(((Integer) pair2.first).intValue(), (md.s) pair2.second, this.f9559v, this.f9560w);
                break;
            default:
                hc.a aVar3 = (hc.a) ((g1) this.f9557e.f7967i).f9667i;
                Pair pair3 = this.f9558i;
                ((hc.u) aVar3).m(((Integer) pair3.first).intValue(), (md.s) pair3.second, this.f9559v, this.f9560w);
                break;
        }
    }
}
