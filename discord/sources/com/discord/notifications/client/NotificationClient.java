package com.discord.notifications.client;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import androidx.core.app.NotificationManagerCompat;
import com.discord.crash_reporting.CrashReporting;
import com.discord.crash_reporting.d;
import com.discord.emoji.a;
import com.discord.jank_stats.JankRecordStore;
import com.discord.logging.Log;
import com.discord.misc.utilities.intent.IntentUtilsKt;
import com.discord.notifications.actions.intents.ContentAction;
import com.discord.notifications.actions.intents.NotificationAction;
import com.discord.notifications.api.ConfiguredNotifChannel;
import com.discord.notifications.api.ConfiguredNotifGroup;
import com.discord.notifications.api.DirectReplyMessage;
import com.discord.notifications.api.KvMessageEntry;
import com.discord.notifications.api.NotifTypeMapping;
import com.discord.notifications.api.NotificationData;
import com.discord.notifications.renderer.NotificationBehaviors;
import com.discord.notifications.renderer.NotificationRenderer;
import com.discord.notifications.renderer.utils.NotificationDataUtilsKt;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.MessageId;
import com.discord.primitives.UserId;
import com.discord.push_notification_monitor.PushNotificationMeta;
import com.discord.push_notification_monitor.PushNotificationMonitor;
import com.discord.react.headless_tasks.api.HeadlessTasks;
import com.discord.shortcuts.ShortcutData;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.modules.appstate.AppStateModule;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.collections.v0;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import org.jetbrains.annotations.NotNull;
import pr.b;
import pr.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 y2\u00020\u0001:\u0001yB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\r¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u00020\n2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0$¢\u0006\u0004\b&\u0010'J/\u0010)\u001a\u00020\n2 \u0010(\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0004\u0012\u00020\n0$¢\u0006\u0004\b)\u0010'J/\u0010*\u001a\u00020\n2 \u0010(\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0004\u0012\u00020\n0$¢\u0006\u0004\b*\u0010'J\u001d\u0010-\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020+2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b/\u00100J\u001d\u00102\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00101\u001a\u00020+¢\u0006\u0004\b2\u0010.J\u0015\u00103\u001a\u00020+2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b3\u00100J\u001d\u00105\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00104\u001a\u00020+¢\u0006\u0004\b5\u0010.J\u0015\u00106\u001a\u00020+2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b6\u00100J\u001d\u00108\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00107\u001a\u00020+¢\u0006\u0004\b8\u0010.J)\u0010;\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u00109\u001a\u0004\u0018\u00010\u00072\b\u0010:\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b;\u0010<J\u001f\u0010>\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010=\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b>\u0010\u001aJ\u001d\u0010@\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010?\u001a\u00020+¢\u0006\u0004\b@\u0010.J\u0015\u0010A\u001a\u00020+2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bA\u00100J\u001f\u0010C\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u0007H\u0007¢\u0006\u0004\bC\u0010\u001aJ\u001f\u0010F\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010E\u001a\u00020DH\u0007¢\u0006\u0004\bF\u0010GJ5\u0010I\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010H\u001a\u00020DH\u0007¢\u0006\u0004\bI\u0010JJ\u001d\u0010K\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010E\u001a\u00020\u0007¢\u0006\u0004\bK\u0010\u001aJ+\u0010M\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0007¢\u0006\u0004\bM\u0010NJ\u0015\u0010O\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bO\u0010PJ%\u0010Q\u001a\u00020\n2\u0014\u0010L\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bQ\u0010RJ#\u0010T\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010S\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\bT\u0010UJE\u0010[\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010W\u001a\u00020V2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010Y\u001a\u00020+2\b\b\u0002\u0010Z\u001a\u00020+H\u0003¢\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\u00020+2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b]\u00100J'\u0010^\u001a\u00020\n2\u0016\u0010L\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b^\u0010RJ\u0019\u0010`\u001a\u0004\u0018\u00010_2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b`\u0010aJ\u001f\u0010b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010W\u001a\u00020VH\u0003¢\u0006\u0004\bb\u0010cR(\u0010e\u001a\b\u0012\u0004\u0012\u00020+0d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0018\u0010!\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010kR\"\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010lR&\u0010m\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR2\u0010(\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010lR2\u0010o\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010lR\u0016\u0010q\u001a\u00020p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010t\u001a\u00020s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010w\u001a\u00020v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010x¨\u0006z"}, d2 = {"Lcom/discord/notifications/client/NotificationClient;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "", "localizedCategoryNames", "localizedGroupNames", "", "initNotificationCategories", "(Landroid/content/Context;Ljava/util/Map;Ljava/util/Map;)V", "", "Lcom/discord/notifications/api/ConfiguredNotifGroup;", "groups", "Lcom/discord/notifications/api/ConfiguredNotifChannel;", "channels", "initNotificationGroupsAndChannels", "(Landroid/content/Context;Ljava/util/List;Ljava/util/List;)V", "Lcom/discord/notifications/api/NotifTypeMapping;", "mappings", "initNotificationTypeMappings", "(Landroid/content/Context;Ljava/util/List;)V", StackTraceHelper.NAME_KEY, "setIncomingRingtone", "(Landroid/content/Context;Ljava/lang/String;)V", "Landroid/content/Intent;", "intent", "handleIntent", "(Landroid/content/Context;Landroid/content/Intent;)V", "getPendingNotification", "()Ljava/util/Map;", "token", "setToken", "(Ljava/lang/String;)V", "Lkotlin/Function1;", "tokenListener", "setTokenListener", "(Lkotlin/jvm/functions/Function1;)V", "notificationListener", "setNotificationListener", "setLocalNotificationListener", "", "isAuthed", "setIsAuthed", "(Landroid/content/Context;Z)V", "isSoundsEnabled", "(Landroid/content/Context;)Z", "soundsEnabled", "setSoundsEnabled", "isVibrationsEnabled", "vibrationsEnabled", "setVibrationsEnabled", "isLightsEnabled", "lightsEnabled", "setLightsEnabled", NotificationRenderer.USERNAME, "userId", "setCurrentUser", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "usernamesJson", "setMultiAccountUsernames", "notifyEveryTime", "setNotifyEveryTime", "shouldNotifyEveryTime", "data", "onDirectReplySuccess", "", "channelId", "markNotificationAsDirectReply", "(Landroid/content/Context;J)V", "sentAt", "onNotificationReceived", "(Landroid/content/Context;Ljava/util/Map;J)V", "ackReactionNotifications", "notification", "showLocalNotification", "(Landroid/content/Context;Ljava/util/Map;)V", "clearAllNotifications", "(Landroid/content/Context;)V", "setLocalNotification", "(Ljava/util/Map;)V", "receivingUserId", "getAccountLabel", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "Lcom/discord/notifications/api/NotificationData;", "notificationData", "notificationDataMap", "makeOrUpdateShortcut", "preserveAccountLabel", "showNotification", "(Landroid/content/Context;Lcom/discord/notifications/api/NotificationData;Ljava/util/Map;ZZ)V", "updateAndComputeIfShouldRunBackgroundSync", "setNotification", "Lcom/discord/notifications/renderer/NotificationBehaviors;", "getBehaviors", "(Landroid/content/Context;)Lcom/discord/notifications/renderer/NotificationBehaviors;", "appendNotificationToCacheFile", "(Landroid/content/Context;Lcom/discord/notifications/api/NotificationData;)V", "Lkotlin/Function0;", "shouldDisplayNotification", "Lkotlin/jvm/functions/Function0;", "getShouldDisplayNotification", "()Lkotlin/jvm/functions/Function0;", "setShouldDisplayNotification", "(Lkotlin/jvm/functions/Function0;)V", "Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "notificationPending", "Ljava/util/Map;", "notificationLocalListener", "Lcom/discord/notifications/client/NotificationCache;", "cache", "Lcom/discord/notifications/client/NotificationCache;", "Lcom/discord/notifications/renderer/NotificationRenderer;", "renderer", "Lcom/discord/notifications/renderer/NotificationRenderer;", "Lcom/discord/notifications/client/ChannelMessageFetchManager;", "channelMessagesFetcher", "Lcom/discord/notifications/client/ChannelMessageFetchManager;", "Companion", "notification_client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNotificationClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationClient.kt\ncom/discord/notifications/client/NotificationClient\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 NotificationAction.kt\ncom/discord/notifications/actions/intents/NotificationAction$Companion\n+ 4 IntentUtils.kt\ncom/discord/misc/utilities/intent/IntentUtilsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 7 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n*L\n1#1,475:1\n1193#2,2:476\n1267#2,4:478\n120#3,2:482\n123#3,2:485\n14#4:484\n1#5:487\n113#6:488\n113#6:492\n29#7,3:489\n*S KotlinDebug\n*F\n+ 1 NotificationClient.kt\ncom/discord/notifications/client/NotificationClient\n*L\n74#1:476,2\n74#1:478,4\n83#1:482,2\n83#1:485,2\n83#1:484\n360#1:488\n461#1:492\n441#1:489,3\n*E\n"})
public final class NotificationClient {
    private static final long NOTIFICATION_BACKGROUND_SYNC_INTERVAL_MS = 3600000;
    private Function1<? super Map<String, String>, Unit> notificationListener;
    private Function1<? super Map<String, String>, Unit> notificationLocalListener;
    private Map<String, String> notificationPending;
    private String token;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final NotificationClient instance = new NotificationClient();

