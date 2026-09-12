package com.discord.chatreplay.logger;

import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"outputStream", "Ljava/io/FileOutputStream;", "Ljava/io/File;", "append", "", "chat_replay_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class DebugRowLoggerKt {
    @NotNull
    public static final FileOutputStream outputStream(@NotNull File file, boolean z5) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new FileOutputStream(file, z5);
    }
}
