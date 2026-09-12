package io.sentry.transport;

import io.sentry.Hint;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public interface g extends Closeable {
    void D(e4.c cVar, Hint hint);

    void a(boolean z5);

    void b(long j);

    p d();

    default boolean e() {
        return true;
    }
}
