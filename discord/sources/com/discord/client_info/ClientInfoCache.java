package com.discord.client_info;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/discord/client_info/ClientInfoCache;", "", "<init>", "()V", "DEVICE_VENDOR_ID_KEY", "", "cache", "Landroid/content/SharedPreferences;", "Landroid/content/Context;", "getCache", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "getDeviceVendorId", "context", "client_info_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nClientInfoCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClientInfoCache.kt\ncom/discord/client_info/ClientInfoCache\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,35:1\n40#2,13:36\n*S KotlinDebug\n*F\n+ 1 ClientInfoCache.kt\ncom/discord/client_info/ClientInfoCache\n*L\n26#1:36,13\n*E\n"})
public final class ClientInfoCache {

    @NotNull
    private static final String DEVICE_VENDOR_ID_KEY = "DeviceVendorID";

    @NotNull
    public static final ClientInfoCache INSTANCE = new ClientInfoCache();

    private ClientInfoCache() {
    }

    private final SharedPreferences getCache(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("ClientInfoCache", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    @NotNull
    public final String getDeviceVendorId(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = getCache(context).getString(DEVICE_VENDOR_ID_KEY, null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        SharedPreferences.Editor editorEdit = INSTANCE.getCache(context).edit();
        editorEdit.putString(DEVICE_VENDOR_ID_KEY, string2);
        editorEdit.apply();
        return string2;
    }
}
