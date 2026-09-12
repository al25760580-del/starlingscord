package af;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements ServiceConnection {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f429d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f430e = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f431i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public IBinder f432v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f0 f433w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ComponentName f434x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i0 f435y;

    public g0(i0 i0Var, f0 f0Var) {
        this.f435y = i0Var;
        this.f433w = f0Var;
    }

    public final xe.b a(String str, Executor executor) throws Throwable {
        try {
            Intent intentA = y.a(this.f435y.f451b, this.f433w);
            this.f430e = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(ff.h.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                i0 i0Var = this.f435y;
                ef.a aVar = i0Var.f453d;
                Context context = i0Var.f451b;
                f0 f0Var = this.f433w;
                try {
                    boolean zC = aVar.c(context, str, intentA, this, 4225, executor);
                    this.f431i = zC;
                    if (zC) {
                        i0Var.f452c.sendMessageDelayed(i0Var.f452c.obtainMessage(1, f0Var), i0Var.f455f);
                        xe.b bVar = xe.b.f22908x;
                        StrictMode.setVmPolicy(vmPolicy);
                        return bVar;
                    }
                    this.f430e = 2;
                    try {
                        i0Var.f453d.b(i0Var.f451b, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    xe.b bVar2 = new xe.b(16, null, null);
                    StrictMode.setVmPolicy(vmPolicy);
                    return bVar2;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    StrictMode.setVmPolicy(vmPolicy);
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (x e10) {
            return e10.f495d;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        i0 i0Var = this.f435y;
        synchronized (i0Var.f450a) {
            try {
                i0Var.f452c.removeMessages(1, this.f433w);
                this.f432v = iBinder;
                this.f434x = componentName;
                Iterator it = this.f429d.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f430e = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        i0 i0Var = this.f435y;
        synchronized (i0Var.f450a) {
            try {
                i0Var.f452c.removeMessages(1, this.f433w);
                this.f432v = null;
                this.f434x = componentName;
                Iterator it = this.f429d.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f430e = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
