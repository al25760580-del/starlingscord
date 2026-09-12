package com.discord.blur;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0011H\u0014J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/discord/blur/BlurViewTargetBase;", "Lcom/facebook/react/views/view/ReactViewGroup;", "Lcom/discord/blur/BlurViewAPI$Target;", "context", "Landroid/content/Context;", "blurTargetNativeId", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "self", "getSelf", "()Lcom/discord/blur/BlurViewAPI$Target;", "viewRef", "Landroid/view/ViewGroup;", "getViewRef", "()Landroid/view/ViewGroup;", "onAttachedToWindow", "", "onDetachedFromWindow", "setBlurTargetNativeId", "nativeId", "blur_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BlurViewTargetBase extends ReactViewGroup implements BlurViewAPI.Target {

    @NotNull
    private String blurTargetNativeId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlurViewTargetBase(@NotNull Context context, @NotNull String blurTargetNativeId) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(blurTargetNativeId, "blurTargetNativeId");
        this.blurTargetNativeId = blurTargetNativeId;
        BlurViewTargetRegistry.INSTANCE.add(blurTargetNativeId, getSelf());
    }

    private final BlurViewAPI.Target getSelf() {
        return this;
    }

    @Override // com.discord.blur.BlurViewAPI.Target
    @NotNull
    public ViewGroup getViewRef() {
        return this;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        BlurViewTargetRegistry.INSTANCE.add(this.blurTargetNativeId, getSelf());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BlurViewTargetRegistry.INSTANCE.remove(this.blurTargetNativeId);
    }

    @Override // com.discord.blur.BlurViewAPIBase
    public void setBlurTargetNativeId(@NotNull String nativeId) {
        Intrinsics.checkNotNullParameter(nativeId, "nativeId");
        if (Intrinsics.areEqual(this.blurTargetNativeId, nativeId)) {
            return;
        }
        this.blurTargetNativeId = nativeId;
        BlurViewTargetRegistry.INSTANCE.add(nativeId, getSelf());
    }
}
