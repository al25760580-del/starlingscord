package af;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import com.discord.jank_stats.JankRecordStore;
import com.discord.misc.utilities.logThrottle.LogThrottleSingleton;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f447g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static i0 f448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static HandlerThread f449i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f450a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile eg.a f452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ef.a f453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f455f;

    public i0(Context context, Looper looper) {
        h0 h0Var = new h0(this);
        this.f451b = context.getApplicationContext();
        eg.a aVar = new eg.a(looper, h0Var);
        Looper.getMainLooper();
        this.f452c = aVar;
        this.f453d = ef.a.a();
        this.f454e = JankRecordStore.FIRST_FLUSH_DELAY_MS;
        this.f455f = LogThrottleSingleton.RATE_LIMIT_FIVE_MINUTES;
    }

    public final xe.b a(f0 f0Var, b0 b0Var, String str) {
        xe.b bVarA;
        HashMap map = this.f450a;
        synchronized (map) {
            try {
                g0 g0Var = (g0) map.get(f0Var);
                if (g0Var == null) {
                    g0Var = new g0(this, f0Var);
                    g0Var.f429d.put(b0Var, b0Var);
                    bVarA = g0Var.a(str, null);
                    map.put(f0Var, g0Var);
                } else {
                    this.f452c.removeMessages(0, f0Var);
                    if (g0Var.f429d.containsKey(b0Var)) {
                        String string = f0Var.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 81);
                        sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb2.append(string);
                        throw new IllegalStateException(sb2.toString());
                    }
                    g0Var.f429d.put(b0Var, b0Var);
                    int i7 = g0Var.f430e;
                    if (i7 == 1) {
                        b0Var.onServiceConnected(g0Var.f434x, g0Var.f432v);
                    } else if (i7 == 2) {
                        bVarA = g0Var.a(str, null);
                    }
                    bVarA = null;
                }
                if (g0Var.f431i) {
                    return xe.b.f22908x;
                }
                if (bVarA == null) {
                    bVarA = new xe.b(-1, null, null);
                }
                return bVarA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(String str, ServiceConnection serviceConnection, boolean z5) {
        f0 f0Var = new f0(str, z5);
        w.h(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f450a;
        synchronized (map) {
            try {
                g0 g0Var = (g0) map.get(f0Var);
                if (g0Var == null) {
                    String string = f0Var.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 50);
                    sb2.append("Nonexistent connection status for service config: ");
                    sb2.append(string);
                    throw new IllegalStateException(sb2.toString());
                }
                if (!g0Var.f429d.containsKey(serviceConnection)) {
                    String string2 = f0Var.toString();
                    StringBuilder sb3 = new StringBuilder(string2.length() + 76);
                    sb3.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb3.append(string2);
                    throw new IllegalStateException(sb3.toString());
                }
                g0Var.f429d.remove(serviceConnection);
                if (g0Var.f429d.isEmpty()) {
                    this.f452c.sendMessageDelayed(this.f452c.obtainMessage(0, f0Var), this.f454e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
