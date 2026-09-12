package com.discord.mobile_voice_overlay.utils;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import android.view.View;
import android.view.WindowManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0012\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0012\u0010\u000e\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0012\u0010\u000f\u001a\u00020\n*\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u000bJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016¨\u0006\u0018"}, d2 = {"Lcom/discord/mobile_voice_overlay/utils/WindowUtils;", "", "<init>", "()V", "getCenterPointOnScreen", "", "view", "Landroid/view/View;", "outLocation", "addFlag", "", "Landroid/view/WindowManager$LayoutParams;", "flag", "", "removeFlag", "setFlagTouchable", "isTouchable", "", "createWindowLayoutParams", "getScreenSize", "Landroid/graphics/Rect;", "context", "Landroid/content/Context;", "canDrawOverlay", "mobile_voice_overlay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WindowUtils {

    @NotNull
    public static final WindowUtils INSTANCE = new WindowUtils();

    private WindowUtils() {
    }

    public final void addFlag(@NotNull WindowManager.LayoutParams layoutParams, int i7) {
        Intrinsics.checkNotNullParameter(layoutParams, "<this>");
        layoutParams.flags = i7 | layoutParams.flags;
    }

    public final boolean canDrawOverlay(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Settings.canDrawOverlays(context);
    }

    @NotNull
    public final WindowManager.LayoutParams createWindowLayoutParams() {
        return new WindowManager.LayoutParams(-2, -2, Build.VERSION.SDK_INT <= 25 ? 2007 : 2038, 16777768, -3);
    }

    @NotNull
    public final int[] getCenterPointOnScreen(@NotNull View view, @NotNull int[] outLocation) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(outLocation, "outLocation");
        view.getLocationOnScreen(outLocation);
        outLocation[0] = (view.getWidth() / 2) + outLocation[0];
        outLocation[1] = (view.getHeight() / 2) + outLocation[1];
        return outLocation;
    }

    @NotNull
    public final Rect getScreenSize(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new Rect(0, 0, context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels);
    }

    public final void removeFlag(@NotNull WindowManager.LayoutParams layoutParams, int i7) {
        Intrinsics.checkNotNullParameter(layoutParams, "<this>");
        layoutParams.flags = (~i7) & layoutParams.flags;
    }

    public final void setFlagTouchable(@NotNull WindowManager.LayoutParams layoutParams, boolean z5) {
        Intrinsics.checkNotNullParameter(layoutParams, "<this>");
        if (z5) {
            removeFlag(layoutParams, 16);
        } else {
            addFlag(layoutParams, 16);
        }
    }
}
