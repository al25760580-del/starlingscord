package gc;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v {
    public static hc.c0 a(Context context, com.google.android.exoplayer2.c cVar, boolean z5) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        hc.x xVar = mediaMetricsManager == null ? null : new hc.x(context, mediaMetricsManager.createPlaybackSession());
        if (xVar == null) {
            je.b.N("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new hc.c0(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z5) {
            hc.u uVar = (hc.u) cVar.f5659q;
            uVar.getClass();
            uVar.f10476x.a(xVar);
        }
        return new hc.c0(xVar.f10496c.getSessionId());
    }
}
