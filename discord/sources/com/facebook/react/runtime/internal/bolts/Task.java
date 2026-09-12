package com.facebook.react.runtime.internal.bolts;

import a1.k;
import com.facebook.react.interfaces.TaskInterface;
import com.facebook.react.runtime.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 2*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u00012B\t\b\u0010¢\u0006\u0004\b\u0003\u0010\u0004B\u0013\b\u0012\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0003\u0010\u0006B\u0011\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0003\u0010\tJ\b\u0010\u0015\u001a\u00020\bH\u0016J\b\u0010\u0016\u001a\u00020\bH\u0016J\b\u0010\u0017\u001a\u00020\bH\u0016J\u000f\u0010\u0018\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010H\u0016J\b\u0010\u001b\u001a\u00020\u0014H\u0016J\u0018\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0000J2\u0010\"\u001a\b\u0012\u0004\u0012\u0002H#0\u0000\"\u0004\b\u0001\u0010#2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H#0\u00132\b\b\u0002\u0010%\u001a\u00020&H\u0007J8\u0010'\u001a\b\u0012\u0004\u0012\u0002H#0\u0000\"\u0004\b\u0001\u0010#2\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H#0\u00000\u00132\b\b\u0002\u0010%\u001a\u00020&H\u0007J0\u0010(\u001a\b\u0012\u0004\u0012\u0002H#0\u0000\"\u0004\b\u0001\u0010#2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H#0\u00132\b\b\u0002\u0010%\u001a\u00020&J6\u0010)\u001a\b\u0012\u0004\u0012\u0002H#0\u0000\"\u0004\b\u0001\u0010#2\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H#0\u00000\u00132\b\b\u0002\u0010%\u001a\u00020&J\b\u0010*\u001a\u00020\u0014H\u0002J\r\u0010+\u001a\u00020\bH\u0000¢\u0006\u0002\b,J\u0019\u0010-\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b.\u0010/J\u001d\u00100\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010H\u0000¢\u0006\u0002\b1R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u000e\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/facebook/react/runtime/internal/bolts/Task;", "TResult", "Lcom/facebook/react/interfaces/TaskInterface;", "<init>", "()V", "result", "(Ljava/lang/Object;)V", "cancelled", "", "(Z)V", "lock", "Ljava/lang/Object;", "complete", "Ljava/lang/Object;", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "continuations", "", "Lcom/facebook/react/runtime/internal/bolts/Continuation;", "", "isCompleted", "isCancelled", "isFaulted", "getResult", "()Ljava/lang/Object;", "getError", "waitForCompletion", "duration", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "makeVoid", "Ljava/lang/Void;", "continueWith", "TContinuationResult", "continuation", "executor", "Ljava/util/concurrent/Executor;", "continueWithTask", "onSuccess", "onSuccessTask", "runContinuations", "trySetCancelled", "trySetCancelled$ReactAndroid_release", "trySetResult", "trySetResult$ReactAndroid_release", "(Ljava/lang/Object;)Z", "trySetError", "trySetError$ReactAndroid_release", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Task<TResult> implements TaskInterface<TResult> {
    private boolean cancelled;
    private boolean complete;
    private Exception error;
    private TResult result;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Executor IMMEDIATE_EXECUTOR = Executors.IMMEDIATE;

    @NotNull
    public static final Executor UI_THREAD_EXECUTOR = Executors.UI_THREAD;

    @NotNull
    private static final Task<Void> TASK_NULL = new Task<>((Object) null);

    @NotNull
    private static final Task<Boolean> TASK_TRUE = new Task<>(Boolean.TRUE);

    @NotNull
    private static final Task<Boolean> TASK_FALSE = new Task<>(Boolean.FALSE);

    @NotNull
    private static final Task<Object> TASK_CANCELLED = new Task<>(true);

    @NotNull
    private final Object lock = new Object();

    @NotNull
    private final List<Continuation<TResult, Unit>> continuations = new ArrayList();

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u0004\b\u0001\u0010\tH\u0001¢\u0006\u0002\b\nJ#\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\f\"\u0004\b\u0001\u0010\t2\b\u0010\r\u001a\u0004\u0018\u0001H\tH\u0007¢\u0006\u0002\u0010\u000eJ$\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\t0\f\"\u0004\b\u0001\u0010\t2\u000e\u0010\u0010\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012H\u0007J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\t0\f\"\u0004\b\u0001\u0010\tH\u0007J0\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\t0\f\"\u0004\b\u0001\u0010\t2\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\f0\u00162\u0006\u0010\u0017\u001a\u00020\u0005H\u0007JL\u0010\u0018\u001a\u00020\u0019\"\u0004\b\u0001\u0010\u001a\"\u0004\b\u0002\u0010\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001a0\b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\u001a0\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\t0\f2\u0006\u0010\u0017\u001a\u00020\u0005H\u0002JR\u0010\u001f\u001a\u00020\u0019\"\u0004\b\u0001\u0010\u001a\"\u0004\b\u0002\u0010\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001a0\b2\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u0002H\t\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001a0\f0\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\t0\f2\u0006\u0010\u0017\u001a\u00020\u0005H\u0002R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/facebook/react/runtime/internal/bolts/Task$Companion;", "", "<init>", "()V", "IMMEDIATE_EXECUTOR", "Ljava/util/concurrent/Executor;", "UI_THREAD_EXECUTOR", "create", "Lcom/facebook/react/runtime/internal/bolts/TaskCompletionSource;", "TResult", "create$ReactAndroid_release", "forResult", "Lcom/facebook/react/runtime/internal/bolts/Task;", "value", "(Ljava/lang/Object;)Lcom/facebook/react/runtime/internal/bolts/Task;", "forError", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cancelled", "call", "callable", "Ljava/util/concurrent/Callable;", "executor", "completeImmediately", "", "TContinuationResult", "tcs", "continuation", "Lcom/facebook/react/runtime/internal/bolts/Continuation;", "task", "completeAfterTask", "TASK_NULL", "Ljava/lang/Void;", "TASK_TRUE", "", "TASK_FALSE", "TASK_CANCELLED", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void call$lambda$2(Callable callable, TaskCompletionSource taskCompletionSource) {
            c cVar = new c(taskCompletionSource, 1);
            try {
                Task task = (Task) callable.call();
                synchronized (task.lock) {
                    try {
                        if (task.isCompleted()) {
                            Intrinsics.checkNotNull(task);
                            cVar.then(task);
                        } else {
                            task.continuations.add(cVar);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (CancellationException unused) {
                taskCompletionSource.setCancelled();
            } catch (Exception e10) {
                taskCompletionSource.setError(e10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit call$lambda$2$lambda$0(TaskCompletionSource taskCompletionSource, Task task) {
            Intrinsics.checkNotNullParameter(task, "task");
            if (task.isCancelled()) {
                taskCompletionSource.setCancelled();
            } else if (task.isFaulted()) {
                taskCompletionSource.setError(task.getError());
            } else {
                taskCompletionSource.setResult(task.getResult());
            }
            return Unit.f14616a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <TContinuationResult, TResult> void completeAfterTask(TaskCompletionSource<TContinuationResult> tcs, Continuation<TResult, Task<TContinuationResult>> continuation, Task<TResult> task, Executor executor) {
            try {
                executor.execute(new d(continuation, task, tcs, 1));
            } catch (Exception e10) {
                tcs.setError(new ExecutorException(e10));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void completeAfterTask$lambda$5(Continuation continuation, Task task, TaskCompletionSource taskCompletionSource) {
            try {
                Task task2 = (Task) continuation.then(task);
                if (task2 == null) {
                    taskCompletionSource.setResult(null);
                } else {
                    Task.continueWith$default(task2, new c(taskCompletionSource, 0), null, 2, null);
                }
            } catch (CancellationException unused) {
                taskCompletionSource.setCancelled();
            } catch (Exception e10) {
                taskCompletionSource.setError(e10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit completeAfterTask$lambda$5$lambda$4(TaskCompletionSource taskCompletionSource, Task task) {
            Intrinsics.checkNotNullParameter(task, "task");
            if (task.isCancelled()) {
                taskCompletionSource.setCancelled();
            } else if (task.isFaulted()) {
                taskCompletionSource.setError(task.getError());
            } else {
                taskCompletionSource.setResult(task.getResult());
            }
            return Unit.f14616a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <TContinuationResult, TResult> void completeImmediately(TaskCompletionSource<TContinuationResult> tcs, Continuation<TResult, TContinuationResult> continuation, Task<TResult> task, Executor executor) {
            try {
                executor.execute(new d(continuation, task, tcs, 0));
            } catch (Exception e10) {
                tcs.setError(new ExecutorException(e10));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void completeImmediately$lambda$3(Continuation continuation, Task task, TaskCompletionSource taskCompletionSource) {
            try {
                taskCompletionSource.setResult(continuation.then(task));
            } catch (CancellationException unused) {
                taskCompletionSource.setCancelled();
            } catch (Exception e10) {
                taskCompletionSource.setError(e10);
            }
        }

        @NotNull
        public final <TResult> Task<TResult> call(@NotNull Callable<Task<TResult>> callable, @NotNull Executor executor) {
            Intrinsics.checkNotNullParameter(callable, "callable");
            Intrinsics.checkNotNullParameter(executor, "executor");
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            try {
                executor.execute(new k(25, callable, taskCompletionSource));
            } catch (Exception e10) {
                taskCompletionSource.setError(new ExecutorException(e10));
            }
            return taskCompletionSource.getTask();
        }

        @NotNull
        public final <TResult> Task<TResult> cancelled() {
            Task<TResult> task = Task.TASK_CANCELLED;
            Intrinsics.checkNotNull(task, "null cannot be cast to non-null type com.facebook.react.runtime.internal.bolts.Task<TResult of com.facebook.react.runtime.internal.bolts.Task.Companion.cancelled>");
            return task;
        }

        @NotNull
        public final <TResult> TaskCompletionSource<TResult> create$ReactAndroid_release() {
            return new TaskCompletionSource<>();
        }

        @NotNull
        public final <TResult> Task<TResult> forError(Exception error) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setError(error);
            return taskCompletionSource.getTask();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final <TResult> Task<TResult> forResult(TResult value) {
            if (value == 0) {
                Task<TResult> task = Task.TASK_NULL;
                Intrinsics.checkNotNull(task, "null cannot be cast to non-null type com.facebook.react.runtime.internal.bolts.Task<TResult of com.facebook.react.runtime.internal.bolts.Task.Companion.forResult>");
                return task;
            }
            if (value instanceof Boolean) {
                Task<TResult> task2 = ((Boolean) value).booleanValue() ? Task.TASK_TRUE : Task.TASK_FALSE;
                Intrinsics.checkNotNull(task2, "null cannot be cast to non-null type com.facebook.react.runtime.internal.bolts.Task<TResult of com.facebook.react.runtime.internal.bolts.Task.Companion.forResult>");
                return task2;
            }
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setResult(value);
            return taskCompletionSource.getTask();
        }

        private Companion() {
        }
    }

    public Task() {
    }

    @NotNull
    public static final <TResult> Task<TResult> call(@NotNull Callable<Task<TResult>> callable, @NotNull Executor executor) {
        return INSTANCE.call(callable, executor);
    }

    @NotNull
    public static final <TResult> Task<TResult> cancelled() {
        return INSTANCE.cancelled();
    }

    public static /* synthetic */ Task continueWith$default(Task task, Continuation continuation, Executor executor, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            executor = IMMEDIATE_EXECUTOR;
        }
        return task.continueWith(continuation, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit continueWith$lambda$9$lambda$8(TaskCompletionSource taskCompletionSource, Continuation continuation, Executor executor, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        INSTANCE.completeImmediately(taskCompletionSource, continuation, task, executor);
        return Unit.f14616a;
    }

    public static /* synthetic */ Task continueWithTask$default(Task task, Continuation continuation, Executor executor, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            executor = IMMEDIATE_EXECUTOR;
        }
        return task.continueWithTask(continuation, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit continueWithTask$lambda$11$lambda$10(TaskCompletionSource taskCompletionSource, Continuation continuation, Executor executor, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        INSTANCE.completeAfterTask(taskCompletionSource, continuation, task, executor);
        return Unit.f14616a;
    }

    @NotNull
    public static final <TResult> Task<TResult> forError(Exception exc) {
        return INSTANCE.forError(exc);
    }

    @NotNull
    public static final <TResult> Task<TResult> forResult(TResult tresult) {
        return INSTANCE.forResult(tresult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task makeVoid$lambda$7(Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isCancelled()) {
            return INSTANCE.cancelled();
        }
        return task.isFaulted() ? INSTANCE.forError(task.getError()) : TASK_NULL;
    }

    public static /* synthetic */ Task onSuccess$default(Task task, Continuation continuation, Executor executor, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            executor = IMMEDIATE_EXECUTOR;
        }
        return task.onSuccess(continuation, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task onSuccess$lambda$12(Continuation continuation, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isCancelled()) {
            return INSTANCE.cancelled();
        }
        return task.isFaulted() ? INSTANCE.forError(task.getError()) : continueWith$default(task, continuation, null, 2, null);
    }

    public static /* synthetic */ Task onSuccessTask$default(Task task, Continuation continuation, Executor executor, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            executor = IMMEDIATE_EXECUTOR;
        }
        return task.onSuccessTask(continuation, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task onSuccessTask$lambda$13(Continuation continuation, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isCancelled()) {
            return INSTANCE.cancelled();
        }
        return task.isFaulted() ? INSTANCE.forError(task.getError()) : continueWithTask$default(task, continuation, null, 2, null);
    }

    private final void runContinuations() {
        synchronized (this.lock) {
            Iterator<Continuation<TResult, Unit>> it = this.continuations.iterator();
            while (it.hasNext()) {
                try {
                    it.next().then(this);
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
            this.continuations.clear();
            Unit unit = Unit.f14616a;
        }
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> continueWith(@NotNull Continuation<TResult, TContinuationResult> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return continueWith$default(this, continuation, null, 2, null);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(@NotNull Continuation<TResult, Task<TContinuationResult>> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return continueWithTask$default(this, continuation, null, 2, null);
    }

    @Override // com.facebook.react.interfaces.TaskInterface
    public Exception getError() {
        Exception exc;
        synchronized (this.lock) {
            exc = this.error;
        }
        return exc;
    }

    @Override // com.facebook.react.interfaces.TaskInterface
    public TResult getResult() {
        TResult tresult;
        synchronized (this.lock) {
            tresult = this.result;
        }
        return tresult;
    }

    @Override // com.facebook.react.interfaces.TaskInterface
    public boolean isCancelled() {
        boolean z5;
        synchronized (this.lock) {
            z5 = this.cancelled;
        }
        return z5;
    }

    @Override // com.facebook.react.interfaces.TaskInterface
    public boolean isCompleted() {
        boolean z5;
        synchronized (this.lock) {
            z5 = this.complete;
        }
        return z5;
    }

    @Override // com.facebook.react.interfaces.TaskInterface
    public boolean isFaulted() {
        boolean z5;
        synchronized (this.lock) {
            z5 = getError() != null;
        }
        return z5;
    }

    @NotNull
    public final Task<Void> makeVoid() {
        return continueWithTask$default(this, new r(1), null, 2, null);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccess(@NotNull Continuation<TResult, TContinuationResult> continuation, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        return continueWithTask(new b(continuation, 0), executor);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(@NotNull Continuation<TResult, Task<TContinuationResult>> continuation, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        return continueWithTask(new b(continuation, 1), executor);
    }

    public final boolean trySetCancelled$ReactAndroid_release() {
        synchronized (this.lock) {
            if (this.complete) {
                return false;
            }
            this.complete = true;
            this.cancelled = true;
            this.lock.notifyAll();
            runContinuations();
            return true;
        }
    }

    public final boolean trySetError$ReactAndroid_release(Exception error) {
        synchronized (this.lock) {
            if (this.complete) {
                return false;
            }
            this.complete = true;
            this.error = error;
            this.lock.notifyAll();
            runContinuations();
            return true;
        }
    }

    public final boolean trySetResult$ReactAndroid_release(TResult result) {
        synchronized (this.lock) {
            if (this.complete) {
                return false;
            }
            this.complete = true;
            this.result = result;
            this.lock.notifyAll();
            runContinuations();
            return true;
        }
    }

    @Override // com.facebook.react.interfaces.TaskInterface
    public void waitForCompletion() {
        synchronized (this.lock) {
            try {
                if (!isCompleted()) {
                    this.lock.wait();
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> continueWith(@NotNull Continuation<TResult, TContinuationResult> continuation, @NotNull Executor executor) {
        boolean zIsCompleted;
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.lock) {
            try {
                zIsCompleted = isCompleted();
                if (!zIsCompleted) {
                    this.continuations.add(new a(taskCompletionSource, continuation, executor, 1));
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zIsCompleted) {
            INSTANCE.completeImmediately(taskCompletionSource, continuation, this, executor);
        }
        return taskCompletionSource.getTask();
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(@NotNull Continuation<TResult, Task<TContinuationResult>> continuation, @NotNull Executor executor) {
        boolean zIsCompleted;
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.lock) {
            try {
                zIsCompleted = isCompleted();
                if (!zIsCompleted) {
                    this.continuations.add(new a(taskCompletionSource, continuation, executor, 0));
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zIsCompleted) {
            INSTANCE.completeAfterTask(taskCompletionSource, continuation, this, executor);
        }
        return taskCompletionSource.getTask();
    }

    private Task(TResult tresult) {
        trySetResult$ReactAndroid_release(tresult);
    }

    @Override // com.facebook.react.interfaces.TaskInterface
    public boolean waitForCompletion(long duration, @NotNull TimeUnit timeUnit) {
        boolean zIsCompleted;
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        synchronized (this.lock) {
            try {
                if (!isCompleted()) {
                    this.lock.wait(timeUnit.toMillis(duration));
                }
                zIsCompleted = isCompleted();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zIsCompleted;
    }

    private Task(boolean z5) {
        if (z5) {
            trySetCancelled$ReactAndroid_release();
        } else {
            trySetResult$ReactAndroid_release(null);
        }
    }
}
