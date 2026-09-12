package com.discord.device.utils;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0006H\u0000\u001a\n\u0010\u0007\u001a\u00020\u0003*\u00020\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0004¨\u0006\b"}, d2 = {"MINIMUM_TABLET_SCREEN_WIDTH", "", "isTabletCache", "", "Ljava/lang/Boolean;", "smallestScreenWidthDp", "Landroid/content/Context;", "isTablet", "device_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class IsTabletKt {
    private static final int MINIMUM_TABLET_SCREEN_WIDTH = 600;
    private static Boolean isTabletCache;

    public static final boolean isTablet(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        boolean z5 = smallestScreenWidthDp(context) >= MINIMUM_TABLET_SCREEN_WIDTH;
        if (isTabletCache == null) {
            isTabletCache = Boolean.valueOf(z5);
        }
        return z5;
    }

    public static final int smallestScreenWidthDp(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getResources().getConfiguration().smallestScreenWidthDp;
    }
}
