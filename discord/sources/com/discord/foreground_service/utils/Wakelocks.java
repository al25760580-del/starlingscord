package com.discord.foreground_service.utils;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.PowerManager;
import com.discord.misc.utilities.logThrottle.LogThrottleSingleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0018\u00010\tR\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0018\u00010\fR\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/discord/foreground_service/utils/Wakelocks;", "", "tag", "", "timeout", "", "<init>", "(Ljava/lang/String;J)V", "wakeLockPartial", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "wakeLockWifi", "Landroid/net/wifi/WifiManager$WifiLock;", "Landroid/net/wifi/WifiManager;", "acquire", "", "context", "Landroid/content/Context;", "release", "foreground_service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWakelocks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Wakelocks.kt\ncom/discord/foreground_service/utils/Wakelocks\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,46:1\n31#2:47\n31#2:48\n*S KotlinDebug\n*F\n+ 1 Wakelocks.kt\ncom/discord/foreground_service/utils/Wakelocks\n*L\n16#1:47\n27#1:48\n*E\n"})
public final class Wakelocks {

    @NotNull
    private final String tag;
    private final long timeout;
    private PowerManager.WakeLock wakeLockPartial;
    private WifiManager.WifiLock wakeLockWifi;

    public Wakelocks(@NotNull String tag, long j) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.tag = tag;
        this.timeout = j;
    }

    public final void acquire(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        WifiManager wifiManager = (WifiManager) context.getSystemService(WifiManager.class);
        if (wifiManager != null) {
            if (Build.VERSION.SDK_INT >= 34) {
                this.wakeLockWifi = wifiManager.createWifiLock(4, this.tag);
            } else {
                this.wakeLockWifi = wifiManager.createWifiLock(3, this.tag);
            }
        }
        PowerManager powerManager = (PowerManager) context.getSystemService(PowerManager.class);
        if (powerManager == null || !powerManager.isWakeLockLevelSupported(1)) {
            return;
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, this.tag);
        this.wakeLockPartial = wakeLockNewWakeLock;
        if (wakeLockNewWakeLock != null) {
            wakeLockNewWakeLock.acquire(this.timeout);
        }
    }

    public final void release() {
        PowerManager.WakeLock wakeLock = this.wakeLockPartial;
        if (wakeLock != null && wakeLock.isHeld()) {
            PowerManager.WakeLock wakeLock2 = this.wakeLockPartial;
            if (wakeLock2 != null) {
                wakeLock2.release();
            }
            this.wakeLockPartial = null;
        }
        WifiManager.WifiLock wifiLock = this.wakeLockWifi;
        if (wifiLock == null || !wifiLock.isHeld()) {
            return;
        }
        WifiManager.WifiLock wifiLock2 = this.wakeLockWifi;
        if (wifiLock2 != null) {
            wifiLock2.release();
        }
        this.wakeLockWifi = null;
    }

    public /* synthetic */ Wakelocks(String str, long j, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? LogThrottleSingleton.RATE_LIMIT_ONE_HOUR : j);
    }
}
