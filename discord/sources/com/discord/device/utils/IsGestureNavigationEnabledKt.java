package com.discord.device.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, d2 = {"isGestureNavigationEnabled", "", "Landroid/content/Context;", "device_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class IsGestureNavigationEnabledKt {
    @SuppressLint({"DiscouragedApi"})
    public static final boolean isGestureNavigationEnabled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        int identifier = context.getResources().getIdentifier("config_navBarInteractionMode", "integer", "android");
        return (identifier > 0 ? context.getResources().getInteger(identifier) : 0) == NavigationType.GESTURE.getValue();
    }
}
