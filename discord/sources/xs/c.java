package xs;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static d f23087a;

    /* JADX WARN: Code duplicated, block: B:23:0x003e A[Catch: all -> 0x0034, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x000e, B:10:0x0013, B:15:0x001b, B:17:0x0027, B:22:0x0037, B:23:0x003e, B:25:0x0042, B:26:0x0049, B:27:0x004b), top: B:31:0x0003, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0042 A[Catch: all -> 0x0034, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x000e, B:10:0x0013, B:15:0x001b, B:17:0x0027, B:22:0x0037, B:23:0x003e, B:25:0x0042, B:26:0x0049, B:27:0x004b), top: B:31:0x0003, inners: #1 }] */
    public static d a(Context context, b bVar) {
        d dVar;
        synchronized (c.class) {
            if (f23087a != null || Build.VERSION.SDK_INT < 30) {
                if (f23087a == null) {
                    f23087a = new d(0);
                }
                dVar = f23087a;
            } else {
                if (d.a(context).getBoolean("android.net.http.EnableTelemetry", bVar == b.f23085w || bVar == b.f23083i)) {
                    try {
                        d dVar2 = new d(1);
                        new AtomicInteger();
                        f23087a = dVar2;
                    } catch (Exception e10) {
                        Log.e("c", "Exception creating an instance of CronetLoggerImpl", e10);
                    }
                    if (f23087a == null) {
                        f23087a = new d(0);
                    }
                    dVar = f23087a;
                } else {
                    if (f23087a == null) {
                        f23087a = new d(0);
                    }
                    dVar = f23087a;
                }
            }
            throw th;
        }
        return dVar;
    }
}
