package com.discord.notifications.client;

import android.content.Context;
import android.content.SharedPreferences;
import com.discord.emoji.a;
import com.discord.logging.Log;
import com.discord.notifications.renderer.NotificationRenderer;
import com.discord.primitives.ChannelId;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.x;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import ls.d;
import or.h0;
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.q;
import rn.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u0000 72\u00020\u0001:\u00017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0006J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\u0006J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\u0006J\u0016\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\rJ\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0006J\u0016\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\rJ\u000e\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0006J\u0016\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\rJ\u000e\u0010\u001d\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0006J\u0016\u0010\u001e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\rJ\u000e\u0010 \u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010!\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010#\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006J\u001d\u0010$\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u0005H\u0002J\u001c\u00101\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0010\u0018\u00010/2\u0006\u0010\u000b\u001a\u00020\u0006J\"\u00102\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00100/J\u0018\u00104\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\b\u00105\u001a\u0004\u0018\u00010\u0010J\u001a\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100/2\u0006\u0010\u000b\u001a\u00020\u0006R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u0018\u0010\u0004\u001a\u00020\u0005*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010.\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0010\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/discord/notifications/client/NotificationCache;", "", "<init>", "()V", "cache", "Landroid/content/SharedPreferences;", "Landroid/content/Context;", "getCache", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "setIsAuthed", "", "context", "isAuthed", "", "setCurrentUsername", NotificationRenderer.USERNAME, "", "setCurrentUserId", "userId", "getCurrentUsername", "getCurrentUserId", "setSoundsEnabled", "soundsEnabled", "isSoundsEnabled", "setVibrationsEnabled", "vibrationsEnabled", "isVibrationsEnabled", "setLightsEnabled", "lightsEnabled", "isLightsEnabled", "setNotifyEveryTime", "notifyEveryTime", "shouldNotifyEveryTime", "getBackgroundSyncRan", "", "setBackgroundSyncRan", "getChannelMessagesFetchRan", "channelId", "Lcom/discord/primitives/ChannelId;", "getChannelMessagesFetchRan-mJqaSGE", "(Landroid/content/Context;J)J", "setChannelMessagesFetchRan", "setChannelMessagesFetchRan-mJqaSGE", "(Landroid/content/Context;J)V", "evictOldChannelEntries", "prefs", "loadedNotifTypeMappings", "", "", "getNotifTypeMappings", "setNotifTypeMappings", "mappings", "setAccountUsernames", "usernamesJson", "getAccountUsernames", "Companion", "notification_client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNotificationCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCache.kt\ncom/discord/notifications/client/NotificationCache\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Json.kt\nkotlinx/serialization/json/Json\n+ 5 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n40#2,13:165\n40#2,13:178\n40#2,13:191\n40#2,13:204\n40#2,13:217\n40#2,13:230\n40#2,13:243\n40#2,13:256\n40#2,13:269\n40#2,13:286\n40#2,7:300\n47#2,6:308\n40#2,13:314\n774#3:282\n865#3,2:283\n1068#3:285\n147#4:299\n147#4:328\n113#5:307\n1#6:327\n*S KotlinDebug\n*F\n+ 1 NotificationCache.kt\ncom/discord/notifications/client/NotificationCache\n*L\n24#1:165,13\n31#1:178,13\n35#1:191,13\n45#1:204,13\n51#1:217,13\n60#1:230,13\n69#1:243,13\n76#1:256,13\n89#1:269,13\n106#1:286,13\n127#1:300,7\n127#1:308,6\n133#1:314,13\n98#1:282\n98#1:283,2\n103#1:285\n120#1:299\n140#1:328\n128#1:307\n*E\n"})
public final class NotificationCache {

    @NotNull
    private static final String CACHE_KEY = "DiscordNotificationClient";

    @NotNull
    private static final String CACHE_KEY_ACCOUNT_USERNAMES = "CACHE_KEY_ACCOUNT_USERNAMES";

    @NotNull
    private static final String CACHE_KEY_AUTHED = "CACHE_KEY_AUTHED";

    @NotNull
    private static final String CACHE_KEY_CHANNEL_MESSAGES_FETCH_RAN_PREFIX = "CACHE_KEY_CHANNEL_MESSAGES_FETCH_RAN_";

    @NotNull
    private static final String CACHE_KEY_CURRENT_USERNAME = "CACHE_KEY_CURRENT_USERNAME";

    @NotNull
    private static final String CACHE_KEY_CURRENT_USER_ID = "CACHE_KEY_CURRENT_USER_ID";

