package x0;

import android.app.Notification;
import android.graphics.drawable.Icon;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {
    public static Icon a(Notification notification) {
        return notification.getLargeIcon();
    }

    public static Icon b(Notification notification) {
        return notification.getSmallIcon();
    }
}
