package io.sentry.android.replay.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tH\u0096\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lio/sentry/android/replay/util/ReplayRunnable;", "Ljava/lang/Runnable;", "taskName", "", "delegate", "(Ljava/lang/String;Ljava/lang/Runnable;)V", "getTaskName", "()Ljava/lang/String;", "run", "", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ReplayRunnable implements Runnable {
    public static final int $stable = 8;
    private final /* synthetic */ Runnable $$delegate_0;

    @NotNull
    private final String taskName;

    public ReplayRunnable(@NotNull String taskName, @NotNull Runnable delegate) {
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.taskName = taskName;
        this.$$delegate_0 = delegate;
    }

    @NotNull
    public final String getTaskName() {
        return this.taskName;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.$$delegate_0.run();
    }
}
