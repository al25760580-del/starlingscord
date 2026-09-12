package io.sentry.android.core.internal.util;

import android.os.Handler;
import android.view.Window;
import io.sentry.SentryLevel;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f12314e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Window f12315i;

    public /* synthetic */ k(o oVar, Window window, int i7) {
        this.f12313d = i7;
        this.f12314e = oVar;
        this.f12315i = window;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12313d) {
            case 0:
                o oVar = this.f12314e;
                CopyOnWriteArraySet copyOnWriteArraySet = oVar.f12321e;
                Window window = this.f12315i;
                if (copyOnWriteArraySet.add(window)) {
                    try {
                        d dVar = oVar.E;
                        m mVar = oVar.F;
                        Handler handler = oVar.f12323v;
                        dVar.getClass();
                        if (mVar != null) {
                            window.addOnFrameMetricsAvailableListener(mVar, handler);
                        }
                    } catch (Throwable th2) {
                        oVar.f12322i.g(SentryLevel.ERROR, "Failed to add frameMetricsAvailableListener", th2);
                        return;
                    }
                }
                break;
            default:
                o oVar2 = this.f12314e;
                Window window2 = this.f12315i;
                try {
                    if (oVar2.f12321e.remove(window2)) {
                        d dVar2 = oVar2.E;
                        m mVar2 = oVar2.F;
                        dVar2.getClass();
                        if (mVar2 != null) {
                            window2.removeOnFrameMetricsAvailableListener(mVar2);
                        }
                    }
                } catch (Throwable th3) {
                    oVar2.f12322i.g(SentryLevel.ERROR, "Failed to remove frameMetricsAvailableListener", th3);
                }
                break;
        }
    }
}
