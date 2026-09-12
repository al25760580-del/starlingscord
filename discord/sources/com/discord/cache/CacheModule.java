package com.discord.cache;

import com.discord.codegen.NativeCacheModuleSpec;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016¨\u0006\u0013"}, d2 = {"Lcom/discord/cache/CacheModule;", "Lcom/discord/codegen/NativeCacheModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "refresh", "", "exclude", "Lcom/facebook/react/bridge/ReadableArray;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getItem", "key", "", "setItem", "value", "removeItem", "clear", "cache_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CacheModule extends NativeCacheModuleSpec {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // com.discord.codegen.NativeCacheModuleSpec
    public void clear() {
        Cache.INSTANCE.get().clear();
    }

    @Override // com.discord.codegen.NativeCacheModuleSpec
    public void getItem(@NotNull String key, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            promise.resolve(Cache.INSTANCE.get().getItem(key));
        } catch (Throwable th2) {
            promise.reject(th2);
        }
    }

    @Override // com.discord.codegen.NativeCacheModuleSpec
    public void refresh(@NotNull ReadableArray exclude, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(exclude, "exclude");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            promise.resolve(Cache.INSTANCE.get().refresh(exclude));
        } catch (Throwable th2) {
            promise.reject(th2);
        }
    }

    @Override // com.discord.codegen.NativeCacheModuleSpec
    public void removeItem(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Cache.INSTANCE.get().removeItem(key);
    }

    @Override // com.discord.codegen.NativeCacheModuleSpec
    public void setItem(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Cache.INSTANCE.get().setItem(key, value);
    }
}
