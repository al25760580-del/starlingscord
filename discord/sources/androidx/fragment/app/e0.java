package androidx.fragment.app;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.arch.core.util.Function;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends Fragment.OnPreAttachedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function f2127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f2128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActivityResultContract f2129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ActivityResultCallback f2130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Fragment f2131e;

    public e0(Fragment fragment, Function function, AtomicReference atomicReference, ActivityResultContract activityResultContract, ActivityResultCallback activityResultCallback) {
        this.f2131e = fragment;
        this.f2127a = function;
        this.f2128b = atomicReference;
        this.f2129c = activityResultContract;
        this.f2130d = activityResultCallback;
    }

    @Override // androidx.fragment.app.Fragment.OnPreAttachedListener
    public final void a() {
        Fragment fragment = this.f2131e;
        this.f2128b.set(((ActivityResultRegistry) this.f2127a.apply(null)).d(fragment.generateActivityResultKey(), fragment, this.f2129c, this.f2130d));
    }
}
