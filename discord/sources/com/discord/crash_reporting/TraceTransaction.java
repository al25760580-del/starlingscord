package com.discord.crash_reporting;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/discord/crash_reporting/TraceTransaction;", "", "transactionName", "", "operation", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getTransactionName", "()Ljava/lang/String;", "getOperation", "NativeModuleInit", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum TraceTransaction {
    NativeModuleInit("Content Appeared", "ui");

    private static final /* synthetic */ EnumEntries $ENTRIES = com.facebook.imagepipeline.nativecode.b.l(values());

    @NotNull
    private final String operation;

    @NotNull
    private final String transactionName;

    TraceTransaction(String str, String str2) {
        this.transactionName = str;
        this.operation = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getOperation() {
        return this.operation;
    }

    @NotNull
    public final String getTransactionName() {
        return this.transactionName;
    }
}
