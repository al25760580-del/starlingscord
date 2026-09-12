package com.discord.mobile_voice_overlay.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayAssets;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\rH\u0017J\b\u0010\u0019\u001a\u00020\u0013H\u0004J\b\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eH&R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/discord/mobile_voice_overlay/views/OverlayView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attributeSetId", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "overlayAssets", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;", "getOverlayAssets", "()Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;", "setOverlayAssets", "(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;)V", "managedByWindow", "", "initializeWithWindowManager", "", "removeFromWindowManager", "setAssets", "assets", "isManagedByWindow", "getInitialLayoutParams", "Landroid/view/WindowManager$LayoutParams;", "setData", "data", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;", "mobile_voice_overlay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class OverlayView extends FrameLayout {
    private boolean managedByWindow;
    private MobileVoiceOverlayAssets overlayAssets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    /* JADX INFO: renamed from: getInitialLayoutParams */
    public abstract WindowManager.LayoutParams getWindowLayoutParams();

    public final MobileVoiceOverlayAssets getOverlayAssets() {
        return this.overlayAssets;
    }

    public final void initializeWithWindowManager() {
        Object systemService = getContext().getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).addView(this, getWindowLayoutParams());
        this.managedByWindow = true;
    }

    /* JADX INFO: renamed from: isManagedByWindow, reason: from getter */
    public final boolean getManagedByWindow() {
        return this.managedByWindow;
    }

    public final void removeFromWindowManager() {
        Object systemService = getContext().getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).removeView(this);
        this.managedByWindow = false;
    }

    public void setAssets(@NotNull MobileVoiceOverlayAssets assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.overlayAssets = assets;
    }

    public abstract void setData(@NotNull MobileVoiceOverlayData data);

    public final void setOverlayAssets(MobileVoiceOverlayAssets mobileVoiceOverlayAssets) {
        this.overlayAssets = mobileVoiceOverlayAssets;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
