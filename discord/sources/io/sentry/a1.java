package io.sentry;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
public interface a1 {
    void b(long j);

    void c();

    Future h(Runnable runnable, long j);

    boolean isClosed();

    Future submit(Runnable runnable);
}
