package x2;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import androidx.metrics.performance.JankStats;
import com.discord.R;
import e4.i;
import io.sentry.android.core.internal.util.m;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class e extends ud.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Handler f22600l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Window f22601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f22602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f22603h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f22604i;
    public final c j;
    public final m k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(JankStats jankStats, View view, Window window) {
        super(jankStats, view);
        Intrinsics.checkNotNullParameter(jankStats, "jankStats");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(jankStats, "jankStats");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f22601f = window;
        this.j = new c((ArrayList) this.f21069d);
        this.k = new m(1, this, jankStats);
    }

    public static a p(Window window) {
        a aVar = (a) window.getDecorView().getTag(R.id.metricsDelegator);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(new ArrayList());
        if (f22600l == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            handlerThread.start();
            f22600l = new Handler(handlerThread.getLooper());
        }
        window.addOnFrameMetricsAvailableListener(aVar2, f22600l);
        window.getDecorView().setTag(R.id.metricsDelegator, aVar2);
        return aVar2;
    }

    public static void q(Window window, m delegate) {
        a aVar = (a) window.getDecorView().getTag(R.id.metricsDelegator);
        if (aVar != null) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            Intrinsics.checkNotNullParameter(window, "window");
            synchronized (aVar) {
                try {
                    if (aVar.f22593b) {
                        aVar.f22595d.add(delegate);
                    } else {
                        boolean zIsEmpty = aVar.f22592a.isEmpty();
                        aVar.f22592a.remove(delegate);
                        if (!zIsEmpty && aVar.f22592a.isEmpty()) {
                            window.removeOnFrameMetricsAvailableListener(aVar);
                            window.getDecorView().setTag(R.id.metricsDelegator, null);
                        }
                        Unit unit = Unit.f14616a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public long m(FrameMetrics metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        View view = (View) ((WeakReference) this.f21066a).get();
        Field field = b.f22596d;
        if (ud.d.f21065e < 0) {
            Window window = null;
            if ((view != null ? view.getContext() : null) instanceof Activity) {
                Context context = view.getContext();
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
                window = ((Activity) context).getWindow();
            }
            float f2 = 60.0f;
            float refreshRate = window != null ? window.getWindowManager().getDefaultDisplay().getRefreshRate() : 60.0f;
            if (refreshRate >= 30.0f && refreshRate <= 200.0f) {
                f2 = refreshRate;
            }
            ud.d.f21065e = (long) ((1000 / f2) * 1000000);
        }
        return ud.d.f21065e;
    }

    public c n(long j, long j5, FrameMetrics frameMetrics) {
        Intrinsics.checkNotNullParameter(frameMetrics, "frameMetrics");
        long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
        this.f22604i = j + metric;
        i iVar = ((h) this.f21068c).f22606a;
        if (iVar != null) {
            iVar.l((ArrayList) this.f21069d);
        }
        boolean z5 = metric > j5;
        long metric2 = frameMetrics.getMetric(8);
        c cVar = this.j;
        cVar.f2425b = j;
        cVar.f2426c = metric;
        cVar.f2427d = z5;
        cVar.f22597e = metric2;
        return cVar;
    }

    public long o(FrameMetrics frameMetrics) throws IllegalAccessException {
        Intrinsics.checkNotNullParameter(frameMetrics, "frameMetrics");
        Object obj = b.f22596d.get((Choreographer) this.f21067b);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) obj).longValue();
    }

    public final void r(boolean z5) {
        synchronized (this.f22601f) {
            try {
                if (!z5) {
                    q(this.f22601f, this.k);
                    this.f22603h = 0L;
                } else if (this.f22603h == 0) {
                    a aVarP = p(this.f22601f);
                    m delegate = this.k;
                    Intrinsics.checkNotNullParameter(delegate, "delegate");
                    synchronized (aVarP) {
                        try {
                            if (aVarP.f22593b) {
                                aVarP.f22594c.add(delegate);
                            } else {
                                aVarP.f22592a.add(delegate);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    this.f22603h = System.nanoTime();
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
