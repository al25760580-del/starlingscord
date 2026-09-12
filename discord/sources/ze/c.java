package ze;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final c f23921w = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f23922d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f23923e = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f23924i = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f23925v = false;

    public static void a(Application application) {
        c cVar = f23921w;
        synchronized (cVar) {
            try {
                if (!cVar.f23925v) {
                    application.registerActivityLifecycleCallbacks(cVar);
                    application.registerComponentCallbacks(cVar);
                    cVar.f23925v = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(boolean z5) {
        synchronized (f23921w) {
            try {
                Iterator it = this.f23924i.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).a(z5);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.f23922d.compareAndSet(true, false);
        this.f23923e.set(true);
        if (zCompareAndSet) {
            b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.f23922d.compareAndSet(true, false);
        this.f23923e.set(true);
        if (zCompareAndSet) {
            b(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        if (i7 == 20 && this.f23922d.compareAndSet(false, true)) {
            this.f23923e.set(true);
            b(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
