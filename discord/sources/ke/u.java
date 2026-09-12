package ke;

import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;
import gc.w;
import io.sentry.Breadcrumb;
import io.sentry.SentryLevel;
import io.sentry.android.core.AppComponentsBreadcrumbsIntegration;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14419e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f14420i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f14421v;

    public /* synthetic */ u(e4.r rVar, int i7, long j) {
        this.f14418d = 0;
        this.f14419e = rVar;
        this.f14421v = i7;
        this.f14420i = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f14418d;
        int i10 = this.f14421v;
        long j = this.f14420i;
        Object obj = this.f14419e;
        switch (i7) {
            case 0:
                w wVar = (w) ((e4.r) obj).f8035i;
                int i11 = e0.f13788a;
                hc.u uVar = (hc.u) wVar.f9916d.f5659q;
                AnalyticsListener$EventTime analyticsListener$EventTimeF = uVar.f((md.s) uVar.f10474v.f397w);
                uVar.i(analyticsListener$EventTimeF, 1018, new hc.q(analyticsListener$EventTimeF, i10, j));
                break;
            case 1:
                w wVar2 = (w) ((e4.r) obj).f8035i;
                int i12 = e0.f13788a;
                hc.u uVar2 = (hc.u) wVar2.f9916d.f5659q;
                AnalyticsListener$EventTime analyticsListener$EventTimeF2 = uVar2.f((md.s) uVar2.f10474v.f397w);
                uVar2.i(analyticsListener$EventTimeF2, 1021, new hc.q(analyticsListener$EventTimeF2, j, i10));
                break;
            default:
                AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration = (AppComponentsBreadcrumbsIntegration) obj;
                if (appComponentsBreadcrumbsIntegration.f12089e != null) {
                    Breadcrumb breadcrumb = new Breadcrumb(j);
                    breadcrumb.f12008w = "system";
                    breadcrumb.f12010y = "device.event";
                    breadcrumb.f12007v = "Low memory";
                    breadcrumb.c("LOW_MEMORY", "action");
                    breadcrumb.c(Integer.valueOf(i10), "level");
                    breadcrumb.F = SentryLevel.WARNING;
                    appComponentsBreadcrumbsIntegration.f12089e.g(breadcrumb, AppComponentsBreadcrumbsIntegration.f12087w);
                }
                break;
        }
    }

    public /* synthetic */ u(Object obj, long j, int i7, int i10) {
        this.f14418d = i10;
        this.f14419e = obj;
        this.f14420i = j;
        this.f14421v = i7;
    }
}
