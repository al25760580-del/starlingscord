package io.sentry.cache.tape;

import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e implements Iterable, Closeable {
    public void clear() {
        y(size());
    }

    public abstract void i(Object obj);

    public abstract int size();

    public abstract void y(int i7);
}
