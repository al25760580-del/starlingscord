package com.discord.wakelock;

import android.app.Activity;
import com.discord.misc.utilities.threading.ThreadUtilsKt;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discord/wakelock/ScreenWakeLock;", "", "<init>", "()V", "keys", "", "", "requestLock", "", "activity", "Landroid/app/Activity;", "key", "releaseLock", "wakelock_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScreenWakeLock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenWakeLock.kt\ncom/discord/wakelock/ScreenWakeLock\n+ 2 ThreadUtils.kt\ncom/discord/misc/utilities/threading/ThreadUtilsKt\n*L\n1#1,30:1\n25#2,8:31\n25#2,8:39\n*S KotlinDebug\n*F\n+ 1 ScreenWakeLock.kt\ncom/discord/wakelock/ScreenWakeLock\n*L\n13#1:31,8\n22#1:39,8\n*E\n"})
public final class ScreenWakeLock {

    @NotNull
    public static final ScreenWakeLock INSTANCE = new ScreenWakeLock();

    @NotNull
    private static Set<String> keys = new LinkedHashSet();

    private ScreenWakeLock() {
    }

    public final void releaseLock(@NotNull final Activity activity, @NotNull final String key) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!ThreadUtilsKt.isOnMainThread()) {
            ThreadUtilsKt.getUiHandler().post(new Runnable() { // from class: com.discord.wakelock.ScreenWakeLock$releaseLock$$inlined$postOrRunOnMainThread$1
                @Override // java.lang.Runnable
                public final void run() {
                    ScreenWakeLock.keys.remove(key);
                    if (ScreenWakeLock.keys.isEmpty()) {
                        activity.getWindow().clearFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    }
                }
            });
            return;
        }
        keys.remove(key);
        if (keys.isEmpty()) {
            activity.getWindow().clearFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        }
    }

    public final void requestLock(@NotNull final Activity activity, @NotNull final String key) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!ThreadUtilsKt.isOnMainThread()) {
            ThreadUtilsKt.getUiHandler().post(new Runnable() { // from class: com.discord.wakelock.ScreenWakeLock$requestLock$$inlined$postOrRunOnMainThread$1
                @Override // java.lang.Runnable
                public final void run() {
                    if (ScreenWakeLock.keys.add(key)) {
                        activity.getWindow().addFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    }
                }
            });
        } else if (keys.add(key)) {
            activity.getWindow().addFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        }
    }
}
