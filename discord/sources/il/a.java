package il;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.facebook.react.devsupport.h;
import com.yalantis.ucrop.UCropActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f11832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f11833e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f11834i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f11835v;

    public a(e eVar, String str, String str2, String str3, String str4) {
        this.f11832d = str;
        this.f11833e = str2;
        this.f11834i = str3;
        this.f11835v = str4;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (!(activity instanceof UCropActivity) || activity.isChangingConfigurations() || e.f11846f0 == null) {
            return;
        }
        activity.getApplication().unregisterActivityLifecycleCallbacks(e.f11846f0);
        e.f11846f0 = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (activity instanceof UCropActivity) {
            activity.getWindow().getDecorView().post(new h(this, this.f11832d, (UCropActivity) activity, this.f11833e, this.f11834i, this.f11835v));
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
