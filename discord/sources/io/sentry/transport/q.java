package io.sentry.transport;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends AbstractQueuedSynchronizer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f13202d = 0;

    public q() {
        setState(0);
    }

    public static int a(q qVar) {
        return qVar.getState();
    }

    public static void b(q qVar) {
        int state;
        do {
            state = qVar.getState();
        } while (!qVar.compareAndSetState(state, state + 1));
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    public final int tryAcquireShared(int i7) {
        return getState() == 0 ? 1 : -1;
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    public final boolean tryReleaseShared(int i7) {
        int state;
        int i10;
        do {
            state = getState();
            if (state == 0) {
                return false;
            }
            i10 = state - 1;
        } while (!compareAndSetState(state, i10));
        return i10 == 0;
    }
}
