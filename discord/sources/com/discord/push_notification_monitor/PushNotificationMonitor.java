package com.discord.push_notification_monitor;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import pr.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ \u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/discord/push_notification_monitor/PushNotificationMonitor;", "", "<init>", "()V", "MAX_PUSH_LOG_SIZE", "", "logPushNotification", "", "context", "Landroid/content/Context;", "loggedInUserId", "", "pushNotification", "Lcom/discord/push_notification_monitor/PushNotificationMeta;", "getPushLog", "Lcom/discord/push_notification_monitor/PushNotificationLog;", "userId", "clearPushLog", "writePushLog", "pushLog", "push_notification_monitor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPushNotificationMonitor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushNotificationMonitor.kt\ncom/discord/push_notification_monitor/PushNotificationMonitor\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 3 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n123#2:74\n113#2:97\n40#3,7:75\n47#3,6:84\n40#3,7:90\n47#3,6:98\n1869#4,2:82\n*S KotlinDebug\n*F\n+ 1 PushNotificationMonitor.kt\ncom/discord/push_notification_monitor/PushNotificationMonitor\n*L\n35#1:74\n53#1:97\n43#1:75,7\n43#1:84,6\n52#1:90,7\n52#1:98,6\n44#1:82,2\n*E\n"})
public final class PushNotificationMonitor {

    @NotNull
    public static final PushNotificationMonitor INSTANCE = new PushNotificationMonitor();
    private static final int MAX_PUSH_LOG_SIZE = 100;

    private PushNotificationMonitor() {
    }

    private final void writePushLog(Context context, String userId, PushNotificationLog pushLog) {
        SharedPreferences.Editor editorEdit = PushNotificationMonitorModule.INSTANCE.getPushNotificationLogStorage(context).edit();
        b bVar = Json.f14760d;
        bVar.getClass();
        editorEdit.putString(userId, bVar.c(PushNotificationLog.INSTANCE.serializer(), pushLog));
        editorEdit.apply();
    }

    public final void clearPushLog(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences pushNotificationLogStorage = PushNotificationMonitorModule.INSTANCE.getPushNotificationLogStorage(context);
        SharedPreferences.Editor editorEdit = pushNotificationLogStorage.edit();
        Iterator<T> it = pushNotificationLogStorage.getAll().keySet().iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        editorEdit.apply();
    }

    @NotNull
    public final PushNotificationLog getPushLog(@NotNull Context context, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userId, "userId");
        SharedPreferences pushNotificationLogStorage = PushNotificationMonitorModule.INSTANCE.getPushNotificationLogStorage(context);
        if (pushNotificationLogStorage.getString(userId, null) == null) {
            return new PushNotificationLog((List) null, 1, (DefaultConstructorMarker) null);
        }
        b bVar = Json.f14760d;
        String string = pushNotificationLogStorage.getString(userId, "");
        String str = string != null ? string : "";
        bVar.getClass();
        return (PushNotificationLog) bVar.b(PushNotificationLog.INSTANCE.serializer(), str);
    }

    public final void logPushNotification(@NotNull Context context, @NotNull String loggedInUserId, @NotNull PushNotificationMeta pushNotification) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(loggedInUserId, "loggedInUserId");
        Intrinsics.checkNotNullParameter(pushNotification, "pushNotification");
        ArrayList arrayListJ0 = CollectionsKt.j0(getPushLog(context, loggedInUserId).getPushNotifications());
        arrayListJ0.add(pushNotification);
        if (arrayListJ0.size() == 100) {
            arrayListJ0.remove(0);
        }
        writePushLog(context, loggedInUserId, new PushNotificationLog(arrayListJ0));
    }
}
