package ar;

import com.discord.crash_reporting.TelemetryRing;
import com.discord.jank_stats.JankSessionRecorder;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t1 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2968a;

    public /* synthetic */ t1(int i7) {
        this.f2968a = i7;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f2968a) {
            case 0:
                Thread thread = new Thread(runnable, "AppSingleThread");
                thread.setDaemon(true);
                return thread;
            case 1:
                return TelemetryRing.ioExecutor_delegate$lambda$2$lambda$1(runnable);
            case 2:
                return JankSessionRecorder.flushExecutor_delegate$lambda$2$lambda$1(runnable);
            default:
                Thread thread2 = new Thread(runnable);
                thread2.setPriority(1);
                return thread2;
        }
    }
}
