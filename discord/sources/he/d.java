package he;

import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10593e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f10594i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f10595v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f10596w;

    public /* synthetic */ d(Object obj, int i7, long j, long j5, int i10) {
        this.f10592d = i10;
        this.f10596w = obj;
        this.f10593e = i7;
        this.f10594i = j;
        this.f10595v = j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f10592d;
        Object obj = this.f10596w;
        switch (i7) {
            case 0:
                ((e) obj).f10600b.a(this.f10593e, this.f10594i, this.f10595v);
                break;
            default:
                gc.w wVar = (gc.w) ((e4.l) obj).f7990i;
                int i10 = je.e0.f13788a;
                hc.u uVar = (hc.u) wVar.f9916d.f5659q;
                AnalyticsListener$EventTime analyticsListener$EventTimeH = uVar.h();
                uVar.i(analyticsListener$EventTimeH, 1011, new hc.f(analyticsListener$EventTimeH, this.f10593e, this.f10594i, this.f10595v, 0));
                break;
        }
    }
}
