package com.discord.js_watchdog;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/discord/js_watchdog/SharedPreferencesKey;", "", "<init>", "()V", "STALL_TIME", "", "SESSION_ID", "TRACE", "js_watchdog_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class SharedPreferencesKey {

    @NotNull
    public static final SharedPreferencesKey INSTANCE = new SharedPreferencesKey();

    @NotNull
    public static final String SESSION_ID = "session_id";

    @NotNull
    public static final String STALL_TIME = "stall_time";

    @NotNull
    public static final String TRACE = "trace";

    private SharedPreferencesKey() {
    }
}
