package com.discord.tti_manager;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\b\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/discord/tti_manager/TTISharedPreferences;", "", "<init>", "()V", "PREFS_NAME", "", "KEY_DURATION", "appContext", "Landroid/content/Context;", "init", "", "context", "prefs", "Landroid/content/SharedPreferences;", "setYieldDurationMs", "durationMs", "", "getYieldDurationMs", "tti_manager_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTTISharedPreferences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TTISharedPreferences.kt\ncom/discord/tti_manager/TTISharedPreferences\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,27:1\n40#2,13:28\n*S KotlinDebug\n*F\n+ 1 TTISharedPreferences.kt\ncom/discord/tti_manager/TTISharedPreferences\n*L\n21#1:28,13\n*E\n"})
public final class TTISharedPreferences {

    @NotNull
    public static final TTISharedPreferences INSTANCE = new TTISharedPreferences();

    @NotNull
    private static final String KEY_DURATION = "d";

    @NotNull
    private static final String PREFS_NAME = "com.discord.tti_manager.yc";
    private static Context appContext;

    private TTISharedPreferences() {
    }

    private final SharedPreferences prefs() {
        Context context = appContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
            context = null;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    public final long getYieldDurationMs() {
        return prefs().getLong(KEY_DURATION, 0L);
    }

    public final void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        appContext = context.getApplicationContext();
    }

    public final void setYieldDurationMs(long durationMs) {
        SharedPreferences.Editor editorEdit = prefs().edit();
        editorEdit.putLong(KEY_DURATION, durationMs);
        editorEdit.apply();
    }
}
