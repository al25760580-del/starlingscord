package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class w extends Service implements LifecycleOwner {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e4.m f2404d = new e4.m(this);

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return (LifecycleRegistry) this.f2404d.f7993e;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        e4.m mVar = this.f2404d;
        mVar.getClass();
        mVar.F(n.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        e4.m mVar = this.f2404d;
        mVar.getClass();
        mVar.F(n.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        e4.m mVar = this.f2404d;
        mVar.getClass();
        mVar.F(n.ON_STOP);
        mVar.F(n.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i7) {
        e4.m mVar = this.f2404d;
        mVar.getClass();
        mVar.F(n.ON_START);
        super.onStart(intent, i7);
    }
}
