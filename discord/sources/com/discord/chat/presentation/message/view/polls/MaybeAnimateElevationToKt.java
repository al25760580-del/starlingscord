package com.discord.chat.presentation.message.view.polls;

import android.animation.ObjectAnimator;
import android.view.View;
import com.discord.chat.R;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002\u001a\u001a\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\n\u0010\t\u001a\u00020\u0004*\u00020\u0002¨\u0006\n"}, d2 = {"getTagObject", "Lcom/discord/chat/presentation/message/view/polls/AnimateElevationContext;", "Landroid/view/View;", "maybeAnimateElevationTo", "", "tagValue", "", "newElevation", "", "maybeEndAnimation", "chat_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class MaybeAnimateElevationToKt {
    private static final AnimateElevationContext getTagObject(View view) {
        Object tag = view.getTag(R.id.tag_maybe_animate_elevation_to);
        if (tag instanceof AnimateElevationContext) {
            return (AnimateElevationContext) tag;
        }
        return null;
    }

    public static final void maybeAnimateElevationTo(@NotNull View view, @NotNull String tagValue, float f2) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(tagValue, "tagValue");
        AnimateElevationContext tagObject = getTagObject(view);
        if (tagObject == null || !Intrinsics.areEqual(tagObject.getTagValue(), tagValue)) {
            view.setTag(R.id.tag_maybe_animate_elevation_to, new AnimateElevationContext(tagValue, view.getElevation(), null, 4, null));
            view.setElevation(f2);
        } else {
            tagObject.setElevation(f2);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, ViewProps.ELEVATION, f2);
            objectAnimatorOfFloat.start();
            tagObject.setAnimator(objectAnimatorOfFloat);
        }
    }

    public static final void maybeEndAnimation(@NotNull View view) {
        ObjectAnimator animator;
        Intrinsics.checkNotNullParameter(view, "<this>");
        AnimateElevationContext tagObject = getTagObject(view);
        if (tagObject == null || (animator = tagObject.getAnimator()) == null) {
            return;
        }
        animator.cancel();
        view.setElevation(tagObject.getElevation());
    }
}
