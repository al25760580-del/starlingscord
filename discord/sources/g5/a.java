package g5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.react.uimanager.ThemedReactContext;

/* JADX INFO: loaded from: classes.dex */
public final class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f9496b = b.j;

    public a(ThemedReactContext themedReactContext) {
        this.f9495a = themedReactContext.getApplicationContext();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f9496b.e();
        }
    }
}
