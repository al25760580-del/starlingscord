package app.rive.core;

import android.content.res.Configuration;
import bc.j;
import com.discord.external_pip.ExternalPipTransitionView;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;
import com.google.android.exoplayer2.c;
import e4.r;
import gc.w;
import hc.u;
import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.SentryLevel;
import io.sentry.android.core.AppComponentsBreadcrumbsIntegration;
import io.sentry.android.replay.capture.BufferCaptureStrategy;
import io.sentry.protocol.e;
import java.util.Locale;
import je.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f2866e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2867i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f2868v;

    public /* synthetic */ a(Object obj, long j, Object obj2, int i7) {
        this.f2865d = i7;
        this.f2867i = obj;
        this.f2866e = j;
        this.f2868v = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f2865d;
        long j = this.f2866e;
        Object obj = this.f2868v;
        Object obj2 = this.f2867i;
        switch (i7) {
            case 0:
                CommandQueue.dispose$lambda$0((CommandQueue) obj2, j, (String) obj);
                break;
            case 1:
                ExternalPipTransitionView.fadeOut$lambda$0((ExternalPipTransitionView) obj2, j, (Function0) obj);
                break;
            case 2:
                AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration = (AppComponentsBreadcrumbsIntegration) obj2;
                Configuration configuration = (Configuration) obj;
                if (appComponentsBreadcrumbsIntegration.f12089e != null) {
                    int i10 = appComponentsBreadcrumbsIntegration.f12088d.getResources().getConfiguration().orientation;
                    e eVar = i10 != 1 ? i10 != 2 ? null : e.LANDSCAPE : e.PORTRAIT;
                    String lowerCase = eVar != null ? eVar.name().toLowerCase(Locale.ROOT) : "undefined";
                    Breadcrumb breadcrumb = new Breadcrumb(j);
                    breadcrumb.f12008w = "navigation";
                    breadcrumb.f12010y = "device.orientation";
                    breadcrumb.c(lowerCase, ViewProps.POSITION);
                    breadcrumb.F = SentryLevel.INFO;
                    Hint hint = new Hint();
                    hint.d(configuration, "android:configuration");
                    appComponentsBreadcrumbsIntegration.f12089e.g(breadcrumb, hint);
                }
                break;
            case 3:
                BufferCaptureStrategy.onScreenshotRecorded$lambda$2((BufferCaptureStrategy) obj2, (Function2) obj, j);
                break;
            default:
                w wVar = (w) ((r) obj2).f8035i;
                int i11 = e0.f13788a;
                c cVar = wVar.f9916d;
                u uVar = (u) cVar.f5659q;
                AnalyticsListener$EventTime analyticsListener$EventTimeH = uVar.h();
                uVar.i(analyticsListener$EventTimeH, 26, new j(j, analyticsListener$EventTimeH, obj));
                if (cVar.P == obj) {
                    cVar.f5654l.e(26, new gb.a(7));
                }
                break;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, long j, int i7) {
        this.f2865d = i7;
        this.f2867i = obj;
        this.f2868v = obj2;
        this.f2866e = j;
    }
}
