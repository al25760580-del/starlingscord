package com.discord.chat.presentation.message.view.polls;

import a3.e;
import android.animation.ObjectAnimator;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/discord/chat/presentation/message/view/polls/AnimateElevationContext;", "", "tagValue", ViewProps.ELEVATION, "", "animator", "Landroid/animation/ObjectAnimator;", "<init>", "(Ljava/lang/Object;FLandroid/animation/ObjectAnimator;)V", "getTagValue", "()Ljava/lang/Object;", "getElevation", "()F", "setElevation", "(F)V", "getAnimator", "()Landroid/animation/ObjectAnimator;", "setAnimator", "(Landroid/animation/ObjectAnimator;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class AnimateElevationContext {
    private ObjectAnimator animator;
    private float elevation;

    @NotNull
    private final Object tagValue;

    public AnimateElevationContext(@NotNull Object tagValue, float f2, ObjectAnimator objectAnimator) {
        Intrinsics.checkNotNullParameter(tagValue, "tagValue");
        this.tagValue = tagValue;
        this.elevation = f2;
        this.animator = objectAnimator;
    }

    public static /* synthetic */ AnimateElevationContext copy$default(AnimateElevationContext animateElevationContext, Object obj, float f2, ObjectAnimator objectAnimator, int i7, Object obj2) {
        if ((i7 & 1) != 0) {
            obj = animateElevationContext.tagValue;
        }
        if ((i7 & 2) != 0) {
            f2 = animateElevationContext.elevation;
        }
        if ((i7 & 4) != 0) {
            objectAnimator = animateElevationContext.animator;
        }
        return animateElevationContext.copy(obj, f2, objectAnimator);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getTagValue() {
        return this.tagValue;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getElevation() {
        return this.elevation;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ObjectAnimator getAnimator() {
        return this.animator;
    }

    @NotNull
    public final AnimateElevationContext copy(@NotNull Object tagValue, float elevation, ObjectAnimator animator) {
        Intrinsics.checkNotNullParameter(tagValue, "tagValue");
        return new AnimateElevationContext(tagValue, elevation, animator);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimateElevationContext)) {
            return false;
        }
        AnimateElevationContext animateElevationContext = (AnimateElevationContext) other;
        return Intrinsics.areEqual(this.tagValue, animateElevationContext.tagValue) && Float.compare(this.elevation, animateElevationContext.elevation) == 0 && Intrinsics.areEqual(this.animator, animateElevationContext.animator);
    }

    public final ObjectAnimator getAnimator() {
        return this.animator;
    }

    public final float getElevation() {
        return this.elevation;
    }

    @NotNull
    public final Object getTagValue() {
        return this.tagValue;
    }

    public int hashCode() {
        int iA = e.a(this.tagValue.hashCode() * 31, 31, this.elevation);
        ObjectAnimator objectAnimator = this.animator;
        return iA + (objectAnimator == null ? 0 : objectAnimator.hashCode());
    }

    public final void setAnimator(ObjectAnimator objectAnimator) {
        this.animator = objectAnimator;
    }

    public final void setElevation(float f2) {
        this.elevation = f2;
    }

    @NotNull
    public String toString() {
        return "AnimateElevationContext(tagValue=" + this.tagValue + ", elevation=" + this.elevation + ", animator=" + this.animator + ")";
    }

    public /* synthetic */ AnimateElevationContext(Object obj, float f2, ObjectAnimator objectAnimator, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, f2, (i7 & 4) != 0 ? null : objectAnimator);
    }
}
