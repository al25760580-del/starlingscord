package com.discord.jank_stats;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u001e\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discord/jank_stats/SharedPreferencesJankKeyValueStore;", "Lcom/discord/jank_stats/JankKeyValueStore;", "prefs", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/SharedPreferences;)V", "readAll", "", "", "write", "", "entries", "jank_stats_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nJankKeyValueStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JankKeyValueStore.kt\ncom/discord/jank_stats/SharedPreferencesJankKeyValueStore\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,33:1\n45#2,8:34\n*S KotlinDebug\n*F\n+ 1 JankKeyValueStore.kt\ncom/discord/jank_stats/SharedPreferencesJankKeyValueStore\n*L\n26#1:34,8\n*E\n"})
public final class SharedPreferencesJankKeyValueStore implements JankKeyValueStore {

    @NotNull
    private final SharedPreferences prefs;

    public SharedPreferencesJankKeyValueStore(@NotNull SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.prefs = prefs;
    }

    @Override // com.discord.jank_stats.JankKeyValueStore
    @NotNull
    public Map<String, String> readAll() {
        HashMap map = new HashMap();
        Map<String, ?> all = this.prefs.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                map.put(key, value);
            }
        }
        return map;
    }

    @Override // com.discord.jank_stats.JankKeyValueStore
    public void write(@NotNull Map<String, String> entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        SharedPreferences.Editor editorEdit = this.prefs.edit();
        for (Map.Entry<String, String> entry : entries.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value == null) {
                editorEdit.remove(key);
            } else {
                editorEdit.putString(key, value);
            }
        }
        editorEdit.commit();
    }
}
