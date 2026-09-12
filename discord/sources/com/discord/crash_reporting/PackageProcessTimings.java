package com.discord.crash_reporting;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/discord/crash_reporting/PackageProcessTimings;", "", "<init>", "()V", "modules", "", "", "getModules", "()Ljava/util/List;", "endTime", "", "getEndTime", "()J", "setEndTime", "(J)V", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PackageProcessTimings {
    private long endTime;

    @NotNull
    private final List<String> modules = new ArrayList();

    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final List<String> getModules() {
        return this.modules;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }
}
