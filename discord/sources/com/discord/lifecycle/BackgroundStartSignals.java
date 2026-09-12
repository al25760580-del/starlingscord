package com.discord.lifecycle;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u000b\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\r\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0006\u0010\u000e\u001a\u00020\u0007J\u0006\u0010\u000f\u001a\u00020\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discord/lifecycle/BackgroundStartSignals;", "", "<init>", "()V", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lkotlin/Function0;", "", "lock", "emitted", "", "addListener", "listener", "removeListener", "emitIfNotEmitted", "reset", "lifecycle_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBackgroundStartSignals.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackgroundStartSignals.kt\ncom/discord/lifecycle/BackgroundStartSignals\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n1869#2,2:48\n*S KotlinDebug\n*F\n+ 1 BackgroundStartSignals.kt\ncom/discord/lifecycle/BackgroundStartSignals\n*L\n34#1:48,2\n*E\n"})
public final class BackgroundStartSignals {
    private static volatile boolean emitted;

    @NotNull
    public static final BackgroundStartSignals INSTANCE = new BackgroundStartSignals();

    @NotNull
    private static final CopyOnWriteArraySet<Function0<Unit>> listeners = new CopyOnWriteArraySet<>();

    @NotNull
    private static final Object lock = new Object();

    private BackgroundStartSignals() {
    }

    public final void addListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        listeners.add(listener);
        if (emitted) {
            try {
                listener.invoke();
            } catch (Throwable unused) {
            }
        }
    }

    public final void emitIfNotEmitted() {
        synchronized (lock) {
            if (emitted) {
                return;
            }
            emitted = true;
            Unit unit = Unit.f14616a;
            Iterator<T> it = listeners.iterator();
            while (it.hasNext()) {
                ((Function0) it.next()).invoke();
            }
        }
    }

    public final void removeListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        listeners.remove(listener);
    }

    public final void reset() {
        emitted = false;
    }
}
