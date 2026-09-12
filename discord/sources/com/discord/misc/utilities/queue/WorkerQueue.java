package com.discord.misc.utilities.queue;

import com.facebook.react.modules.appstate.AppStateModule;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00028\u00000\bj\b\u0012\u0004\u0012\u00028\u0000`\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/discord/misc/utilities/queue/WorkerQueue;", "T", "", "popFromEnd", "", "<init>", "(Z)V", "nextWorkers", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "currWorker", "Ljava/lang/Object;", "updateWorker", "worker", AppStateModule.APP_STATE_ACTIVE, "onWorkerActive", "Lkotlin/Function1;", "", "(Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;)Z", "misc_utilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WorkerQueue<T> {
    private T currWorker;

    @NotNull
    private final LinkedHashSet<T> nextWorkers;
    private final boolean popFromEnd;

    public WorkerQueue() {
        this(false, 1, null);
    }

    public final boolean updateWorker(T worker, boolean active, @NotNull Function1<? super T, Unit> onWorkerActive) {
        Intrinsics.checkNotNullParameter(onWorkerActive, "onWorkerActive");
        if (active) {
            T t5 = this.currWorker;
            if (t5 == null || Intrinsics.areEqual(t5, worker)) {
                this.currWorker = worker;
            } else {
                this.nextWorkers.add(worker);
            }
        } else if (Intrinsics.areEqual(this.currWorker, worker)) {
            T t10 = this.popFromEnd ? (T) CollectionsKt.R(this.nextWorkers) : (T) CollectionsKt.L(this.nextWorkers);
            this.currWorker = t10;
            if (t10 != null) {
                onWorkerActive.invoke(t10);
                this.nextWorkers.remove(t10);
            }
        } else {
            this.nextWorkers.remove(worker);
        }
        return Intrinsics.areEqual(this.currWorker, worker);
    }

    public WorkerQueue(boolean z5) {
        this.popFromEnd = z5;
        this.nextWorkers = new LinkedHashSet<>();
    }

    public /* synthetic */ WorkerQueue(boolean z5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? true : z5);
    }
}
