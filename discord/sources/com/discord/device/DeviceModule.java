package com.discord.device;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.discord.codegen.NativeDeviceModuleSpec;
import com.discord.device.react_events.MetricsSize;
import com.discord.device.utils.DeviceHardwareInfoKt;
import com.discord.device.utils.DeviceMetrics;
import com.discord.device.utils.DevicePerformance;
import com.discord.device.utils.IsGestureNavigationEnabledKt;
import com.discord.device.utils.IsTabletKt;
import com.discord.device.utils.OrientationLockKt;
import com.discord.lifecycle.AppEntryActivityRegistry;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u000e\b\u0001\u0012\n \n*\u0004\u0018\u00010\t0\t0\u0007H\u0014J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/discord/device/DeviceModule;", "Lcom/discord/codegen/NativeDeviceModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getTypedExportedConstants", "", "", "", "kotlin.jvm.PlatformType", "activityForAppEntry", "Landroid/app/Activity;", "appEntryKey", "getScreenSize", "Lcom/facebook/react/bridge/WritableMap;", "getWindowSize", "getMediaPerformanceClass", "", "device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceModule.kt\ncom/discord/device/DeviceModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
public final class DeviceModule extends NativeDeviceModuleSpec {

    @NotNull
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    private final Activity activityForAppEntry(String appEntryKey) {
        AppEntryActivityRegistry appEntryActivityRegistry = AppEntryActivityRegistry.INSTANCE;
        if (StringsKt.K(appEntryKey)) {
            appEntryKey = null;
        }
        if (appEntryKey == null) {
            appEntryKey = "main";
        }
        return appEntryActivityRegistry.getActivityForAppEntry(appEntryKey);
    }

    @Override // com.discord.codegen.NativeDeviceModuleSpec
    public double getMediaPerformanceClass() {
        DevicePerformance devicePerformance = DevicePerformance.INSTANCE;
        devicePerformance.initializePlayServicesDevicePerformance(this.reactContext);
        return devicePerformance.getMediaPerformanceClass();
    }

    @Override // com.discord.codegen.NativeDeviceModuleSpec
    @NotNull
    public WritableMap getScreenSize(@NotNull String appEntryKey) {
        WritableNativeMap data;
        Intrinsics.checkNotNullParameter(appEntryKey, "appEntryKey");
        MetricsSize screenSize = DeviceMetrics.INSTANCE.getScreenSize(activityForAppEntry(appEntryKey));
        return (screenSize == null || (data = screenSize.getData()) == null) ? MetricsSize.INSTANCE.createScreenFallback() : data;
    }

    @Override // com.discord.codegen.NativeDeviceModuleSpec
    @NotNull
    public Map<String, ? extends Object> getTypedExportedConstants() {
        Pair pair = new Pair("systemVersion", String.valueOf(Build.VERSION.SDK_INT));
        Pair pair2 = new Pair("device", Build.DEVICE);
        Pair pair3 = new Pair("deviceModel", Build.MODEL);
        Pair pair4 = new Pair("deviceBrand", Build.BRAND);
        Pair pair5 = new Pair("deviceProduct", Build.PRODUCT);
        Pair pair6 = new Pair("deviceManufacturer", Build.MANUFACTURER);
        Pair pair7 = new Pair("isGestureNavigationEnabled", Boolean.valueOf(IsGestureNavigationEnabledKt.isGestureNavigationEnabled(this.reactContext)));
        Pair pair8 = new Pair("smallestScreenWidth", Integer.valueOf(IsTabletKt.smallestScreenWidthDp(this.reactContext)));
        Pair pair9 = new Pair("isOrientationLockSupported", Boolean.valueOf(OrientationLockKt.isOrientationLockSupported(this.reactContext)));
        Pair pair10 = new Pair("socName", DeviceHardwareInfoKt.socName());
        Context applicationContext = this.reactContext.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return w0.h(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, new Pair("ramSize", DeviceHardwareInfoKt.ramSize(applicationContext)), new Pair("maxCpuFreq", DeviceHardwareInfoKt.maxCpuFreq()), new Pair("timeZone", TimeZone.getDefault().getID()));
    }

    @Override // com.discord.codegen.NativeDeviceModuleSpec
    @NotNull
    public WritableMap getWindowSize(@NotNull String appEntryKey) {
        WritableNativeMap data;
        Intrinsics.checkNotNullParameter(appEntryKey, "appEntryKey");
        MetricsSize windowSize = DeviceMetrics.INSTANCE.getWindowSize(activityForAppEntry(appEntryKey));
        return (windowSize == null || (data = windowSize.getData()) == null) ? MetricsSize.INSTANCE.createWindowFallback() : data;
    }
}
