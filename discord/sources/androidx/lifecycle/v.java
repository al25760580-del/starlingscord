package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Lifecycle.State f2399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f2400b;

    public final void a(LifecycleOwner lifecycleOwner, n event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Lifecycle.State stateA = event.a();
        Lifecycle.State state1 = this.f2399a;
        Intrinsics.checkNotNullParameter(state1, "state1");
        if (stateA.compareTo(state1) < 0) {
            state1 = stateA;
        }
        this.f2399a = state1;
        t tVar = this.f2400b;
        Intrinsics.checkNotNull(lifecycleOwner);
        tVar.c(lifecycleOwner, event);
        this.f2399a = stateA;
    }
}
