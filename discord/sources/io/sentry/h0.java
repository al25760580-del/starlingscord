package io.sentry;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12701b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f12700a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("SentryHostnameCache-");
                int i7 = this.f12701b;
                this.f12701b = i7 + 1;
                sb2.append(i7);
                Thread thread = new Thread(runnable, sb2.toString());
                thread.setDaemon(true);
                return thread;
            case 1:
                StringBuilder sb3 = new StringBuilder("SentryExecutorServiceThreadFactory-");
                int i10 = this.f12701b;
                this.f12701b = i10 + 1;
                sb3.append(i10);
                Thread thread2 = new Thread(runnable, sb3.toString());
                thread2.setDaemon(true);
                return thread2;
            default:
                StringBuilder sb4 = new StringBuilder("SentryAsyncConnection-");
                int i11 = this.f12701b;
                this.f12701b = i11 + 1;
                sb4.append(i11);
                Thread thread3 = new Thread(runnable, sb4.toString());
                thread3.setDaemon(true);
                return thread3;
        }
    }
}
