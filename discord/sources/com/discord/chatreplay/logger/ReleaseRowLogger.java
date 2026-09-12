package com.discord.chatreplay.logger;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"Lcom/discord/chatreplay/logger/ReleaseRowLogger;", "Lcom/discord/chatreplay/logger/RowLogger;", "<init>", "()V", "logRowsUpdate", "", "rowsJson", "", "logRowsClear", "chat_replay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReleaseRowLogger implements RowLogger {
    @Override // com.discord.chatreplay.logger.RowLogger
    public void logRowsClear() {
    }

    @Override // com.discord.chatreplay.logger.RowLogger
    public void logRowsUpdate(@NotNull String rowsJson) {
        Intrinsics.checkNotNullParameter(rowsJson, "rowsJson");
    }
}
