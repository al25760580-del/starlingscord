package ze;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f23959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f23960b;

    public q(p pVar) {
        this.f23960b = pVar;
    }

    public final void a(Context context) {
        this.f23959a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.f23959a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f23959a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f23960b.a();
            b();
        }
    }
}
