package com.discord.device.utils;

import android.annotation.SuppressLint;
import androidx.core.performance.play.services.PlayServicesDevicePerformance;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0012\u0010\u0004\u001a\u00020\u00058\u0002@\u0002X\u0083.¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/discord/device/utils/DevicePerformance;", "", "<init>", "()V", "playServicesDevicePerformance", "Landroidx/core/performance/play/services/PlayServicesDevicePerformance;", "mediaPerformanceClass", "", "getMediaPerformanceClass", "()I", "initializePlayServicesDevicePerformance", "", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DevicePerformance {

    @NotNull
    public static final DevicePerformance INSTANCE = new DevicePerformance();

    @SuppressLint({"StaticFieldLeak"})
    private static PlayServicesDevicePerformance playServicesDevicePerformance;

    private DevicePerformance() {
    }

    public final int getMediaPerformanceClass() {
        PlayServicesDevicePerformance playServicesDevicePerformance2 = playServicesDevicePerformance;
        if (playServicesDevicePerformance2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playServicesDevicePerformance");
            playServicesDevicePerformance2 = null;
        }
        return ((Number) playServicesDevicePerformance2.f1575e.getValue()).intValue();
    }

    public final void initializePlayServicesDevicePerformance(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        if (playServicesDevicePerformance != null) {
            return;
        }
        playServicesDevicePerformance = new PlayServicesDevicePerformance(reactContext);
    }
}
