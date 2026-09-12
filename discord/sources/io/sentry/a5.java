package io.sentry;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public enum a5 implements y1 {
    TRACE(1),
    DEBUG(5),
    INFO(9),
    WARN(13),
    ERROR(17),
    FATAL(21);

    private final int severityNumber;

    a5(int i7) {
        this.severityNumber = i7;
    }

    public int getSeverityNumber() {
        return this.severityNumber;
    }

    @Override // io.sentry.y1
    public void serialize(@NotNull y2 y2Var, @NotNull ILogger iLogger) {
        y2Var.f(name().toLowerCase(Locale.ROOT));
    }
}
