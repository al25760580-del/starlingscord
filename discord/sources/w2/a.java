package w2;

import a5.v;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.play_billing.u0;
import java.util.concurrent.atomic.AtomicBoolean;
import l4.b0;
import ue.d;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static Handler f21998x;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f22003w;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile int f22000e = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f22001i = new AtomicBoolean();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f22002v = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f21999d = new b0(this, new v(3, this));

    public a(d dVar) {
        this.f22003w = dVar;
    }

    public final void a(Object obj) {
        Handler handler;
        synchronized (a.class) {
            try {
                if (f21998x == null) {
                    f21998x = new Handler(Looper.getMainLooper());
                }
                handler = f21998x;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        handler.post(new u0(this, obj, 21, false));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22003w.b();
    }
}
