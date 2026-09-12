package x0;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {
    public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
        return messagingStyle.addHistoricMessage(message);
    }
}
