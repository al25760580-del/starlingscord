package androidx.fragment.app;

import androidx.activity.result.ActivityResultLauncher;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class y extends ActivityResultLauncher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f2282a;

    public y(AtomicReference atomicReference) {
        this.f2282a = atomicReference;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public final void a(Object obj, x0.f fVar) {
        ActivityResultLauncher activityResultLauncher = (ActivityResultLauncher) this.f2282a.get();
        if (activityResultLauncher == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        activityResultLauncher.a(obj, fVar);
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public final void b() {
        ActivityResultLauncher activityResultLauncher = (ActivityResultLauncher) this.f2282a.getAndSet(null);
        if (activityResultLauncher != null) {
            activityResultLauncher.b();
        }
    }
}
