package com.discord.react_gesture_handler;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"getDiscordGestureHandlerEnabledRootView", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "react_gesture_handler_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class GetDiscordGestureHandlerEnabledRootViewKt {
    public static final ViewGroup getDiscordGestureHandlerEnabledRootView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        DiscordGestureHandlerEnabledRootView nullable$react_gesture_handler_release = DiscordGestureHandlerEnabledRootView.INSTANCE.getNullable$react_gesture_handler_release(view);
        if (nullable$react_gesture_handler_release != null) {
            return nullable$react_gesture_handler_release.getGestureRootView();
        }
        return null;
    }
}
