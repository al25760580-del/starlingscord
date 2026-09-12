package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends g {
    final /* synthetic */ ProcessLifecycleOwner this$0;

    public static final class a extends g {
        final /* synthetic */ ProcessLifecycleOwner this$0;

        public a(ProcessLifecycleOwner processLifecycleOwner) {
            this.this$0 = processLifecycleOwner;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ProcessLifecycleOwner processLifecycleOwner = this.this$0;
            int i7 = processLifecycleOwner.f2318d + 1;
            processLifecycleOwner.f2318d = i7;
            if (i7 == 1 && processLifecycleOwner.f2321v) {
                processLifecycleOwner.f2323x.f(n.ON_START);
                processLifecycleOwner.f2321v = false;
            }
        }
    }

    public d0(ProcessLifecycleOwner processLifecycleOwner) {
        this.this$0 = processLifecycleOwner;
    }

    @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i7 = m0.f2373e;
            Intrinsics.checkNotNullParameter(activity, "<this>");
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            Intrinsics.checkNotNull(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((m0) fragmentFindFragmentByTag).f2374d = this.this$0.E;
        }
    }

    @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i7 = processLifecycleOwner.f2319e - 1;
        processLifecycleOwner.f2319e = i7;
        if (i7 == 0) {
            Handler handler = processLifecycleOwner.f2322w;
            Intrinsics.checkNotNull(handler);
            handler.postDelayed(processLifecycleOwner.f2324y, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        c0.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i7 = processLifecycleOwner.f2318d - 1;
        processLifecycleOwner.f2318d = i7;
        if (i7 == 0 && processLifecycleOwner.f2320i) {
            processLifecycleOwner.f2323x.f(n.ON_STOP);
            processLifecycleOwner.f2321v = true;
        }
    }
}
