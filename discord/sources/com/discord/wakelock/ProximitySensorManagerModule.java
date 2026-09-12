package com.discord.wakelock;

import com.discord.codegen.NativeProximitySensorManagerModuleSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discord/wakelock/ProximitySensorManagerModule;", "Lcom/discord/codegen/NativeProximitySensorManagerModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "proximityWakeLock", "Lcom/discord/wakelock/ProximitySensorWakeLock;", "setProximityMonitoringEnabled", "", ViewProps.ENABLED, "", "Companion", "wakelock_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProximitySensorManagerModule extends NativeProximitySensorManagerModuleSpec {

    @NotNull
    private static final String PROXIMITY_WAKE_LOCK_TAG = "discord:proximitywakelock";
    private static final long PROXIMITY_WAKE_LOCK_TIMEOUT = 600000;

    @NotNull
    private final ProximitySensorWakeLock proximityWakeLock;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProximitySensorManagerModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        this.proximityWakeLock = new ProximitySensorWakeLock(reactApplicationContext, PROXIMITY_WAKE_LOCK_TIMEOUT, PROXIMITY_WAKE_LOCK_TAG);
    }

    @Override // com.discord.codegen.NativeProximitySensorManagerModuleSpec
    public void setProximityMonitoringEnabled(boolean enabled) {
        if (enabled) {
            this.proximityWakeLock.acquire();
        } else {
            this.proximityWakeLock.release();
        }
    }
}
