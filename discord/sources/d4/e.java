package d4;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;
import v3.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static void a(Service service, int i7, Notification notification, int i10) {
        try {
            service.startForeground(i7, notification, i10);
        } catch (ForegroundServiceStartNotAllowedException e10) {
            q qVarD = q.d();
            String str = SystemForegroundService.f2844x;
            if (qVarD.f21419a <= 5) {
                Log.w(str, "Unable to start foreground service", e10);
            }
        } catch (SecurityException e11) {
            q qVarD2 = q.d();
            String str2 = SystemForegroundService.f2844x;
            if (qVarD2.f21419a <= 5) {
                Log.w(str2, "Unable to start foreground service", e11);
            }
        }
    }
}
