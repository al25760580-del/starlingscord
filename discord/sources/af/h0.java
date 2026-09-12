package af;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements Handler.Callback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0 f443d;

    public /* synthetic */ h0(i0 i0Var) {
        this.f443d = i0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        if (i7 == 0) {
            i0 i0Var = this.f443d;
            synchronized (i0Var.f450a) {
                try {
                    f0 f0Var = (f0) message.obj;
                    g0 g0Var = (g0) i0Var.f450a.get(f0Var);
                    if (g0Var != null && g0Var.f429d.isEmpty()) {
                        if (g0Var.f431i) {
                            f0 f0Var2 = g0Var.f433w;
                            i0 i0Var2 = g0Var.f435y;
                            i0Var2.f452c.removeMessages(1, f0Var2);
                            i0Var2.f453d.b(i0Var2.f451b, g0Var);
                            g0Var.f431i = false;
                            g0Var.f430e = 2;
                        }
                        i0Var.f450a.remove(f0Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
        if (i7 != 1) {
            return false;
        }
        i0 i0Var3 = this.f443d;
        synchronized (i0Var3.f450a) {
            try {
                f0 f0Var3 = (f0) message.obj;
                g0 g0Var2 = (g0) i0Var3.f450a.get(f0Var3);
                if (g0Var2 != null && g0Var2.f430e == 3) {
                    String strValueOf = String.valueOf(f0Var3);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 47);
                    sb2.append("Timeout waiting for ServiceConnection callback ");
                    sb2.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb2.toString(), new Exception());
                    ComponentName componentName = g0Var2.f434x;
                    if (componentName == null) {
                        f0Var3.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = f0Var3.f427b;
                        w.g(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    g0Var2.onServiceDisconnected(componentName);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return true;
    }
}
