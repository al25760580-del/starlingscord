package gc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends BroadcastReceiver implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f9549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f9550e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b f9551i;

    public a(b bVar, Handler handler, w wVar) {
        this.f9551i = bVar;
        this.f9550e = handler;
        this.f9549d = wVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f9550e.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9551i.f9562b) {
            this.f9549d.f9916d.u0(-1, 3, false);
        }
    }
}
