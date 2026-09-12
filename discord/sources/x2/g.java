package x2;

import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import androidx.metrics.performance.JankStats;
import e4.i;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f22605m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(JankStats jankStats, View view, Window window) {
        super(jankStats, view, window);
        Intrinsics.checkNotNullParameter(jankStats, "jankStats");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(window, "window");
        ArrayList states = (ArrayList) this.f21069d;
        Intrinsics.checkNotNullParameter(states, "states");
        d dVar = new d(states);
        dVar.f22598f = 0L;
        dVar.f22599g = 0L;
        this.f22605m = dVar;
    }

    @Override // x2.e
    public final long m(FrameMetrics metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        return metrics.getMetric(13);
    }

    @Override // x2.e
    public final c n(long j, long j5, FrameMetrics frameMetrics) {
        Intrinsics.checkNotNullParameter(frameMetrics, "frameMetrics");
        long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
        this.f22604i = j + metric;
        i iVar = ((h) this.f21068c).f22606a;
        if (iVar != null) {
            iVar.l((ArrayList) this.f21069d);
        }
        boolean z5 = metric > j5;
        long metric2 = frameMetrics.getMetric(8);
        long metric3 = frameMetrics.getMetric(7) + (metric2 - frameMetrics.getMetric(12));
        long metric4 = metric2 - frameMetrics.getMetric(13);
        d dVar = this.f22605m;
        dVar.f2425b = j;
        dVar.f2426c = metric;
        dVar.f2427d = z5;
        dVar.f22597e = metric3;
        dVar.f22598f = metric2;
        dVar.f22599g = metric4;
        return dVar;
    }
}
