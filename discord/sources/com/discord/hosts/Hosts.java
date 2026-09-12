package com.discord.hosts;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b8F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b8F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/discord/hosts/Hosts;", "", "<init>", "()V", "prefs", "Landroid/content/SharedPreferences;", "init", "", "context", "Landroid/content/Context;", "api", "", "cdn", "requireHost", "key", "setHost", "value", "API", "getAPI", "()Ljava/lang/String;", "setAPI", "(Ljava/lang/String;)V", "CDN", "getCDN", "setCDN", "hosts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHosts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Hosts.kt\ncom/discord/hosts/Hosts\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,36:1\n40#2,13:37\n*S KotlinDebug\n*F\n+ 1 Hosts.kt\ncom/discord/hosts/Hosts\n*L\n26#1:37,13\n*E\n"})
public final class Hosts {

    @NotNull
    public static final Hosts INSTANCE = new Hosts();
    private static SharedPreferences prefs;

    private Hosts() {
    }

    public static /* synthetic */ void init$default(Hosts hosts, Context context, String str, String str2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str = null;
        }
        if ((i7 & 4) != 0) {
            str2 = null;
        }
        hosts.init(context, str, str2);
    }

    private final String requireHost(String key) {
        SharedPreferences sharedPreferences = prefs;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        String string = sharedPreferences.getString(key, null);
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException(g.e("No value for '", key, "'"));
    }

    private final void setAPI(String str) {
        setHost("host_api", str);
    }

    private final void setCDN(String str) {
        setHost("host_cdn", str);
    }

    private final void setHost(String key, String value) {
        SharedPreferences sharedPreferences = prefs;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(key, value);
        editorEdit.apply();
    }

    @NotNull
    public final String getAPI() {
        return requireHost("host_api");
    }

    @NotNull
    public final String getCDN() {
        return requireHost("host_cdn");
    }

    public final void init(@NotNull Context context, String api, String cdn) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (prefs == null) {
            prefs = context.getSharedPreferences("discord_hosts", 0);
        }
        if (api != null) {
            setAPI(api);
        }
        if (cdn != null) {
            setCDN(cdn);
        }
    }
}
