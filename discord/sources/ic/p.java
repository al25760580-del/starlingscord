package ic;

import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e4.l f11596e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Exception f11597i;

    public /* synthetic */ p(e4.l lVar, Exception exc, int i7) {
        this.f11595d = i7;
        this.f11596e = lVar;
        this.f11597i = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f11595d;
        Exception exc = this.f11597i;
        e4.l lVar = this.f11596e;
        switch (i7) {
            case 0:
                gc.w wVar = (gc.w) lVar.f7990i;
                int i10 = je.e0.f13788a;
                hc.u uVar = (hc.u) wVar.f9916d.f5659q;
                AnalyticsListener$EventTime analyticsListener$EventTimeH = uVar.h();
                uVar.i(analyticsListener$EventTimeH, 1029, new hc.r(analyticsListener$EventTimeH, exc, 3));
                break;
            default:
                gc.w wVar2 = (gc.w) lVar.f7990i;
                int i11 = je.e0.f13788a;
                hc.u uVar2 = (hc.u) wVar2.f9916d.f5659q;
                AnalyticsListener$EventTime analyticsListener$EventTimeH2 = uVar2.h();
                uVar2.i(analyticsListener$EventTimeH2, 1014, new hc.r(analyticsListener$EventTimeH2, exc, 0));
                break;
        }
    }
}
