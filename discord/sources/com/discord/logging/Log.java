package com.discord.logging;

import ct.b;
import ct.c;
import ct.d;
import gn.h;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nJ&\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nJ\"\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nJ&\u0010\f\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nJ\"\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nJ&\u0010\r\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nJ\"\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nJ&\u0010\u000e\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000f"}, d2 = {"Lcom/discord/logging/Log;", "", "<init>", "()V", "d", "", "tag", "", "message", "exception", "", "Lkotlin/reflect/KClass;", "i", "w", "e", "logging_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Log {

    @NotNull
    public static final Log INSTANCE = new Log();

    static {
        b bVar = d.f7508a;
        LoggingTree tree = new LoggingTree();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(tree, "tree");
        if (tree == bVar) {
            throw new IllegalArgumentException("Cannot plant Timber into itself.");
        }
        ArrayList arrayList = d.f7509b;
        synchronized (arrayList) {
            arrayList.add(tree);
            Object[] array = arrayList.toArray(new c[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            d.f7510c = (c[]) array;
            Unit unit = Unit.f14616a;
        }
    }

    private Log() {
    }

    public static /* synthetic */ void d$default(Log log, String str, String str2, Throwable th2, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            th2 = null;
        }
        log.d(str, str2, th2);
    }

    public static /* synthetic */ void e$default(Log log, String str, String str2, Throwable th2, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            th2 = null;
        }
        log.e(str, str2, th2);
    }

    public static /* synthetic */ void i$default(Log log, String str, String str2, Throwable th2, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            th2 = null;
        }
        log.i(str, str2, th2);
    }

    public static /* synthetic */ void w$default(Log log, String str, String str2, Throwable th2, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            th2 = null;
        }
        log.w(str, str2, th2);
    }

    public final void d(@NotNull String tag, @NotNull String message, Throwable exception) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        b bVar = d.f7508a;
        bVar.b(tag);
        bVar.d(exception, message, new Object[0]);
    }

    public final void e(@NotNull String tag, @NotNull String message, Throwable exception) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        b bVar = d.f7508a;
        bVar.b(tag);
        bVar.e(exception, message, new Object[0]);
    }

    public final void i(@NotNull String tag, @NotNull String message, Throwable exception) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        b bVar = d.f7508a;
        bVar.b(tag);
        bVar.i(exception, message, new Object[0]);
    }

    public final void w(@NotNull String tag, @NotNull String message, Throwable exception) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        b bVar = d.f7508a;
        bVar.b(tag);
        bVar.w(exception, message, new Object[0]);
    }

    public static /* synthetic */ void d$default(Log log, KClass kClass, String str, Throwable th2, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            th2 = null;
        }
        log.d(kClass, str, th2);
    }

    public static /* synthetic */ void e$default(Log log, KClass kClass, String str, Throwable th2, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            th2 = null;
        }
        log.e(kClass, str, th2);
    }

    public static /* synthetic */ void i$default(Log log, KClass kClass, String str, Throwable th2, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            th2 = null;
        }
        log.i(kClass, str, th2);
    }

    public static /* synthetic */ void w$default(Log log, KClass kClass, String str, Throwable th2, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            th2 = null;
        }
        log.w(kClass, str, th2);
    }

    public final void d(@NotNull KClass tag, @NotNull String message, Throwable exception) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        String simpleName = h.B(tag).getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        d(simpleName, message, exception);
    }

    public final void e(@NotNull KClass tag, @NotNull String message, Throwable exception) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        String simpleName = h.B(tag).getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        e(simpleName, message, exception);
    }

    public final void i(@NotNull KClass tag, @NotNull String message, Throwable exception) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        String simpleName = h.B(tag).getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        i(simpleName, message, exception);
    }

    public final void w(@NotNull KClass tag, @NotNull String message, Throwable exception) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        String simpleName = h.B(tag).getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        w(simpleName, message, exception);
    }
}
