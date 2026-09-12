package com.discord.crash_reporting.system_logs;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/discord/crash_reporting/system_logs/DebugPrintBuilder;", "", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "<init>", "(Ljava/lang/StringBuilder;)V", "getSb", "()Ljava/lang/StringBuilder;", "indentation", "", "appendLine", "", "s", "", "appendKeyValue", "key", "value", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDebugPrintable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugPrintable.kt\ncom/discord/crash_reporting/system_logs/DebugPrintBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n1#2:171\n*E\n"})
final class DebugPrintBuilder {
    private int indentation;

    @NotNull
    private final StringBuilder sb;

    public DebugPrintBuilder(@NotNull StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(sb2, "sb");
        this.sb = sb2;
    }

    public static /* synthetic */ void appendLine$default(DebugPrintBuilder debugPrintBuilder, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        debugPrintBuilder.appendLine(str);
    }

    public final void appendKeyValue(@NotNull String key, Object value) {
        String string;
        Intrinsics.checkNotNullParameter(key, "key");
        int i7 = this.indentation;
        for (int i10 = 0; i10 < i7; i10++) {
            this.sb.append("  ");
        }
        this.sb.append(" - ");
        this.sb.append(key);
        this.sb.append(": ");
        StringBuilder sb2 = this.sb;
        if (value == null || (string = value.toString()) == null) {
            string = "{null}";
        }
        sb2.append(string);
        this.sb.append('\n');
    }

    public final void appendLine(String s2) {
        StringBuilder sb2 = this.sb;
        sb2.append(s2);
        sb2.append('\n');
    }

    @NotNull
    public final StringBuilder getSb() {
        return this.sb;
    }
}
