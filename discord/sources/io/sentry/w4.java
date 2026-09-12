package io.sentry;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public enum w4 implements y1 {
    Session("session"),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile("profile"),
    ProfileChunk("profile_chunk"),
    ClientReport("client_report"),
    ReplayEvent("replay_event"),
    ReplayRecording("replay_recording"),
    ReplayVideo("replay_video"),
    CheckIn("check_in"),
    Feedback("feedback"),
    Log("log"),
    TraceMetric("trace_metric"),
    Span("span"),
    Unknown("__unknown__");

    private final String itemType;

    w4(String str) {
        this.itemType = str;
    }

    public static w4 resolve(Object obj) {
        if (obj instanceof SentryEvent) {
            return ((io.sentry.protocol.i) ((SentryEvent) obj).f12671e.x(io.sentry.protocol.i.class, "feedback")) == null ? Event : Feedback;
        }
        if (obj instanceof io.sentry.protocol.d0) {
            return Transaction;
        }
        if (obj instanceof h6) {
            return Session;
        }
        return obj instanceof io.sentry.clientreport.b ? ClientReport : Attachment;
    }

    @NotNull
    public static w4 valueOfLabel(String str) {
        for (w4 w4Var : values()) {
            if (w4Var.itemType.equals(str)) {
                return w4Var;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.y1
    public void serialize(@NotNull y2 y2Var, @NotNull ILogger iLogger) {
        y2Var.f(this.itemType);
    }
}
