package com.facebook.react.bridge.queue;

import a3.e;
import android.os.Looper;
import android.os.Process;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.futures.SimpleSettableFuture;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o8.a;
import org.jetbrains.annotations.NotNull;
import rn.n;
import s0.g;
import sm.f;
import xm.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0017\"\u0004\b\u0000\u0010\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003H\u0016J\b\u0010\u001f\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\u0012H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;", "Lcom/facebook/react/bridge/queue/MessageQueueThread;", StackTraceHelper.NAME_KEY, "", "looper", "Landroid/os/Looper;", "exceptionHandler", "Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;", "<init>", "(Ljava/lang/String;Landroid/os/Looper;Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;)V", "getName", "()Ljava/lang/String;", "getLooper", "()Landroid/os/Looper;", "handler", "Lcom/facebook/react/bridge/queue/MessageQueueThreadHandler;", "assertionErrorMessage", "isFinished", "", "runOnQueue", "runnable", "Ljava/lang/Runnable;", "callOnQueue", "Ljava/util/concurrent/Future;", "T", "callable", "Ljava/util/concurrent/Callable;", "isOnThread", "assertIsOnThread", "", "message", "quitSynchronous", "isIdle", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageQueueThreadImpl implements MessageQueueThread {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String assertionErrorMessage;

    @NotNull
    private final MessageQueueThreadHandler handler;
    private volatile boolean isFinished;

    @NotNull
    private final Looper looper;

    @NotNull
    private final String name;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0002J \u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl$Companion;", "", "<init>", "()V", "create", "Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;", "spec", "Lcom/facebook/react/bridge/queue/MessageQueueThreadSpec;", "exceptionHandler", "Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;", "createForMainThread", StackTraceHelper.NAME_KEY, "", "startNewBackgroundThread", "stackSize", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MessageQueueThreadSpec.ThreadType.values().length];
                try {
                    iArr[MessageQueueThreadSpec.ThreadType.MAIN_UI.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MessageQueueThreadSpec.ThreadType.NEW_BACKGROUND.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final MessageQueueThreadImpl createForMainThread(String name, QueueThreadExceptionHandler exceptionHandler) {
            Looper mainLooper = Looper.getMainLooper();
            Intrinsics.checkNotNullExpressionValue(mainLooper, "getMainLooper(...)");
            return new MessageQueueThreadImpl(name, mainLooper, exceptionHandler, null);
        }

        private final MessageQueueThreadImpl startNewBackgroundThread(String name, long stackSize, QueueThreadExceptionHandler exceptionHandler) {
            SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
            new Thread(null, new f(7, simpleSettableFuture), e.l("mqt_", name), stackSize).start();
            Looper looper = (Looper) simpleSettableFuture.getOrThrow();
            if (looper != null) {
                return new MessageQueueThreadImpl(name, looper, exceptionHandler, null);
            }
            throw new RuntimeException("Looper not found for thread");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void startNewBackgroundThread$lambda$0(SimpleSettableFuture simpleSettableFuture) {
            Process.setThreadPriority(-4);
            Looper.prepare();
            simpleSettableFuture.set(Looper.myLooper());
            Looper.loop();
        }

        @NotNull
        public final MessageQueueThreadImpl create(@NotNull MessageQueueThreadSpec spec, @NotNull QueueThreadExceptionHandler exceptionHandler) {
            Intrinsics.checkNotNullParameter(spec, "spec");
            Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
            int i7 = WhenMappings.$EnumSwitchMapping$0[spec.getThreadType().ordinal()];
            if (i7 == 1) {
                return createForMainThread(spec.getName(), exceptionHandler);
            }
            if (i7 == 2) {
                return startNewBackgroundThread(spec.getName(), spec.getStackSize(), exceptionHandler);
            }
            throw new n();
        }

        private Companion() {
        }
    }

    public /* synthetic */ MessageQueueThreadImpl(String str, Looper looper, QueueThreadExceptionHandler queueThreadExceptionHandler, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, looper, queueThreadExceptionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void callOnQueue$lambda$0(SimpleSettableFuture simpleSettableFuture, Callable callable) {
        try {
            simpleSettableFuture.set(callable.call());
        } catch (Exception e10) {
            simpleSettableFuture.setException(e10);
        }
    }

    @NotNull
    public static final MessageQueueThreadImpl create(@NotNull MessageQueueThreadSpec messageQueueThreadSpec, @NotNull QueueThreadExceptionHandler queueThreadExceptionHandler) {
        return INSTANCE.create(messageQueueThreadSpec, queueThreadExceptionHandler);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void assertIsOnThread() {
        SoftAssertions.assertCondition(isOnThread(), this.assertionErrorMessage);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @NotNull
    public <T> Future<T> callOnQueue(@NotNull Callable<T> callable) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
        runOnQueue(new b(1, simpleSettableFuture, callable));
        return simpleSettableFuture;
    }

    @NotNull
    public final Looper getLooper() {
        return this.looper;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public boolean isIdle() {
        return this.looper.getQueue().isIdle();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public boolean isOnThread() {
        return this.looper.getThread() == Thread.currentThread();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void quitSynchronous() {
        this.isFinished = true;
        this.looper.quit();
        if (this.looper.getThread() != Thread.currentThread()) {
            try {
                this.looper.getThread().join();
            } catch (InterruptedException unused) {
                throw new RuntimeException(e.l("Got interrupted waiting to join thread ", this.name));
            }
        }
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public boolean runOnQueue(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        if (!this.isFinished) {
            this.handler.post(runnable);
            return true;
        }
        a.v(ReactConstants.TAG, "Tried to enqueue runnable on already finished thread: '" + this.name + "... dropping Runnable.");
        return false;
    }

    private MessageQueueThreadImpl(String str, Looper looper, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        this.name = str;
        this.looper = looper;
        this.handler = new MessageQueueThreadHandler(looper, queueThreadExceptionHandler);
        this.assertionErrorMessage = g.e("Expected to be called from the '", str, "' thread!");
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void assertIsOnThread(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        boolean zIsOnThread = isOnThread();
        String str = this.assertionErrorMessage + " " + message;
        Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        SoftAssertions.assertCondition(zIsOnThread, str);
    }
}
