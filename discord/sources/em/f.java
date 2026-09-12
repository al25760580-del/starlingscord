package em;

import androidx.lifecycle.LifecycleOwner;
import app.rive.runtime.kotlin.RiveViewLifecycleObserver;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends RiveViewLifecycleObserver {
    @Override // app.rive.runtime.kotlin.RiveViewLifecycleObserver, androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        owner.getLifecycle().c(this);
    }
}
