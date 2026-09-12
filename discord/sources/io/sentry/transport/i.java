package io.sentry.transport;

import io.sentry.Hint;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements io.sentry.cache.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f13186d = new i();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Collections.emptyIterator();
    }

    @Override // io.sentry.cache.d
    public final boolean n(e4.c cVar, Hint hint) {
        return false;
    }

    @Override // io.sentry.cache.d
    public final void Q(e4.c cVar) {
    }
}
