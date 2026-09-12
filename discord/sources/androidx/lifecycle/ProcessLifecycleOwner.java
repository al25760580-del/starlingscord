package androidx.lifecycle;

import android.os.Handler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "Landroidx/lifecycle/LifecycleOwner;", "<init>", "()V", "androidx/lifecycle/c0", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessLifecycleOwner implements LifecycleOwner {
    public static final ProcessLifecycleOwner F = new ProcessLifecycleOwner();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2319e;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Handler f2322w;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2320i = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2321v = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final LifecycleRegistry f2323x = new LifecycleRegistry(this);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final am.c f2324y = new am.c(1, this);
    public final u4.b E = new u4.b(3, this);

    private ProcessLifecycleOwner() {
    }

    public final void a() {
        int i7 = this.f2319e + 1;
        this.f2319e = i7;
        if (i7 == 1) {
            if (this.f2320i) {
                this.f2323x.f(n.ON_RESUME);
                this.f2320i = false;
            } else {
                Handler handler = this.f2322w;
                Intrinsics.checkNotNull(handler);
                handler.removeCallbacks(this.f2324y);
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.f2323x;
    }
}
