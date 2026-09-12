package io.sentry.android.replay.util;

import ac.a;
import android.annotation.TargetApi;
import io.sentry.android.replay.ReplayCache;
import io.sentry.l3;
import io.sentry.rrweb.b;
import io.sentry.w5;
import java.io.BufferedWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001e¨\u0006\u001f"}, d2 = {"Lio/sentry/android/replay/util/PersistableLinkedList;", "Ljava/util/concurrent/ConcurrentLinkedDeque;", "Lio/sentry/rrweb/b;", "", "propertyName", "Lio/sentry/w5;", "options", "Ljava/util/concurrent/ScheduledExecutorService;", "persistingExecutor", "Lkotlin/Function0;", "Lio/sentry/android/replay/ReplayCache;", "cacheProvider", "<init>", "(Ljava/lang/String;Lio/sentry/w5;Ljava/util/concurrent/ScheduledExecutorService;Lkotlin/jvm/functions/Function0;)V", "", "persistRecording", "()V", "", "elements", "", "addAll", "(Ljava/util/Collection;)Z", "element", "add", "(Lio/sentry/rrweb/b;)Z", "remove", "()Lio/sentry/rrweb/b;", "Ljava/lang/String;", "Lio/sentry/w5;", "Ljava/util/concurrent/ScheduledExecutorService;", "Lkotlin/jvm/functions/Function0;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@TargetApi(26)
@SourceDebugExtension({"SMAP\nPersistable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Persistable.kt\nio/sentry/android/replay/util/PersistableLinkedList\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
public final class PersistableLinkedList extends ConcurrentLinkedDeque<b> {
    public static final int $stable = 8;

    @NotNull
    private final Function0<ReplayCache> cacheProvider;

    @NotNull
    private final w5 options;

    @NotNull
    private final ScheduledExecutorService persistingExecutor;

    @NotNull
    private final String propertyName;

    public PersistableLinkedList(@NotNull String propertyName, @NotNull w5 options, @NotNull ScheduledExecutorService persistingExecutor, @NotNull Function0<ReplayCache> cacheProvider) {
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(persistingExecutor, "persistingExecutor");
        Intrinsics.checkNotNullParameter(cacheProvider, "cacheProvider");
        this.propertyName = propertyName;
        this.options = options;
        this.persistingExecutor = persistingExecutor;
        this.cacheProvider = cacheProvider;
    }

    private final void persistRecording() {
        ReplayCache replayCache = (ReplayCache) this.cacheProvider.invoke();
        if (replayCache == null) {
            return;
        }
        l3 l3Var = new l3();
        l3Var.f12794e = new ArrayList(this);
        if (this.options.getThreadChecker().c()) {
            this.persistingExecutor.submit(new a(this, l3Var, replayCache, 23));
            return;
        }
        StringWriter stringWriter = new StringWriter();
        this.options.getSerializer().b(l3Var, new BufferedWriter(stringWriter));
        replayCache.persistSegmentValues$sentry_android_replay_release(this.propertyName, stringWriter.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void persistRecording$lambda$1(PersistableLinkedList persistableLinkedList, l3 l3Var, ReplayCache replayCache) {
        StringWriter stringWriter = new StringWriter();
        persistableLinkedList.options.getSerializer().b(l3Var, new BufferedWriter(stringWriter));
        replayCache.persistSegmentValues$sentry_android_replay_release(persistableLinkedList.propertyName, stringWriter.toString());
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public boolean addAll(@NotNull Collection<? extends b> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean zAddAll = super.addAll(elements);
        persistRecording();
        return zAddAll;
    }

    public /* bridge */ boolean contains(b bVar) {
        return super.contains((Object) bVar);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
    public boolean add(@NotNull b element) {
        Intrinsics.checkNotNullParameter(element, "element");
        boolean zAdd = super.add(element);
        persistRecording();
        return zAdd;
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof b) {
            return contains((b) obj);
        }
        return false;
    }

    public /* bridge */ boolean remove(b bVar) {
        return super.remove((Object) bVar);
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof b) {
            return remove((b) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.Deque, java.util.Queue
    @NotNull
    public b remove() {
        b bVar = (b) super.remove();
        persistRecording();
        Intrinsics.checkNotNull(bVar);
        return bVar;
    }
}
