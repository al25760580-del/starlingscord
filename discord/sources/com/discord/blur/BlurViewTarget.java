package com.discord.blur;

import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J0\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\u0014"}, d2 = {"Lcom/discord/blur/BlurViewTarget;", "Lcom/discord/blur/BlurViewTargetBase;", "context", "Landroid/content/Context;", "blurTargetNativeId", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "setBlurAmount", "", "rectId", "", "blurAmount", "", "addBlurRect", "windowX", "windowY", "width", "height", "removeBlurRect", "blur_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class BlurViewTarget extends BlurViewTargetBase {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlurViewTarget(@NotNull Context context, @NotNull String blurTargetNativeId) {
        super(context, blurTargetNativeId);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(blurTargetNativeId, "blurTargetNativeId");
    }

    @Override // com.discord.blur.BlurViewAPI.Target
    public void addBlurRect(int rectId, int windowX, int windowY, int width, int height) {
    }

    @Override // com.discord.blur.BlurViewAPI.Target
    public void removeBlurRect(int rectId) {
    }

    @Override // com.discord.blur.BlurViewAPIBase
    public void setBlurAmount(int rectId, float blurAmount) {
    }
}
