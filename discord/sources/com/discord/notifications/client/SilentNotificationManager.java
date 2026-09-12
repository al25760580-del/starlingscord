package com.discord.notifications.client;

import android.content.Context;
import android.content.SharedPreferences;
import com.discord.notifications.api.NotificationData;
import com.discord.primitives.ChannelId;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 +2\u00020\u0001:\u0001+B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010$\u001a\u00020 H\u0002¢\u0006\u0004\b%\u0010&J\u0013\u0010'\u001a\u00020(*\u00020\u0014H\u0002¢\u0006\u0004\b)\u0010*R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/discord/notifications/client/SilentNotificationManager;", "", "reactContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "sharedPrefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "handleAcks", "", "notificationData", "Lcom/discord/notifications/api/NotificationData;", "shouldDisplayNotification", "", "onDisplayNotification", "onSilentNotification", "setMessageReceivedForChannel", "updateLastMessageReceivedForChannel", "channelId", "Lcom/discord/primitives/ChannelId;", "updateLastMessageReceivedForChannel-R7gqayM", "(J)V", "setLastMessageReceivedForChannel", "timestamp", "", "setLastMessageReceivedForChannel-LJLSWy8", "(JJ)V", "lastMessagedReceivedAgoInMins", "lastMessagedReceivedAgoInMins-R7gqayM", "(J)J", "getNumAccumulatedMessagesForChannel", "", "getNumAccumulatedMessagesForChannel-R7gqayM", "(J)I", "setNumAccumulatedMessagesForChannel", "number", "setNumAccumulatedMessagesForChannel-LJLSWy8", "(JI)V", "toMessageCountKey", "", "toMessageCountKey-R7gqayM", "(J)Ljava/lang/String;", "Companion", "notification_client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSilentNotificationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SilentNotificationManager.kt\ncom/discord/notifications/client/SilentNotificationManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,109:1\n1869#2,2:110\n40#3,13:112\n40#3,13:125\n*S KotlinDebug\n*F\n+ 1 SilentNotificationManager.kt\ncom/discord/notifications/client/SilentNotificationManager\n*L\n27#1:110,2\n84#1:112,13\n104#1:125,13\n*E\n"})
public final class SilentNotificationManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int IDLE_TIME_TO_RECEIVE_PUSH_FROM_GDM_OR_SMALL_GUILD_MINS = 15;
    public static final int MAX_MESSAGES_BEFORE_THROTTLE = 3;

    @NotNull
    public static final String SILENT_NOTIFICATION_CACHE_STORE_NAME = "silent_notifications";
    private static SilentNotificationManager instance;
    private final SharedPreferences sharedPrefs;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discord/notifications/client/SilentNotificationManager$Companion;", "", "<init>", "()V", "SILENT_NOTIFICATION_CACHE_STORE_NAME", "", "IDLE_TIME_TO_RECEIVE_PUSH_FROM_GDM_OR_SMALL_GUILD_MINS", "", "MAX_MESSAGES_BEFORE_THROTTLE", "instance", "Lcom/discord/notifications/client/SilentNotificationManager;", "get", "context", "Landroid/content/Context;", "notification_client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSilentNotificationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SilentNotificationManager.kt\ncom/discord/notifications/client/SilentNotificationManager$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1#2:110\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SilentNotificationManager get(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            SilentNotificationManager silentNotificationManager = SilentNotificationManager.instance;
            if (silentNotificationManager != null) {
                return silentNotificationManager;
            }
            SilentNotificationManager silentNotificationManager2 = new SilentNotificationManager(context);
            SilentNotificationManager.instance = silentNotificationManager2;
            return silentNotificationManager2;
        }

        private Companion() {
        }
    }

    public SilentNotificationManager(@NotNull Context reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.sharedPrefs = reactContext.getSharedPreferences(SILENT_NOTIFICATION_CACHE_STORE_NAME, 0);
    }

    /* JADX INFO: renamed from: getNumAccumulatedMessagesForChannel-R7gqayM, reason: not valid java name */
    private final int m1106getNumAccumulatedMessagesForChannelR7gqayM(long channelId) {
        return this.sharedPrefs.getInt(m1110toMessageCountKeyR7gqayM(channelId), 0);
    }

    /* JADX INFO: renamed from: lastMessagedReceivedAgoInMins-R7gqayM, reason: not valid java name */
    private final long m1107lastMessagedReceivedAgoInMinsR7gqayM(long channelId) {
        long j = this.sharedPrefs.getLong(ChannelId.m1137toStringimpl(channelId), 0L);
        return TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - j);
    }

    /* JADX INFO: renamed from: setLastMessageReceivedForChannel-LJLSWy8, reason: not valid java name */
    private final void m1108setLastMessageReceivedForChannelLJLSWy8(long channelId, long timestamp) {
        SharedPreferences sharedPrefs = this.sharedPrefs;
        Intrinsics.checkNotNullExpressionValue(sharedPrefs, "sharedPrefs");
        SharedPreferences.Editor editorEdit = sharedPrefs.edit();
        editorEdit.putLong(ChannelId.m1137toStringimpl(channelId), timestamp);
        editorEdit.apply();
    }

    private final void setMessageReceivedForChannel(NotificationData notificationData) {
        ChannelId channelIdM1090getChannelIdqMVnFVQ = notificationData.m1090getChannelIdqMVnFVQ();
        if (channelIdM1090getChannelIdqMVnFVQ != null) {
            long jM1139unboximpl = channelIdM1090getChannelIdqMVnFVQ.m1139unboximpl();
            m1109setNumAccumulatedMessagesForChannelLJLSWy8(jM1139unboximpl, m1106getNumAccumulatedMessagesForChannelR7gqayM(jM1139unboximpl) + 1);
            m1111updateLastMessageReceivedForChannelR7gqayM(jM1139unboximpl);
        }
    }

    /* JADX INFO: renamed from: setNumAccumulatedMessagesForChannel-LJLSWy8, reason: not valid java name */
    private final void m1109setNumAccumulatedMessagesForChannelLJLSWy8(long channelId, int number) {
        SharedPreferences sharedPrefs = this.sharedPrefs;
        Intrinsics.checkNotNullExpressionValue(sharedPrefs, "sharedPrefs");
        SharedPreferences.Editor editorEdit = sharedPrefs.edit();
        editorEdit.putInt(m1110toMessageCountKeyR7gqayM(channelId), number);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: toMessageCountKey-R7gqayM, reason: not valid java name */
    private final String m1110toMessageCountKeyR7gqayM(long j) {
        return b.j(ChannelId.m1137toStringimpl(j), "_num");
    }

    /* JADX INFO: renamed from: updateLastMessageReceivedForChannel-R7gqayM, reason: not valid java name */
    private final void m1111updateLastMessageReceivedForChannelR7gqayM(long channelId) {
        m1108setLastMessageReceivedForChannelLJLSWy8(channelId, System.currentTimeMillis());
    }

    public final void handleAcks(@NotNull NotificationData notificationData) {
        Intrinsics.checkNotNullParameter(notificationData, "notificationData");
        Iterator<T> it = notificationData.getAckChannelIds().iterator();
        while (it.hasNext()) {
            m1109setNumAccumulatedMessagesForChannelLJLSWy8(((ChannelId) it.next()).m1139unboximpl(), 0);
        }
    }

    public final void onDisplayNotification(@NotNull NotificationData notificationData) {
        Intrinsics.checkNotNullParameter(notificationData, "notificationData");
        Integer channelType = notificationData.getChannelType();
        if (channelType != null && channelType.intValue() == 1) {
            return;
        }
        setMessageReceivedForChannel(notificationData);
    }

    public final void onSilentNotification(@NotNull NotificationData notificationData) {
        Intrinsics.checkNotNullParameter(notificationData, "notificationData");
        setMessageReceivedForChannel(notificationData);
    }

    public final boolean shouldDisplayNotification(@NotNull NotificationData notificationData) {
        Integer channelType;
        Intrinsics.checkNotNullParameter(notificationData, "notificationData");
        if (!Intrinsics.areEqual(notificationData.getType(), NotificationData.TYPE_MESSAGE_CREATE) || ((channelType = notificationData.getChannelType()) != null && channelType.intValue() == 1)) {
            return true;
        }
        ChannelId channelIdM1090getChannelIdqMVnFVQ = notificationData.m1090getChannelIdqMVnFVQ();
        if (channelIdM1090getChannelIdqMVnFVQ != null) {
            long jM1139unboximpl = channelIdM1090getChannelIdqMVnFVQ.m1139unboximpl();
            if (m1106getNumAccumulatedMessagesForChannelR7gqayM(jM1139unboximpl) < 3) {
                return true;
            }
            if (m1107lastMessagedReceivedAgoInMinsR7gqayM(jM1139unboximpl) >= 15) {
                m1109setNumAccumulatedMessagesForChannelLJLSWy8(jM1139unboximpl, 0);
                return true;
            }
        }
        return false;
    }
}
