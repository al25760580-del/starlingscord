package com.discord.notifications.api;

import com.discord.primitives.ApplicationId;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.MessageId;
import com.discord.primitives.UserId;
import com.discord.snowflake.SnowflakeUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¨\u0006\u0007"}, d2 = {"localNotificationData", "Lcom/discord/notifications/api/NotificationData;", "Lcom/discord/notifications/api/NotificationData$Companion;", "notification", "", "", "", "notification_api_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNotificationDataDeserializationUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationDataDeserializationUtils.kt\ncom/discord/notifications/api/NotificationDataDeserializationUtilsKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,36:1\n538#2:37\n523#2,6:38\n126#3:44\n153#3,3:45\n*S KotlinDebug\n*F\n+ 1 NotificationDataDeserializationUtils.kt\ncom/discord/notifications/api/NotificationDataDeserializationUtilsKt\n*L\n9#1:37\n9#1:38,6\n10#1:44\n10#1:45,3\n*E\n"})
public final class NotificationDataDeserializationUtilsKt {
    /* JADX WARN: Code duplicated, block: B:22:0x0096  */
    @NotNull
    public static final NotificationData localNotificationData(@NotNull NotificationData.Companion companion, @NotNull Map<String, ? extends Object> notification) {
        Map mapD;
        Long snowflake;
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(notification, "notification");
        Object obj = notification.get("userInfo");
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if ((key instanceof String) && (value instanceof String)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Object key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                Intrinsics.checkNotNull(key2, "null cannot be cast to non-null type kotlin.String");
                Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlin.String");
                arrayList.add(new Pair((String) key2, (String) value2));
            }
            mapD = w0.l(arrayList);
            if (mapD == null) {
                mapD = w0.d();
            }
        } else {
            mapD = w0.d();
        }
        String str = (String) mapD.get("channel_id");
        ChannelId channelIdM1130boximpl = (str == null || (snowflake = SnowflakeUtils.INSTANCE.toSnowflake(str)) == null) ? null : ChannelId.m1130boximpl(ChannelId.m1131constructorimpl(snowflake.longValue()));
        String str2 = (String) mapD.get("message_id");
        String strM1157constructorimpl = str2 != null ? MessageId.m1157constructorimpl(str2) : null;
        Object obj2 = notification.get("alertTitle");
        String str3 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = notification.get("alertBody");
        String str4 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = notification.get("silent");
        Boolean bool = obj4 instanceof Boolean ? (Boolean) obj4 : null;
        return new NotificationData(NotificationData.TYPE_LOCAL_NOTIFICATION, strM1157constructorimpl, (Integer) null, (String) null, (Integer) null, (String) null, (Long) null, (Integer) null, (String) null, channelIdM1130boximpl, (String) null, (String) null, (ChannelId) null, (Integer) null, (String) null, (List) null, (UserId) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (Integer) null, (GuildId) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (ApplicationId) null, (String) null, (String) null, (NotificationMessage) null, (String) null, false, false, (UserId) null, str3, str4, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (Integer) null, (Integer) null, (Integer) null, (String) null, bool != null ? bool.booleanValue() : false, mapD, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, 0L, false, -516, -1573057, 1, (DefaultConstructorMarker) null);
    }
}
