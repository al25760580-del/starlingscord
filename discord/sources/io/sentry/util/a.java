package io.sentry.util;

import io.sentry.r;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends ReentrantLock {
    public final r a() {
        lock();
        return new r(1, this);
    }
}
