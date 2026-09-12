package io.sentry;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile i0 f12731i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile String f12733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f12734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f12735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g0 f12736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ExecutorService f12737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f12729g = TimeUnit.HOURS.toMillis(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f12730h = TimeUnit.SECONDS.toMillis(1);
    public static final io.sentry.util.a j = new io.sentry.util.a();

    public i0() {
        g0 g0Var = new g0(0);
        this.f12735d = new AtomicBoolean(false);
        this.f12737f = Executors.newSingleThreadExecutor(new h0(0));
        this.f12732a = f12729g;
        this.f12736e = g0Var;
        a();
    }

    public final void a() {
        try {
            this.f12737f.submit(new f4.e(2, this)).get(f12730h, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.f12734c = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            this.f12734c = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
        }
    }
}
