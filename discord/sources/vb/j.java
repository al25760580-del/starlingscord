package vb;

import java.io.Closeable;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Provider f21532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ph.c f21533e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Provider f21534i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ga.l f21535v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Provider f21536w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Provider f21537x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Provider f21538y;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((cc.h) ((cc.d) this.f21537x.get())).close();
    }
}
