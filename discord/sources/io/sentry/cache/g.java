package io.sentry.cache;

import gc.o;
import io.sentry.Breadcrumb;
import io.sentry.SentryLevel;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.p;
import io.sentry.j6;
import io.sentry.p3;
import io.sentry.protocol.h0;
import io.sentry.protocol.v;
import io.sentry.s3;
import io.sentry.w5;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends s3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f12541c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f12542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.sentry.util.e f12543b = new io.sentry.util.e(new o(23, this));

    public g(SentryAndroidOptions sentryAndroidOptions) {
        this.f12542a = sentryAndroidOptions;
    }

    @Override // io.sentry.s3, io.sentry.w0
    public final void a(Collection collection) {
        if (collection.isEmpty()) {
            q(new p(7, this));
        }
    }

    @Override // io.sentry.w0
    public final void c(Breadcrumb breadcrumb) {
        q(new com.mkuczera.haptic.a(27, this, breadcrumb));
    }

    @Override // io.sentry.s3, io.sentry.w0
    public final void d(ConcurrentHashMap concurrentHashMap) {
        q(new f(this, concurrentHashMap, 0));
    }

    @Override // io.sentry.w0
    public final void e(j6 j6Var, p3 p3Var) {
        q(new ac.a(this, j6Var, p3Var, 24));
    }

    @Override // io.sentry.s3, io.sentry.w0
    public final void g(io.sentry.protocol.c cVar) {
        q(new com.mkuczera.haptic.a(28, this, cVar));
    }

    @Override // io.sentry.s3, io.sentry.w0
    public final void h(ConcurrentHashMap concurrentHashMap) {
        q(new f(this, concurrentHashMap, 1));
    }

    @Override // io.sentry.s3, io.sentry.w0
    public final void i(List list) {
        q(new com.mkuczera.haptic.a(26, this, list));
    }

    @Override // io.sentry.s3, io.sentry.w0
    public final void k(v vVar) {
        q(new com.mkuczera.haptic.a(23, this, vVar));
    }

    @Override // io.sentry.s3, io.sentry.w0
    public final void l(String str) {
        q(new com.mkuczera.haptic.a(24, this, str));
    }

    @Override // io.sentry.w0
    public final void m(h0 h0Var) {
        q(new com.mkuczera.haptic.a(25, this, h0Var));
    }

    public final void o(String str) {
        a.a(this.f12542a, ".scope-cache", str);
    }

    public final Object p(w5 w5Var, String str, Class cls) {
        if (!str.equals("breadcrumbs.json")) {
            return a.c(w5Var, ".scope-cache", str, cls);
        }
        try {
            io.sentry.cache.tape.e eVar = (io.sentry.cache.tape.e) this.f12543b.a();
            int iMin = Math.min(eVar.size(), eVar.size());
            ArrayList arrayList = new ArrayList(iMin);
            Iterator it = eVar.iterator();
            for (int i7 = 0; i7 < iMin; i7++) {
                arrayList.add(it.next());
            }
            return cls.cast(Collections.unmodifiableList(arrayList));
        } catch (IOException unused) {
            w5Var.getLogger().q(SentryLevel.ERROR, "Unable to read serialized breadcrumbs from QueueFile", new Object[0]);
            return null;
        }
    }

    public final void q(Runnable runnable) {
        w5 w5Var = this.f12542a;
        if (w5Var.isEnableScopePersistence()) {
            if (Thread.currentThread().getName().contains("SentryExecutor")) {
                try {
                    runnable.run();
                    return;
                } catch (Throwable th2) {
                    w5Var.getLogger().g(SentryLevel.ERROR, "Serialization task failed", th2);
                    return;
                }
            }
            try {
                w5Var.getExecutorService().submit(new com.mkuczera.haptic.a(29, this, runnable));
            } catch (Throwable th3) {
                w5Var.getLogger().g(SentryLevel.ERROR, "Serialization task could not be scheduled", th3);
            }
        }
    }

    public final void r(Object obj, String str) {
        a.d(this.f12542a, obj, ".scope-cache", str);
    }
}
