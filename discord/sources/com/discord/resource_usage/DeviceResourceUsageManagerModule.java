package com.discord.resource_usage;

import android.os.Process;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/discord/resource_usage/DeviceResourceUsageManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "deviceResourceUsageManager", "Lcom/discord/resource_usage/DeviceResourceUsageManager;", "getName", "", "initialize", "", "invalidate", "getCpuCoreCount", "callback", "Lcom/facebook/react/bridge/Callback;", "getCurrentMemoryUsageKb", "getCurrentCpuUsagePercent", "getCumulativeCpuUsage", "getNetworkUsage", "resource_usage_monitor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeviceResourceUsageManagerModule extends ReactContextBaseJavaModule {

    @NotNull
    private final DeviceResourceUsageManager deviceResourceUsageManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceResourceUsageManagerModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.deviceResourceUsageManager = new DeviceResourceUsageManager(reactContext);
    }

    @ReactMethod
    public final void getCpuCoreCount(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Integer.valueOf(this.deviceResourceUsageManager.getCpuCoreCount()));
    }

    @ReactMethod
    public final void getCumulativeCpuUsage(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        double elapsedCpuTime = Process.getElapsedCpuTime();
        int cpuCoreCount = this.deviceResourceUsageManager.getCpuCoreCount();
        if (cpuCoreCount < 1) {
            cpuCoreCount = 1;
        }
        callback.invoke(Double.valueOf((elapsedCpuTime / ((double) cpuCoreCount)) / ((double) 1000)));
    }

    @ReactMethod
    public final void getCurrentCpuUsagePercent(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Double.valueOf(this.deviceResourceUsageManager.getCpuUsagePercent()));
    }

    @ReactMethod
    public final void getCurrentMemoryUsageKb(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Integer.valueOf(this.deviceResourceUsageManager.getMemoryRssKB()));
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "SystemResourceManager";
    }

    @ReactMethod
    public final void getNetworkUsage(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        DeviceResourceUsageRecorder.Companion companion = DeviceResourceUsageRecorder.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        callback.invoke(companion.getNetworkUsage(reactApplicationContext));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.deviceResourceUsageManager.start();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        this.deviceResourceUsageManager.stop();
    }
}
