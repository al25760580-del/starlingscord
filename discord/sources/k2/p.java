package k2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import je.c0;

/* JADX INFO: loaded from: classes.dex */
public final class p implements h {
    public a.a E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f14251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i1.c f14252e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final kh.f f14253i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f14254v = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Handler f14255w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ThreadPoolExecutor f14256x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ThreadPoolExecutor f14257y;

    public p(Context context, i1.c cVar) {
        yk.a.d(context, "Context cannot be null");
        this.f14251d = context.getApplicationContext();
        this.f14252e = cVar;
        this.f14253i = q.f14258d;
    }

    @Override // k2.h
    public final void O(a.a aVar) {
        synchronized (this.f14254v) {
            this.E = aVar;
        }
        synchronized (this.f14254v) {
            try {
                if (this.E == null) {
                    return;
                }
                if (this.f14256x == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new c0("emojiCompat", 1));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f14257y = threadPoolExecutor;
                    this.f14256x = threadPoolExecutor;
                }
                this.f14256x.execute(new io.sentry.android.core.p(14, this));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a() {
        synchronized (this.f14254v) {
            try {
                this.E = null;
                Handler handler = this.f14255w;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f14255w = null;
                ThreadPoolExecutor threadPoolExecutor = this.f14257y;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f14256x = null;
                this.f14257y = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final i1.h b() {
        try {
            kh.f fVar = this.f14253i;
            Context context = this.f14251d;
            i1.c cVar = this.f14252e;
            fVar.getClass();
            Object[] objArr = {cVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            i1.g gVarA = i1.b.a(context, Collections.unmodifiableList(arrayList));
            int i7 = gVarA.f11372a;
            if (i7 != 0) {
                throw new RuntimeException(s0.g.d(i7, "fetchFonts failed (", ")"));
            }
            i1.h[] hVarArr = (i1.h[]) gVarA.f11373b.get(0);
            if (hVarArr == null || hVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return hVarArr[0];
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException("provider not found", e10);
        }
    }
}