    @NotNull
    private Function0<Boolean> shouldDisplayNotification = new d(25);

    @NotNull
    private Function1<? super String, Unit> tokenListener = new a(19);

    @NotNull
    private NotificationCache cache = new NotificationCache();

    @NotNull
    private NotificationRenderer renderer = new NotificationRenderer(new NotificationClient$renderer$1(this.cache));

    @NotNull
    private ChannelMessageFetchManager channelMessagesFetcher = new ChannelMessageFetchManager(this.cache);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/discord/notifications/client/NotificationClient$Companion;", "", "<init>", "()V", "NOTIFICATION_BACKGROUND_SYNC_INTERVAL_MS", "", "instance", "Lcom/discord/notifications/client/NotificationClient;", "getInstance", "()Lcom/discord/notifications/client/NotificationClient;", "notification_client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NotificationClient getInstance() {
            return NotificationClient.instance;
        }

        private Companion() {
        }
    }

    private final synchronized void appendNotificationToCacheFile(Context context, NotificationData notificationData) {
        try {
            try {
                File file = new File(context.getCacheDir(), "notifications_to_track");
                if (file.length() >= 5242880) {
                    return;
                }
                boolean zAreNotificationsEnabled = new NotificationManagerCompat(context).f1518b.areNotificationsEnabled();
                JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
                jsonObjectBuilder.b("push_action_type", h.c(notificationData.getType()));
                jsonObjectBuilder.b("os_enabled", h.a(Boolean.valueOf(zAreNotificationsEnabled)));
                String timeReceived = notificationData.getTimeReceived();
                if (timeReceived != null) {
                    jsonObjectBuilder.b("timestamp", h.c(timeReceived));
                }
                String notifTypeId = notificationData.getNotifTypeId();
                if (notifTypeId != null) {
                    jsonObjectBuilder.b("notif_type_id", h.c(notifTypeId));
                }
                String notifInstanceId = notificationData.getNotifInstanceId();
                if (notifInstanceId != null) {
                    jsonObjectBuilder.b("notif_instance_id", h.c(notifInstanceId));
                }
                String joinId = notificationData.getJoinId();
                if (joinId != null) {
                    jsonObjectBuilder.b("join_id", h.c(joinId));
                }
                UserId userIdM1095getUserIdwUX8bhU = notificationData.m1095getUserIdwUX8bhU();
                if (userIdM1095getUserIdwUX8bhU != null) {
                    jsonObjectBuilder.b("notif_user_id", h.c(UserId.m1215toStringimpl(userIdM1095getUserIdwUX8bhU.m1217unboximpl())));
                }
                UserId userIdM1094getReceivingUserIdwUX8bhU = notificationData.m1094getReceivingUserIdwUX8bhU();
                if (userIdM1094getReceivingUserIdwUX8bhU != null) {
                    jsonObjectBuilder.b("receiving_user_id", h.c(UserId.m1215toStringimpl(userIdM1094getReceivingUserIdwUX8bhU.m1217unboximpl())));
                }
                String strM1092getMessageIdN_6c4I0 = notificationData.m1092getMessageIdN_6c4I0();
                if (strM1092getMessageIdN_6c4I0 != null) {
                    jsonObjectBuilder.b("message_id", h.c(MessageId.m1163toStringimpl(MessageId.m1156boximpl(strM1092getMessageIdN_6c4I0).m1165unboximpl())));
                }
                Integer messageType = notificationData.getMessageType();
                if (messageType != null) {
                    jsonObjectBuilder.b("message_type", h.b(Integer.valueOf(messageType.intValue())));
                }
                GuildId guildIdM1091getGuildIdqOKuAAo = notificationData.m1091getGuildIdqOKuAAo();
                if (guildIdM1091getGuildIdqOKuAAo != null) {
                    jsonObjectBuilder.b("guild_id", h.c(GuildId.m1150toStringimpl(guildIdM1091getGuildIdqOKuAAo.m1152unboximpl())));
                }
                ChannelId channelIdM1090getChannelIdqMVnFVQ = notificationData.m1090getChannelIdqMVnFVQ();
                if (channelIdM1090getChannelIdqMVnFVQ != null) {
                    jsonObjectBuilder.b("channel_id", h.c(ChannelId.m1137toStringimpl(channelIdM1090getChannelIdqMVnFVQ.m1139unboximpl())));
                }
                Integer channelType = notificationData.getChannelType();
                if (channelType != null) {
                    jsonObjectBuilder.b("channel_type", h.b(Integer.valueOf(channelType.intValue())));
                }
                Integer relationshipType = notificationData.getRelationshipType();
                if (relationshipType != null) {
                    jsonObjectBuilder.b("rel_type", h.b(Integer.valueOf(relationshipType.intValue())));
                }
                String mentionType = notificationData.getMentionType();
                if (mentionType != null) {
                    jsonObjectBuilder.b("mention_type", h.c(mentionType));
                }
                String appState = notificationData.getAppState();
                if (appState != null) {
                    jsonObjectBuilder.b("app_state", h.c(appState));
                }
                JsonObject jsonObjectA = jsonObjectBuilder.a();
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, true), 8192);
                try {
                    b bVar = Json.f14760d;
                    bVar.getClass();
                    byte[] bytes = bVar.c(JsonObject.INSTANCE.serializer(), jsonObjectA).getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    bufferedOutputStream.write(bytes);
                    bufferedOutputStream.write(10);
                    Unit unit = Unit.f14616a;
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ls.d.k(bufferedOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (Exception e10) {
                Log log = Log.INSTANCE;
                Intrinsics.checkNotNullExpressionValue("NotificationClient", "getSimpleName(...)");
                log.e("NotificationClient", "Error appending notification to cache file", e10);
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    private final String getAccountLabel(Context context, String receivingUserId) {
        String currentUserId = this.cache.getCurrentUserId(context);
        if (receivingUserId == null || currentUserId == null || currentUserId.length() == 0 || Intrinsics.areEqual(receivingUserId, currentUserId)) {
            return null;
        }
        Map<String, String> accountUsernames = this.cache.getAccountUsernames(context);
        if (accountUsernames.size() < 2) {
            return null;
        }
        return accountUsernames.get(receivingUserId);
    }

    private final NotificationBehaviors getBehaviors(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return null;
        }
        return new NotificationBehaviors(isSoundsEnabled(context), isVibrationsEnabled(context), isLightsEnabled(context));
    }

    public static /* synthetic */ void onNotificationReceived$default(NotificationClient notificationClient, Context context, Map map, long j, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            j = 0;
        }
        notificationClient.onNotificationReceived(context, map, j);
    }

    private final void setLocalNotification(Map<String, String> notification) {
        Function1<? super Map<String, String>, Unit> function1 = this.notificationLocalListener;
        if (function1 == null) {
            this.notificationPending = notification;
        } else if (function1 != null) {
            function1.invoke(notification);
        }
    }

    private final void setNotification(Map<String, String> notification) {
        if (notification == null) {
            this.notificationPending = null;
            return;
        }
        Function1<? super Map<String, String>, Unit> function1 = this.notificationListener;
        if (function1 == null) {
            this.notificationPending = notification;
        } else if (function1 != null) {
            function1.invoke(notification);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldDisplayNotification$lambda$0() {
        return true;
    }

    private final void showNotification(Context context, NotificationData notificationData, Map<String, String> notificationDataMap, boolean makeOrUpdateShortcut, boolean preserveAccountLabel) {
        String currentUserId;
        Map<String, String> map;
        NotificationData notificationData2;
        CrashReporting crashReporting = CrashReporting.INSTANCE;
        Pair pair = new Pair("type", notificationData.getType());
        Pair pair2 = new Pair("channelId", String.valueOf(notificationData.m1090getChannelIdqMVnFVQ()));
        String strM1092getMessageIdN_6c4I0 = notificationData.m1092getMessageIdN_6c4I0();
        CrashReporting.addBreadcrumb$default(crashReporting, "Kotlin NotificationClient received Notification.", w0.g(pair, pair2, new Pair("messageId", strM1092getMessageIdN_6c4I0 == null ? "null" : MessageId.m1163toStringimpl(strM1092getMessageIdN_6c4I0))), null, null, false, 28, null);
        if (this.cache.isAuthed(context)) {
            SilentNotificationManager silentNotificationManager = SilentNotificationManager.INSTANCE.get(context);
            if (Intrinsics.areEqual(notificationData.getType(), NotificationData.TYPE_CHANNEL_ACK)) {
                this.renderer.handleAcks(context, notificationData);
                silentNotificationManager.handleAcks(notificationData);
                return;
            }
            if (Intrinsics.areEqual(notificationData.getType(), NotificationData.TYPE_CALL_RING_END)) {
                this.renderer.handleCallRingEnd(context, notificationData.getAckChannelIds());
                return;
            }
            if (Intrinsics.areEqual(notificationData.getType(), NotificationData.TYPE_CALL_ACK)) {
                this.renderer.handleCallAck(context, notificationData.getAckChannelIds());
                return;
            }
            if (((Boolean) this.shouldDisplayNotification.invoke()).booleanValue() || Intrinsics.areEqual(notificationData.getType(), NotificationData.TYPE_CALL_RING)) {
                try {
                    boolean zShouldDisplayNotification = silentNotificationManager.shouldDisplayNotification(notificationData);
                    UserId userIdM1094getReceivingUserIdwUX8bhU = notificationData.m1094getReceivingUserIdwUX8bhU();
                    if (userIdM1094getReceivingUserIdwUX8bhU == null || (currentUserId = UserId.m1215toStringimpl(userIdM1094getReceivingUserIdwUX8bhU.m1217unboximpl())) == null) {
                        currentUserId = this.cache.getCurrentUserId(context);
                    }
                    if (currentUserId != null) {
                        PushNotificationMonitor pushNotificationMonitor = PushNotificationMonitor.INSTANCE;
                        String type = notificationData.getType();
                        boolean z5 = !zShouldDisplayNotification;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        String string = NotificationDataUtilsKt.getTitle(notificationData, context).toString();
                        CharSequence content = NotificationDataUtilsKt.getContent(notificationData, context, true);
                        String string2 = content != null ? content.toString() : null;
                        String strValueOf = String.valueOf(notificationData.m1090getChannelIdqMVnFVQ());
                        String strM1092getMessageIdN_6c4I1 = notificationData.m1092getMessageIdN_6c4I0();
                        pushNotificationMonitor.logPushNotification(context, currentUserId, new PushNotificationMeta(jCurrentTimeMillis, z5, type, string, string2, strValueOf, strM1092getMessageIdN_6c4I1 != null ? MessageId.m1163toStringimpl(strM1092getMessageIdN_6c4I1) : "null"));
                    }
                    if (zShouldDisplayNotification) {
                        this.renderer.initIconUrlUtils(context);
                        this.renderer.initFresco(context);
                        NotificationRenderer notificationRenderer = this.renderer;
                        String currentUsername = this.cache.getCurrentUsername(context);
                        NotificationBehaviors behaviors = getBehaviors(context);
                        boolean zShouldNotifyEveryTime = shouldNotifyEveryTime(context);
                        UserId userIdM1094getReceivingUserIdwUX8bhU2 = notificationData.m1094getReceivingUserIdwUX8bhU();
                        String accountLabel = getAccountLabel(context, userIdM1094getReceivingUserIdwUX8bhU2 != null ? UserId.m1215toStringimpl(userIdM1094getReceivingUserIdwUX8bhU2.m1217unboximpl()) : null);
                        map = notificationDataMap;
                        notificationRenderer.display(context, notificationData, currentUsername, map, behaviors, makeOrUpdateShortcut, zShouldNotifyEveryTime, accountLabel, preserveAccountLabel);
                        notificationData2 = notificationData;
                        silentNotificationManager.onDisplayNotification(notificationData2);
                    } else {
                        map = notificationDataMap;
                        notificationData2 = notificationData;
                        silentNotificationManager.onSilentNotification(notificationData2);
                    }
                    if (Intrinsics.areEqual(notificationData2.getType(), NotificationData.TYPE_MESSAGE_CREATE)) {
                        KvMessageEntry kvMessage = NotificationDataUtilsKt.getKvMessage(notificationData2, map.get("message"));
                        if (kvMessage != null) {
                            String strM1092getMessageIdN_6c4I2 = notificationData2.m1092getMessageIdN_6c4I0();
                            ChannelId channelIdM1090getChannelIdqMVnFVQ = notificationData2.m1090getChannelIdqMVnFVQ();
                            if (strM1092getMessageIdN_6c4I2 != null && channelIdM1090getChannelIdqMVnFVQ != null) {
                                KvMessageCache kvMessageCache = KvMessageCache.INSTANCE;
                                String str = "@account." + ((Object) map.get("receiving_user_id"));
                                GuildId guildIdM1091getGuildIdqOKuAAo = notificationData2.m1091getGuildIdqOKuAAo();
                                String strM1150toStringimpl = guildIdM1091getGuildIdqOKuAAo != null ? GuildId.m1150toStringimpl(guildIdM1091getGuildIdqOKuAAo.m1152unboximpl()) : null;
                                String strM1137toStringimpl = ChannelId.m1137toStringimpl(channelIdM1090getChannelIdqMVnFVQ.m1139unboximpl());
                                String strM1163toStringimpl = MessageId.m1163toStringimpl(strM1092getMessageIdN_6c4I2);
                                b bVar = Json.f14760d;
                                bVar.getClass();
                                kvMessageCache.putMessage(context, str, strM1150toStringimpl, strM1137toStringimpl, strM1163toStringimpl, bVar.c(KvMessageEntry.INSTANCE.serializer(), kvMessage));
                            }
                        }
                        if (updateAndComputeIfShouldRunBackgroundSync(context)) {
                            HeadlessTasks.Companion.startHeadlessTask$default(HeadlessTasks.INSTANCE, context, "BackgroundSync", JankRecordStore.FLUSH_INTERVAL_MS, false, null, true, 24, null);
                        } else {
                            this.channelMessagesFetcher.maybeFetchChannelMessages(context, notificationData2);
                        }
                    }
                } catch (Exception e10) {
                    Log log = Log.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue("NotificationClient", "getSimpleName(...)");
                    log.e("NotificationClient", "Unable to display notification", e10);
                }
            }
        }
    }

    public static /* synthetic */ void showNotification$default(NotificationClient notificationClient, Context context, NotificationData notificationData, Map map, boolean z5, boolean z6, int i7, Object obj) {
        if ((i7 & 16) != 0) {
            z6 = false;
        }
        notificationClient.showNotification(context, notificationData, map, z5, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit tokenListener$lambda$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    private final boolean updateAndComputeIfShouldRunBackgroundSync(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < this.cache.getBackgroundSyncRan(context)) {
            this.cache.setBackgroundSyncRan(context);
            return true;
        }
        if (jCurrentTimeMillis <= this.cache.getBackgroundSyncRan(context) + 3600000) {
            return false;
        }
        this.cache.setBackgroundSyncRan(context);
        return true;
    }

    public final void ackReactionNotifications(@NotNull Context context, @NotNull String channelId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        this.renderer.handleReactionAcks(context, channelId);
    }

    public final void clearAllNotifications(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.renderer.clearAllNotifications(context);
    }

    public final Map<String, String> getPendingNotification() {
        Map<String, String> map = this.notificationPending;
        if (map == null) {
            return null;
        }
        this.notificationPending = null;
        return map;
    }

    @NotNull
    public final Function0<Boolean> getShouldDisplayNotification() {
        return this.shouldDisplayNotification;
    }

    public final void handleIntent(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        NotificationAction.Companion companion = NotificationAction.INSTANCE;
        ContentAction contentAction = (ContentAction) (IntentUtilsKt.hasExtra(intent, Reflection.getOrCreateKotlinClass(ContentAction.class)) ? (NotificationAction) ((Parcelable) y0.d.b(intent, "action_intent_arg_key", ContentAction.class)) : null);
        ShortcutData shortcutIntentData = ShortcutData.INSTANCE.getShortcutIntentData(intent);
        ContentAction contentAction2 = shortcutIntentData != null ? new ContentAction(shortcutIntentData.getTag(), shortcutIntentData.getData()) : null;
        if (contentAction == null) {
            contentAction = contentAction2;
        }
        if (contentAction == null) {
            setNotification(null);
            return;
        }
        if (contentAction.isLocal()) {
            setLocalNotification(contentAction.getData());
        } else {
            setNotification(contentAction.getData());
        }
        contentAction.onNotificationActionComplete(context);
    }

    public final void initNotificationCategories(@NotNull Context context, @NotNull Map<String, String> localizedCategoryNames, @NotNull Map<String, String> localizedGroupNames) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(localizedCategoryNames, "localizedCategoryNames");
        Intrinsics.checkNotNullParameter(localizedGroupNames, "localizedGroupNames");
        this.renderer.initNotificationCategories(context, localizedCategoryNames, localizedGroupNames);
    }

    public final void initNotificationGroupsAndChannels(@NotNull Context context, @NotNull List<ConfiguredNotifGroup> groups, @NotNull List<ConfiguredNotifChannel> channels) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter(channels, "channels");
        this.renderer.initNotificationGroupsAndChannels(context, groups, channels);
    }

    public final void initNotificationTypeMappings(@NotNull Context context, @NotNull List<NotifTypeMapping> mappings) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mappings, "mappings");
        int iA = v0.a(e0.l(mappings, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (NotifTypeMapping notifTypeMapping : mappings) {
            linkedHashMap.put(Integer.valueOf(notifTypeMapping.getType()), notifTypeMapping.getChannel());
        }
        this.cache.setNotifTypeMappings(context, linkedHashMap);
    }

    public final boolean isLightsEnabled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.cache.isLightsEnabled(context);
    }

    public final boolean isSoundsEnabled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.cache.isSoundsEnabled(context);
    }

    public final boolean isVibrationsEnabled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.cache.isVibrationsEnabled(context);
    }

    public final void markNotificationAsDirectReply(@NotNull Context context, long channelId) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.renderer.markNotificationAsDirectReply(context, kk.b.i(channelId, NotificationData.TYPE_MESSAGE_CREATE), "", true);
    }

    public final void onDirectReplySuccess(@NotNull Context context, @NotNull String data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        NotificationData notificationData = DirectReplyMessage.INSTANCE.toNotificationData(data);
        Pair pair = new Pair("type", notificationData.getType());
        Pair pair2 = new Pair("channel_id", String.valueOf(notificationData.m1090getChannelIdqMVnFVQ()));
        String strM1092getMessageIdN_6c4I0 = notificationData.m1092getMessageIdN_6c4I0();
        showNotification(context, notificationData, w0.g(pair, pair2, new Pair("message_id", strM1092getMessageIdN_6c4I0 == null ? "null" : MessageId.m1163toStringimpl(strM1092getMessageIdN_6c4I0))), false, true);
    }

    public final void onNotificationReceived(@NotNull Context context, @NotNull Map<String, String> data, long sentAt) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        sr.a aVar = sr.a.f20556b;
        KSerializer deserializer = NotificationData.INSTANCE.serializer();
        LinkedHashMap map = w0.n(data);
        map.put("time_received", String.valueOf(System.currentTimeMillis()));
        map.put("app_state", ((Boolean) this.shouldDisplayNotification.invoke()).booleanValue() ? AppStateModule.APP_STATE_BACKGROUND : AppStateModule.APP_STATE_ACTIVE);
        if (!map.containsKey("sent_at_ms") && sentAt != 0) {
            map.put("sent_at_ms", String.valueOf(sentAt));
        }
        Unit unit = Unit.f14616a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(map, "map");
        NotificationData notificationData = (NotificationData) new sr.b(aVar, map, deserializer.getDescriptor()).decodeSerializableValue(deserializer);
        appendNotificationToCacheFile(context, notificationData);
        showNotification$default(this, context, notificationData, data, true, false, 16, null);
    }

    public final void setCurrentUser(@NotNull Context context, String username, String userId) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.cache.setCurrentUsername(context, username);
        this.cache.setCurrentUserId(context, userId);
    }

    public final void setIncomingRingtone(@NotNull Context context, @NotNull String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        this.renderer.setIncomingRingtone(context, name);
    }

    public final void setIsAuthed(@NotNull Context context, boolean isAuthed) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.cache.setIsAuthed(context, isAuthed);
    }

    public final void setLightsEnabled(@NotNull Context context, boolean lightsEnabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.cache.setLightsEnabled(context, lightsEnabled);
    }

    public final void setLocalNotificationListener(@NotNull Function1<? super Map<String, String>, Unit> notificationListener) {
        Intrinsics.checkNotNullParameter(notificationListener, "notificationListener");
        this.notificationLocalListener = notificationListener;
    }

    public final void setMultiAccountUsernames(@NotNull Context context, String usernamesJson) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.cache.setAccountUsernames(context, usernamesJson);
    }

    public final void setNotificationListener(@NotNull Function1<? super Map<String, String>, Unit> notificationListener) {
        Intrinsics.checkNotNullParameter(notificationListener, "notificationListener");
        this.notificationListener = notificationListener;
    }

    public final void setNotifyEveryTime(@NotNull Context context, boolean notifyEveryTime) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.cache.setNotifyEveryTime(context, notifyEveryTime);
    }

    public final void setShouldDisplayNotification(@NotNull Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.shouldDisplayNotification = function0;
    }

    public final void setSoundsEnabled(@NotNull Context context, boolean soundsEnabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.cache.setSoundsEnabled(context, soundsEnabled);
    }

    public final void setToken(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        if (Intrinsics.areEqual(this.token, token)) {
            return;
        }
        this.token = token;
        this.tokenListener.invoke(token);
    }

    public final void setTokenListener(@NotNull Function1<? super String, Unit> tokenListener) {
        Intrinsics.checkNotNullParameter(tokenListener, "tokenListener");
        this.tokenListener = tokenListener;
        String str = this.token;
        if (str != null) {
            tokenListener.invoke(str);
        }
    }

    public final void setVibrationsEnabled(@NotNull Context context, boolean vibrationsEnabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.cache.setVibrationsEnabled(context, vibrationsEnabled);
    }

    public final boolean shouldNotifyEveryTime(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.cache.shouldNotifyEveryTime(context);
    }

    public final void showLocalNotification(@NotNull Context context, @NotNull Map<String, ? extends Object> notification) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notification, "notification");
        this.renderer.displayLocal(context, notification);
    }
}
