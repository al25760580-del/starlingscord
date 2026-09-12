package com.discord.crash_reporting;

import a3.e;
import com.discord.logging.Log;
import kotlin.Metadata;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0018J'\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u0018J'\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u0018J'\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u0018J'\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\u0018J'\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010\u001aJ'\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/discord/crash_reporting/FLogDelegate;", "Lo8/c;", "<init>", "()V", "Lcom/discord/crash_reporting/CrashReporting$BreadcrumbLevel;", "level", "", "message", "", "throwable", "", "addSentryBreadcrumb", "(Lcom/discord/crash_reporting/CrashReporting$BreadcrumbLevel;Ljava/lang/String;Ljava/lang/Throwable;)V", "", "setMinimumLoggingLevel", "(I)V", "getMinimumLoggingLevel", "()I", "", "isLoggable", "(I)Z", "tag", "msg", "v", "(Ljava/lang/String;Ljava/lang/String;)V", "tr", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "d", "i", "w", "e", "wtf", "priority", "log", "(ILjava/lang/String;Ljava/lang/String;)V", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FLogDelegate implements o8.c {
    private final void addSentryBreadcrumb(CrashReporting.BreadcrumbLevel level, String message, Throwable throwable) {
        CrashReporting.INSTANCE.addBreadcrumb(message, throwable == null ? w0.d() : e.v("stacktrace", f.b(throwable)), "react.native", level, false);
    }

    public static /* synthetic */ void addSentryBreadcrumb$default(FLogDelegate fLogDelegate, CrashReporting.BreadcrumbLevel breadcrumbLevel, String str, Throwable th2, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            th2 = null;
        }
        fLogDelegate.addSentryBreadcrumb(breadcrumbLevel, str, th2);
    }

    @Override // o8.c
    public void d(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        o8.b bVar = o8.b.f17172b;
        o8.b.a(3, tag, msg);
    }

    @Override // o8.c
    public void e(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Log.e$default(Log.INSTANCE, tag, msg, (Throwable) null, 4, (Object) null);
        addSentryBreadcrumb$default(this, CrashReporting.BreadcrumbLevel.ERROR, msg, null, 4, null);
    }

    public int getMinimumLoggingLevel() {
        return o8.b.f17172b.f17173a;
    }

    @Override // o8.c
    public void i(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Log.i$default(Log.INSTANCE, tag, msg, (Throwable) null, 4, (Object) null);
    }

    @Override // o8.c
    public boolean isLoggable(int level) {
        return o8.b.f17172b.isLoggable(level);
    }

    public void log(int priority, @NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        switch (priority) {
            case 2:
                v(tag, msg);
                break;
            case 3:
                d(tag, msg);
                break;
            case 4:
                i(tag, msg);
                break;
            case 5:
                w(tag, msg);
                break;
            case 6:
                e(tag, msg);
                break;
            case 7:
                wtf(tag, msg);
                break;
            default:
                d(tag, msg);
                break;
        }
    }

    public void setMinimumLoggingLevel(int level) {
        o8.b.f17172b.f17173a = level;
    }

    @Override // o8.c
    public void v(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        o8.b bVar = o8.b.f17172b;
        o8.b.a(2, tag, msg);
    }

    @Override // o8.c
    public void w(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Log.w$default(Log.INSTANCE, tag, msg, (Throwable) null, 4, (Object) null);
        addSentryBreadcrumb$default(this, CrashReporting.BreadcrumbLevel.WARNING, msg, null, 4, null);
    }

    @Override // o8.c
    public void wtf(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Log.e$default(Log.INSTANCE, tag, msg, (Throwable) null, 4, (Object) null);
        addSentryBreadcrumb$default(this, CrashReporting.BreadcrumbLevel.WARNING, msg, null, 4, null);
    }

    public void i(@NotNull String tag, @NotNull String msg, @NotNull Throwable tr2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(tr2, "tr");
        Log.INSTANCE.i(tag, msg, tr2);
    }

    @Override // o8.c
    public void d(@NotNull String tag, @NotNull String msg, @NotNull Throwable tr2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(tr2, "tr");
        o8.b bVar = o8.b.f17172b;
        o8.b.b(3, tag, msg, tr2);
    }

    @Override // o8.c
    public void e(@NotNull String tag, @NotNull String msg, @NotNull Throwable tr2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(tr2, "tr");
        Log.INSTANCE.e(tag, msg, tr2);
        addSentryBreadcrumb(CrashReporting.BreadcrumbLevel.ERROR, msg, tr2);
    }

    public void v(@NotNull String tag, @NotNull String msg, @NotNull Throwable tr2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(tr2, "tr");
        o8.b bVar = o8.b.f17172b;
        o8.b.b(2, tag, msg, tr2);
    }

    @Override // o8.c
    public void w(@NotNull String tag, @NotNull String msg, @NotNull Throwable tr2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(tr2, "tr");
        Log.INSTANCE.w(tag, msg, tr2);
        addSentryBreadcrumb(CrashReporting.BreadcrumbLevel.WARNING, msg, tr2);
    }

    @Override // o8.c
    public void wtf(@NotNull String tag, @NotNull String msg, @NotNull Throwable tr2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(tr2, "tr");
        Log.INSTANCE.e(tag, msg, tr2);
        addSentryBreadcrumb(CrashReporting.BreadcrumbLevel.ERROR, msg, tr2);
    }
}
