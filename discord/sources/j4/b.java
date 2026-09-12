package j4;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f13649c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f13650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h4.a f13651b;

    public b() {
        ExecutorService executorServiceNewCachedThreadPool;
        String property = System.getProperty("java.runtime.name");
        if (property == null ? false : property.toLowerCase(Locale.US).contains("android")) {
            a aVar = a.f13645b;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(a.f13646c, a.f13647d, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            executorServiceNewCachedThreadPool = threadPoolExecutor;
        } else {
            executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        }
        this.f13650a = executorServiceNewCachedThreadPool;
        Executors.newSingleThreadScheduledExecutor();
        h4.a aVar2 = new h4.a(2);
        aVar2.f10326e = new ThreadLocal();
        this.f13651b = aVar2;
    }
}
