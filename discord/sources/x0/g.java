package x0;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static void a(NotificationChannel notificationChannel) {
        notificationChannel.canBubble();
    }

    public static boolean b(Notification notification) {
        return notification.getAllowSystemGeneratedContextualActions();
    }

    public static Notification.BubbleMetadata c(Notification notification) {
        return notification.getBubbleMetadata();
    }

    public static int d(RemoteInput remoteInput) {
        return remoteInput.getEditChoicesBeforeSending();
    }

    public static LocusId e(Notification notification) {
        return notification.getLocusId();
    }

    public static String f(Context context) {
        return context.getOpPackageName();
    }

    public static void g(Notification.Builder builder, boolean z5) {
        builder.setAllowSystemGeneratedContextualActions(z5);
    }

    public static void h(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
        builder.setBubbleMetadata(bubbleMetadata);
    }

    public static void i(Notification.Action.Builder builder, boolean z5) {
        builder.setContextual(z5);
    }

    public static void j(RemoteInput.Builder builder, int i7) {
        builder.setEditChoicesBeforeSending(i7);
    }

    public static void k(Notification.Builder builder, Object obj) {
        builder.setLocusId((LocusId) obj);
    }
}
