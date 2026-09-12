package com.discord.portals.utils;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"removeFromParent", "", "Landroid/view/View;", "portals_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewRemoveFromParent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewRemoveFromParent.kt\ncom/discord/portals/utils/ViewRemoveFromParentKt\n+ 2 CastUtils.kt\ncom/discord/misc/utilities/kotlin/CastUtilsKt\n*L\n1#1,18:1\n8#2:19\n*S KotlinDebug\n*F\n+ 1 ViewRemoveFromParent.kt\ncom/discord/portals/utils/ViewRemoveFromParentKt\n*L\n8#1:19\n*E\n"})
public final class ViewRemoveFromParentKt {
    public static final void removeFromParent(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent != null) {
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                Animation animation = view.getAnimation();
                if (animation != null) {
                    animation.cancel();
                }
                view.clearAnimation();
                viewGroup.removeView(view);
                viewGroup.endViewTransition(view);
            }
        }
    }
}
