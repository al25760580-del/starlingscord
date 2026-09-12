package io.sentry.android.replay.util;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lio/sentry/android/replay/util/MainLooperHandler;", "", "looper", "Landroid/os/Looper;", "(Landroid/os/Looper;)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "post", "", "runnable", "Ljava/lang/Runnable;", "postDelayed", "delay", "", "removeCallbacks", "", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MainLooperHandler {
    public static final int $stable = 8;

    @NotNull
    private final Handler handler;

    /* JADX WARN: Multi-variable type inference failed */
    public MainLooperHandler() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final Handler getHandler() {
        return this.handler;
    }

    public final boolean post(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        return this.handler.post(runnable);
    }

    public final boolean postDelayed(Runnable runnable, long delay) {
        Handler handler = this.handler;
        if (runnable == null) {
            return false;
        }
        return handler.postDelayed(runnable, delay);
    }

    public final void removeCallbacks(Runnable runnable) {
        Handler handler = this.handler;
        if (runnable == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }

    public MainLooperHandler(@NotNull Looper looper) {
        Intrinsics.checkNotNullParameter(looper, "looper");
        this.handler = new Handler(looper);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MainLooperHandler(Looper looper, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i7 & 1) != 0) {
            looper = Looper.getMainLooper();
            Intrinsics.checkNotNullExpressionValue(looper, "getMainLooper(...)");
        }
        this(looper);
    }
}
