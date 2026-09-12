package com.discord.notifications.client;

import android.content.Context;
import com.discord.kvstorage.discordapp.DiscordMobileApi;
import com.discord.logging.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/discord/notifications/client/KvMessageCache;", "", "<init>", "()V", "LOG_TAG", "", "putMessage", "", "context", "Landroid/content/Context;", "database", "guildId", "channelId", "messageId", "json", "notification_client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KvMessageCache {

    @NotNull
    public static final KvMessageCache INSTANCE = new KvMessageCache();

    @NotNull
    private static final String LOG_TAG = "KvMessageCache";

    private KvMessageCache() {
    }

    public final void putMessage(@NotNull Context context, @NotNull String database, String guildId, @NotNull String channelId, @NotNull String messageId, @NotNull String json) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            DiscordMobileApi.initialize(context.getFilesDir().getAbsolutePath());
            DiscordMobileApi.putMessage(database, guildId, channelId, messageId, json);
        } catch (LinkageError e10) {
            Log.INSTANCE.e(LOG_TAG, "Unable to write message to kv-storage", e10);
        }
    }
}
