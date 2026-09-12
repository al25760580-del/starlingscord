package com.discord.react_resource_cache;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.Enum;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b&\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0015J'\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00028\u00002\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0019R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00020\u000b*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/discord/react_resource_cache/ReactResourceCache;", "T", "", "", "<init>", "()V", "cacheKey", "", "getCacheKey", "()Ljava/lang/String;", "cache", "Landroid/content/SharedPreferences;", "Landroid/content/Context;", "getCache", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "reactResources", "", "set", "", "context", "newReactResources", "", "get", "reactResource", "migrationKey", "(Landroid/content/Context;Ljava/lang/Enum;Ljava/lang/String;)Ljava/lang/String;", "react_resource_cache_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactResourceCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactResourceCache.kt\ncom/discord/react_resource_cache/ReactResourceCache\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n40#2,7:37\n47#2,6:46\n216#3,2:44\n1#4:52\n*S KotlinDebug\n*F\n+ 1 ReactResourceCache.kt\ncom/discord/react_resource_cache/ReactResourceCache\n*L\n20#1:37,7\n20#1:46,6\n23#1:44,2\n*E\n"})
public abstract class ReactResourceCache<T extends Enum<?>> {

    @NotNull
    private Map<String, String> reactResources = new LinkedHashMap();

    public static /* synthetic */ String get$default(ReactResourceCache reactResourceCache, Context context, Enum r5, String str, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
        }
        if ((i7 & 4) != 0) {
            str = null;
        }
        return reactResourceCache.get(context, r5, str);
    }

    private final SharedPreferences getCache(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(getCacheKey(), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    @NotNull
    public final String get(@NotNull Context context, @NotNull T reactResource, String migrationKey) throws IllegalAccessException {
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactResource, "reactResource");
        String string2 = this.reactResources.get(reactResource.name());
        if (string2 == null) {
            String str = null;
            string2 = getCache(context).getString(reactResource.name(), null);
            if (string2 != null) {
                this.reactResources.put(reactResource.name(), string2);
            } else {
                string2 = null;
            }
            if (string2 == null) {
                if (migrationKey != null && (string = getCache(context).getString(migrationKey, null)) != null) {
                    this.reactResources.put(reactResource.name(), string);
                    str = string;
                }
                if (str != null) {
                    return str;
                }
                throw new IllegalAccessException(g.e("Unable to access ", reactResource.name(), " as it has not yet been provided."));
            }
        }
        return string2;
    }

    @NotNull
    public abstract String getCacheKey();

    public final void set(@NotNull Context context, @NotNull Map<String, String> newReactResources) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(newReactResources, "newReactResources");
        SharedPreferences.Editor editorEdit = getCache(context).edit();
        editorEdit.clear();
        for (Map.Entry<String, String> entry : newReactResources.entrySet()) {
            editorEdit.putString(entry.getKey(), entry.getValue());
        }
        this.reactResources = new HashMap(newReactResources);
        editorEdit.apply();
    }
}
