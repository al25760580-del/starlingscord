package x0;

import android.app.ActivityOptions;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class c extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityOptions f22513b;

    public c(ActivityOptions activityOptions) {
        this.f22513b = activityOptions;
    }

    @Override // x0.f
    public final Bundle g() {
        return this.f22513b.toBundle();
    }

    public final f h(int i7) {
        int i10 = Build.VERSION.SDK_INT;
        ActivityOptions activityOptions = this.f22513b;
        if (i10 >= 34) {
            activityOptions.setPendingIntentBackgroundActivityStartMode(i7);
            return this;
        }
        if (i10 >= 33) {
            activityOptions.setPendingIntentBackgroundActivityLaunchAllowed(i7 != 2);
        }
        return this;
    }
}
