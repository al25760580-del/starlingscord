package io.sentry.android.replay;

import android.os.Handler;
import io.sentry.android.replay.util.MainLooperHandler;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lio/sentry/android/replay/ExecutorProvider;", "", "getBackgroundHandler", "Landroid/os/Handler;", "getExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "getMainLooperHandler", "Lio/sentry/android/replay/util/MainLooperHandler;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ExecutorProvider {
    @NotNull
    Handler getBackgroundHandler();

    @NotNull
    ScheduledExecutorService getExecutor();

    @NotNull
    MainLooperHandler getMainLooperHandler();
}
