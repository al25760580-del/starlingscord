package ni;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f16925e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f16926a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f16929d;

    public a(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        this.f16927b = str;
        this.f16928c = i7;
        this.f16929d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f16925e.newThread(new io.sentry.react.d(11, this, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f16927b + " Thread #" + this.f16926a.getAndIncrement());
        return threadNewThread;
    }
}
