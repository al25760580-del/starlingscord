package x0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f22514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Activity f22515e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f22516i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f22517v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f22518w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f22519x = false;

    public d(Activity activity) {
        this.f22515e = activity;
        this.f22516i = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f22515e == activity) {
            this.f22515e = null;
            this.f22518w = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f22518w || this.f22519x || this.f22517v) {
            return;
        }
        Object obj = this.f22514d;
        try {
            Object obj2 = e.f22522c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f22516i) {
                e.f22526g.postAtFrontOfQueue(new hi.o(24, e.f22521b.get(activity), obj2));
                this.f22519x = true;
                this.f22514d = null;
            }
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f22515e == activity) {
            this.f22517v = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
