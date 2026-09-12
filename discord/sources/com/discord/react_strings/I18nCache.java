package com.discord.react_strings;

import com.discord.react_resource_cache.ReactResourceCache;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/discord/react_strings/I18nCache;", "Lcom/discord/react_resource_cache/ReactResourceCache;", "Lcom/discord/react_strings/I18nMessage;", "<init>", "()V", "cacheKey", "", "getCacheKey", "()Ljava/lang/String;", "react_strings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class I18nCache extends ReactResourceCache<I18nMessage> {

    @NotNull
    public static final I18nCache INSTANCE = new I18nCache();

    @NotNull
    private static final String cacheKey = "i18nCache";

    private I18nCache() {
    }

    @Override // com.discord.react_resource_cache.ReactResourceCache
    @NotNull
    public String getCacheKey() {
        return cacheKey;
    }
}
