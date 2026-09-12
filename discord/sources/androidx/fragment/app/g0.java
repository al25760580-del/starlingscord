package androidx.fragment.app;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements d3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2145b;

    public /* synthetic */ g0(int i7, Object obj) {
        this.f2144a = i7;
        this.f2145b = obj;
    }

    @Override // d3.d
    public final Bundle a() {
        int i7 = this.f2144a;
        Object obj = this.f2145b;
        switch (i7) {
            case 0:
                FragmentActivity fragmentActivity = (FragmentActivity) obj;
                String str = FragmentActivity.LIFECYCLE_TAG;
                fragmentActivity.markFragmentsCreated();
                fragmentActivity.mFragmentLifecycleRegistry.f(androidx.lifecycle.n.ON_STOP);
                return new Bundle();
            default:
                return ((FragmentManager) obj).a0();
        }
    }
}
