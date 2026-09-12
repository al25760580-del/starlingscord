package com.github.luben.zstd;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
abstract class AutoCloseBase implements Closeable {
    private static final AtomicIntegerFieldUpdater<AutoCloseBase> SHARED_LOCK_UPDATER = AtomicIntegerFieldUpdater.newUpdater(AutoCloseBase.class, "sharedLock");
    private volatile int sharedLock;

    public void acquireSharedLock() {
        int i7;
        do {
            i7 = this.sharedLock;
            if (i7 < 0) {
                throw new IllegalStateException("Closed");
            }
            if (i7 == Integer.MAX_VALUE) {
                throw new IllegalStateException("Shared lock overflow");
            }
        } while (!SHARED_LOCK_UPDATER.compareAndSet(this, i7, i7 + 1));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (this.sharedLock == -1) {
                    return;
                }
                if (!SHARED_LOCK_UPDATER.compareAndSet(this, 0, -1)) {
                    throw new IllegalStateException("Attempt to close while in use");
                }
                doClose();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void doClose();

    public void releaseSharedLock() {
        int i7;
        do {
            i7 = this.sharedLock;
            if (i7 < 0) {
                throw new IllegalStateException("Closed");
            }
            if (i7 == 0) {
                throw new IllegalStateException("Shared lock underflow");
            }
        } while (!SHARED_LOCK_UPDATER.compareAndSet(this, i7, i7 - 1));
    }
}
