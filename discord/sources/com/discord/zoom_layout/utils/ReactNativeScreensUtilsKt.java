package com.discord.zoom_layout.utils;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.otaliastudios.zoom.ZoomLayout;
import com.swmansion.rnscreens.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0002¨\u0006\u0005"}, d2 = {"maybeApplyReactNativeScreensFix", "", "Lcom/otaliastudios/zoom/ZoomLayout;", "isInReactNativeScreensScreenBeingRemoved", "", "zoom_layout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactNativeScreensUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactNativeScreensUtils.kt\ncom/discord/zoom_layout/utils/ReactNativeScreensUtilsKt\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,47:1\n48#2:48\n*S KotlinDebug\n*F\n+ 1 ReactNativeScreensUtils.kt\ncom/discord/zoom_layout/utils/ReactNativeScreensUtilsKt\n*L\n25#1:48\n*E\n"})
public final class ReactNativeScreensUtilsKt {
    private static final boolean isInReactNativeScreensScreenBeingRemoved(ZoomLayout zoomLayout) {
        for (ViewParent parent = zoomLayout.getParent(); parent instanceof ViewGroup; parent = ((ViewGroup) parent).getParent()) {
            if ((parent instanceof Screen) && ((Screen) parent).isBeingRemoved()) {
                return true;
            }
        }
        return false;
    }

    public static final void maybeApplyReactNativeScreensFix(@NotNull ZoomLayout zoomLayout) {
        Intrinsics.checkNotNullParameter(zoomLayout, "<this>");
        if (!isInReactNativeScreensScreenBeingRemoved(zoomLayout) || zoomLayout.getChildCount() == 0) {
            return;
        }
        zoomLayout.removeAllViews();
    }
}
