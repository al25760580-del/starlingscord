package com.discord.logging;

import ct.a;
import ct.b;
import ct.c;
import ct.d;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\t0\t0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/discord/logging/LoggingLineNumberTree;", "Lct/c;", "<init>", "()V", "Ljava/lang/StackTraceElement;", "getCalleStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "priority", "", "tag", "message", "", "t", "", "log", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "", "kotlin.jvm.PlatformType", "ignoreClasses", "Ljava/util/List;", "logging_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLoggingLineNumberTree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoggingLineNumberTree.kt\ncom/discord/logging/LoggingLineNumberTree\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,32:1\n1137#2,2:33\n*S KotlinDebug\n*F\n+ 1 LoggingLineNumberTree.kt\ncom/discord/logging/LoggingLineNumberTree\n*L\n30#1:33,2\n*E\n"})
public final class LoggingLineNumberTree extends c {

    @NotNull
    private final List<String> ignoreClasses = d0.g(d.class.getName(), b.class.getName(), c.class.getName(), a.class.getName(), LoggingLineNumberTree.class.getName(), Log.class.getName());

    private final StackTraceElement getCalleStackTraceElement() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!this.ignoreClasses.contains(stackTraceElement.getClassName())) {
                Intrinsics.checkNotNullExpressionValue(stackTraceElement, "first(...)");
                return stackTraceElement;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // ct.c
    public void log(int priority, String tag, @NotNull String message, Throwable t5) {
        Intrinsics.checkNotNullParameter(message, "message");
        StackTraceElement calleStackTraceElement = getCalleStackTraceElement();
        android.util.Log.println(priority, tag + "/(" + calleStackTraceElement.getFileName() + ":" + calleStackTraceElement.getLineNumber() + ")", message);
    }
}
