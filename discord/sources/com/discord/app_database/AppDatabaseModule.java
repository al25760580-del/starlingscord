package com.discord.app_database;

import a3.e;
import com.discord.cache.Cache;
import com.discord.codegen.NativeAppDatabaseModuleSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0014J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\f"}, d2 = {"Lcom/discord/app_database/AppDatabaseModule;", "Lcom/discord/codegen/NativeAppDatabaseModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getTypedExportedConstants", "", "", "setUserId", "", "userId", "app_database_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppDatabaseModule extends NativeAppDatabaseModuleSpec {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppDatabaseModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // com.discord.codegen.NativeAppDatabaseModuleSpec
    @NotNull
    public Map<String, String> getTypedExportedConstants() {
        return e.v("userId", Cache.INSTANCE.get().getItem(AppDatabase.LAST_DATABASE_USER_ID_PREFERENCES_KEY));
    }

    @Override // com.discord.codegen.NativeAppDatabaseModuleSpec
    public void setUserId(String userId) {
        if (userId != null) {
            Cache.INSTANCE.get().setItem(AppDatabase.LAST_DATABASE_USER_ID_PREFERENCES_KEY, userId);
        } else {
            Cache.INSTANCE.get().removeItem(AppDatabase.LAST_DATABASE_USER_ID_PREFERENCES_KEY);
        }
    }
}
