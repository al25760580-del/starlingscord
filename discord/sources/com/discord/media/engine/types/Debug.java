package com.discord.media.engine.types;

import com.discord.logging.Log;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\rJ.\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012H\u0086\bø\u0001\u0000J6\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012H\u0086\bø\u0001\u0000J\u001b\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000bH\u0086\bJ#\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0086\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"Lcom/discord/media/engine/types/Debug;", "", "<init>", "()V", "ENABLE", "", "ENABLE_ON_FRAME_DEBUG", "LOG_ON_FRAME_INTERVAL", "", "LOG_ON_FRAME_RESET_INTERVAL", "LOG_TAG", "", "logDebugLoggingConfig", "", "log", "tag", "method", "lazyMsg", "Lkotlin/Function0;", "startNs", "", "TAG", "media_engine_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Debug {
    public static final boolean ENABLE = false;
    public static final boolean ENABLE_ON_FRAME_DEBUG = false;

    @NotNull
    public static final Debug INSTANCE = new Debug();
    public static final int LOG_ON_FRAME_INTERVAL = 100;
    public static final int LOG_ON_FRAME_RESET_INTERVAL = 500;

    @NotNull
    private static final String LOG_TAG = "media_engine";

    @NotNull
    private static final String TAG = "Debug";

    private Debug() {
    }

    public static /* synthetic */ void log$default(Debug debug, String tag, String method, Function0 lazyMsg, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            method = "";
        }
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(lazyMsg, "lazyMsg");
    }

    public final void log(@NotNull String tag, @NotNull String method) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(method, "method");
    }

    public final void logDebugLoggingConfig() {
        Log.i$default(Log.INSTANCE, TAG, "MediaEngine debug logging disabled.", (Throwable) null, 4, (Object) null);
    }

    public static /* synthetic */ void log$default(Debug debug, String tag, String method, long j, Function0 lazyMsg, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            method = "";
        }
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(lazyMsg, "lazyMsg");
    }

    public final void log(@NotNull String tag, @NotNull String method, long startNs) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(method, "method");
    }

    public static /* synthetic */ void log$default(Debug debug, String tag, String method, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            method = "";
        }
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(method, "method");
    }

    public final void log(@NotNull String tag, @NotNull String method, long startNs, @NotNull Function0<? extends Object> lazyMsg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(lazyMsg, "lazyMsg");
    }

    public final void log(@NotNull String tag, @NotNull String method, @NotNull Function0<? extends Object> lazyMsg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(lazyMsg, "lazyMsg");
    }

    public static /* synthetic */ void log$default(Debug debug, String tag, String method, long j, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            method = "";
        }
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(method, "method");
    }
}
