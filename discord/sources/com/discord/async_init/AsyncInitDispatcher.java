package com.discord.async_init;

import a3.e;
import com.discord.logging.Log;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\t2\u000e\b\u0004\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0086\bø\u0001\u0000J(\u0010\u001d\u001a\u00020\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0086\bø\u0001\u0000J\u0006\u0010\u001f\u001a\u00020\u0012J\u0006\u0010 \u001a\u00020\u0012J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR#\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006%"}, d2 = {"Lcom/discord/async_init/AsyncInitDispatcher;", "", StackTraceHelper.NAME_KEY, "", "longDispatchThresholdMs", "", "<init>", "(Ljava/lang/String;J)V", "value", "", "initialized", "getInitialized", "()Z", "setInitialized", "(Z)V", "delayedTasks", "", "Lkotlin/Function0;", "", "getDelayedTasks$annotations", "()V", "getDelayedTasks", "()Ljava/util/List;", "threadChecker", "Lcom/discord/async_init/AsyncInitThreadChecker;", "initStartMs", "post", "validate", "task", "postOrElse", "fallback", "reset", "validateState", "onInit", "numTasks", "", "onInitFinish", "async_init_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAsyncInitDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncInitDispatcher.kt\ncom/discord/async_init/AsyncInitDispatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n1869#2,2:101\n*S KotlinDebug\n*F\n+ 1 AsyncInitDispatcher.kt\ncom/discord/async_init/AsyncInitDispatcher\n*L\n28#1:101,2\n*E\n"})
public final class AsyncInitDispatcher {

    @NotNull
    private final List<Function0<Unit>> delayedTasks;
    private long initStartMs;
    private boolean initialized;
    private final long longDispatchThresholdMs;

    @NotNull
    private final String name;

    @NotNull
    private final AsyncInitThreadChecker threadChecker;

    /* JADX INFO: renamed from: com.discord.async_init.AsyncInitDispatcher$post$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public static final class AnonymousClass1 implements Function0<Unit> {
        final /* synthetic */ Function0<Unit> $task;

        public AnonymousClass1(Function0<Unit> function0) {
            this.$task = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m239invoke();
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m239invoke() {
            this.$task.invoke();
        }
    }

    public AsyncInitDispatcher(@NotNull String name, long j) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.longDispatchThresholdMs = j;
        this.delayedTasks = new ArrayList();
        this.threadChecker = new AsyncInitThreadChecker(name);
    }

    public static /* synthetic */ void getDelayedTasks$annotations() {
    }

    private final void onInit(int numTasks) {
        if (numTasks > 0) {
            this.initStartMs = System.currentTimeMillis();
        }
        Log log = Log.INSTANCE;
        String str = this.name;
        Log.i$default(log, str, "Initializing async dispatcher for " + str + ", " + numTasks + " queued tasks", (Throwable) null, 4, (Object) null);
    }

    private final void onInitFinish() {
        if (this.initStartMs == 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.initStartMs;
        long j = this.longDispatchThresholdMs;
        if (jCurrentTimeMillis < j) {
            Log log = Log.INSTANCE;
            String str = this.name;
            Log.i$default(log, str, str + ": queued tasks  took " + jCurrentTimeMillis + " ms", (Throwable) null, 4, (Object) null);
            return;
        }
        Log log2 = Log.INSTANCE;
        String str2 = this.name;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(": running queued tasks on init took ");
        sb2.append(jCurrentTimeMillis);
        sb2.append(" ms which exceeds threshold=");
        Log.w$default(log2, str2, e.n(sb2, j, " ms"), (Throwable) null, 4, (Object) null);
    }

    public static /* synthetic */ void post$default(AsyncInitDispatcher asyncInitDispatcher, boolean z5, Function0 task, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z5 = true;
        }
        Intrinsics.checkNotNullParameter(task, "task");
        if (z5) {
            asyncInitDispatcher.validateState();
        }
        if (asyncInitDispatcher.getInitialized()) {
            task.invoke();
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new AnonymousClass1(task));
        }
    }

    @NotNull
    public final List<Function0<Unit>> getDelayedTasks() {
        return this.delayedTasks;
    }

    public final boolean getInitialized() {
        return this.initialized;
    }

    public final void post(boolean validate, @NotNull Function0<Unit> task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (validate) {
            validateState();
        }
        if (getInitialized()) {
            task.invoke();
        } else {
            getDelayedTasks().add(new AnonymousClass1(task));
        }
    }

    public final void postOrElse(@NotNull Function0<Unit> task, @NotNull Function0<Unit> fallback) {
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        validateState();
        if (getInitialized()) {
            task.invoke();
        } else {
            fallback.invoke();
        }
    }

    public final void reset() {
        this.threadChecker.detachThread();
        setInitialized(false);
        this.delayedTasks.clear();
        this.initStartMs = 0L;
    }

    public final void setInitialized(boolean z5) {
        validateState();
        if (this.initialized != z5) {
            if (z5) {
                onInit(this.delayedTasks.size());
                Iterator<T> it = this.delayedTasks.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.delayedTasks.clear();
                onInitFinish();
            }
            this.initialized = z5;
        }
    }

    public final void validateState() {
        this.threadChecker.checkIsOnValidThread();
    }

    public /* synthetic */ AsyncInitDispatcher(String str, long j, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? 1000L : j);
    }
}
