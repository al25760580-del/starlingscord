package ic;

import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;
import com.google.android.exoplayer2.decoder.DecoderCounters;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e4.l f11609e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ DecoderCounters f11610i;

    public /* synthetic */ q(e4.l lVar, DecoderCounters decoderCounters, int i7) {
        this.f11608d = i7;
        this.f11609e = lVar;
        this.f11610i = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11608d) {
            case 0:
                e4.l lVar = this.f11609e;
                DecoderCounters decoderCounters = this.f11610i;
                gc.w wVar = (gc.w) lVar.f7990i;
                int i7 = je.e0.f13788a;
                hc.u uVar = (hc.u) wVar.f9916d.f5659q;
                AnalyticsListener$EventTime analyticsListener$EventTimeH = uVar.h();
                uVar.i(analyticsListener$EventTimeH, 1007, new hc.n(analyticsListener$EventTimeH, decoderCounters, 3));
                break;
            default:
                e4.l lVar2 = this.f11609e;
                DecoderCounters decoderCounters2 = this.f11610i;
                synchronized (decoderCounters2) {
                }
                gc.w wVar2 = (gc.w) lVar2.f7990i;
                int i10 = je.e0.f13788a;
                hc.u uVar2 = (hc.u) wVar2.f9916d.f5659q;
                AnalyticsListener$EventTime analyticsListener$EventTimeF = uVar2.f((md.s) uVar2.f10474v.f397w);
                uVar2.i(analyticsListener$EventTimeF, 1013, new hc.n(analyticsListener$EventTimeF, decoderCounters2, 1));
                break;
        }
    }
}
