package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import v3.q;
import w3.o;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f2834a = q.f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        q.d().a(f2834a, "Received intent " + intent);
        try {
            o oVarA = o.a(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (o.f22045m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = oVarA.f22054i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    oVarA.f22054i = pendingResultGoAsync;
                    if (oVarA.f22053h) {
                        pendingResultGoAsync.finish();
                        oVarA.f22054i = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (IllegalStateException e10) {
            q.d().c(f2834a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }
}
