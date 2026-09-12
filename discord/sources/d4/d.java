package d4;

import android.app.Notification;
import android.app.Service;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static void a(Service service, int i7, Notification notification, int i10) {
        service.startForeground(i7, notification, i10);
    }
}
