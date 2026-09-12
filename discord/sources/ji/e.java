package ji;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference f13888b = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13889a;

    public e(Context context) {
        this.f13889a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (f.j) {
            try {
                Iterator it = ((s.d) f.k.values()).iterator();
                while (it.hasNext()) {
                    ((f) it.next()).d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f13889a.unregisterReceiver(this);
    }
}
