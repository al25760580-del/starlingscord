package com.discord.wakelock;

import android.app.Activity;
import com.discord.codegen.NativeScreenWakeLockModuleSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/discord/wakelock/ScreenWakeLockModule;", "Lcom/discord/codegen/NativeScreenWakeLockModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "requestLock", "", "key", "", "releaseLock", "wakelock_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScreenWakeLockModule extends NativeScreenWakeLockModuleSpec {

    @NotNull
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenWakeLockModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    @Override // com.discord.codegen.NativeScreenWakeLockModuleSpec
    public void releaseLock(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity != null) {
            ScreenWakeLock.INSTANCE.releaseLock(currentActivity, key);
        }
    }

    @Override // com.discord.codegen.NativeScreenWakeLockModuleSpec
    public void requestLock(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity != null) {
            ScreenWakeLock.INSTANCE.requestLock(currentActivity, key);
        }
    }
}
