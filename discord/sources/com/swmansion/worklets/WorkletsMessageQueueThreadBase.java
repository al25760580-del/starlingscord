package com.swmansion.worklets;

import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl;
import com.facebook.react.bridge.queue.MessageQueueThreadPerfStats;
import com.facebook.react.bridge.queue.MessageQueueThreadSpec;
import com.google.firebase.messaging.n;
import java.lang.reflect.Field;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import xa.a;

/* JADX INFO: loaded from: classes3.dex */
@a
public abstract class WorkletsMessageQueueThreadBase implements MessageQueueThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageQueueThreadImpl f7270a = MessageQueueThreadImpl.create(MessageQueueThreadSpec.mainThreadSpec(), new n(10));

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public final void assertIsOnThread() {
        this.f7270a.assertIsOnThread();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public final Future callOnQueue(Callable callable) {
        return this.f7270a.callOnQueue(callable);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public final MessageQueueThreadPerfStats getPerfStats() {
        return this.f7270a.getPerfStats();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public final boolean isOnThread() {
        return this.f7270a.isOnThread();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public final void quitSynchronous() {
        MessageQueueThreadImpl messageQueueThreadImpl = this.f7270a;
        try {
            Field declaredField = messageQueueThreadImpl.getClass().getDeclaredField("mIsFinished");
            declaredField.setAccessible(true);
            declaredField.set(messageQueueThreadImpl, Boolean.TRUE);
            declaredField.setAccessible(false);
        } catch (IllegalAccessException | NoSuchFieldException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public final void resetPerfStats() {
        this.f7270a.resetPerfStats();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public final void assertIsOnThread(String str) {
        this.f7270a.assertIsOnThread(str);
    }
}
