package com.discord.jank_stats;

import android.view.FrameMetrics;
import android.view.Window;
import com.facebook.react.devsupport.inspector.FrameTimingsObserver;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Window.OnFrameMetricsAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4403b;

    public /* synthetic */ a(int i7, Object obj) {
        this.f4402a = i7;
        this.f4403b = obj;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i7) {
        switch (this.f4402a) {
            case 0:
                FrameMetricsFrameTracker.listener$lambda$0((FrameMetricsFrameTracker) this.f4403b, window, frameMetrics, i7);
                break;
            default:
                FrameTimingsObserver.frameMetricsListener$lambda$0((FrameTimingsObserver) this.f4403b, window, frameMetrics, i7);
                break;
        }
    }
}
