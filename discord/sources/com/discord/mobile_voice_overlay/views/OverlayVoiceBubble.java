package com.discord.mobile_voice_overlay.views;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.discord.icons.IconUrlUtils;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayData;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayDataUser;
import com.discord.mobile_voice_overlay.databinding.OverlayVoiceBubbleBinding;
import com.discord.primitives.UserId;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u0013H\u0002J\b\u0010\u001d\u001a\u00020\u0013H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;", "Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attributeSetId", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceBubbleBinding;", "imageView", "Lcom/facebook/drawee/view/SimpleDraweeView;", "getImageView$mobile_voice_overlay_release", "()Lcom/facebook/drawee/view/SimpleDraweeView;", "onConfigurationChanged", "", "newConfig", "Landroid/content/res/Configuration;", "setData", "data", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;", "configureUI", "user", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser;", "fadeDormant", "fadeActive", "Companion", "mobile_voice_overlay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOverlayVoiceBubble.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverlayVoiceBubble.kt\ncom/discord/mobile_voice_overlay/views/OverlayVoiceBubble\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
public final class OverlayVoiceBubble extends OverlayBubbleWrap {
    private static final long ACTIVE_DURATION_MS = 100;
    private static final float SETTLING_ALPHA = 0.5f;
    private static final long SETTLING_DURATION_MS = 200;

    @NotNull
    private final OverlayVoiceBubbleBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayVoiceBubble(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        OverlayVoiceBubbleBinding overlayVoiceBubbleBindingInflate = OverlayVoiceBubbleBinding.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(overlayVoiceBubbleBindingInflate, "inflate(...)");
        this.binding = overlayVoiceBubbleBindingInflate;
    }

    private final void fadeActive() {
        getImageView$mobile_voice_overlay_release().animate().setDuration(100L).alpha(1.0f).start();
    }

    private final void fadeDormant() {
        getImageView$mobile_voice_overlay_release().animate().setDuration(SETTLING_DURATION_MS).alpha(SETTLING_ALPHA).start();
    }

    public final void configureUI(@NotNull MobileVoiceOverlayDataUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        SimpleDraweeView simpleDraweeView = this.binding.overlayBubbleIv;
        IconUrlUtils iconUrlUtils = IconUrlUtils.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        simpleDraweeView.setImageURI(IconUrlUtils.m984getForUser_fRzTXg$default(iconUrlUtils, context, UserId.m1208boximpl(user.m1035getUserIdre6GcUE()), user.getAvatar(), Integer.valueOf(user.getDiscriminator()), false, null, 48, null));
        if (user.getSpeaking()) {
            fadeActive();
        } else {
            fadeDormant();
        }
    }

    @NotNull
    public final SimpleDraweeView getImageView$mobile_voice_overlay_release() {
        SimpleDraweeView overlayBubbleIv = this.binding.overlayBubbleIv;
        Intrinsics.checkNotNullExpressionValue(overlayBubbleIv, "overlayBubbleIv");
        return overlayBubbleIv;
    }

    @Override // com.discord.mobile_voice_overlay.views.OverlayBubbleWrap, android.view.View
    public void onConfigurationChanged(Configuration newConfig) {
        int i7 = getWindowLayoutParams().x;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i10 = i7 > getAllowedAreaBounds(context).centerX() ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        super.onConfigurationChanged(newConfig);
        OverlayBubbleWrap.animateToCoordinate$default(this, i10, getWindowLayoutParams().y, null, 4, null);
        getSpringAnimationX().f();
        getSpringAnimationY().f();
    }

    @Override // com.discord.mobile_voice_overlay.views.OverlayView
    public void setData(@NotNull MobileVoiceOverlayData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        MobileVoiceOverlayDataUser mobileVoiceOverlayDataUser = (MobileVoiceOverlayDataUser) CollectionsKt.firstOrNull(data.getUsers());
        if (mobileVoiceOverlayDataUser != null) {
            configureUI(mobileVoiceOverlayDataUser);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayVoiceBubble(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        OverlayVoiceBubbleBinding overlayVoiceBubbleBindingInflate = OverlayVoiceBubbleBinding.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(overlayVoiceBubbleBindingInflate, "inflate(...)");
        this.binding = overlayVoiceBubbleBindingInflate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayVoiceBubble(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        OverlayVoiceBubbleBinding overlayVoiceBubbleBindingInflate = OverlayVoiceBubbleBinding.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(overlayVoiceBubbleBindingInflate, "inflate(...)");
        this.binding = overlayVoiceBubbleBindingInflate;
    }
}
