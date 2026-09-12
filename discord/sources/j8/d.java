package j8;

import android.content.Context;
import android.os.Handler;
import e4.r;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f13679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f13680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f13681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f13682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f13683e;

    public d(ph.c runnableScheduler, r launcher) {
        Intrinsics.checkNotNullParameter(runnableScheduler, "runnableScheduler");
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        long millis = TimeUnit.MINUTES.toMillis(90L);
        Intrinsics.checkNotNullParameter(runnableScheduler, "runnableScheduler");
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        this.f13680b = runnableScheduler;
        this.f13681c = launcher;
        this.f13679a = millis;
        this.f13682d = new Object();
        this.f13683e = new LinkedHashMap();
    }

    public void a(w3.j token) {
        Runnable runnable;
        Intrinsics.checkNotNullParameter(token, "token");
        synchronized (this.f13682d) {
            runnable = (Runnable) ((LinkedHashMap) this.f13683e).remove(token);
        }
        if (runnable != null) {
            ((Handler) ((ph.c) this.f13680b).f18031d).removeCallbacks(runnable);
        }
    }

    public void b(w3.j token) {
        Intrinsics.checkNotNullParameter(token, "token");
        io.sentry.react.d dVar = new io.sentry.react.d(29, this, token);
        synchronized (this.f13682d) {
        }
        ph.c cVar = (ph.c) this.f13680b;
        ((Handler) cVar.f18031d).postDelayed(dVar, this.f13679a);
    }

    public d(Context context) {
        this.f13680b = "image_cache";
        this.f13679a = 41943040L;
        this.f13682d = new q8.c();
        this.f13683e = context;
    }
}
