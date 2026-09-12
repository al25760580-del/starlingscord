package fr;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements CoroutineScope {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CoroutineContext f9367d;

    public d(CoroutineContext coroutineContext) {
        this.f9367d = coroutineContext;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.f9367d;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f9367d + ')';
    }
}
