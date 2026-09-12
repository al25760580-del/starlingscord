package x0;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.RemoteInput;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static long[] A(NotificationChannel notificationChannel) {
        return notificationChannel.getVibrationPattern();
    }

    public static void B(RemoteInput.Builder builder, String str) {
        builder.setAllowDataType(str, true);
    }

    public static void C(Notification.Builder builder, int i7) {
        builder.setBadgeIconType(i7);
    }

    public static void D(Notification.Builder builder, boolean z5) {
        builder.setColorized(z5);
    }

    public static void E(NotificationChannel notificationChannel, String str) {
        notificationChannel.setDescription(str);
    }

    public static void F(NotificationChannel notificationChannel, String str) {
        notificationChannel.setGroup(str);
    }

    public static void G(Notification.Builder builder, int i7) {
        builder.setGroupAlertBehavior(i7);
    }

    public static void H(NotificationChannel notificationChannel, int i7) {
        notificationChannel.setLightColor(i7);
    }

    public static void I(Notification.Builder builder, CharSequence charSequence) {
        builder.setSettingsText(charSequence);
    }

    public static void J(Notification.Builder builder, String str) {
        builder.setShortcutId(str);
    }

    public static void K(NotificationChannel notificationChannel, boolean z5) {
        notificationChannel.setShowBadge(z5);
    }

    public static void L(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
        notificationChannel.setSound(uri, audioAttributes);
    }

    public static void M(Notification.Builder builder, long j) {
        builder.setTimeoutAfter(j);
    }

    public static void N(NotificationChannel notificationChannel, long[] jArr) {
        notificationChannel.setVibrationPattern(jArr);
    }

    public static boolean O(NotificationChannel notificationChannel) {
        return notificationChannel.shouldShowLights();
    }

    public static boolean P(NotificationChannel notificationChannel) {
        return notificationChannel.shouldVibrate();
    }

    public static void a(NotificationChannel notificationChannel) {
        notificationChannel.canBypassDnd();
    }

    public static boolean b(NotificationChannel notificationChannel) {
        return notificationChannel.canShowBadge();
    }

    public static Notification.Builder c(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static NotificationChannel d(int i7, CharSequence charSequence, String str) {
        return new NotificationChannel(str, charSequence, i7);
    }

    public static NotificationChannelGroup e(CharSequence charSequence, String str) {
        return new NotificationChannelGroup(str, charSequence);
    }

    public static void f(NotificationManager notificationManager, ArrayList arrayList) {
        notificationManager.createNotificationChannelGroups(arrayList);
    }

    public static void g(NotificationManager notificationManager, ArrayList arrayList) {
        notificationManager.createNotificationChannels(arrayList);
    }

    public static void h(NotificationManager notificationManager, String str) {
        notificationManager.deleteNotificationChannel(str);
    }

    public static void i(NotificationManager notificationManager, String str) {
        notificationManager.deleteNotificationChannelGroup(str);
    }

    public static void j(NotificationChannel notificationChannel, boolean z5) {
        notificationChannel.enableLights(z5);
    }

    public static void k(NotificationChannel notificationChannel, boolean z5) {
        notificationChannel.enableVibration(z5);
    }

    public static AudioAttributes l(NotificationChannel notificationChannel) {
        return notificationChannel.getAudioAttributes();
    }

    public static List m(NotificationChannelGroup notificationChannelGroup) {
        return notificationChannelGroup.getChannels();
    }

    public static String n(NotificationChannel notificationChannel) {
        return notificationChannel.getDescription();
    }

    public static String o(NotificationChannel notificationChannel) {
        return notificationChannel.getGroup();
    }

    public static String p(NotificationChannel notificationChannel) {
        return notificationChannel.getId();
    }

    public static String q(NotificationChannelGroup notificationChannelGroup) {
        return notificationChannelGroup.getId();
    }

    public static int r(NotificationChannel notificationChannel) {
        return notificationChannel.getImportance();
    }

    public static int s(NotificationChannel notificationChannel) {
        return notificationChannel.getLightColor();
    }

    public static void t(NotificationChannel notificationChannel) {
        notificationChannel.getLockscreenVisibility();
    }

    public static CharSequence u(NotificationChannel notificationChannel) {
        return notificationChannel.getName();
    }

    public static CharSequence v(NotificationChannelGroup notificationChannelGroup) {
        return notificationChannelGroup.getName();
    }

    public static NotificationChannel w(NotificationManager notificationManager, String str) {
        return notificationManager.getNotificationChannel(str);
    }

    public static List x(NotificationManager notificationManager) {
        return notificationManager.getNotificationChannelGroups();
    }

    public static List y(NotificationManager notificationManager) {
        return notificationManager.getNotificationChannels();
    }

    public static Uri z(NotificationChannel notificationChannel) {
        return notificationChannel.getSound();
    }
}
