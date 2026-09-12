package io.sentry.android.core;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0 f12178d = new d0(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f0 f12179e;

    public e0(f0 f0Var) {
        this.f12179e = f0Var;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        this.f12179e.f12185v = Boolean.FALSE;
        Iterator it = this.f12178d.iterator();
        while (it.hasNext()) {
            ((c0) it.next()).c();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        this.f12179e.f12185v = Boolean.TRUE;
        Iterator it = this.f12178d.iterator();
        while (it.hasNext()) {
            ((c0) it.next()).f();
        }
    }
}
