package x0;

import android.app.NotificationChannel;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static String a(NotificationChannel notificationChannel) {
        return notificationChannel.getConversationId();
    }

    public static String b(NotificationChannel notificationChannel) {
        return notificationChannel.getParentChannelId();
    }

    public static void c(NotificationChannel notificationChannel) {
        notificationChannel.isImportantConversation();
    }

    public static void d(NotificationChannel notificationChannel, String str, String str2) {
        notificationChannel.setConversationId(str, str2);
    }
}
