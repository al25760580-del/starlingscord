package com.discord.device.utils;

import android.content.Context;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"ADAPTIVE_LAYOUT_SDK_INT", "", "isOrientationLockSupported", "", "Landroid/content/Context;", "device_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class OrientationLockKt {
    private static final int ADAPTIVE_LAYOUT_SDK_INT = 36;

    public static final boolean isOrientationLockSupported(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return Build.VERSION.SDK_INT < 36 || RestrictedResizabilityKt.allowsRestrictedResizability(context) || !IsTabletKt.isTablet(context);
    }
}
