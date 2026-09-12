package com.discord.notifications.renderer;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\u001a\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0000\u001a(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0000\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"CHANNEL_ID_PREFIX_ALLOWLIST", "", "", "hasChannelIdInAllowlist", "", "channelId", "resolveChannelCleanupAction", "Lcom/discord/notifications/renderer/ChannelCleanupAction;", "parentChannelId", "knownChannelIds", "", "notification_renderer_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNotificationChannelCleanup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationChannelCleanup.kt\ncom/discord/notifications/renderer/NotificationChannelCleanupKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n1761#2,3:77\n*S KotlinDebug\n*F\n+ 1 NotificationChannelCleanup.kt\ncom/discord/notifications/renderer/NotificationChannelCleanupKt\n*L\n14#1:77,3\n*E\n"})
public final class NotificationChannelCleanupKt {

    @NotNull
    private static final List<String> CHANNEL_ID_PREFIX_ALLOWLIST = d0.g("playcore-", "com.google", "fcm_");

    public static final boolean hasChannelIdInAllowlist(@NotNull String channelId) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        List<String> list = CHANNEL_ID_PREFIX_ALLOWLIST;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (x.o(channelId, (String) it.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    @NotNull
    public static final ChannelCleanupAction resolveChannelCleanupAction(@NotNull String channelId, String str, @NotNull Set<String> knownChannelIds) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(knownChannelIds, "knownChannelIds");
        if (hasChannelIdInAllowlist(channelId)) {
            return ChannelCleanupAction.KEEP_ALLOWLISTED;
        }
        if (knownChannelIds.contains(channelId)) {
            return ChannelCleanupAction.KEEP_CONFIGURED;
        }
        return (str == null || !(knownChannelIds.contains(str) || hasChannelIdInAllowlist(str))) ? ChannelCleanupAction.DELETE : ChannelCleanupAction.KEEP_PRESERVED_CONVERSATION;
    }
}