    @NotNull
    private static final String CACHE_KEY_LAST_BACKGROUND_SYNC_RAN = "CACHE_KEY_LAST_BACKGROUND_SYNC_RAN";

    @NotNull
    private static final String CACHE_KEY_LIGHTS_ENABLED = "CACHE_KEY_LIGHTS_ENABLED";

    @NotNull
    private static final String CACHE_KEY_NOTIFY_EVERY_TIME = "CACHE_KEY_NOTIFY_EVERY_TIME";

    @NotNull
    private static final String CACHE_KEY_NOTIF_TYPE_MAPPINGS = "CACHE_KEY_NOTIF_TYPE_MAPPINGS";

    @NotNull
    private static final String CACHE_KEY_SOUNDS_ENABLED = "CACHE_KEY_SOUNDS_ENABLED";

    @NotNull
    private static final String CACHE_KEY_VIBRATIONS_ENABLED = "CACHE_KEY_VIBRATIONS_ENABLED";
    private static final int MAX_CHANNEL_FETCH_ENTRIES = 50;
    private SharedPreferences cache;
    private Map<Integer, String> loadedNotifTypeMappings;

    @NotNull
    private static final Json json = d.e(new a(18));

    private final void evictOldChannelEntries(SharedPreferences prefs) {
        Set<Map.Entry<String, ?>> setEntrySet = prefs.getAll().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            Object key = ((Map.Entry) obj).getKey();
            Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
            if (x.o((String) key, CACHE_KEY_CHANNEL_MESSAGES_FETCH_RAN_PREFIX, false)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() <= 50) {
            return;
        }
        List listF = CollectionsKt.F(50, CollectionsKt.e0(arrayList, new Comparator() { // from class: com.discord.notifications.client.NotificationCache$evictOldChannelEntries$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t5, T t10) {
                Object value = ((Map.Entry) t10).getValue();
                Long l6 = value instanceof Long ? (Long) value : null;
                Long lValueOf = Long.valueOf(l6 != null ? l6.longValue() : 0L);
                Object value2 = ((Map.Entry) t5).getValue();
                Long l7 = value2 instanceof Long ? (Long) value2 : null;
                return tn.a.a(lValueOf, Long.valueOf(l7 != null ? l7.longValue() : 0L));
            }
        }));
        SharedPreferences.Editor editorEdit = prefs.edit();
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) ((Map.Entry) it.next()).getKey());
        }
        editorEdit.apply();
    }

    private final SharedPreferences getCache(Context context) {
        if (this.cache == null) {
            this.cache = context.getSharedPreferences(CACHE_KEY, 0);
        }
        SharedPreferences sharedPreferences = this.cache;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cache");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$19(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.f14765b = true;
        return Unit.f14616a;
    }

    @NotNull
    public final Map<String, String> getAccountUsernames(@NotNull Context context) {
        Object objO;
        Intrinsics.checkNotNullParameter(context, "context");
        String string = getCache(context).getString(CACHE_KEY_ACCOUNT_USERNAMES, null);
        if (string != null) {
            try {
                q qVar = Result.f14614e;
                Json json2 = json;
                json2.getClass();
                s1 s1Var = s1.f17602a;
                objO = (Map) json2.b(new h0(s1Var, s1Var, 1), string);
            } catch (Throwable th2) {
                q qVar2 = Result.f14614e;
                objO = ib.a.o(th2);
            }
            Throwable thA = Result.a(objO);
            if (thA != null) {
                Log log = Log.INSTANCE;
                Intrinsics.checkNotNullExpressionValue("NotificationCache", "getSimpleName(...)");
                log.e("NotificationCache", "Failed to deserialize account usernames", thA);
            }
            Map<String, String> map = (Map) (objO instanceof r ? null : objO);
            if (map != null) {
                return map;
            }
        }
        return w0.d();
    }

    public final long getBackgroundSyncRan(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getCache(context).getLong(CACHE_KEY_LAST_BACKGROUND_SYNC_RAN, 0L);
    }

    /* JADX INFO: renamed from: getChannelMessagesFetchRan-mJqaSGE, reason: not valid java name */
    public final long m1104getChannelMessagesFetchRanmJqaSGE(@NotNull Context context, long channelId) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getCache(context).getLong(CACHE_KEY_CHANNEL_MESSAGES_FETCH_RAN_PREFIX + ChannelId.m1137toStringimpl(channelId), 0L);
    }

    public final String getCurrentUserId(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getCache(context).getString(CACHE_KEY_CURRENT_USER_ID, null);
    }

    public final String getCurrentUsername(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getCache(context).getString(CACHE_KEY_CURRENT_USERNAME, null);
    }

    public final Map<Integer, String> getNotifTypeMappings(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Map<Integer, String> map = this.loadedNotifTypeMappings;
        if (map != null) {
            return map;
        }
        Map<Integer, String> map2 = null;
        String string = getCache(context).getString(CACHE_KEY_NOTIF_TYPE_MAPPINGS, null);
        if (string != null) {
            Json json2 = json;
            json2.getClass();
            map2 = (Map) json2.b(new h0(m0.f17573a, s1.f17602a, 1), string);
        }
        this.loadedNotifTypeMappings = map2;
        return map2;
    }

    public final boolean isAuthed(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getCache(context).getBoolean(CACHE_KEY_AUTHED, false);
    }

    public final boolean isLightsEnabled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getCache(context).getBoolean(CACHE_KEY_LIGHTS_ENABLED, true);
    }

    public final boolean isSoundsEnabled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getCache(context).getBoolean(CACHE_KEY_SOUNDS_ENABLED, true);
    }

    public final boolean isVibrationsEnabled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getCache(context).getBoolean(CACHE_KEY_VIBRATIONS_ENABLED, true);
    }

    public final void setAccountUsernames(@NotNull Context context, String usernamesJson) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editorEdit = getCache(context).edit();
        editorEdit.putString(CACHE_KEY_ACCOUNT_USERNAMES, usernamesJson);
        editorEdit.apply();
    }

    public final void setBackgroundSyncRan(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editorEdit = getCache(context).edit();
        editorEdit.putLong(CACHE_KEY_LAST_BACKGROUND_SYNC_RAN, System.currentTimeMillis());
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: setChannelMessagesFetchRan-mJqaSGE, reason: not valid java name */
    public final void m1105setChannelMessagesFetchRanmJqaSGE(@NotNull Context context, long channelId) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences cache = getCache(context);
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = cache.edit();
        editorEdit.putLong(CACHE_KEY_CHANNEL_MESSAGES_FETCH_RAN_PREFIX + ChannelId.m1137toStringimpl(channelId), jCurrentTimeMillis);
        editorEdit.apply();
        evictOldChannelEntries(cache);
    }

    public final void setCurrentUserId(@NotNull Context context, String userId) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editorEdit = getCache(context).edit();
        editorEdit.putString(CACHE_KEY_CURRENT_USER_ID, userId);
        editorEdit.apply();
    }

    public final void setCurrentUsername(@NotNull Context context, String username) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editorEdit = getCache(context).edit();
        editorEdit.putString(CACHE_KEY_CURRENT_USERNAME, username);
        editorEdit.apply();
    }

    public final void setIsAuthed(@NotNull Context context, boolean isAuthed) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editorEdit = getCache(context).edit();
        editorEdit.putBoolean(CACHE_KEY_AUTHED, isAuthed);
        editorEdit.apply();
    }

    public final void setLightsEnabled(@NotNull Context context, boolean lightsEnabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editorEdit = getCache(context).edit();
        editorEdit.putBoolean(CACHE_KEY_LIGHTS_ENABLED, lightsEnabled);
        editorEdit.apply();
    }

    public final void setNotifTypeMappings(@NotNull Context context, @NotNull Map<Integer, String> mappings) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mappings, "mappings");
        this.loadedNotifTypeMappings = mappings;
        SharedPreferences.Editor editorEdit = getCache(context).edit();
        Json json2 = json;
        json2.getClass();
        editorEdit.putString(CACHE_KEY_NOTIF_TYPE_MAPPINGS, json2.c(new h0(m0.f17573a, s1.f17602a, 1), mappings));
        editorEdit.apply();
    }

    public final void setNotifyEveryTime(@NotNull Context context, boolean notifyEveryTime) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editorEdit = getCache(context).edit();
        editorEdit.putBoolean(CACHE_KEY_NOTIFY_EVERY_TIME, notifyEveryTime);
        editorEdit.apply();
    }

    public final void setSoundsEnabled(@NotNull Context context, boolean soundsEnabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editorEdit = getCache(context).edit();
        editorEdit.putBoolean(CACHE_KEY_SOUNDS_ENABLED, soundsEnabled);
        editorEdit.apply();
    }

    public final void setVibrationsEnabled(@NotNull Context context, boolean vibrationsEnabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editorEdit = getCache(context).edit();
        editorEdit.putBoolean(CACHE_KEY_VIBRATIONS_ENABLED, vibrationsEnabled);
        editorEdit.apply();
    }

    public final boolean shouldNotifyEveryTime(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getCache(context).getBoolean(CACHE_KEY_NOTIFY_EVERY_TIME, false);
    }
}
