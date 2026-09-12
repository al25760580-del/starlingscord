package com.discord.js_watchdog;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"LOG_TAG", "", "STALL_THRESHOLD_MS", "", "JS_PING_INTERVAL_MS", "FREEZE_CHECK_INTERVAL_MS", "FREEZE_CHECK_DELAY_MS", "js_watchdog_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class JSWatchdogManagerKt {
    public static final int FREEZE_CHECK_DELAY_MS = 1500;
    public static final int FREEZE_CHECK_INTERVAL_MS = 1000;
    public static final int JS_PING_INTERVAL_MS = 500;

    @NotNull
    public static final String LOG_TAG = "JSWatchdogManager";
    public static final int STALL_THRESHOLD_MS = 1000;
}
