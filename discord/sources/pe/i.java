package pe;

import af.w;
import android.content.Context;
import android.util.LogPrinter;
import com.google.android.gms.internal.gtm.zzav;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile i f18021e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f18023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile zzav f18024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f18025d;

    public i(Context context) {
        Context applicationContext = context.getApplicationContext();
        w.g(applicationContext);
        this.f18022a = applicationContext;
        this.f18023b = new f(this);
        new CopyOnWriteArrayList();
        new LogPrinter(4, "GA/LogCatTransport");
    }

    public static void a() {
        if (!(Thread.currentThread() instanceof h)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }
}
