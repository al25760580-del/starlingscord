package a5;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class u implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Serializable f266c;

    public u(b bVar) {
        this.f264a = 0;
        this.f265b = Executors.defaultThreadFactory();
        this.f266c = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f264a) {
            case 0:
                AtomicInteger atomicInteger = (AtomicInteger) this.f266c;
                Thread threadNewThread = ((ThreadFactory) this.f265b).newThread(runnable);
                threadNewThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
                return threadNewThread;
            case 1:
                Thread threadNewThread2 = ((ThreadFactory) this.f265b).newThread(new gf.a(0, runnable));
                threadNewThread2.setName((String) this.f266c);
                return threadNewThread2;
            default:
                String str = (String) this.f265b;
                Intrinsics.checkNotNullParameter(runnable, "runnable");
                return new Thread(new com.mkuczera.haptic.a(9, this, runnable), str + "-" + ((AtomicInteger) this.f266c).getAndIncrement());
        }
    }

    public u(String prefix, int i7) {
        this.f264a = i7;
        switch (i7) {
            case 2:
                Intrinsics.checkNotNullParameter(prefix, "prefix");
                this.f265b = prefix;
                this.f266c = new AtomicInteger(1);
                break;
            default:
                this.f265b = Executors.defaultThreadFactory();
                this.f266c = prefix;
                break;
        }
    }
}
