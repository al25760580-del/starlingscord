package ze;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f23937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f23938e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicReference f23939i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final eg.a f23940v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final xe.e f23941w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final s.f f23942x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e f23943y;

    public k(f fVar, e eVar) {
        xe.e eVar2 = xe.e.f22922d;
        this.f23937d = fVar;
        this.f23939i = new AtomicReference(null);
        this.f23940v = new eg.a(Looper.getMainLooper(), 1);
        this.f23941w = eVar2;
        this.f23942x = new s.f(0);
        this.f23943y = eVar;
        fVar.j(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ze.f] */
    public final Activity a() {
        Activity activityH = this.f23937d.h();
        af.w.g(activityH);
        return activityH;
    }

    public final void b(Bundle bundle) {
        if (bundle != null) {
            this.f23939i.set(bundle.getBoolean("resolving_error", false) ? new a0(new xe.b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"), null), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    public final void c() {
        this.f23938e = false;
        e eVar = this.f23943y;
        eVar.getClass();
        synchronized (e.O) {
            try {
                if (eVar.H == this) {
                    eVar.H = null;
                    eVar.I.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        if (this.f23942x.isEmpty()) {
            return;
        }
        this.f23943y.b(this);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        xe.b bVar = new xe.b(13, null, null);
        AtomicReference atomicReference = this.f23939i;
        a0 a0Var = (a0) atomicReference.get();
        int i7 = a0Var == null ? -1 : a0Var.f23917a;
        atomicReference.set(null);
        this.f23943y.h(bVar, i7);
    }
}
