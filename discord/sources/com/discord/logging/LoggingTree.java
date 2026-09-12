package com.discord.logging;

import ct.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/discord/logging/LoggingTree;", "Lct/c;", "<init>", "()V", "", "priority", "", "tag", "message", "", "t", "", "log", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "logging_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoggingTree extends c {
    @Override // ct.c
    public void log(int priority, String tag, @NotNull String message, Throwable t5) {
        Intrinsics.checkNotNullParameter(message, "message");
        android.util.Log.println(priority, tag, message);
    }
}
