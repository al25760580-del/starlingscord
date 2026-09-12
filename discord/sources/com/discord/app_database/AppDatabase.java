package com.discord.app_database;

import a3.e;
import android.content.Context;
import com.discord.chat.presentation.message.view.voicemessages.f;
import com.discord.kvstorage.discordapp.DiscordMobileApi;
import com.discord.logging.Log;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import or.m1;
import org.jetbrains.annotations.NotNull;
import pr.b;
import w3.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\u001a\u0010\u0010\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/discord/app_database/AppDatabase;", "", "<init>", "()V", "LAST_DATABASE_USER_ID_PREFERENCES_KEY", "", "LAST_DATABASE_USER_ID_PREFERENCES_STORE", "LOG_TAG", "dataDirectory", "initializeAppDatabase", "", "context", "Landroid/content/Context;", "initializeAppDatabaseAsync", "databaseName", "userId", "getGuildVersions", "Lcom/discord/app_database/DatabaseVersions;", "requiredCacheVersion", "app_database_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppDatabase.kt\ncom/discord/app_database/AppDatabase\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,91:1\n147#2:92\n147#2:93\n147#2:94\n12637#3,2:95\n*S KotlinDebug\n*F\n+ 1 AppDatabase.kt\ncom/discord/app_database/AppDatabase\n*L\n69#1:92\n70#1:93\n71#1:94\n78#1:95,2\n*E\n"})
public final class AppDatabase {

    @NotNull
    public static final AppDatabase INSTANCE = new AppDatabase();

    @NotNull
    public static final String LAST_DATABASE_USER_ID_PREFERENCES_KEY = "_databaseUserId";

    @NotNull
    private static final String LAST_DATABASE_USER_ID_PREFERENCES_STORE = "FastCacheStore";

    @NotNull
    private static final String LOG_TAG = "AppDatabase";
    private static String dataDirectory;

    private AppDatabase() {
    }

    private final String databaseName(String userId) {
        return e.l("@account.", userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeAppDatabase$lambda$0(Context context) {
        INSTANCE.initializeAppDatabaseAsync(context);
        return Unit.f14616a;
    }

    private final void initializeAppDatabaseAsync(Context context) {
        DiscordMobileApi.initialize(dataDirectory);
        String string = context.getSharedPreferences(LAST_DATABASE_USER_ID_PREFERENCES_STORE, 0).getString(LAST_DATABASE_USER_ID_PREFERENCES_KEY, null);
        if (string == null || Intrinsics.areEqual(string, "")) {
            Log.i$default(Log.INSTANCE, LOG_TAG, "speculative database open skipped: userId was empty.", (Throwable) null, 4, (Object) null);
            return;
        }
        String strDatabaseName = databaseName(string);
        DiscordMobileApi.openAsync(strDatabaseName);
        Log.i$default(Log.INSTANCE, LOG_TAG, e.l("speculatively opening ", strDatabaseName), (Throwable) null, 4, (Object) null);
    }

    @NotNull
    public final DatabaseVersions getGuildVersions(String userId, String requiredCacheVersion) {
        if (userId == null) {
            Log.e$default(Log.INSTANCE, LOG_TAG, "couldn't load guild versions: userId is null", (Throwable) null, 4, (Object) null);
            return DatabaseVersions.INSTANCE.getEMPTY();
        }
        String str = dataDirectory;
        if (str == null) {
            Log.e$default(Log.INSTANCE, LOG_TAG, "couldn't load guild versions: data directory is unavailable", (Throwable) null, 4, (Object) null);
            return DatabaseVersions.INSTANCE.getEMPTY();
        }
        if (requiredCacheVersion == null) {
            Log.e$default(Log.INSTANCE, LOG_TAG, "couldn't load guild versions: requiredCacheVersion was null", (Throwable) null, 4, (Object) null);
            return DatabaseVersions.INSTANCE.getEMPTY();
        }
        DiscordMobileApi.initialize(str);
        try {
            String strDatabaseName = databaseName(userId);
            String guildVersions = DiscordMobileApi.getGuildVersions(strDatabaseName, "guild_versions");
            String guildVersions2 = DiscordMobileApi.getGuildVersions(strDatabaseName, "non_guild_versions");
            String guildVersions3 = DiscordMobileApi.getGuildVersions(strDatabaseName, "force_resync_version");
            b bVar = Json.f14760d;
            Intrinsics.checkNotNull(guildVersions);
            bVar.getClass();
            GuildVersion[] guildVersionArr = (GuildVersion[]) bVar.b(new m1(Reflection.getOrCreateKotlinClass(GuildVersion.class), GuildVersion.INSTANCE.serializer()), guildVersions);
            Intrinsics.checkNotNull(guildVersions2);
            bVar.getClass();
            NonGuildVersion[] nonGuildVersionArr = (NonGuildVersion[]) bVar.b(new m1(Reflection.getOrCreateKotlinClass(NonGuildVersion.class), NonGuildVersion.INSTANCE.serializer()), guildVersions2);
            Intrinsics.checkNotNull(guildVersions3);
            bVar.getClass();
            for (CacheVersion cacheVersion : (CacheVersion[]) bVar.b(new m1(Reflection.getOrCreateKotlinClass(CacheVersion.class), CacheVersion.INSTANCE.serializer()), guildVersions3)) {
                if (Intrinsics.areEqual(cacheVersion.getVersion(), requiredCacheVersion)) {
                    return new DatabaseVersions(guildVersionArr, nonGuildVersionArr);
                }
            }
            Log.e$default(Log.INSTANCE, LOG_TAG, "cache version mismatch, skipping guild versions", (Throwable) null, 4, (Object) null);
            return DatabaseVersions.INSTANCE.getEMPTY();
        } catch (Exception e10) {
            Log.e$default(Log.INSTANCE, LOG_TAG, e.l("couldn't load guild versions: ", e10.getMessage()), (Throwable) null, 4, (Object) null);
            return DatabaseVersions.INSTANCE.getEMPTY();
        }
    }

    public final void initializeAppDatabase(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        dataDirectory = context.getFilesDir().getAbsolutePath();
        q.B("AppDatabaseLoader", 0, new f(context, 3), 23);
    }
}
