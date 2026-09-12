package com.discord.crash_reporting;

import com.discord.logging.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\r\u0010\r\u001a\u00020\tH\u0000¢\u0006\u0002\b\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/discord/crash_reporting/OnCrashRegistry;", "", "<init>", "()V", "LOG_TAG", "", "callbacks", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/Function0;", "", "register", "tag", "onCrash", "runAll", "runAll$crash_reporting_release", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OnCrashRegistry {

    @NotNull
    private static final String LOG_TAG = "OnCrashRegistry";

    @NotNull
    public static final OnCrashRegistry INSTANCE = new OnCrashRegistry();

    @NotNull
    private static final ConcurrentHashMap<String, Function0<Unit>> callbacks = new ConcurrentHashMap<>();

    private OnCrashRegistry() {
    }

    public final void register(@NotNull String tag, @NotNull Function0<Unit> onCrash) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(onCrash, "onCrash");
        callbacks.put(tag, onCrash);
    }

    public final void runAll$crash_reporting_release() {
        for (Map.Entry<String, Function0<Unit>> entry : callbacks.entrySet()) {
            String key = entry.getKey();
            try {
                entry.getValue().invoke();
            } catch (Throwable th2) {
                Log.INSTANCE.w(LOG_TAG, "On-crash callback failed for " + key, th2);
            }
        }
    }
}
