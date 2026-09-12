package x0;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public static boolean a(Notification.Action action) {
        return action.isAuthenticationRequired();
    }
}
