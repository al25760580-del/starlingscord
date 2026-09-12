package com.discord.misc.utilities.backoff;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/discord/misc/utilities/backoff/MaxAttemptsExceededException;", "Ljava/lang/Exception;", "message", "", "<init>", "(Ljava/lang/String;)V", "misc_utilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MaxAttemptsExceededException extends Exception {
    /* JADX WARN: Multi-variable type inference failed */
    public MaxAttemptsExceededException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ MaxAttemptsExceededException(String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str);
    }

    public MaxAttemptsExceededException(String str) {
        super(str == null ? "Max attempts exceeded" : str);
    }
}
