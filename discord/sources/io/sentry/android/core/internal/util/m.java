package io.sentry.android.core.internal.util;

import android.view.FrameMetrics;
import android.view.Window;
import androidx.metrics.performance.JankStats;
import io.sentry.android.core.k0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Window.OnFrameMetricsAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12319c;

    public /* synthetic */ m(int i7, Object obj, Object obj2) {
        this.f12317a = i7;
        this.f12318b = obj;
        this.f12319c = obj2;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i7) {
        switch (this.f12317a) {
            case 0:
                o.a((o) this.f12318b, (k0) this.f12319c, window, frameMetrics);
                break;
            default:
                x2.e this$0 = (x2.e) this.f12318b;
                JankStats jankStats = (JankStats) this.f12319c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(jankStats, "$jankStats");
                Intrinsics.checkNotNullExpressionValue(frameMetrics, "frameMetrics");
                long jMax = Math.max(this$0.o(frameMetrics), this$0.f22604i);
                if (jMax >= this$0.f22603h && jMax != this$0.f22602g) {
                    x2.c volatileFrameData = this$0.n(jMax, (long) (this$0.m(frameMetrics) * jankStats.f2430c), frameMetrics);
                    Intrinsics.checkNotNullParameter(volatileFrameData, "volatileFrameData");
                    jankStats.f2428a.a(volatileFrameData);
                    this$0.f22602g = jMax;
                    break;
                }
                break;
        }
    }
}
