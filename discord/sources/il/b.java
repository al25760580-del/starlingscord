package il;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.yalantis.ucrop.UCropActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f11836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f11837e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f11838i;

    public b(e eVar, String str, String str2, String str3) {
        this.f11836d = str;
        this.f11837e = str2;
        this.f11838i = str3;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (!(activity instanceof UCropActivity) || activity.isChangingConfigurations() || e.f11847g0 == null) {
            return;
        }
        activity.getApplication().unregisterActivityLifecycleCallbacks(e.f11847g0);
        e.f11847g0 = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (activity instanceof UCropActivity) {
            activity.getWindow().getDecorView().post(new cb.a(this, (UCropActivity) activity, this.f11836d, this.f11837e, this.f11838i));
        }
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
