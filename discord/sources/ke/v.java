package ke;

import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import gc.w;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e4.r f14423e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ DecoderCounters f14424i;

    public /* synthetic */ v(e4.r rVar, DecoderCounters decoderCounters, int i7) {
        this.f14422d = i7;
        this.f14423e = rVar;
        this.f14424i = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14422d) {
            case 0:
                e4.r rVar = this.f14423e;
                DecoderCounters decoderCounters = this.f14424i;
                synchronized (decoderCounters) {
                }
                w wVar = (w) rVar.f8035i;
                int i7 = e0.f13788a;
                com.google.android.exoplayer2.c cVar = wVar.f9916d;
                hc.u uVar = (hc.u) cVar.f5659q;
                AnalyticsListener$EventTime analyticsListener$EventTimeF = uVar.f((md.s) uVar.f10474v.f397w);
                uVar.i(analyticsListener$EventTimeF, 1020, new hc.n(analyticsListener$EventTimeF, decoderCounters, 2));
                cVar.N = null;
                break;
            default:
                e4.r rVar2 = this.f14423e;
                DecoderCounters decoderCounters2 = this.f14424i;
                w wVar2 = (w) rVar2.f8035i;
                int i10 = e0.f13788a;
                hc.u uVar2 = (hc.u) wVar2.f9916d.f5659q;
                AnalyticsListener$EventTime analyticsListener$EventTimeH = uVar2.h();
                uVar2.i(analyticsListener$EventTimeH, 1015, new hc.n(analyticsListener$EventTimeH, decoderCounters2, 0));
                break;
        }
    }
}
