package com.discord.async_init;

import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/discord/async_init/AsyncInitThreadChecker;", "", StackTraceHelper.NAME_KEY, "", "<init>", "(Ljava/lang/String;)V", "thread", "Ljava/lang/Thread;", "checkIsOnValidThread", "", "detachThread", "async_init_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AsyncInitThreadChecker {

    @NotNull
    private final String name;
    private Thread thread;

    public AsyncInitThreadChecker(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
    }

    public final void checkIsOnValidThread() {
        if (this.thread == null) {
            this.thread = Thread.currentThread();
        }
        if (Thread.currentThread() == this.thread) {
            return;
        }
        throw new IllegalStateException(("Expected all calls to async-initialized component: " + this.name + " to be from the same thread: " + this.thread + ", called on " + Thread.currentThread()).toString());
    }

    public final void detachThread() {
        this.thread = null;
    }
}
